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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionTunnel.
 */
public class VPNGatewayConnectionTunnel extends GenericModel {

  @SerializedName("neighbor_ip")
  protected IP neighborIp;
  @SerializedName("tunnel_interface_ip")
  protected IP tunnelInterfaceIp;

  /**
   * Builder.
   */
  public static class Builder {
    private IP neighborIp;
    private IP tunnelInterfaceIp;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionTunnel instance.
     *
     * @param vpnGatewayConnectionTunnel the instance to initialize the Builder with
     */
    private Builder(VPNGatewayConnectionTunnel vpnGatewayConnectionTunnel) {
      this.neighborIp = vpnGatewayConnectionTunnel.neighborIp;
      this.tunnelInterfaceIp = vpnGatewayConnectionTunnel.tunnelInterfaceIp;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionTunnel.
     *
     * @return the new VPNGatewayConnectionTunnel instance
     */
    public VPNGatewayConnectionTunnel build() {
      return new VPNGatewayConnectionTunnel(this);
    }

    /**
     * Set the neighborIp.
     *
     * @param neighborIp the neighborIp
     * @return the VPNGatewayConnectionTunnel builder
     */
    public Builder neighborIp(IP neighborIp) {
      this.neighborIp = neighborIp;
      return this;
    }

    /**
     * Set the tunnelInterfaceIp.
     *
     * @param tunnelInterfaceIp the tunnelInterfaceIp
     * @return the VPNGatewayConnectionTunnel builder
     */
    public Builder tunnelInterfaceIp(IP tunnelInterfaceIp) {
      this.tunnelInterfaceIp = tunnelInterfaceIp;
      return this;
    }
  }

  protected VPNGatewayConnectionTunnel() { }

  protected VPNGatewayConnectionTunnel(Builder builder) {
    neighborIp = builder.neighborIp;
    tunnelInterfaceIp = builder.tunnelInterfaceIp;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionTunnel builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the neighborIp.
   *
   * The IP address of the neighbor on the virtual tunnel interface.
   * This serves as the destination address for BGP peering sessions on the peer gateway
   * within the tunnel.
   *
   * @return the neighborIp
   */
  public IP neighborIp() {
    return neighborIp;
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
  public IP tunnelInterfaceIp() {
    return tunnelInterfaceIp;
  }
}

