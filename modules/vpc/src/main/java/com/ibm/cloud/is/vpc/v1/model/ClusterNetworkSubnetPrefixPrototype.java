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
 * ClusterNetworkSubnetPrefixPrototype.
 */
public class ClusterNetworkSubnetPrefixPrototype extends GenericModel {

  protected String cidr;

  /**
   * Builder.
   */
  public static class Builder {
    private String cidr;

    /**
     * Instantiates a new Builder from an existing ClusterNetworkSubnetPrefixPrototype instance.
     *
     * @param clusterNetworkSubnetPrefixPrototype the instance to initialize the Builder with
     */
    private Builder(ClusterNetworkSubnetPrefixPrototype clusterNetworkSubnetPrefixPrototype) {
      this.cidr = clusterNetworkSubnetPrefixPrototype.cidr;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ClusterNetworkSubnetPrefixPrototype.
     *
     * @return the new ClusterNetworkSubnetPrefixPrototype instance
     */
    public ClusterNetworkSubnetPrefixPrototype build() {
      return new ClusterNetworkSubnetPrefixPrototype(this);
    }

    /**
     * Set the cidr.
     *
     * @param cidr the cidr
     * @return the ClusterNetworkSubnetPrefixPrototype builder
     */
    public Builder cidr(String cidr) {
      this.cidr = cidr;
      return this;
    }
  }

  protected ClusterNetworkSubnetPrefixPrototype() { }

  protected ClusterNetworkSubnetPrefixPrototype(Builder builder) {
    cidr = builder.cidr;
  }

  /**
   * New builder.
   *
   * @return a ClusterNetworkSubnetPrefixPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cidr.
   *
   * The IPv4 range of the cluster network's subnet prefix, expressed in CIDR format.
   *
   * The CIDR prefix length must be less than `/29` (at least 8 addresses).
   *
   * If a range is specified that overlaps with address prefixes in the cluster network's VPC, the operating systems of
   * any virtual server instances attaching to this cluster network must be [configured to avoid
   * conflicts](https://cloud.ibm.com/docs/vpc?topic=vpc-planning-cluster-network#advanced-consideration).
   *
   * @return the cidr
   */
  public String cidr() {
    return cidr;
  }
}

