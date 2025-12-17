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
 * VPNGatewayConnectionTunnelPrototype.
 */
public class VPNGatewayConnectionTunnelPrototype extends GenericModel {

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
     * Instantiates a new Builder from an existing VPNGatewayConnectionTunnelPrototype instance.
     *
     * @param vpnGatewayConnectionTunnelPrototype the instance to initialize the Builder with
     */
    private Builder(VPNGatewayConnectionTunnelPrototype vpnGatewayConnectionTunnelPrototype) {
      this.neighborIp = vpnGatewayConnectionTunnelPrototype.neighborIp;
      this.tunnelInterfaceIp = vpnGatewayConnectionTunnelPrototype.tunnelInterfaceIp;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param neighborIp the neighborIp
     * @param tunnelInterfaceIp the tunnelInterfaceIp
     */
    public Builder(IP neighborIp, IP tunnelInterfaceIp) {
      this.neighborIp = neighborIp;
      this.tunnelInterfaceIp = tunnelInterfaceIp;
    }

    /**
     * Builds a VPNGatewayConnectionTunnelPrototype.
     *
     * @return the new VPNGatewayConnectionTunnelPrototype instance
     */
    public VPNGatewayConnectionTunnelPrototype build() {
      return new VPNGatewayConnectionTunnelPrototype(this);
    }

    /**
     * Set the neighborIp.
     *
     * @param neighborIp the neighborIp
     * @return the VPNGatewayConnectionTunnelPrototype builder
     */
    public Builder neighborIp(IP neighborIp) {
      this.neighborIp = neighborIp;
      return this;
    }

    /**
     * Set the tunnelInterfaceIp.
     *
     * @param tunnelInterfaceIp the tunnelInterfaceIp
     * @return the VPNGatewayConnectionTunnelPrototype builder
     */
    public Builder tunnelInterfaceIp(IP tunnelInterfaceIp) {
      this.tunnelInterfaceIp = tunnelInterfaceIp;
      return this;
    }
  }

  protected VPNGatewayConnectionTunnelPrototype() { }

  protected VPNGatewayConnectionTunnelPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.neighborIp,
      "neighborIp cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tunnelInterfaceIp,
      "tunnelInterfaceIp cannot be null");
    neighborIp = builder.neighborIp;
    tunnelInterfaceIp = builder.tunnelInterfaceIp;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionTunnelPrototype builder
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

