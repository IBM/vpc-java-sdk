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
 * The getVpnServerClient options.
 */
public class GetVpnServerClientOptions extends GenericModel {

  protected String vpnServerId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnServerId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetVpnServerClientOptions instance.
     *
     * @param getVpnServerClientOptions the instance to initialize the Builder with
     */
    private Builder(GetVpnServerClientOptions getVpnServerClientOptions) {
      this.vpnServerId = getVpnServerClientOptions.vpnServerId;
      this.id = getVpnServerClientOptions.id;
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
     */
    public Builder(String vpnServerId, String id) {
      this.vpnServerId = vpnServerId;
      this.id = id;
    }

    /**
     * Builds a GetVpnServerClientOptions.
     *
     * @return the new GetVpnServerClientOptions instance
     */
    public GetVpnServerClientOptions build() {
      return new GetVpnServerClientOptions(this);
    }

    /**
     * Set the vpnServerId.
     *
     * @param vpnServerId the vpnServerId
     * @return the GetVpnServerClientOptions builder
     */
    public Builder vpnServerId(String vpnServerId) {
      this.vpnServerId = vpnServerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetVpnServerClientOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetVpnServerClientOptions() { }

  protected GetVpnServerClientOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnServerId,
      "vpnServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    vpnServerId = builder.vpnServerId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetVpnServerClientOptions builder
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
   * The VPN client identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

