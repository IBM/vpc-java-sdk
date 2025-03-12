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
 * The listSnapshotConsistencyGroups options.
 */
public class ListSnapshotConsistencyGroupsOptions extends GenericModel {

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
  protected String name;
  protected String sort;
  protected String backupPolicyPlanId;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private String sort;
    private String backupPolicyPlanId;

    /**
     * Instantiates a new Builder from an existing ListSnapshotConsistencyGroupsOptions instance.
     *
     * @param listSnapshotConsistencyGroupsOptions the instance to initialize the Builder with
     */
    private Builder(ListSnapshotConsistencyGroupsOptions listSnapshotConsistencyGroupsOptions) {
      this.start = listSnapshotConsistencyGroupsOptions.start;
      this.limit = listSnapshotConsistencyGroupsOptions.limit;
      this.resourceGroupId = listSnapshotConsistencyGroupsOptions.resourceGroupId;
      this.name = listSnapshotConsistencyGroupsOptions.name;
      this.sort = listSnapshotConsistencyGroupsOptions.sort;
      this.backupPolicyPlanId = listSnapshotConsistencyGroupsOptions.backupPolicyPlanId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSnapshotConsistencyGroupsOptions.
     *
     * @return the new ListSnapshotConsistencyGroupsOptions instance
     */
    public ListSnapshotConsistencyGroupsOptions build() {
      return new ListSnapshotConsistencyGroupsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListSnapshotConsistencyGroupsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSnapshotConsistencyGroupsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListSnapshotConsistencyGroupsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListSnapshotConsistencyGroupsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListSnapshotConsistencyGroupsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the backupPolicyPlanId.
     *
     * @param backupPolicyPlanId the backupPolicyPlanId
     * @return the ListSnapshotConsistencyGroupsOptions builder
     */
    public Builder backupPolicyPlanId(String backupPolicyPlanId) {
      this.backupPolicyPlanId = backupPolicyPlanId;
      return this;
    }
  }

  protected ListSnapshotConsistencyGroupsOptions() { }

  protected ListSnapshotConsistencyGroupsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    sort = builder.sort;
    backupPolicyPlanId = builder.backupPolicyPlanId;
  }

  /**
   * New builder.
   *
   * @return a ListSnapshotConsistencyGroupsOptions builder
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
   * Gets the backupPolicyPlanId.
   *
   * Filters the collection to backup policy jobs with a `backup_policy_plan.id` property matching the specified
   * identifier.
   *
   * @return the backupPolicyPlanId
   */
  public String backupPolicyPlanId() {
    return backupPolicyPlanId;
  }
}

