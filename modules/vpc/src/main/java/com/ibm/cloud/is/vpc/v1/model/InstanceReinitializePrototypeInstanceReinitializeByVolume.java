/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * Reinitialize an instance by using a boot volume.
 */
public class InstanceReinitializePrototypeInstanceReinitializeByVolume extends InstanceReinitializePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private InstanceDefaultTrustedProfilePrototype defaultTrustedProfile;
    private List<KeyIdentity> keys;
    private String userData;
    private VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment;

    /**
     * Instantiates a new Builder from an existing InstanceReinitializePrototypeInstanceReinitializeByVolume instance.
     *
     * @param instanceReinitializePrototypeInstanceReinitializeByVolume the instance to initialize the Builder with
     */
    public Builder(InstanceReinitializePrototype instanceReinitializePrototypeInstanceReinitializeByVolume) {
      this.defaultTrustedProfile = instanceReinitializePrototypeInstanceReinitializeByVolume.defaultTrustedProfile;
      this.keys = instanceReinitializePrototypeInstanceReinitializeByVolume.keys;
      this.userData = instanceReinitializePrototypeInstanceReinitializeByVolume.userData;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceByVolumeContext) instanceReinitializePrototypeInstanceReinitializeByVolume.bootVolumeAttachment;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     */
    public Builder(VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
    }

    /**
     * Builds a InstanceReinitializePrototypeInstanceReinitializeByVolume.
     *
     * @return the new InstanceReinitializePrototypeInstanceReinitializeByVolume instance
     */
    public InstanceReinitializePrototypeInstanceReinitializeByVolume build() {
      return new InstanceReinitializePrototypeInstanceReinitializeByVolume(this);
    }

    /**
     * Adds a new element to keys.
     *
     * @param keys the new element to be added
     * @return the InstanceReinitializePrototypeInstanceReinitializeByVolume builder
     */
    public Builder addKeys(KeyIdentity keys) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keys,
        "keys cannot be null");
      if (this.keys == null) {
        this.keys = new ArrayList<KeyIdentity>();
      }
      this.keys.add(keys);
      return this;
    }

    /**
     * Set the defaultTrustedProfile.
     *
     * @param defaultTrustedProfile the defaultTrustedProfile
     * @return the InstanceReinitializePrototypeInstanceReinitializeByVolume builder
     */
    public Builder defaultTrustedProfile(InstanceDefaultTrustedProfilePrototype defaultTrustedProfile) {
      this.defaultTrustedProfile = defaultTrustedProfile;
      return this;
    }

    /**
     * Set the keys.
     * Existing keys will be replaced.
     *
     * @param keys the keys
     * @return the InstanceReinitializePrototypeInstanceReinitializeByVolume builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstanceReinitializePrototypeInstanceReinitializeByVolume builder
     */
    public Builder userData(String userData) {
      this.userData = userData;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstanceReinitializePrototypeInstanceReinitializeByVolume builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }
  }

  protected InstanceReinitializePrototypeInstanceReinitializeByVolume() { }

  protected InstanceReinitializePrototypeInstanceReinitializeByVolume(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bootVolumeAttachment,
      "bootVolumeAttachment cannot be null");
    defaultTrustedProfile = builder.defaultTrustedProfile;
    keys = builder.keys;
    userData = builder.userData;
    bootVolumeAttachment = builder.bootVolumeAttachment;
  }

  /**
   * New builder.
   *
   * @return a InstanceReinitializePrototypeInstanceReinitializeByVolume builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

