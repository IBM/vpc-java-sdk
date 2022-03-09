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
 * The updateLoadBalancerListener options.
 */
public class UpdateLoadBalancerListenerOptions extends GenericModel {

  protected String loadBalancerId;
  protected String id;
  protected Map<String, Object> loadBalancerListenerPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String id;
    private Map<String, Object> loadBalancerListenerPatch;

    private Builder(UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptions) {
      this.loadBalancerId = updateLoadBalancerListenerOptions.loadBalancerId;
      this.id = updateLoadBalancerListenerOptions.id;
      this.loadBalancerListenerPatch = updateLoadBalancerListenerOptions.loadBalancerListenerPatch;
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
     * @param loadBalancerListenerPatch the loadBalancerListenerPatch
     */
    public Builder(String loadBalancerId, String id, Map<String, Object> loadBalancerListenerPatch) {
      this.loadBalancerId = loadBalancerId;
      this.id = id;
      this.loadBalancerListenerPatch = loadBalancerListenerPatch;
    }

    /**
     * Builds a UpdateLoadBalancerListenerOptions.
     *
     * @return the new UpdateLoadBalancerListenerOptions instance
     */
    public UpdateLoadBalancerListenerOptions build() {
      return new UpdateLoadBalancerListenerOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the loadBalancerListenerPatch.
     *
     * @param loadBalancerListenerPatch the loadBalancerListenerPatch
     * @return the UpdateLoadBalancerListenerOptions builder
     */
    public Builder loadBalancerListenerPatch(Map<String, Object> loadBalancerListenerPatch) {
      this.loadBalancerListenerPatch = loadBalancerListenerPatch;
      return this;
    }
  }

  protected UpdateLoadBalancerListenerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.loadBalancerListenerPatch,
      "loadBalancerListenerPatch cannot be null");
    loadBalancerId = builder.loadBalancerId;
    id = builder.id;
    loadBalancerListenerPatch = builder.loadBalancerListenerPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerListenerOptions builder
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
   * The listener identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the loadBalancerListenerPatch.
   *
   * The load balancer listener patch.
   *
   * @return the loadBalancerListenerPatch
   */
  public Map<String, Object> loadBalancerListenerPatch() {
    return loadBalancerListenerPatch;
  }
}

