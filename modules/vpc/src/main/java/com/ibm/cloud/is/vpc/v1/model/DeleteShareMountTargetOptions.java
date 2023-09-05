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
 * The deleteShareMountTarget options.
 */
public class DeleteShareMountTargetOptions extends GenericModel {

  protected String shareId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteShareMountTargetOptions instance.
     *
     * @param deleteShareMountTargetOptions the instance to initialize the Builder with
     */
    private Builder(DeleteShareMountTargetOptions deleteShareMountTargetOptions) {
      this.shareId = deleteShareMountTargetOptions.shareId;
      this.id = deleteShareMountTargetOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param shareId the shareId
     * @param id the id
     */
    public Builder(String shareId, String id) {
      this.shareId = shareId;
      this.id = id;
    }

    /**
     * Builds a DeleteShareMountTargetOptions.
     *
     * @return the new DeleteShareMountTargetOptions instance
     */
    public DeleteShareMountTargetOptions build() {
      return new DeleteShareMountTargetOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the DeleteShareMountTargetOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteShareMountTargetOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteShareMountTargetOptions() { }

  protected DeleteShareMountTargetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    shareId = builder.shareId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteShareMountTargetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the shareId.
   *
   * The file share identifier.
   *
   * @return the shareId
   */
  public String shareId() {
    return shareId;
  }

  /**
   * Gets the id.
   *
   * The share mount target identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

