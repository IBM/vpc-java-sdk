/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
 * The target this collector will collect flow logs for. If the target is an instance, subnet, or VPC, flow logs will
 * not be collected for any network interfaces within the target that are themselves the target of a more specific flow
 * log collector.
 *
 * Classes which extend this class:
 * - FlowLogCollectorTargetPrototypeNetworkInterfaceIdentity
 * - FlowLogCollectorTargetPrototypeInstanceIdentity
 * - FlowLogCollectorTargetPrototypeSubnetIdentity
 * - FlowLogCollectorTargetPrototypeVPCIdentity
 */
public class FlowLogCollectorTargetPrototype extends GenericModel {

  protected String id;
  protected String href;
  protected String crn;

  protected FlowLogCollectorTargetPrototype() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this network interface.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this network interface.
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

