/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
   * - `forward`: Requests will be forwarded to the specified `target` pool
   * - `https_redirect`: Requests will be redirected to the specified target listener. The
   *   listener must have a `protocol` of `http`, and the target listener must have a
   *   `protocol` of `https`
   * - `redirect`: Requests will be redirected to the specified `target.url`
   * - `reject`: Requests will be rejected with a `403` status code
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
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

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerPolicyPrototype instance.
     *
     * @param loadBalancerListenerPolicyPrototype the instance to initialize the Builder with
     */
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
     * Adds a new element to rules.
     *
     * @param rules the new element to be added
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

  protected LoadBalancerListenerPolicyPrototype() { }

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
   * - `forward`: Requests will be forwarded to the specified `target` pool
   * - `https_redirect`: Requests will be redirected to the specified target listener. The
   *   listener must have a `protocol` of `http`, and the target listener must have a
   *   `protocol` of `https`
   * - `redirect`: Requests will be redirected to the specified `target.url`
   * - `reject`: Requests will be rejected with a `403` status code
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the name.
   *
   * The name for this policy. The name must not be used by another policy for the load balancer listener. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the priority.
   *
   * Priority of the policy. The priority is unique across all policies for this load balancer listener. Lower value
   * indicates higher priority.
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
   * - If `action` is `https_redirect`, specify a
   * `LoadBalancerListenerPolicyHTTPSRedirectPrototype`.
   * - If `action` is `redirect`, specify a `LoadBalancerListenerPolicyRedirectURLPrototype`.
   *
   * @return the target
   */
  public LoadBalancerListenerPolicyTargetPrototype target() {
    return target;
  }
}

