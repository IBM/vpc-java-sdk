/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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

import java.util.Map;

import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.
 */
public class VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch extends VPNGatewayConnectionPatch {

  /**
   * Routing protocols are disabled for this VPN gateway connection.
   */
  public interface RoutingProtocol {
    /** none. */
    String NONE = "none";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean adminStateUp;
    private VPNGatewayConnectionDPDPatch deadPeerDetection;
    private VPNGatewayConnectionIKEPolicyPatch ikePolicy;
    private VPNGatewayConnectionIPsecPolicyPatch ipsecPolicy;
    private String name;
    private String peerAddress;
    private String psk;
    private String routingProtocol;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch instance.
     *
     * @param vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPatch vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch) {
      this.adminStateUp = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.adminStateUp;
      this.deadPeerDetection = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.deadPeerDetection;
      this.ikePolicy = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.ipsecPolicy;
      this.name = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.name;
      this.peerAddress = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.peerAddress;
      this.psk = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.psk;
      this.routingProtocol = vpnGatewayConnectionPatchVpnGatewayConnectionStaticRouteModePatch.routingProtocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.
     *
     * @return the new VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch instance
     */
    public VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch build() {
      return new VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch(this);
    }

    /**
     * Set the adminStateUp.
     *
     * @param adminStateUp the adminStateUp
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder adminStateUp(Boolean adminStateUp) {
      this.adminStateUp = adminStateUp;
      return this;
    }

    /**
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPatch deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder ikePolicy(VPNGatewayConnectionIKEPolicyPatch ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder ipsecPolicy(VPNGatewayConnectionIPsecPolicyPatch ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the peerAddress.
     *
     * @param peerAddress the peerAddress
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder peerAddress(String peerAddress) {
      this.peerAddress = peerAddress;
      return this;
    }

    /**
     * Set the psk.
     *
     * @param psk the psk
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder psk(String psk) {
      this.psk = psk;
      return this;
    }

    /**
     * Set the routingProtocol.
     *
     * @param routingProtocol the routingProtocol
     * @return the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
     */
    public Builder routingProtocol(String routingProtocol) {
      this.routingProtocol = routingProtocol;
      return this;
    }
  }

  protected VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch() { }

  protected VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch(Builder builder) {
    adminStateUp = builder.adminStateUp;
    deadPeerDetection = builder.deadPeerDetection;
    ikePolicy = builder.ikePolicy;
    ipsecPolicy = builder.ipsecPolicy;
    name = builder.name;
    peerAddress = builder.peerAddress;
    psk = builder.psk;
    routingProtocol = builder.routingProtocol;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Construct a JSON merge-patch from the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.
   *
   * Note that properties of the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

