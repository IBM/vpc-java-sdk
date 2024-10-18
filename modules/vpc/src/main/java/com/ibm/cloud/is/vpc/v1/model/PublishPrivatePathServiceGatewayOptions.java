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
 * The publishPrivatePathServiceGateway options.
 */
public class PublishPrivatePathServiceGatewayOptions extends GenericModel {

  protected String privatePathServiceGatewayId;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;

    /**
     * Instantiates a new Builder from an existing PublishPrivatePathServiceGatewayOptions instance.
     *
     * @param publishPrivatePathServiceGatewayOptions the instance to initialize the Builder with
     */
    private Builder(PublishPrivatePathServiceGatewayOptions publishPrivatePathServiceGatewayOptions) {
      this.privatePathServiceGatewayId = publishPrivatePathServiceGatewayOptions.privatePathServiceGatewayId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     */
    public Builder(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
    }

    /**
     * Builds a PublishPrivatePathServiceGatewayOptions.
     *
     * @return the new PublishPrivatePathServiceGatewayOptions instance
     */
    public PublishPrivatePathServiceGatewayOptions build() {
      return new PublishPrivatePathServiceGatewayOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the PublishPrivatePathServiceGatewayOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }
  }

  protected PublishPrivatePathServiceGatewayOptions() { }

  protected PublishPrivatePathServiceGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
  }

  /**
   * New builder.
   *
   * @return a PublishPrivatePathServiceGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the privatePathServiceGatewayId.
   *
   * The private path service gateway identifier.
   *
   * @return the privatePathServiceGatewayId
   */
  public String privatePathServiceGatewayId() {
    return privatePathServiceGatewayId;
  }
}

