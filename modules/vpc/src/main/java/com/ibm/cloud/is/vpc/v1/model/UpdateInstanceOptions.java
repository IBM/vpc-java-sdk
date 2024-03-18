/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * The updateInstance options.
 */
public class UpdateInstanceOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> instancePatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> instancePatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceOptions instance.
     *
     * @param updateInstanceOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceOptions updateInstanceOptions) {
      this.id = updateInstanceOptions.id;
      this.instancePatch = updateInstanceOptions.instancePatch;
      this.ifMatch = updateInstanceOptions.ifMatch;
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
     * @param instancePatch the instancePatch
     */
    public Builder(String id, Map<String, Object> instancePatch) {
      this.id = id;
      this.instancePatch = instancePatch;
    }

    /**
     * Builds a UpdateInstanceOptions.
     *
     * @return the new UpdateInstanceOptions instance
     */
    public UpdateInstanceOptions build() {
      return new UpdateInstanceOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instancePatch.
     *
     * @param instancePatch the instancePatch
     * @return the UpdateInstanceOptions builder
     */
    public Builder instancePatch(Map<String, Object> instancePatch) {
      this.instancePatch = instancePatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateInstanceOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateInstanceOptions() { }

  protected UpdateInstanceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instancePatch,
      "instancePatch cannot be null");
    id = builder.id;
    instancePatch = builder.instancePatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The virtual server instance identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instancePatch.
   *
   * The instance patch.
   *
   * @return the instancePatch
   */
  public Map<String, Object> instancePatch() {
    return instancePatch;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

