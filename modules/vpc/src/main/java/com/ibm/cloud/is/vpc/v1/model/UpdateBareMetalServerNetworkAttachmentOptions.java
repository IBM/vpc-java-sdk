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
 * The updateBareMetalServerNetworkAttachment options.
 */
public class UpdateBareMetalServerNetworkAttachmentOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String id;
  protected Map<String, Object> bareMetalServerNetworkAttachmentPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String id;
    private Map<String, Object> bareMetalServerNetworkAttachmentPatch;

    /**
     * Instantiates a new Builder from an existing UpdateBareMetalServerNetworkAttachmentOptions instance.
     *
     * @param updateBareMetalServerNetworkAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(UpdateBareMetalServerNetworkAttachmentOptions updateBareMetalServerNetworkAttachmentOptions) {
      this.bareMetalServerId = updateBareMetalServerNetworkAttachmentOptions.bareMetalServerId;
      this.id = updateBareMetalServerNetworkAttachmentOptions.id;
      this.bareMetalServerNetworkAttachmentPatch = updateBareMetalServerNetworkAttachmentOptions.bareMetalServerNetworkAttachmentPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @param id the id
     * @param bareMetalServerNetworkAttachmentPatch the bareMetalServerNetworkAttachmentPatch
     */
    public Builder(String bareMetalServerId, String id, Map<String, Object> bareMetalServerNetworkAttachmentPatch) {
      this.bareMetalServerId = bareMetalServerId;
      this.id = id;
      this.bareMetalServerNetworkAttachmentPatch = bareMetalServerNetworkAttachmentPatch;
    }

    /**
     * Builds a UpdateBareMetalServerNetworkAttachmentOptions.
     *
     * @return the new UpdateBareMetalServerNetworkAttachmentOptions instance
     */
    public UpdateBareMetalServerNetworkAttachmentOptions build() {
      return new UpdateBareMetalServerNetworkAttachmentOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the UpdateBareMetalServerNetworkAttachmentOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateBareMetalServerNetworkAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the bareMetalServerNetworkAttachmentPatch.
     *
     * @param bareMetalServerNetworkAttachmentPatch the bareMetalServerNetworkAttachmentPatch
     * @return the UpdateBareMetalServerNetworkAttachmentOptions builder
     */
    public Builder bareMetalServerNetworkAttachmentPatch(Map<String, Object> bareMetalServerNetworkAttachmentPatch) {
      this.bareMetalServerNetworkAttachmentPatch = bareMetalServerNetworkAttachmentPatch;
      return this;
    }
  }

  protected UpdateBareMetalServerNetworkAttachmentOptions() { }

  protected UpdateBareMetalServerNetworkAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bareMetalServerNetworkAttachmentPatch,
      "bareMetalServerNetworkAttachmentPatch cannot be null");
    bareMetalServerId = builder.bareMetalServerId;
    id = builder.id;
    bareMetalServerNetworkAttachmentPatch = builder.bareMetalServerNetworkAttachmentPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateBareMetalServerNetworkAttachmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bareMetalServerId.
   *
   * The bare metal server identifier.
   *
   * @return the bareMetalServerId
   */
  public String bareMetalServerId() {
    return bareMetalServerId;
  }

  /**
   * Gets the id.
   *
   * The bare metal server network attachment identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the bareMetalServerNetworkAttachmentPatch.
   *
   * The bare metal server network attachment patch.
   *
   * @return the bareMetalServerNetworkAttachmentPatch
   */
  public Map<String, Object> bareMetalServerNetworkAttachmentPatch() {
    return bareMetalServerNetworkAttachmentPatch;
  }
}

