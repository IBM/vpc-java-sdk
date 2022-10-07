/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
 * The listNetworkAcls options.
 */
public class ListNetworkAclsOptions extends GenericModel {

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
     * Instantiates a new Builder from an existing ListNetworkAclsOptions instance.
     *
     * @param listNetworkAclsOptions the instance to initialize the Builder with
     */
    private Builder(ListNetworkAclsOptions listNetworkAclsOptions) {
      this.start = listNetworkAclsOptions.start;
      this.limit = listNetworkAclsOptions.limit;
      this.resourceGroupId = listNetworkAclsOptions.resourceGroupId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListNetworkAclsOptions.
     *
     * @return the new ListNetworkAclsOptions instance
     */
    public ListNetworkAclsOptions build() {
      return new ListNetworkAclsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListNetworkAclsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListNetworkAclsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListNetworkAclsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }
  }

  protected ListNetworkAclsOptions() { }

  protected ListNetworkAclsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
  }

  /**
   * New builder.
   *
   * @return a ListNetworkAclsOptions builder
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
   * Filters the collection to resources in the resource group with the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }
}

