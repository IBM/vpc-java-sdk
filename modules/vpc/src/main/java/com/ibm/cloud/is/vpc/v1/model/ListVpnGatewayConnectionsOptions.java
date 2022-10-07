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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listVpnGatewayConnections options.
 */
public class ListVpnGatewayConnectionsOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String status;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String status;

    /**
     * Instantiates a new Builder from an existing ListVpnGatewayConnectionsOptions instance.
     *
     * @param listVpnGatewayConnectionsOptions the instance to initialize the Builder with
     */
    private Builder(ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptions) {
      this.vpnGatewayId = listVpnGatewayConnectionsOptions.vpnGatewayId;
      this.status = listVpnGatewayConnectionsOptions.status;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpnGatewayId the vpnGatewayId
     */
    public Builder(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
    }

    /**
     * Builds a ListVpnGatewayConnectionsOptions.
     *
     * @return the new ListVpnGatewayConnectionsOptions instance
     */
    public ListVpnGatewayConnectionsOptions build() {
      return new ListVpnGatewayConnectionsOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the ListVpnGatewayConnectionsOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ListVpnGatewayConnectionsOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }
  }

  protected ListVpnGatewayConnectionsOptions() { }

  protected ListVpnGatewayConnectionsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    vpnGatewayId = builder.vpnGatewayId;
    status = builder.status;
  }

  /**
   * New builder.
   *
   * @return a ListVpnGatewayConnectionsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpnGatewayId.
   *
   * The VPN gateway identifier.
   *
   * @return the vpnGatewayId
   */
  public String vpnGatewayId() {
    return vpnGatewayId;
  }

  /**
   * Gets the status.
   *
   * Filters the collection to VPN gateway connections with the specified status.
   *
   * @return the status
   */
  public String status() {
    return status;
  }
}

