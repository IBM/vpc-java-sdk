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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * EndpointGatewayPatch.
 */
public class EndpointGatewayPatch extends GenericModel {

  /**
   * The DNS resolution binding mode to use for this endpoint gateway:
   * - `disabled`: The endpoint gateway will not participate in [DNS sharing for VPE
   *    gateways](/docs/vpc?topic=vpc-vpe-dns-sharing) with other VPCs in a connected
   *    topology.
   * - `primary`: The endpoint gateway will participate in [DNS sharing for VPE gateways]
   *    (/docs/vpc?topic=vpc-vpe-dns-sharing) if the VPC this endpoint gateway resides in
   *    has a DNS resolution binding to another VPC. If the VPC this endpoint gateway
   *    resides in has a DNS resolution binding to another VPC, then no other VPC in the
   *    topology can have an endpoint gateway with the same `target` as this endpoint
   *    gateway.
   * - `per_resource_binding`: The endpoint gateway will participate in [DNS sharing for VPE
   *    gateways](/docs/vpc?topic=vpc-vpe-dns-sharing) if the VPC this endpoint gateway
   *    resides in has a DNS resolution binding to another VPC. Resource binding must be
   *    enabled for the `target` service.
   *
   *    The VPC this endpoint gateway resides in must have `dns.enable_hub` set to
   *    `false`.
   *
   *    If the VPC this endpoint gateway resides in has DNS resolution binding to another
   *    VPC, the other VPC must:
   *    - have `dns.enable_hub` set to `true`
   *    - contain an endpoint gateway for the same `target` service with
   *      `dns_resolution_binding_mode` set to `primary`.
   */
  public interface DnsResolutionBindingMode {
    /** disabled. */
    String DISABLED = "disabled";
    /** per_resource_binding. */
    String PER_RESOURCE_BINDING = "per_resource_binding";
    /** primary. */
    String PRIMARY = "primary";
  }

  @SerializedName("dns_resolution_binding_mode")
  protected String dnsResolutionBindingMode;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String dnsResolutionBindingMode;
    private String name;

    /**
     * Instantiates a new Builder from an existing EndpointGatewayPatch instance.
     *
     * @param endpointGatewayPatch the instance to initialize the Builder with
     */
    private Builder(EndpointGatewayPatch endpointGatewayPatch) {
      this.dnsResolutionBindingMode = endpointGatewayPatch.dnsResolutionBindingMode;
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
     * Set the dnsResolutionBindingMode.
     *
     * @param dnsResolutionBindingMode the dnsResolutionBindingMode
     * @return the EndpointGatewayPatch builder
     */
    public Builder dnsResolutionBindingMode(String dnsResolutionBindingMode) {
      this.dnsResolutionBindingMode = dnsResolutionBindingMode;
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
    dnsResolutionBindingMode = builder.dnsResolutionBindingMode;
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
   * Gets the dnsResolutionBindingMode.
   *
   * The DNS resolution binding mode to use for this endpoint gateway:
   * - `disabled`: The endpoint gateway will not participate in [DNS sharing for VPE
   *    gateways](/docs/vpc?topic=vpc-vpe-dns-sharing) with other VPCs in a connected
   *    topology.
   * - `primary`: The endpoint gateway will participate in [DNS sharing for VPE gateways]
   *    (/docs/vpc?topic=vpc-vpe-dns-sharing) if the VPC this endpoint gateway resides in
   *    has a DNS resolution binding to another VPC. If the VPC this endpoint gateway
   *    resides in has a DNS resolution binding to another VPC, then no other VPC in the
   *    topology can have an endpoint gateway with the same `target` as this endpoint
   *    gateway.
   * - `per_resource_binding`: The endpoint gateway will participate in [DNS sharing for VPE
   *    gateways](/docs/vpc?topic=vpc-vpe-dns-sharing) if the VPC this endpoint gateway
   *    resides in has a DNS resolution binding to another VPC. Resource binding must be
   *    enabled for the `target` service.
   *
   *    The VPC this endpoint gateway resides in must have `dns.enable_hub` set to
   *    `false`.
   *
   *    If the VPC this endpoint gateway resides in has DNS resolution binding to another
   *    VPC, the other VPC must:
   *    - have `dns.enable_hub` set to `true`
   *    - contain an endpoint gateway for the same `target` service with
   *      `dns_resolution_binding_mode` set to `primary`.
   *
   * @return the dnsResolutionBindingMode
   */
  public String dnsResolutionBindingMode() {
    return dnsResolutionBindingMode;
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

