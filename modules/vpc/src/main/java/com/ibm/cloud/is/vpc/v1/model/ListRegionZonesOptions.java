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
 * The listRegionZones options.
 */
public class ListRegionZonesOptions extends GenericModel {

  protected String regionName;

  /**
   * Builder.
   */
  public static class Builder {
    private String regionName;

    /**
     * Instantiates a new Builder from an existing ListRegionZonesOptions instance.
     *
     * @param listRegionZonesOptions the instance to initialize the Builder with
     */
    private Builder(ListRegionZonesOptions listRegionZonesOptions) {
      this.regionName = listRegionZonesOptions.regionName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param regionName the regionName
     */
    public Builder(String regionName) {
      this.regionName = regionName;
    }

    /**
     * Builds a ListRegionZonesOptions.
     *
     * @return the new ListRegionZonesOptions instance
     */
    public ListRegionZonesOptions build() {
      return new ListRegionZonesOptions(this);
    }

    /**
     * Set the regionName.
     *
     * @param regionName the regionName
     * @return the ListRegionZonesOptions builder
     */
    public Builder regionName(String regionName) {
      this.regionName = regionName;
      return this;
    }
  }

  protected ListRegionZonesOptions() { }

  protected ListRegionZonesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.regionName,
      "regionName cannot be empty");
    regionName = builder.regionName;
  }

  /**
   * New builder.
   *
   * @return a ListRegionZonesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the regionName.
   *
   * The region name.
   *
   * @return the regionName
   */
  public String regionName() {
    return regionName;
  }
}

