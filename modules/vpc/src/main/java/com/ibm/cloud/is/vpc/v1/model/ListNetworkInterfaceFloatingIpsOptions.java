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
 * The listNetworkInterfaceFloatingIps options.
 */
public class ListNetworkInterfaceFloatingIpsOptions extends GenericModel {

  /**
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value
   * `-name` sorts the collection by the `name` property in descending order, and the value `name` sorts it by the
   * `name` property in ascending order.
   */
  public interface Sort {
    /** address. */
    String ADDRESS = "address";
    /** name. */
    String NAME = "name";
  }

  protected String virtualNetworkInterfaceId;
  protected String start;
  protected Long limit;
  protected String sort;

  /**
   * Builder.
   */
  public static class Builder {
    private String virtualNetworkInterfaceId;
    private String start;
    private Long limit;
    private String sort;

    /**
     * Instantiates a new Builder from an existing ListNetworkInterfaceFloatingIpsOptions instance.
     *
     * @param listNetworkInterfaceFloatingIpsOptions the instance to initialize the Builder with
     */
    private Builder(ListNetworkInterfaceFloatingIpsOptions listNetworkInterfaceFloatingIpsOptions) {
      this.virtualNetworkInterfaceId = listNetworkInterfaceFloatingIpsOptions.virtualNetworkInterfaceId;
      this.start = listNetworkInterfaceFloatingIpsOptions.start;
      this.limit = listNetworkInterfaceFloatingIpsOptions.limit;
      this.sort = listNetworkInterfaceFloatingIpsOptions.sort;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param virtualNetworkInterfaceId the virtualNetworkInterfaceId
     */
    public Builder(String virtualNetworkInterfaceId) {
      this.virtualNetworkInterfaceId = virtualNetworkInterfaceId;
    }

    /**
     * Builds a ListNetworkInterfaceFloatingIpsOptions.
     *
     * @return the new ListNetworkInterfaceFloatingIpsOptions instance
     */
    public ListNetworkInterfaceFloatingIpsOptions build() {
      return new ListNetworkInterfaceFloatingIpsOptions(this);
    }

    /**
     * Set the virtualNetworkInterfaceId.
     *
     * @param virtualNetworkInterfaceId the virtualNetworkInterfaceId
     * @return the ListNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder virtualNetworkInterfaceId(String virtualNetworkInterfaceId) {
      this.virtualNetworkInterfaceId = virtualNetworkInterfaceId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  protected ListNetworkInterfaceFloatingIpsOptions() { }

  protected ListNetworkInterfaceFloatingIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.virtualNetworkInterfaceId,
      "virtualNetworkInterfaceId cannot be empty");
    virtualNetworkInterfaceId = builder.virtualNetworkInterfaceId;
    start = builder.start;
    limit = builder.limit;
    sort = builder.sort;
  }

  /**
   * New builder.
   *
   * @return a ListNetworkInterfaceFloatingIpsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the virtualNetworkInterfaceId.
   *
   * The virtual network interface identifier.
   *
   * @return the virtualNetworkInterfaceId
   */
  public String virtualNetworkInterfaceId() {
    return virtualNetworkInterfaceId;
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
   * to sort in descending order. For example, the value
   * `-name` sorts the collection by the `name` property in descending order, and the value `name` sorts it by the
   * `name` property in ascending order.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }
}

