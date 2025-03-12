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
 * VPNGatewayConnectionStaticRouteModeTunnel.
 */
public class VPNGatewayConnectionStaticRouteModeTunnel extends GenericModel {

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
}

