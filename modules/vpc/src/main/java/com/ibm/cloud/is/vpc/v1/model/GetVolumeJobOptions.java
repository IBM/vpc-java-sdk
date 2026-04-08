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
 * The getVolumeJob options.
 */
public class GetVolumeJobOptions extends GenericModel {

  protected String volumeId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String volumeId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetVolumeJobOptions instance.
     *
     * @param getVolumeJobOptions the instance to initialize the Builder with
     */
    private Builder(GetVolumeJobOptions getVolumeJobOptions) {
      this.volumeId = getVolumeJobOptions.volumeId;
      this.id = getVolumeJobOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param volumeId the volumeId
     * @param id the id
     */
    public Builder(String volumeId, String id) {
      this.volumeId = volumeId;
      this.id = id;
    }

    /**
     * Builds a GetVolumeJobOptions.
     *
     * @return the new GetVolumeJobOptions instance
     */
    public GetVolumeJobOptions build() {
      return new GetVolumeJobOptions(this);
    }

    /**
     * Set the volumeId.
     *
     * @param volumeId the volumeId
     * @return the GetVolumeJobOptions builder
     */
    public Builder volumeId(String volumeId) {
      this.volumeId = volumeId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetVolumeJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetVolumeJobOptions() { }

  protected GetVolumeJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.volumeId,
      "volumeId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    volumeId = builder.volumeId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetVolumeJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the volumeId.
   *
   * The volume identifier.
   *
   * @return the volumeId
   */
  public String volumeId() {
    return volumeId;
  }

  /**
   * Gets the id.
   *
   * The volume job identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

