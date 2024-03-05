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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createShareMountTarget options.
 */
public class CreateShareMountTargetOptions extends GenericModel {

  protected String shareId;
  protected ShareMountTargetPrototype shareMountTargetPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private ShareMountTargetPrototype shareMountTargetPrototype;

    /**
     * Instantiates a new Builder from an existing CreateShareMountTargetOptions instance.
     *
     * @param createShareMountTargetOptions the instance to initialize the Builder with
     */
    private Builder(CreateShareMountTargetOptions createShareMountTargetOptions) {
      this.shareId = createShareMountTargetOptions.shareId;
      this.shareMountTargetPrototype = createShareMountTargetOptions.shareMountTargetPrototype;
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
     * @param shareMountTargetPrototype the shareMountTargetPrototype
     */
    public Builder(String shareId, ShareMountTargetPrototype shareMountTargetPrototype) {
      this.shareId = shareId;
      this.shareMountTargetPrototype = shareMountTargetPrototype;
    }

    /**
     * Builds a CreateShareMountTargetOptions.
     *
     * @return the new CreateShareMountTargetOptions instance
     */
    public CreateShareMountTargetOptions build() {
      return new CreateShareMountTargetOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the CreateShareMountTargetOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the shareMountTargetPrototype.
     *
     * @param shareMountTargetPrototype the shareMountTargetPrototype
     * @return the CreateShareMountTargetOptions builder
     */
    public Builder shareMountTargetPrototype(ShareMountTargetPrototype shareMountTargetPrototype) {
      this.shareMountTargetPrototype = shareMountTargetPrototype;
      return this;
    }
  }

  protected CreateShareMountTargetOptions() { }

  protected CreateShareMountTargetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.shareMountTargetPrototype,
      "shareMountTargetPrototype cannot be null");
    shareId = builder.shareId;
    shareMountTargetPrototype = builder.shareMountTargetPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateShareMountTargetOptions builder
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
   * Gets the shareMountTargetPrototype.
   *
   * The share mount target prototype object.
   *
   * @return the shareMountTargetPrototype
   */
  public ShareMountTargetPrototype shareMountTargetPrototype() {
    return shareMountTargetPrototype;
  }
}

