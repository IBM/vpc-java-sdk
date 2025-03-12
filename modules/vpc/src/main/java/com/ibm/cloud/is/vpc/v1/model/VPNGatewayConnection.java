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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnection.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionRouteMode
 * - VPNGatewayConnectionPolicyMode
 */
public class VPNGatewayConnection extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "mode";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("policy", VPNGatewayConnectionPolicyMode.class);
    discriminatorMapping.put("route", VPNGatewayConnectionRouteMode.class);
  }
  /**
   * The authentication mode.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface AuthenticationMode {
    /** psk. */
    String PSK = "psk";
  }

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
   * The mode of the VPN gateway.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Mode {
    /** policy. */
    String POLICY = "policy";
    /** route. */
    String ROUTE = "route";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** vpn_gateway_connection. */
    String VPN_GATEWAY_CONNECTION = "vpn_gateway_connection";
  }

  /**
   * The status of a VPN gateway connection.
   */
  public interface Status {
    /** down. */
    String DOWN = "down";
    /** up. */
    String UP = "up";
  }

  /**
   * Routing protocols are disabled for this VPN gateway connection.
   */
  public interface RoutingProtocol {
    /** none. */
    String NONE = "none";
  }

  @SerializedName("admin_state_up")
  protected Boolean adminStateUp;
  @SerializedName("authentication_mode")
  protected String authenticationMode;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("dead_peer_detection")
  protected VPNGatewayConnectionDPD deadPeerDetection;
  @SerializedName("establish_mode")
  protected String establishMode;
  protected String href;
  protected String id;
  @SerializedName("ike_policy")
  protected IKEPolicyReference ikePolicy;
  @SerializedName("ipsec_policy")
  protected IPsecPolicyReference ipsecPolicy;
  protected String mode;
  protected String name;
  protected String psk;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("status_reasons")
  protected List<VPNGatewayConnectionStatusReason> statusReasons;
  @SerializedName("distribute_traffic")
  protected Boolean distributeTraffic;
  protected VPNGatewayConnectionStaticRouteModeLocal local;
  protected VPNGatewayConnectionStaticRouteModePeer peer;
  @SerializedName("routing_protocol")
  protected String routingProtocol;
  protected List<VPNGatewayConnectionStaticRouteModeTunnel> tunnels;

  protected VPNGatewayConnection() { }

  /**
   * Gets the adminStateUp.
   *
   * If set to false, the VPN gateway connection is shut down.
   *
   * @return the adminStateUp
   */
  public Boolean isAdminStateUp() {
    return adminStateUp;
  }

  /**
   * Gets the authenticationMode.
   *
   * The authentication mode.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the authenticationMode
   */
  public String getAuthenticationMode() {
    return authenticationMode;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this VPN gateway connection was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the deadPeerDetection.
   *
   * The Dead Peer Detection settings.
   *
   * @return the deadPeerDetection
   */
  public VPNGatewayConnectionDPD getDeadPeerDetection() {
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
  public String getEstablishMode() {
    return establishMode;
  }

  /**
   * Gets the href.
   *
   * The URL for this VPN gateway connection.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPN gateway connection.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ikePolicy.
   *
   * The IKE policy. If absent, [auto-negotiation is
   * used](https://cloud.ibm.com/docs/vpc?topic=vpc-using-vpn&amp;interface=ui#ike-auto-negotiation-phase-1).
   *
   * @return the ikePolicy
   */
  public IKEPolicyReference getIkePolicy() {
    return ikePolicy;
  }

  /**
   * Gets the ipsecPolicy.
   *
   * The IPsec policy. If absent, [auto-negotiation is
   * used](https://cloud.ibm.com/docs/vpc?topic=vpc-using-vpn&amp;interface=ui#ipsec-auto-negotiation-phase-2).
   *
   * @return the ipsecPolicy
   */
  public IPsecPolicyReference getIpsecPolicy() {
    return ipsecPolicy;
  }

  /**
   * Gets the mode.
   *
   * The mode of the VPN gateway.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Gets the name.
   *
   * The name for this VPN gateway connection. The name is unique across all connections for the VPN gateway.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the psk.
   *
   * The pre-shared key.
   *
   * @return the psk
   */
  public String getPsk() {
    return psk;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the status.
   *
   * The status of a VPN gateway connection.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current VPN gateway connection status (if any).
   *
   * @return the statusReasons
   */
  public List<VPNGatewayConnectionStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the distributeTraffic.
   *
   * Indicates whether the traffic is distributed between the `up` tunnels of the VPN gateway connection when the VPC
   * route's next hop is a VPN connection. If `false`, the traffic is only routed through the `up` tunnel with the lower
   * `public_ip` address.
   *
   * @return the distributeTraffic
   */
  public Boolean isDistributeTraffic() {
    return distributeTraffic;
  }

  /**
   * Gets the local.
   *
   * @return the local
   */
  public VPNGatewayConnectionStaticRouteModeLocal getLocal() {
    return local;
  }

  /**
   * Gets the peer.
   *
   * @return the peer
   */
  public VPNGatewayConnectionStaticRouteModePeer getPeer() {
    return peer;
  }

  /**
   * Gets the routingProtocol.
   *
   * Routing protocols are disabled for this VPN gateway connection.
   *
   * @return the routingProtocol
   */
  public String getRoutingProtocol() {
    return routingProtocol;
  }

  /**
   * Gets the tunnels.
   *
   * The VPN tunnel configuration for this VPN gateway connection (in static route mode).
   *
   * @return the tunnels
   */
  public List<VPNGatewayConnectionStaticRouteModeTunnel> getTunnels() {
    return tunnels;
  }
}

