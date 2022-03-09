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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createLoadBalancerListenerPolicyRule options.
 */
public class CreateLoadBalancerListenerPolicyRuleOptions extends GenericModel {

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
   *
   * Body rules are applied to form-encoded request bodies using the `UTF-8` character set.
   */
  public interface Type {
    /** body. */
    String BODY = "body";
    /** header. */
    String HEADER = "header";
    /** hostname. */
    String HOSTNAME = "hostname";
    /** path. */
    String PATH = "path";
    /** query. */
    String QUERY = "query";
  }

  protected String loadBalancerId;
  protected String listenerId;
  protected String policyId;
  protected String condition;
  protected String type;
  protected String value;
  protected String field;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;
    private String policyId;
    private String condition;
    private String type;
    private String value;
    private String field;

    private Builder(CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptions) {
      this.loadBalancerId = createLoadBalancerListenerPolicyRuleOptions.loadBalancerId;
      this.listenerId = createLoadBalancerListenerPolicyRuleOptions.listenerId;
      this.policyId = createLoadBalancerListenerPolicyRuleOptions.policyId;
      this.condition = createLoadBalancerListenerPolicyRuleOptions.condition;
      this.type = createLoadBalancerListenerPolicyRuleOptions.type;
      this.value = createLoadBalancerListenerPolicyRuleOptions.value;
      this.field = createLoadBalancerListenerPolicyRuleOptions.field;
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
     * @param condition the condition
     * @param type the type
     * @param value the value
     */
    public Builder(String loadBalancerId, String listenerId, String policyId, String condition, String type, String value) {
      this.loadBalancerId = loadBalancerId;
      this.listenerId = listenerId;
      this.policyId = policyId;
      this.condition = condition;
      this.type = type;
      this.value = value;
    }

    /**
     * Builds a CreateLoadBalancerListenerPolicyRuleOptions.
     *
     * @return the new CreateLoadBalancerListenerPolicyRuleOptions instance
     */
    public CreateLoadBalancerListenerPolicyRuleOptions build() {
      return new CreateLoadBalancerListenerPolicyRuleOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the CreateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the listenerId.
     *
     * @param listenerId the listenerId
     * @return the CreateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder listenerId(String listenerId) {
      this.listenerId = listenerId;
      return this;
    }

    /**
     * Set the policyId.
     *
     * @param policyId the policyId
     * @return the CreateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder policyId(String policyId) {
      this.policyId = policyId;
      return this;
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the CreateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the CreateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the field.
     *
     * @param field the field
     * @return the CreateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder field(String field) {
      this.field = field;
      return this;
    }
  }

  protected CreateLoadBalancerListenerPolicyRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyId,
      "policyId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.condition,
      "condition cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
    policyId = builder.policyId;
    condition = builder.condition;
    type = builder.type;
    value = builder.value;
    field = builder.field;
  }

  /**
   * New builder.
   *
   * @return a CreateLoadBalancerListenerPolicyRuleOptions builder
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
   * Gets the type.
   *
   * The type of the rule.
   *
   * Body rules are applied to form-encoded request bodies using the `UTF-8` character set.
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
   * If the rule type is `query` and the rule condition is not `matches_regex`, the value must be percent-encoded.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the field.
   *
   * The field. This is applicable to `header`, `query`, and `body` rule types.
   *
   * If the rule type is `header`, this property is required.
   *
   * If the rule type is `query`, this is optional. If specified and the rule condition is not
   * `matches_regex`, the value must be percent-encoded.
   *
   * If the rule type is `body`, this is optional.
   *
   * @return the field
   */
  public String field() {
    return field;
  }
}

