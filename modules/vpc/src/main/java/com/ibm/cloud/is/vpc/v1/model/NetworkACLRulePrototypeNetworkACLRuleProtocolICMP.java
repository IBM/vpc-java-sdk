/*
 * (C) Copyright IBM Corp. 2020.
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
 * NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolICMP extends NetworkACLRulePrototype {

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


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String action;
    private String destination;
    private String direction;
    private String source;
    private String protocol;
    private NetworkACLRuleIdentity before;
    private Long code;
    private Long type;

    public Builder(NetworkACLRulePrototype networkAclRulePrototypeNetworkAclRuleProtocolIcmp) {
      this.name = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.name;
      this.action = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.action;
      this.destination = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.destination;
      this.direction = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.direction;
      this.source = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.source;
      this.protocol = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.protocol;
      this.before = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.before;
      this.code = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.code;
      this.type = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.
     *
     * @return the new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP instance
     */
    public NetworkACLRulePrototypeNetworkACLRuleProtocolICMP build() {
      return new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder before(NetworkACLRuleIdentity before) {
      this.before = before;
      return this;
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder code(long code) {
      this.code = code;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder type(long type) {
      this.type = type;
      return this;
    }
  }

  protected NetworkACLRulePrototypeNetworkACLRuleProtocolICMP(Builder builder) {
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
    name = builder.name;
    action = builder.action;
    destination = builder.destination;
    direction = builder.direction;
    source = builder.source;
    protocol = builder.protocol;
    before = builder.before;
    code = builder.code;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

