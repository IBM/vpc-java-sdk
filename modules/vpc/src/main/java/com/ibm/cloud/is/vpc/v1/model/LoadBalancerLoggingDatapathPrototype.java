/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
public class LoadBalancerLoggingDatapathPrototype extends GenericModel {

  protected Boolean active;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;

    /**
     * Instantiates a new Builder from an existing LoadBalancerLoggingDatapathPrototype instance.
     *
     * @param loadBalancerLoggingDatapathPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerLoggingDatapathPrototype loadBalancerLoggingDatapathPrototype) {
      this.active = loadBalancerLoggingDatapathPrototype.active;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerLoggingDatapathPrototype.
     *
     * @return the new LoadBalancerLoggingDatapathPrototype instance
     */
    public LoadBalancerLoggingDatapathPrototype build() {
      return new LoadBalancerLoggingDatapathPrototype(this);
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the LoadBalancerLoggingDatapathPrototype builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }
  }

  protected LoadBalancerLoggingDatapathPrototype() { }

  protected LoadBalancerLoggingDatapathPrototype(Builder builder) {
    active = builder.active;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerLoggingDatapathPrototype builder
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

