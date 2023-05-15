/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
 * The getImageExportJob options.
 */
public class GetImageExportJobOptions extends GenericModel {

  protected String imageId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String imageId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetImageExportJobOptions instance.
     *
     * @param getImageExportJobOptions the instance to initialize the Builder with
     */
    private Builder(GetImageExportJobOptions getImageExportJobOptions) {
      this.imageId = getImageExportJobOptions.imageId;
      this.id = getImageExportJobOptions.id;
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
     */
    public Builder(String imageId, String id) {
      this.imageId = imageId;
      this.id = id;
    }

    /**
     * Builds a GetImageExportJobOptions.
     *
     * @return the new GetImageExportJobOptions instance
     */
    public GetImageExportJobOptions build() {
      return new GetImageExportJobOptions(this);
    }

    /**
     * Set the imageId.
     *
     * @param imageId the imageId
     * @return the GetImageExportJobOptions builder
     */
    public Builder imageId(String imageId) {
      this.imageId = imageId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetImageExportJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetImageExportJobOptions() { }

  protected GetImageExportJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.imageId,
      "imageId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    imageId = builder.imageId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetImageExportJobOptions builder
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
}

