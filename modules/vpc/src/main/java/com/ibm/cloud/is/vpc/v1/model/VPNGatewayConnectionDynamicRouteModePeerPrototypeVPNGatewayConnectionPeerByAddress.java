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

/**
 * VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.
 */
public class VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress extends VPNGatewayConnectionDynamicRouteModePeerPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Long asn;
    private VPNGatewayConnectionIKEIdentityPrototype ikeIdentity;
    private String address;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress instance.
     *
     * @param vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionDynamicRouteModePeerPrototype vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress) {
      this.asn = vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress.asn;
      this.ikeIdentity = vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress.ikeIdentity;
      this.address = vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByAddress.address;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param asn the asn
     * @param address the address
     */
    public Builder(Long asn, String address) {
      this.asn = asn;
      this.address = address;
    }

    /**
     * Builds a VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress.
     *
     * @return the new VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress instance
     */
    public VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress build() {
      return new VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress(this);
    }

    /**
     * Set the asn.
     *
     * @param asn the asn
     * @return the VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress builder
     */
    public Builder asn(long asn) {
      this.asn = asn;
      return this;
    }

    /**
     * Set the ikeIdentity.
     *
     * @param ikeIdentity the ikeIdentity
     * @return the VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress builder
     */
    public Builder ikeIdentity(VPNGatewayConnectionIKEIdentityPrototype ikeIdentity) {
      this.ikeIdentity = ikeIdentity;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  protected VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress() { }

  protected VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.asn,
      "asn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.address,
      "address cannot be null");
    asn = builder.asn;
    ikeIdentity = builder.ikeIdentity;
    address = builder.address;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByAddress builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

