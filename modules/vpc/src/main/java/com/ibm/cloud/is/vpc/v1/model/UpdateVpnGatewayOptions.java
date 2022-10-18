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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateVpnGateway options.
 */
public class UpdateVpnGatewayOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> vpnGatewayPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> vpnGatewayPatch;

    /**
     * Instantiates a new Builder from an existing UpdateVpnGatewayOptions instance.
     *
     * @param updateVpnGatewayOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVpnGatewayOptions updateVpnGatewayOptions) {
      this.id = updateVpnGatewayOptions.id;
      this.vpnGatewayPatch = updateVpnGatewayOptions.vpnGatewayPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param vpnGatewayPatch the vpnGatewayPatch
     */
    public Builder(String id, Map<String, Object> vpnGatewayPatch) {
      this.id = id;
      this.vpnGatewayPatch = vpnGatewayPatch;
    }

    /**
     * Builds a UpdateVpnGatewayOptions.
     *
     * @return the new UpdateVpnGatewayOptions instance
     */
    public UpdateVpnGatewayOptions build() {
      return new UpdateVpnGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpnGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the vpnGatewayPatch.
     *
     * @param vpnGatewayPatch the vpnGatewayPatch
     * @return the UpdateVpnGatewayOptions builder
     */
    public Builder vpnGatewayPatch(Map<String, Object> vpnGatewayPatch) {
      this.vpnGatewayPatch = vpnGatewayPatch;
      return this;
    }
  }

  protected UpdateVpnGatewayOptions() { }

  protected UpdateVpnGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpnGatewayPatch,
      "vpnGatewayPatch cannot be null");
    id = builder.id;
    vpnGatewayPatch = builder.vpnGatewayPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpnGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The VPN gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the vpnGatewayPatch.
   *
   * The VPN gateway patch.
   *
   * @return the vpnGatewayPatch
   */
  public Map<String, Object> vpnGatewayPatch() {
    return vpnGatewayPatch;
  }
}

