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

/**
 * NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.
 */
public class NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext extends NetworkInterfaceIPPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;
    private Boolean autoDelete;
    private String name;

    /**
     * Instantiates a new Builder from an existing NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext instance.
     *
     * @param networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContext the instance to initialize the Builder with
     */
    public Builder(NetworkInterfaceIPPrototype networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContext) {
      this.address = networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContext.address;
      this.autoDelete = networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContext.autoDelete;
      this.name = networkInterfaceIpPrototypeReservedIpPrototypeNetworkInterfaceContext.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.
     *
     * @return the new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext instance
     */
    public NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext build() {
      return new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext() { }

  protected NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext(Builder builder) {
    address = builder.address;
    autoDelete = builder.autoDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

