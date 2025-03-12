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

/**
 * Create a file share from a source snapshot. The initial value for `access_control_mode`, and the zone the file share
 * resides in will be inherited from `source_snapshot`.
 */
public class SharePrototypeShareBySourceSnapshot extends SharePrototype {

  /**
   * An allowed transit encryption mode for this share.
   * - `none`: Not encrypted in transit.
   * - `user_managed`: Encrypted in transit using an instance identity certificate.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface AllowedTransitEncryptionModes {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> allowedTransitEncryptionModes;
    private List<ShareMountTargetPrototype> mountTargets;
    private String name;
    private SharePrototypeShareContext replicaShare;
    private List<String> userTags;
    private EncryptionKeyIdentity encryptionKey;
    private ShareInitialOwner initialOwner;
    private Long iops;
    private ShareProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private Long size;
    private ShareSourceSnapshotPrototype sourceSnapshot;

    /**
     * Instantiates a new Builder from an existing SharePrototypeShareBySourceSnapshot instance.
     *
     * @param sharePrototypeShareBySourceSnapshot the instance to initialize the Builder with
     */
    public Builder(SharePrototype sharePrototypeShareBySourceSnapshot) {
      this.allowedTransitEncryptionModes = sharePrototypeShareBySourceSnapshot.allowedTransitEncryptionModes;
      this.mountTargets = sharePrototypeShareBySourceSnapshot.mountTargets;
      this.name = sharePrototypeShareBySourceSnapshot.name;
      this.replicaShare = sharePrototypeShareBySourceSnapshot.replicaShare;
      this.userTags = sharePrototypeShareBySourceSnapshot.userTags;
      this.encryptionKey = sharePrototypeShareBySourceSnapshot.encryptionKey;
      this.initialOwner = sharePrototypeShareBySourceSnapshot.initialOwner;
      this.iops = sharePrototypeShareBySourceSnapshot.iops;
      this.profile = sharePrototypeShareBySourceSnapshot.profile;
      this.resourceGroup = sharePrototypeShareBySourceSnapshot.resourceGroup;
      this.size = sharePrototypeShareBySourceSnapshot.size;
      this.sourceSnapshot = sharePrototypeShareBySourceSnapshot.sourceSnapshot;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param profile the profile
     * @param sourceSnapshot the sourceSnapshot
     */
    public Builder(ShareProfileIdentity profile, ShareSourceSnapshotPrototype sourceSnapshot) {
      this.profile = profile;
      this.sourceSnapshot = sourceSnapshot;
    }

    /**
     * Builds a SharePrototypeShareBySourceSnapshot.
     *
     * @return the new SharePrototypeShareBySourceSnapshot instance
     */
    public SharePrototypeShareBySourceSnapshot build() {
      return new SharePrototypeShareBySourceSnapshot(this);
    }

    /**
     * Adds a new element to allowedTransitEncryptionModes.
     *
     * @param allowedTransitEncryptionModes the new element to be added
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder addAllowedTransitEncryptionModes(String allowedTransitEncryptionModes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedTransitEncryptionModes,
        "allowedTransitEncryptionModes cannot be null");
      if (this.allowedTransitEncryptionModes == null) {
        this.allowedTransitEncryptionModes = new ArrayList<String>();
      }
      this.allowedTransitEncryptionModes.add(allowedTransitEncryptionModes);
      return this;
    }

    /**
     * Adds a new element to mountTargets.
     *
     * @param mountTargets the new element to be added
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder addMountTargets(ShareMountTargetPrototype mountTargets) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(mountTargets,
        "mountTargets cannot be null");
      if (this.mountTargets == null) {
        this.mountTargets = new ArrayList<ShareMountTargetPrototype>();
      }
      this.mountTargets.add(mountTargets);
      return this;
    }

    /**
     * Adds a new element to userTags.
     *
     * @param userTags the new element to be added
     * @return the SharePrototypeShareBySourceSnapshot builder
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
     * Set the allowedTransitEncryptionModes.
     * Existing allowedTransitEncryptionModes will be replaced.
     *
     * @param allowedTransitEncryptionModes the allowedTransitEncryptionModes
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder allowedTransitEncryptionModes(List<String> allowedTransitEncryptionModes) {
      this.allowedTransitEncryptionModes = allowedTransitEncryptionModes;
      return this;
    }

    /**
     * Set the mountTargets.
     * Existing mountTargets will be replaced.
     *
     * @param mountTargets the mountTargets
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder mountTargets(List<ShareMountTargetPrototype> mountTargets) {
      this.mountTargets = mountTargets;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the replicaShare.
     *
     * @param replicaShare the replicaShare
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder replicaShare(SharePrototypeShareContext replicaShare) {
      this.replicaShare = replicaShare;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the initialOwner.
     *
     * @param initialOwner the initialOwner
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder initialOwner(ShareInitialOwner initialOwner) {
      this.initialOwner = initialOwner;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder profile(ShareProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the size.
     *
     * @param size the size
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder size(long size) {
      this.size = size;
      return this;
    }

    /**
     * Set the sourceSnapshot.
     *
     * @param sourceSnapshot the sourceSnapshot
     * @return the SharePrototypeShareBySourceSnapshot builder
     */
    public Builder sourceSnapshot(ShareSourceSnapshotPrototype sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
      return this;
    }
  }

  protected SharePrototypeShareBySourceSnapshot() { }

  protected SharePrototypeShareBySourceSnapshot(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceSnapshot,
      "sourceSnapshot cannot be null");
    allowedTransitEncryptionModes = builder.allowedTransitEncryptionModes;
    mountTargets = builder.mountTargets;
    name = builder.name;
    replicaShare = builder.replicaShare;
    userTags = builder.userTags;
    encryptionKey = builder.encryptionKey;
    initialOwner = builder.initialOwner;
    iops = builder.iops;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    size = builder.size;
    sourceSnapshot = builder.sourceSnapshot;
  }

  /**
   * New builder.
   *
   * @return a SharePrototypeShareBySourceSnapshot builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

