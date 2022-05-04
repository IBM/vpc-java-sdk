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
 * VolumePrototypeInstanceByImageContext.
 */
public class VolumePrototypeInstanceByImageContext extends VolumeAttachmentPrototypeInstanceWrapper {

  /**
   * Builder.
   */
  public static class Builder {
    private Long capacity;
    private EncryptionKeyIdentity encryptionKey;
    private Long iops;
    private String name;
    private VolumeProfileIdentity profile;

    private Builder(VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContext) {
      this.capacity = volumePrototypeInstanceByImageContext.capacity;
      this.encryptionKey = volumePrototypeInstanceByImageContext.encryptionKey;
      this.iops = volumePrototypeInstanceByImageContext.iops;
      this.name = volumePrototypeInstanceByImageContext.name;
      this.profile = volumePrototypeInstanceByImageContext.profile;
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
     */
    public Builder(VolumeProfileIdentity profile) {
      this.profile = profile;
    }

    /**
     * Builds a VolumePrototypeInstanceByImageContext.
     *
     * @return the new VolumePrototypeInstanceByImageContext instance
     */
    public VolumePrototypeInstanceByImageContext build() {
      return new VolumePrototypeInstanceByImageContext(this);
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the VolumePrototypeInstanceByImageContext builder
     */
    public Builder capacity(long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the VolumePrototypeInstanceByImageContext builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumePrototypeInstanceByImageContext builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumePrototypeInstanceByImageContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the VolumePrototypeInstanceByImageContext builder
     */
    public Builder profile(VolumeProfileIdentity profile) {
      this.profile = profile;
      return this;
    }
  }

  protected VolumePrototypeInstanceByImageContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    capacity = builder.capacity;
    encryptionKey = builder.encryptionKey;
    iops = builder.iops;
    name = builder.name;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a VolumePrototypeInstanceByImageContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the capacity.
   *
   * The capacity to use for the volume (in gigabytes). Must be at least the image's
   * `minimum_provisioned_size`. The maximum value may increase in the future.
   *
   * If unspecified, the capacity will be the image's `minimum_provisioned_size`.
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
   * If unspecified, and the image is encrypted, the image's `encryption_key` will be
   * used. Otherwise, the `encryption` type for the volume will be `provider_managed`.
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
}

