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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The target this collector will collect flow logs for.
 *
 * If the target is an instance, subnet, or VPC, flow logs will not be collected for any instance network attachments,
 * virtual network interfaces or instance network interfaces within the target that are themselves the target of a more
 * specific flow log collector.
 *
 * The target must not be a virtual network interface that is attached to a bare metal server network attachment or to a
 * file share mount target.
 *
 * Classes which extend this class:
 * - FlowLogCollectorTargetPrototypeNetworkInterfaceIdentity
 * - FlowLogCollectorTargetPrototypeInstanceIdentity
 * - FlowLogCollectorTargetPrototypeSubnetIdentity
 * - FlowLogCollectorTargetPrototypeVPCIdentity
 * - FlowLogCollectorTargetPrototypeVirtualNetworkInterfaceIdentity
 * - FlowLogCollectorTargetPrototypeInstanceNetworkAttachmentIdentity
 */
public class FlowLogCollectorTargetPrototype extends GenericModel {

  protected String id;
  protected String href;
  protected String crn;

  protected FlowLogCollectorTargetPrototype() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance network interface.
   *
   * If this instance has network attachments, this network interface is a
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
   * The URL for this instance network interface.
   *
   * If this instance has network attachments, this network interface is a
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
   * The CRN for this virtual server instance.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

