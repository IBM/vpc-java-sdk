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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listVpnGatewayAdvertisedCidrs options.
 */
public class ListVpnGatewayAdvertisedCidrsOptions extends GenericModel {

  protected String vpnGatewayId;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;

    /**
     * Instantiates a new Builder from an existing ListVpnGatewayAdvertisedCidrsOptions instance.
     *
     * @param listVpnGatewayAdvertisedCidrsOptions the instance to initialize the Builder with
     */
    private Builder(ListVpnGatewayAdvertisedCidrsOptions listVpnGatewayAdvertisedCidrsOptions) {
      this.vpnGatewayId = listVpnGatewayAdvertisedCidrsOptions.vpnGatewayId;
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
     * Builds a ListVpnGatewayAdvertisedCidrsOptions.
     *
     * @return the new ListVpnGatewayAdvertisedCidrsOptions instance
     */
    public ListVpnGatewayAdvertisedCidrsOptions build() {
      return new ListVpnGatewayAdvertisedCidrsOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the ListVpnGatewayAdvertisedCidrsOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }
  }

  protected ListVpnGatewayAdvertisedCidrsOptions() { }

  protected ListVpnGatewayAdvertisedCidrsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    vpnGatewayId = builder.vpnGatewayId;
  }

  /**
   * New builder.
   *
   * @return a ListVpnGatewayAdvertisedCidrsOptions builder
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
}

