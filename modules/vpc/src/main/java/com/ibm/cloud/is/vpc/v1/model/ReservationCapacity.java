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
 * The capacity configuration for this reservation
 *
 * If absent, this reservation has no assigned capacity.
 */
public class ReservationCapacity extends GenericModel {

  /**
   * The status of the capacity reservation:
   * - `allocating`: The capacity reservation is being allocated for use
   * - `allocated`: The total capacity of the reservation has been allocated for use
   * - `degraded`: The capacity reservation has been allocated for use, but some of the
   *   capacity is not available. See [capacity status
   *   reasons](https://cloud.ibm.com/docs/vpc?topic=vpc-reserved-capacity-status-reasons)
   *   for more information.
   * - `unallocated`: The capacity reservation is not allocated for use
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** allocated. */
    String ALLOCATED = "allocated";
    /** allocating. */
    String ALLOCATING = "allocating";
    /** degraded. */
    String DEGRADED = "degraded";
    /** unallocated. */
    String UNALLOCATED = "unallocated";
  }

  protected Long allocated;
  protected Long available;
  protected String status;
  protected Long total;
  protected Long used;

  protected ReservationCapacity() { }

  /**
   * Gets the allocated.
   *
   * The amount allocated to this capacity reservation.
   *
   * @return the allocated
   */
  public Long getAllocated() {
    return allocated;
  }

  /**
   * Gets the available.
   *
   * The amount of this capacity reservation available for new attachments.
   *
   * @return the available
   */
  public Long getAvailable() {
    return available;
  }

  /**
   * Gets the status.
   *
   * The status of the capacity reservation:
   * - `allocating`: The capacity reservation is being allocated for use
   * - `allocated`: The total capacity of the reservation has been allocated for use
   * - `degraded`: The capacity reservation has been allocated for use, but some of the
   *   capacity is not available. See [capacity status
   *   reasons](https://cloud.ibm.com/docs/vpc?topic=vpc-reserved-capacity-status-reasons)
   *   for more information.
   * - `unallocated`: The capacity reservation is not allocated for use
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the total.
   *
   * The total amount of this capacity reservation.
   *
   * @return the total
   */
  public Long getTotal() {
    return total;
  }

  /**
   * Gets the used.
   *
   * The amount of this capacity reservation used by existing attachments.
   *
   * @return the used
   */
  public Long getUsed() {
    return used;
  }
}

