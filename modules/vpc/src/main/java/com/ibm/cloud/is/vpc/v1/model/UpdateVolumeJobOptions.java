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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateVolumeJob options.
 */
public class UpdateVolumeJobOptions extends GenericModel {

  protected String volumeId;
  protected String id;
  protected Map<String, Object> volumeJobPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String volumeId;
    private String id;
    private Map<String, Object> volumeJobPatch;

    /**
     * Instantiates a new Builder from an existing UpdateVolumeJobOptions instance.
     *
     * @param updateVolumeJobOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVolumeJobOptions updateVolumeJobOptions) {
      this.volumeId = updateVolumeJobOptions.volumeId;
      this.id = updateVolumeJobOptions.id;
      this.volumeJobPatch = updateVolumeJobOptions.volumeJobPatch;
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
     * @param volumeJobPatch the volumeJobPatch
     */
    public Builder(String volumeId, String id, Map<String, Object> volumeJobPatch) {
      this.volumeId = volumeId;
      this.id = id;
      this.volumeJobPatch = volumeJobPatch;
    }

    /**
     * Builds a UpdateVolumeJobOptions.
     *
     * @return the new UpdateVolumeJobOptions instance
     */
    public UpdateVolumeJobOptions build() {
      return new UpdateVolumeJobOptions(this);
    }

    /**
     * Set the volumeId.
     *
     * @param volumeId the volumeId
     * @return the UpdateVolumeJobOptions builder
     */
    public Builder volumeId(String volumeId) {
      this.volumeId = volumeId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVolumeJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the volumeJobPatch.
     *
     * @param volumeJobPatch the volumeJobPatch
     * @return the UpdateVolumeJobOptions builder
     */
    public Builder volumeJobPatch(Map<String, Object> volumeJobPatch) {
      this.volumeJobPatch = volumeJobPatch;
      return this;
    }
  }

  protected UpdateVolumeJobOptions() { }

  protected UpdateVolumeJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.volumeId,
      "volumeId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volumeJobPatch,
      "volumeJobPatch cannot be null");
    volumeId = builder.volumeId;
    id = builder.id;
    volumeJobPatch = builder.volumeJobPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVolumeJobOptions builder
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

  /**
   * Gets the volumeJobPatch.
   *
   * The volume job patch.
   *
   * @return the volumeJobPatch
   */
  public Map<String, Object> volumeJobPatch() {
    return volumeJobPatch;
  }
}

