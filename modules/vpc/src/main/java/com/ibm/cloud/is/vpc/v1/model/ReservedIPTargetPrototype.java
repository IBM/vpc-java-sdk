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
 * The target to bind this reserved IP to.  The target must be in the same VPC.
 *
 * At present, only endpoint gateway targets are supported.  The endpoint gateway must not be already bound to a
 * reserved IP in the subnet's zone.
 *
 * If unspecified, the reserved IP will be created unbound.
 *
 * Classes which extend this class:
 * - ReservedIPTargetPrototypeEndpointGatewayIdentity
 */
public class ReservedIPTargetPrototype extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;

  protected ReservedIPTargetPrototype() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this endpoint gateway.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this endpoint gateway.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this endpoint gateway.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

