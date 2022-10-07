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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * NetworkACLRulePatch.
 */
public class NetworkACLRulePatch extends GenericModel {

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
  protected NetworkACLRuleBeforePatch before;
  protected Long code;
  protected String destination;
  @SerializedName("destination_port_max")
  protected Long destinationPortMax;
  @SerializedName("destination_port_min")
  protected Long destinationPortMin;
  protected String direction;
  protected String name;
  protected String protocol;
  protected String source;
  @SerializedName("source_port_max")
  protected Long sourcePortMax;
  @SerializedName("source_port_min")
  protected Long sourcePortMin;
  protected Long type;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private NetworkACLRuleBeforePatch before;
    private Long code;
    private String destination;
    private Long destinationPortMax;
    private Long destinationPortMin;
    private String direction;
    private String name;
    private String protocol;
    private String source;
    private Long sourcePortMax;
    private Long sourcePortMin;
    private Long type;

    /**
     * Instantiates a new Builder from an existing NetworkACLRulePatch instance.
     *
     * @param networkAclRulePatch the instance to initialize the Builder with
     */
    private Builder(NetworkACLRulePatch networkAclRulePatch) {
      this.action = networkAclRulePatch.action;
      this.before = networkAclRulePatch.before;
      this.code = networkAclRulePatch.code;
      this.destination = networkAclRulePatch.destination;
      this.destinationPortMax = networkAclRulePatch.destinationPortMax;
      this.destinationPortMin = networkAclRulePatch.destinationPortMin;
      this.direction = networkAclRulePatch.direction;
      this.name = networkAclRulePatch.name;
      this.protocol = networkAclRulePatch.protocol;
      this.source = networkAclRulePatch.source;
      this.sourcePortMax = networkAclRulePatch.sourcePortMax;
      this.sourcePortMin = networkAclRulePatch.sourcePortMin;
      this.type = networkAclRulePatch.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NetworkACLRulePatch.
     *
     * @return the new NetworkACLRulePatch instance
     */
    public NetworkACLRulePatch build() {
      return new NetworkACLRulePatch(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the NetworkACLRulePatch builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the NetworkACLRulePatch builder
     */
    public Builder before(NetworkACLRuleBeforePatch before) {
      this.before = before;
      return this;
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the NetworkACLRulePatch builder
     */
    public Builder code(long code) {
      this.code = code;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the NetworkACLRulePatch builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the destinationPortMax.
     *
     * @param destinationPortMax the destinationPortMax
     * @return the NetworkACLRulePatch builder
     */
    public Builder destinationPortMax(long destinationPortMax) {
      this.destinationPortMax = destinationPortMax;
      return this;
    }

    /**
     * Set the destinationPortMin.
     *
     * @param destinationPortMin the destinationPortMin
     * @return the NetworkACLRulePatch builder
     */
    public Builder destinationPortMin(long destinationPortMin) {
      this.destinationPortMin = destinationPortMin;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the NetworkACLRulePatch builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLRulePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the NetworkACLRulePatch builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the NetworkACLRulePatch builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the sourcePortMax.
     *
     * @param sourcePortMax the sourcePortMax
     * @return the NetworkACLRulePatch builder
     */
    public Builder sourcePortMax(long sourcePortMax) {
      this.sourcePortMax = sourcePortMax;
      return this;
    }

    /**
     * Set the sourcePortMin.
     *
     * @param sourcePortMin the sourcePortMin
     * @return the NetworkACLRulePatch builder
     */
    public Builder sourcePortMin(long sourcePortMin) {
      this.sourcePortMin = sourcePortMin;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NetworkACLRulePatch builder
     */
    public Builder type(long type) {
      this.type = type;
      return this;
    }
  }

  protected NetworkACLRulePatch() { }

  protected NetworkACLRulePatch(Builder builder) {
    action = builder.action;
    before = builder.before;
    code = builder.code;
    destination = builder.destination;
    destinationPortMax = builder.destinationPortMax;
    destinationPortMin = builder.destinationPortMin;
    direction = builder.direction;
    name = builder.name;
    protocol = builder.protocol;
    source = builder.source;
    sourcePortMax = builder.sourcePortMax;
    sourcePortMin = builder.sourcePortMin;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLRulePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

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
   * The rule to move this rule immediately before.
   *
   * Specify `null` to move this rule after all existing rules.
   *
   * @return the before
   */
  public NetworkACLRuleBeforePatch before() {
    return before;
  }

  /**
   * Gets the code.
   *
   * The ICMP traffic code to match.
   *
   * @return the code
   */
  public Long code() {
    return code;
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
   * The user-defined name for this rule. Names must be unique within the network ACL the rule resides in.
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
   * Gets the type.
   *
   * The ICMP traffic type to match.
   *
   * @return the type
   */
  public Long type() {
    return type;
  }

  /**
   * Construct a JSON merge-patch from the NetworkACLRulePatch.
   *
   * Note that properties of the NetworkACLRulePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the NetworkACLRulePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

