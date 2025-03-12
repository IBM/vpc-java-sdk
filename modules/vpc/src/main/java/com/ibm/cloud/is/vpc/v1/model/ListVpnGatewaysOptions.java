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
 * The listVpnGateways options.
 */
public class ListVpnGatewaysOptions extends GenericModel {

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
   * Filters the collection to VPN gateways with a `mode` property matching the specified value.
   */
  public interface Mode {
    /** policy. */
    String POLICY = "policy";
    /** route. */
    String ROUTE = "route";
  }

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String sort;
  protected String mode;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String sort;
    private String mode;

    /**
     * Instantiates a new Builder from an existing ListVpnGatewaysOptions instance.
     *
     * @param listVpnGatewaysOptions the instance to initialize the Builder with
     */
    private Builder(ListVpnGatewaysOptions listVpnGatewaysOptions) {
      this.start = listVpnGatewaysOptions.start;
      this.limit = listVpnGatewaysOptions.limit;
      this.resourceGroupId = listVpnGatewaysOptions.resourceGroupId;
      this.sort = listVpnGatewaysOptions.sort;
      this.mode = listVpnGatewaysOptions.mode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListVpnGatewaysOptions.
     *
     * @return the new ListVpnGatewaysOptions instance
     */
    public ListVpnGatewaysOptions build() {
      return new ListVpnGatewaysOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVpnGatewaysOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVpnGatewaysOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListVpnGatewaysOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListVpnGatewaysOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the mode.
     *
     * @param mode the mode
     * @return the ListVpnGatewaysOptions builder
     */
    public Builder mode(String mode) {
      this.mode = mode;
      return this;
    }
  }

  protected ListVpnGatewaysOptions() { }

  protected ListVpnGatewaysOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    sort = builder.sort;
    mode = builder.mode;
  }

  /**
   * New builder.
   *
   * @return a ListVpnGatewaysOptions builder
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
   * Gets the mode.
   *
   * Filters the collection to VPN gateways with a `mode` property matching the specified value.
   *
   * @return the mode
   */
  public String mode() {
    return mode;
  }
}

