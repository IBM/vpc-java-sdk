/*
 * (C) Copyright IBM Corp. 2025.
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
 * The listShareMountTargets options.
 */
public class ListShareMountTargetsOptions extends GenericModel {

  protected String shareId;
  protected String name;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String name;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListShareMountTargetsOptions instance.
     *
     * @param listShareMountTargetsOptions the instance to initialize the Builder with
     */
    private Builder(ListShareMountTargetsOptions listShareMountTargetsOptions) {
      this.shareId = listShareMountTargetsOptions.shareId;
      this.name = listShareMountTargetsOptions.name;
      this.start = listShareMountTargetsOptions.start;
      this.limit = listShareMountTargetsOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param shareId the shareId
     */
    public Builder(String shareId) {
      this.shareId = shareId;
    }

    /**
     * Builds a ListShareMountTargetsOptions.
     *
     * @return the new ListShareMountTargetsOptions instance
     */
    public ListShareMountTargetsOptions build() {
      return new ListShareMountTargetsOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the ListShareMountTargetsOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListShareMountTargetsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListShareMountTargetsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListShareMountTargetsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListShareMountTargetsOptions() { }

  protected ListShareMountTargetsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    shareId = builder.shareId;
    name = builder.name;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListShareMountTargetsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the shareId.
   *
   * The file share identifier.
   *
   * @return the shareId
   */
  public String shareId() {
    return shareId;
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
}

