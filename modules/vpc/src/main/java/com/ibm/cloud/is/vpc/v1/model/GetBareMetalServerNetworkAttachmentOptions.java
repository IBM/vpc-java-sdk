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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getBareMetalServerNetworkAttachment options.
 */
public class GetBareMetalServerNetworkAttachmentOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetBareMetalServerNetworkAttachmentOptions instance.
     *
     * @param getBareMetalServerNetworkAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(GetBareMetalServerNetworkAttachmentOptions getBareMetalServerNetworkAttachmentOptions) {
      this.bareMetalServerId = getBareMetalServerNetworkAttachmentOptions.bareMetalServerId;
      this.id = getBareMetalServerNetworkAttachmentOptions.id;
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
     */
    public Builder(String bareMetalServerId, String id) {
      this.bareMetalServerId = bareMetalServerId;
      this.id = id;
    }

    /**
     * Builds a GetBareMetalServerNetworkAttachmentOptions.
     *
     * @return the new GetBareMetalServerNetworkAttachmentOptions instance
     */
    public GetBareMetalServerNetworkAttachmentOptions build() {
      return new GetBareMetalServerNetworkAttachmentOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the GetBareMetalServerNetworkAttachmentOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetBareMetalServerNetworkAttachmentOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetBareMetalServerNetworkAttachmentOptions() { }

  protected GetBareMetalServerNetworkAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    bareMetalServerId = builder.bareMetalServerId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetBareMetalServerNetworkAttachmentOptions builder
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
}

