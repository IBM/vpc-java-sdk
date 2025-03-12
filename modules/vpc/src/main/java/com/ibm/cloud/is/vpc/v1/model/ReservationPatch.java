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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * ReservationPatch.
 */
public class ReservationPatch extends GenericModel {

  /**
   * The affinity policy to use for this reservation:
   * - `automatic`: The reservation will be automatically selected
   * - `restricted`: The reservation must be manually requested
   *
   * The affinity policy can only be changed for a reservation with a `status` of `inactive`.
   */
  public interface AffinityPolicy {
    /** automatic. */
    String AUTOMATIC = "automatic";
    /** restricted. */
    String RESTRICTED = "restricted";
  }

  @SerializedName("affinity_policy")
  protected String affinityPolicy;
  protected ReservationCapacityPatch capacity;
  @SerializedName("committed_use")
  protected ReservationCommittedUsePatch committedUse;
  protected String name;
  protected ReservationProfilePatch profile;

  /**
   * Builder.
   */
  public static class Builder {
    private String affinityPolicy;
    private ReservationCapacityPatch capacity;
    private ReservationCommittedUsePatch committedUse;
    private String name;
    private ReservationProfilePatch profile;

    /**
     * Instantiates a new Builder from an existing ReservationPatch instance.
     *
     * @param reservationPatch the instance to initialize the Builder with
     */
    private Builder(ReservationPatch reservationPatch) {
      this.affinityPolicy = reservationPatch.affinityPolicy;
      this.capacity = reservationPatch.capacity;
      this.committedUse = reservationPatch.committedUse;
      this.name = reservationPatch.name;
      this.profile = reservationPatch.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReservationPatch.
     *
     * @return the new ReservationPatch instance
     */
    public ReservationPatch build() {
      return new ReservationPatch(this);
    }

    /**
     * Set the affinityPolicy.
     *
     * @param affinityPolicy the affinityPolicy
     * @return the ReservationPatch builder
     */
    public Builder affinityPolicy(String affinityPolicy) {
      this.affinityPolicy = affinityPolicy;
      return this;
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the ReservationPatch builder
     */
    public Builder capacity(ReservationCapacityPatch capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the committedUse.
     *
     * @param committedUse the committedUse
     * @return the ReservationPatch builder
     */
    public Builder committedUse(ReservationCommittedUsePatch committedUse) {
      this.committedUse = committedUse;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReservationPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the ReservationPatch builder
     */
    public Builder profile(ReservationProfilePatch profile) {
      this.profile = profile;
      return this;
    }
  }

  protected ReservationPatch() { }

  protected ReservationPatch(Builder builder) {
    affinityPolicy = builder.affinityPolicy;
    capacity = builder.capacity;
    committedUse = builder.committedUse;
    name = builder.name;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a ReservationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the affinityPolicy.
   *
   * The affinity policy to use for this reservation:
   * - `automatic`: The reservation will be automatically selected
   * - `restricted`: The reservation must be manually requested
   *
   * The affinity policy can only be changed for a reservation with a `status` of `inactive`.
   *
   * @return the affinityPolicy
   */
  public String affinityPolicy() {
    return affinityPolicy;
  }

  /**
   * Gets the capacity.
   *
   * The capacity reservation configuration to use.
   *
   * The configuration can only be changed for reservations with a `status` of `inactive`.
   *
   * @return the capacity
   */
  public ReservationCapacityPatch capacity() {
    return capacity;
  }

  /**
   * Gets the committedUse.
   *
   * The committed use configuration to use for this reservation.
   *
   * @return the committedUse
   */
  public ReservationCommittedUsePatch committedUse() {
    return committedUse;
  }

  /**
   * Gets the name.
   *
   * The name for this reservation. The name must not be used by another reservation in the region.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The [instance profile](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) or
   * [bare metal server
   * profile](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile)
   * to use for this reservation.
   *
   * @return the profile
   */
  public ReservationProfilePatch profile() {
    return profile;
  }

  /**
   * Construct a JSON merge-patch from the ReservationPatch.
   *
   * Note that properties of the ReservationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ReservationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

