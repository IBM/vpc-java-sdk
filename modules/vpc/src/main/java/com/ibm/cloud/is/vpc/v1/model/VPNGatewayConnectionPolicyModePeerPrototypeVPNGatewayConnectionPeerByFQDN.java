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

import java.util.ArrayList;
import java.util.List;

/**
 * VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN.
 */
public class VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN extends VPNGatewayConnectionPolicyModePeerPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> cidrs;
    private VPNGatewayConnectionIKEIdentityPrototype ikeIdentity;
    private String fqdn;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN instance.
     *
     * @param vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdn the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPolicyModePeerPrototype vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdn) {
      this.cidrs = vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdn.cidrs;
      this.ikeIdentity = vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdn.ikeIdentity;
      this.fqdn = vpnGatewayConnectionPolicyModePeerPrototypeVpnGatewayConnectionPeerByFqdn.fqdn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cidrs the cidrs
     * @param fqdn the fqdn
     */
    public Builder(List<String> cidrs, String fqdn) {
      this.cidrs = cidrs;
      this.fqdn = fqdn;
    }

    /**
     * Builds a VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN.
     *
     * @return the new VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN instance
     */
    public VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN build() {
      return new VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN(this);
    }

    /**
     * Adds a new element to cidrs.
     *
     * @param cidrs the new element to be added
     * @return the VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder addCidrs(String cidrs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(cidrs,
        "cidrs cannot be null");
      if (this.cidrs == null) {
        this.cidrs = new ArrayList<String>();
      }
      this.cidrs.add(cidrs);
      return this;
    }

    /**
     * Set the cidrs.
     * Existing cidrs will be replaced.
     *
     * @param cidrs the cidrs
     * @return the VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder cidrs(List<String> cidrs) {
      this.cidrs = cidrs;
      return this;
    }

    /**
     * Set the ikeIdentity.
     *
     * @param ikeIdentity the ikeIdentity
     * @return the VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder ikeIdentity(VPNGatewayConnectionIKEIdentityPrototype ikeIdentity) {
      this.ikeIdentity = ikeIdentity;
      return this;
    }

    /**
     * Set the fqdn.
     *
     * @param fqdn the fqdn
     * @return the VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
     */
    public Builder fqdn(String fqdn) {
      this.fqdn = fqdn;
      return this;
    }
  }

  protected VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN() { }

  protected VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrs,
      "cidrs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fqdn,
      "fqdn cannot be null");
    cidrs = builder.cidrs;
    ikeIdentity = builder.ikeIdentity;
    fqdn = builder.fqdn;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

