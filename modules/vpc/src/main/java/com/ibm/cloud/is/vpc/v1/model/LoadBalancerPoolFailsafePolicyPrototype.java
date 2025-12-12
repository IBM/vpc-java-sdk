/*
 * (C) Copyright IBM Corp. 2025.
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
 * LoadBalancerPoolFailsafePolicyPrototype.
 */
public class LoadBalancerPoolFailsafePolicyPrototype extends GenericModel {

  /**
   * A load balancer failsafe policy action:
   * - `bypass`: Bypasses the members and sends requests directly to their destination IPs. If specified, this load
   * balancer must have `route_mode` enabled.
   * - `drop`: Drops requests. If specified, the pool protocol must be `tcp`.
   * - `fail`: Fails requests with an HTTP `503` status code. If specified, the pool protocol must be `http` or `https`.
   * - `forward`: Forwards requests to the `target` pool. If specified, the pool protocol must be `http` or `https`.
   *
   * The specified value must be listed in the `failsafe_policy_actions` for this pool's load balancer.
   */
  public interface Action {
    /** bypass. */
    String BYPASS = "bypass";
    /** drop. */
    String DROP = "drop";
    /** fail. */
    String FAIL = "fail";
    /** forward. */
    String FORWARD = "forward";
  }

  protected String action;
  protected LoadBalancerPoolIdentity target;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private LoadBalancerPoolIdentity target;

    /**
     * Instantiates a new Builder from an existing LoadBalancerPoolFailsafePolicyPrototype instance.
     *
     * @param loadBalancerPoolFailsafePolicyPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerPoolFailsafePolicyPrototype loadBalancerPoolFailsafePolicyPrototype) {
      this.action = loadBalancerPoolFailsafePolicyPrototype.action;
      this.target = loadBalancerPoolFailsafePolicyPrototype.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerPoolFailsafePolicyPrototype.
     *
     * @return the new LoadBalancerPoolFailsafePolicyPrototype instance
     */
    public LoadBalancerPoolFailsafePolicyPrototype build() {
      return new LoadBalancerPoolFailsafePolicyPrototype(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the LoadBalancerPoolFailsafePolicyPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the LoadBalancerPoolFailsafePolicyPrototype builder
     */
    public Builder target(LoadBalancerPoolIdentity target) {
      this.target = target;
      return this;
    }
  }

  protected LoadBalancerPoolFailsafePolicyPrototype() { }

  protected LoadBalancerPoolFailsafePolicyPrototype(Builder builder) {
    action = builder.action;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerPoolFailsafePolicyPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * A load balancer failsafe policy action:
   * - `bypass`: Bypasses the members and sends requests directly to their destination IPs. If specified, this load
   * balancer must have `route_mode` enabled.
   * - `drop`: Drops requests. If specified, the pool protocol must be `tcp`.
   * - `fail`: Fails requests with an HTTP `503` status code. If specified, the pool protocol must be `http` or `https`.
   * - `forward`: Forwards requests to the `target` pool. If specified, the pool protocol must be `http` or `https`.
   *
   * The specified value must be listed in the `failsafe_policy_actions` for this pool's load balancer.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the target.
   *
   * The failsafe target pool to forward to.
   *
   * The specified pool must:
   * - Belong to this load balancer
   * - Have the same `protocol` as this pool, or have a compatible protocol.
   *   At present, the compatible protocols are `http` and `https`.
   * - Have a `failsafe_policy.action` of `fail` or `drop`
   *
   * If specified, `action` must be `forward`.
   *
   * @return the target
   */
  public LoadBalancerPoolIdentity target() {
    return target;
  }
}

