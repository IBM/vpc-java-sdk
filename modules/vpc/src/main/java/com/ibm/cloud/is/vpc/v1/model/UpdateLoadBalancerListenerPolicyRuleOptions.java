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

/**
 * The updateLoadBalancerListenerPolicyRule options.
 */
public class UpdateLoadBalancerListenerPolicyRuleOptions extends GenericModel {

  protected String loadBalancerId;
  protected String listenerId;
  protected String policyId;
  protected String id;
  protected Map<String, Object> loadBalancerListenerPolicyRulePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;
    private String policyId;
    private String id;
    private Map<String, Object> loadBalancerListenerPolicyRulePatch;

    /**
     * Instantiates a new Builder from an existing UpdateLoadBalancerListenerPolicyRuleOptions instance.
     *
     * @param updateLoadBalancerListenerPolicyRuleOptions the instance to initialize the Builder with
     */
    private Builder(UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptions) {
      this.loadBalancerId = updateLoadBalancerListenerPolicyRuleOptions.loadBalancerId;
      this.listenerId = updateLoadBalancerListenerPolicyRuleOptions.listenerId;
      this.policyId = updateLoadBalancerListenerPolicyRuleOptions.policyId;
      this.id = updateLoadBalancerListenerPolicyRuleOptions.id;
      this.loadBalancerListenerPolicyRulePatch = updateLoadBalancerListenerPolicyRuleOptions.loadBalancerListenerPolicyRulePatch;
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
     * @param loadBalancerListenerPolicyRulePatch the loadBalancerListenerPolicyRulePatch
     */
    public Builder(String loadBalancerId, String listenerId, String policyId, String id, Map<String, Object> loadBalancerListenerPolicyRulePatch) {
      this.loadBalancerId = loadBalancerId;
      this.listenerId = listenerId;
      this.policyId = policyId;
      this.id = id;
      this.loadBalancerListenerPolicyRulePatch = loadBalancerListenerPolicyRulePatch;
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
     * Set the loadBalancerListenerPolicyRulePatch.
     *
     * @param loadBalancerListenerPolicyRulePatch the loadBalancerListenerPolicyRulePatch
     * @return the UpdateLoadBalancerListenerPolicyRuleOptions builder
     */
    public Builder loadBalancerListenerPolicyRulePatch(Map<String, Object> loadBalancerListenerPolicyRulePatch) {
      this.loadBalancerListenerPolicyRulePatch = loadBalancerListenerPolicyRulePatch;
      return this;
    }
  }

  protected UpdateLoadBalancerListenerPolicyRuleOptions() { }

  protected UpdateLoadBalancerListenerPolicyRuleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.policyId,
      "policyId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.loadBalancerListenerPolicyRulePatch,
      "loadBalancerListenerPolicyRulePatch cannot be null");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
    policyId = builder.policyId;
    id = builder.id;
    loadBalancerListenerPolicyRulePatch = builder.loadBalancerListenerPolicyRulePatch;
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
   * Gets the loadBalancerListenerPolicyRulePatch.
   *
   * The listener policy rule patch.
   *
   * @return the loadBalancerListenerPolicyRulePatch
   */
  public Map<String, Object> loadBalancerListenerPolicyRulePatch() {
    return loadBalancerListenerPolicyRulePatch;
  }
}

