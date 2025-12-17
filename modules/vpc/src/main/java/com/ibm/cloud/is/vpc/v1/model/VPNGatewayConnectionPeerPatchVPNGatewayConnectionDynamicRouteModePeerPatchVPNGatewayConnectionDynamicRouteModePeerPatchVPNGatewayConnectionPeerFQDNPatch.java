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
 * VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch.
 */
public class VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch extends VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private Long asn;
    private String fqdn;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch instance.
     *
     * @param vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatch the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatch vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatch) {
      this.asn = vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatch.asn;
      this.fqdn = vpnGatewayConnectionPeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionDynamicRouteModePeerPatchVpnGatewayConnectionPeerFqdnPatch.fqdn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch.
     *
     * @return the new VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch instance
     */
    public VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch build() {
      return new VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch(this);
    }

    /**
     * Set the asn.
     *
     * @param asn the asn
     * @return the VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch builder
     */
    public Builder asn(long asn) {
      this.asn = asn;
      return this;
    }

    /**
     * Set the fqdn.
     *
     * @param fqdn the fqdn
     * @return the VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch builder
     */
    public Builder fqdn(String fqdn) {
      this.fqdn = fqdn;
      return this;
    }
  }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch() { }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch(Builder builder) {
    asn = builder.asn;
    fqdn = builder.fqdn;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionDynamicRouteModePeerPatchVPNGatewayConnectionPeerFQDNPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

