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
 * The logging configuration for this load balancer.
 */
public class LoadBalancerLogging extends GenericModel {

  protected LoadBalancerLoggingDatapath datapath;

  /**
   * Builder.
   */
  public static class Builder {
    private LoadBalancerLoggingDatapath datapath;

    private Builder(LoadBalancerLogging loadBalancerLogging) {
      this.datapath = loadBalancerLogging.datapath;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerLogging.
     *
     * @return the new LoadBalancerLogging instance
     */
    public LoadBalancerLogging build() {
      return new LoadBalancerLogging(this);
    }

    /**
     * Set the datapath.
     *
     * @param datapath the datapath
     * @return the LoadBalancerLogging builder
     */
    public Builder datapath(LoadBalancerLoggingDatapath datapath) {
      this.datapath = datapath;
      return this;
    }
  }

  protected LoadBalancerLogging(Builder builder) {
    datapath = builder.datapath;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerLogging builder
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
  public LoadBalancerLoggingDatapath datapath() {
    return datapath;
  }
}

