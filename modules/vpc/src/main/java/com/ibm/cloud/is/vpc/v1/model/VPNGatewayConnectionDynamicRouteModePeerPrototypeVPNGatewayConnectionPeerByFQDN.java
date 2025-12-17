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
 * VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN.
 */
public class VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN extends VPNGatewayConnectionDynamicRouteModePeerPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Long asn;
    private VPNGatewayConnectionIKEIdentityPrototype ikeIdentity;
    private String fqdn;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN instance.
     *
     * @param vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionDynamicRouteModePeerPrototype vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn) {
      this.asn = vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn.asn;
      this.ikeIdentity = vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn.ikeIdentity;
      this.fqdn = vpnGatewayConnectionDynamicRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn.fqdn;
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
     * @param fqdn the fqdn
     */
    public Builder(Long asn, String fqdn) {
      this.asn = asn;
      this.fqdn = fqdn;
    }

    /**
     * Builds a VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN.
     *
     * @return the new VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN instance
     */
    public VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN build() {
      return new VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN(this);
    }

    /**
     * Set the asn.
     *
     * @param asn the asn
     * @return the VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder asn(long asn) {
      this.asn = asn;
      return this;
    }

    /**
     * Set the ikeIdentity.
     *
     * @param ikeIdentity the ikeIdentity
     * @return the VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder ikeIdentity(VPNGatewayConnectionIKEIdentityPrototype ikeIdentity) {
      this.ikeIdentity = ikeIdentity;
      return this;
    }

    /**
     * Set the fqdn.
     *
     * @param fqdn the fqdn
     * @return the VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder fqdn(String fqdn) {
      this.fqdn = fqdn;
      return this;
    }
  }

  protected VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN() { }

  protected VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.asn,
      "asn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fqdn,
      "fqdn cannot be null");
    asn = builder.asn;
    ikeIdentity = builder.ikeIdentity;
    fqdn = builder.fqdn;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionDynamicRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

