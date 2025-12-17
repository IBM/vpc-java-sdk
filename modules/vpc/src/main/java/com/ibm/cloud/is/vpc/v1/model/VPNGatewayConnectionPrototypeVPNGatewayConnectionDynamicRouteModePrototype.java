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

import java.util.ArrayList;
import java.util.List;

/**
 * VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype.
 */
public class VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype extends VPNGatewayConnectionPrototype {

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
    /** bgp. */
    String BGP = "bgp";
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
    private VPNGatewayConnectionDynamicRouteModeLocalPrototype local;
    private VPNGatewayConnectionDynamicRouteModePeerPrototype peer;
    private String routingProtocol;
    private List<VPNGatewayConnectionTunnelPrototype> tunnels;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype instance.
     *
     * @param vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype) {
      this.adminStateUp = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.adminStateUp;
      this.deadPeerDetection = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.deadPeerDetection;
      this.establishMode = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.establishMode;
      this.ikePolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.ipsecPolicy;
      this.name = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.name;
      this.psk = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.psk;
      this.distributeTraffic = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.distributeTraffic;
      this.local = (VPNGatewayConnectionDynamicRouteModeLocalPrototype) vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.local;
      this.peer = (VPNGatewayConnectionDynamicRouteModePeerPrototype) vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.peer;
      this.routingProtocol = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.routingProtocol;
      this.tunnels = vpnGatewayConnectionPrototypeVpnGatewayConnectionDynamicRouteModePrototype.tunnels;
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
     * @param routingProtocol the routingProtocol
     * @param tunnels the tunnels
     */
    public Builder(String psk, VPNGatewayConnectionDynamicRouteModePeerPrototype peer, String routingProtocol, List<VPNGatewayConnectionTunnelPrototype> tunnels) {
      this.psk = psk;
      this.peer = peer;
      this.routingProtocol = routingProtocol;
      this.tunnels = tunnels;
    }

    /**
     * Builds a VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype.
     *
     * @return the new VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype instance
     */
    public VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype build() {
      return new VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype(this);
    }

    /**
     * Adds a new element to tunnels.
     *
     * @param tunnels the new element to be added
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder addTunnels(VPNGatewayConnectionTunnelPrototype tunnels) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tunnels,
        "tunnels cannot be null");
      if (this.tunnels == null) {
        this.tunnels = new ArrayList<VPNGatewayConnectionTunnelPrototype>();
      }
      this.tunnels.add(tunnels);
      return this;
    }

    /**
     * Set the adminStateUp.
     *
     * @param adminStateUp the adminStateUp
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder adminStateUp(Boolean adminStateUp) {
      this.adminStateUp = adminStateUp;
      return this;
    }

    /**
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPrototype deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the establishMode.
     *
     * @param establishMode the establishMode
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder establishMode(String establishMode) {
      this.establishMode = establishMode;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder ikePolicy(VPNGatewayConnectionIKEPolicyPrototype ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder ipsecPolicy(VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the psk.
     *
     * @param psk the psk
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder psk(String psk) {
      this.psk = psk;
      return this;
    }

    /**
     * Set the distributeTraffic.
     *
     * @param distributeTraffic the distributeTraffic
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder distributeTraffic(Boolean distributeTraffic) {
      this.distributeTraffic = distributeTraffic;
      return this;
    }

    /**
     * Set the local.
     *
     * @param local the local
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder local(VPNGatewayConnectionDynamicRouteModeLocalPrototype local) {
      this.local = local;
      return this;
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder peer(VPNGatewayConnectionDynamicRouteModePeerPrototype peer) {
      this.peer = peer;
      return this;
    }

    /**
     * Set the routingProtocol.
     *
     * @param routingProtocol the routingProtocol
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder routingProtocol(String routingProtocol) {
      this.routingProtocol = routingProtocol;
      return this;
    }

    /**
     * Set the tunnels.
     * Existing tunnels will be replaced.
     *
     * @param tunnels the tunnels
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
     */
    public Builder tunnels(List<VPNGatewayConnectionTunnelPrototype> tunnels) {
      this.tunnels = tunnels;
      return this;
    }
  }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype() { }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.psk,
      "psk cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peer,
      "peer cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.routingProtocol,
      "routingProtocol cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tunnels,
      "tunnels cannot be null");
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
    tunnels = builder.tunnels;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

