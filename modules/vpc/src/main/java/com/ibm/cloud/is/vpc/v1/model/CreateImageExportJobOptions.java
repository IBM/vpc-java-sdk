/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createImageExportJob options.
 */
public class CreateImageExportJobOptions extends GenericModel {

  /**
   * The format to use for the exported image. If the image is encrypted, only `qcow2` is supported.
   */
  public interface Format {
    /** qcow2. */
    String QCOW2 = "qcow2";
    /** vhd. */
    String VHD = "vhd";
  }

  protected String imageId;
  protected CloudObjectStorageBucketIdentity storageBucket;
  protected String format;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String imageId;
    private CloudObjectStorageBucketIdentity storageBucket;
    private String format;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateImageExportJobOptions instance.
     *
     * @param createImageExportJobOptions the instance to initialize the Builder with
     */
    private Builder(CreateImageExportJobOptions createImageExportJobOptions) {
      this.imageId = createImageExportJobOptions.imageId;
      this.storageBucket = createImageExportJobOptions.storageBucket;
      this.format = createImageExportJobOptions.format;
      this.name = createImageExportJobOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param imageId the imageId
     * @param storageBucket the storageBucket
     */
    public Builder(String imageId, CloudObjectStorageBucketIdentity storageBucket) {
      this.imageId = imageId;
      this.storageBucket = storageBucket;
    }

    /**
     * Builds a CreateImageExportJobOptions.
     *
     * @return the new CreateImageExportJobOptions instance
     */
    public CreateImageExportJobOptions build() {
      return new CreateImageExportJobOptions(this);
    }

    /**
     * Set the imageId.
     *
     * @param imageId the imageId
     * @return the CreateImageExportJobOptions builder
     */
    public Builder imageId(String imageId) {
      this.imageId = imageId;
      return this;
    }

    /**
     * Set the storageBucket.
     *
     * @param storageBucket the storageBucket
     * @return the CreateImageExportJobOptions builder
     */
    public Builder storageBucket(CloudObjectStorageBucketIdentity storageBucket) {
      this.storageBucket = storageBucket;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the CreateImageExportJobOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateImageExportJobOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateImageExportJobOptions() { }

  protected CreateImageExportJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.imageId,
      "imageId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.storageBucket,
      "storageBucket cannot be null");
    imageId = builder.imageId;
    storageBucket = builder.storageBucket;
    format = builder.format;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateImageExportJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the imageId.
   *
   * The image identifier.
   *
   * @return the imageId
   */
  public String imageId() {
    return imageId;
  }

  /**
   * Gets the storageBucket.
   *
   * The Cloud Object Storage bucket to export the image to. The bucket must exist and an IAM
   * service authorization must grant `Image Service for VPC` of
   * `VPC Infrastructure Services` writer access to the bucket.
   *
   * @return the storageBucket
   */
  public CloudObjectStorageBucketIdentity storageBucket() {
    return storageBucket;
  }

  /**
   * Gets the format.
   *
   * The format to use for the exported image. If the image is encrypted, only `qcow2` is supported.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the name.
   *
   * The name for this image export job. The name must not be used by another export job for the image. If unspecified,
   * the name will be a hyphenated list of randomly-selected words prefixed with the first 16 characters of the parent
   * image name.
   *
   * The exported image object name in Cloud Object Storage (`storage_object.name` in the response) will be based on
   * this name. The object name will be unique within the bucket.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

