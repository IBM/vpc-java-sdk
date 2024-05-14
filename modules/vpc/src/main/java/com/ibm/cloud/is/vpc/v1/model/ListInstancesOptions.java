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
 * The listInstances options.
 */
public class ListInstancesOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String name;
  protected String dedicatedHostId;
  protected String dedicatedHostCrn;
  protected String dedicatedHostName;
  protected String placementGroupId;
  protected String placementGroupCrn;
  protected String placementGroupName;
  protected String reservationId;
  protected String reservationCrn;
  protected String reservationName;
  protected String vpcId;
  protected String vpcCrn;
  protected String vpcName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private String dedicatedHostId;
    private String dedicatedHostCrn;
    private String dedicatedHostName;
    private String placementGroupId;
    private String placementGroupCrn;
    private String placementGroupName;
    private String reservationId;
    private String reservationCrn;
    private String reservationName;
    private String vpcId;
    private String vpcCrn;
    private String vpcName;

    /**
     * Instantiates a new Builder from an existing ListInstancesOptions instance.
     *
     * @param listInstancesOptions the instance to initialize the Builder with
     */
    private Builder(ListInstancesOptions listInstancesOptions) {
      this.start = listInstancesOptions.start;
      this.limit = listInstancesOptions.limit;
      this.resourceGroupId = listInstancesOptions.resourceGroupId;
      this.name = listInstancesOptions.name;
      this.dedicatedHostId = listInstancesOptions.dedicatedHostId;
      this.dedicatedHostCrn = listInstancesOptions.dedicatedHostCrn;
      this.dedicatedHostName = listInstancesOptions.dedicatedHostName;
      this.placementGroupId = listInstancesOptions.placementGroupId;
      this.placementGroupCrn = listInstancesOptions.placementGroupCrn;
      this.placementGroupName = listInstancesOptions.placementGroupName;
      this.reservationId = listInstancesOptions.reservationId;
      this.reservationCrn = listInstancesOptions.reservationCrn;
      this.reservationName = listInstancesOptions.reservationName;
      this.vpcId = listInstancesOptions.vpcId;
      this.vpcCrn = listInstancesOptions.vpcCrn;
      this.vpcName = listInstancesOptions.vpcName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListInstancesOptions.
     *
     * @return the new ListInstancesOptions instance
     */
    public ListInstancesOptions build() {
      return new ListInstancesOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListInstancesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListInstancesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListInstancesOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListInstancesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the dedicatedHostId.
     *
     * @param dedicatedHostId the dedicatedHostId
     * @return the ListInstancesOptions builder
     */
    public Builder dedicatedHostId(String dedicatedHostId) {
      this.dedicatedHostId = dedicatedHostId;
      return this;
    }

    /**
     * Set the dedicatedHostCrn.
     *
     * @param dedicatedHostCrn the dedicatedHostCrn
     * @return the ListInstancesOptions builder
     */
    public Builder dedicatedHostCrn(String dedicatedHostCrn) {
      this.dedicatedHostCrn = dedicatedHostCrn;
      return this;
    }

    /**
     * Set the dedicatedHostName.
     *
     * @param dedicatedHostName the dedicatedHostName
     * @return the ListInstancesOptions builder
     */
    public Builder dedicatedHostName(String dedicatedHostName) {
      this.dedicatedHostName = dedicatedHostName;
      return this;
    }

    /**
     * Set the placementGroupId.
     *
     * @param placementGroupId the placementGroupId
     * @return the ListInstancesOptions builder
     */
    public Builder placementGroupId(String placementGroupId) {
      this.placementGroupId = placementGroupId;
      return this;
    }

    /**
     * Set the placementGroupCrn.
     *
     * @param placementGroupCrn the placementGroupCrn
     * @return the ListInstancesOptions builder
     */
    public Builder placementGroupCrn(String placementGroupCrn) {
      this.placementGroupCrn = placementGroupCrn;
      return this;
    }

    /**
     * Set the placementGroupName.
     *
     * @param placementGroupName the placementGroupName
     * @return the ListInstancesOptions builder
     */
    public Builder placementGroupName(String placementGroupName) {
      this.placementGroupName = placementGroupName;
      return this;
    }

    /**
     * Set the reservationId.
     *
     * @param reservationId the reservationId
     * @return the ListInstancesOptions builder
     */
    public Builder reservationId(String reservationId) {
      this.reservationId = reservationId;
      return this;
    }

    /**
     * Set the reservationCrn.
     *
     * @param reservationCrn the reservationCrn
     * @return the ListInstancesOptions builder
     */
    public Builder reservationCrn(String reservationCrn) {
      this.reservationCrn = reservationCrn;
      return this;
    }

    /**
     * Set the reservationName.
     *
     * @param reservationName the reservationName
     * @return the ListInstancesOptions builder
     */
    public Builder reservationName(String reservationName) {
      this.reservationName = reservationName;
      return this;
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListInstancesOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the vpcCrn.
     *
     * @param vpcCrn the vpcCrn
     * @return the ListInstancesOptions builder
     */
    public Builder vpcCrn(String vpcCrn) {
      this.vpcCrn = vpcCrn;
      return this;
    }

    /**
     * Set the vpcName.
     *
     * @param vpcName the vpcName
     * @return the ListInstancesOptions builder
     */
    public Builder vpcName(String vpcName) {
      this.vpcName = vpcName;
      return this;
    }
  }

  protected ListInstancesOptions() { }

  protected ListInstancesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    dedicatedHostId = builder.dedicatedHostId;
    dedicatedHostCrn = builder.dedicatedHostCrn;
    dedicatedHostName = builder.dedicatedHostName;
    placementGroupId = builder.placementGroupId;
    placementGroupCrn = builder.placementGroupCrn;
    placementGroupName = builder.placementGroupName;
    reservationId = builder.reservationId;
    reservationCrn = builder.reservationCrn;
    reservationName = builder.reservationName;
    vpcId = builder.vpcId;
    vpcCrn = builder.vpcCrn;
    vpcName = builder.vpcName;
  }

  /**
   * New builder.
   *
   * @return a ListInstancesOptions builder
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
   * Gets the dedicatedHostId.
   *
   * Filters the collection to resources with a `dedicated_host.id` property matching the specified identifier.
   *
   * @return the dedicatedHostId
   */
  public String dedicatedHostId() {
    return dedicatedHostId;
  }

  /**
   * Gets the dedicatedHostCrn.
   *
   * Filters the collection to resources with a `dedicated_host.crn` property matching the specified CRN.
   *
   * @return the dedicatedHostCrn
   */
  public String dedicatedHostCrn() {
    return dedicatedHostCrn;
  }

  /**
   * Gets the dedicatedHostName.
   *
   * Filters the collection to resources with a `dedicated_host.name` property matching the exact specified name.
   *
   * @return the dedicatedHostName
   */
  public String dedicatedHostName() {
    return dedicatedHostName;
  }

  /**
   * Gets the placementGroupId.
   *
   * Filters the collection to resources with a `placement_target.id` property matching the specified placement group
   * identifier.
   *
   * @return the placementGroupId
   */
  public String placementGroupId() {
    return placementGroupId;
  }

  /**
   * Gets the placementGroupCrn.
   *
   * Filters the collection to resources with a `placement_target.crn` property matching the specified placement group
   * CRN.
   *
   * @return the placementGroupCrn
   */
  public String placementGroupCrn() {
    return placementGroupCrn;
  }

  /**
   * Gets the placementGroupName.
   *
   * Filters the collection to resources with a `placement_target.name` property matching the exact specified placement
   * group name.
   *
   * @return the placementGroupName
   */
  public String placementGroupName() {
    return placementGroupName;
  }

  /**
   * Gets the reservationId.
   *
   * Filters the collection to resources with a `reservation.id` property matching the specified identifier.
   *
   * @return the reservationId
   */
  public String reservationId() {
    return reservationId;
  }

  /**
   * Gets the reservationCrn.
   *
   * Filters the collection to resources with a `reservation.crn` property matching the specified CRN.
   *
   * @return the reservationCrn
   */
  public String reservationCrn() {
    return reservationCrn;
  }

  /**
   * Gets the reservationName.
   *
   * Filters the collection to resources with a `reservation.name` property matching the exact specified name.
   *
   * @return the reservationName
   */
  public String reservationName() {
    return reservationName;
  }

  /**
   * Gets the vpcId.
   *
   * Filters the collection to resources with a `vpc.id` property matching the specified identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the vpcCrn.
   *
   * Filters the collection to resources with a `vpc.crn` property matching the specified CRN.
   *
   * @return the vpcCrn
   */
  public String vpcCrn() {
    return vpcCrn;
  }

  /**
   * Gets the vpcName.
   *
   * Filters the collection to resources with a `vpc.name` property matching the exact specified name.
   *
   * @return the vpcName
   */
  public String vpcName() {
    return vpcName;
  }
}

