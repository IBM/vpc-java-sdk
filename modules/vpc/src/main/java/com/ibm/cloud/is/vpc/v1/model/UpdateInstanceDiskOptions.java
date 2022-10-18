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
 * The updateInstanceDisk options.
 */
public class UpdateInstanceDiskOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Map<String, Object> instanceDiskPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Map<String, Object> instanceDiskPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceDiskOptions instance.
     *
     * @param updateInstanceDiskOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceDiskOptions updateInstanceDiskOptions) {
      this.instanceId = updateInstanceDiskOptions.instanceId;
      this.id = updateInstanceDiskOptions.id;
      this.instanceDiskPatch = updateInstanceDiskOptions.instanceDiskPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param id the id
     * @param instanceDiskPatch the instanceDiskPatch
     */
    public Builder(String instanceId, String id, Map<String, Object> instanceDiskPatch) {
      this.instanceId = instanceId;
      this.id = id;
      this.instanceDiskPatch = instanceDiskPatch;
    }

    /**
     * Builds a UpdateInstanceDiskOptions.
     *
     * @return the new UpdateInstanceDiskOptions instance
     */
    public UpdateInstanceDiskOptions build() {
      return new UpdateInstanceDiskOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceDiskOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceDiskOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceDiskPatch.
     *
     * @param instanceDiskPatch the instanceDiskPatch
     * @return the UpdateInstanceDiskOptions builder
     */
    public Builder instanceDiskPatch(Map<String, Object> instanceDiskPatch) {
      this.instanceDiskPatch = instanceDiskPatch;
      return this;
    }
  }

  protected UpdateInstanceDiskOptions() { }

  protected UpdateInstanceDiskOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceDiskPatch,
      "instanceDiskPatch cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    instanceDiskPatch = builder.instanceDiskPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceDiskOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * The instance disk identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceDiskPatch.
   *
   * The instance disk patch.
   *
   * @return the instanceDiskPatch
   */
  public Map<String, Object> instanceDiskPatch() {
    return instanceDiskPatch;
  }
}

