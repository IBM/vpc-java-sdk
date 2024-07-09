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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SnapshotConsistencyGroupPrototype.
 *
 * Classes which extend this class:
 * - SnapshotConsistencyGroupPrototypeSnapshotConsistencyGroupBySnapshots
 */
public class SnapshotConsistencyGroupPrototype extends GenericModel {

  @SerializedName("delete_snapshots_on_delete")
  protected Boolean deleteSnapshotsOnDelete;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected List<SnapshotPrototypeSnapshotConsistencyGroupContext> snapshots;

  protected SnapshotConsistencyGroupPrototype() { }

  /**
   * Gets the deleteSnapshotsOnDelete.
   *
   * Indicates whether deleting the snapshot consistency group will also delete the snapshots in the group.
   *
   * @return the deleteSnapshotsOnDelete
   */
  public Boolean deleteSnapshotsOnDelete() {
    return deleteSnapshotsOnDelete;
  }

  /**
   * Gets the name.
   *
   * The name for this snapshot consistency group. The name must be unique across all snapshot consistency groups in the
   * region.
   *
   * If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the snapshots.
   *
   * The data-consistent member snapshots to create.  All snapshots must specify a
   * `source_volume` attached to the same virtual server instance.
   *
   * @return the snapshots
   */
  public List<SnapshotPrototypeSnapshotConsistencyGroupContext> snapshots() {
    return snapshots;
  }
}

