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
 * Reinitialize an instance by using an image. The image must be within the same operating system family as the current
 * instance image, and must have the same licensing model.
 */
public class InstanceReinitializePrototypeInstanceReinitializeByImage extends InstanceReinitializePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private InstanceDefaultTrustedProfilePrototype defaultTrustedProfile;
    private List<KeyIdentity> keys;
    private String userData;
    private VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment;
    private ImageIdentity image;

    /**
     * Instantiates a new Builder from an existing InstanceReinitializePrototypeInstanceReinitializeByImage instance.
     *
     * @param instanceReinitializePrototypeInstanceReinitializeByImage the instance to initialize the Builder with
     */
    public Builder(InstanceReinitializePrototype instanceReinitializePrototypeInstanceReinitializeByImage) {
      this.defaultTrustedProfile = instanceReinitializePrototypeInstanceReinitializeByImage.defaultTrustedProfile;
      this.keys = instanceReinitializePrototypeInstanceReinitializeByImage.keys;
      this.userData = instanceReinitializePrototypeInstanceReinitializeByImage.userData;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceByImageContext) instanceReinitializePrototypeInstanceReinitializeByImage.bootVolumeAttachment;
      this.image = instanceReinitializePrototypeInstanceReinitializeByImage.image;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param image the image
     */
    public Builder(ImageIdentity image) {
      this.image = image;
    }

    /**
     * Builds a InstanceReinitializePrototypeInstanceReinitializeByImage.
     *
     * @return the new InstanceReinitializePrototypeInstanceReinitializeByImage instance
     */
    public InstanceReinitializePrototypeInstanceReinitializeByImage build() {
      return new InstanceReinitializePrototypeInstanceReinitializeByImage(this);
    }

    /**
     * Adds a new element to keys.
     *
     * @param keys the new element to be added
     * @return the InstanceReinitializePrototypeInstanceReinitializeByImage builder
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
     * @return the InstanceReinitializePrototypeInstanceReinitializeByImage builder
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
     * @return the InstanceReinitializePrototypeInstanceReinitializeByImage builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstanceReinitializePrototypeInstanceReinitializeByImage builder
     */
    public Builder userData(String userData) {
      this.userData = userData;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstanceReinitializePrototypeInstanceReinitializeByImage builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the image.
     *
     * @param image the image
     * @return the InstanceReinitializePrototypeInstanceReinitializeByImage builder
     */
    public Builder image(ImageIdentity image) {
      this.image = image;
      return this;
    }
  }

  protected InstanceReinitializePrototypeInstanceReinitializeByImage() { }

  protected InstanceReinitializePrototypeInstanceReinitializeByImage(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.image,
      "image cannot be null");
    defaultTrustedProfile = builder.defaultTrustedProfile;
    keys = builder.keys;
    userData = builder.userData;
    bootVolumeAttachment = builder.bootVolumeAttachment;
    image = builder.image;
  }

  /**
   * New builder.
   *
   * @return a InstanceReinitializePrototypeInstanceReinitializeByImage builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

