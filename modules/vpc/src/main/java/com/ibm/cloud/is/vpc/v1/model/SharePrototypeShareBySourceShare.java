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
 * Create a replica file share for an existing file share. The values for
 * `access_control_mode`, `encryption_key`, `initial_owner`, and `size` will be inherited from `source_share`.
 */
public class SharePrototypeShareBySourceShare extends SharePrototype {

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
    private Long iops;
    private ShareProfileIdentity profile;
    private String replicationCronSpec;
    private ResourceGroupIdentity resourceGroup;
    private ShareIdentity sourceShare;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing SharePrototypeShareBySourceShare instance.
     *
     * @param sharePrototypeShareBySourceShare the instance to initialize the Builder with
     */
    public Builder(SharePrototype sharePrototypeShareBySourceShare) {
      this.allowedTransitEncryptionModes = sharePrototypeShareBySourceShare.allowedTransitEncryptionModes;
      this.mountTargets = sharePrototypeShareBySourceShare.mountTargets;
      this.name = sharePrototypeShareBySourceShare.name;
      this.replicaShare = sharePrototypeShareBySourceShare.replicaShare;
      this.userTags = sharePrototypeShareBySourceShare.userTags;
      this.encryptionKey = sharePrototypeShareBySourceShare.encryptionKey;
      this.iops = sharePrototypeShareBySourceShare.iops;
      this.profile = sharePrototypeShareBySourceShare.profile;
      this.replicationCronSpec = sharePrototypeShareBySourceShare.replicationCronSpec;
      this.resourceGroup = sharePrototypeShareBySourceShare.resourceGroup;
      this.sourceShare = sharePrototypeShareBySourceShare.sourceShare;
      this.zone = sharePrototypeShareBySourceShare.zone;
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
     * @param replicationCronSpec the replicationCronSpec
     * @param sourceShare the sourceShare
     * @param zone the zone
     */
    public Builder(ShareProfileIdentity profile, String replicationCronSpec, ShareIdentity sourceShare, ZoneIdentity zone) {
      this.profile = profile;
      this.replicationCronSpec = replicationCronSpec;
      this.sourceShare = sourceShare;
      this.zone = zone;
    }

    /**
     * Builds a SharePrototypeShareBySourceShare.
     *
     * @return the new SharePrototypeShareBySourceShare instance
     */
    public SharePrototypeShareBySourceShare build() {
      return new SharePrototypeShareBySourceShare(this);
    }

    /**
     * Adds a new element to allowedTransitEncryptionModes.
     *
     * @param allowedTransitEncryptionModes the new element to be added
     * @return the SharePrototypeShareBySourceShare builder
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
     * @return the SharePrototypeShareBySourceShare builder
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
     * @return the SharePrototypeShareBySourceShare builder
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
     * @return the SharePrototypeShareBySourceShare builder
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
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder mountTargets(List<ShareMountTargetPrototype> mountTargets) {
      this.mountTargets = mountTargets;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the replicaShare.
     *
     * @param replicaShare the replicaShare
     * @return the SharePrototypeShareBySourceShare builder
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
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder profile(ShareProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the replicationCronSpec.
     *
     * @param replicationCronSpec the replicationCronSpec
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder replicationCronSpec(String replicationCronSpec) {
      this.replicationCronSpec = replicationCronSpec;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the sourceShare.
     *
     * @param sourceShare the sourceShare
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder sourceShare(ShareIdentity sourceShare) {
      this.sourceShare = sourceShare;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the SharePrototypeShareBySourceShare builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected SharePrototypeShareBySourceShare() { }

  protected SharePrototypeShareBySourceShare(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replicationCronSpec,
      "replicationCronSpec cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceShare,
      "sourceShare cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    allowedTransitEncryptionModes = builder.allowedTransitEncryptionModes;
    mountTargets = builder.mountTargets;
    name = builder.name;
    replicaShare = builder.replicaShare;
    userTags = builder.userTags;
    encryptionKey = builder.encryptionKey;
    iops = builder.iops;
    profile = builder.profile;
    replicationCronSpec = builder.replicationCronSpec;
    resourceGroup = builder.resourceGroup;
    sourceShare = builder.sourceShare;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a SharePrototypeShareBySourceShare builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

