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
 * The listLoadBalancerPools options.
 */
public class ListLoadBalancerPoolsOptions extends GenericModel {

  protected String loadBalancerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;

    /**
     * Instantiates a new Builder from an existing ListLoadBalancerPoolsOptions instance.
     *
     * @param listLoadBalancerPoolsOptions the instance to initialize the Builder with
     */
    private Builder(ListLoadBalancerPoolsOptions listLoadBalancerPoolsOptions) {
      this.loadBalancerId = listLoadBalancerPoolsOptions.loadBalancerId;
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
     */
    public Builder(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
    }

    /**
     * Builds a ListLoadBalancerPoolsOptions.
     *
     * @return the new ListLoadBalancerPoolsOptions instance
     */
    public ListLoadBalancerPoolsOptions build() {
      return new ListLoadBalancerPoolsOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the ListLoadBalancerPoolsOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }
  }

  protected ListLoadBalancerPoolsOptions() { }

  protected ListLoadBalancerPoolsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    loadBalancerId = builder.loadBalancerId;
  }

  /**
   * New builder.
   *
   * @return a ListLoadBalancerPoolsOptions builder
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
}

