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
 * LoadBalancerListenerPolicyRulePrototype.
 */
public class LoadBalancerListenerPolicyRulePrototype extends GenericModel {

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

  protected String condition;
  protected String field;
  protected String type;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String condition;
    private String field;
    private String type;
    private String value;

    private Builder(LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototype) {
      this.condition = loadBalancerListenerPolicyRulePrototype.condition;
      this.field = loadBalancerListenerPolicyRulePrototype.field;
      this.type = loadBalancerListenerPolicyRulePrototype.type;
      this.value = loadBalancerListenerPolicyRulePrototype.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param condition the condition
     * @param type the type
     * @param value the value
     */
    public Builder(String condition, String type, String value) {
      this.condition = condition;
      this.type = type;
      this.value = value;
    }

    /**
     * Builds a LoadBalancerListenerPolicyRulePrototype.
     *
     * @return the new LoadBalancerListenerPolicyRulePrototype instance
     */
    public LoadBalancerListenerPolicyRulePrototype build() {
      return new LoadBalancerListenerPolicyRulePrototype(this);
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the LoadBalancerListenerPolicyRulePrototype builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Set the field.
     *
     * @param field the field
     * @return the LoadBalancerListenerPolicyRulePrototype builder
     */
    public Builder field(String field) {
      this.field = field;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerListenerPolicyRulePrototype builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the LoadBalancerListenerPolicyRulePrototype builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyRulePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.condition,
      "condition cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    condition = builder.condition;
    field = builder.field;
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyRulePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

