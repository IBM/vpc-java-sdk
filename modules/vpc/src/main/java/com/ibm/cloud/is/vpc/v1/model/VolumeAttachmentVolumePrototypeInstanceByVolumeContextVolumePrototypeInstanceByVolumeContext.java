/*
 * (C) Copyright IBM Corp. 2021.
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
 * VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.
 */
public class VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext extends VolumeAttachmentVolumePrototypeInstanceByVolumeContext {


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

    public Builder(VolumeAttachmentVolumePrototypeInstanceByVolumeContext volumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext) {
      this.capacity = volumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.capacity;
      this.encryptionKey = volumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.encryptionKey;
      this.iops = volumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.iops;
      this.name = volumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.name;
      this.profile = volumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.profile;
      this.sourceSnapshot = volumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.sourceSnapshot;
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
     * Builds a VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext.
     *
     * @return the new VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext instance
     */
    public VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext build() {
      return new VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext(this);
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext builder
     */
    public Builder capacity(long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext builder
     */
    public Builder profile(VolumeProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the sourceSnapshot.
     *
     * @param sourceSnapshot the sourceSnapshot
     * @return the VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext builder
     */
    public Builder sourceSnapshot(SnapshotIdentity sourceSnapshot) {
      this.sourceSnapshot = sourceSnapshot;
      return this;
    }
  }

  protected VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext(Builder builder) {
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
   * @return a VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

