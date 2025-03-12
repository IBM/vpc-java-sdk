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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The VPC to provide DNS server addresses for this VPC.  The specified VPC must be configured with a [DNS
 * Services](https://cloud.ibm.com/docs/dns-svcs) custom resolver and must be in one of this VPC's DNS resolution
 * bindings.
 *
 * Specify `null` to remove an existing VPC.
 *
 * This property must be set if and only if `dns.resolver.type` is `delegated`.
 *
 * Classes which extend this class:
 * - VPCDNSResolverVPCPatchVPCIdentityById
 * - VPCDNSResolverVPCPatchVPCIdentityByCRN
 * - VPCDNSResolverVPCPatchVPCIdentityByHref
 */
public class VPCDNSResolverVPCPatch extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;

  protected VPCDNSResolverVPCPatch() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPC.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this VPC.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this VPC.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

