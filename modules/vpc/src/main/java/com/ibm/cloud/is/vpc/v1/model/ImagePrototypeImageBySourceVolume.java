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
 * ImagePrototypeImageBySourceVolume.
 */
public class ImagePrototypeImageBySourceVolume extends ImagePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private EncryptionKeyIdentity encryptionKey;
    private VolumeIdentity sourceVolume;

    public Builder(ImagePrototype imagePrototypeImageBySourceVolume) {
      this.name = imagePrototypeImageBySourceVolume.name;
      this.resourceGroup = imagePrototypeImageBySourceVolume.resourceGroup;
      this.encryptionKey = imagePrototypeImageBySourceVolume.encryptionKey;
      this.sourceVolume = imagePrototypeImageBySourceVolume.sourceVolume;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceVolume the sourceVolume
     */
    public Builder(VolumeIdentity sourceVolume) {
      this.sourceVolume = sourceVolume;
    }

    /**
     * Builds a ImagePrototypeImageBySourceVolume.
     *
     * @return the new ImagePrototypeImageBySourceVolume instance
     */
    public ImagePrototypeImageBySourceVolume build() {
      return new ImagePrototypeImageBySourceVolume(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ImagePrototypeImageBySourceVolume builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the ImagePrototypeImageBySourceVolume builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the ImagePrototypeImageBySourceVolume builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the sourceVolume.
     *
     * @param sourceVolume the sourceVolume
     * @return the ImagePrototypeImageBySourceVolume builder
     */
    public Builder sourceVolume(VolumeIdentity sourceVolume) {
      this.sourceVolume = sourceVolume;
      return this;
    }
  }

  protected ImagePrototypeImageBySourceVolume(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceVolume,
      "sourceVolume cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    encryptionKey = builder.encryptionKey;
    sourceVolume = builder.sourceVolume;
  }

  /**
   * New builder.
   *
   * @return a ImagePrototypeImageBySourceVolume builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

