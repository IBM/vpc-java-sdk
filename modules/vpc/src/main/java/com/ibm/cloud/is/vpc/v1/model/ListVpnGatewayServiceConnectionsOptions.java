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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listVpnGatewayServiceConnections options.
 */
public class ListVpnGatewayServiceConnectionsOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListVpnGatewayServiceConnectionsOptions instance.
     *
     * @param listVpnGatewayServiceConnectionsOptions the instance to initialize the Builder with
     */
    private Builder(ListVpnGatewayServiceConnectionsOptions listVpnGatewayServiceConnectionsOptions) {
      this.vpnGatewayId = listVpnGatewayServiceConnectionsOptions.vpnGatewayId;
      this.start = listVpnGatewayServiceConnectionsOptions.start;
      this.limit = listVpnGatewayServiceConnectionsOptions.limit;
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
     * Builds a ListVpnGatewayServiceConnectionsOptions.
     *
     * @return the new ListVpnGatewayServiceConnectionsOptions instance
     */
    public ListVpnGatewayServiceConnectionsOptions build() {
      return new ListVpnGatewayServiceConnectionsOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the ListVpnGatewayServiceConnectionsOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVpnGatewayServiceConnectionsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVpnGatewayServiceConnectionsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListVpnGatewayServiceConnectionsOptions() { }

  protected ListVpnGatewayServiceConnectionsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    vpnGatewayId = builder.vpnGatewayId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListVpnGatewayServiceConnectionsOptions builder
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
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

