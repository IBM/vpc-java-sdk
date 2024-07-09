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
 * VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.
 */
public class VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress extends VPNGatewayConnectionStaticRouteModePeerPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private VPNGatewayConnectionIKEIdentityPrototype ikeIdentity;
    private String address;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress instance.
     *
     * @param vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionStaticRouteModePeerPrototype vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress) {
      this.ikeIdentity = vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress.ikeIdentity;
      this.address = vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress.address;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param address the address
     */
    public Builder(String address) {
      this.address = address;
    }

    /**
     * Builds a VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.
     *
     * @return the new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress instance
     */
    public VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress build() {
      return new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress(this);
    }

    /**
     * Set the ikeIdentity.
     *
     * @param ikeIdentity the ikeIdentity
     * @return the VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress builder
     */
    public Builder ikeIdentity(VPNGatewayConnectionIKEIdentityPrototype ikeIdentity) {
      this.ikeIdentity = ikeIdentity;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  protected VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress() { }

  protected VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.address,
      "address cannot be null");
    ikeIdentity = builder.ikeIdentity;
    address = builder.address;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

