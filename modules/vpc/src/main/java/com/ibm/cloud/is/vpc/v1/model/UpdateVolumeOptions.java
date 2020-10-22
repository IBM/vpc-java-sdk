/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateVolume options.
 */
public class UpdateVolumeOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> volumePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> volumePatch;

    private Builder(UpdateVolumeOptions updateVolumeOptions) {
      this.id = updateVolumeOptions.id;
      this.volumePatch = updateVolumeOptions.volumePatch;
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
     * @param volumePatch the volumePatch
     */
    public Builder(String id, Map<String, Object> volumePatch) {
      this.id = id;
      this.volumePatch = volumePatch;
    }

    /**
     * Builds a UpdateVolumeOptions.
     *
     * @return the new UpdateVolumeOptions instance
     */
    public UpdateVolumeOptions build() {
      return new UpdateVolumeOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVolumeOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the volumePatch.
     *
     * @param volumePatch the volumePatch
     * @return the UpdateVolumeOptions builder
     */
    public Builder volumePatch(Map<String, Object> volumePatch) {
      this.volumePatch = volumePatch;
      return this;
    }
  }

  protected UpdateVolumeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volumePatch,
      "volumePatch cannot be null");
    id = builder.id;
    volumePatch = builder.volumePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateVolumeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The volume identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the volumePatch.
   *
   * The volume patch.
   *
   * @return the volumePatch
   */
  public Map<String, Object> volumePatch() {
    return volumePatch;
  }
}

