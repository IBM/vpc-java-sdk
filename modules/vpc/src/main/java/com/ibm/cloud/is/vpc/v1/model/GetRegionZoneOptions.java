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
 * The getRegionZone options.
 */
public class GetRegionZoneOptions extends GenericModel {

  protected String regionName;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String regionName;
    private String name;

    /**
     * Instantiates a new Builder from an existing GetRegionZoneOptions instance.
     *
     * @param getRegionZoneOptions the instance to initialize the Builder with
     */
    private Builder(GetRegionZoneOptions getRegionZoneOptions) {
      this.regionName = getRegionZoneOptions.regionName;
      this.name = getRegionZoneOptions.name;
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
     * @param name the name
     */
    public Builder(String regionName, String name) {
      this.regionName = regionName;
      this.name = name;
    }

    /**
     * Builds a GetRegionZoneOptions.
     *
     * @return the new GetRegionZoneOptions instance
     */
    public GetRegionZoneOptions build() {
      return new GetRegionZoneOptions(this);
    }

    /**
     * Set the regionName.
     *
     * @param regionName the regionName
     * @return the GetRegionZoneOptions builder
     */
    public Builder regionName(String regionName) {
      this.regionName = regionName;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetRegionZoneOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected GetRegionZoneOptions() { }

  protected GetRegionZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.regionName,
      "regionName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    regionName = builder.regionName;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a GetRegionZoneOptions builder
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

  /**
   * Gets the name.
   *
   * The zone name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

