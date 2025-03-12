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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SnapshotPrototypeSnapshotConsistencyGroupContext.
 */
public class SnapshotPrototypeSnapshotConsistencyGroupContext extends GenericModel {

  protected String name;
  @SerializedName("source_volume")
  protected VolumeIdentity sourceVolume;
  @SerializedName("user_tags")
  protected List<String> userTags;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private VolumeIdentity sourceVolume;
    private List<String> userTags;

    /**
     * Instantiates a new Builder from an existing SnapshotPrototypeSnapshotConsistencyGroupContext instance.
     *
     * @param snapshotPrototypeSnapshotConsistencyGroupContext the instance to initialize the Builder with
     */
    private Builder(SnapshotPrototypeSnapshotConsistencyGroupContext snapshotPrototypeSnapshotConsistencyGroupContext) {
      this.name = snapshotPrototypeSnapshotConsistencyGroupContext.name;
      this.sourceVolume = snapshotPrototypeSnapshotConsistencyGroupContext.sourceVolume;
      this.userTags = snapshotPrototypeSnapshotConsistencyGroupContext.userTags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceVolume the sourceVolume
     */
    public Builder(VolumeIdentity sourceVolume) {
      this.sourceVolume = sourceVolume;
    }

    /**
     * Builds a SnapshotPrototypeSnapshotConsistencyGroupContext.
     *
     * @return the new SnapshotPrototypeSnapshotConsistencyGroupContext instance
     */
    public SnapshotPrototypeSnapshotConsistencyGroupContext build() {
      return new SnapshotPrototypeSnapshotConsistencyGroupContext(this);
    }

    /**
     * Adds a new element to userTags.
     *
     * @param userTags the new element to be added
     * @return the SnapshotPrototypeSnapshotConsistencyGroupContext builder
     */
    public Builder addUserTags(String userTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(userTags,
        "userTags cannot be null");
      if (this.userTags == null) {
        this.userTags = new ArrayList<String>();
      }
      this.userTags.add(userTags);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotPrototypeSnapshotConsistencyGroupContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the sourceVolume.
     *
     * @param sourceVolume the sourceVolume
     * @return the SnapshotPrototypeSnapshotConsistencyGroupContext builder
     */
    public Builder sourceVolume(VolumeIdentity sourceVolume) {
      this.sourceVolume = sourceVolume;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the SnapshotPrototypeSnapshotConsistencyGroupContext builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }
  }

  protected SnapshotPrototypeSnapshotConsistencyGroupContext() { }

  protected SnapshotPrototypeSnapshotConsistencyGroupContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceVolume,
      "sourceVolume cannot be null");
    name = builder.name;
    sourceVolume = builder.sourceVolume;
    userTags = builder.userTags;
  }

  /**
   * New builder.
   *
   * @return a SnapshotPrototypeSnapshotConsistencyGroupContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this snapshot. The name must not be used by another snapshot in the region. If unspecified, the name
   * will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the sourceVolume.
   *
   * The volume to create this snapshot from.
   *
   * @return the sourceVolume
   */
  public VolumeIdentity sourceVolume() {
    return sourceVolume;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this snapshot.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }
}

