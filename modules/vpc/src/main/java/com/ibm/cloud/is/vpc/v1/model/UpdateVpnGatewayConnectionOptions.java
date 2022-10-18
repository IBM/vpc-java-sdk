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
 * The updateVpnGatewayConnection options.
 */
public class UpdateVpnGatewayConnectionOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String id;
  protected Map<String, Object> vpnGatewayConnectionPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String id;
    private Map<String, Object> vpnGatewayConnectionPatch;

    /**
     * Instantiates a new Builder from an existing UpdateVpnGatewayConnectionOptions instance.
     *
     * @param updateVpnGatewayConnectionOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptions) {
      this.vpnGatewayId = updateVpnGatewayConnectionOptions.vpnGatewayId;
      this.id = updateVpnGatewayConnectionOptions.id;
      this.vpnGatewayConnectionPatch = updateVpnGatewayConnectionOptions.vpnGatewayConnectionPatch;
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
     * @param id the id
     * @param vpnGatewayConnectionPatch the vpnGatewayConnectionPatch
     */
    public Builder(String vpnGatewayId, String id, Map<String, Object> vpnGatewayConnectionPatch) {
      this.vpnGatewayId = vpnGatewayId;
      this.id = id;
      this.vpnGatewayConnectionPatch = vpnGatewayConnectionPatch;
    }

    /**
     * Builds a UpdateVpnGatewayConnectionOptions.
     *
     * @return the new UpdateVpnGatewayConnectionOptions instance
     */
    public UpdateVpnGatewayConnectionOptions build() {
      return new UpdateVpnGatewayConnectionOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the vpnGatewayConnectionPatch.
     *
     * @param vpnGatewayConnectionPatch the vpnGatewayConnectionPatch
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder vpnGatewayConnectionPatch(Map<String, Object> vpnGatewayConnectionPatch) {
      this.vpnGatewayConnectionPatch = vpnGatewayConnectionPatch;
      return this;
    }
  }

  protected UpdateVpnGatewayConnectionOptions() { }

  protected UpdateVpnGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpnGatewayConnectionPatch,
      "vpnGatewayConnectionPatch cannot be null");
    vpnGatewayId = builder.vpnGatewayId;
    id = builder.id;
    vpnGatewayConnectionPatch = builder.vpnGatewayConnectionPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpnGatewayConnectionOptions builder
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
   * Gets the id.
   *
   * The VPN gateway connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the vpnGatewayConnectionPatch.
   *
   * The VPN gateway connection patch.
   *
   * @return the vpnGatewayConnectionPatch
   */
  public Map<String, Object> vpnGatewayConnectionPatch() {
    return vpnGatewayConnectionPatch;
  }
}

