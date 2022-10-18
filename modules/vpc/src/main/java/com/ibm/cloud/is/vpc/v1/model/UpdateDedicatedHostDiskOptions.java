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
 * The updateDedicatedHostDisk options.
 */
public class UpdateDedicatedHostDiskOptions extends GenericModel {

  protected String dedicatedHostId;
  protected String id;
  protected Map<String, Object> dedicatedHostDiskPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String dedicatedHostId;
    private String id;
    private Map<String, Object> dedicatedHostDiskPatch;

    /**
     * Instantiates a new Builder from an existing UpdateDedicatedHostDiskOptions instance.
     *
     * @param updateDedicatedHostDiskOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDedicatedHostDiskOptions updateDedicatedHostDiskOptions) {
      this.dedicatedHostId = updateDedicatedHostDiskOptions.dedicatedHostId;
      this.id = updateDedicatedHostDiskOptions.id;
      this.dedicatedHostDiskPatch = updateDedicatedHostDiskOptions.dedicatedHostDiskPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dedicatedHostId the dedicatedHostId
     * @param id the id
     * @param dedicatedHostDiskPatch the dedicatedHostDiskPatch
     */
    public Builder(String dedicatedHostId, String id, Map<String, Object> dedicatedHostDiskPatch) {
      this.dedicatedHostId = dedicatedHostId;
      this.id = id;
      this.dedicatedHostDiskPatch = dedicatedHostDiskPatch;
    }

    /**
     * Builds a UpdateDedicatedHostDiskOptions.
     *
     * @return the new UpdateDedicatedHostDiskOptions instance
     */
    public UpdateDedicatedHostDiskOptions build() {
      return new UpdateDedicatedHostDiskOptions(this);
    }

    /**
     * Set the dedicatedHostId.
     *
     * @param dedicatedHostId the dedicatedHostId
     * @return the UpdateDedicatedHostDiskOptions builder
     */
    public Builder dedicatedHostId(String dedicatedHostId) {
      this.dedicatedHostId = dedicatedHostId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateDedicatedHostDiskOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the dedicatedHostDiskPatch.
     *
     * @param dedicatedHostDiskPatch the dedicatedHostDiskPatch
     * @return the UpdateDedicatedHostDiskOptions builder
     */
    public Builder dedicatedHostDiskPatch(Map<String, Object> dedicatedHostDiskPatch) {
      this.dedicatedHostDiskPatch = dedicatedHostDiskPatch;
      return this;
    }
  }

  protected UpdateDedicatedHostDiskOptions() { }

  protected UpdateDedicatedHostDiskOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.dedicatedHostId,
      "dedicatedHostId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dedicatedHostDiskPatch,
      "dedicatedHostDiskPatch cannot be null");
    dedicatedHostId = builder.dedicatedHostId;
    id = builder.id;
    dedicatedHostDiskPatch = builder.dedicatedHostDiskPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateDedicatedHostDiskOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dedicatedHostId.
   *
   * The dedicated host identifier.
   *
   * @return the dedicatedHostId
   */
  public String dedicatedHostId() {
    return dedicatedHostId;
  }

  /**
   * Gets the id.
   *
   * The dedicated host disk identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the dedicatedHostDiskPatch.
   *
   * The dedicated host disk patch.
   *
   * @return the dedicatedHostDiskPatch
   */
  public Map<String, Object> dedicatedHostDiskPatch() {
    return dedicatedHostDiskPatch;
  }
}

