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


/**
 * VolumePrototypeInstanceBySourceSnapshotContext.
 */
public class VolumePrototypeInstanceBySourceSnapshotContext extends VolumeAttachmentPrototypeInstanceWrapper {

  /**
   * Builder.
   */
  public static class Builder {
    private Long capacity;
    private EncryptionKeyIdentity encryptionKey;
    private Long iops;
    private String name;
    private VolumeProfileIdentity profile;
    private SnapshotIdentity sourceSnapshot;

    private Builder(VolumePrototypeInstanceBySourceSnapshotContext volumePrototypeInstanceBySourceSnapshotContext) {
      this.capacity = volumePrototypeInstanceBySourceSnapshotContext.capacity;
      this.encryptionKey = volumePrototypeInstanceBySourceSnapshotContext.encryptionKey;
      this.iops = volumePrototypeInstanceBySourceSnapshotContext.iops;
      this.name = volumePrototypeInstanceBySourceSnapshotContext.name;
      this.profile = volumePrototypeInstanceBySourceSnapshotContext.profile;
      this.sourceSnapshot = volumePrototypeInstanceBySourceSnapshotContext.sourceSnapshot;
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
     * Set the sourceSnapshot.
     *
     * @param sourceSnapshot the sourceSnapshot
     * @return the VolumePrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder sourceSnapshot(SnapshotIdentity sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
      return this;
    }
  }

  protected VolumePrototypeInstanceBySourceSnapshotContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceSnapshot,
      "sourceSnapshot cannot be null");
    capacity = builder.capacity;
    encryptionKey = builder.encryptionKey;
    iops = builder.iops;
    name = builder.name;
    profile = builder.profile;
    sourceSnapshot = builder.sourceSnapshot;
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
   * Gets the capacity.
   *
   * The capacity to use for the volume (in gigabytes). Must be at least the snapshot's
   * `minimum_capacity`. The maximum value may increase in the future.
   *
   * If unspecified, the capacity will be the source snapshot's `minimum_capacity`.
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
   * If unspecified, the snapshot's `encryption_key` will be used.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the iops.
   *
   * The maximum I/O operations per second (IOPS) to use for the volume. Applicable only to volumes using a profile
   * `family` of `custom`.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this volume.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this volume.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * The snapshot from which to clone the volume.
   *
   * @return the sourceSnapshot
   */
  public SnapshotIdentity sourceSnapshot() {
    return sourceSnapshot;
  }
}

