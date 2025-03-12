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
 * The createBareMetalServerNetworkAttachment options.
 */
public class CreateBareMetalServerNetworkAttachmentOptions extends GenericModel {

  protected String bareMetalServerId;
  protected BareMetalServerNetworkAttachmentPrototype bareMetalServerNetworkAttachmentPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private BareMetalServerNetworkAttachmentPrototype bareMetalServerNetworkAttachmentPrototype;

    /**
     * Instantiates a new Builder from an existing CreateBareMetalServerNetworkAttachmentOptions instance.
     *
     * @param createBareMetalServerNetworkAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(CreateBareMetalServerNetworkAttachmentOptions createBareMetalServerNetworkAttachmentOptions) {
      this.bareMetalServerId = createBareMetalServerNetworkAttachmentOptions.bareMetalServerId;
      this.bareMetalServerNetworkAttachmentPrototype = createBareMetalServerNetworkAttachmentOptions.bareMetalServerNetworkAttachmentPrototype;
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
     * @param bareMetalServerNetworkAttachmentPrototype the bareMetalServerNetworkAttachmentPrototype
     */
    public Builder(String bareMetalServerId, BareMetalServerNetworkAttachmentPrototype bareMetalServerNetworkAttachmentPrototype) {
      this.bareMetalServerId = bareMetalServerId;
      this.bareMetalServerNetworkAttachmentPrototype = bareMetalServerNetworkAttachmentPrototype;
    }

    /**
     * Builds a CreateBareMetalServerNetworkAttachmentOptions.
     *
     * @return the new CreateBareMetalServerNetworkAttachmentOptions instance
     */
    public CreateBareMetalServerNetworkAttachmentOptions build() {
      return new CreateBareMetalServerNetworkAttachmentOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the CreateBareMetalServerNetworkAttachmentOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the bareMetalServerNetworkAttachmentPrototype.
     *
     * @param bareMetalServerNetworkAttachmentPrototype the bareMetalServerNetworkAttachmentPrototype
     * @return the CreateBareMetalServerNetworkAttachmentOptions builder
     */
    public Builder bareMetalServerNetworkAttachmentPrototype(BareMetalServerNetworkAttachmentPrototype bareMetalServerNetworkAttachmentPrototype) {
      this.bareMetalServerNetworkAttachmentPrototype = bareMetalServerNetworkAttachmentPrototype;
      return this;
    }
  }

  protected CreateBareMetalServerNetworkAttachmentOptions() { }

  protected CreateBareMetalServerNetworkAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bareMetalServerNetworkAttachmentPrototype,
      "bareMetalServerNetworkAttachmentPrototype cannot be null");
    bareMetalServerId = builder.bareMetalServerId;
    bareMetalServerNetworkAttachmentPrototype = builder.bareMetalServerNetworkAttachmentPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateBareMetalServerNetworkAttachmentOptions builder
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
   * Gets the bareMetalServerNetworkAttachmentPrototype.
   *
   * The bare metal server network attachment prototype object.
   *
   * @return the bareMetalServerNetworkAttachmentPrototype
   */
  public BareMetalServerNetworkAttachmentPrototype bareMetalServerNetworkAttachmentPrototype() {
    return bareMetalServerNetworkAttachmentPrototype;
  }
}

