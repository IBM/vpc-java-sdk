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
 * The datapath logging configuration for this load balancer.
 */
public class LoadBalancerLoggingDatapath extends GenericModel {

  protected Boolean active;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;

    /**
     * Instantiates a new Builder from an existing LoadBalancerLoggingDatapath instance.
     *
     * @param loadBalancerLoggingDatapath the instance to initialize the Builder with
     */
    private Builder(LoadBalancerLoggingDatapath loadBalancerLoggingDatapath) {
      this.active = loadBalancerLoggingDatapath.active;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param active the active
     */
    public Builder(Boolean active) {
      this.active = active;
    }

    /**
     * Builds a LoadBalancerLoggingDatapath.
     *
     * @return the new LoadBalancerLoggingDatapath instance
     */
    public LoadBalancerLoggingDatapath build() {
      return new LoadBalancerLoggingDatapath(this);
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the LoadBalancerLoggingDatapath builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }
  }

  protected LoadBalancerLoggingDatapath() { }

  protected LoadBalancerLoggingDatapath(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.active,
      "active cannot be null");
    active = builder.active;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerLoggingDatapath builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the active.
   *
   * Indicates whether datapath logging is active for this load balancer.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }
}

