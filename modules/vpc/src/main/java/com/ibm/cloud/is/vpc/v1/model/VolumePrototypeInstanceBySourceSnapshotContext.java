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
 * VolumePrototypeInstanceBySourceSnapshotContext.
 */
public class VolumePrototypeInstanceBySourceSnapshotContext extends VolumePrototypeInstance {

  /**
   * Builder.
   */
  public static class Builder {
    private Long bandwidth;
    private Long capacity;
    private EncryptionKeyIdentity encryptionKey;
    private Long iops;
    private String name;
    private VolumeProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private SnapshotIdentity sourceSnapshot;
    private List<String> userTags;

    /**
     * Instantiates a new Builder from an existing VolumePrototypeInstanceBySourceSnapshotContext instance.
     *
     * @param volumePrototypeInstanceBySourceSnapshotContext the instance to initialize the Builder with
     */
    private Builder(VolumePrototypeInstanceBySourceSnapshotContext volumePrototypeInstanceBySourceSnapshotContext) {
      this.bandwidth = volumePrototypeInstanceBySourceSnapshotContext.bandwidth;
      this.capacity = volumePrototypeInstanceBySourceSnapshotContext.capacity;
      this.encryptionKey = volumePrototypeInstanceBySourceSnapshotContext.encryptionKey;
      this.iops = volumePrototypeInstanceBySourceSnapshotContext.iops;
      this.name = volumePrototypeInstanceBySourceSnapshotContext.name;
      this.profile = volumePrototypeInstanceBySourceSnapshotContext.profile;
      this.resourceGroup = volumePrototypeInstanceBySourceSnapshotContext.resourceGroup;
      this.sourceSnapshot = volumePrototypeInstanceBySourceSnapshotContext.sourceSnapshot;
      this.userTags = volumePrototypeInstanceBySourceSnapshotContext.userTags;
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
    public Builder(VolumeProfileIdentity profile, SnapshotIdentity sourceSnapshot) {
      this.profile = profile;
      this.sourceSnapshot = sourceSnapshot;
    }

    /**
     * Builds a VolumePrototypeInstanceBySourceSnapshotContext.
     *
     * @return the new VolumePrototypeInstanceBySourceSnapshotContext instance
     */
    public VolumePrototypeInstanceBySourceSnapshotContext build() {
      return new VolumePrototypeInstanceBySourceSnapshotContext(this);
    }

    /**
     * Adds a new element to userTags.
     *
     * @param userTags the new element to be added
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
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
     * Set the bandwidth.
     *
     * @param bandwidth the bandwidth
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder bandwidth(long bandwidth) {
      this.bandwidth = bandwidth;
      return this;
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder capacity(long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder profile(VolumeProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the sourceSnapshot.
     *
     * @param sourceSnapshot the sourceSnapshot
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder sourceSnapshot(SnapshotIdentity sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }
  }

  protected VolumePrototypeInstanceBySourceSnapshotContext() { }

  protected VolumePrototypeInstanceBySourceSnapshotContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceSnapshot,
      "sourceSnapshot cannot be null");
    bandwidth = builder.bandwidth;
    capacity = builder.capacity;
    encryptionKey = builder.encryptionKey;
    iops = builder.iops;
    name = builder.name;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    sourceSnapshot = builder.sourceSnapshot;
    userTags = builder.userTags;
  }

  /**
   * New builder.
   *
   * @return a VolumePrototypeInstanceBySourceSnapshotContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bandwidth.
   *
   * The maximum bandwidth (in megabits per second) for the volume.
   *
   * If the volume profile has a `bandwidth.type` of `dependent`, this property is system-managed and must not be
   * specified.
   *
   * Provided the property is user-managed, if it is unspecified, its value will be set based on the specified [`iops`
   * and
   * `capacity`](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles&amp;interface=api).
   *
   * @return the bandwidth
   */
  public Long bandwidth() {
    return bandwidth;
  }

  /**
   * Gets the capacity.
   *
   * The capacity to use for the volume (in gigabytes). The specified value must be at least the snapshot's
   * `minimum_capacity`, at most 250 gigabytes, and within the `boot_capacity` range of the volume's profile.
   *
   * @return the capacity
   */
  public Long capacity() {
    return capacity;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key to use to wrap the data encryption key for the volume.
   *
   * If unspecified, the `encryption` type for the volume will be `provider_managed`.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the iops.
   *
   * The maximum I/O operations per second (IOPS) to use for this volume.
   *
   * If the volume profile has a `iops.type` of `dependent`, this property is system-managed and must not be specified.
   *
   * Provided the property is user-managed, if it is unspecified, its value will be set based on the specified [
   * `capacity`](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles&amp;interface=api).
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The name for this volume. The name must not be used by another volume in the region. If unspecified, the name will
   * be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles) for
   * this volume.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use for this volume. If unspecified, the instance's resource
   * group will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * The snapshot to use as a source for the volume's data.
   *
   * The specified snapshot may be in a different account, subject to IAM policies.
   *
   * To create a volume from a `source_snapshot`, the volume profile and the
   * source snapshot must have the same `storage_generation` value.
   *
   * @return the sourceSnapshot
   */
  public SnapshotIdentity sourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this volume.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }
}

