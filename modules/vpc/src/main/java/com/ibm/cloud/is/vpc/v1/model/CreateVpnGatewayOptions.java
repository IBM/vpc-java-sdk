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
 * The createVpnGateway options.
 */
public class CreateVpnGatewayOptions extends GenericModel {

  protected VPNGatewayPrototype vpnGatewayPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private VPNGatewayPrototype vpnGatewayPrototype;

    private Builder(CreateVpnGatewayOptions createVpnGatewayOptions) {
      this.vpnGatewayPrototype = createVpnGatewayOptions.vpnGatewayPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpnGatewayPrototype the vpnGatewayPrototype
     */
    public Builder(VPNGatewayPrototype vpnGatewayPrototype) {
      this.vpnGatewayPrototype = vpnGatewayPrototype;
    }

    /**
     * Builds a CreateVpnGatewayOptions.
     *
     * @return the new CreateVpnGatewayOptions instance
     */
    public CreateVpnGatewayOptions build() {
      return new CreateVpnGatewayOptions(this);
    }

    /**
     * Set the vpnGatewayPrototype.
     *
     * @param vpnGatewayPrototype the vpnGatewayPrototype
     * @return the CreateVpnGatewayOptions builder
     */
    public Builder vpnGatewayPrototype(VPNGatewayPrototype vpnGatewayPrototype) {
      this.vpnGatewayPrototype = vpnGatewayPrototype;
      return this;
    }
  }

  protected CreateVpnGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpnGatewayPrototype,
      "vpnGatewayPrototype cannot be null");
    vpnGatewayPrototype = builder.vpnGatewayPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateVpnGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpnGatewayPrototype.
   *
   * The VPN gateway prototype object.
   *
   * @return the vpnGatewayPrototype
   */
  public VPNGatewayPrototype vpnGatewayPrototype() {
    return vpnGatewayPrototype;
  }
}

