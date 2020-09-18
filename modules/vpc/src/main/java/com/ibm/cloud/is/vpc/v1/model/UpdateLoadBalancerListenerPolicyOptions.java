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
 * The updateLoadBalancerListenerPolicy options.
 */
public class UpdateLoadBalancerListenerPolicyOptions extends GenericModel {

  protected String loadBalancerId;
  protected String listenerId;
  protected String id;
  protected String name;
  protected Long priority;
  protected LoadBalancerListenerPolicyPatchTarget target;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;
    private String id;
    private String name;
    private Long priority;
    private LoadBalancerListenerPolicyPatchTarget target;

    private Builder(UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptions) {
      this.loadBalancerId = updateLoadBalancerListenerPolicyOptions.loadBalancerId;
      this.listenerId = updateLoadBalancerListenerPolicyOptions.listenerId;
      this.id = updateLoadBalancerListenerPolicyOptions.id;
      this.name = updateLoadBalancerListenerPolicyOptions.name;
      this.priority = updateLoadBalancerListenerPolicyOptions.priority;
      this.target = updateLoadBalancerListenerPolicyOptions.target;
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
     * @param listenerId the listenerId
     * @param id the id
     */
    public Builder(String loadBalancerId, String listenerId, String id) {
      this.loadBalancerId = loadBalancerId;
      this.listenerId = listenerId;
      this.id = id;
    }

    /**
     * Builds a UpdateLoadBalancerListenerPolicyOptions.
     *
     * @return the new UpdateLoadBalancerListenerPolicyOptions instance
     */
    public UpdateLoadBalancerListenerPolicyOptions build() {
      return new UpdateLoadBalancerListenerPolicyOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the listenerId.
     *
     * @param listenerId the listenerId
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder listenerId(String listenerId) {
      this.listenerId = listenerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the UpdateLoadBalancerListenerPolicyOptions builder
     */
    public Builder target(LoadBalancerListenerPolicyPatchTarget target) {
      this.target = target;
      return this;
    }
  }

  protected UpdateLoadBalancerListenerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
    id = builder.id;
    name = builder.name;
    priority = builder.priority;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a UpdateLoadBalancerListenerPolicyOptions builder
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
   * Gets the listenerId.
   *
   * The listener identifier.
   *
   * @return the listenerId
   */
  public String listenerId() {
    return listenerId;
  }

  /**
   * Gets the id.
   *
   * The policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this policy. Names must be unique within the load balancer listener the policy resides
   * in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the priority.
   *
   * Priority of the policy. Lower value indicates higher priority.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }

  /**
   * Gets the target.
   *
   * When `action` is `forward`, `LoadBalancerPoolIdentity` specifies which pool the load
   * balancer forwards the traffic to. When `action` is `redirect`,
   * `LoadBalancerListenerPolicyRedirectURLPatch` specifies the url and http
   * status code used in the redirect response.
   *
   * @return the target
   */
  public LoadBalancerListenerPolicyPatchTarget target() {
    return target;
  }
}

