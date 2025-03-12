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
 * The capacity reservation configuration to use.
 *
 * The configuration can only be changed for reservations with a `status` of `inactive`.
 */
public class ReservationCapacityPatch extends GenericModel {

  protected Long total;

  /**
   * Builder.
   */
  public static class Builder {
    private Long total;

    /**
     * Instantiates a new Builder from an existing ReservationCapacityPatch instance.
     *
     * @param reservationCapacityPatch the instance to initialize the Builder with
     */
    private Builder(ReservationCapacityPatch reservationCapacityPatch) {
      this.total = reservationCapacityPatch.total;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReservationCapacityPatch.
     *
     * @return the new ReservationCapacityPatch instance
     */
    public ReservationCapacityPatch build() {
      return new ReservationCapacityPatch(this);
    }

    /**
     * Set the total.
     *
     * @param total the total
     * @return the ReservationCapacityPatch builder
     */
    public Builder total(long total) {
      this.total = total;
      return this;
    }
  }

  protected ReservationCapacityPatch() { }

  protected ReservationCapacityPatch(Builder builder) {
    total = builder.total;
  }

  /**
   * New builder.
   *
   * @return a ReservationCapacityPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the total.
   *
   * The total amount to use for this capacity reservation.
   *
   * @return the total
   */
  public Long total() {
    return total;
  }
}

