/*
 * (C) Copyright IBM Corp. 2020.
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
  protected String zoneName;

  /**
   * Builder.
   */
  public static class Builder {
    private String regionName;
    private String zoneName;

    private Builder(GetRegionZoneOptions getRegionZoneOptions) {
      this.regionName = getRegionZoneOptions.regionName;
      this.zoneName = getRegionZoneOptions.zoneName;
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
     * @param zoneName the zoneName
     */
    public Builder(String regionName, String zoneName) {
      this.regionName = regionName;
      this.zoneName = zoneName;
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
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the GetRegionZoneOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }
  }

  protected GetRegionZoneOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.regionName,
      "regionName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.zoneName,
      "zoneName cannot be empty");
    regionName = builder.regionName;
    zoneName = builder.zoneName;
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
   * Gets the zoneName.
   *
   * The zone name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }
}

