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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateLoadBalancerListenerPolicyRule options.
 */
public class UpdateLoadBalancerListenerPolicyRuleOptions extends GenericModel {

  /**
   * The condition of the rule.
   */
  public interface Condition {
    /** contains. */
    String CONTAINS = "contains";
    /** equals. */
    String EQUALS = "equals";
    /** matches_regex. */
    String MATCHES_REGEX = "matches_regex";
  }

  /**
   * The type of the rule.
   */
  public interface Type {
    /** header. */
    String HEADER = "header";
    /** hostname. */
    String HOSTNAME = "hostname";
    /** path. */
    String PATH = "path";
  }

  protected String loadBalancerId;
  protected String listenerId;
  protected String policyId;
  protected String id;
  protected String condition;
  protected String field;
  protected String type;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;
    private String policyId;
    private String id;
    private String condition;
    private String field;
    private String type;
    private String value;

    private Builder(UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptions) {
      this.loadBalancerId = updateLoadBalancerListenerPolicyRuleOptions.loadBalancerId;
      this.listenerId = updateLoadBalancerListenerPolicyRuleOptions.listenerId;
      this.policyId = updateLoadBalancerListenerPolicyRuleOptions.policyId;
      this.id = updateLoadBalancerListenerPolicyRuleOptions.id;
      this.condition = updateLoadBalancerListenerPolicyRuleOptions.condition;
      this.field = updateLoadBalancerListenerPolicyRuleOptions.field;
      this.type = updateLoadBalancerListenerPolicyRuleOptions.type;
      this.value = updateLoadBalancerListenerPolicyRuleOptions.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param loadBalancerId the loadBalancerId
     * @param listenerId the listenerId
     * @param policyId the policyId
     * @param id the id
     */
    public Builder(String loadBalancerId, String listenerId, String policyId, String id) {
      this.loadBalancerId = loadBalancerId;
      this.listenerId = listenerId;
      this.policyId = policyId;
      this.id = id;
    }

    /**
     * Builds a UpdateLoadBalancerListenerPolicyRuleOptions.
     *
     * @return the new UpdateLoadBalancerListenerPolicyRuleOptions instance
     */
    public UpdateLoadBalancerListenerPolicyRuleOptions build() {
      return new UpdateLoadBalancerListenerPolicyRuleOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the listenerId.
     *
     * @param listenerId the listenerId
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder listenerId(String listenerId) {
      this.listenerId = listenerId;
      return this;
    }

    /**
     * Set the policyId.
     *
     * @param policyId the policyId
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Set the field.
     *
     * @param field the field
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder field(String field) {
      this.field = field;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UpdateLoadBalancerListenerPolicyRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyId,
      "policyId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
    policyId = builder.policyId;
    id = builder.id;
    condition = builder.condition;
    field = builder.field;
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerListenerPolicyRuleOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the loadBalancerId.
   *
   * The load balancer identifier.
   *
   * @return the loadBalancerId
   */
  public String loadBalancerId() {
    return loadBalancerId;
  }

  /**
   * Gets the listenerId.
   *
   * The listener identifier.
   *
   * @return the listenerId
   */
  public String listenerId() {
    return listenerId;
  }

  /**
   * Gets the policyId.
   *
   * The policy identifier.
   *
   * @return the policyId
   */
  public String policyId() {
    return policyId;
  }

  /**
   * Gets the id.
   *
   * The rule identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the condition.
   *
   * The condition of the rule.
   *
   * @return the condition
   */
  public String condition() {
    return condition;
  }

  /**
   * Gets the field.
   *
   * HTTP header field. This is only applicable to "header" rule type.
   *
   * @return the field
   */
  public String field() {
    return field;
  }

  /**
   * Gets the type.
   *
   * The type of the rule.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the value.
   *
   * Value to be matched for rule condition.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

