/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BackupPolicyPlanClonePolicy.
 */
public class BackupPolicyPlanClonePolicy extends GenericModel {

  @SerializedName("max_snapshots")
  protected Long maxSnapshots;
  protected List<ZoneReference> zones;

  protected BackupPolicyPlanClonePolicy() { }

  /**
   * Gets the maxSnapshots.
   *
   * The maximum number of recent snapshots (per source) that will keep clones.
   *
   * @return the maxSnapshots
   */
  public Long getMaxSnapshots() {
    return maxSnapshots;
  }

  /**
   * Gets the zones.
   *
   * The zone this backup policy plan will create snapshot clones in.
   *
   * @return the zones
   */
  public List<ZoneReference> getZones() {
    return zones;
  }
}

