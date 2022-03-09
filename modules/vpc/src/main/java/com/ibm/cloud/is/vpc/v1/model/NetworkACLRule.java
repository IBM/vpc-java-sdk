/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.is.vpc.v1.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * NetworkACLRule.
 *
 * Classes which extend this class:
 * - NetworkACLRuleNetworkACLRuleProtocolTCPUDP
 * - NetworkACLRuleNetworkACLRuleProtocolICMP
 * - NetworkACLRuleNetworkACLRuleProtocolAll
 */
public class NetworkACLRule extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "protocol";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("all", NetworkACLRuleNetworkACLRuleProtocolAll.class);
    discriminatorMapping.put("icmp", NetworkACLRuleNetworkACLRuleProtocolICMP.class);
    discriminatorMapping.put("tcp", NetworkACLRuleNetworkACLRuleProtocolTCPUDP.class);
    discriminatorMapping.put("udp", NetworkACLRuleNetworkACLRuleProtocolTCPUDP.class);
  }

  /**
   * Whether to allow or deny matching traffic.
   */
  public interface Action {
    /** allow. */
    String ALLOW = "allow";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * Whether the traffic to be matched is `inbound` or `outbound`.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  /**
   * The IP version for this rule.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
    /** ipv6. */
    String IPV6 = "ipv6";
  }

  protected String action;
  protected NetworkACLRuleReference before;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String destination;
  protected String direction;
  protected String href;
  protected String id;
  @SerializedName("ip_version")
  protected String ipVersion;
  protected String name;
  protected String protocol;
  protected String source;
  @SerializedName("destination_port_max")
  protected Long destinationPortMax;
  @SerializedName("destination_port_min")
  protected Long destinationPortMin;
  @SerializedName("source_port_max")
  protected Long sourcePortMax;
  @SerializedName("source_port_min")
  protected Long sourcePortMin;
  protected Long code;
  protected Long type;

  protected NetworkACLRule() {
  }

  /**
   * Gets the action.
   *
   * Whether to allow or deny matching traffic.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the before.
   *
   * The rule that this rule is immediately before. If absent, this is the last rule.
   *
   * @return the before
   */
  public NetworkACLRuleReference getBefore() {
    return before;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the rule was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the destination.
   *
   * The destination CIDR block. The CIDR block `0.0.0.0/0` applies to all addresses.
   *
   * @return the destination
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Gets the direction.
   *
   * Whether the traffic to be matched is `inbound` or `outbound`.
   *
   * @return the direction
   */
  public String getDirection() {
    return direction;
  }

  /**
   * Gets the href.
   *
   * The URL for this network ACL rule.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this network ACL rule.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version for this rule.
   *
   * @return the ipVersion
   */
  public String getIpVersion() {
    return ipVersion;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this rule. Names must be unique within the network ACL the rule resides in. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The protocol to enforce.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the source.
   *
   * The source CIDR block. The CIDR block `0.0.0.0/0` applies to all addresses.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Gets the destinationPortMax.
   *
   * The inclusive upper bound of TCP/UDP destination port range.
   *
   * @return the destinationPortMax
   */
  public Long getDestinationPortMax() {
    return destinationPortMax;
  }

  /**
   * Gets the destinationPortMin.
   *
   * The inclusive lower bound of TCP/UDP destination port range.
   *
   * @return the destinationPortMin
   */
  public Long getDestinationPortMin() {
    return destinationPortMin;
  }

  /**
   * Gets the sourcePortMax.
   *
   * The inclusive upper bound of TCP/UDP source port range.
   *
   * @return the sourcePortMax
   */
  public Long getSourcePortMax() {
    return sourcePortMax;
  }

  /**
   * Gets the sourcePortMin.
   *
   * The inclusive lower bound of TCP/UDP source port range.
   *
   * @return the sourcePortMin
   */
  public Long getSourcePortMin() {
    return sourcePortMin;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to allow. If unspecified, all codes are allowed. This can only be specified if type is also
   * specified.
   *
   * @return the code
   */
  public Long getCode() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to allow. If unspecified, all types are allowed by this rule.
   *
   * @return the type
   */
  public Long getType() {
    return type;
  }
}

