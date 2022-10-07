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
 * The listVpcs options.
 */
public class ListVpcsOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected Boolean classicAccess;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private Boolean classicAccess;

    /**
     * Instantiates a new Builder from an existing ListVpcsOptions instance.
     *
     * @param listVpcsOptions the instance to initialize the Builder with
     */
    private Builder(ListVpcsOptions listVpcsOptions) {
      this.start = listVpcsOptions.start;
      this.limit = listVpcsOptions.limit;
      this.resourceGroupId = listVpcsOptions.resourceGroupId;
      this.classicAccess = listVpcsOptions.classicAccess;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListVpcsOptions.
     *
     * @return the new ListVpcsOptions instance
     */
    public ListVpcsOptions build() {
      return new ListVpcsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVpcsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVpcsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListVpcsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the classicAccess.
     *
     * @param classicAccess the classicAccess
     * @return the ListVpcsOptions builder
     */
    public Builder classicAccess(Boolean classicAccess) {
      this.classicAccess = classicAccess;
      return this;
    }
  }

  protected ListVpcsOptions() { }

  protected ListVpcsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    classicAccess = builder.classicAccess;
  }

  /**
   * New builder.
   *
   * @return a ListVpcsOptions builder
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

  /**
   * Gets the classicAccess.
   *
   * Filters the collection to VPCs with the specified `classic_access` value.
   *
   * @return the classicAccess
   */
  public Boolean classicAccess() {
    return classicAccess;
  }
}

