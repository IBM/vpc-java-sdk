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
 * The updateInstanceVolumeAttachment options.
 */
public class UpdateInstanceVolumeAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Map<String, Object> volumeAttachmentPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Map<String, Object> volumeAttachmentPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceVolumeAttachmentOptions instance.
     *
     * @param updateInstanceVolumeAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceVolumeAttachmentOptions updateInstanceVolumeAttachmentOptions) {
      this.instanceId = updateInstanceVolumeAttachmentOptions.instanceId;
      this.id = updateInstanceVolumeAttachmentOptions.id;
      this.volumeAttachmentPatch = updateInstanceVolumeAttachmentOptions.volumeAttachmentPatch;
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
     * @param volumeAttachmentPatch the volumeAttachmentPatch
     */
    public Builder(String instanceId, String id, Map<String, Object> volumeAttachmentPatch) {
      this.instanceId = instanceId;
      this.id = id;
      this.volumeAttachmentPatch = volumeAttachmentPatch;
    }

    /**
     * Builds a UpdateInstanceVolumeAttachmentOptions.
     *
     * @return the new UpdateInstanceVolumeAttachmentOptions instance
     */
    public UpdateInstanceVolumeAttachmentOptions build() {
      return new UpdateInstanceVolumeAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceVolumeAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceVolumeAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the volumeAttachmentPatch.
     *
     * @param volumeAttachmentPatch the volumeAttachmentPatch
     * @return the UpdateInstanceVolumeAttachmentOptions builder
     */
    public Builder volumeAttachmentPatch(Map<String, Object> volumeAttachmentPatch) {
      this.volumeAttachmentPatch = volumeAttachmentPatch;
      return this;
    }
  }

  protected UpdateInstanceVolumeAttachmentOptions() { }

  protected UpdateInstanceVolumeAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volumeAttachmentPatch,
      "volumeAttachmentPatch cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    volumeAttachmentPatch = builder.volumeAttachmentPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceVolumeAttachmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the id.
   *
   * The volume attachment identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the volumeAttachmentPatch.
   *
   * The volume attachment patch.
   *
   * @return the volumeAttachmentPatch
   */
  public Map<String, Object> volumeAttachmentPatch() {
    return volumeAttachmentPatch;
  }
}

