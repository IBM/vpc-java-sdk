/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
public class LoadBalancerLoggingDatapathPatch extends GenericModel {

  protected Boolean active;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;

    /**
     * Instantiates a new Builder from an existing LoadBalancerLoggingDatapathPatch instance.
     *
     * @param loadBalancerLoggingDatapathPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerLoggingDatapathPatch loadBalancerLoggingDatapathPatch) {
      this.active = loadBalancerLoggingDatapathPatch.active;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerLoggingDatapathPatch.
     *
     * @return the new LoadBalancerLoggingDatapathPatch instance
     */
    public LoadBalancerLoggingDatapathPatch build() {
      return new LoadBalancerLoggingDatapathPatch(this);
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the LoadBalancerLoggingDatapathPatch builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }
  }

  protected LoadBalancerLoggingDatapathPatch() { }

  protected LoadBalancerLoggingDatapathPatch(Builder builder) {
    active = builder.active;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerLoggingDatapathPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the active.
   *
   * Indicates whether datapath logging will be active for this load balancer.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }
}

