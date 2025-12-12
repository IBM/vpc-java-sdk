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
 * EndpointGatewayPatch.
 */
public class EndpointGatewayPatch extends GenericModel {

  @SerializedName("allow_dns_resolution_binding")
  protected Boolean allowDnsResolutionBinding;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowDnsResolutionBinding;
    private String name;

    /**
     * Instantiates a new Builder from an existing EndpointGatewayPatch instance.
     *
     * @param endpointGatewayPatch the instance to initialize the Builder with
     */
    private Builder(EndpointGatewayPatch endpointGatewayPatch) {
      this.allowDnsResolutionBinding = endpointGatewayPatch.allowDnsResolutionBinding;
      this.name = endpointGatewayPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EndpointGatewayPatch.
     *
     * @return the new EndpointGatewayPatch instance
     */
    public EndpointGatewayPatch build() {
      return new EndpointGatewayPatch(this);
    }

    /**
     * Set the allowDnsResolutionBinding.
     *
     * @param allowDnsResolutionBinding the allowDnsResolutionBinding
     * @return the EndpointGatewayPatch builder
     */
    public Builder allowDnsResolutionBinding(Boolean allowDnsResolutionBinding) {
      this.allowDnsResolutionBinding = allowDnsResolutionBinding;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EndpointGatewayPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected EndpointGatewayPatch() { }

  protected EndpointGatewayPatch(Builder builder) {
    allowDnsResolutionBinding = builder.allowDnsResolutionBinding;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a EndpointGatewayPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowDnsResolutionBinding.
   *
   * Indicates whether to allow DNS resolution for this endpoint gateway when the VPC this endpoint gateway resides in
   * has a DNS resolution binding to a VPC with `dns.enable_hub` set to `true`.
   *
   * If `true`, then there must not be another endpoint gateway with
   * `allow_dns_resolution_binding` set to `true` in the [DNS sharing](/docs/vpc?topic=vpc-vpe-dns-sharing) connected
   * topology that:
   * - Has the same `target` as this endpoint gateway
   * - Has `service_endpoints` that overlap with the `service_endpoints` for this endpoint
   *   gateway.
   *
   * Must be `true` if the VPC this endpoint gateway resides in has `dns.enable_hub` set to
   * `true`.
   *
   * @return the allowDnsResolutionBinding
   */
  public Boolean allowDnsResolutionBinding() {
    return allowDnsResolutionBinding;
  }

  /**
   * Gets the name.
   *
   * The name for this endpoint gateway. The name must not be used by another endpoint gateway in the VPC.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the EndpointGatewayPatch.
   *
   * Note that properties of the EndpointGatewayPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the EndpointGatewayPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

