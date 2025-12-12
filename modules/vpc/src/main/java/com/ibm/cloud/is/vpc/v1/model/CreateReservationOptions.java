/*
 * (C) Copyright IBM Corp. 2025.
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
 * The createReservation options.
 */
public class CreateReservationOptions extends GenericModel {

  /**
   * The affinity policy to use for this reservation:
   * - `automatic`: The reservation will be automatically selected
   * - `restricted`: The reservation must be manually requested.
   */
  public interface AffinityPolicy {
    /** automatic. */
    String AUTOMATIC = "automatic";
    /** restricted. */
    String RESTRICTED = "restricted";
  }

  protected ReservationCapacityPrototype capacity;
  protected ReservationCommittedUsePrototype committedUse;
  protected ReservationProfilePrototype profile;
  protected ZoneIdentity zone;
  protected String affinityPolicy;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private ReservationCapacityPrototype capacity;
    private ReservationCommittedUsePrototype committedUse;
    private ReservationProfilePrototype profile;
    private ZoneIdentity zone;
    private String affinityPolicy;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreateReservationOptions instance.
     *
     * @param createReservationOptions the instance to initialize the Builder with
     */
    private Builder(CreateReservationOptions createReservationOptions) {
      this.capacity = createReservationOptions.capacity;
      this.committedUse = createReservationOptions.committedUse;
      this.profile = createReservationOptions.profile;
      this.zone = createReservationOptions.zone;
      this.affinityPolicy = createReservationOptions.affinityPolicy;
      this.name = createReservationOptions.name;
      this.resourceGroup = createReservationOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param capacity the capacity
     * @param committedUse the committedUse
     * @param profile the profile
     * @param zone the zone
     */
    public Builder(ReservationCapacityPrototype capacity, ReservationCommittedUsePrototype committedUse, ReservationProfilePrototype profile, ZoneIdentity zone) {
      this.capacity = capacity;
      this.committedUse = committedUse;
      this.profile = profile;
      this.zone = zone;
    }

    /**
     * Builds a CreateReservationOptions.
     *
     * @return the new CreateReservationOptions instance
     */
    public CreateReservationOptions build() {
      return new CreateReservationOptions(this);
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the CreateReservationOptions builder
     */
    public Builder capacity(ReservationCapacityPrototype capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the committedUse.
     *
     * @param committedUse the committedUse
     * @return the CreateReservationOptions builder
     */
    public Builder committedUse(ReservationCommittedUsePrototype committedUse) {
      this.committedUse = committedUse;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the CreateReservationOptions builder
     */
    public Builder profile(ReservationProfilePrototype profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateReservationOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the affinityPolicy.
     *
     * @param affinityPolicy the affinityPolicy
     * @return the CreateReservationOptions builder
     */
    public Builder affinityPolicy(String affinityPolicy) {
      this.affinityPolicy = affinityPolicy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateReservationOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateReservationOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateReservationOptions() { }

  protected CreateReservationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.capacity,
      "capacity cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.committedUse,
      "committedUse cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    capacity = builder.capacity;
    committedUse = builder.committedUse;
    profile = builder.profile;
    zone = builder.zone;
    affinityPolicy = builder.affinityPolicy;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateReservationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the capacity.
   *
   * The capacity reservation configuration to use.
   *
   * @return the capacity
   */
  public ReservationCapacityPrototype capacity() {
    return capacity;
  }

  /**
   * Gets the committedUse.
   *
   * The committed use configuration to use for this reservation.
   *
   * @return the committedUse
   */
  public ReservationCommittedUsePrototype committedUse() {
    return committedUse;
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
  public ReservationProfilePrototype profile() {
    return profile;
  }

  /**
   * Gets the zone.
   *
   * The zone to use for this reservation.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the affinityPolicy.
   *
   * The affinity policy to use for this reservation:
   * - `automatic`: The reservation will be automatically selected
   * - `restricted`: The reservation must be manually requested.
   *
   * @return the affinityPolicy
   */
  public String affinityPolicy() {
    return affinityPolicy;
  }

  /**
   * Gets the name.
   *
   * The name for this reservation. The name must not be used by another reservation in the region. If unspecified, the
   * name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

