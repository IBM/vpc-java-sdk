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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * NetworkACLRulePrototype.
 *
 * Classes which extend this class:
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDPPrototype
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolICMPPrototype
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolAllPrototype
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
   * The protocol to enforce.
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
   * Gets the name.
   *
   * The user-defined name for this rule. Names must be unique within the network ACL the rule resides in. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The protocol to enforce.
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
   * Gets the destinationPortMax.
   *
   * The inclusive upper bound of TCP/UDP destination port range.
   *
   * @return the destinationPortMax
   */
  public Long destinationPortMax() {
    return destinationPortMax;
  }

  /**
   * Gets the destinationPortMin.
   *
   * The inclusive lower bound of TCP/UDP destination port range.
   *
   * @return the destinationPortMin
   */
  public Long destinationPortMin() {
    return destinationPortMin;
  }

  /**
   * Gets the sourcePortMax.
   *
   * The inclusive upper bound of TCP/UDP source port range.
   *
   * @return the sourcePortMax
   */
  public Long sourcePortMax() {
    return sourcePortMax;
  }

  /**
   * Gets the sourcePortMin.
   *
   * The inclusive lower bound of TCP/UDP source port range.
   *
   * @return the sourcePortMin
   */
  public Long sourcePortMin() {
    return sourcePortMin;
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
}

