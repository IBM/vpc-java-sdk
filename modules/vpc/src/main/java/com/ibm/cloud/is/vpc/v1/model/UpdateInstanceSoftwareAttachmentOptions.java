/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * The updateInstanceSoftwareAttachment options.
 */
public class UpdateInstanceSoftwareAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Map<String, Object> instanceSoftwareAttachmentPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Map<String, Object> instanceSoftwareAttachmentPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceSoftwareAttachmentOptions instance.
     *
     * @param updateInstanceSoftwareAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceSoftwareAttachmentOptions updateInstanceSoftwareAttachmentOptions) {
      this.instanceId = updateInstanceSoftwareAttachmentOptions.instanceId;
      this.id = updateInstanceSoftwareAttachmentOptions.id;
      this.instanceSoftwareAttachmentPatch = updateInstanceSoftwareAttachmentOptions.instanceSoftwareAttachmentPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param id the id
     * @param instanceSoftwareAttachmentPatch the instanceSoftwareAttachmentPatch
     */
    public Builder(String instanceId, String id, Map<String, Object> instanceSoftwareAttachmentPatch) {
      this.instanceId = instanceId;
      this.id = id;
      this.instanceSoftwareAttachmentPatch = instanceSoftwareAttachmentPatch;
    }

    /**
     * Builds a UpdateInstanceSoftwareAttachmentOptions.
     *
     * @return the new UpdateInstanceSoftwareAttachmentOptions instance
     */
    public UpdateInstanceSoftwareAttachmentOptions build() {
      return new UpdateInstanceSoftwareAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceSoftwareAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceSoftwareAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceSoftwareAttachmentPatch.
     *
     * @param instanceSoftwareAttachmentPatch the instanceSoftwareAttachmentPatch
     * @return the UpdateInstanceSoftwareAttachmentOptions builder
     */
    public Builder instanceSoftwareAttachmentPatch(Map<String, Object> instanceSoftwareAttachmentPatch) {
      this.instanceSoftwareAttachmentPatch = instanceSoftwareAttachmentPatch;
      return this;
    }
  }

  protected UpdateInstanceSoftwareAttachmentOptions() { }

  protected UpdateInstanceSoftwareAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceSoftwareAttachmentPatch,
      "instanceSoftwareAttachmentPatch cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    instanceSoftwareAttachmentPatch = builder.instanceSoftwareAttachmentPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceSoftwareAttachmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The virtual server instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * The instance software attachment identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceSoftwareAttachmentPatch.
   *
   * The instance software attachment patch.
   *
   * @return the instanceSoftwareAttachmentPatch
   */
  public Map<String, Object> instanceSoftwareAttachmentPatch() {
    return instanceSoftwareAttachmentPatch;
  }
}

