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

import java.util.ArrayList;
import java.util.List;

/**
 * VPNGatewayConnectionPolicyModeLocalPrototype.
 */
public class VPNGatewayConnectionPolicyModeLocalPrototype extends VPNGatewayConnectionLocalPrototype {

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> cidrs;
    private List<VPNGatewayConnectionIKEIdentityPrototype> ikeIdentities;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPolicyModeLocalPrototype instance.
     *
     * @param vpnGatewayConnectionPolicyModeLocalPrototype the instance to initialize the Builder with
     */
    private Builder(VPNGatewayConnectionPolicyModeLocalPrototype vpnGatewayConnectionPolicyModeLocalPrototype) {
      this.cidrs = vpnGatewayConnectionPolicyModeLocalPrototype.cidrs;
      this.ikeIdentities = vpnGatewayConnectionPolicyModeLocalPrototype.ikeIdentities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cidrs the cidrs
     */
    public Builder(List<String> cidrs) {
      this.cidrs = cidrs;
    }

    /**
     * Builds a VPNGatewayConnectionPolicyModeLocalPrototype.
     *
     * @return the new VPNGatewayConnectionPolicyModeLocalPrototype instance
     */
    public VPNGatewayConnectionPolicyModeLocalPrototype build() {
      return new VPNGatewayConnectionPolicyModeLocalPrototype(this);
    }

    /**
     * Adds a new element to cidrs.
     *
     * @param cidrs the new element to be added
     * @return the VPNGatewayConnectionPolicyModeLocalPrototype builder
     */
    public Builder addCidrs(String cidrs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(cidrs,
        "cidrs cannot be null");
      if (this.cidrs == null) {
        this.cidrs = new ArrayList<String>();
      }
      this.cidrs.add(cidrs);
      return this;
    }

    /**
     * Adds a new element to ikeIdentities.
     *
     * @param ikeIdentities the new element to be added
     * @return the VPNGatewayConnectionPolicyModeLocalPrototype builder
     */
    public Builder addIkeIdentities(VPNGatewayConnectionIKEIdentityPrototype ikeIdentities) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(ikeIdentities,
        "ikeIdentities cannot be null");
      if (this.ikeIdentities == null) {
        this.ikeIdentities = new ArrayList<VPNGatewayConnectionIKEIdentityPrototype>();
      }
      this.ikeIdentities.add(ikeIdentities);
      return this;
    }

    /**
     * Set the cidrs.
     * Existing cidrs will be replaced.
     *
     * @param cidrs the cidrs
     * @return the VPNGatewayConnectionPolicyModeLocalPrototype builder
     */
    public Builder cidrs(List<String> cidrs) {
      this.cidrs = cidrs;
      return this;
    }

    /**
     * Set the ikeIdentities.
     * Existing ikeIdentities will be replaced.
     *
     * @param ikeIdentities the ikeIdentities
     * @return the VPNGatewayConnectionPolicyModeLocalPrototype builder
     */
    public Builder ikeIdentities(List<VPNGatewayConnectionIKEIdentityPrototype> ikeIdentities) {
      this.ikeIdentities = ikeIdentities;
      return this;
    }
  }

  protected VPNGatewayConnectionPolicyModeLocalPrototype() { }

  protected VPNGatewayConnectionPolicyModeLocalPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cidrs,
      "cidrs cannot be null");
    cidrs = builder.cidrs;
    ikeIdentities = builder.ikeIdentities;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPolicyModeLocalPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cidrs.
   *
   * The local CIDRs for this VPN gateway connection.
   *
   * @return the cidrs
   */
  public List<String> cidrs() {
    return cidrs;
  }

  /**
   * Gets the ikeIdentities.
   *
   * The local IKE identities to use.
   *
   * A VPN gateway in policy mode consists of two members in active-standby mode. The specified identity will be applied
   * to the active member.
   *
   * If unspecified, then `type` will be `ipv4_address` and `value` will be the public IP address of the VPN gateway.
   *
   * @return the ikeIdentities
   */
  public List<VPNGatewayConnectionIKEIdentityPrototype> ikeIdentities() {
    return ikeIdentities;
  }
}

