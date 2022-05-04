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
 * The listLoadBalancerListenerPolicies options.
 */
public class ListLoadBalancerListenerPoliciesOptions extends GenericModel {

  protected String loadBalancerId;
  protected String listenerId;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String listenerId;

    private Builder(ListLoadBalancerListenerPoliciesOptions listLoadBalancerListenerPoliciesOptions) {
      this.loadBalancerId = listLoadBalancerListenerPoliciesOptions.loadBalancerId;
      this.listenerId = listLoadBalancerListenerPoliciesOptions.listenerId;
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
     */
    public Builder(String loadBalancerId, String listenerId) {
      this.loadBalancerId = loadBalancerId;
      this.listenerId = listenerId;
    }

    /**
     * Builds a ListLoadBalancerListenerPoliciesOptions.
     *
     * @return the new ListLoadBalancerListenerPoliciesOptions instance
     */
    public ListLoadBalancerListenerPoliciesOptions build() {
      return new ListLoadBalancerListenerPoliciesOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the ListLoadBalancerListenerPoliciesOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the listenerId.
     *
     * @param listenerId the listenerId
     * @return the ListLoadBalancerListenerPoliciesOptions builder
     */
    public Builder listenerId(String listenerId) {
      this.listenerId = listenerId;
      return this;
    }
  }

  protected ListLoadBalancerListenerPoliciesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.listenerId,
      "listenerId cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    listenerId = builder.listenerId;
  }

  /**
   * New builder.
   *
   * @return a ListLoadBalancerListenerPoliciesOptions builder
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
}

