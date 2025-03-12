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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * NetworkACLRulePrototype.
 *
 * Classes which extend this class:
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype
 */
public class NetworkACLRulePrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "protocol";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("all", NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype.class);
    discriminatorMapping.put("icmp", NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype.class);
    discriminatorMapping.put("tcp", NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype.class);
    discriminatorMapping.put("udp", NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype.class);
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
  protected NetworkACLRuleBeforePrototype before;
  protected String destination;
  protected String direction;
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

  protected NetworkACLRulePrototype() { }

  /**
   * Gets the action.
   *
   * The action to perform for a packet matching the rule.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the before.
   *
   * The rule to insert this rule immediately before.
   *
   * If unspecified, this rule will be inserted after all existing rules.
   *
   * @return the before
   */
  public NetworkACLRuleBeforePrototype before() {
    return before;
  }

  /**
   * Gets the destination.
   *
   * The destination IP address or CIDR block to match. The CIDR block `0.0.0.0/0` matches all destination addresses.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
  }

  /**
   * Gets the direction.
   *
   * The direction of traffic to match.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version for this rule.
   *
   * @return the ipVersion
   */
  public String ipVersion() {
    return ipVersion;
  }

  /**
   * Gets the name.
   *
   * The name for this network ACL rule. The name must not be used by another rule for the network ACL. If unspecified,
   * the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The name of the network protocol.
   *
   * @return the protocol
   */
  public String protocol() {
    return protocol;
  }

  /**
   * Gets the source.
   *
   * The source IP address or CIDR block to match. The CIDR block `0.0.0.0/0` matches all source addresses.
   *
   * @return the source
   */
  public String source() {
    return source;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to match.
   *
   * If specified, `type` must also be specified.  If unspecified, all codes are matched.
   *
   * @return the code
   */
  public Long code() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to match.
   *
   * If unspecified, all types are matched.
   *
   * @return the type
   */
  public Long type() {
    return type;
  }

  /**
   * Gets the destinationPortMax.
   *
   * The inclusive upper bound of the TCP or UDP destination port range.
   *
   * If specified, `destination_port_min` must also be specified, and must not be larger. If unspecified,
   * `destination_port_min` must also be unspecified, allowing traffic for all destination ports.
   *
   * @return the destinationPortMax
   */
  public Long destinationPortMax() {
    return destinationPortMax;
  }

  /**
   * Gets the destinationPortMin.
   *
   * The inclusive lower bound of the TCP or UDP destination port range.
   *
   * If specified, `destination_port_max` must also be specified, and must not be smaller. If unspecified,
   * `destination_port_max` must also be unspecified, allowing traffic for all destination ports.
   *
   * @return the destinationPortMin
   */
  public Long destinationPortMin() {
    return destinationPortMin;
  }

  /**
   * Gets the sourcePortMax.
   *
   * The inclusive upper bound of the TCP or UDP source port range.
   *
   * If specified, `source_port_min` must also be specified, and must not be larger. If unspecified, `source_port_min`
   * must also be unspecified, allowing traffic for all source ports.
   *
   * @return the sourcePortMax
   */
  public Long sourcePortMax() {
    return sourcePortMax;
  }

  /**
   * Gets the sourcePortMin.
   *
   * The inclusive lower bound of the TCP or UDP source port range.
   *
   * If specified, `source_port_max` must also be specified, and must not be smaller. If unspecified, `source_port_max`
   * must also be unspecified, allowing traffic for all source ports.
   *
   * @return the sourcePortMin
   */
  public Long sourcePortMin() {
    return sourcePortMin;
  }
}

