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
 * The updateBareMetalServerDisk options.
 */
public class UpdateBareMetalServerDiskOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String id;
  protected Map<String, Object> bareMetalServerDiskPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String id;
    private Map<String, Object> bareMetalServerDiskPatch;

    private Builder(UpdateBareMetalServerDiskOptions updateBareMetalServerDiskOptions) {
      this.bareMetalServerId = updateBareMetalServerDiskOptions.bareMetalServerId;
      this.id = updateBareMetalServerDiskOptions.id;
      this.bareMetalServerDiskPatch = updateBareMetalServerDiskOptions.bareMetalServerDiskPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @param id the id
     * @param bareMetalServerDiskPatch the bareMetalServerDiskPatch
     */
    public Builder(String bareMetalServerId, String id, Map<String, Object> bareMetalServerDiskPatch) {
      this.bareMetalServerId = bareMetalServerId;
      this.id = id;
      this.bareMetalServerDiskPatch = bareMetalServerDiskPatch;
    }

    /**
     * Builds a UpdateBareMetalServerDiskOptions.
     *
     * @return the new UpdateBareMetalServerDiskOptions instance
     */
    public UpdateBareMetalServerDiskOptions build() {
      return new UpdateBareMetalServerDiskOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the UpdateBareMetalServerDiskOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateBareMetalServerDiskOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the bareMetalServerDiskPatch.
     *
     * @param bareMetalServerDiskPatch the bareMetalServerDiskPatch
     * @return the UpdateBareMetalServerDiskOptions builder
     */
    public Builder bareMetalServerDiskPatch(Map<String, Object> bareMetalServerDiskPatch) {
      this.bareMetalServerDiskPatch = bareMetalServerDiskPatch;
      return this;
    }
  }

  protected UpdateBareMetalServerDiskOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bareMetalServerDiskPatch,
      "bareMetalServerDiskPatch cannot be null");
    bareMetalServerId = builder.bareMetalServerId;
    id = builder.id;
    bareMetalServerDiskPatch = builder.bareMetalServerDiskPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateBareMetalServerDiskOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bareMetalServerId.
   *
   * The bare metal server identifier.
   *
   * @return the bareMetalServerId
   */
  public String bareMetalServerId() {
    return bareMetalServerId;
  }

  /**
   * Gets the id.
   *
   * The bare metal server disk identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the bareMetalServerDiskPatch.
   *
   * The bare metal server disk patch.
   *
   * @return the bareMetalServerDiskPatch
   */
  public Map<String, Object> bareMetalServerDiskPatch() {
    return bareMetalServerDiskPatch;
  }
}

