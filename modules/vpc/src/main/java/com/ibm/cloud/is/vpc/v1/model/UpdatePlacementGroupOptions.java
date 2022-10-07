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
 * The updatePlacementGroup options.
 */
public class UpdatePlacementGroupOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> placementGroupPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> placementGroupPatch;

    /**
     * Instantiates a new Builder from an existing UpdatePlacementGroupOptions instance.
     *
     * @param updatePlacementGroupOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePlacementGroupOptions updatePlacementGroupOptions) {
      this.id = updatePlacementGroupOptions.id;
      this.placementGroupPatch = updatePlacementGroupOptions.placementGroupPatch;
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
     * @param placementGroupPatch the placementGroupPatch
     */
    public Builder(String id, Map<String, Object> placementGroupPatch) {
      this.id = id;
      this.placementGroupPatch = placementGroupPatch;
    }

    /**
     * Builds a UpdatePlacementGroupOptions.
     *
     * @return the new UpdatePlacementGroupOptions instance
     */
    public UpdatePlacementGroupOptions build() {
      return new UpdatePlacementGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdatePlacementGroupOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the placementGroupPatch.
     *
     * @param placementGroupPatch the placementGroupPatch
     * @return the UpdatePlacementGroupOptions builder
     */
    public Builder placementGroupPatch(Map<String, Object> placementGroupPatch) {
      this.placementGroupPatch = placementGroupPatch;
      return this;
    }
  }

  protected UpdatePlacementGroupOptions() { }

  protected UpdatePlacementGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.placementGroupPatch,
      "placementGroupPatch cannot be null");
    id = builder.id;
    placementGroupPatch = builder.placementGroupPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdatePlacementGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The placement group identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the placementGroupPatch.
   *
   * The placement group patch.
   *
   * @return the placementGroupPatch
   */
  public Map<String, Object> placementGroupPatch() {
    return placementGroupPatch;
  }
}

