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
 * The getShareSource options.
 */
public class GetShareSourceOptions extends GenericModel {

  protected String shareId;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;

    /**
     * Instantiates a new Builder from an existing GetShareSourceOptions instance.
     *
     * @param getShareSourceOptions the instance to initialize the Builder with
     */
    private Builder(GetShareSourceOptions getShareSourceOptions) {
      this.shareId = getShareSourceOptions.shareId;
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
     */
    public Builder(String shareId) {
      this.shareId = shareId;
    }

    /**
     * Builds a GetShareSourceOptions.
     *
     * @return the new GetShareSourceOptions instance
     */
    public GetShareSourceOptions build() {
      return new GetShareSourceOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the GetShareSourceOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }
  }

  protected GetShareSourceOptions() { }

  protected GetShareSourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    shareId = builder.shareId;
  }

  /**
   * New builder.
   *
   * @return a GetShareSourceOptions builder
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
}

