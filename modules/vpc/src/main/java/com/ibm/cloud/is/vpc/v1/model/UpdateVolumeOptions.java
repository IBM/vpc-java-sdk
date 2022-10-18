/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> volumePatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateVolumeOptions instance.
     *
     * @param updateVolumeOptions the instance to initialize the Builder with
     */
    private Builder(UpdateVolumeOptions updateVolumeOptions) {
      this.id = updateVolumeOptions.id;
      this.volumePatch = updateVolumeOptions.volumePatch;
      this.ifMatch = updateVolumeOptions.ifMatch;
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

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateVolumeOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateVolumeOptions() { }

  protected UpdateVolumeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volumePatch,
      "volumePatch cannot be null");
    id = builder.id;
    volumePatch = builder.volumePatch;
    ifMatch = builder.ifMatch;
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

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

