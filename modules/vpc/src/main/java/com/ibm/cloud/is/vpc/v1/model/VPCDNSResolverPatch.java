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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPCDNSResolverPatch.
 */
public class VPCDNSResolverPatch extends GenericModel {

  /**
   * The type of the DNS resolver to use.
   *
   * - `delegated`: DNS server addresses will be provided by the resolver for the VPC
   *                specified in `dns.resolver.vpc`. Requires `dns.enable_hub` to be
   *                `false`.
   * - `manual`: DNS server addresses are specified in `dns.resolver.manual_servers`.
   * - `system`: DNS server addresses will be provided by the system and depend on the
   *             configuration.
   *
   * Updating from `manual` requires `dns.resolver.manual_servers` to be specified as
   * `null`.
   *
   * Updating to `manual` requires `dns.resolver.manual_servers` to be specified and not empty.
   *
   * Updating from `delegated` requires `dns.resolver.vpc` to be specified as `null`.
   */
  public interface Type {
    /** delegated. */
    String DELEGATED = "delegated";
    /** manual. */
    String MANUAL = "manual";
    /** system. */
    String SYSTEM = "system";
  }

  @SerializedName("manual_servers")
  protected List<DNSServerPrototype> manualServers;
  protected String type;
  protected VPCDNSResolverVPCPatch vpc;

  /**
   * Builder.
   */
  public static class Builder {
    private List<DNSServerPrototype> manualServers;
    private String type;
    private VPCDNSResolverVPCPatch vpc;

    /**
     * Instantiates a new Builder from an existing VPCDNSResolverPatch instance.
     *
     * @param vpcdnsResolverPatch the instance to initialize the Builder with
     */
    private Builder(VPCDNSResolverPatch vpcdnsResolverPatch) {
      this.manualServers = vpcdnsResolverPatch.manualServers;
      this.type = vpcdnsResolverPatch.type;
      this.vpc = vpcdnsResolverPatch.vpc;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPCDNSResolverPatch.
     *
     * @return the new VPCDNSResolverPatch instance
     */
    public VPCDNSResolverPatch build() {
      return new VPCDNSResolverPatch(this);
    }

    /**
     * Adds a new element to manualServers.
     *
     * @param manualServers the new element to be added
     * @return the VPCDNSResolverPatch builder
     */
    public Builder addManualServers(DNSServerPrototype manualServers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(manualServers,
        "manualServers cannot be null");
      if (this.manualServers == null) {
        this.manualServers = new ArrayList<DNSServerPrototype>();
      }
      this.manualServers.add(manualServers);
      return this;
    }

    /**
     * Set the manualServers.
     * Existing manualServers will be replaced.
     *
     * @param manualServers the manualServers
     * @return the VPCDNSResolverPatch builder
     */
    public Builder manualServers(List<DNSServerPrototype> manualServers) {
      this.manualServers = manualServers;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the VPCDNSResolverPatch builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the VPCDNSResolverPatch builder
     */
    public Builder vpc(VPCDNSResolverVPCPatch vpc) {
      this.vpc = vpc;
      return this;
    }
  }

  protected VPCDNSResolverPatch() { }

  protected VPCDNSResolverPatch(Builder builder) {
    manualServers = builder.manualServers;
    type = builder.type;
    vpc = builder.vpc;
  }

  /**
   * New builder.
   *
   * @return a VPCDNSResolverPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the manualServers.
   *
   * The DNS servers to use for this VPC, replacing any existing servers. All the DNS servers must either:
   *
   * - have a unique `zone_affinity`, or
   * - not have a `zone_affinity`.
   *
   * If `zone_affinity` is specified, exactly one DNS server must be specified for each zone in the region. The DHCP
   * [Domain Name Server Option](https://datatracker.ietf.org/doc/html/rfc2132#section-3.8) for a zone will list this
   * DNS server first, followed by unique DNS servers from other zones if available.
   *
   * If `zone_affinity` is not specified, the DHCP [Domain Name Server
   * Option](https://datatracker.ietf.org/doc/html/rfc2132#section-3.8) for each zone will list all the manual DNS
   * servers in the order specified.
   *
   * `dns.resolver.manual_servers` must be set if and only if `dns.resolver.type` is `manual`.
   *
   * @return the manualServers
   */
  public List<DNSServerPrototype> manualServers() {
    return manualServers;
  }

  /**
   * Gets the type.
   *
   * The type of the DNS resolver to use.
   *
   * - `delegated`: DNS server addresses will be provided by the resolver for the VPC
   *                specified in `dns.resolver.vpc`. Requires `dns.enable_hub` to be
   *                `false`.
   * - `manual`: DNS server addresses are specified in `dns.resolver.manual_servers`.
   * - `system`: DNS server addresses will be provided by the system and depend on the
   *             configuration.
   *
   * Updating from `manual` requires `dns.resolver.manual_servers` to be specified as
   * `null`.
   *
   * Updating to `manual` requires `dns.resolver.manual_servers` to be specified and not empty.
   *
   * Updating from `delegated` requires `dns.resolver.vpc` to be specified as `null`.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the vpc.
   *
   * The VPC to provide DNS server addresses for this VPC.  The specified VPC must be configured
   * with a [DNS Services](https://cloud.ibm.com/docs/dns-svcs) custom resolver and must be in
   * one of this VPC's DNS resolution bindings.
   *
   * Specify `null` to remove an existing VPC.
   *
   * This property must be set if and only if `dns.resolver.type` is `delegated`.
   *
   * @return the vpc
   */
  public VPCDNSResolverVPCPatch vpc() {
    return vpc;
  }
}

