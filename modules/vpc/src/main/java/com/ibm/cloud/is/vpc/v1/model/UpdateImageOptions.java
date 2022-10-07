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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateImage options.
 */
public class UpdateImageOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> imagePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> imagePatch;

    /**
     * Instantiates a new Builder from an existing UpdateImageOptions instance.
     *
     * @param updateImageOptions the instance to initialize the Builder with
     */
    private Builder(UpdateImageOptions updateImageOptions) {
      this.id = updateImageOptions.id;
      this.imagePatch = updateImageOptions.imagePatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param imagePatch the imagePatch
     */
    public Builder(String id, Map<String, Object> imagePatch) {
      this.id = id;
      this.imagePatch = imagePatch;
    }

    /**
     * Builds a UpdateImageOptions.
     *
     * @return the new UpdateImageOptions instance
     */
    public UpdateImageOptions build() {
      return new UpdateImageOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateImageOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the imagePatch.
     *
     * @param imagePatch the imagePatch
     * @return the UpdateImageOptions builder
     */
    public Builder imagePatch(Map<String, Object> imagePatch) {
      this.imagePatch = imagePatch;
      return this;
    }
  }

  protected UpdateImageOptions() { }

  protected UpdateImageOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.imagePatch,
      "imagePatch cannot be null");
    id = builder.id;
    imagePatch = builder.imagePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateImageOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The image identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the imagePatch.
   *
   * The image patch.
   *
   * @return the imagePatch
   */
  public Map<String, Object> imagePatch() {
    return imagePatch;
  }
}

