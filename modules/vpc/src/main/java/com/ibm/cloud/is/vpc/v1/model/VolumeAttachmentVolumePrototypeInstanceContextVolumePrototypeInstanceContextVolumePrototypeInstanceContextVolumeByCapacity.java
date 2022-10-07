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

import java.util.ArrayList;
import java.util.List;

/**
 * VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.
 */
public class VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity extends VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContext {


  /**
   * Builder.
   */
  public static class Builder {
    private Long iops;
    private String name;
    private VolumeProfileIdentity profile;
    private List<String> userTags;
    private Long capacity;
    private EncryptionKeyIdentity encryptionKey;

    /**
     * Instantiates a new Builder from an existing VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity instance.
     *
     * @param volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity the instance to initialize the Builder with
     */
    public Builder(VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContext volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity) {
      this.iops = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.iops;
      this.name = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.name;
      this.profile = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.profile;
      this.userTags = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.userTags;
      this.capacity = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.capacity;
      this.encryptionKey = volumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.encryptionKey;
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
     * @param capacity the capacity
     */
    public Builder(VolumeProfileIdentity profile, Long capacity) {
      this.profile = profile;
      this.capacity = capacity;
    }

    /**
     * Builds a VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.
     *
     * @return the new VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity instance
     */
    public VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity build() {
      return new VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity(this);
    }

    /**
     * Adds an userTags to userTags.
     *
     * @param userTags the new userTags
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
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
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
     */
    public Builder profile(VolumeProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
     */
    public Builder capacity(long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }
  }

  protected VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity() { }

  protected VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.capacity,
      "capacity cannot be null");
    iops = builder.iops;
    name = builder.name;
    profile = builder.profile;
    userTags = builder.userTags;
    capacity = builder.capacity;
    encryptionKey = builder.encryptionKey;
  }

  /**
   * New builder.
   *
   * @return a VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

