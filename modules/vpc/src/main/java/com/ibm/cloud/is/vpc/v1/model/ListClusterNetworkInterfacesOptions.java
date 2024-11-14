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
 * The listClusterNetworkInterfaces options.
 */
public class ListClusterNetworkInterfacesOptions extends GenericModel {

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

  protected String clusterNetworkId;
  protected String start;
  protected Long limit;
  protected String name;
  protected String sort;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String start;
    private Long limit;
    private String name;
    private String sort;

    /**
     * Instantiates a new Builder from an existing ListClusterNetworkInterfacesOptions instance.
     *
     * @param listClusterNetworkInterfacesOptions the instance to initialize the Builder with
     */
    private Builder(ListClusterNetworkInterfacesOptions listClusterNetworkInterfacesOptions) {
      this.clusterNetworkId = listClusterNetworkInterfacesOptions.clusterNetworkId;
      this.start = listClusterNetworkInterfacesOptions.start;
      this.limit = listClusterNetworkInterfacesOptions.limit;
      this.name = listClusterNetworkInterfacesOptions.name;
      this.sort = listClusterNetworkInterfacesOptions.sort;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clusterNetworkId the clusterNetworkId
     */
    public Builder(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
    }

    /**
     * Builds a ListClusterNetworkInterfacesOptions.
     *
     * @return the new ListClusterNetworkInterfacesOptions instance
     */
    public ListClusterNetworkInterfacesOptions build() {
      return new ListClusterNetworkInterfacesOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the ListClusterNetworkInterfacesOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListClusterNetworkInterfacesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListClusterNetworkInterfacesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListClusterNetworkInterfacesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListClusterNetworkInterfacesOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  protected ListClusterNetworkInterfacesOptions() { }

  protected ListClusterNetworkInterfacesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    start = builder.start;
    limit = builder.limit;
    name = builder.name;
    sort = builder.sort;
  }

  /**
   * New builder.
   *
   * @return a ListClusterNetworkInterfacesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterNetworkId.
   *
   * The cluster network identifier.
   *
   * @return the clusterNetworkId
   */
  public String clusterNetworkId() {
    return clusterNetworkId;
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

