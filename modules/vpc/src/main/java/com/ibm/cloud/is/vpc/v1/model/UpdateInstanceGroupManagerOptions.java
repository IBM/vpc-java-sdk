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
 * The updateInstanceGroupManager options.
 */
public class UpdateInstanceGroupManagerOptions extends GenericModel {

  protected String instanceGroupId;
  protected String id;
  protected Map<String, Object> instanceGroupManagerPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String id;
    private Map<String, Object> instanceGroupManagerPatch;

    private Builder(UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptions) {
      this.instanceGroupId = updateInstanceGroupManagerOptions.instanceGroupId;
      this.id = updateInstanceGroupManagerOptions.id;
      this.instanceGroupManagerPatch = updateInstanceGroupManagerOptions.instanceGroupManagerPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceGroupId the instanceGroupId
     * @param id the id
     * @param instanceGroupManagerPatch the instanceGroupManagerPatch
     */
    public Builder(String instanceGroupId, String id, Map<String, Object> instanceGroupManagerPatch) {
      this.instanceGroupId = instanceGroupId;
      this.id = id;
      this.instanceGroupManagerPatch = instanceGroupManagerPatch;
    }

    /**
     * Builds a UpdateInstanceGroupManagerOptions.
     *
     * @return the new UpdateInstanceGroupManagerOptions instance
     */
    public UpdateInstanceGroupManagerOptions build() {
      return new UpdateInstanceGroupManagerOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceGroupManagerPatch.
     *
     * @param instanceGroupManagerPatch the instanceGroupManagerPatch
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder instanceGroupManagerPatch(Map<String, Object> instanceGroupManagerPatch) {
      this.instanceGroupManagerPatch = instanceGroupManagerPatch;
      return this;
    }
  }

  protected UpdateInstanceGroupManagerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupManagerPatch,
      "instanceGroupManagerPatch cannot be null");
    instanceGroupId = builder.instanceGroupId;
    id = builder.id;
    instanceGroupManagerPatch = builder.instanceGroupManagerPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceGroupManagerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceGroupId.
   *
   * The instance group identifier.
   *
   * @return the instanceGroupId
   */
  public String instanceGroupId() {
    return instanceGroupId;
  }

  /**
   * Gets the id.
   *
   * The instance group manager identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceGroupManagerPatch.
   *
   * The instance group manager patch.
   *
   * @return the instanceGroupManagerPatch
   */
  public Map<String, Object> instanceGroupManagerPatch() {
    return instanceGroupManagerPatch;
  }
}

