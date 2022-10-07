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
 * The updateInstanceTemplate options.
 */
public class UpdateInstanceTemplateOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> instanceTemplatePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> instanceTemplatePatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceTemplateOptions instance.
     *
     * @param updateInstanceTemplateOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceTemplateOptions updateInstanceTemplateOptions) {
      this.id = updateInstanceTemplateOptions.id;
      this.instanceTemplatePatch = updateInstanceTemplateOptions.instanceTemplatePatch;
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
     * @param instanceTemplatePatch the instanceTemplatePatch
     */
    public Builder(String id, Map<String, Object> instanceTemplatePatch) {
      this.id = id;
      this.instanceTemplatePatch = instanceTemplatePatch;
    }

    /**
     * Builds a UpdateInstanceTemplateOptions.
     *
     * @return the new UpdateInstanceTemplateOptions instance
     */
    public UpdateInstanceTemplateOptions build() {
      return new UpdateInstanceTemplateOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceTemplateOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceTemplatePatch.
     *
     * @param instanceTemplatePatch the instanceTemplatePatch
     * @return the UpdateInstanceTemplateOptions builder
     */
    public Builder instanceTemplatePatch(Map<String, Object> instanceTemplatePatch) {
      this.instanceTemplatePatch = instanceTemplatePatch;
      return this;
    }
  }

  protected UpdateInstanceTemplateOptions() { }

  protected UpdateInstanceTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceTemplatePatch,
      "instanceTemplatePatch cannot be null");
    id = builder.id;
    instanceTemplatePatch = builder.instanceTemplatePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The instance template identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceTemplatePatch.
   *
   * The instance template patch.
   *
   * @return the instanceTemplatePatch
   */
  public Map<String, Object> instanceTemplatePatch() {
    return instanceTemplatePatch;
  }
}

