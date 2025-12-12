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

import java.util.ArrayList;
import java.util.List;

/**
 * VPNGatewayPrototypeVPNGatewayRouteModePrototype.
 */
public class VPNGatewayPrototypeVPNGatewayRouteModePrototype extends VPNGatewayPrototype {

  /**
   * The mode for this VPN gateway.
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
    private List<String> advertisedCidrs;
    private Long localAsn;
    private String mode;

    /**
     * Instantiates a new Builder from an existing VPNGatewayPrototypeVPNGatewayRouteModePrototype instance.
     *
     * @param vpnGatewayPrototypeVpnGatewayRouteModePrototype the instance to initialize the Builder with
     */
    public Builder(VPNGatewayPrototype vpnGatewayPrototypeVpnGatewayRouteModePrototype) {
      this.name = vpnGatewayPrototypeVpnGatewayRouteModePrototype.name;
      this.resourceGroup = vpnGatewayPrototypeVpnGatewayRouteModePrototype.resourceGroup;
      this.subnet = vpnGatewayPrototypeVpnGatewayRouteModePrototype.subnet;
      this.advertisedCidrs = vpnGatewayPrototypeVpnGatewayRouteModePrototype.advertisedCidrs;
      this.localAsn = vpnGatewayPrototypeVpnGatewayRouteModePrototype.localAsn;
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
     * Adds a new element to advertisedCidrs.
     *
     * @param advertisedCidrs the new element to be added
     * @return the VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
     */
    public Builder addAdvertisedCidrs(String advertisedCidrs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(advertisedCidrs,
        "advertisedCidrs cannot be null");
      if (this.advertisedCidrs == null) {
        this.advertisedCidrs = new ArrayList<String>();
      }
      this.advertisedCidrs.add(advertisedCidrs);
      return this;
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
     * Set the advertisedCidrs.
     * Existing advertisedCidrs will be replaced.
     *
     * @param advertisedCidrs the advertisedCidrs
     * @return the VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
     */
    public Builder advertisedCidrs(List<String> advertisedCidrs) {
      this.advertisedCidrs = advertisedCidrs;
      return this;
    }

    /**
     * Set the localAsn.
     *
     * @param localAsn the localAsn
     * @return the VPNGatewayPrototypeVPNGatewayRouteModePrototype builder
     */
    public Builder localAsn(long localAsn) {
      this.localAsn = localAsn;
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

  protected VPNGatewayPrototypeVPNGatewayRouteModePrototype() { }

  protected VPNGatewayPrototypeVPNGatewayRouteModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    subnet = builder.subnet;
    advertisedCidrs = builder.advertisedCidrs;
    localAsn = builder.localAsn;
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

