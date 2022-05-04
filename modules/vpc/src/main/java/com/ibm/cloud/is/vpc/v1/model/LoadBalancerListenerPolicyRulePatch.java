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

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * LoadBalancerListenerPolicyRulePatch.
 */
public class LoadBalancerListenerPolicyRulePatch extends GenericModel {

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

    private Builder(LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatch) {
      this.condition = loadBalancerListenerPolicyRulePatch.condition;
      this.field = loadBalancerListenerPolicyRulePatch.field;
      this.type = loadBalancerListenerPolicyRulePatch.type;
      this.value = loadBalancerListenerPolicyRulePatch.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerPolicyRulePatch.
     *
     * @return the new LoadBalancerListenerPolicyRulePatch instance
     */
    public LoadBalancerListenerPolicyRulePatch build() {
      return new LoadBalancerListenerPolicyRulePatch(this);
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the LoadBalancerListenerPolicyRulePatch builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Set the field.
     *
     * @param field the field
     * @return the LoadBalancerListenerPolicyRulePatch builder
     */
    public Builder field(String field) {
      this.field = field;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the LoadBalancerListenerPolicyRulePatch builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the LoadBalancerListenerPolicyRulePatch builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyRulePatch(Builder builder) {
    condition = builder.condition;
    field = builder.field;
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyRulePatch builder
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

  /**
   * Construct a JSON merge-patch from the LoadBalancerListenerPolicyRulePatch.
   *
   * Note that properties of the LoadBalancerListenerPolicyRulePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the LoadBalancerListenerPolicyRulePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

