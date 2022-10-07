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
 * The listDedicatedHosts options.
 */
public class ListDedicatedHostsOptions extends GenericModel {

  protected String dedicatedHostGroupId;
  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String zoneName;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String dedicatedHostGroupId;
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String zoneName;
    private String name;

    /**
     * Instantiates a new Builder from an existing ListDedicatedHostsOptions instance.
     *
     * @param listDedicatedHostsOptions the instance to initialize the Builder with
     */
    private Builder(ListDedicatedHostsOptions listDedicatedHostsOptions) {
      this.dedicatedHostGroupId = listDedicatedHostsOptions.dedicatedHostGroupId;
      this.start = listDedicatedHostsOptions.start;
      this.limit = listDedicatedHostsOptions.limit;
      this.resourceGroupId = listDedicatedHostsOptions.resourceGroupId;
      this.zoneName = listDedicatedHostsOptions.zoneName;
      this.name = listDedicatedHostsOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDedicatedHostsOptions.
     *
     * @return the new ListDedicatedHostsOptions instance
     */
    public ListDedicatedHostsOptions build() {
      return new ListDedicatedHostsOptions(this);
    }

    /**
     * Set the dedicatedHostGroupId.
     *
     * @param dedicatedHostGroupId the dedicatedHostGroupId
     * @return the ListDedicatedHostsOptions builder
     */
    public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
      this.dedicatedHostGroupId = dedicatedHostGroupId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListDedicatedHostsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDedicatedHostsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListDedicatedHostsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the ListDedicatedHostsOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListDedicatedHostsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ListDedicatedHostsOptions() { }

  protected ListDedicatedHostsOptions(Builder builder) {
    dedicatedHostGroupId = builder.dedicatedHostGroupId;
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    zoneName = builder.zoneName;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ListDedicatedHostsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dedicatedHostGroupId.
   *
   * Filters the collection to dedicated host groups with the specified identifier.
   *
   * @return the dedicatedHostGroupId
   */
  public String dedicatedHostGroupId() {
    return dedicatedHostGroupId;
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

