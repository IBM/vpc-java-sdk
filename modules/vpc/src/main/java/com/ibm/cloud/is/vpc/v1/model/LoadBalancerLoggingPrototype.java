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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerLoggingPrototype.
 */
public class LoadBalancerLoggingPrototype extends GenericModel {

  protected LoadBalancerLoggingDatapathPrototype datapath;

  /**
   * Builder.
   */
  public static class Builder {
    private LoadBalancerLoggingDatapathPrototype datapath;

    /**
     * Instantiates a new Builder from an existing LoadBalancerLoggingPrototype instance.
     *
     * @param loadBalancerLoggingPrototype the instance to initialize the Builder with
     */
    private Builder(LoadBalancerLoggingPrototype loadBalancerLoggingPrototype) {
      this.datapath = loadBalancerLoggingPrototype.datapath;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerLoggingPrototype.
     *
     * @return the new LoadBalancerLoggingPrototype instance
     */
    public LoadBalancerLoggingPrototype build() {
      return new LoadBalancerLoggingPrototype(this);
    }

    /**
     * Set the datapath.
     *
     * @param datapath the datapath
     * @return the LoadBalancerLoggingPrototype builder
     */
    public Builder datapath(LoadBalancerLoggingDatapathPrototype datapath) {
      this.datapath = datapath;
      return this;
    }
  }

  protected LoadBalancerLoggingPrototype() { }

  protected LoadBalancerLoggingPrototype(Builder builder) {
    datapath = builder.datapath;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerLoggingPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the datapath.
   *
   * The datapath logging configuration for this load balancer.
   *
   * @return the datapath
   */
  public LoadBalancerLoggingDatapathPrototype datapath() {
    return datapath;
  }
}

