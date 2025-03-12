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
 * ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype.
 */
public class ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype extends ClusterNetworkSubnetPrototype {

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
    private String ipv4CidrBlock;

    /**
     * Instantiates a new Builder from an existing ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype instance.
     *
     * @param clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototype the instance to initialize the Builder with
     */
    public Builder(ClusterNetworkSubnetPrototype clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototype) {
      this.ipVersion = clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototype.ipVersion;
      this.name = clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototype.name;
      this.ipv4CidrBlock = clusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CidrBlockPrototype.ipv4CidrBlock;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ipv4CidrBlock the ipv4CidrBlock
     */
    public Builder(String ipv4CidrBlock) {
      this.ipv4CidrBlock = ipv4CidrBlock;
    }

    /**
     * Builds a ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype.
     *
     * @return the new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype instance
     */
    public ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype build() {
      return new ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype(this);
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the ipv4CidrBlock.
     *
     * @param ipv4CidrBlock the ipv4CidrBlock
     * @return the ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype builder
     */
    public Builder ipv4CidrBlock(String ipv4CidrBlock) {
      this.ipv4CidrBlock = ipv4CidrBlock;
      return this;
    }
  }

  protected ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype() { }

  protected ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ipv4CidrBlock,
      "ipv4CidrBlock cannot be null");
    ipVersion = builder.ipVersion;
    name = builder.name;
    ipv4CidrBlock = builder.ipv4CidrBlock;
  }

  /**
   * New builder.
   *
   * @return a ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

