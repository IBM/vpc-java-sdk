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
 * The listReservations options.
 */
public class ListReservationsOptions extends GenericModel {

  /**
   * Filters the collection to reservations with an `affinity_policy` property matching the specified value.
   */
  public interface AffinityPolicy {
    /** automatic. */
    String AUTOMATIC = "automatic";
    /** restricted. */
    String RESTRICTED = "restricted";
  }

  protected String start;
  protected Long limit;
  protected String name;
  protected String profileResourceType;
  protected String affinityPolicy;
  protected String resourceGroupId;
  protected String zoneName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String name;
    private String profileResourceType;
    private String affinityPolicy;
    private String resourceGroupId;
    private String zoneName;

    /**
     * Instantiates a new Builder from an existing ListReservationsOptions instance.
     *
     * @param listReservationsOptions the instance to initialize the Builder with
     */
    private Builder(ListReservationsOptions listReservationsOptions) {
      this.start = listReservationsOptions.start;
      this.limit = listReservationsOptions.limit;
      this.name = listReservationsOptions.name;
      this.profileResourceType = listReservationsOptions.profileResourceType;
      this.affinityPolicy = listReservationsOptions.affinityPolicy;
      this.resourceGroupId = listReservationsOptions.resourceGroupId;
      this.zoneName = listReservationsOptions.zoneName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListReservationsOptions.
     *
     * @return the new ListReservationsOptions instance
     */
    public ListReservationsOptions build() {
      return new ListReservationsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListReservationsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListReservationsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListReservationsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profileResourceType.
     *
     * @param profileResourceType the profileResourceType
     * @return the ListReservationsOptions builder
     */
    public Builder profileResourceType(String profileResourceType) {
      this.profileResourceType = profileResourceType;
      return this;
    }

    /**
     * Set the affinityPolicy.
     *
     * @param affinityPolicy the affinityPolicy
     * @return the ListReservationsOptions builder
     */
    public Builder affinityPolicy(String affinityPolicy) {
      this.affinityPolicy = affinityPolicy;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListReservationsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the ListReservationsOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }
  }

  protected ListReservationsOptions() { }

  protected ListReservationsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    name = builder.name;
    profileResourceType = builder.profileResourceType;
    affinityPolicy = builder.affinityPolicy;
    resourceGroupId = builder.resourceGroupId;
    zoneName = builder.zoneName;
  }

  /**
   * New builder.
   *
   * @return a ListReservationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with a `name` property matching the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profileResourceType.
   *
   * Filters the collection of resources with a `profile.resource_type` property matching the specified value.
   *
   * @return the profileResourceType
   */
  public String profileResourceType() {
    return profileResourceType;
  }

  /**
   * Gets the affinityPolicy.
   *
   * Filters the collection to reservations with an `affinity_policy` property matching the specified value.
   *
   * @return the affinityPolicy
   */
  public String affinityPolicy() {
    return affinityPolicy;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Filters the collection to resources with a `resource_group.id` property matching the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the zoneName.
   *
   * Filters the collection to resources with a `zone.name` property matching the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }
}

