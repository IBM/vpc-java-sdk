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
 * The getLoadBalancerListenerPolicy options.
 */
public class GetLoadBalancerListenerPolicyOptions extends GenericModel {

  protected String loadBalancerId;
  protected String listenerId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetLoadBalancerListenerPolicyOptions instance.
     *
     * @param getLoadBalancerListenerPolicyOptions the instance to initialize the Builder with
     */
    private Builder(GetLoadBalancerListenerPolicyOptions getLoadBalancerListenerPolicyOptions) {
      this.loadBalancerId = getLoadBalancerListenerPolicyOptions.loadBalancerId;
      this.listenerId = getLoadBalancerListenerPolicyOptions.listenerId;
      this.id = getLoadBalancerListenerPolicyOptions.id;
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
     * Builds a GetLoadBalancerListenerPolicyOptions.
     *
     * @return the new GetLoadBalancerListenerPolicyOptions instance
     */
    public GetLoadBalancerListenerPolicyOptions build() {
      return new GetLoadBalancerListenerPolicyOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the GetLoadBalancerListenerPolicyOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the listenerId.
     *
     * @param listenerId the listenerId
     * @return the GetLoadBalancerListenerPolicyOptions builder
     */
    public Builder listenerId(String listenerId) {
      this.listenerId = listenerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetLoadBalancerListenerPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetLoadBalancerListenerPolicyOptions() { }

  protected GetLoadBalancerListenerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetLoadBalancerListenerPolicyOptions builder
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
}

