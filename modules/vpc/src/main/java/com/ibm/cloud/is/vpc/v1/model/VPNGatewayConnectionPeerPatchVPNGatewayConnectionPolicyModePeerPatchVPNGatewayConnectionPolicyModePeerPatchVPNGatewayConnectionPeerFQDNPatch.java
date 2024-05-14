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
 * VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch.
 */
public class VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch extends VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String fqdn;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch instance.
     *
     * @param vpnGatewayConnectionPeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPeerFqdnPatch the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatch vpnGatewayConnectionPeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPeerFqdnPatch) {
      this.fqdn = vpnGatewayConnectionPeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPeerFqdnPatch.fqdn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch.
     *
     * @return the new VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch instance
     */
    public VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch build() {
      return new VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch(this);
    }

    /**
     * Set the fqdn.
     *
     * @param fqdn the fqdn
     * @return the VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch builder
     */
    public Builder fqdn(String fqdn) {
      this.fqdn = fqdn;
      return this;
    }
  }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch() { }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch(Builder builder) {
    fqdn = builder.fqdn;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerFQDNPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

