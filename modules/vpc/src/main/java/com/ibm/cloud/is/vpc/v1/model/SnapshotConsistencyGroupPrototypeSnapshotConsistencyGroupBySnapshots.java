/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

/**
 * SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.
 */
public class SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots extends SnapshotConsistencyGroupPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean deleteSnapshotsOnDelete;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private List<SnapshotPrototypeSnapshotConsistencyGroupContext> snapshots;

    /**
     * Instantiates a new Builder from an existing SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots instance.
     *
     * @param snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots the instance to initialize the Builder with
     */
    public Builder(SnapshotConsistencyGroupPrototype snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots) {
      this.deleteSnapshotsOnDelete = snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.deleteSnapshotsOnDelete;
      this.name = snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.name;
      this.resourceGroup = snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.resourceGroup;
      this.snapshots = snapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.snapshots;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param snapshots the snapshots
     */
    public Builder(List<SnapshotPrototypeSnapshotConsistencyGroupContext> snapshots) {
      this.snapshots = snapshots;
    }

    /**
     * Builds a SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots.
     *
     * @return the new SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots instance
     */
    public SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots build() {
      return new SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots(this);
    }

    /**
     * Adds a new element to snapshots.
     *
     * @param snapshots the new element to be added
     * @return the SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots builder
     */
    public Builder addSnapshots(SnapshotPrototypeSnapshotConsistencyGroupContext snapshots) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(snapshots,
        "snapshots cannot be null");
      if (this.snapshots == null) {
        this.snapshots = new ArrayList<SnapshotPrototypeSnapshotConsistencyGroupContext>();
      }
      this.snapshots.add(snapshots);
      return this;
    }

    /**
     * Set the deleteSnapshotsOnDelete.
     *
     * @param deleteSnapshotsOnDelete the deleteSnapshotsOnDelete
     * @return the SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots builder
     */
    public Builder deleteSnapshotsOnDelete(Boolean deleteSnapshotsOnDelete) {
      this.deleteSnapshotsOnDelete = deleteSnapshotsOnDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the snapshots.
     * Existing snapshots will be replaced.
     *
     * @param snapshots the snapshots
     * @return the SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots builder
     */
    public Builder snapshots(List<SnapshotPrototypeSnapshotConsistencyGroupContext> snapshots) {
      this.snapshots = snapshots;
      return this;
    }
  }

  protected SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots() { }

  protected SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshots,
      "snapshots cannot be null");
    deleteSnapshotsOnDelete = builder.deleteSnapshotsOnDelete;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    snapshots = builder.snapshots;
  }

  /**
   * New builder.
   *
   * @return a SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

