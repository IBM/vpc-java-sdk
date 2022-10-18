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
 * The listDedicatedHostGroups options.
 */
public class ListDedicatedHostGroupsOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String zoneName;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String zoneName;
    private String name;

    /**
     * Instantiates a new Builder from an existing ListDedicatedHostGroupsOptions instance.
     *
     * @param listDedicatedHostGroupsOptions the instance to initialize the Builder with
     */
    private Builder(ListDedicatedHostGroupsOptions listDedicatedHostGroupsOptions) {
      this.start = listDedicatedHostGroupsOptions.start;
      this.limit = listDedicatedHostGroupsOptions.limit;
      this.resourceGroupId = listDedicatedHostGroupsOptions.resourceGroupId;
      this.zoneName = listDedicatedHostGroupsOptions.zoneName;
      this.name = listDedicatedHostGroupsOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDedicatedHostGroupsOptions.
     *
     * @return the new ListDedicatedHostGroupsOptions instance
     */
    public ListDedicatedHostGroupsOptions build() {
      return new ListDedicatedHostGroupsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListDedicatedHostGroupsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDedicatedHostGroupsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListDedicatedHostGroupsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the ListDedicatedHostGroupsOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListDedicatedHostGroupsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ListDedicatedHostGroupsOptions() { }

  protected ListDedicatedHostGroupsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    zoneName = builder.zoneName;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ListDedicatedHostGroupsOptions builder
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
   * Gets the zoneName.
   *
   * Filters the collection to resources in the zone with the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

