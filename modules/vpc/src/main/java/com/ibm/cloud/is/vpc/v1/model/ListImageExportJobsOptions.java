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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listImageExportJobs options.
 */
public class ListImageExportJobsOptions extends GenericModel {

  protected String imageId;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String imageId;
    private String name;

    /**
     * Instantiates a new Builder from an existing ListImageExportJobsOptions instance.
     *
     * @param listImageExportJobsOptions the instance to initialize the Builder with
     */
    private Builder(ListImageExportJobsOptions listImageExportJobsOptions) {
      this.imageId = listImageExportJobsOptions.imageId;
      this.name = listImageExportJobsOptions.name;
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
     */
    public Builder(String imageId) {
      this.imageId = imageId;
    }

    /**
     * Builds a ListImageExportJobsOptions.
     *
     * @return the new ListImageExportJobsOptions instance
     */
    public ListImageExportJobsOptions build() {
      return new ListImageExportJobsOptions(this);
    }

    /**
     * Set the imageId.
     *
     * @param imageId the imageId
     * @return the ListImageExportJobsOptions builder
     */
    public Builder imageId(String imageId) {
      this.imageId = imageId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListImageExportJobsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ListImageExportJobsOptions() { }

  protected ListImageExportJobsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.imageId,
      "imageId cannot be empty");
    imageId = builder.imageId;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ListImageExportJobsOptions builder
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
   * Gets the name.
   *
   * Filters the collection to resources with a `name` property matching the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

