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
 * Zone.
 */
public class Zone extends GenericModel {

  /**
   * The availability status of this zone.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** impaired. */
    String IMPAIRED = "impaired";
    /** unavailable. */
    String UNAVAILABLE = "unavailable";
  }

  protected String href;
  protected String name;
  protected RegionReference region;
  protected String status;

  protected Zone() { }

  /**
   * Gets the href.
   *
   * The URL for this zone.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this zone.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the region.
   *
   * The region this zone resides in.
   *
   * @return the region
   */
  public RegionReference getRegion() {
    return region;
  }

  /**
   * Gets the status.
   *
   * The availability status of this zone.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

