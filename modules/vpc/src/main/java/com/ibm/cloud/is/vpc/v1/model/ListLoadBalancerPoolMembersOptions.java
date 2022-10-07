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
 * The listLoadBalancerPoolMembers options.
 */
public class ListLoadBalancerPoolMembersOptions extends GenericModel {

  protected String loadBalancerId;
  protected String poolId;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String poolId;

    /**
     * Instantiates a new Builder from an existing ListLoadBalancerPoolMembersOptions instance.
     *
     * @param listLoadBalancerPoolMembersOptions the instance to initialize the Builder with
     */
    private Builder(ListLoadBalancerPoolMembersOptions listLoadBalancerPoolMembersOptions) {
      this.loadBalancerId = listLoadBalancerPoolMembersOptions.loadBalancerId;
      this.poolId = listLoadBalancerPoolMembersOptions.poolId;
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
     * @param poolId the poolId
     */
    public Builder(String loadBalancerId, String poolId) {
      this.loadBalancerId = loadBalancerId;
      this.poolId = poolId;
    }

    /**
     * Builds a ListLoadBalancerPoolMembersOptions.
     *
     * @return the new ListLoadBalancerPoolMembersOptions instance
     */
    public ListLoadBalancerPoolMembersOptions build() {
      return new ListLoadBalancerPoolMembersOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the ListLoadBalancerPoolMembersOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the poolId.
     *
     * @param poolId the poolId
     * @return the ListLoadBalancerPoolMembersOptions builder
     */
    public Builder poolId(String poolId) {
      this.poolId = poolId;
      return this;
    }
  }

  protected ListLoadBalancerPoolMembersOptions() { }

  protected ListLoadBalancerPoolMembersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.poolId,
      "poolId cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    poolId = builder.poolId;
  }

  /**
   * New builder.
   *
   * @return a ListLoadBalancerPoolMembersOptions builder
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
   * Gets the poolId.
   *
   * The pool identifier.
   *
   * @return the poolId
   */
  public String poolId() {
    return poolId;
  }
}

