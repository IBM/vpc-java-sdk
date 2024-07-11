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
 * VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch.
 */
public class VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch extends VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch instance.
     *
     * @param vpnGatewayConnectionPeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPeerAddressPatch the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatch vpnGatewayConnectionPeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPeerAddressPatch) {
      this.address = vpnGatewayConnectionPeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPolicyModePeerPatchVpnGatewayConnectionPeerAddressPatch.address;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch.
     *
     * @return the new VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch instance
     */
    public VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch build() {
      return new VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch() { }

  protected VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch(Builder builder) {
    address = builder.address;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPolicyModePeerPatchVPNGatewayConnectionPeerAddressPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

