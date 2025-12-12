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
 * BackupPolicyPlanClonePolicyPrototype.
 */
public class BackupPolicyPlanClonePolicyPrototype extends GenericModel {

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
     * Instantiates a new Builder from an existing BackupPolicyPlanClonePolicyPrototype instance.
     *
     * @param backupPolicyPlanClonePolicyPrototype the instance to initialize the Builder with
     */
    private Builder(BackupPolicyPlanClonePolicyPrototype backupPolicyPlanClonePolicyPrototype) {
      this.maxSnapshots = backupPolicyPlanClonePolicyPrototype.maxSnapshots;
      this.zones = backupPolicyPlanClonePolicyPrototype.zones;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zones the zones
     */
    public Builder(List<ZoneIdentity> zones) {
      this.zones = zones;
    }

    /**
     * Builds a BackupPolicyPlanClonePolicyPrototype.
     *
     * @return the new BackupPolicyPlanClonePolicyPrototype instance
     */
    public BackupPolicyPlanClonePolicyPrototype build() {
      return new BackupPolicyPlanClonePolicyPrototype(this);
    }

    /**
     * Adds a new element to zones.
     *
     * @param zones the new element to be added
     * @return the BackupPolicyPlanClonePolicyPrototype builder
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
     * @return the BackupPolicyPlanClonePolicyPrototype builder
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
     * @return the BackupPolicyPlanClonePolicyPrototype builder
     */
    public Builder zones(List<ZoneIdentity> zones) {
      this.zones = zones;
      return this;
    }
  }

  protected BackupPolicyPlanClonePolicyPrototype() { }

  protected BackupPolicyPlanClonePolicyPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zones,
      "zones cannot be null");
    maxSnapshots = builder.maxSnapshots;
    zones = builder.zones;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPlanClonePolicyPrototype builder
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
   * The zone this backup policy plan will create snapshot clones in.
   *
   * @return the zones
   */
  public List<ZoneIdentity> zones() {
    return zones;
  }
}

