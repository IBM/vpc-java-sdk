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
 * The updateInstanceGroupManagerAction options.
 */
public class UpdateInstanceGroupManagerActionOptions extends GenericModel {

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected String id;
  protected Map<String, Object> instanceGroupManagerActionPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private String id;
    private Map<String, Object> instanceGroupManagerActionPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceGroupManagerActionOptions instance.
     *
     * @param updateInstanceGroupManagerActionOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceGroupManagerActionOptions updateInstanceGroupManagerActionOptions) {
      this.instanceGroupId = updateInstanceGroupManagerActionOptions.instanceGroupId;
      this.instanceGroupManagerId = updateInstanceGroupManagerActionOptions.instanceGroupManagerId;
      this.id = updateInstanceGroupManagerActionOptions.id;
      this.instanceGroupManagerActionPatch = updateInstanceGroupManagerActionOptions.instanceGroupManagerActionPatch;
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
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @param id the id
     * @param instanceGroupManagerActionPatch the instanceGroupManagerActionPatch
     */
    public Builder(String instanceGroupId, String instanceGroupManagerId, String id, Map<String, Object> instanceGroupManagerActionPatch) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerId = instanceGroupManagerId;
      this.id = id;
      this.instanceGroupManagerActionPatch = instanceGroupManagerActionPatch;
    }

    /**
     * Builds a UpdateInstanceGroupManagerActionOptions.
     *
     * @return the new UpdateInstanceGroupManagerActionOptions instance
     */
    public UpdateInstanceGroupManagerActionOptions build() {
      return new UpdateInstanceGroupManagerActionOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the UpdateInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the UpdateInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupManagerActionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceGroupManagerActionPatch.
     *
     * @param instanceGroupManagerActionPatch the instanceGroupManagerActionPatch
     * @return the UpdateInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupManagerActionPatch(Map<String, Object> instanceGroupManagerActionPatch) {
      this.instanceGroupManagerActionPatch = instanceGroupManagerActionPatch;
      return this;
    }
  }

  protected UpdateInstanceGroupManagerActionOptions() { }

  protected UpdateInstanceGroupManagerActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupManagerActionPatch,
      "instanceGroupManagerActionPatch cannot be null");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    id = builder.id;
    instanceGroupManagerActionPatch = builder.instanceGroupManagerActionPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceGroupManagerActionOptions builder
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
   * Gets the instanceGroupManagerId.
   *
   * The instance group manager identifier.
   *
   * @return the instanceGroupManagerId
   */
  public String instanceGroupManagerId() {
    return instanceGroupManagerId;
  }

  /**
   * Gets the id.
   *
   * The instance group manager action identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceGroupManagerActionPatch.
   *
   * The instance group manager action patch.
   *
   * @return the instanceGroupManagerActionPatch
   */
  public Map<String, Object> instanceGroupManagerActionPatch() {
    return instanceGroupManagerActionPatch;
  }
}

