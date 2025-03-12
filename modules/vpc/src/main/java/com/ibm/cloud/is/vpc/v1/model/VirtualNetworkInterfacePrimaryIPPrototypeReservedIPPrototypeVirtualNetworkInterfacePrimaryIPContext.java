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
 * The prototype for a new reserved IP. Requires `subnet` to be specified.
 */
public class VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext extends VirtualNetworkInterfacePrimaryIPPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;
    private Boolean autoDelete;
    private String name;

    /**
     * Instantiates a new Builder from an existing VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext instance.
     *
     * @param virtualNetworkInterfacePrimaryIpPrototypeReservedIpPrototypeVirtualNetworkInterfacePrimaryIpContext the instance to initialize the Builder with
     */
    public Builder(VirtualNetworkInterfacePrimaryIPPrototype virtualNetworkInterfacePrimaryIpPrototypeReservedIpPrototypeVirtualNetworkInterfacePrimaryIpContext) {
      this.address = virtualNetworkInterfacePrimaryIpPrototypeReservedIpPrototypeVirtualNetworkInterfacePrimaryIpContext.address;
      this.autoDelete = virtualNetworkInterfacePrimaryIpPrototypeReservedIpPrototypeVirtualNetworkInterfacePrimaryIpContext.autoDelete;
      this.name = virtualNetworkInterfacePrimaryIpPrototypeReservedIpPrototypeVirtualNetworkInterfacePrimaryIpContext.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.
     *
     * @return the new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext instance
     */
    public VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext build() {
      return new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext() { }

  protected VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext(Builder builder) {
    address = builder.address;
    autoDelete = builder.autoDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

