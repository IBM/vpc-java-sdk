/*
 * (C) Copyright IBM Corp. 2025.
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
   * The establish mode of the VPN gateway connection:
   * - `bidirectional`: Either side of the VPN gateway can initiate IKE protocol
   *    negotiations or rekeying processes.
   * - `peer_only`: Only the peer can initiate IKE protocol negotiations for this VPN gateway
   *    connection. Additionally, the peer is responsible for initiating the rekeying process
   *    after the connection is established. If rekeying does not occur, the VPN gateway
   *    connection will be brought down after its lifetime expires.
   */
  public interface EstablishMode {
    /** bidirectional. */
    String BIDIRECTIONAL = "bidirectional";
    /** peer_only. */
    String PEER_ONLY = "peer_only";
  }

  /**
   * The routing protocol for this VPN gateway connection.
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
    private String establishMode;
    private VPNGatewayConnectionIKEPolicyPrototype ikePolicy;
    private VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy;
    private String name;
    private String psk;
    private Boolean distributeTraffic;
    private VPNGatewayConnectionStaticRouteModeLocalPrototype local;
    private VPNGatewayConnectionStaticRouteModePeerPrototype peer;
    private String routingProtocol;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype instance.
     *
     * @param vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype) {
      this.adminStateUp = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.adminStateUp;
      this.deadPeerDetection = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.deadPeerDetection;
      this.establishMode = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.establishMode;
      this.ikePolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.ipsecPolicy;
      this.name = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.name;
      this.psk = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.psk;
      this.distributeTraffic = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.distributeTraffic;
      this.local = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.local;
      this.peer = vpnGatewayConnectionPrototypeVpnGatewayConnectionStaticRouteModePrototype.peer;
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
     * @param psk the psk
     * @param peer the peer
     */
    public Builder(String psk, VPNGatewayConnectionStaticRouteModePeerPrototype peer) {
      this.psk = psk;
      this.peer = peer;
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
     * Set the establishMode.
     *
     * @param establishMode the establishMode
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder establishMode(String establishMode) {
      this.establishMode = establishMode;
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
     * Set the distributeTraffic.
     *
     * @param distributeTraffic the distributeTraffic
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder distributeTraffic(Boolean distributeTraffic) {
      this.distributeTraffic = distributeTraffic;
      return this;
    }

    /**
     * Set the local.
     *
     * @param local the local
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder local(VPNGatewayConnectionStaticRouteModeLocalPrototype local) {
      this.local = local;
      return this;
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype builder
     */
    public Builder peer(VPNGatewayConnectionStaticRouteModePeerPrototype peer) {
      this.peer = peer;
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

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype() { }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.psk,
      "psk cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peer,
      "peer cannot be null");
    adminStateUp = builder.adminStateUp;
    deadPeerDetection = builder.deadPeerDetection;
    establishMode = builder.establishMode;
    ikePolicy = builder.ikePolicy;
    ipsecPolicy = builder.ipsecPolicy;
    name = builder.name;
    psk = builder.psk;
    distributeTraffic = builder.distributeTraffic;
    local = builder.local;
    peer = builder.peer;
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

