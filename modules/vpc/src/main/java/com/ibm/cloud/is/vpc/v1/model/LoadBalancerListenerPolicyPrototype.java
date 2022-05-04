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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListenerPolicyPrototype.
 */
public class LoadBalancerListenerPolicyPrototype extends GenericModel {

  /**
   * The policy action.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the policy on which the
   * unexpected property value was encountered.
   */
  public interface Action {
    /** forward. */
    String FORWARD = "forward";
    /** https_redirect. */
    String HTTPS_REDIRECT = "https_redirect";
    /** redirect. */
    String REDIRECT = "redirect";
    /** reject. */
    String REJECT = "reject";
  }

  protected String action;
  protected String name;
  protected Long priority;
  protected List<LoadBalancerListenerPolicyRulePrototype> rules;
  protected LoadBalancerListenerPolicyTargetPrototype target;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String name;
    private Long priority;
    private List<LoadBalancerListenerPolicyRulePrototype> rules;
    private LoadBalancerListenerPolicyTargetPrototype target;

    private Builder(LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototype) {
      this.action = loadBalancerListenerPolicyPrototype.action;
      this.name = loadBalancerListenerPolicyPrototype.name;
      this.priority = loadBalancerListenerPolicyPrototype.priority;
      this.rules = loadBalancerListenerPolicyPrototype.rules;
      this.target = loadBalancerListenerPolicyPrototype.target;
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
     * @param priority the priority
     */
    public Builder(String action, Long priority) {
      this.action = action;
      this.priority = priority;
    }

    /**
     * Builds a LoadBalancerListenerPolicyPrototype.
     *
     * @return the new LoadBalancerListenerPolicyPrototype instance
     */
    public LoadBalancerListenerPolicyPrototype build() {
      return new LoadBalancerListenerPolicyPrototype(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder addRules(LoadBalancerListenerPolicyRulePrototype rules) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rules,
        "rules cannot be null");
      if (this.rules == null) {
        this.rules = new ArrayList<LoadBalancerListenerPolicyRulePrototype>();
      }
      this.rules.add(rules);
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder rules(List<LoadBalancerListenerPolicyRulePrototype> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the LoadBalancerListenerPolicyPrototype builder
     */
    public Builder target(LoadBalancerListenerPolicyTargetPrototype target) {
      this.target = target;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.priority,
      "priority cannot be null");
    action = builder.action;
    name = builder.name;
    priority = builder.priority;
    rules = builder.rules;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * The policy action.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the policy on which the
   * unexpected property value was encountered.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this policy. Names must be unique within the load balancer listener the policy resides
   * in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the priority.
   *
   * Priority of the policy. Lower value indicates higher priority.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }

  /**
   * Gets the rules.
   *
   * The rule prototype objects for this policy.
   *
   * @return the rules
   */
  public List<LoadBalancerListenerPolicyRulePrototype> rules() {
    return rules;
  }

  /**
   * Gets the target.
   *
   * - If `action` is `forward`, specify a `LoadBalancerPoolIdentity`.
   * - If `action` is `redirect`, specify a `LoadBalancerListenerPolicyRedirectURLPrototype`.
   * - If `action` is `https_redirect`, specify a
   *   `LoadBalancerListenerPolicyHTTPSRedirectPrototype`.
   *
   * @return the target
   */
  public LoadBalancerListenerPolicyTargetPrototype target() {
    return target;
  }
}

