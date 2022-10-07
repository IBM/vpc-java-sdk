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
 * EndpointGatewayReservedIPReservedIPPrototypeTargetContext.
 */
public class EndpointGatewayReservedIPReservedIPPrototypeTargetContext extends EndpointGatewayReservedIP {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;
    private Boolean autoDelete;
    private String name;
    private SubnetIdentity subnet;

    /**
     * Instantiates a new Builder from an existing EndpointGatewayReservedIPReservedIPPrototypeTargetContext instance.
     *
     * @param endpointGatewayReservedIpReservedIpPrototypeTargetContext the instance to initialize the Builder with
     */
    public Builder(EndpointGatewayReservedIP endpointGatewayReservedIpReservedIpPrototypeTargetContext) {
      this.address = endpointGatewayReservedIpReservedIpPrototypeTargetContext.address;
      this.autoDelete = endpointGatewayReservedIpReservedIpPrototypeTargetContext.autoDelete;
      this.name = endpointGatewayReservedIpReservedIpPrototypeTargetContext.name;
      this.subnet = endpointGatewayReservedIpReservedIpPrototypeTargetContext.subnet;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnet the subnet
     */
    public Builder(SubnetIdentity subnet) {
      this.subnet = subnet;
    }

    /**
     * Builds a EndpointGatewayReservedIPReservedIPPrototypeTargetContext.
     *
     * @return the new EndpointGatewayReservedIPReservedIPPrototypeTargetContext instance
     */
    public EndpointGatewayReservedIPReservedIPPrototypeTargetContext build() {
      return new EndpointGatewayReservedIPReservedIPPrototypeTargetContext(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the EndpointGatewayReservedIPReservedIPPrototypeTargetContext builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the EndpointGatewayReservedIPReservedIPPrototypeTargetContext builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EndpointGatewayReservedIPReservedIPPrototypeTargetContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the EndpointGatewayReservedIPReservedIPPrototypeTargetContext builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }
  }

  protected EndpointGatewayReservedIPReservedIPPrototypeTargetContext() { }

  protected EndpointGatewayReservedIPReservedIPPrototypeTargetContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    address = builder.address;
    autoDelete = builder.autoDelete;
    name = builder.name;
    subnet = builder.subnet;
  }

  /**
   * New builder.
   *
   * @return a EndpointGatewayReservedIPReservedIPPrototypeTargetContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

