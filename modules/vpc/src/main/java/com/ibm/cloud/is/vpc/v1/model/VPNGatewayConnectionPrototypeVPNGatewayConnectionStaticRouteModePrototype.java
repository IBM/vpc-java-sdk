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

/**
 * VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.
 */
public class VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype extends VPNGatewayConnectionPrototype {

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
    private VPNGatewayConnectionDPDPrototype deadPeerDetection;
    private VPNGatewayConnectionIKEPolicyPrototype ikePolicy;
    private VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy;
    private String name;
    private String peerAddress;
    private String psk;
    private String routingProtocol;

    public Builder(VPNGatewayConnectionPrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype) {
      this.adminStateUp = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.adminStateUp;
      this.deadPeerDetection = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.deadPeerDetection;
      this.ikePolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.ipsecPolicy;
      this.name = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.name;
      this.peerAddress = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.peerAddress;
      this.psk = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.psk;
      this.routingProtocol = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.routingProtocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param peerAddress the peerAddress
     * @param psk the psk
     */
    public Builder(String peerAddress, String psk) {
      this.peerAddress = peerAddress;
      this.psk = psk;
    }

    /**
     * Builds a VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.
     *
     * @return the new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype instance
     */
    public VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype build() {
      return new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype(this);
    }

    /**
     * Set the adminStateUp.
     *
     * @param adminStateUp the adminStateUp
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder adminStateUp(Boolean adminStateUp) {
      this.adminStateUp = adminStateUp;
      return this;
    }

    /**
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPrototype deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder ikePolicy(VPNGatewayConnectionIKEPolicyPrototype ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder ipsecPolicy(VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the peerAddress.
     *
     * @param peerAddress the peerAddress
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder peerAddress(String peerAddress) {
      this.peerAddress = peerAddress;
      return this;
    }

    /**
     * Set the psk.
     *
     * @param psk the psk
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder psk(String psk) {
      this.psk = psk;
      return this;
    }

    /**
     * Set the routingProtocol.
     *
     * @param routingProtocol the routingProtocol
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder routingProtocol(String routingProtocol) {
      this.routingProtocol = routingProtocol;
      return this;
    }
  }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peerAddress,
      "peerAddress cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.psk,
      "psk cannot be null");
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
   * @return a VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

