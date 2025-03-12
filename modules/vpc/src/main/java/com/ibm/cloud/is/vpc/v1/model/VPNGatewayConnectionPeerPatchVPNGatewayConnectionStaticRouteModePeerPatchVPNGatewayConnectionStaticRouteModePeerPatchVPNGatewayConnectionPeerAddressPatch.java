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
 * VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch.
 */
public class VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch extends VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch instance.
     *
     * @param vpnGatewayConnectionPeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionPeerAddressPatch the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatch vpnGatewayConnectionPeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionPeerAddressPatch) {
      this.address = vpnGatewayConnectionPeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionPeerAddressPatch.address;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch.
     *
     * @return the new VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch instance
     */
    public VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch build() {
      return new VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch() { }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch(Builder builder) {
    address = builder.address;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerAddressPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

