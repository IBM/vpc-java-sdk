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
 * The getShareMountTarget options.
 */
public class GetShareMountTargetOptions extends GenericModel {

  protected String shareId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetShareMountTargetOptions instance.
     *
     * @param getShareMountTargetOptions the instance to initialize the Builder with
     */
    private Builder(GetShareMountTargetOptions getShareMountTargetOptions) {
      this.shareId = getShareMountTargetOptions.shareId;
      this.id = getShareMountTargetOptions.id;
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
     * Builds a GetShareMountTargetOptions.
     *
     * @return the new GetShareMountTargetOptions instance
     */
    public GetShareMountTargetOptions build() {
      return new GetShareMountTargetOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the GetShareMountTargetOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetShareMountTargetOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetShareMountTargetOptions() { }

  protected GetShareMountTargetOptions(Builder builder) {
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
   * @return a GetShareMountTargetOptions builder
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
   * The file share mount target identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

