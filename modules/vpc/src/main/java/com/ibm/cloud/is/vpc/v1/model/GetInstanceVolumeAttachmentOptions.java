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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getInstanceVolumeAttachment options.
 */
public class GetInstanceVolumeAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetInstanceVolumeAttachmentOptions instance.
     *
     * @param getInstanceVolumeAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(GetInstanceVolumeAttachmentOptions getInstanceVolumeAttachmentOptions) {
      this.instanceId = getInstanceVolumeAttachmentOptions.instanceId;
      this.id = getInstanceVolumeAttachmentOptions.id;
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
     * Builds a GetInstanceVolumeAttachmentOptions.
     *
     * @return the new GetInstanceVolumeAttachmentOptions instance
     */
    public GetInstanceVolumeAttachmentOptions build() {
      return new GetInstanceVolumeAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the GetInstanceVolumeAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetInstanceVolumeAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetInstanceVolumeAttachmentOptions() { }

  protected GetInstanceVolumeAttachmentOptions(Builder builder) {
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
   * @return a GetInstanceVolumeAttachmentOptions builder
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
   * The volume attachment identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

