/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VPNGatewayPatch.
 */
public class VPNGatewayPatch extends GenericModel {

  @SerializedName("local_asn")
  protected Long localAsn;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Long localAsn;
    private String name;

    /**
     * Instantiates a new Builder from an existing VPNGatewayPatch instance.
     *
     * @param vpnGatewayPatch the instance to initialize the Builder with
     */
    private Builder(VPNGatewayPatch vpnGatewayPatch) {
      this.localAsn = vpnGatewayPatch.localAsn;
      this.name = vpnGatewayPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayPatch.
     *
     * @return the new VPNGatewayPatch instance
     */
    public VPNGatewayPatch build() {
      return new VPNGatewayPatch(this);
    }

    /**
     * Set the localAsn.
     *
     * @param localAsn the localAsn
     * @return the VPNGatewayPatch builder
     */
    public Builder localAsn(long localAsn) {
      this.localAsn = localAsn;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNGatewayPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected VPNGatewayPatch() { }

  protected VPNGatewayPatch(Builder builder) {
    localAsn = builder.localAsn;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the localAsn.
   *
   * The local autonomous system number (ASN) for this VPN gateway and its connections. The ASN values in the
   * [restricted ASN list](
   * https://cloud.ibm.com/docs/vpc?topic=vpc-planning-considerations-vpn#dynamic-route-based-considerations) are
   * reserved and unavailable.
   *
   * @return the localAsn
   */
  public Long localAsn() {
    return localAsn;
  }

  /**
   * Gets the name.
   *
   * The name for this VPN gateway. The name must not be used by another VPN gateway in the VPC.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the VPNGatewayPatch.
   *
   * Note that properties of the VPNGatewayPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VPNGatewayPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

