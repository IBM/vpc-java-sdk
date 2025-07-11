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
 * Configuration for a replica file share to create and associate with this file share. If unspecified, a replica may be
 * subsequently added by creating a new file share with a
 * `source_share` referencing this file share.
 */
public class SharePrototypeShareContext extends GenericModel {

  public interface AllowedTransitEncryptionModes {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  @SerializedName("allowed_transit_encryption_modes")
  protected List<String> allowedTransitEncryptionModes;
  protected Long iops;
  @SerializedName("mount_targets")
  protected List<ShareMountTargetPrototype> mountTargets;
  protected String name;
  protected ShareProfileIdentity profile;
  @SerializedName("replication_cron_spec")
  protected String replicationCronSpec;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("user_tags")
  protected List<String> userTags;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> allowedTransitEncryptionModes;
    private Long iops;
    private List<ShareMountTargetPrototype> mountTargets;
    private String name;
    private ShareProfileIdentity profile;
    private String replicationCronSpec;
    private ResourceGroupIdentity resourceGroup;
    private List<String> userTags;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing SharePrototypeShareContext instance.
     *
     * @param sharePrototypeShareContext the instance to initialize the Builder with
     */
    private Builder(SharePrototypeShareContext sharePrototypeShareContext) {
      this.allowedTransitEncryptionModes = sharePrototypeShareContext.allowedTransitEncryptionModes;
      this.iops = sharePrototypeShareContext.iops;
      this.mountTargets = sharePrototypeShareContext.mountTargets;
      this.name = sharePrototypeShareContext.name;
      this.profile = sharePrototypeShareContext.profile;
      this.replicationCronSpec = sharePrototypeShareContext.replicationCronSpec;
      this.resourceGroup = sharePrototypeShareContext.resourceGroup;
      this.userTags = sharePrototypeShareContext.userTags;
      this.zone = sharePrototypeShareContext.zone;
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
     * @param zone the zone
     */
    public Builder(ShareProfileIdentity profile, String replicationCronSpec, ZoneIdentity zone) {
      this.profile = profile;
      this.replicationCronSpec = replicationCronSpec;
      this.zone = zone;
    }

    /**
     * Builds a SharePrototypeShareContext.
     *
     * @return the new SharePrototypeShareContext instance
     */
    public SharePrototypeShareContext build() {
      return new SharePrototypeShareContext(this);
    }

    /**
     * Adds a new element to allowedTransitEncryptionModes.
     *
     * @param allowedTransitEncryptionModes the new element to be added
     * @return the SharePrototypeShareContext builder
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
     * @return the SharePrototypeShareContext builder
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
     * @return the SharePrototypeShareContext builder
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
     * @return the SharePrototypeShareContext builder
     */
    public Builder allowedTransitEncryptionModes(List<String> allowedTransitEncryptionModes) {
      this.allowedTransitEncryptionModes = allowedTransitEncryptionModes;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the SharePrototypeShareContext builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the mountTargets.
     * Existing mountTargets will be replaced.
     *
     * @param mountTargets the mountTargets
     * @return the SharePrototypeShareContext builder
     */
    public Builder mountTargets(List<ShareMountTargetPrototype> mountTargets) {
      this.mountTargets = mountTargets;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SharePrototypeShareContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the SharePrototypeShareContext builder
     */
    public Builder profile(ShareProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the replicationCronSpec.
     *
     * @param replicationCronSpec the replicationCronSpec
     * @return the SharePrototypeShareContext builder
     */
    public Builder replicationCronSpec(String replicationCronSpec) {
      this.replicationCronSpec = replicationCronSpec;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the SharePrototypeShareContext builder
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
     * @return the SharePrototypeShareContext builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the SharePrototypeShareContext builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected SharePrototypeShareContext() { }

  protected SharePrototypeShareContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.replicationCronSpec,
      "replicationCronSpec cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    allowedTransitEncryptionModes = builder.allowedTransitEncryptionModes;
    iops = builder.iops;
    mountTargets = builder.mountTargets;
    name = builder.name;
    profile = builder.profile;
    replicationCronSpec = builder.replicationCronSpec;
    resourceGroup = builder.resourceGroup;
    userTags = builder.userTags;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a SharePrototypeShareContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowedTransitEncryptionModes.
   *
   * The transit encryption modes to allow for this share. If unspecified:
   * - If share mount targets are specified, and those share mount targets all specify a
   *   `transit_encryption` of `user_managed`, then only `user_managed` will be allowed.
   * - Otherwise, all `transit_encryption` modes will be allowed.
   *
   * @return the allowedTransitEncryptionModes
   */
  public List<String> allowedTransitEncryptionModes() {
    return allowedTransitEncryptionModes;
  }

  /**
   * Gets the iops.
   *
   * The maximum input/output operations per second (IOPS) for the file share.
   *
   * If the share profile has an `iops.type` of `dependent` or `fixed`, this property is system-managed and must not be
   * specified. Otherwise, the specified value must be within the `iops` range of the share profile as supported by the
   * share's specified size.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the mountTargets.
   *
   * The mount targets for this replica file share. Each mount target must be in a unique VPC.
   *
   * A replica's mount targets must be mounted read-only.
   *
   * @return the mountTargets
   */
  public List<ShareMountTargetPrototype> mountTargets() {
    return mountTargets;
  }

  /**
   * Gets the name.
   *
   * The name for this share. The name must not be used by another share in the region. If unspecified, the name will be
   * a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-file-storage-profiles) to use
   * for this file share. The profile must support the share's specified IOPS and size.
   *
   * @return the profile
   */
  public ShareProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the replicationCronSpec.
   *
   * The cron specification for the file share replication schedule.
   *
   * Replication of a share can be scheduled to occur at most once every 15 minutes.
   *
   * @return the replicationCronSpec
   */
  public String replicationCronSpec() {
    return replicationCronSpec;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the resource group from
   * the source share will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the userTags.
   *
   * The tags for this resource.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Gets the zone.
   *
   * The zone this replica file share will reside in. For a replica share in the same
   * region as the source share, this must be a different zone from the source share.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

