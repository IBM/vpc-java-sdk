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
 * The updateInstanceClusterNetworkAttachment options.
 */
public class UpdateInstanceClusterNetworkAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected String id;
  protected Map<String, Object> instanceClusterNetworkAttachmentPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String id;
    private Map<String, Object> instanceClusterNetworkAttachmentPatch;

    /**
     * Instantiates a new Builder from an existing UpdateInstanceClusterNetworkAttachmentOptions instance.
     *
     * @param updateInstanceClusterNetworkAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(UpdateInstanceClusterNetworkAttachmentOptions updateInstanceClusterNetworkAttachmentOptions) {
      this.instanceId = updateInstanceClusterNetworkAttachmentOptions.instanceId;
      this.id = updateInstanceClusterNetworkAttachmentOptions.id;
      this.instanceClusterNetworkAttachmentPatch = updateInstanceClusterNetworkAttachmentOptions.instanceClusterNetworkAttachmentPatch;
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
     * @param instanceClusterNetworkAttachmentPatch the instanceClusterNetworkAttachmentPatch
     */
    public Builder(String instanceId, String id, Map<String, Object> instanceClusterNetworkAttachmentPatch) {
      this.instanceId = instanceId;
      this.id = id;
      this.instanceClusterNetworkAttachmentPatch = instanceClusterNetworkAttachmentPatch;
    }

    /**
     * Builds a UpdateInstanceClusterNetworkAttachmentOptions.
     *
     * @return the new UpdateInstanceClusterNetworkAttachmentOptions instance
     */
    public UpdateInstanceClusterNetworkAttachmentOptions build() {
      return new UpdateInstanceClusterNetworkAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the UpdateInstanceClusterNetworkAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceClusterNetworkAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceClusterNetworkAttachmentPatch.
     *
     * @param instanceClusterNetworkAttachmentPatch the instanceClusterNetworkAttachmentPatch
     * @return the UpdateInstanceClusterNetworkAttachmentOptions builder
     */
    public Builder instanceClusterNetworkAttachmentPatch(Map<String, Object> instanceClusterNetworkAttachmentPatch) {
      this.instanceClusterNetworkAttachmentPatch = instanceClusterNetworkAttachmentPatch;
      return this;
    }
  }

  protected UpdateInstanceClusterNetworkAttachmentOptions() { }

  protected UpdateInstanceClusterNetworkAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceClusterNetworkAttachmentPatch,
      "instanceClusterNetworkAttachmentPatch cannot be null");
    instanceId = builder.instanceId;
    id = builder.id;
    instanceClusterNetworkAttachmentPatch = builder.instanceClusterNetworkAttachmentPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceClusterNetworkAttachmentOptions builder
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
   * The instance cluster network attachment identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceClusterNetworkAttachmentPatch.
   *
   * The instance cluster network attachment patch.
   *
   * @return the instanceClusterNetworkAttachmentPatch
   */
  public Map<String, Object> instanceClusterNetworkAttachmentPatch() {
    return instanceClusterNetworkAttachmentPatch;
  }
}

