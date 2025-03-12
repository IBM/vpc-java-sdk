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

import java.util.Date;

/**
 * ImagePrototypeImageByFile.
 */
public class ImagePrototypeImageByFile extends ImagePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Date deprecationAt;
    private String name;
    private Date obsolescenceAt;
    private ResourceGroupIdentity resourceGroup;
    private String encryptedDataKey;
    private EncryptionKeyIdentity encryptionKey;
    private ImageFilePrototype file;
    private OperatingSystemIdentity operatingSystem;

    /**
     * Instantiates a new Builder from an existing ImagePrototypeImageByFile instance.
     *
     * @param imagePrototypeImageByFile the instance to initialize the Builder with
     */
    public Builder(ImagePrototype imagePrototypeImageByFile) {
      this.deprecationAt = imagePrototypeImageByFile.deprecationAt;
      this.name = imagePrototypeImageByFile.name;
      this.obsolescenceAt = imagePrototypeImageByFile.obsolescenceAt;
      this.resourceGroup = imagePrototypeImageByFile.resourceGroup;
      this.encryptedDataKey = imagePrototypeImageByFile.encryptedDataKey;
      this.encryptionKey = imagePrototypeImageByFile.encryptionKey;
      this.file = imagePrototypeImageByFile.file;
      this.operatingSystem = imagePrototypeImageByFile.operatingSystem;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param file the file
     * @param operatingSystem the operatingSystem
     */
    public Builder(ImageFilePrototype file, OperatingSystemIdentity operatingSystem) {
      this.file = file;
      this.operatingSystem = operatingSystem;
    }

    /**
     * Builds a ImagePrototypeImageByFile.
     *
     * @return the new ImagePrototypeImageByFile instance
     */
    public ImagePrototypeImageByFile build() {
      return new ImagePrototypeImageByFile(this);
    }

    /**
     * Set the deprecationAt.
     *
     * @param deprecationAt the deprecationAt
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder deprecationAt(Date deprecationAt) {
      this.deprecationAt = deprecationAt;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the obsolescenceAt.
     *
     * @param obsolescenceAt the obsolescenceAt
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder obsolescenceAt(Date obsolescenceAt) {
      this.obsolescenceAt = obsolescenceAt;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the encryptedDataKey.
     *
     * @param encryptedDataKey the encryptedDataKey
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder encryptedDataKey(String encryptedDataKey) {
      this.encryptedDataKey = encryptedDataKey;
      return this;
    }

    /**
     * Set the encryptionKey.
     *
     * @param encryptionKey the encryptionKey
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder encryptionKey(EncryptionKeyIdentity encryptionKey) {
      this.encryptionKey = encryptionKey;
      return this;
    }

    /**
     * Set the file.
     *
     * @param file the file
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder file(ImageFilePrototype file) {
      this.file = file;
      return this;
    }

    /**
     * Set the operatingSystem.
     *
     * @param operatingSystem the operatingSystem
     * @return the ImagePrototypeImageByFile builder
     */
    public Builder operatingSystem(OperatingSystemIdentity operatingSystem) {
      this.operatingSystem = operatingSystem;
      return this;
    }
  }

  protected ImagePrototypeImageByFile() { }

  protected ImagePrototypeImageByFile(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.file,
      "file cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operatingSystem,
      "operatingSystem cannot be null");
    deprecationAt = builder.deprecationAt;
    name = builder.name;
    obsolescenceAt = builder.obsolescenceAt;
    resourceGroup = builder.resourceGroup;
    encryptedDataKey = builder.encryptedDataKey;
    encryptionKey = builder.encryptionKey;
    file = builder.file;
    operatingSystem = builder.operatingSystem;
  }

  /**
   * New builder.
   *
   * @return a ImagePrototypeImageByFile builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

