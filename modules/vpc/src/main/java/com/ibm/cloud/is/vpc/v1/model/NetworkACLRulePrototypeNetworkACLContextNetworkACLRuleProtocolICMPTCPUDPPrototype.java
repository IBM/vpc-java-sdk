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

/**
 * NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype extends NetworkACLRulePrototypeNetworkACLContext {

  /**
   * The action to perform for a packet matching the rule.
   *
   * Must not be `deny` if `protocol` is `icmp_tcp_udp`.
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
   * The network protocol.
   */
  public interface Protocol {
    /** icmp_tcp_udp. */
    String ICMP_TCP_UDP = "icmp_tcp_udp";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String destination;
    private String direction;
    private String ipVersion;
    private String name;
    private String source;
    private String protocol;

    /**
     * Instantiates a new Builder from an existing NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype instance.
     *
     * @param networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype the instance to initialize the Builder with
     */
    public Builder(NetworkACLRulePrototypeNetworkACLContext networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype) {
      this.action = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype.action;
      this.destination = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype.destination;
      this.direction = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype.direction;
      this.ipVersion = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype.ipVersion;
      this.name = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype.name;
      this.source = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype.source;
      this.protocol = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolIcmptcpudpPrototype.protocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param action the action
     * @param destination the destination
     * @param direction the direction
     * @param source the source
     * @param protocol the protocol
     */
    public Builder(String action, String destination, String direction, String source, String protocol) {
      this.action = action;
      this.destination = destination;
      this.direction = direction;
      this.source = source;
      this.protocol = protocol;
    }

    /**
     * Builds a NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype.
     *
     * @return the new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype instance
     */
    public NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype build() {
      return new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
  }

  protected NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype() { }

  protected NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destination,
      "destination cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.direction,
      "direction cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    action = builder.action;
    destination = builder.destination;
    direction = builder.direction;
    ipVersion = builder.ipVersion;
    name = builder.name;
    source = builder.source;
    protocol = builder.protocol;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolICMPTCPUDPPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

