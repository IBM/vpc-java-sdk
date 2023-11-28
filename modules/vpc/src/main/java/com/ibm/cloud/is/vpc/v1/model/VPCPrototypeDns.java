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
 *
 * If unspecified, the system will assign DNS servers capable of resolving hosts and endpoint gateways within this VPC,
 * and hosts on the internet.
 */
public class VPCPrototypeDns extends GenericModel {

  @SerializedName("enable_hub")
  protected Boolean enableHub;
  protected VPCDNSResolverPrototype resolver;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enableHub;
    private VPCDNSResolverPrototype resolver;

    /**
     * Instantiates a new Builder from an existing VPCPrototypeDns instance.
     *
     * @param vpcPrototypeDns the instance to initialize the Builder with
     */
    private Builder(VPCPrototypeDns vpcPrototypeDns) {
      this.enableHub = vpcPrototypeDns.enableHub;
      this.resolver = vpcPrototypeDns.resolver;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPCPrototypeDns.
     *
     * @return the new VPCPrototypeDns instance
     */
    public VPCPrototypeDns build() {
      return new VPCPrototypeDns(this);
    }

    /**
     * Set the enableHub.
     *
     * @param enableHub the enableHub
     * @return the VPCPrototypeDns builder
     */
    public Builder enableHub(Boolean enableHub) {
      this.enableHub = enableHub;
      return this;
    }

    /**
     * Set the resolver.
     *
     * @param resolver the resolver
     * @return the VPCPrototypeDns builder
     */
    public Builder resolver(VPCDNSResolverPrototype resolver) {
      this.resolver = resolver;
      return this;
    }
  }

  protected VPCPrototypeDns() { }

  protected VPCPrototypeDns(Builder builder) {
    enableHub = builder.enableHub;
    resolver = builder.resolver;
  }

  /**
   * New builder.
   *
   * @return a VPCPrototypeDns builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enableHub.
   *
   * Indicates whether this VPC is enabled as a DNS name resolution hub.
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
  public VPCDNSResolverPrototype resolver() {
    return resolver;
  }
}

