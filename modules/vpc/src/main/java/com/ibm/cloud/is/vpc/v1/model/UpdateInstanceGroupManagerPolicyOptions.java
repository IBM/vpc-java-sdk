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
 * The updateInstanceGroupManagerPolicy options.
 */
public class UpdateInstanceGroupManagerPolicyOptions extends GenericModel {

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected String id;
  protected Map<String, Object> instanceGroupManagerPolicyPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private String id;
    private Map<String, Object> instanceGroupManagerPolicyPatch;

    private Builder(UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptions) {
      this.instanceGroupId = updateInstanceGroupManagerPolicyOptions.instanceGroupId;
      this.instanceGroupManagerId = updateInstanceGroupManagerPolicyOptions.instanceGroupManagerId;
      this.id = updateInstanceGroupManagerPolicyOptions.id;
      this.instanceGroupManagerPolicyPatch = updateInstanceGroupManagerPolicyOptions.instanceGroupManagerPolicyPatch;
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
     * @param instanceGroupManagerPolicyPatch the instanceGroupManagerPolicyPatch
     */
    public Builder(String instanceGroupId, String instanceGroupManagerId, String id, Map<String, Object> instanceGroupManagerPolicyPatch) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerId = instanceGroupManagerId;
      this.id = id;
      this.instanceGroupManagerPolicyPatch = instanceGroupManagerPolicyPatch;
    }

    /**
     * Builds a UpdateInstanceGroupManagerPolicyOptions.
     *
     * @return the new UpdateInstanceGroupManagerPolicyOptions instance
     */
    public UpdateInstanceGroupManagerPolicyOptions build() {
      return new UpdateInstanceGroupManagerPolicyOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceGroupManagerPolicyPatch.
     *
     * @param instanceGroupManagerPolicyPatch the instanceGroupManagerPolicyPatch
     * @return the UpdateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupManagerPolicyPatch(Map<String, Object> instanceGroupManagerPolicyPatch) {
      this.instanceGroupManagerPolicyPatch = instanceGroupManagerPolicyPatch;
      return this;
    }
  }

  protected UpdateInstanceGroupManagerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupManagerPolicyPatch,
      "instanceGroupManagerPolicyPatch cannot be null");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    id = builder.id;
    instanceGroupManagerPolicyPatch = builder.instanceGroupManagerPolicyPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceGroupManagerPolicyOptions builder
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
   * The instance group manager policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceGroupManagerPolicyPatch.
   *
   * The instance group manager policy patch.
   *
   * @return the instanceGroupManagerPolicyPatch
   */
  public Map<String, Object> instanceGroupManagerPolicyPatch() {
    return instanceGroupManagerPolicyPatch;
  }
}

