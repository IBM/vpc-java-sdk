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
 * The listVolumeProfiles options.
 */
public class ListVolumeProfilesOptions extends GenericModel {

  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListVolumeProfilesOptions instance.
     *
     * @param listVolumeProfilesOptions the instance to initialize the Builder with
     */
    private Builder(ListVolumeProfilesOptions listVolumeProfilesOptions) {
      this.start = listVolumeProfilesOptions.start;
      this.limit = listVolumeProfilesOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListVolumeProfilesOptions.
     *
     * @return the new ListVolumeProfilesOptions instance
     */
    public ListVolumeProfilesOptions build() {
      return new ListVolumeProfilesOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVolumeProfilesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVolumeProfilesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListVolumeProfilesOptions() { }

  protected ListVolumeProfilesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListVolumeProfilesOptions builder
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
}

