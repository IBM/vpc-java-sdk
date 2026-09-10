/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * The listBareMetalServerCapacities options.
 */
public class ListBareMetalServerCapacitiesOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String profileName;
  protected String zoneName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String profileName;
    private String zoneName;

    /**
     * Instantiates a new Builder from an existing ListBareMetalServerCapacitiesOptions instance.
     *
     * @param listBareMetalServerCapacitiesOptions the instance to initialize the Builder with
     */
    private Builder(ListBareMetalServerCapacitiesOptions listBareMetalServerCapacitiesOptions) {
      this.start = listBareMetalServerCapacitiesOptions.start;
      this.limit = listBareMetalServerCapacitiesOptions.limit;
      this.profileName = listBareMetalServerCapacitiesOptions.profileName;
      this.zoneName = listBareMetalServerCapacitiesOptions.zoneName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListBareMetalServerCapacitiesOptions.
     *
     * @return the new ListBareMetalServerCapacitiesOptions instance
     */
    public ListBareMetalServerCapacitiesOptions build() {
      return new ListBareMetalServerCapacitiesOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListBareMetalServerCapacitiesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListBareMetalServerCapacitiesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the profileName.
     *
     * @param profileName the profileName
     * @return the ListBareMetalServerCapacitiesOptions builder
     */
    public Builder profileName(String profileName) {
      this.profileName = profileName;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the ListBareMetalServerCapacitiesOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }
  }

  protected ListBareMetalServerCapacitiesOptions() { }

  protected ListBareMetalServerCapacitiesOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    profileName = builder.profileName;
    zoneName = builder.zoneName;
  }

  /**
   * New builder.
   *
   * @return a ListBareMetalServerCapacitiesOptions builder
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
   * Gets the profileName.
   *
   * Filters the collection to resources with a `profile.name` property matching the specified profile name.
   *
   * @return the profileName
   */
  public String profileName() {
    return profileName;
  }

  /**
   * Gets the zoneName.
   *
   * Filters the collection to resources with a `zone.name` property matching the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }
}

