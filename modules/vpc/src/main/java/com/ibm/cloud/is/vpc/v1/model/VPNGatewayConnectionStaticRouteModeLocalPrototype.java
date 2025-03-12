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

import java.util.ArrayList;
import java.util.List;

/**
 * VPNGatewayConnectionStaticRouteModeLocalPrototype.
 */
public class VPNGatewayConnectionStaticRouteModeLocalPrototype extends VPNGatewayConnectionLocalPrototype {

  /**
   * Builder.
   */
  public static class Builder {
    private List<VPNGatewayConnectionIKEIdentityPrototype> ikeIdentities;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionStaticRouteModeLocalPrototype instance.
     *
     * @param vpnGatewayConnectionStaticRouteModeLocalPrototype the instance to initialize the Builder with
     */
    private Builder(VPNGatewayConnectionStaticRouteModeLocalPrototype vpnGatewayConnectionStaticRouteModeLocalPrototype) {
      this.ikeIdentities = vpnGatewayConnectionStaticRouteModeLocalPrototype.ikeIdentities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionStaticRouteModeLocalPrototype.
     *
     * @return the new VPNGatewayConnectionStaticRouteModeLocalPrototype instance
     */
    public VPNGatewayConnectionStaticRouteModeLocalPrototype build() {
      return new VPNGatewayConnectionStaticRouteModeLocalPrototype(this);
    }

    /**
     * Adds a new element to ikeIdentities.
     *
     * @param ikeIdentities the new element to be added
     * @return the VPNGatewayConnectionStaticRouteModeLocalPrototype builder
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
     * Set the ikeIdentities.
     * Existing ikeIdentities will be replaced.
     *
     * @param ikeIdentities the ikeIdentities
     * @return the VPNGatewayConnectionStaticRouteModeLocalPrototype builder
     */
    public Builder ikeIdentities(List<VPNGatewayConnectionIKEIdentityPrototype> ikeIdentities) {
      this.ikeIdentities = ikeIdentities;
      return this;
    }
  }

  protected VPNGatewayConnectionStaticRouteModeLocalPrototype() { }

  protected VPNGatewayConnectionStaticRouteModeLocalPrototype(Builder builder) {
    ikeIdentities = builder.ikeIdentities;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionStaticRouteModeLocalPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ikeIdentities.
   *
   * The local IKE identities to use.
   *
   * A VPN gateway in static route mode consists of two members in active-active mode. The first specified identity will
   * be applied to the first member, and the second specified identity will be applied to the second member.
   *
   * If unspecified, then `type` will be `ipv4_address` and `value` will be the public IP address of the member's VPN
   * connection tunnel.
   *
   * @return the ikeIdentities
   */
  public List<VPNGatewayConnectionIKEIdentityPrototype> ikeIdentities() {
    return ikeIdentities;
  }
}

