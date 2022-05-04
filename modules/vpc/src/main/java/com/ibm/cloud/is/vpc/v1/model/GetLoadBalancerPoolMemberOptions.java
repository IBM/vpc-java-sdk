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
 * The getLoadBalancerPoolMember options.
 */
public class GetLoadBalancerPoolMemberOptions extends GenericModel {

  protected String loadBalancerId;
  protected String poolId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String poolId;
    private String id;

    private Builder(GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptions) {
      this.loadBalancerId = getLoadBalancerPoolMemberOptions.loadBalancerId;
      this.poolId = getLoadBalancerPoolMemberOptions.poolId;
      this.id = getLoadBalancerPoolMemberOptions.id;
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
     * @param id the id
     */
    public Builder(String loadBalancerId, String poolId, String id) {
      this.loadBalancerId = loadBalancerId;
      this.poolId = poolId;
      this.id = id;
    }

    /**
     * Builds a GetLoadBalancerPoolMemberOptions.
     *
     * @return the new GetLoadBalancerPoolMemberOptions instance
     */
    public GetLoadBalancerPoolMemberOptions build() {
      return new GetLoadBalancerPoolMemberOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the GetLoadBalancerPoolMemberOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the poolId.
     *
     * @param poolId the poolId
     * @return the GetLoadBalancerPoolMemberOptions builder
     */
    public Builder poolId(String poolId) {
      this.poolId = poolId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetLoadBalancerPoolMemberOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetLoadBalancerPoolMemberOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.poolId,
      "poolId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    poolId = builder.poolId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetLoadBalancerPoolMemberOptions builder
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

  /**
   * Gets the id.
   *
   * The member identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

