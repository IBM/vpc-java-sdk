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
 * VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN.
 */
public class VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN extends VPNGatewayConnectionStaticRouteModePeerPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private VPNGatewayConnectionIKEIdentityPrototype ikeIdentity;
    private String fqdn;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN instance.
     *
     * @param vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionStaticRouteModePeerPrototype vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn) {
      this.ikeIdentity = vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn.ikeIdentity;
      this.fqdn = vpnGatewayConnectionStaticRouteModePeerPrototypeVpnGatewayConnectionPeerByFqdn.fqdn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param fqdn the fqdn
     */
    public Builder(String fqdn) {
      this.fqdn = fqdn;
    }

    /**
     * Builds a VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN.
     *
     * @return the new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN instance
     */
    public VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN build() {
      return new VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN(this);
    }

    /**
     * Set the ikeIdentity.
     *
     * @param ikeIdentity the ikeIdentity
     * @return the VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder ikeIdentity(VPNGatewayConnectionIKEIdentityPrototype ikeIdentity) {
      this.ikeIdentity = ikeIdentity;
      return this;
    }

    /**
     * Set the fqdn.
     *
     * @param fqdn the fqdn
     * @return the VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder fqdn(String fqdn) {
      this.fqdn = fqdn;
      return this;
    }
  }

  protected VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN() { }

  protected VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fqdn,
      "fqdn cannot be null");
    ikeIdentity = builder.ikeIdentity;
    fqdn = builder.fqdn;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionStaticRouteModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

