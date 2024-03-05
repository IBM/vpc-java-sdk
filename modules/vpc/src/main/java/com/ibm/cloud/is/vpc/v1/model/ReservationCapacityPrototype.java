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
 * The capacity reservation configuration to use.
 */
public class ReservationCapacityPrototype extends GenericModel {

  protected Long total;

  /**
   * Builder.
   */
  public static class Builder {
    private Long total;

    /**
     * Instantiates a new Builder from an existing ReservationCapacityPrototype instance.
     *
     * @param reservationCapacityPrototype the instance to initialize the Builder with
     */
    private Builder(ReservationCapacityPrototype reservationCapacityPrototype) {
      this.total = reservationCapacityPrototype.total;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param total the total
     */
    public Builder(Long total) {
      this.total = total;
    }

    /**
     * Builds a ReservationCapacityPrototype.
     *
     * @return the new ReservationCapacityPrototype instance
     */
    public ReservationCapacityPrototype build() {
      return new ReservationCapacityPrototype(this);
    }

    /**
     * Set the total.
     *
     * @param total the total
     * @return the ReservationCapacityPrototype builder
     */
    public Builder total(long total) {
      this.total = total;
      return this;
    }
  }

  protected ReservationCapacityPrototype() { }

  protected ReservationCapacityPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.total,
      "total cannot be null");
    total = builder.total;
  }

  /**
   * New builder.
   *
   * @return a ReservationCapacityPrototype builder
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

