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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPCDNSResolver.
 *
 * Classes which extend this class:
 * - VPCDNSResolverTypeDelegated
 * - VPCDNSResolverTypeManual
 * - VPCDNSResolverTypeSystem
 */
public class VPCDNSResolver extends GenericModel {

  /**
   * The type of the DNS resolver used for the VPC.
   *
   * - `delegated`: DNS server addresses are provided by the DNS resolver of the VPC
   *                specified in `dns.resolver.vpc`.
   * - `manual`: DNS server addresses are specified in `dns.resolver.manual_servers`.
   * - `system`: DNS server addresses are provided by the system.
   */
  public interface Type {
    /** delegated. */
    String DELEGATED = "delegated";
    /** manual. */
    String MANUAL = "manual";
    /** system. */
    String SYSTEM = "system";
  }

  /**
   * The configuration of the system DNS resolver for this VPC.
   *
   * - `custom_resolver`: A custom DNS resolver is configured for this VPC.
   *
   * - `private_resolver`: A private DNS resolver is configured for this VPC. Applicable when
   *   the VPC has either or both of the following:
   *
   *     - at least one endpoint gateway residing in it
   *     - a [DNS Services](https://cloud.ibm.com/docs/dns-svcs) private zone configured for it
   *
   * - `default`: The provider default DNS resolvers are configured for this VPC.
   *
   *   This system DNS resolver configuration is used when the VPC has:
   *
   *   - no custom DNS resolver configured for it, and
   *   - no endpoint gateways residing in it, and
   *   - no [DNS Services](https://cloud.ibm.com/docs/dns-svcs) private zone configured for it.
   */
  public interface Configuration {
    /** custom_resolver. */
    String CUSTOM_RESOLVER = "custom_resolver";
    /** default. */
    String X_DEFAULT = "default";
    /** private_resolver. */
    String PRIVATE_RESOLVER = "private_resolver";
  }

  protected List<DNSServer> servers;
  protected String type;
  protected VPCReferenceDNSResolverContext vpc;
  @SerializedName("manual_servers")
  protected List<DNSServer> manualServers;
  protected String configuration;

  protected VPCDNSResolver() { }

  /**
   * Gets the servers.
   *
   * The DNS servers for this VPC. The servers are populated:
   *
   * - by the system when `dns.resolver.type` is `system`
   * - using the DNS servers in `dns.resolver.vpc` when `dns.resolver.type` is `delegated`
   * - using `dns.resolver.manual_servers` when the `dns.resolver.type` is `manual`.
   *
   * @return the servers
   */
  public List<DNSServer> getServers() {
    return servers;
  }

  /**
   * Gets the type.
   *
   * The type of the DNS resolver used for the VPC.
   *
   * - `delegated`: DNS server addresses are provided by the DNS resolver of the VPC
   *                specified in `dns.resolver.vpc`.
   * - `manual`: DNS server addresses are specified in `dns.resolver.manual_servers`.
   * - `system`: DNS server addresses are provided by the system.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the vpc.
   *
   * The VPC whose DNS resolver provides the DNS server addresses for this VPC.
   *
   * The VPC may be remote and therefore may not be directly retrievable.
   *
   * @return the vpc
   */
  public VPCReferenceDNSResolverContext getVpc() {
    return vpc;
  }

  /**
   * Gets the manualServers.
   *
   * The manually specified DNS servers for this VPC.
   *
   * If the DNS servers have `zone_affinity`, the DHCP [Domain Name Server
   * Option](https://datatracker.ietf.org/doc/html/rfc2132#section-3.8) for a zone will list the DNS server with the
   * affinity for that zone first, followed by the unique DNS servers from other zones.
   *
   * If the DNS servers do not have `zone_affinity`, the DHCP [Domain Name Server
   * Option](https://datatracker.ietf.org/doc/html/rfc2132#section-3.8) for each zone will list all the manual DNS
   * servers in the order specified.
   *
   * @return the manualServers
   */
  public List<DNSServer> getManualServers() {
    return manualServers;
  }

  /**
   * Gets the configuration.
   *
   * The configuration of the system DNS resolver for this VPC.
   *
   * - `custom_resolver`: A custom DNS resolver is configured for this VPC.
   *
   * - `private_resolver`: A private DNS resolver is configured for this VPC. Applicable when
   *   the VPC has either or both of the following:
   *
   *     - at least one endpoint gateway residing in it
   *     - a [DNS Services](https://cloud.ibm.com/docs/dns-svcs) private zone configured for it
   *
   * - `default`: The provider default DNS resolvers are configured for this VPC.
   *
   *   This system DNS resolver configuration is used when the VPC has:
   *
   *   - no custom DNS resolver configured for it, and
   *   - no endpoint gateways residing in it, and
   *   - no [DNS Services](https://cloud.ibm.com/docs/dns-svcs) private zone configured for it.
   *
   * @return the configuration
   */
  public String getConfiguration() {
    return configuration;
  }
}

