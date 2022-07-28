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
 * The pool member target. Load balancers in the `network` family support virtual server instances. Load balancers in
 * the `application` family support IP addresses. If the load balancer has route mode enabled, the member must be in a
 * zone the load balancer has a subnet in.
 *
 * Classes which extend this class:
 * - LoadBalancerPoolMemberTargetPrototypeInstanceIdentity
 * - LoadBalancerPoolMemberTargetPrototypeIP
 */
public class LoadBalancerPoolMemberTargetPrototype extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;
  protected String address;

  protected LoadBalancerPoolMemberTargetPrototype() {
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this virtual server instance.
   *
   * @return the id
   */
  public String id() {
    return id;
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

  /**
   * Gets the href.
   *
   * The URL for this virtual server instance.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * This property may add support for IPv6 addresses in the future. When processing a value in this property, verify
   * that the address is in an expected format. If it is not, log an error. Optionally halt processing and surface the
   * error, or bypass the resource on which the unexpected IP address format was encountered.
   *
   * @return the address
   */
  public String address() {
    return address;
  }
}

