/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The DNS configuration for this VPC.
 */
public class VPCPatchDns extends GenericModel {

  @SerializedName("enable_hub")
  protected Boolean enableHub;
  protected VPCDNSResolverPatch resolver;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enableHub;
    private VPCDNSResolverPatch resolver;

    /**
     * Instantiates a new Builder from an existing VPCPatchDns instance.
     *
     * @param vpcPatchDns the instance to initialize the Builder with
     */
    private Builder(VPCPatchDns vpcPatchDns) {
      this.enableHub = vpcPatchDns.enableHub;
      this.resolver = vpcPatchDns.resolver;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPCPatchDns.
     *
     * @return the new VPCPatchDns instance
     */
    public VPCPatchDns build() {
      return new VPCPatchDns(this);
    }

    /**
     * Set the enableHub.
     *
     * @param enableHub the enableHub
     * @return the VPCPatchDns builder
     */
    public Builder enableHub(Boolean enableHub) {
      this.enableHub = enableHub;
      return this;
    }

    /**
     * Set the resolver.
     *
     * @param resolver the resolver
     * @return the VPCPatchDns builder
     */
    public Builder resolver(VPCDNSResolverPatch resolver) {
      this.resolver = resolver;
      return this;
    }
  }

  protected VPCPatchDns() { }

  protected VPCPatchDns(Builder builder) {
    enableHub = builder.enableHub;
    resolver = builder.resolver;
  }

  /**
   * New builder.
   *
   * @return a VPCPatchDns builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enableHub.
   *
   * Indicates whether this VPC is enabled as a DNS name resolution hub.
   *
   * Updating the value to `true` requires `allow_dns_resolution_binding` to be `true` for all endpoint gateways
   * residing in this VPC.
   *
   * Changing the value requires `dns.resolution_binding_count` to be zero.
   *
   * @return the enableHub
   */
  public Boolean enableHub() {
    return enableHub;
  }

  /**
   * Gets the resolver.
   *
   * @return the resolver
   */
  public VPCDNSResolverPatch resolver() {
    return resolver;
  }
}

