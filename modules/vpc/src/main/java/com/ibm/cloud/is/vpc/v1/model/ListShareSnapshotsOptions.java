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
 * The listShareSnapshots options.
 */
public class ListShareSnapshotsOptions extends GenericModel {

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

  protected String shareId;
  protected String backupPolicyPlanId;
  protected String name;
  protected String start;
  protected Long limit;
  protected String sort;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String backupPolicyPlanId;
    private String name;
    private String start;
    private Long limit;
    private String sort;

    /**
     * Instantiates a new Builder from an existing ListShareSnapshotsOptions instance.
     *
     * @param listShareSnapshotsOptions the instance to initialize the Builder with
     */
    private Builder(ListShareSnapshotsOptions listShareSnapshotsOptions) {
      this.shareId = listShareSnapshotsOptions.shareId;
      this.backupPolicyPlanId = listShareSnapshotsOptions.backupPolicyPlanId;
      this.name = listShareSnapshotsOptions.name;
      this.start = listShareSnapshotsOptions.start;
      this.limit = listShareSnapshotsOptions.limit;
      this.sort = listShareSnapshotsOptions.sort;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param shareId the shareId
     */
    public Builder(String shareId) {
      this.shareId = shareId;
    }

    /**
     * Builds a ListShareSnapshotsOptions.
     *
     * @return the new ListShareSnapshotsOptions instance
     */
    public ListShareSnapshotsOptions build() {
      return new ListShareSnapshotsOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the ListShareSnapshotsOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the backupPolicyPlanId.
     *
     * @param backupPolicyPlanId the backupPolicyPlanId
     * @return the ListShareSnapshotsOptions builder
     */
    public Builder backupPolicyPlanId(String backupPolicyPlanId) {
      this.backupPolicyPlanId = backupPolicyPlanId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListShareSnapshotsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListShareSnapshotsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListShareSnapshotsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListShareSnapshotsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  protected ListShareSnapshotsOptions() { }

  protected ListShareSnapshotsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    shareId = builder.shareId;
    backupPolicyPlanId = builder.backupPolicyPlanId;
    name = builder.name;
    start = builder.start;
    limit = builder.limit;
    sort = builder.sort;
  }

  /**
   * New builder.
   *
   * @return a ListShareSnapshotsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the shareId.
   *
   * The file share identifier, or `-` to wildcard all accessible file shares.
   *
   * @return the shareId
   */
  public String shareId() {
    return shareId;
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
}

