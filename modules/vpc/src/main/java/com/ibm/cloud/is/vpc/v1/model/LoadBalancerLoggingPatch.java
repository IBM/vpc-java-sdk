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
 * LoadBalancerLoggingPatch.
 */
public class LoadBalancerLoggingPatch extends GenericModel {

  protected LoadBalancerLoggingDatapathPatch datapath;

  /**
   * Builder.
   */
  public static class Builder {
    private LoadBalancerLoggingDatapathPatch datapath;

    /**
     * Instantiates a new Builder from an existing LoadBalancerLoggingPatch instance.
     *
     * @param loadBalancerLoggingPatch the instance to initialize the Builder with
     */
    private Builder(LoadBalancerLoggingPatch loadBalancerLoggingPatch) {
      this.datapath = loadBalancerLoggingPatch.datapath;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoadBalancerLoggingPatch.
     *
     * @return the new LoadBalancerLoggingPatch instance
     */
    public LoadBalancerLoggingPatch build() {
      return new LoadBalancerLoggingPatch(this);
    }

    /**
     * Set the datapath.
     *
     * @param datapath the datapath
     * @return the LoadBalancerLoggingPatch builder
     */
    public Builder datapath(LoadBalancerLoggingDatapathPatch datapath) {
      this.datapath = datapath;
      return this;
    }
  }

  protected LoadBalancerLoggingPatch() { }

  protected LoadBalancerLoggingPatch(Builder builder) {
    datapath = builder.datapath;
  }

  /**
   * New builder.
   *
   * @return a LoadBalancerLoggingPatch builder
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
  public LoadBalancerLoggingDatapathPatch datapath() {
    return datapath;
  }
}

