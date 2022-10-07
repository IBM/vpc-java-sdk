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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnection.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionStaticRouteMode
 * - VPNGatewayConnectionPolicyMode
 */
public class VPNGatewayConnection extends GenericModel {

  /**
   * The authentication mode. Only `psk` is currently supported.
   */
  public interface AuthenticationMode {
    /** psk. */
    String PSK = "psk";
  }

  /**
   * The mode of the VPN gateway.
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
  protected String href;
  protected String id;
  @SerializedName("ike_policy")
  protected IKEPolicyReference ikePolicy;
  @SerializedName("ipsec_policy")
  protected IPsecPolicyReference ipsecPolicy;
  protected String mode;
  protected String name;
  @SerializedName("peer_address")
  protected String peerAddress;
  protected String psk;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("routing_protocol")
  protected String routingProtocol;
  protected List<VPNGatewayConnectionStaticRouteModeTunnel> tunnels;
  @SerializedName("local_cidrs")
  protected List<String> localCidrs;
  @SerializedName("peer_cidrs")
  protected List<String> peerCidrs;

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
   * The authentication mode. Only `psk` is currently supported.
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
   * Gets the href.
   *
   * The VPN connection's canonical URL.
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
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this VPN gateway connection.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the peerAddress.
   *
   * The IP address of the peer VPN gateway.
   *
   * @return the peerAddress
   */
  public String getPeerAddress() {
    return peerAddress;
  }

  /**
   * Gets the psk.
   *
   * The preshared key.
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

  /**
   * Gets the localCidrs.
   *
   * The local CIDRs for this resource.
   *
   * @return the localCidrs
   */
  public List<String> getLocalCidrs() {
    return localCidrs;
  }

  /**
   * Gets the peerCidrs.
   *
   * The peer CIDRs for this resource.
   *
   * @return the peerCidrs
   */
  public List<String> getPeerCidrs() {
    return peerCidrs;
  }
}

