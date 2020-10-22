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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * LoadBalancerPoolMemberPatch.
 */
public class LoadBalancerPoolMemberPatch extends GenericModel {

  protected Long port;
  protected Long weight;
  protected LoadBalancerPoolMemberTargetPrototype target;

  /**
   * Builder.
   */
  public static class Builder {
    private Long port;
    private Long weight;
    private LoadBalancerPoolMemberTargetPrototype target;

    private Builder(LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatch) {
      this.port = loadBalancerPoolMemberPatch.port;
      this.weight = loadBalancerPoolMemberPatch.weight;
      this.target = loadBalancerPoolMemberPatch.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolMemberPatch.
     *
     * @return the new LoadBalancerPoolMemberPatch instance
     */
    public LoadBalancerPoolMemberPatch build() {
      return new LoadBalancerPoolMemberPatch(this);
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the LoadBalancerPoolMemberPatch builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the weight.
     *
     * @param weight the weight
     * @return the LoadBalancerPoolMemberPatch builder
     */
    public Builder weight(long weight) {
      this.weight = weight;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the LoadBalancerPoolMemberPatch builder
     */
    public Builder target(LoadBalancerPoolMemberTargetPrototype target) {
      this.target = target;
      return this;
    }
  }

  protected LoadBalancerPoolMemberPatch(Builder builder) {
    port = builder.port;
    weight = builder.weight;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolMemberPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Construct a JSON merge-patch from the LoadBalancerPoolMemberPatch.
   *
   * Note that properties of the LoadBalancerPoolMemberPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the LoadBalancerPoolMemberPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

