/*
 * (C) Copyright IBM Corp. 2025.
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
 * The updateInstanceNetworkAttachment options.
 */
public class UpdateInstanceNetworkAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Map<String, Object> instanceNetworkAttachmentPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Map<String, Object> instanceNetworkAttachmentPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceNetworkAttachmentOptions instance.
     *
     * @param updateInstanceNetworkAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceNetworkAttachmentOptions updateInstanceNetworkAttachmentOptions) {
      this.instanceId = updateInstanceNetworkAttachmentOptions.instanceId;
      this.id = updateInstanceNetworkAttachmentOptions.id;
      this.instanceNetworkAttachmentPatch = updateInstanceNetworkAttachmentOptions.instanceNetworkAttachmentPatch;
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
     * @param instanceNetworkAttachmentPatch the instanceNetworkAttachmentPatch
     */
    public Builder(String instanceId, String id, Map<String, Object> instanceNetworkAttachmentPatch) {
      this.instanceId = instanceId;
      this.id = id;
      this.instanceNetworkAttachmentPatch = instanceNetworkAttachmentPatch;
    }

    /**
     * Builds a UpdateInstanceNetworkAttachmentOptions.
     *
     * @return the new UpdateInstanceNetworkAttachmentOptions instance
     */
    public UpdateInstanceNetworkAttachmentOptions build() {
      return new UpdateInstanceNetworkAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceNetworkAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceNetworkAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceNetworkAttachmentPatch.
     *
     * @param instanceNetworkAttachmentPatch the instanceNetworkAttachmentPatch
     * @return the UpdateInstanceNetworkAttachmentOptions builder
     */
    public Builder instanceNetworkAttachmentPatch(Map<String, Object> instanceNetworkAttachmentPatch) {
      this.instanceNetworkAttachmentPatch = instanceNetworkAttachmentPatch;
      return this;
    }
  }

  protected UpdateInstanceNetworkAttachmentOptions() { }

  protected UpdateInstanceNetworkAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceNetworkAttachmentPatch,
      "instanceNetworkAttachmentPatch cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    instanceNetworkAttachmentPatch = builder.instanceNetworkAttachmentPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceNetworkAttachmentOptions builder
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
   * The instance network attachment identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceNetworkAttachmentPatch.
   *
   * The instance network attachment patch.
   *
   * @return the instanceNetworkAttachmentPatch
   */
  public Map<String, Object> instanceNetworkAttachmentPatch() {
    return instanceNetworkAttachmentPatch;
  }
}

