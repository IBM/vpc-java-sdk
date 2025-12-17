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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionPrototype.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype
 * - VPNGatewayConnectionPrototypeVPNGatewayConnectionDynamicRouteModePrototype
 * - VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype
 */
public class VPNGatewayConnectionPrototype extends GenericModel {

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

  @SerializedName("admin_state_up")
  protected Boolean adminStateUp;
  @SerializedName("dead_peer_detection")
  protected VPNGatewayConnectionDPDPrototype deadPeerDetection;
  @SerializedName("establish_mode")
  protected String establishMode;
  @SerializedName("ike_policy")
  protected VPNGatewayConnectionIKEPolicyPrototype ikePolicy;
  @SerializedName("ipsec_policy")
  protected VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy;
  protected String name;
  protected String psk;
  protected VPNGatewayConnectionLocalPrototype local;
  protected VPNGatewayConnectionPeerPrototype peer;
  @SerializedName("distribute_traffic")
  protected Boolean distributeTraffic;
  @SerializedName("routing_protocol")
  protected String routingProtocol;
  protected List<VPNGatewayConnectionTunnelPrototype> tunnels;

  protected VPNGatewayConnectionPrototype() { }

  /**
   * Gets the adminStateUp.
   *
   * If set to false, the VPN gateway connection is shut down.
   *
   * @return the adminStateUp
   */
  public Boolean adminStateUp() {
    return adminStateUp;
  }

  /**
   * Gets the deadPeerDetection.
   *
   * The dead peer detection configuration.
   *
   * @return the deadPeerDetection
   */
  public VPNGatewayConnectionDPDPrototype deadPeerDetection() {
    return deadPeerDetection;
  }

  /**
   * Gets the establishMode.
   *
   * The establish mode of the VPN gateway connection:
   * - `bidirectional`: Either side of the VPN gateway can initiate IKE protocol
   *    negotiations or rekeying processes.
   * - `peer_only`: Only the peer can initiate IKE protocol negotiations for this VPN gateway
   *    connection. Additionally, the peer is responsible for initiating the rekeying process
   *    after the connection is established. If rekeying does not occur, the VPN gateway
   *    connection will be brought down after its lifetime expires.
   *
   * @return the establishMode
   */
  public String establishMode() {
    return establishMode;
  }

  /**
   * Gets the ikePolicy.
   *
   * The IKE policy to use. If unspecified, [auto-negotiation will be
   * used](https://cloud.ibm.com/docs/vpc?topic=vpc-using-vpn&amp;interface=ui#ike-auto-negotiation-phase-1).
   *
   * @return the ikePolicy
   */
  public VPNGatewayConnectionIKEPolicyPrototype ikePolicy() {
    return ikePolicy;
  }

  /**
   * Gets the ipsecPolicy.
   *
   * The IPsec policy to use. If unspecified, [auto-negotiation will be
   * used](https://cloud.ibm.com/docs/vpc?topic=vpc-using-vpn&amp;interface=ui#ipsec-auto-negotiation-phase-2).
   *
   * @return the ipsecPolicy
   */
  public VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy() {
    return ipsecPolicy;
  }

  /**
   * Gets the name.
   *
   * The name for this VPN gateway connection. The name must not be used by another connection for the VPN gateway. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the psk.
   *
   * The pre-shared key.
   *
   * @return the psk
   */
  public String psk() {
    return psk;
  }

  /**
   * Gets the distributeTraffic.
   *
   * Indicates whether the traffic is distributed between the `up` tunnels of the VPN gateway connection when the VPC
   * route's next hop is a VPN connection. If `false`, the traffic is only routed through the `up` tunnel with the lower
   * `public_ip` address. Before enabling it on VPN connections to on-prem private networks, review
   * [distributing traffic
   * restrictions](https://cloud.ibm.com/docs/vpc?topic=vpc-vpn-limitations#distributing-traffic-restrictions).
   *
   * @return the distributeTraffic
   */
  public Boolean distributeTraffic() {
    return distributeTraffic;
  }

  /**
   * Gets the local.
   *
   * @return the local
   */
  public VPNGatewayConnectionLocalPrototype local() {
    return local;
  }

  /**
   * Gets the peer.
   *
   * @return the peer
   */
  public VPNGatewayConnectionPeerPrototype peer() {
    return peer;
  }

  /**
   * Gets the routingProtocol.
   *
   * The routing protocol for this VPN gateway connection.
   *
   * @return the routingProtocol
   */
  public String routingProtocol() {
    return routingProtocol;
  }

  /**
   * Gets the tunnels.
   *
   * The VPN tunnel configuration to use for this VPN gateway connection
   * (in dynamic route mode).
   *
   * @return the tunnels
   */
  public List<VPNGatewayConnectionTunnelPrototype> tunnels() {
    return tunnels;
  }
}

