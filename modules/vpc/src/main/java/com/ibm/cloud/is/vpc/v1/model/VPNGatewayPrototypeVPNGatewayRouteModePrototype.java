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
 * VPNGatewayPrototypeVPNGatewayRouteModePrototype.
 */
public class VPNGatewayPrototypeVPNGatewayRouteModePrototype extends VPNGatewayPrototype {

  /**
   * Route mode VPN gateway.
   */
  public interface Mode {
    /** route. */
    String ROUTE = "route";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private SubnetIdentity subnet;
    private String mode;

    public Builder(VPNGatewayPrototype vpnGatewayPrototypeVpnGatewayRouteModePrototype) {
      this.name = vpnGatewayPrototypeVpnGatewayRouteModePrototype.name;
      this.resourceGroup = vpnGatewayPrototypeVpnGatewayRouteModePrototype.resourceGroup;
      this.subnet = vpnGatewayPrototypeVpnGatewayRouteModePrototype.subnet;
      this.mode = vpnGatewayPrototypeVpnGatewayRouteModePrototype.mode;
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
     * Builds a VPNGatewayPrototypeVPNGatewayRouteModePrototype.
     *
     * @return the new VPNGatewayPrototypeVPNGatewayRouteModePrototype instance
     */
    public VPNGatewayPrototypeVPNGatewayRouteModePrototype build() {
      return new VPNGatewayPrototypeVPNGatewayRouteModePrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected VPNGatewayPrototypeVPNGatewayRouteModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    subnet = builder.subnet;
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

