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
 * The listShares options.
 */
public class ListSharesOptions extends GenericModel {

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

  /**
   * Filters the collection to file shares with a `replication_role` property matching the specified value.
   */
  public interface ReplicationRole {
    /** none. */
    String NONE = "none";
    /** replica. */
    String REPLICA = "replica";
    /** source. */
    String SOURCE = "source";
  }

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String name;
  protected String sort;
  protected String replicationRole;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private String sort;
    private String replicationRole;

    /**
     * Instantiates a new Builder from an existing ListSharesOptions instance.
     *
     * @param listSharesOptions the instance to initialize the Builder with
     */
    private Builder(ListSharesOptions listSharesOptions) {
      this.start = listSharesOptions.start;
      this.limit = listSharesOptions.limit;
      this.resourceGroupId = listSharesOptions.resourceGroupId;
      this.name = listSharesOptions.name;
      this.sort = listSharesOptions.sort;
      this.replicationRole = listSharesOptions.replicationRole;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSharesOptions.
     *
     * @return the new ListSharesOptions instance
     */
    public ListSharesOptions build() {
      return new ListSharesOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListSharesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSharesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListSharesOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListSharesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListSharesOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the replicationRole.
     *
     * @param replicationRole the replicationRole
     * @return the ListSharesOptions builder
     */
    public Builder replicationRole(String replicationRole) {
      this.replicationRole = replicationRole;
      return this;
    }
  }

  protected ListSharesOptions() { }

  protected ListSharesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    sort = builder.sort;
    replicationRole = builder.replicationRole;
  }

  /**
   * New builder.
   *
   * @return a ListSharesOptions builder
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
   * Gets the replicationRole.
   *
   * Filters the collection to file shares with a `replication_role` property matching the specified value.
   *
   * @return the replicationRole
   */
  public String replicationRole() {
    return replicationRole;
  }
}

