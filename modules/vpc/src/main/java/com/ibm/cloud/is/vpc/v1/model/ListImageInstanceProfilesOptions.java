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
 * The listImageInstanceProfiles options.
 */
public class ListImageInstanceProfilesOptions extends GenericModel {

  protected String id;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListImageInstanceProfilesOptions instance.
     *
     * @param listImageInstanceProfilesOptions the instance to initialize the Builder with
     */
    private Builder(ListImageInstanceProfilesOptions listImageInstanceProfilesOptions) {
      this.id = listImageInstanceProfilesOptions.id;
      this.start = listImageInstanceProfilesOptions.start;
      this.limit = listImageInstanceProfilesOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a ListImageInstanceProfilesOptions.
     *
     * @return the new ListImageInstanceProfilesOptions instance
     */
    public ListImageInstanceProfilesOptions build() {
      return new ListImageInstanceProfilesOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListImageInstanceProfilesOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListImageInstanceProfilesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListImageInstanceProfilesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListImageInstanceProfilesOptions() { }

  protected ListImageInstanceProfilesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListImageInstanceProfilesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The image identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
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

