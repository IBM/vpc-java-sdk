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
 * The updatePublicAddressRange options.
 */
public class UpdatePublicAddressRangeOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> publicAddressRangePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> publicAddressRangePatch;

    /**
     * Instantiates a new Builder from an existing UpdatePublicAddressRangeOptions instance.
     *
     * @param updatePublicAddressRangeOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePublicAddressRangeOptions updatePublicAddressRangeOptions) {
      this.id = updatePublicAddressRangeOptions.id;
      this.publicAddressRangePatch = updatePublicAddressRangeOptions.publicAddressRangePatch;
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
     * @param publicAddressRangePatch the publicAddressRangePatch
     */
    public Builder(String id, Map<String, Object> publicAddressRangePatch) {
      this.id = id;
      this.publicAddressRangePatch = publicAddressRangePatch;
    }

    /**
     * Builds a UpdatePublicAddressRangeOptions.
     *
     * @return the new UpdatePublicAddressRangeOptions instance
     */
    public UpdatePublicAddressRangeOptions build() {
      return new UpdatePublicAddressRangeOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdatePublicAddressRangeOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the publicAddressRangePatch.
     *
     * @param publicAddressRangePatch the publicAddressRangePatch
     * @return the UpdatePublicAddressRangeOptions builder
     */
    public Builder publicAddressRangePatch(Map<String, Object> publicAddressRangePatch) {
      this.publicAddressRangePatch = publicAddressRangePatch;
      return this;
    }
  }

  protected UpdatePublicAddressRangeOptions() { }

  protected UpdatePublicAddressRangeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.publicAddressRangePatch,
      "publicAddressRangePatch cannot be null");
    id = builder.id;
    publicAddressRangePatch = builder.publicAddressRangePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdatePublicAddressRangeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The public address range identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the publicAddressRangePatch.
   *
   * The public address range patch.
   *
   * @return the publicAddressRangePatch
   */
  public Map<String, Object> publicAddressRangePatch() {
    return publicAddressRangePatch;
  }
}

