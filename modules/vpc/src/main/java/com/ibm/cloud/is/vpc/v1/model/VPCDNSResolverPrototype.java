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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPCDNSResolverPrototype.
 *
 * Classes which extend this class:
 * - VPCDNSResolverPrototypeVPCDNSResolverTypeManualPrototype
 * - VPCDNSResolverPrototypeVPCDNSResolverTypeSystemPrototype
 */
public class VPCDNSResolverPrototype extends GenericModel {

  /**
   * The type of the DNS resolver to use.
   *
   * - `manual`: DNS server addresses are specified in `dns.resolver.manual_servers`.
   * - `system`: DNS server addresses will be provided by the system and depend on the
   *             configuration.
   */
  public interface Type {
    /** manual. */
    String MANUAL = "manual";
    /** system. */
    String SYSTEM = "system";
  }

  protected String type;
  @SerializedName("manual_servers")
  protected List<DNSServerPrototype> manualServers;

  protected VPCDNSResolverPrototype() { }

  /**
   * Gets the type.
   *
   * The type of the DNS resolver to use.
   *
   * - `manual`: DNS server addresses are specified in `dns.resolver.manual_servers`.
   * - `system`: DNS server addresses will be provided by the system and depend on the
   *             configuration.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the manualServers.
   *
   * The DNS servers to use for this VPC. All the DNS servers must either:
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
   * @return the manualServers
   */
  public List<DNSServerPrototype> manualServers() {
    return manualServers;
  }
}

