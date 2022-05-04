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
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolICMP
 * - NetworkACLRulePrototypeNetworkACLRuleProtocolAll
 */
public class NetworkACLRulePrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "protocol";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("all", NetworkACLRulePrototypeNetworkACLRuleProtocolAll.class);
    discriminatorMapping.put("icmp", NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.class);
    discriminatorMapping.put("tcp", NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP.class);
    discriminatorMapping.put("udp", NetworkACLRulePrototypeNetworkACLRuleProtocolTCPUDP.class);
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

  protected NetworkACLRulePrototype() {
  }

  /**
   * Gets the action.
   *
   * Whether to allow or deny matching traffic.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the before.
   *
   * The rule to insert this rule immediately before. If omitted, this rule will be
   * inserted after all existing rules.
   *
   * @return the before
   */
  public NetworkACLRuleBeforePrototype before() {
    return before;
  }

  /**
   * Gets the destination.
   *
   * The destination IP address or CIDR block. The CIDR block `0.0.0.0/0` applies to all addresses.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
  }

  /**
   * Gets the direction.
   *
   * Whether the traffic to be matched is `inbound` or `outbound`.
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
   * The source IP address or CIDR block.  The CIDR block `0.0.0.0/0` applies to all addresses.
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
   * The ICMP traffic code to allow. If unspecified, all codes are allowed. This can only be specified if type is also
   * specified.
   *
   * @return the code
   */
  public Long code() {
    return code;
  }

  /**
   * Gets the type.
   *
   * The ICMP traffic type to allow. If unspecified, all types are allowed by this rule.
   *
   * @return the type
   */
  public Long type() {
    return type;
  }
}

