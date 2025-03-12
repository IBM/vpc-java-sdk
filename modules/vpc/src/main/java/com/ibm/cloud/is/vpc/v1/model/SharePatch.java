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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * SharePatch.
 */
public class SharePatch extends GenericModel {

  /**
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a
   *   mount target control access to the mount target.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *
   * For this property to be changed, the share must have no mount targets,
   * `replication_role` must be `none` and `accessor_binding_role` must not be `accessor`.
   */
  public interface AccessControlMode {
    /** security_group. */
    String SECURITY_GROUP = "security_group";
    /** vpc. */
    String VPC = "vpc";
  }

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

  @SerializedName("access_control_mode")
  protected String accessControlMode;
  @SerializedName("allowed_transit_encryption_modes")
  protected List<String> allowedTransitEncryptionModes;
  protected Long iops;
  protected String name;
  protected ShareProfileIdentity profile;
  @SerializedName("replication_cron_spec")
  protected String replicationCronSpec;
  protected Long size;
  @SerializedName("user_tags")
  protected List<String> userTags;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessControlMode;
    private List<String> allowedTransitEncryptionModes;
    private Long iops;
    private String name;
    private ShareProfileIdentity profile;
    private String replicationCronSpec;
    private Long size;
    private List<String> userTags;

    /**
     * Instantiates a new Builder from an existing SharePatch instance.
     *
     * @param sharePatch the instance to initialize the Builder with
     */
    private Builder(SharePatch sharePatch) {
      this.accessControlMode = sharePatch.accessControlMode;
      this.allowedTransitEncryptionModes = sharePatch.allowedTransitEncryptionModes;
      this.iops = sharePatch.iops;
      this.name = sharePatch.name;
      this.profile = sharePatch.profile;
      this.replicationCronSpec = sharePatch.replicationCronSpec;
      this.size = sharePatch.size;
      this.userTags = sharePatch.userTags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SharePatch.
     *
     * @return the new SharePatch instance
     */
    public SharePatch build() {
      return new SharePatch(this);
    }

    /**
     * Adds a new element to allowedTransitEncryptionModes.
     *
     * @param allowedTransitEncryptionModes the new element to be added
     * @return the SharePatch builder
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
     * Adds a new element to userTags.
     *
     * @param userTags the new element to be added
     * @return the SharePatch builder
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
     * Set the accessControlMode.
     *
     * @param accessControlMode the accessControlMode
     * @return the SharePatch builder
     */
    public Builder accessControlMode(String accessControlMode) {
      this.accessControlMode = accessControlMode;
      return this;
    }

    /**
     * Set the allowedTransitEncryptionModes.
     * Existing allowedTransitEncryptionModes will be replaced.
     *
     * @param allowedTransitEncryptionModes the allowedTransitEncryptionModes
     * @return the SharePatch builder
     */
    public Builder allowedTransitEncryptionModes(List<String> allowedTransitEncryptionModes) {
      this.allowedTransitEncryptionModes = allowedTransitEncryptionModes;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the SharePatch builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SharePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the SharePatch builder
     */
    public Builder profile(ShareProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the replicationCronSpec.
     *
     * @param replicationCronSpec the replicationCronSpec
     * @return the SharePatch builder
     */
    public Builder replicationCronSpec(String replicationCronSpec) {
      this.replicationCronSpec = replicationCronSpec;
      return this;
    }

    /**
     * Set the size.
     *
     * @param size the size
     * @return the SharePatch builder
     */
    public Builder size(long size) {
      this.size = size;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the SharePatch builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }
  }

  protected SharePatch() { }

  protected SharePatch(Builder builder) {
    accessControlMode = builder.accessControlMode;
    allowedTransitEncryptionModes = builder.allowedTransitEncryptionModes;
    iops = builder.iops;
    name = builder.name;
    profile = builder.profile;
    replicationCronSpec = builder.replicationCronSpec;
    size = builder.size;
    userTags = builder.userTags;
  }

  /**
   * New builder.
   *
   * @return a SharePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessControlMode.
   *
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a
   *   mount target control access to the mount target.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *
   * For this property to be changed, the share must have no mount targets,
   * `replication_role` must be `none` and `accessor_binding_role` must not be `accessor`.
   *
   * @return the accessControlMode
   */
  public String accessControlMode() {
    return accessControlMode;
  }

  /**
   * Gets the allowedTransitEncryptionModes.
   *
   * The transit encryption modes to allow for this share.
   *
   * For this property to be updated, the `accessor_binding_role` must be `none`.
   *
   * @return the allowedTransitEncryptionModes
   */
  public List<String> allowedTransitEncryptionModes() {
    return allowedTransitEncryptionModes;
  }

  /**
   * Gets the iops.
   *
   * The maximum input/output operations per second (IOPS) for the file share. In addition, each client accessing the
   * share will be restricted to 48,000 IOPS.
   *
   * The maximum IOPS for a share may increase in the future. For this property to be changed, the share
   * `accessor_binding_role` must not be `accessor`.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The name for this share. The name must not be used by another share in the region.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this file share.
   *
   * The requested profile must be in the same `family`.
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
   * For this property to be changed, the share `replication_role` must be `replica`.
   *
   * @return the replicationCronSpec
   */
  public String replicationCronSpec() {
    return replicationCronSpec;
  }

  /**
   * Gets the size.
   *
   * The size of the file share (in gigabytes), excluding share snapshots. The value must not be less than the share's
   * current size, and must not exceed the maximum supported by the share's profile and IOPS.
   *
   * For this property to be changed:
   * - The share `lifecycle_state` must be `stable`
   * - The share `replication_role` must not be `replica`
   * - The share `accessor_binding_role` must not be `accessor`.
   *
   * @return the size
   */
  public Long size() {
    return size;
  }

  /**
   * Gets the userTags.
   *
   * Tags for this resource.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Construct a JSON merge-patch from the SharePatch.
   *
   * Note that properties of the SharePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SharePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

