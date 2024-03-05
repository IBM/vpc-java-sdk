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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VPCPatch.
 */
public class VPCPatch extends GenericModel {

  protected VPCDNSPatch dns;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private VPCDNSPatch dns;
    private String name;

    /**
     * Instantiates a new Builder from an existing VPCPatch instance.
     *
     * @param vpcPatch the instance to initialize the Builder with
     */
    private Builder(VPCPatch vpcPatch) {
      this.dns = vpcPatch.dns;
      this.name = vpcPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPCPatch.
     *
     * @return the new VPCPatch instance
     */
    public VPCPatch build() {
      return new VPCPatch(this);
    }

    /**
     * Set the dns.
     *
     * @param dns the dns
     * @return the VPCPatch builder
     */
    public Builder dns(VPCDNSPatch dns) {
      this.dns = dns;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPCPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected VPCPatch() { }

  protected VPCPatch(Builder builder) {
    dns = builder.dns;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a VPCPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dns.
   *
   * The DNS configuration for this VPC.
   *
   * @return the dns
   */
  public VPCDNSPatch dns() {
    return dns;
  }

  /**
   * Gets the name.
   *
   * The name for this VPC. The name must not be used by another VPC in the region.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the VPCPatch.
   *
   * Note that properties of the VPCPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VPCPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

