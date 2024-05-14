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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ReservationCommittedUsePrototype.
 */
public class ReservationCommittedUsePrototype extends GenericModel {

  /**
   * The policy to apply when the committed use term expires:
   * - `release`: Release any available capacity and let the reservation expire.
   * - `renew`: Renew for another term, provided the term remains listed in the
   *   `reservation_terms` for the profile. Otherwise, let the reservation expire.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
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
     * Instantiates a new Builder from an existing ReservationCommittedUsePrototype instance.
     *
     * @param reservationCommittedUsePrototype the instance to initialize the Builder with
     */
    private Builder(ReservationCommittedUsePrototype reservationCommittedUsePrototype) {
      this.expirationPolicy = reservationCommittedUsePrototype.expirationPolicy;
      this.term = reservationCommittedUsePrototype.term;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param term the term
     */
    public Builder(String term) {
      this.term = term;
    }

    /**
     * Builds a ReservationCommittedUsePrototype.
     *
     * @return the new ReservationCommittedUsePrototype instance
     */
    public ReservationCommittedUsePrototype build() {
      return new ReservationCommittedUsePrototype(this);
    }

    /**
     * Set the expirationPolicy.
     *
     * @param expirationPolicy the expirationPolicy
     * @return the ReservationCommittedUsePrototype builder
     */
    public Builder expirationPolicy(String expirationPolicy) {
      this.expirationPolicy = expirationPolicy;
      return this;
    }

    /**
     * Set the term.
     *
     * @param term the term
     * @return the ReservationCommittedUsePrototype builder
     */
    public Builder term(String term) {
      this.term = term;
      return this;
    }
  }

  protected ReservationCommittedUsePrototype() { }

  protected ReservationCommittedUsePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.term,
      "term cannot be null");
    expirationPolicy = builder.expirationPolicy;
    term = builder.term;
  }

  /**
   * New builder.
   *
   * @return a ReservationCommittedUsePrototype builder
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
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
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
   * The specified value must be listed in the `reservation_terms` in the profile for this reservation.
   *
   * @return the term
   */
  public String term() {
    return term;
  }
}

