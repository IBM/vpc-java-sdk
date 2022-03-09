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
 * The updateDedicatedHostGroup options.
 */
public class UpdateDedicatedHostGroupOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> dedicatedHostGroupPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> dedicatedHostGroupPatch;

    private Builder(UpdateDedicatedHostGroupOptions updateDedicatedHostGroupOptions) {
      this.id = updateDedicatedHostGroupOptions.id;
      this.dedicatedHostGroupPatch = updateDedicatedHostGroupOptions.dedicatedHostGroupPatch;
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
     * @param dedicatedHostGroupPatch the dedicatedHostGroupPatch
     */
    public Builder(String id, Map<String, Object> dedicatedHostGroupPatch) {
      this.id = id;
      this.dedicatedHostGroupPatch = dedicatedHostGroupPatch;
    }

    /**
     * Builds a UpdateDedicatedHostGroupOptions.
     *
     * @return the new UpdateDedicatedHostGroupOptions instance
     */
    public UpdateDedicatedHostGroupOptions build() {
      return new UpdateDedicatedHostGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateDedicatedHostGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the dedicatedHostGroupPatch.
     *
     * @param dedicatedHostGroupPatch the dedicatedHostGroupPatch
     * @return the UpdateDedicatedHostGroupOptions builder
     */
    public Builder dedicatedHostGroupPatch(Map<String, Object> dedicatedHostGroupPatch) {
      this.dedicatedHostGroupPatch = dedicatedHostGroupPatch;
      return this;
    }
  }

  protected UpdateDedicatedHostGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dedicatedHostGroupPatch,
      "dedicatedHostGroupPatch cannot be null");
    id = builder.id;
    dedicatedHostGroupPatch = builder.dedicatedHostGroupPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateDedicatedHostGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The dedicated host group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the dedicatedHostGroupPatch.
   *
   * The dedicated host group patch.
   *
   * @return the dedicatedHostGroupPatch
   */
  public Map<String, Object> dedicatedHostGroupPatch() {
    return dedicatedHostGroupPatch;
  }
}

