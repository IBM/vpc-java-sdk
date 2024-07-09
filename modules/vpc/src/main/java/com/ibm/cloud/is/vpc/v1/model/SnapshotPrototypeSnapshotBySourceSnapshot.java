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
 * SnapshotPrototypeSnapshotBySourceSnapshot.
 */
public class SnapshotPrototypeSnapshotBySourceSnapshot extends SnapshotPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private List<SnapshotClonePrototype> clones;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private List<String> userTags;
    private EncryptionKeyIdentity encryptionKey;
    private SnapshotIdentityByCRN sourceSnapshot;

    /**
     * Instantiates a new Builder from an existing SnapshotPrototypeSnapshotBySourceSnapshot instance.
     *
     * @param snapshotPrototypeSnapshotBySourceSnapshot the instance to initialize the Builder with
     */
    public Builder(SnapshotPrototype snapshotPrototypeSnapshotBySourceSnapshot) {
      this.clones = snapshotPrototypeSnapshotBySourceSnapshot.clones;
      this.name = snapshotPrototypeSnapshotBySourceSnapshot.name;
      this.resourceGroup = snapshotPrototypeSnapshotBySourceSnapshot.resourceGroup;
      this.userTags = snapshotPrototypeSnapshotBySourceSnapshot.userTags;
      this.encryptionKey = snapshotPrototypeSnapshotBySourceSnapshot.encryptionKey;
      this.sourceSnapshot = snapshotPrototypeSnapshotBySourceSnapshot.sourceSnapshot;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceSnapshot the sourceSnapshot
     */
    public Builder(SnapshotIdentityByCRN sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
    }

    /**
     * Builds a SnapshotPrototypeSnapshotBySourceSnapshot.
     *
     * @return the new SnapshotPrototypeSnapshotBySourceSnapshot instance
     */
    public SnapshotPrototypeSnapshotBySourceSnapshot build() {
      return new SnapshotPrototypeSnapshotBySourceSnapshot(this);
    }

    /**
     * Adds a new element to clones.
     *
     * @param clones the new element to be added
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
     */
    public Builder addClones(SnapshotClonePrototype clones) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(clones,
        "clones cannot be null");
      if (this.clones == null) {
        this.clones = new ArrayList<SnapshotClonePrototype>();
      }
      this.clones.add(clones);
      return this;
    }

    /**
     * Adds a new element to userTags.
     *
     * @param userTags the new element to be added
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
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
     * Set the clones.
     * Existing clones will be replaced.
     *
     * @param clones the clones
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
     */
    public Builder clones(List<SnapshotClonePrototype> clones) {
      this.clones = clones;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
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
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the sourceSnapshot.
     *
     * @param sourceSnapshot the sourceSnapshot
     * @return the SnapshotPrototypeSnapshotBySourceSnapshot builder
     */
    public Builder sourceSnapshot(SnapshotIdentityByCRN sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
      return this;
    }
  }

  protected SnapshotPrototypeSnapshotBySourceSnapshot() { }

  protected SnapshotPrototypeSnapshotBySourceSnapshot(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceSnapshot,
      "sourceSnapshot cannot be null");
    clones = builder.clones;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    userTags = builder.userTags;
    encryptionKey = builder.encryptionKey;
    sourceSnapshot = builder.sourceSnapshot;
  }

  /**
   * New builder.
   *
   * @return a SnapshotPrototypeSnapshotBySourceSnapshot builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

