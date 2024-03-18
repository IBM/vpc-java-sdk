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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateReservation options.
 */
public class UpdateReservationOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> reservationPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> reservationPatch;

    /**
     * Instantiates a new Builder from an existing UpdateReservationOptions instance.
     *
     * @param updateReservationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateReservationOptions updateReservationOptions) {
      this.id = updateReservationOptions.id;
      this.reservationPatch = updateReservationOptions.reservationPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param reservationPatch the reservationPatch
     */
    public Builder(String id, Map<String, Object> reservationPatch) {
      this.id = id;
      this.reservationPatch = reservationPatch;
    }

    /**
     * Builds a UpdateReservationOptions.
     *
     * @return the new UpdateReservationOptions instance
     */
    public UpdateReservationOptions build() {
      return new UpdateReservationOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateReservationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the reservationPatch.
     *
     * @param reservationPatch the reservationPatch
     * @return the UpdateReservationOptions builder
     */
    public Builder reservationPatch(Map<String, Object> reservationPatch) {
      this.reservationPatch = reservationPatch;
      return this;
    }
  }

  protected UpdateReservationOptions() { }

  protected UpdateReservationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.reservationPatch,
      "reservationPatch cannot be null");
    id = builder.id;
    reservationPatch = builder.reservationPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateReservationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The reservation identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the reservationPatch.
   *
   * The reservation patch.
   *
   * @return the reservationPatch
   */
  public Map<String, Object> reservationPatch() {
    return reservationPatch;
  }
}

