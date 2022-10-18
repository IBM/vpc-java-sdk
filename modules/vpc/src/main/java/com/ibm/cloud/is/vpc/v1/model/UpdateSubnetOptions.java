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
 * The updateSubnet options.
 */
public class UpdateSubnetOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> subnetPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> subnetPatch;

    /**
     * Instantiates a new Builder from an existing UpdateSubnetOptions instance.
     *
     * @param updateSubnetOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSubnetOptions updateSubnetOptions) {
      this.id = updateSubnetOptions.id;
      this.subnetPatch = updateSubnetOptions.subnetPatch;
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
     * @param subnetPatch the subnetPatch
     */
    public Builder(String id, Map<String, Object> subnetPatch) {
      this.id = id;
      this.subnetPatch = subnetPatch;
    }

    /**
     * Builds a UpdateSubnetOptions.
     *
     * @return the new UpdateSubnetOptions instance
     */
    public UpdateSubnetOptions build() {
      return new UpdateSubnetOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSubnetOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the subnetPatch.
     *
     * @param subnetPatch the subnetPatch
     * @return the UpdateSubnetOptions builder
     */
    public Builder subnetPatch(Map<String, Object> subnetPatch) {
      this.subnetPatch = subnetPatch;
      return this;
    }
  }

  protected UpdateSubnetOptions() { }

  protected UpdateSubnetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnetPatch,
      "subnetPatch cannot be null");
    id = builder.id;
    subnetPatch = builder.subnetPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateSubnetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The subnet identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the subnetPatch.
   *
   * The subnet patch.
   *
   * @return the subnetPatch
   */
  public Map<String, Object> subnetPatch() {
    return subnetPatch;
  }
}

