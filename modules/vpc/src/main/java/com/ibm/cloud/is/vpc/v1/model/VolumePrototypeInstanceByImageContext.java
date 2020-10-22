/*
 * (C) Copyright IBM Corp. 2020.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumePrototypeInstanceByImageContext.
 */
public class VolumePrototypeInstanceByImageContext extends GenericModel {

  protected String name;
  protected VolumeProfileIdentity profile;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  protected Long capacity;
  protected Long iops;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private VolumeProfileIdentity profile;
    private EncryptionKeyIdentity encryptionKey;
    private Long capacity;
    private Long iops;

    private Builder(VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContext) {
      this.name = volumePrototypeInstanceByImageContext.name;
      this.profile = volumePrototypeInstanceByImageContext.profile;
      this.encryptionKey = volumePrototypeInstanceByImageContext.encryptionKey;
      this.capacity = volumePrototypeInstanceByImageContext.capacity;
      this.iops = volumePrototypeInstanceByImageContext.iops;
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
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumePrototypeInstanceByImageContext builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }
  }

  protected VolumePrototypeInstanceByImageContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    name = builder.name;
    profile = builder.profile;
    encryptionKey = builder.encryptionKey;
    capacity = builder.capacity;
    iops = builder.iops;
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
   * Gets the encryptionKey.
   *
   * The identity of the root key to use to wrap the data encryption key for the volume.
   *
   * If this property is not provided but the image is encrypted, the image's
   * `encryption_key` will be used. Otherwise, the `encryption` type for the
   * volume will be `provider_managed`.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the capacity.
   *
   * The capacity of the volume in gigabytes. Note that the specified minimum and maximum capacity values for creating
   * or updating volumes may expand in the future.
   *
   * @return the capacity
   */
  public Long capacity() {
    return capacity;
  }

  /**
   * Gets the iops.
   *
   * The bandwidth for the volume.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }
}

