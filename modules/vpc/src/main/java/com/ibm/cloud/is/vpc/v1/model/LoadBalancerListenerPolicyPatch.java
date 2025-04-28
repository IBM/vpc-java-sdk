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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * LoadBalancerListenerPolicyPatch.
 */
public class LoadBalancerListenerPolicyPatch extends GenericModel {

  protected String name;
  protected Long priority;
  protected LoadBalancerListenerPolicyTargetPatch target;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Long priority;
    private LoadBalancerListenerPolicyTargetPatch target;

    /**
     * Instantiates a new Builder from an existing LoadBalancerListenerPolicyPatch instance.
     *
     * @param loadBalancerListenerPolicyPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatch) {
      this.name = loadBalancerListenerPolicyPatch.name;
      this.priority = loadBalancerListenerPolicyPatch.priority;
      this.target = loadBalancerListenerPolicyPatch.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerListenerPolicyPatch.
     *
     * @return the new LoadBalancerListenerPolicyPatch instance
     */
    public LoadBalancerListenerPolicyPatch build() {
      return new LoadBalancerListenerPolicyPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the LoadBalancerListenerPolicyPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the LoadBalancerListenerPolicyPatch builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the LoadBalancerListenerPolicyPatch builder
     */
    public Builder target(LoadBalancerListenerPolicyTargetPatch target) {
      this.target = target;
      return this;
    }
  }

  protected LoadBalancerListenerPolicyPatch() { }

  protected LoadBalancerListenerPolicyPatch(Builder builder) {
    name = builder.name;
    priority = builder.priority;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerListenerPolicyPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this policy. The name must not be used by another policy for the load balancer listener.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the priority.
   *
   * Priority of the policy. The priority is unique across all policies for this load balancer listener. Lower value
   * indicates higher priority.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }

  /**
   * Gets the target.
   *
   * - If `action` is `forward_to_listener`, specify a `LoadBalancerListenerIdentity` for a
   *   listener in this load balancer.
   * - If `action` is `forward_to_pool`, specify a `LoadBalancerPoolIdentity` for a pool in
   *   this load balancer.
   * - If `action` is `https_redirect`, specify a
   *   `LoadBalancerListenerPolicyHTTPSRedirectPatch` for a listener in this load balancer
   *   with a `protocol` of `https`.
   * - If `action` is `redirect`, specify a `LoadBalancerListenerPolicyRedirectURLPatch`.
   *
   * @return the target
   */
  public LoadBalancerListenerPolicyTargetPatch target() {
    return target;
  }

  /**
   * Construct a JSON merge-patch from the LoadBalancerListenerPolicyPatch.
   *
   * Note that properties of the LoadBalancerListenerPolicyPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the LoadBalancerListenerPolicyPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

