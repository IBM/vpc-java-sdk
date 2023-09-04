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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateShareMountTarget options.
 */
public class UpdateShareMountTargetOptions extends GenericModel {

  protected String shareId;
  protected String id;
  protected Map<String, Object> shareMountTargetPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String id;
    private Map<String, Object> shareMountTargetPatch;

    /**
     * Instantiates a new Builder from an existing UpdateShareMountTargetOptions instance.
     *
     * @param updateShareMountTargetOptions the instance to initialize the Builder with
     */
    private Builder(UpdateShareMountTargetOptions updateShareMountTargetOptions) {
      this.shareId = updateShareMountTargetOptions.shareId;
      this.id = updateShareMountTargetOptions.id;
      this.shareMountTargetPatch = updateShareMountTargetOptions.shareMountTargetPatch;
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
     * @param shareMountTargetPatch the shareMountTargetPatch
     */
    public Builder(String shareId, String id, Map<String, Object> shareMountTargetPatch) {
      this.shareId = shareId;
      this.id = id;
      this.shareMountTargetPatch = shareMountTargetPatch;
    }

    /**
     * Builds a UpdateShareMountTargetOptions.
     *
     * @return the new UpdateShareMountTargetOptions instance
     */
    public UpdateShareMountTargetOptions build() {
      return new UpdateShareMountTargetOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the UpdateShareMountTargetOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateShareMountTargetOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the shareMountTargetPatch.
     *
     * @param shareMountTargetPatch the shareMountTargetPatch
     * @return the UpdateShareMountTargetOptions builder
     */
    public Builder shareMountTargetPatch(Map<String, Object> shareMountTargetPatch) {
      this.shareMountTargetPatch = shareMountTargetPatch;
      return this;
    }
  }

  protected UpdateShareMountTargetOptions() { }

  protected UpdateShareMountTargetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.shareMountTargetPatch,
      "shareMountTargetPatch cannot be null");
    shareId = builder.shareId;
    id = builder.id;
    shareMountTargetPatch = builder.shareMountTargetPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateShareMountTargetOptions builder
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

  /**
   * Gets the shareMountTargetPatch.
   *
   * The share mount target patch.
   *
   * @return the shareMountTargetPatch
   */
  public Map<String, Object> shareMountTargetPatch() {
    return shareMountTargetPatch;
  }
}

