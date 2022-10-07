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
 * The updateLoadBalancerListenerPolicy options.
 */
public class UpdateLoadBalancerListenerPolicyOptions extends GenericModel {

  protected String loadBalancerId;
  protected String listenerId;
  protected String id;
  protected Map<String, Object> loadBalancerListenerPolicyPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;
    private String id;
    private Map<String, Object> loadBalancerListenerPolicyPatch;

    /**
     * Instantiates a new Builder from an existing UpdateLoadBalancerListenerPolicyOptions instance.
     *
     * @param updateLoadBalancerListenerPolicyOptions the instance to initialize the Builder with
     */
    private Builder(UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptions) {
      this.loadBalancerId = updateLoadBalancerListenerPolicyOptions.loadBalancerId;
      this.listenerId = updateLoadBalancerListenerPolicyOptions.listenerId;
      this.id = updateLoadBalancerListenerPolicyOptions.id;
      this.loadBalancerListenerPolicyPatch = updateLoadBalancerListenerPolicyOptions.loadBalancerListenerPolicyPatch;
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
     * @param id the id
     * @param loadBalancerListenerPolicyPatch the loadBalancerListenerPolicyPatch
     */
    public Builder(String loadBalancerId, String listenerId, String id, Map<String, Object> loadBalancerListenerPolicyPatch) {
      this.loadBalancerId = loadBalancerId;
      this.listenerId = listenerId;
      this.id = id;
      this.loadBalancerListenerPolicyPatch = loadBalancerListenerPolicyPatch;
    }

    /**
     * Builds a UpdateLoadBalancerListenerPolicyOptions.
     *
     * @return the new UpdateLoadBalancerListenerPolicyOptions instance
     */
    public UpdateLoadBalancerListenerPolicyOptions build() {
      return new UpdateLoadBalancerListenerPolicyOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the listenerId.
     *
     * @param listenerId the listenerId
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder listenerId(String listenerId) {
      this.listenerId = listenerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the loadBalancerListenerPolicyPatch.
     *
     * @param loadBalancerListenerPolicyPatch the loadBalancerListenerPolicyPatch
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder loadBalancerListenerPolicyPatch(Map<String, Object> loadBalancerListenerPolicyPatch) {
      this.loadBalancerListenerPolicyPatch = loadBalancerListenerPolicyPatch;
      return this;
    }
  }

  protected UpdateLoadBalancerListenerPolicyOptions() { }

  protected UpdateLoadBalancerListenerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.loadBalancerListenerPolicyPatch,
      "loadBalancerListenerPolicyPatch cannot be null");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
    id = builder.id;
    loadBalancerListenerPolicyPatch = builder.loadBalancerListenerPolicyPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerListenerPolicyOptions builder
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
   * Gets the id.
   *
   * The policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the loadBalancerListenerPolicyPatch.
   *
   * The listener policy patch.
   *
   * @return the loadBalancerListenerPolicyPatch
   */
  public Map<String, Object> loadBalancerListenerPolicyPatch() {
    return loadBalancerListenerPolicyPatch;
  }
}

