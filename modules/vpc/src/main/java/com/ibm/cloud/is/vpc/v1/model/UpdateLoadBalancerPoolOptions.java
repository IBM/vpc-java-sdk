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
 * The updateLoadBalancerPool options.
 */
public class UpdateLoadBalancerPoolOptions extends GenericModel {

  protected String loadBalancerId;
  protected String id;
  protected Map<String, Object> loadBalancerPoolPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String id;
    private Map<String, Object> loadBalancerPoolPatch;

    private Builder(UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptions) {
      this.loadBalancerId = updateLoadBalancerPoolOptions.loadBalancerId;
      this.id = updateLoadBalancerPoolOptions.id;
      this.loadBalancerPoolPatch = updateLoadBalancerPoolOptions.loadBalancerPoolPatch;
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
     * @param id the id
     * @param loadBalancerPoolPatch the loadBalancerPoolPatch
     */
    public Builder(String loadBalancerId, String id, Map<String, Object> loadBalancerPoolPatch) {
      this.loadBalancerId = loadBalancerId;
      this.id = id;
      this.loadBalancerPoolPatch = loadBalancerPoolPatch;
    }

    /**
     * Builds a UpdateLoadBalancerPoolOptions.
     *
     * @return the new UpdateLoadBalancerPoolOptions instance
     */
    public UpdateLoadBalancerPoolOptions build() {
      return new UpdateLoadBalancerPoolOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the loadBalancerPoolPatch.
     *
     * @param loadBalancerPoolPatch the loadBalancerPoolPatch
     * @return the UpdateLoadBalancerPoolOptions builder
     */
    public Builder loadBalancerPoolPatch(Map<String, Object> loadBalancerPoolPatch) {
      this.loadBalancerPoolPatch = loadBalancerPoolPatch;
      return this;
    }
  }

  protected UpdateLoadBalancerPoolOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.loadBalancerPoolPatch,
      "loadBalancerPoolPatch cannot be null");
    loadBalancerId = builder.loadBalancerId;
    id = builder.id;
    loadBalancerPoolPatch = builder.loadBalancerPoolPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerPoolOptions builder
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
   * Gets the id.
   *
   * The pool identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the loadBalancerPoolPatch.
   *
   * The load balancer pool patch.
   *
   * @return the loadBalancerPoolPatch
   */
  public Map<String, Object> loadBalancerPoolPatch() {
    return loadBalancerPoolPatch;
  }
}

