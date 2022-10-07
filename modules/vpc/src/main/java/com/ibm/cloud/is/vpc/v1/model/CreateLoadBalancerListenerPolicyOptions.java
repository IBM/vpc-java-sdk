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
 * The createLoadBalancerListenerPolicy options.
 */
public class CreateLoadBalancerListenerPolicyOptions extends GenericModel {

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

  protected String loadBalancerId;
  protected String listenerId;
  protected String action;
  protected Long priority;
  protected String name;
  protected List<LoadBalancerListenerPolicyRulePrototype> rules;
  protected LoadBalancerListenerPolicyTargetPrototype target;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;
    private String action;
    private Long priority;
    private String name;
    private List<LoadBalancerListenerPolicyRulePrototype> rules;
    private LoadBalancerListenerPolicyTargetPrototype target;

    /**
     * Instantiates a new Builder from an existing CreateLoadBalancerListenerPolicyOptions instance.
     *
     * @param createLoadBalancerListenerPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptions) {
      this.loadBalancerId = createLoadBalancerListenerPolicyOptions.loadBalancerId;
      this.listenerId = createLoadBalancerListenerPolicyOptions.listenerId;
      this.action = createLoadBalancerListenerPolicyOptions.action;
      this.priority = createLoadBalancerListenerPolicyOptions.priority;
      this.name = createLoadBalancerListenerPolicyOptions.name;
      this.rules = createLoadBalancerListenerPolicyOptions.rules;
      this.target = createLoadBalancerListenerPolicyOptions.target;
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
     * @param action the action
     * @param priority the priority
     */
    public Builder(String loadBalancerId, String listenerId, String action, Long priority) {
      this.loadBalancerId = loadBalancerId;
      this.listenerId = listenerId;
      this.action = action;
      this.priority = priority;
    }

    /**
     * Builds a CreateLoadBalancerListenerPolicyOptions.
     *
     * @return the new CreateLoadBalancerListenerPolicyOptions instance
     */
    public CreateLoadBalancerListenerPolicyOptions build() {
      return new CreateLoadBalancerListenerPolicyOptions(this);
    }

    /**
     * Adds an rules to rules.
     *
     * @param rules the new rules
     * @return the CreateLoadBalancerListenerPolicyOptions builder
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
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the CreateLoadBalancerListenerPolicyOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the listenerId.
     *
     * @param listenerId the listenerId
     * @return the CreateLoadBalancerListenerPolicyOptions builder
     */
    public Builder listenerId(String listenerId) {
      this.listenerId = listenerId;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateLoadBalancerListenerPolicyOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the CreateLoadBalancerListenerPolicyOptions builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateLoadBalancerListenerPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the rules.
     * Existing rules will be replaced.
     *
     * @param rules the rules
     * @return the CreateLoadBalancerListenerPolicyOptions builder
     */
    public Builder rules(List<LoadBalancerListenerPolicyRulePrototype> rules) {
      this.rules = rules;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateLoadBalancerListenerPolicyOptions builder
     */
    public Builder target(LoadBalancerListenerPolicyTargetPrototype target) {
      this.target = target;
      return this;
    }
  }

  protected CreateLoadBalancerListenerPolicyOptions() { }

  protected CreateLoadBalancerListenerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.priority,
      "priority cannot be null");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
    action = builder.action;
    priority = builder.priority;
    name = builder.name;
    rules = builder.rules;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a CreateLoadBalancerListenerPolicyOptions builder
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

