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

/**
 * The DNS server addresses are provided by the system and depend on the configuration.
 */
public class VPCDNSResolverTypeSystem extends VPCDNSResolver {

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

  /**
   * The type of the DNS resolver used for the VPC.
   */
  public interface Type {
    /** system. */
    String SYSTEM = "system";
  }


  protected VPCDNSResolverTypeSystem() { }
}

