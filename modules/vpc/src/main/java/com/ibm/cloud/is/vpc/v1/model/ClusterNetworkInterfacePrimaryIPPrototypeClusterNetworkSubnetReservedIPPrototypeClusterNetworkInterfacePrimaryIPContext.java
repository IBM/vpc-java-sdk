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

/**
 * The prototype for a new cluster network subnet reserved IP. Requires `subnet` to be specified.
 */
public class ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext extends ClusterNetworkInterfacePrimaryIPPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;
    private Boolean autoDelete;
    private String name;

    /**
     * Instantiates a new Builder from an existing ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext instance.
     *
     * @param clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContext the instance to initialize the Builder with
     */
    public Builder(ClusterNetworkInterfacePrimaryIPPrototype clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContext) {
      this.address = clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContext.address;
      this.autoDelete = clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContext.autoDelete;
      this.name = clusterNetworkInterfacePrimaryIpPrototypeClusterNetworkSubnetReservedIpPrototypeClusterNetworkInterfacePrimaryIpContext.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext.
     *
     * @return the new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext instance
     */
    public ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext build() {
      return new ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext() { }

  protected ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext(Builder builder) {
    address = builder.address;
    autoDelete = builder.autoDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ClusterNetworkInterfacePrimaryIPPrototypeClusterNetworkSubnetReservedIPPrototypeClusterNetworkInterfacePrimaryIPContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

