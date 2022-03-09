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
 * The updateLoadBalancer options.
 */
public class UpdateLoadBalancerOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> loadBalancerPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> loadBalancerPatch;

    private Builder(UpdateLoadBalancerOptions updateLoadBalancerOptions) {
      this.id = updateLoadBalancerOptions.id;
      this.loadBalancerPatch = updateLoadBalancerOptions.loadBalancerPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param loadBalancerPatch the loadBalancerPatch
     */
    public Builder(String id, Map<String, Object> loadBalancerPatch) {
      this.id = id;
      this.loadBalancerPatch = loadBalancerPatch;
    }

    /**
     * Builds a UpdateLoadBalancerOptions.
     *
     * @return the new UpdateLoadBalancerOptions instance
     */
    public UpdateLoadBalancerOptions build() {
      return new UpdateLoadBalancerOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the loadBalancerPatch.
     *
     * @param loadBalancerPatch the loadBalancerPatch
     * @return the UpdateLoadBalancerOptions builder
     */
    public Builder loadBalancerPatch(Map<String, Object> loadBalancerPatch) {
      this.loadBalancerPatch = loadBalancerPatch;
      return this;
    }
  }

  protected UpdateLoadBalancerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.loadBalancerPatch,
      "loadBalancerPatch cannot be null");
    id = builder.id;
    loadBalancerPatch = builder.loadBalancerPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The load balancer identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the loadBalancerPatch.
   *
   * The load balancer patch.
   *
   * @return the loadBalancerPatch
   */
  public Map<String, Object> loadBalancerPatch() {
    return loadBalancerPatch;
  }
}

