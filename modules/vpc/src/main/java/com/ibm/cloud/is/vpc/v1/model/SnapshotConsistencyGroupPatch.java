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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * SnapshotConsistencyGroupPatch.
 */
public class SnapshotConsistencyGroupPatch extends GenericModel {

  @SerializedName("delete_snapshots_on_delete")
  protected Boolean deleteSnapshotsOnDelete;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean deleteSnapshotsOnDelete;
    private String name;

    /**
     * Instantiates a new Builder from an existing SnapshotConsistencyGroupPatch instance.
     *
     * @param snapshotConsistencyGroupPatch the instance to initialize the Builder with
     */
    private Builder(SnapshotConsistencyGroupPatch snapshotConsistencyGroupPatch) {
      this.deleteSnapshotsOnDelete = snapshotConsistencyGroupPatch.deleteSnapshotsOnDelete;
      this.name = snapshotConsistencyGroupPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SnapshotConsistencyGroupPatch.
     *
     * @return the new SnapshotConsistencyGroupPatch instance
     */
    public SnapshotConsistencyGroupPatch build() {
      return new SnapshotConsistencyGroupPatch(this);
    }

    /**
     * Set the deleteSnapshotsOnDelete.
     *
     * @param deleteSnapshotsOnDelete the deleteSnapshotsOnDelete
     * @return the SnapshotConsistencyGroupPatch builder
     */
    public Builder deleteSnapshotsOnDelete(Boolean deleteSnapshotsOnDelete) {
      this.deleteSnapshotsOnDelete = deleteSnapshotsOnDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotConsistencyGroupPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected SnapshotConsistencyGroupPatch() { }

  protected SnapshotConsistencyGroupPatch(Builder builder) {
    deleteSnapshotsOnDelete = builder.deleteSnapshotsOnDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a SnapshotConsistencyGroupPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

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
   * The name for this snapshot consistency group. The name must not be used by another snapshot consistency groups in
   * the region.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the SnapshotConsistencyGroupPatch.
   *
   * Note that properties of the SnapshotConsistencyGroupPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SnapshotConsistencyGroupPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

