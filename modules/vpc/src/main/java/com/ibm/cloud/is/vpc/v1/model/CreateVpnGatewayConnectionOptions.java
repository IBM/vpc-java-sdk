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
 * The createVpnGatewayConnection options.
 */
public class CreateVpnGatewayConnectionOptions extends GenericModel {

  protected String vpnGatewayId;
  protected VPNGatewayConnectionPrototype vpnGatewayConnectionPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private VPNGatewayConnectionPrototype vpnGatewayConnectionPrototype;

    private Builder(CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptions) {
      this.vpnGatewayId = createVpnGatewayConnectionOptions.vpnGatewayId;
      this.vpnGatewayConnectionPrototype = createVpnGatewayConnectionOptions.vpnGatewayConnectionPrototype;
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
     * @param vpnGatewayConnectionPrototype the vpnGatewayConnectionPrototype
     */
    public Builder(String vpnGatewayId, VPNGatewayConnectionPrototype vpnGatewayConnectionPrototype) {
      this.vpnGatewayId = vpnGatewayId;
      this.vpnGatewayConnectionPrototype = vpnGatewayConnectionPrototype;
    }

    /**
     * Builds a CreateVpnGatewayConnectionOptions.
     *
     * @return the new CreateVpnGatewayConnectionOptions instance
     */
    public CreateVpnGatewayConnectionOptions build() {
      return new CreateVpnGatewayConnectionOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the vpnGatewayConnectionPrototype.
     *
     * @param vpnGatewayConnectionPrototype the vpnGatewayConnectionPrototype
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder vpnGatewayConnectionPrototype(VPNGatewayConnectionPrototype vpnGatewayConnectionPrototype) {
      this.vpnGatewayConnectionPrototype = vpnGatewayConnectionPrototype;
      return this;
    }
  }

  protected CreateVpnGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpnGatewayConnectionPrototype,
      "vpnGatewayConnectionPrototype cannot be null");
    vpnGatewayId = builder.vpnGatewayId;
    vpnGatewayConnectionPrototype = builder.vpnGatewayConnectionPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateVpnGatewayConnectionOptions builder
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
   * Gets the vpnGatewayConnectionPrototype.
   *
   * The VPN gateway connection prototype object.
   *
   * @return the vpnGatewayConnectionPrototype
   */
  public VPNGatewayConnectionPrototype vpnGatewayConnectionPrototype() {
    return vpnGatewayConnectionPrototype;
  }
}

