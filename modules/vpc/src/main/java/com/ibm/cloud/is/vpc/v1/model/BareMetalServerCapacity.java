/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * A `zone` that has available bare metal servers with a `profile`.
 */
public class BareMetalServerCapacity extends GenericModel {

  protected BareMetalServerProfileReference profile;
  protected ZoneReference zone;

  protected BareMetalServerCapacity() { }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile)
   * available in the `zone`.
   *
   * @return the profile
   */
  public BareMetalServerProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the zone.
   *
   * The zone where one or more bare metal servers of the `profile` are available.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

