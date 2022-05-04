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

import java.util.ArrayList;
import java.util.List;

/**
 * SnapshotPrototypeSnapshotBySourceVolume.
 */
public class SnapshotPrototypeSnapshotBySourceVolume extends SnapshotPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private List<String> userTags;
    private VolumeIdentity sourceVolume;

    public Builder(SnapshotPrototype snapshotPrototypeSnapshotBySourceVolume) {
      this.name = snapshotPrototypeSnapshotBySourceVolume.name;
      this.resourceGroup = snapshotPrototypeSnapshotBySourceVolume.resourceGroup;
      this.userTags = snapshotPrototypeSnapshotBySourceVolume.userTags;
      this.sourceVolume = snapshotPrototypeSnapshotBySourceVolume.sourceVolume;
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
     * Builds a SnapshotPrototypeSnapshotBySourceVolume.
     *
     * @return the new SnapshotPrototypeSnapshotBySourceVolume instance
     */
    public SnapshotPrototypeSnapshotBySourceVolume build() {
      return new SnapshotPrototypeSnapshotBySourceVolume(this);
    }

    /**
     * Adds an userTags to userTags.
     *
     * @param userTags the new userTags
     * @return the SnapshotPrototypeSnapshotBySourceVolume builder
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
     * @return the SnapshotPrototypeSnapshotBySourceVolume builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SnapshotPrototypeSnapshotBySourceVolume builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the SnapshotPrototypeSnapshotBySourceVolume builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the sourceVolume.
     *
     * @param sourceVolume the sourceVolume
     * @return the SnapshotPrototypeSnapshotBySourceVolume builder
     */
    public Builder sourceVolume(VolumeIdentity sourceVolume) {
      this.sourceVolume = sourceVolume;
      return this;
    }
  }

  protected SnapshotPrototypeSnapshotBySourceVolume(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceVolume,
      "sourceVolume cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    userTags = builder.userTags;
    sourceVolume = builder.sourceVolume;
  }

  /**
   * New builder.
   *
   * @return a SnapshotPrototypeSnapshotBySourceVolume builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

