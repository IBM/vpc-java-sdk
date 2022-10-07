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

/**
 * NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype extends NetworkACLRulePrototypeNetworkACLContext {

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
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String destination;
    private String direction;
    private String name;
    private String source;
    private Long destinationPortMax;
    private Long destinationPortMin;
    private String protocol;
    private Long sourcePortMax;
    private Long sourcePortMin;

    /**
     * Instantiates a new Builder from an existing NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype instance.
     *
     * @param networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype the instance to initialize the Builder with
     */
    public Builder(NetworkACLRulePrototypeNetworkACLContext networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype) {
      this.action = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.action;
      this.destination = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.destination;
      this.direction = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.direction;
      this.name = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.name;
      this.source = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.source;
      this.destinationPortMax = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.destinationPortMax;
      this.destinationPortMin = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.destinationPortMin;
      this.protocol = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.protocol;
      this.sourcePortMax = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.sourcePortMax;
      this.sourcePortMin = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolTcpudpPrototype.sourcePortMin;
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
     * Builds a NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype.
     *
     * @return the new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype instance
     */
    public NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype build() {
      return new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the destinationPortMax.
     *
     * @param destinationPortMax the destinationPortMax
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder destinationPortMax(long destinationPortMax) {
      this.destinationPortMax = destinationPortMax;
      return this;
    }

    /**
     * Set the destinationPortMin.
     *
     * @param destinationPortMin the destinationPortMin
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder destinationPortMin(long destinationPortMin) {
      this.destinationPortMin = destinationPortMin;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the sourcePortMax.
     *
     * @param sourcePortMax the sourcePortMax
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder sourcePortMax(long sourcePortMax) {
      this.sourcePortMax = sourcePortMax;
      return this;
    }

    /**
     * Set the sourcePortMin.
     *
     * @param sourcePortMin the sourcePortMin
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
     */
    public Builder sourcePortMin(long sourcePortMin) {
      this.sourcePortMin = sourcePortMin;
      return this;
    }
  }

  protected NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype() { }

  protected NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype(Builder builder) {
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
    name = builder.name;
    source = builder.source;
    destinationPortMax = builder.destinationPortMax;
    destinationPortMin = builder.destinationPortMin;
    protocol = builder.protocol;
    sourcePortMax = builder.sourcePortMax;
    sourcePortMin = builder.sourcePortMin;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolTCPUDPPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

