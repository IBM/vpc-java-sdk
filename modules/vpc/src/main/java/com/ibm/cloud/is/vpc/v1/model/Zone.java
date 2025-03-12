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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Zone.
 */
public class Zone extends GenericModel {

  /**
   * The status of the zone.
   *
   * - `available`: The zone is available to create and manage resources.
   * - `impaired`: The zone's availability and performance to create and manage resources
   *   may be impaired.
   * - `unavailable`: The zone is unavailable to create and manage resources.
   * - `unassigned`: The zone has not been assigned to a physical zone.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** impaired. */
    String IMPAIRED = "impaired";
    /** unassigned. */
    String UNASSIGNED = "unassigned";
    /** unavailable. */
    String UNAVAILABLE = "unavailable";
  }

  @SerializedName("data_center")
  protected String dataCenter;
  protected String href;
  protected String name;
  protected RegionReference region;
  protected String status;
  @SerializedName("universal_name")
  protected String universalName;

  protected Zone() { }

  /**
   * Gets the dataCenter.
   *
   * The physical data center assigned to this logical zone.
   *
   * If absent, no physical data center has been assigned.
   *
   * @return the dataCenter
   */
  public String getDataCenter() {
    return dataCenter;
  }

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
   * The status of the zone.
   *
   * - `available`: The zone is available to create and manage resources.
   * - `impaired`: The zone's availability and performance to create and manage resources
   *   may be impaired.
   * - `unavailable`: The zone is unavailable to create and manage resources.
   * - `unassigned`: The zone has not been assigned to a physical zone.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the universalName.
   *
   * The [universal name](https://cloud.ibm.com/docs/overview?topic=overview-locations#zone-mapping) for this zone. Will
   * be absent if this zone has a `status` of `unassigned`.
   *
   * @return the universalName
   */
  public String getUniversalName() {
    return universalName;
  }
}

