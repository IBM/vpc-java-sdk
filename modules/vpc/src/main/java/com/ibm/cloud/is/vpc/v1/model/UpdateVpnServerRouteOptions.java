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
 * The updateVpnServerRoute options.
 */
public class UpdateVpnServerRouteOptions extends GenericModel {

  protected String vpnServerId;
  protected String id;
  protected Map<String, Object> vpnServerRoutePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnServerId;
    private String id;
    private Map<String, Object> vpnServerRoutePatch;

    /**
     * Instantiates a new Builder from an existing UpdateVpnServerRouteOptions instance.
     *
     * @param updateVpnServerRouteOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVpnServerRouteOptions updateVpnServerRouteOptions) {
      this.vpnServerId = updateVpnServerRouteOptions.vpnServerId;
      this.id = updateVpnServerRouteOptions.id;
      this.vpnServerRoutePatch = updateVpnServerRouteOptions.vpnServerRoutePatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpnServerId the vpnServerId
     * @param id the id
     * @param vpnServerRoutePatch the vpnServerRoutePatch
     */
    public Builder(String vpnServerId, String id, Map<String, Object> vpnServerRoutePatch) {
      this.vpnServerId = vpnServerId;
      this.id = id;
      this.vpnServerRoutePatch = vpnServerRoutePatch;
    }

    /**
     * Builds a UpdateVpnServerRouteOptions.
     *
     * @return the new UpdateVpnServerRouteOptions instance
     */
    public UpdateVpnServerRouteOptions build() {
      return new UpdateVpnServerRouteOptions(this);
    }

    /**
     * Set the vpnServerId.
     *
     * @param vpnServerId the vpnServerId
     * @return the UpdateVpnServerRouteOptions builder
     */
    public Builder vpnServerId(String vpnServerId) {
      this.vpnServerId = vpnServerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpnServerRouteOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the vpnServerRoutePatch.
     *
     * @param vpnServerRoutePatch the vpnServerRoutePatch
     * @return the UpdateVpnServerRouteOptions builder
     */
    public Builder vpnServerRoutePatch(Map<String, Object> vpnServerRoutePatch) {
      this.vpnServerRoutePatch = vpnServerRoutePatch;
      return this;
    }
  }

  protected UpdateVpnServerRouteOptions() { }

  protected UpdateVpnServerRouteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnServerId,
      "vpnServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpnServerRoutePatch,
      "vpnServerRoutePatch cannot be null");
    vpnServerId = builder.vpnServerId;
    id = builder.id;
    vpnServerRoutePatch = builder.vpnServerRoutePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpnServerRouteOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpnServerId.
   *
   * The VPN server identifier.
   *
   * @return the vpnServerId
   */
  public String vpnServerId() {
    return vpnServerId;
  }

  /**
   * Gets the id.
   *
   * The VPN route identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the vpnServerRoutePatch.
   *
   * The VPN route patch.
   *
   * @return the vpnServerRoutePatch
   */
  public Map<String, Object> vpnServerRoutePatch() {
    return vpnServerRoutePatch;
  }
}

