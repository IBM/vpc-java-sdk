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
 * The target this public address range is bound to.
 *
 * If absent, this pubic address range is not bound to a target.
 *
 * The target resources supported by this property is expected to
 * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future. Future targets may omit the `vpc`
 * property.
 */
public class PublicAddressRangeTarget extends GenericModel {

  protected VPCReference vpc;
  protected ZoneReference zone;

  protected PublicAddressRangeTarget() { }

  /**
   * Gets the vpc.
   *
   * The VPC this public address range is bound to.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this public address range resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

