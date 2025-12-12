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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The [instance profile](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) or
 * [bare metal server profile](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile) to use for this
 * reservation.
 */
public class ReservationProfilePatch extends GenericModel {

  /**
   * The resource type of the profile.
   */
  public interface ResourceType {
    /** bare_metal_server_profile. */
    String BARE_METAL_SERVER_PROFILE = "bare_metal_server_profile";
    /** instance_profile. */
    String INSTANCE_PROFILE = "instance_profile";
  }

  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String resourceType;

    /**
     * Instantiates a new Builder from an existing ReservationProfilePatch instance.
     *
     * @param reservationProfilePatch the instance to initialize the Builder with
     */
    private Builder(ReservationProfilePatch reservationProfilePatch) {
      this.name = reservationProfilePatch.name;
      this.resourceType = reservationProfilePatch.resourceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ReservationProfilePatch.
     *
     * @return the new ReservationProfilePatch instance
     */
    public ReservationProfilePatch build() {
      return new ReservationProfilePatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ReservationProfilePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the ReservationProfilePatch builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }

  protected ReservationProfilePatch() { }

  protected ReservationProfilePatch(Builder builder) {
    name = builder.name;
    resourceType = builder.resourceType;
  }

  /**
   * New builder.
   *
   * @return a ReservationProfilePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The globally unique name of the profile.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type of the profile.
   *
   * @return the resourceType
   */
  public String resourceType() {
    return resourceType;
  }
}

