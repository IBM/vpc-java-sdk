/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * - NetworkACLRuleNetworkACLRuleProtocolAll
 * - NetworkACLRuleNetworkACLRuleProtocolICMP
 * - NetworkACLRuleNetworkACLRuleProtocolTCPUDP
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
   * The action to perform for a packet matching the rule.
   */
  public interface Action {
    /** allow. */
    String ALLOW = "allow";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * The direction of traffic to match.
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
  }

  /**
   * The name of the network protocol.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Protocol {
    /** all. */
    String ALL = "all";
    /** icmp. */
    String ICMP = "icmp";
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
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
  protected Long code;
  protected Long type;
  @SerializedName("destination_port_max")
  protected Long destinationPortMax;
  @SerializedName("destination_port_min")
  protected Long destinationPortMin;
  @SerializedName("source_port_max")
  protected Long sourcePortMax;
  @SerializedName("source_port_min")
  protected Long sourcePortMin;

  protected NetworkACLRule() { }

  /**
   * Gets the action.
   *
   * The action to perform for a packet matching the rule.
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
   * The destination IP address or CIDR block to match. The CIDR block `0.0.0.0/0` matches all destination addresses.
   *
   * @return the destination
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Gets the direction.
   *
   * The direction of traffic to match.
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
   * The name for this network ACL rule. The name is unique across all rules for the network ACL.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The name of the network protocol.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the source.
   *
   * The source IP address or CIDR block to match. The CIDR block `0.0.0.0/0` matches all source addresses.
   *
   * @return the source
   */
  public String getSource() {
    return source;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to match.
   *
   * If absent, all codes are matched.
   *
   * @return the code
   */
  public Long getCode() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to match.
   *
   * If absent, all types are matched.
   *
   * @return the type
   */
  public Long getType() {
    return type;
  }

  /**
   * Gets the destinationPortMax.
   *
   * The inclusive upper bound of the TCP or UDP destination port range.
   *
   * @return the destinationPortMax
   */
  public Long getDestinationPortMax() {
    return destinationPortMax;
  }

  /**
   * Gets the destinationPortMin.
   *
   * The inclusive lower bound of the TCP or UDP destination port range.
   *
   * @return the destinationPortMin
   */
  public Long getDestinationPortMin() {
    return destinationPortMin;
  }

  /**
   * Gets the sourcePortMax.
   *
   * The inclusive upper bound of the TCP or UDP source port range.
   *
   * @return the sourcePortMax
   */
  public Long getSourcePortMax() {
    return sourcePortMax;
  }

  /**
   * Gets the sourcePortMin.
   *
   * The inclusive lower bound of the TCP or UDP source port range.
   *
   * @return the sourcePortMin
   */
  public Long getSourcePortMin() {
    return sourcePortMin;
  }
}

