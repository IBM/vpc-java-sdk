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
 * The updateIkePolicy options.
 */
public class UpdateIkePolicyOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> ikePolicyPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> ikePolicyPatch;

    /**
     * Instantiates a new Builder from an existing UpdateIkePolicyOptions instance.
     *
     * @param updateIkePolicyOptions the instance to initialize the Builder with
     */
    private Builder(UpdateIkePolicyOptions updateIkePolicyOptions) {
      this.id = updateIkePolicyOptions.id;
      this.ikePolicyPatch = updateIkePolicyOptions.ikePolicyPatch;
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
     * @param ikePolicyPatch the ikePolicyPatch
     */
    public Builder(String id, Map<String, Object> ikePolicyPatch) {
      this.id = id;
      this.ikePolicyPatch = ikePolicyPatch;
    }

    /**
     * Builds a UpdateIkePolicyOptions.
     *
     * @return the new UpdateIkePolicyOptions instance
     */
    public UpdateIkePolicyOptions build() {
      return new UpdateIkePolicyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the ikePolicyPatch.
     *
     * @param ikePolicyPatch the ikePolicyPatch
     * @return the UpdateIkePolicyOptions builder
     */
    public Builder ikePolicyPatch(Map<String, Object> ikePolicyPatch) {
      this.ikePolicyPatch = ikePolicyPatch;
      return this;
    }
  }

  protected UpdateIkePolicyOptions() { }

  protected UpdateIkePolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ikePolicyPatch,
      "ikePolicyPatch cannot be null");
    id = builder.id;
    ikePolicyPatch = builder.ikePolicyPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateIkePolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The IKE policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the ikePolicyPatch.
   *
   * The IKE policy patch.
   *
   * @return the ikePolicyPatch
   */
  public Map<String, Object> ikePolicyPatch() {
    return ikePolicyPatch;
  }
}

