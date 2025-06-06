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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SnapshotClone.
 */
public class SnapshotClone extends GenericModel {

  protected Boolean available;
  @SerializedName("created_at")
  protected Date createdAt;
  protected ZoneReference zone;

  protected SnapshotClone() { }

  /**
   * Gets the available.
   *
   * Indicates whether this snapshot clone is available for use.
   *
   * @return the available
   */
  public Boolean isAvailable() {
    return available;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this snapshot clone was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the zone.
   *
   * The zone this snapshot clone resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

