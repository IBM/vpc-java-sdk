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

/**
 * ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.
 */
public class ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype extends ClusterNetworkSubnetPrototype {

  /**
   * The IP version(s) to support for this cluster network subnet.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String ipVersion;
    private String name;
    private Long totalIpv4AddressCount;

    /**
     * Instantiates a new Builder from an existing ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype instance.
     *
     * @param clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype the instance to initialize the Builder with
     */
    public Builder(ClusterNetworkSubnetPrototype clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype) {
      this.ipVersion = clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.ipVersion;
      this.name = clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.name;
      this.totalIpv4AddressCount = clusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.totalIpv4AddressCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param totalIpv4AddressCount the totalIpv4AddressCount
     */
    public Builder(Long totalIpv4AddressCount) {
      this.totalIpv4AddressCount = totalIpv4AddressCount;
    }

    /**
     * Builds a ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype.
     *
     * @return the new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype instance
     */
    public ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype build() {
      return new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype(this);
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the totalIpv4AddressCount.
     *
     * @param totalIpv4AddressCount the totalIpv4AddressCount
     * @return the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype builder
     */
    public Builder totalIpv4AddressCount(long totalIpv4AddressCount) {
      this.totalIpv4AddressCount = totalIpv4AddressCount;
      return this;
    }
  }

  protected ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype() { }

  protected ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.totalIpv4AddressCount,
      "totalIpv4AddressCount cannot be null");
    ipVersion = builder.ipVersion;
    name = builder.name;
    totalIpv4AddressCount = builder.totalIpv4AddressCount;
  }

  /**
   * New builder.
   *
   * @return a ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

