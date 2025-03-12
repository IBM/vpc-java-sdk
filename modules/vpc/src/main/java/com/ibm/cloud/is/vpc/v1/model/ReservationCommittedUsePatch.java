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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ReservationCommittedUsePatch.
 */
public class ReservationCommittedUsePatch extends GenericModel {

  /**
   * The policy to apply when the committed use term expires:
   * - `release`: Release any available capacity and let the reservation expire.
   * - `renew`: Renew for another term, provided the term remains listed in the
   *   `reservation_terms` for the profile. Otherwise, let the reservation expire.
   */
  public interface ExpirationPolicy {
    /** release. */
    String RELEASE = "release";
    /** renew. */
    String RENEW = "renew";
  }

  @SerializedName("expiration_policy")
  protected String expirationPolicy;
  protected String term;

  /**
   * Builder.
   */
  public static class Builder {
    private String expirationPolicy;
    private String term;

    /**
     * Instantiates a new Builder from an existing ReservationCommittedUsePatch instance.
     *
     * @param reservationCommittedUsePatch the instance to initialize the Builder with
     */
    private Builder(ReservationCommittedUsePatch reservationCommittedUsePatch) {
      this.expirationPolicy = reservationCommittedUsePatch.expirationPolicy;
      this.term = reservationCommittedUsePatch.term;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReservationCommittedUsePatch.
     *
     * @return the new ReservationCommittedUsePatch instance
     */
    public ReservationCommittedUsePatch build() {
      return new ReservationCommittedUsePatch(this);
    }

    /**
     * Set the expirationPolicy.
     *
     * @param expirationPolicy the expirationPolicy
     * @return the ReservationCommittedUsePatch builder
     */
    public Builder expirationPolicy(String expirationPolicy) {
      this.expirationPolicy = expirationPolicy;
      return this;
    }

    /**
     * Set the term.
     *
     * @param term the term
     * @return the ReservationCommittedUsePatch builder
     */
    public Builder term(String term) {
      this.term = term;
      return this;
    }
  }

  protected ReservationCommittedUsePatch() { }

  protected ReservationCommittedUsePatch(Builder builder) {
    expirationPolicy = builder.expirationPolicy;
    term = builder.term;
  }

  /**
   * New builder.
   *
   * @return a ReservationCommittedUsePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the expirationPolicy.
   *
   * The policy to apply when the committed use term expires:
   * - `release`: Release any available capacity and let the reservation expire.
   * - `renew`: Renew for another term, provided the term remains listed in the
   *   `reservation_terms` for the profile. Otherwise, let the reservation expire.
   *
   * @return the expirationPolicy
   */
  public String expirationPolicy() {
    return expirationPolicy;
  }

  /**
   * Gets the term.
   *
   * The term for this committed use reservation:
   * - `one_year`: 1 year
   * - `three_year`: 3 years
   *
   * The specified value must be listed in the `reservation_terms` in the profile for this reservation. The term can
   * only be changed for a reservation with a `status` of
   * `inactive`.
   *
   * @return the term
   */
  public String term() {
    return term;
  }
}

