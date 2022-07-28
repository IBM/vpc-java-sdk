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
 * The listBackupPolicies options.
 */
public class ListBackupPoliciesOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String name;
  protected String tag;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private String tag;

    private Builder(ListBackupPoliciesOptions listBackupPoliciesOptions) {
      this.start = listBackupPoliciesOptions.start;
      this.limit = listBackupPoliciesOptions.limit;
      this.resourceGroupId = listBackupPoliciesOptions.resourceGroupId;
      this.name = listBackupPoliciesOptions.name;
      this.tag = listBackupPoliciesOptions.tag;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListBackupPoliciesOptions.
     *
     * @return the new ListBackupPoliciesOptions instance
     */
    public ListBackupPoliciesOptions build() {
      return new ListBackupPoliciesOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListBackupPoliciesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListBackupPoliciesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListBackupPoliciesOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListBackupPoliciesOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the tag.
     *
     * @param tag the tag
     * @return the ListBackupPoliciesOptions builder
     */
    public Builder tag(String tag) {
      this.tag = tag;
      return this;
    }
  }

  protected ListBackupPoliciesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    tag = builder.tag;
  }

  /**
   * New builder.
   *
   * @return a ListBackupPoliciesOptions builder
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
   * Gets the name.
   *
   * Filters the collection to resources with the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the tag.
   *
   * Filters the collection to resources with the exact tag value.
   *
   * @return the tag
   */
  public String tag() {
    return tag;
  }
}

