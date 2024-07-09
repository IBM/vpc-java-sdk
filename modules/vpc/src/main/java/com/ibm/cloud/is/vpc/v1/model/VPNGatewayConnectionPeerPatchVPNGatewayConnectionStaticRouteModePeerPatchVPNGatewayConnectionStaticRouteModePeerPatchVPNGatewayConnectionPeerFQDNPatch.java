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
 * VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch.
 */
public class VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch extends VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String fqdn;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch instance.
     *
     * @param vpnGatewayConnectionPeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatch the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatch vpnGatewayConnectionPeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatch) {
      this.fqdn = vpnGatewayConnectionPeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionStaticRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatch.fqdn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch.
     *
     * @return the new VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch instance
     */
    public VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch build() {
      return new VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch(this);
    }

    /**
     * Set the fqdn.
     *
     * @param fqdn the fqdn
     * @return the VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch builder
     */
    public Builder fqdn(String fqdn) {
      this.fqdn = fqdn;
      return this;
    }
  }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch() { }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch(Builder builder) {
    fqdn = builder.fqdn;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionStaticRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

