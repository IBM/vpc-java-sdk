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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionStaticRouteModeTunnel.
 */
public class VPNGatewayConnectionStaticRouteModeTunnel extends GenericModel {

  /**
   * The status of the VPN Tunnel.
   */
  public interface Status {
    /** down. */
    String DOWN = "down";
    /** up. */
    String UP = "up";
  }

  @SerializedName("public_ip")
  protected IP publicIp;
  protected String status;
  @SerializedName("status_reasons")
  protected List<VPNGatewayConnectionTunnelStatusReason> statusReasons;

  protected VPNGatewayConnectionStaticRouteModeTunnel() { }

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
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current VPN gateway connection tunnels status (if any):
   * - `cannot_authenticate_connection`: Failed to authenticate a connection because of
   *   mismatched IKE ID and PSK (check IKE ID and PSK in peer VPN configuration)
   * - `internal_error`: Internal error (contact IBM support)
   * - `ike_policy_mismatch`: None of the proposed IKE crypto suites was acceptable (check
   *    the IKE policies on both sides of the VPN)
   * - `ike_v1_id_local_remote_cidr_mismatch`: Invalid IKE ID or mismatched local CIDRs and
   *   remote CIDRs in IKE V1 (check the IKE ID or the local CIDRs and remote CIDRs in IKE
   *   V1 configuration)
   * - `ike_v2_local_remote_cidr_mismatch`: Mismatched local CIDRs and remote CIDRs in IKE
   *   V2 (check the local CIDRs and remote CIDRs in IKE V2 configuration)
   * - `ipsec_policy_mismatch`: None of the proposed IPsec crypto suites was acceptable
   *   (check the IPsec policies on both sides of the VPN)
   * - `peer_not_responding`: No response from peer (check network ACL configuration, peer
   *   availability, and on-premise firewall configuration)
   *
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the statusReasons
   */
  public List<VPNGatewayConnectionTunnelStatusReason> getStatusReasons() {
    return statusReasons;
  }
}

