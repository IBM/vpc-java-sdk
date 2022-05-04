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
 * The updateBareMetalServer options.
 */
public class UpdateBareMetalServerOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> bareMetalServerPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> bareMetalServerPatch;

    private Builder(UpdateBareMetalServerOptions updateBareMetalServerOptions) {
      this.id = updateBareMetalServerOptions.id;
      this.bareMetalServerPatch = updateBareMetalServerOptions.bareMetalServerPatch;
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
     * @param bareMetalServerPatch the bareMetalServerPatch
     */
    public Builder(String id, Map<String, Object> bareMetalServerPatch) {
      this.id = id;
      this.bareMetalServerPatch = bareMetalServerPatch;
    }

    /**
     * Builds a UpdateBareMetalServerOptions.
     *
     * @return the new UpdateBareMetalServerOptions instance
     */
    public UpdateBareMetalServerOptions build() {
      return new UpdateBareMetalServerOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateBareMetalServerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the bareMetalServerPatch.
     *
     * @param bareMetalServerPatch the bareMetalServerPatch
     * @return the UpdateBareMetalServerOptions builder
     */
    public Builder bareMetalServerPatch(Map<String, Object> bareMetalServerPatch) {
      this.bareMetalServerPatch = bareMetalServerPatch;
      return this;
    }
  }

  protected UpdateBareMetalServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bareMetalServerPatch,
      "bareMetalServerPatch cannot be null");
    id = builder.id;
    bareMetalServerPatch = builder.bareMetalServerPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateBareMetalServerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The bare metal server identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the bareMetalServerPatch.
   *
   * The bare metal server patch.
   *
   * @return the bareMetalServerPatch
   */
  public Map<String, Object> bareMetalServerPatch() {
    return bareMetalServerPatch;
  }
}

