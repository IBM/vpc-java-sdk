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
 * The listFloatingIps options.
 */
public class ListFloatingIpsOptions extends GenericModel {

  /**
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value `-created_at` sorts the collection by the `created_at` property
   * in descending order, and the value `name` sorts it by the `name` property in ascending order.
   */
  public interface Sort {
    /** created_at. */
    String CREATED_AT = "created_at";
    /** name. */
    String NAME = "name";
  }

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String sort;
  protected String targetId;
  protected String targetCrn;
  protected String targetName;
  protected String targetResourceType;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String sort;
    private String targetId;
    private String targetCrn;
    private String targetName;
    private String targetResourceType;

    /**
     * Instantiates a new Builder from an existing ListFloatingIpsOptions instance.
     *
     * @param listFloatingIpsOptions the instance to initialize the Builder with
     */
    private Builder(ListFloatingIpsOptions listFloatingIpsOptions) {
      this.start = listFloatingIpsOptions.start;
      this.limit = listFloatingIpsOptions.limit;
      this.resourceGroupId = listFloatingIpsOptions.resourceGroupId;
      this.sort = listFloatingIpsOptions.sort;
      this.targetId = listFloatingIpsOptions.targetId;
      this.targetCrn = listFloatingIpsOptions.targetCrn;
      this.targetName = listFloatingIpsOptions.targetName;
      this.targetResourceType = listFloatingIpsOptions.targetResourceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListFloatingIpsOptions.
     *
     * @return the new ListFloatingIpsOptions instance
     */
    public ListFloatingIpsOptions build() {
      return new ListFloatingIpsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListFloatingIpsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListFloatingIpsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListFloatingIpsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListFloatingIpsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the targetId.
     *
     * @param targetId the targetId
     * @return the ListFloatingIpsOptions builder
     */
    public Builder targetId(String targetId) {
      this.targetId = targetId;
      return this;
    }

    /**
     * Set the targetCrn.
     *
     * @param targetCrn the targetCrn
     * @return the ListFloatingIpsOptions builder
     */
    public Builder targetCrn(String targetCrn) {
      this.targetCrn = targetCrn;
      return this;
    }

    /**
     * Set the targetName.
     *
     * @param targetName the targetName
     * @return the ListFloatingIpsOptions builder
     */
    public Builder targetName(String targetName) {
      this.targetName = targetName;
      return this;
    }

    /**
     * Set the targetResourceType.
     *
     * @param targetResourceType the targetResourceType
     * @return the ListFloatingIpsOptions builder
     */
    public Builder targetResourceType(String targetResourceType) {
      this.targetResourceType = targetResourceType;
      return this;
    }
  }

  protected ListFloatingIpsOptions() { }

  protected ListFloatingIpsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    sort = builder.sort;
    targetId = builder.targetId;
    targetCrn = builder.targetCrn;
    targetName = builder.targetName;
    targetResourceType = builder.targetResourceType;
  }

  /**
   * New builder.
   *
   * @return a ListFloatingIpsOptions builder
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
   * Gets the sort.
   *
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value `-created_at` sorts the collection by the `created_at` property
   * in descending order, and the value `name` sorts it by the `name` property in ascending order.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }

  /**
   * Gets the targetId.
   *
   * Filters the collection to resources with a `target.id` property matching the specified identifier.
   *
   * @return the targetId
   */
  public String targetId() {
    return targetId;
  }

  /**
   * Gets the targetCrn.
   *
   * Filters the collection to resources with a `target.crn` property matching the specified CRN.
   *
   * @return the targetCrn
   */
  public String targetCrn() {
    return targetCrn;
  }

  /**
   * Gets the targetName.
   *
   * Filters the collection to resources with a `target.name` property matching the exact specified name.
   *
   * @return the targetName
   */
  public String targetName() {
    return targetName;
  }

  /**
   * Gets the targetResourceType.
   *
   * Filters the collection to resources with a `target.resource_type` property matching the specified value.
   *
   * @return the targetResourceType
   */
  public String targetResourceType() {
    return targetResourceType;
  }
}

