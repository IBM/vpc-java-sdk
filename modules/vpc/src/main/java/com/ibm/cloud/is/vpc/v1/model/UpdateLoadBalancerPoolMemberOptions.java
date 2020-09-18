/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateLoadBalancerPoolMember options.
 */
public class UpdateLoadBalancerPoolMemberOptions extends GenericModel {

  protected String loadBalancerId;
  protected String poolId;
  protected String id;
  protected Long port;
  protected Long weight;
  protected LoadBalancerPoolMemberTargetPrototype target;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String poolId;
    private String id;
    private Long port;
    private Long weight;
    private LoadBalancerPoolMemberTargetPrototype target;

    private Builder(UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptions) {
      this.loadBalancerId = updateLoadBalancerPoolMemberOptions.loadBalancerId;
      this.poolId = updateLoadBalancerPoolMemberOptions.poolId;
      this.id = updateLoadBalancerPoolMemberOptions.id;
      this.port = updateLoadBalancerPoolMemberOptions.port;
      this.weight = updateLoadBalancerPoolMemberOptions.weight;
      this.target = updateLoadBalancerPoolMemberOptions.target;
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
     * Builds a UpdateLoadBalancerPoolMemberOptions.
     *
     * @return the new UpdateLoadBalancerPoolMemberOptions instance
     */
    public UpdateLoadBalancerPoolMemberOptions build() {
      return new UpdateLoadBalancerPoolMemberOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerPoolMemberOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the poolId.
     *
     * @param poolId the poolId
     * @return the UpdateLoadBalancerPoolMemberOptions builder
     */
    public Builder poolId(String poolId) {
      this.poolId = poolId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerPoolMemberOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the UpdateLoadBalancerPoolMemberOptions builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the weight.
     *
     * @param weight the weight
     * @return the UpdateLoadBalancerPoolMemberOptions builder
     */
    public Builder weight(long weight) {
      this.weight = weight;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the UpdateLoadBalancerPoolMemberOptions builder
     */
    public Builder target(LoadBalancerPoolMemberTargetPrototype target) {
      this.target = target;
      return this;
    }
  }

  protected UpdateLoadBalancerPoolMemberOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.poolId,
      "poolId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    poolId = builder.poolId;
    id = builder.id;
    port = builder.port;
    weight = builder.weight;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerPoolMemberOptions builder
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

  /**
   * Gets the port.
   *
   * The port number of the application running in the server member.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the weight.
   *
   * Weight of the server member. This takes effect only when the load balancing algorithm of its belonging pool is
   * `weighted_round_robin`.
   *
   * @return the weight
   */
  public Long weight() {
    return weight;
  }

  /**
   * Gets the target.
   *
   * The pool member target. Load balancers in the `network` family
   * support instances. Load balancers in the `application` family support
   * IP addresses.
   *
   * @return the target
   */
  public LoadBalancerPoolMemberTargetPrototype target() {
    return target;
  }
}

