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
 * NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype.
 */
public class NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype extends NetworkACLRulePrototypeNetworkACLContext {

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
    private String protocol;

    /**
     * Instantiates a new Builder from an existing NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype instance.
     *
     * @param networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype the instance to initialize the Builder with
     */
    public Builder(NetworkACLRulePrototypeNetworkACLContext networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype) {
      this.action = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype.action;
      this.destination = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype.destination;
      this.direction = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype.direction;
      this.name = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype.name;
      this.source = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype.source;
      this.protocol = networkAclRulePrototypeNetworkAclContextNetworkAclRuleProtocolAllPrototype.protocol;
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
     * Builds a NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype.
     *
     * @return the new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype instance
     */
    public NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype build() {
      return new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
  }

  protected NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype() { }

  protected NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype(Builder builder) {
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
    protocol = builder.protocol;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAllPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

