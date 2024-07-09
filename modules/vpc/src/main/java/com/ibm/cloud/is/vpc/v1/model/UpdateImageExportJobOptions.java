/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateImageExportJob options.
 */
public class UpdateImageExportJobOptions extends GenericModel {

  protected String imageId;
  protected String id;
  protected Map<String, Object> imageExportJobPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String imageId;
    private String id;
    private Map<String, Object> imageExportJobPatch;

    /**
     * Instantiates a new Builder from an existing UpdateImageExportJobOptions instance.
     *
     * @param updateImageExportJobOptions the instance to initialize the Builder with
     */
    private Builder(UpdateImageExportJobOptions updateImageExportJobOptions) {
      this.imageId = updateImageExportJobOptions.imageId;
      this.id = updateImageExportJobOptions.id;
      this.imageExportJobPatch = updateImageExportJobOptions.imageExportJobPatch;
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
     * @param id the id
     * @param imageExportJobPatch the imageExportJobPatch
     */
    public Builder(String imageId, String id, Map<String, Object> imageExportJobPatch) {
      this.imageId = imageId;
      this.id = id;
      this.imageExportJobPatch = imageExportJobPatch;
    }

    /**
     * Builds a UpdateImageExportJobOptions.
     *
     * @return the new UpdateImageExportJobOptions instance
     */
    public UpdateImageExportJobOptions build() {
      return new UpdateImageExportJobOptions(this);
    }

    /**
     * Set the imageId.
     *
     * @param imageId the imageId
     * @return the UpdateImageExportJobOptions builder
     */
    public Builder imageId(String imageId) {
      this.imageId = imageId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateImageExportJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the imageExportJobPatch.
     *
     * @param imageExportJobPatch the imageExportJobPatch
     * @return the UpdateImageExportJobOptions builder
     */
    public Builder imageExportJobPatch(Map<String, Object> imageExportJobPatch) {
      this.imageExportJobPatch = imageExportJobPatch;
      return this;
    }
  }

  protected UpdateImageExportJobOptions() { }

  protected UpdateImageExportJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.imageId,
      "imageId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.imageExportJobPatch,
      "imageExportJobPatch cannot be null");
    imageId = builder.imageId;
    id = builder.id;
    imageExportJobPatch = builder.imageExportJobPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateImageExportJobOptions builder
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
   * Gets the id.
   *
   * The image export job identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the imageExportJobPatch.
   *
   * The image export job patch.
   *
   * @return the imageExportJobPatch
   */
  public Map<String, Object> imageExportJobPatch() {
    return imageExportJobPatch;
  }
}

