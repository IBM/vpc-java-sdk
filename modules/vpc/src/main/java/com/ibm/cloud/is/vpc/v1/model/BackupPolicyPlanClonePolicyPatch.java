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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BackupPolicyPlanClonePolicyPatch.
 */
public class BackupPolicyPlanClonePolicyPatch extends GenericModel {

  @SerializedName("max_snapshots")
  protected Long maxSnapshots;
  protected List<ZoneIdentity> zones;

  /**
   * Builder.
   */
  public static class Builder {
    private Long maxSnapshots;
    private List<ZoneIdentity> zones;

    /**
     * Instantiates a new Builder from an existing BackupPolicyPlanClonePolicyPatch instance.
     *
     * @param backupPolicyPlanClonePolicyPatch the instance to initialize the Builder with
     */
    private Builder(BackupPolicyPlanClonePolicyPatch backupPolicyPlanClonePolicyPatch) {
      this.maxSnapshots = backupPolicyPlanClonePolicyPatch.maxSnapshots;
      this.zones = backupPolicyPlanClonePolicyPatch.zones;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BackupPolicyPlanClonePolicyPatch.
     *
     * @return the new BackupPolicyPlanClonePolicyPatch instance
     */
    public BackupPolicyPlanClonePolicyPatch build() {
      return new BackupPolicyPlanClonePolicyPatch(this);
    }

    /**
     * Adds a new element to zones.
     *
     * @param zones the new element to be added
     * @return the BackupPolicyPlanClonePolicyPatch builder
     */
    public Builder addZones(ZoneIdentity zones) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(zones,
        "zones cannot be null");
      if (this.zones == null) {
        this.zones = new ArrayList<ZoneIdentity>();
      }
      this.zones.add(zones);
      return this;
    }

    /**
     * Set the maxSnapshots.
     *
     * @param maxSnapshots the maxSnapshots
     * @return the BackupPolicyPlanClonePolicyPatch builder
     */
    public Builder maxSnapshots(long maxSnapshots) {
      this.maxSnapshots = maxSnapshots;
      return this;
    }

    /**
     * Set the zones.
     * Existing zones will be replaced.
     *
     * @param zones the zones
     * @return the BackupPolicyPlanClonePolicyPatch builder
     */
    public Builder zones(List<ZoneIdentity> zones) {
      this.zones = zones;
      return this;
    }
  }

  protected BackupPolicyPlanClonePolicyPatch() { }

  protected BackupPolicyPlanClonePolicyPatch(Builder builder) {
    maxSnapshots = builder.maxSnapshots;
    zones = builder.zones;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPlanClonePolicyPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the maxSnapshots.
   *
   * The maximum number of recent snapshots (per source) that will keep clones.
   *
   * @return the maxSnapshots
   */
  public Long maxSnapshots() {
    return maxSnapshots;
  }

  /**
   * Gets the zones.
   *
   * The zones this backup policy plan will create snapshot clones in. Updating this value does not change the clones
   * for snapshots that have already been created by this plan.
   *
   * @return the zones
   */
  public List<ZoneIdentity> zones() {
    return zones;
  }
}

