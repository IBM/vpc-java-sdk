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
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the target.
   *
   * The pool member target. Load balancers in the `network` family support virtual server
   * instances. Load balancers in the `application` family support IP addresses.
   *
   * @return the target
   */
  public LoadBalancerPoolMemberTargetPrototype target() {
    return target;
  }

  /**
   * Gets the weight.
   *
   * Weight of the server member. Applicable only if the pool algorithm is
   * `weighted_round_robin`.
   *
   * @return the weight
   */
  public Long weight() {
    return weight;
  }
}

