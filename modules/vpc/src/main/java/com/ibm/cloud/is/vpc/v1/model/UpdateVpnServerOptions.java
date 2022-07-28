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
 * The updateVpnServer options.
 */
public class UpdateVpnServerOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> vpnServerPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> vpnServerPatch;
    private String ifMatch;

    private Builder(UpdateVpnServerOptions updateVpnServerOptions) {
      this.id = updateVpnServerOptions.id;
      this.vpnServerPatch = updateVpnServerOptions.vpnServerPatch;
      this.ifMatch = updateVpnServerOptions.ifMatch;
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
     * @param vpnServerPatch the vpnServerPatch
     */
    public Builder(String id, Map<String, Object> vpnServerPatch) {
      this.id = id;
      this.vpnServerPatch = vpnServerPatch;
    }

    /**
     * Builds a UpdateVpnServerOptions.
     *
     * @return the new UpdateVpnServerOptions instance
     */
    public UpdateVpnServerOptions build() {
      return new UpdateVpnServerOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpnServerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the vpnServerPatch.
     *
     * @param vpnServerPatch the vpnServerPatch
     * @return the UpdateVpnServerOptions builder
     */
    public Builder vpnServerPatch(Map<String, Object> vpnServerPatch) {
      this.vpnServerPatch = vpnServerPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateVpnServerOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateVpnServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpnServerPatch,
      "vpnServerPatch cannot be null");
    id = builder.id;
    vpnServerPatch = builder.vpnServerPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpnServerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The VPN server identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the vpnServerPatch.
   *
   * The VPN server patch.
   *
   * @return the vpnServerPatch
   */
  public Map<String, Object> vpnServerPatch() {
    return vpnServerPatch;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

