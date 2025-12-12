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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionDynamicRouteModeTunnel.
 */
public class VPNGatewayConnectionDynamicRouteModeTunnel extends GenericModel {

  /**
   * BGP routing protocol state as defined in
   * [RFC 4721](https://www.rfc-editor.org/rfc/rfc4271#section-8.2.2).
   */
  public interface ProtocolState {
    /** active. */
    String ACTIVE = "active";
    /** connect. */
    String CONNECT = "connect";
    /** established. */
    String ESTABLISHED = "established";
    /** idle. */
    String IDLE = "idle";
    /** open_confirm. */
    String OPEN_CONFIRM = "open_confirm";
    /** open_sent. */
    String OPEN_SENT = "open_sent";
  }

  /**
   * The status of the VPN Tunnel.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** down. */
    String DOWN = "down";
    /** up. */
    String UP = "up";
  }

  @SerializedName("neighbor_ip")
  protected IP neighborIp;
  @SerializedName("protocol_state")
  protected String protocolState;
  @SerializedName("public_ip")
  protected IP publicIp;
  protected String status;
  @SerializedName("status_reasons")
  protected List<VPNGatewayConnectionTunnelStatusReason> statusReasons;
  @SerializedName("tunnel_interface_ip")
  protected IP tunnelInterfaceIp;

  protected VPNGatewayConnectionDynamicRouteModeTunnel() { }

  /**
   * Gets the neighborIp.
   *
   * The IP address of the neighbor on the virtual tunnel interface.
   * This serves as the destination address for BGP peering sessions on the peer gateway
   * within the tunnel.
   *
   * @return the neighborIp
   */
  public IP getNeighborIp() {
    return neighborIp;
  }

  /**
   * Gets the protocolState.
   *
   * BGP routing protocol state as defined in
   * [RFC 4721](https://www.rfc-editor.org/rfc/rfc4271#section-8.2.2).
   *
   * @return the protocolState
   */
  public String getProtocolState() {
    return protocolState;
  }

  /**
   * Gets the publicIp.
   *
   * The IP address of the VPN gateway member in which the tunnel resides.
   *
   * @return the publicIp
   */
  public IP getPublicIp() {
    return publicIp;
  }

  /**
   * Gets the status.
   *
   * The status of the VPN Tunnel.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current status (if any).
   *
   * @return the statusReasons
   */
  public List<VPNGatewayConnectionTunnelStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the tunnelInterfaceIp.
   *
   * The IP address assigned to the VPN gateway's virtual tunnel interface.
   * This serves as the source address for BGP peering sessions initiated from the VPN
   * gateway towards the peer gateway within the tunnel.
   *
   * @return the tunnelInterfaceIp
   */
  public IP getTunnelInterfaceIp() {
    return tunnelInterfaceIp;
  }
}

