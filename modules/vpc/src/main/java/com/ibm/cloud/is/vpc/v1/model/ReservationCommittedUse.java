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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The committed use reservation configuration.
 */
public class ReservationCommittedUse extends GenericModel {

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

  @SerializedName("expiration_at")
  protected Date expirationAt;
  @SerializedName("expiration_policy")
  protected String expirationPolicy;
  protected String term;

  protected ReservationCommittedUse() { }

  /**
   * Gets the expirationAt.
   *
   * The expiration date and time for this committed use reservation.
   *
   * @return the expirationAt
   */
  public Date getExpirationAt() {
    return expirationAt;
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
  public String getExpirationPolicy() {
    return expirationPolicy;
  }

  /**
   * Gets the term.
   *
   * The term for this committed use reservation:
   * - `one_year`: 1 year
   * - `three_year`: 3 years
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the term
   */
  public String getTerm() {
    return term;
  }
}

