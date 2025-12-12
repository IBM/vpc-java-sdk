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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The unpublishPrivatePathServiceGateway options.
 */
public class UnpublishPrivatePathServiceGatewayOptions extends GenericModel {

  protected String privatePathServiceGatewayId;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;

    /**
     * Instantiates a new Builder from an existing UnpublishPrivatePathServiceGatewayOptions instance.
     *
     * @param unpublishPrivatePathServiceGatewayOptions the instance to initialize the Builder with
     */
    private Builder(UnpublishPrivatePathServiceGatewayOptions unpublishPrivatePathServiceGatewayOptions) {
      this.privatePathServiceGatewayId = unpublishPrivatePathServiceGatewayOptions.privatePathServiceGatewayId;
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
     * Builds a UnpublishPrivatePathServiceGatewayOptions.
     *
     * @return the new UnpublishPrivatePathServiceGatewayOptions instance
     */
    public UnpublishPrivatePathServiceGatewayOptions build() {
      return new UnpublishPrivatePathServiceGatewayOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the UnpublishPrivatePathServiceGatewayOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }
  }

  protected UnpublishPrivatePathServiceGatewayOptions() { }

  protected UnpublishPrivatePathServiceGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
  }

  /**
   * New builder.
   *
   * @return a UnpublishPrivatePathServiceGatewayOptions builder
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

