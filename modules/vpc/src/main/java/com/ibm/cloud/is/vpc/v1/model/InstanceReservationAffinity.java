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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceReservationAffinity.
 */
public class InstanceReservationAffinity extends GenericModel {

  /**
   * The reservation affinity policy to use for this virtual server instance:
   * - `automatic`: Any reservations with an `affinity_policy` of `automatic`
   *   that have the same `profile` and `zone` as this virtual server instance
   *   are available for use.
   * - `disabled`: Reservations will not be used
   * - `manual`: Reservations in `pool` are available for use.
   */
  public interface Policy {
    /** automatic. */
    String AUTOMATIC = "automatic";
    /** disabled. */
    String DISABLED = "disabled";
    /** manual. */
    String MANUAL = "manual";
  }

  protected String policy;
  protected List<ReservationReference> pool;

  protected InstanceReservationAffinity() { }

  /**
   * Gets the policy.
   *
   * The reservation affinity policy to use for this virtual server instance:
   * - `automatic`: Any reservations with an `affinity_policy` of `automatic`
   *   that have the same `profile` and `zone` as this virtual server instance
   *   are available for use.
   * - `disabled`: Reservations will not be used
   * - `manual`: Reservations in `pool` are available for use.
   *
   * @return the policy
   */
  public String getPolicy() {
    return policy;
  }

  /**
   * Gets the pool.
   *
   * The pool of reservations available for use by this virtual server instance when the `policy` is `manual`. This must
   * be empty if the `policy` is `automatic` or
   * `disabled`.
   *
   * @return the pool
   */
  public List<ReservationReference> getPool() {
    return pool;
  }
}

