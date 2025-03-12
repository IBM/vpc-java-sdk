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
 * The target resource to bind this floating IP to, replacing any existing binding. The floating IP must not be required
 * by another resource, such as a public gateway.
 *
 * The target resource must not already have a floating IP bound to it if the target resource is:
 *
 * - an instance network interface
 * - a bare metal server network interface with `enable_infrastructure_nat` set to `true`
 * - a virtual network interface with `enable_infrastructure_nat` set to `true`
 *
 * Specify `null` to remove an existing binding.
 *
 * Classes which extend this class:
 * - FloatingIPTargetPatchBareMetalServerNetworkInterfaceIdentity
 * - FloatingIPTargetPatchNetworkInterfaceIdentity
 * - FloatingIPTargetPatchVirtualNetworkInterfaceIdentity
 */
public class FloatingIPTargetPatch extends GenericModel {

  protected String id;
  protected String href;
  protected String crn;

  protected FloatingIPTargetPatch() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the identifier is that of the
   * corresponding network attachment.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this virtual network interface.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

