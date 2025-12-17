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
 * Create an accessor file share for an existing file share. The values for
 * `access_control_mode`, `allowed_access_protocols`, `bandwidth`, `encryption_key`,
 * `initial_owner`, `iops`, `profile`, `size`, and `zone` will be inherited from
 * `origin_share`.
 *
 * Accessor file shares can only be created for shares with a `storage_generation` of `1`.
 */
public class SharePrototypeShareByOriginShare extends SharePrototype {

  public interface AllowedTransitEncryptionModes {
    /** ipsec. */
    String IPSEC = "ipsec";
    /** none. */
    String NONE = "none";
    /** stunnel. */
    String STUNNEL = "stunnel";
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
    private ShareIdentity originShare;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing SharePrototypeShareByOriginShare instance.
     *
     * @param sharePrototypeShareByOriginShare the instance to initialize the Builder with
     */
    public Builder(SharePrototype sharePrototypeShareByOriginShare) {
      this.allowedTransitEncryptionModes = sharePrototypeShareByOriginShare.allowedTransitEncryptionModes;
      this.mountTargets = sharePrototypeShareByOriginShare.mountTargets;
      this.name = sharePrototypeShareByOriginShare.name;
      this.replicaShare = sharePrototypeShareByOriginShare.replicaShare;
      this.userTags = sharePrototypeShareByOriginShare.userTags;
      this.originShare = sharePrototypeShareByOriginShare.originShare;
      this.resourceGroup = sharePrototypeShareByOriginShare.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param originShare the originShare
     */
    public Builder(ShareIdentity originShare) {
      this.originShare = originShare;
    }

    /**
     * Builds a SharePrototypeShareByOriginShare.
     *
     * @return the new SharePrototypeShareByOriginShare instance
     */
    public SharePrototypeShareByOriginShare build() {
      return new SharePrototypeShareByOriginShare(this);
    }

    /**
     * Adds a new element to allowedTransitEncryptionModes.
     *
     * @param allowedTransitEncryptionModes the new element to be added
     * @return the SharePrototypeShareByOriginShare builder
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
     * @return the SharePrototypeShareByOriginShare builder
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
     * @return the SharePrototypeShareByOriginShare builder
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
     * @return the SharePrototypeShareByOriginShare builder
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
     * @return the SharePrototypeShareByOriginShare builder
     */
    public Builder mountTargets(List<ShareMountTargetPrototype> mountTargets) {
      this.mountTargets = mountTargets;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SharePrototypeShareByOriginShare builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the replicaShare.
     *
     * @param replicaShare the replicaShare
     * @return the SharePrototypeShareByOriginShare builder
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
     * @return the SharePrototypeShareByOriginShare builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the originShare.
     *
     * @param originShare the originShare
     * @return the SharePrototypeShareByOriginShare builder
     */
    public Builder originShare(ShareIdentity originShare) {
      this.originShare = originShare;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SharePrototypeShareByOriginShare builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected SharePrototypeShareByOriginShare() { }

  protected SharePrototypeShareByOriginShare(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.originShare,
      "originShare cannot be null");
    allowedTransitEncryptionModes = builder.allowedTransitEncryptionModes;
    mountTargets = builder.mountTargets;
    name = builder.name;
    replicaShare = builder.replicaShare;
    userTags = builder.userTags;
    originShare = builder.originShare;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a SharePrototypeShareByOriginShare builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

