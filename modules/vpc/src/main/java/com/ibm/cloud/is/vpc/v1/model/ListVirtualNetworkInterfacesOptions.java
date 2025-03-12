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
 * The listVirtualNetworkInterfaces options.
 */
public class ListVirtualNetworkInterfacesOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String resourceGroupId;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;

    /**
     * Instantiates a new Builder from an existing ListVirtualNetworkInterfacesOptions instance.
     *
     * @param listVirtualNetworkInterfacesOptions the instance to initialize the Builder with
     */
    private Builder(ListVirtualNetworkInterfacesOptions listVirtualNetworkInterfacesOptions) {
      this.start = listVirtualNetworkInterfacesOptions.start;
      this.limit = listVirtualNetworkInterfacesOptions.limit;
      this.resourceGroupId = listVirtualNetworkInterfacesOptions.resourceGroupId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListVirtualNetworkInterfacesOptions.
     *
     * @return the new ListVirtualNetworkInterfacesOptions instance
     */
    public ListVirtualNetworkInterfacesOptions build() {
      return new ListVirtualNetworkInterfacesOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVirtualNetworkInterfacesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVirtualNetworkInterfacesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListVirtualNetworkInterfacesOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }
  }

  protected ListVirtualNetworkInterfacesOptions() { }

  protected ListVirtualNetworkInterfacesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
  }

  /**
   * New builder.
   *
   * @return a ListVirtualNetworkInterfacesOptions builder
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
}

