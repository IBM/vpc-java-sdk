/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * The addVpnGatewayConnectionsPeerCidr options.
 */
public class AddVpnGatewayConnectionsPeerCidrOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String id;
  protected String cidr;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String id;
    private String cidr;

    /**
     * Instantiates a new Builder from an existing AddVpnGatewayConnectionsPeerCidrOptions instance.
     *
     * @param addVpnGatewayConnectionsPeerCidrOptions the instance to initialize the Builder with
     */
    private Builder(AddVpnGatewayConnectionsPeerCidrOptions addVpnGatewayConnectionsPeerCidrOptions) {
      this.vpnGatewayId = addVpnGatewayConnectionsPeerCidrOptions.vpnGatewayId;
      this.id = addVpnGatewayConnectionsPeerCidrOptions.id;
      this.cidr = addVpnGatewayConnectionsPeerCidrOptions.cidr;
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
     * @param cidr the cidr
     */
    public Builder(String vpnGatewayId, String id, String cidr) {
      this.vpnGatewayId = vpnGatewayId;
      this.id = id;
      this.cidr = cidr;
    }

    /**
     * Builds a AddVpnGatewayConnectionsPeerCidrOptions.
     *
     * @return the new AddVpnGatewayConnectionsPeerCidrOptions instance
     */
    public AddVpnGatewayConnectionsPeerCidrOptions build() {
      return new AddVpnGatewayConnectionsPeerCidrOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the AddVpnGatewayConnectionsPeerCidrOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AddVpnGatewayConnectionsPeerCidrOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the cidr.
     *
     * @param cidr the cidr
     * @return the AddVpnGatewayConnectionsPeerCidrOptions builder
     */
    public Builder cidr(String cidr) {
      this.cidr = cidr;
      return this;
    }
  }

  protected AddVpnGatewayConnectionsPeerCidrOptions() { }

  protected AddVpnGatewayConnectionsPeerCidrOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.cidr,
      "cidr cannot be empty");
    vpnGatewayId = builder.vpnGatewayId;
    id = builder.id;
    cidr = builder.cidr;
  }

  /**
   * New builder.
   *
   * @return a AddVpnGatewayConnectionsPeerCidrOptions builder
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
   * Gets the cidr.
   *
   * The IP address range in CIDR block notation.
   *
   * @return the cidr
   */
  public String cidr() {
    return cidr;
  }
}

