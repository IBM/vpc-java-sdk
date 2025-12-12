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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * BareMetalServerNetworkInterfacePatch.
 */
public class BareMetalServerNetworkInterfacePatch extends GenericModel {

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  @SerializedName("allowed_vlans")
  protected List<Long> allowedVlans;
  @SerializedName("enable_infrastructure_nat")
  protected Boolean enableInfrastructureNat;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowIpSpoofing;
    private List<Long> allowedVlans;
    private Boolean enableInfrastructureNat;
    private String name;

    /**
     * Instantiates a new Builder from an existing BareMetalServerNetworkInterfacePatch instance.
     *
     * @param bareMetalServerNetworkInterfacePatch the instance to initialize the Builder with
     */
    private Builder(BareMetalServerNetworkInterfacePatch bareMetalServerNetworkInterfacePatch) {
      this.allowIpSpoofing = bareMetalServerNetworkInterfacePatch.allowIpSpoofing;
      this.allowedVlans = bareMetalServerNetworkInterfacePatch.allowedVlans;
      this.enableInfrastructureNat = bareMetalServerNetworkInterfacePatch.enableInfrastructureNat;
      this.name = bareMetalServerNetworkInterfacePatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerNetworkInterfacePatch.
     *
     * @return the new BareMetalServerNetworkInterfacePatch instance
     */
    public BareMetalServerNetworkInterfacePatch build() {
      return new BareMetalServerNetworkInterfacePatch(this);
    }

    /**
     * Adds a new element to allowedVlans.
     *
     * @param allowedVlans the new element to be added
     * @return the BareMetalServerNetworkInterfacePatch builder
     */
    public Builder addAllowedVlans(Long allowedVlans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedVlans,
        "allowedVlans cannot be null");
      if (this.allowedVlans == null) {
        this.allowedVlans = new ArrayList<Long>();
      }
      this.allowedVlans.add(allowedVlans);
      return this;
    }

    /**
     * Set the allowIpSpoofing.
     *
     * @param allowIpSpoofing the allowIpSpoofing
     * @return the BareMetalServerNetworkInterfacePatch builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the allowedVlans.
     * Existing allowedVlans will be replaced.
     *
     * @param allowedVlans the allowedVlans
     * @return the BareMetalServerNetworkInterfacePatch builder
     */
    public Builder allowedVlans(List<Long> allowedVlans) {
      this.allowedVlans = allowedVlans;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the BareMetalServerNetworkInterfacePatch builder
     */
    public Builder enableInfrastructureNat(Boolean enableInfrastructureNat) {
      this.enableInfrastructureNat = enableInfrastructureNat;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkInterfacePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected BareMetalServerNetworkInterfacePatch() { }

  protected BareMetalServerNetworkInterfacePatch(Builder builder) {
    allowIpSpoofing = builder.allowIpSpoofing;
    allowedVlans = builder.allowedVlans;
    enableInfrastructureNat = builder.enableInfrastructureNat;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerNetworkInterfacePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and source IP spoofing is managed on
   * the attached virtual network interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean allowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the allowedVlans.
   *
   * The VLAN IDs to allow for `vlan` interfaces using this PCI interface, replacing any existing VLAN IDs. The
   * specified values must include IDs for all `vlan` interfaces currently using this PCI interface.
   *
   * @return the allowedVlans
   */
  public List<Long> allowedVlans() {
    return allowedVlans;
  }

  /**
   * Gets the enableInfrastructureNat.
   *
   * If `true`:
   * - The VPC infrastructure performs any needed NAT operations.
   * - `floating_ips` must not have more than one floating IP.
   *
   * If `false`:
   * - Packets are passed unchanged to/from the bare metal server network interface,
   *   allowing the workload to perform any needed NAT operations.
   * - `allow_ip_spoofing` must be `false`.
   * - `interface_type` must not be `hipersocket`.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and infrastructure NAT is managed on
   * the attached virtual network interface.
   *
   * @return the enableInfrastructureNat
   */
  public Boolean enableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server network interface. The name must not be used by another network interface on
   * the bare metal server.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the BareMetalServerNetworkInterfacePatch.
   *
   * Note that properties of the BareMetalServerNetworkInterfacePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the BareMetalServerNetworkInterfacePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

