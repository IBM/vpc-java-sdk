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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The DNS configuration for this VPC.
 */
public class VPCDNSPatch extends GenericModel {

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
     * Instantiates a new Builder from an existing VPCDNSPatch instance.
     *
     * @param vpcdnsPatch the instance to initialize the Builder with
     */
    private Builder(VPCDNSPatch vpcdnsPatch) {
      this.enableHub = vpcdnsPatch.enableHub;
      this.resolver = vpcdnsPatch.resolver;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPCDNSPatch.
     *
     * @return the new VPCDNSPatch instance
     */
    public VPCDNSPatch build() {
      return new VPCDNSPatch(this);
    }

    /**
     * Set the enableHub.
     *
     * @param enableHub the enableHub
     * @return the VPCDNSPatch builder
     */
    public Builder enableHub(Boolean enableHub) {
      this.enableHub = enableHub;
      return this;
    }

    /**
     * Set the resolver.
     *
     * @param resolver the resolver
     * @return the VPCDNSPatch builder
     */
    public Builder resolver(VPCDNSResolverPatch resolver) {
      this.resolver = resolver;
      return this;
    }
  }

  protected VPCDNSPatch() { }

  protected VPCDNSPatch(Builder builder) {
    enableHub = builder.enableHub;
    resolver = builder.resolver;
  }

  /**
   * New builder.
   *
   * @return a VPCDNSPatch builder
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

