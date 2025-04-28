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
 * Create a file share by size.
 */
public class SharePrototypeShareBySize extends SharePrototype {

  public interface AllowedTransitEncryptionModes {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  /**
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a
   *   mount target control access to the mount target. Mount targets for this share
   *   require a virtual network interface.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *   Mount targets for this share require a VPC.
   */
  public interface AccessControlMode {
    /** security_group. */
    String SECURITY_GROUP = "security_group";
    /** vpc. */
    String VPC = "vpc";
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
    private String accessControlMode;
    private EncryptionKeyIdentity encryptionKey;
    private ShareInitialOwner initialOwner;
    private Long iops;
    private ShareProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private Long size;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing SharePrototypeShareBySize instance.
     *
     * @param sharePrototypeShareBySize the instance to initialize the Builder with
     */
    public Builder(SharePrototype sharePrototypeShareBySize) {
      this.allowedTransitEncryptionModes = sharePrototypeShareBySize.allowedTransitEncryptionModes;
      this.mountTargets = sharePrototypeShareBySize.mountTargets;
      this.name = sharePrototypeShareBySize.name;
      this.replicaShare = sharePrototypeShareBySize.replicaShare;
      this.userTags = sharePrototypeShareBySize.userTags;
      this.accessControlMode = sharePrototypeShareBySize.accessControlMode;
      this.encryptionKey = sharePrototypeShareBySize.encryptionKey;
      this.initialOwner = sharePrototypeShareBySize.initialOwner;
      this.iops = sharePrototypeShareBySize.iops;
      this.profile = sharePrototypeShareBySize.profile;
      this.resourceGroup = sharePrototypeShareBySize.resourceGroup;
      this.size = sharePrototypeShareBySize.size;
      this.zone = sharePrototypeShareBySize.zone;
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
     * @param size the size
     * @param zone the zone
     */
    public Builder(ShareProfileIdentity profile, Long size, ZoneIdentity zone) {
      this.profile = profile;
      this.size = size;
      this.zone = zone;
    }

    /**
     * Builds a SharePrototypeShareBySize.
     *
     * @return the new SharePrototypeShareBySize instance
     */
    public SharePrototypeShareBySize build() {
      return new SharePrototypeShareBySize(this);
    }

    /**
     * Adds a new element to allowedTransitEncryptionModes.
     *
     * @param allowedTransitEncryptionModes the new element to be added
     * @return the SharePrototypeShareBySize builder
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
     * @return the SharePrototypeShareBySize builder
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
     * @return the SharePrototypeShareBySize builder
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
     * @return the SharePrototypeShareBySize builder
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
     * @return the SharePrototypeShareBySize builder
     */
    public Builder mountTargets(List<ShareMountTargetPrototype> mountTargets) {
      this.mountTargets = mountTargets;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SharePrototypeShareBySize builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the replicaShare.
     *
     * @param replicaShare the replicaShare
     * @return the SharePrototypeShareBySize builder
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
     * @return the SharePrototypeShareBySize builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the accessControlMode.
     *
     * @param accessControlMode the accessControlMode
     * @return the SharePrototypeShareBySize builder
     */
    public Builder accessControlMode(String accessControlMode) {
      this.accessControlMode = accessControlMode;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the SharePrototypeShareBySize builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the initialOwner.
     *
     * @param initialOwner the initialOwner
     * @return the SharePrototypeShareBySize builder
     */
    public Builder initialOwner(ShareInitialOwner initialOwner) {
      this.initialOwner = initialOwner;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the SharePrototypeShareBySize builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the SharePrototypeShareBySize builder
     */
    public Builder profile(ShareProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SharePrototypeShareBySize builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the size.
     *
     * @param size the size
     * @return the SharePrototypeShareBySize builder
     */
    public Builder size(long size) {
      this.size = size;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the SharePrototypeShareBySize builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected SharePrototypeShareBySize() { }

  protected SharePrototypeShareBySize(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.size,
      "size cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    allowedTransitEncryptionModes = builder.allowedTransitEncryptionModes;
    mountTargets = builder.mountTargets;
    name = builder.name;
    replicaShare = builder.replicaShare;
    userTags = builder.userTags;
    accessControlMode = builder.accessControlMode;
    encryptionKey = builder.encryptionKey;
    initialOwner = builder.initialOwner;
    iops = builder.iops;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    size = builder.size;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a SharePrototypeShareBySize builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

