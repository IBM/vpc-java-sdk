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
 * The updateInstanceGroup options.
 */
public class UpdateInstanceGroupOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> instanceGroupPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> instanceGroupPatch;

    private Builder(UpdateInstanceGroupOptions updateInstanceGroupOptions) {
      this.id = updateInstanceGroupOptions.id;
      this.instanceGroupPatch = updateInstanceGroupOptions.instanceGroupPatch;
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
     * @param instanceGroupPatch the instanceGroupPatch
     */
    public Builder(String id, Map<String, Object> instanceGroupPatch) {
      this.id = id;
      this.instanceGroupPatch = instanceGroupPatch;
    }

    /**
     * Builds a UpdateInstanceGroupOptions.
     *
     * @return the new UpdateInstanceGroupOptions instance
     */
    public UpdateInstanceGroupOptions build() {
      return new UpdateInstanceGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceGroupPatch.
     *
     * @param instanceGroupPatch the instanceGroupPatch
     * @return the UpdateInstanceGroupOptions builder
     */
    public Builder instanceGroupPatch(Map<String, Object> instanceGroupPatch) {
      this.instanceGroupPatch = instanceGroupPatch;
      return this;
    }
  }

  protected UpdateInstanceGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupPatch,
      "instanceGroupPatch cannot be null");
    id = builder.id;
    instanceGroupPatch = builder.instanceGroupPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The instance group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceGroupPatch.
   *
   * The instance group patch.
   *
   * @return the instanceGroupPatch
   */
  public Map<String, Object> instanceGroupPatch() {
    return instanceGroupPatch;
  }
}

