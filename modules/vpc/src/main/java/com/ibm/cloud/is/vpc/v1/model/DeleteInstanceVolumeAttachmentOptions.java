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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteInstanceVolumeAttachment options.
 */
public class DeleteInstanceVolumeAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteInstanceVolumeAttachmentOptions instance.
     *
     * @param deleteInstanceVolumeAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(DeleteInstanceVolumeAttachmentOptions deleteInstanceVolumeAttachmentOptions) {
      this.instanceId = deleteInstanceVolumeAttachmentOptions.instanceId;
      this.id = deleteInstanceVolumeAttachmentOptions.id;
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
     */
    public Builder(String instanceId, String id) {
      this.instanceId = instanceId;
      this.id = id;
    }

    /**
     * Builds a DeleteInstanceVolumeAttachmentOptions.
     *
     * @return the new DeleteInstanceVolumeAttachmentOptions instance
     */
    public DeleteInstanceVolumeAttachmentOptions build() {
      return new DeleteInstanceVolumeAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the DeleteInstanceVolumeAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteInstanceVolumeAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteInstanceVolumeAttachmentOptions() { }

  protected DeleteInstanceVolumeAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteInstanceVolumeAttachmentOptions builder
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
}

