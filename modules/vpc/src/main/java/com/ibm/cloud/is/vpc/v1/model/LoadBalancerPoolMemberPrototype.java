/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * LoadBalancerPoolMemberPrototype.
 */
public class LoadBalancerPoolMemberPrototype extends GenericModel {

  protected Long port;
  protected LoadBalancerPoolMemberTargetPrototype target;
  protected Long weight;

  /**
   * Builder.
   */
  public static class Builder {
    private Long port;
    private LoadBalancerPoolMemberTargetPrototype target;
    private Long weight;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolMemberPrototype instance.
     *
     * @param loadBalancerPoolMemberPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototype) {
      this.port = loadBalancerPoolMemberPrototype.port;
      this.target = loadBalancerPoolMemberPrototype.target;
      this.weight = loadBalancerPoolMemberPrototype.weight;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param port the port
     * @param target the target
     */
    public Builder(Long port, LoadBalancerPoolMemberTargetPrototype target) {
      this.port = port;
      this.target = target;
    }

    /**
     * Builds a LoadBalancerPoolMemberPrototype.
     *
     * @return the new LoadBalancerPoolMemberPrototype instance
     */
    public LoadBalancerPoolMemberPrototype build() {
      return new LoadBalancerPoolMemberPrototype(this);
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the LoadBalancerPoolMemberPrototype builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the LoadBalancerPoolMemberPrototype builder
     */
    public Builder target(LoadBalancerPoolMemberTargetPrototype target) {
      this.target = target;
      return this;
    }

    /**
     * Set the weight.
     *
     * @param weight the weight
     * @return the LoadBalancerPoolMemberPrototype builder
     */
    public Builder weight(long weight) {
      this.weight = weight;
      return this;
    }
  }

  protected LoadBalancerPoolMemberPrototype() { }

  protected LoadBalancerPoolMemberPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    port = builder.port;
    target = builder.target;
    weight = builder.weight;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolMemberPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the port.
   *
   * The port the member will receive load balancer traffic on. Applies only to load balancer traffic received on a
   * listener with a single port. (If the traffic is received on a listener with a port range, the member will receive
   * the traffic on the same port the listener received it on.)
   *
   * This port will also be used for health checks unless the `port` property of
   * `health_monitor` property is specified.
   *
   * The port must be unique across all members for all pools associated with this pool's listener.
   *
   * For load balancers in the `network` family, the same `port` and `target` tuple cannot be shared by a pool member of
   * any other load balancer in the same VPC.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the target.
   *
   * The pool member target.
   *
   * If the load balancer has `route_mode` set to `true`, the member must be in a zone the load
   * balancer has a subnet in.
   *
   * For load balancers in the `network` family, the same `port` and `target` tuple cannot
   * be shared by a pool member of any other load balancer in the same VPC.
   *
   * @return the target
   */
  public LoadBalancerPoolMemberTargetPrototype target() {
    return target;
  }

  /**
   * Gets the weight.
   *
   * The weight of the server member.
   *
   * If specified, the pool algorithm must be `weighted_round_robin` and the load balancer must be in the `application`
   * family.
   *
   * If unspecified, the weight will be `50` for load balancers in the `application` family.
   *
   * @return the weight
   */
  public Long weight() {
    return weight;
  }
}

