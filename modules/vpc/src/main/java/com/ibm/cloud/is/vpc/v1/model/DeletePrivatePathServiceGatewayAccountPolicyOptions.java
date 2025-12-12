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
 * The deletePrivatePathServiceGatewayAccountPolicy options.
 */
public class DeletePrivatePathServiceGatewayAccountPolicyOptions extends GenericModel {

  protected String privatePathServiceGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeletePrivatePathServiceGatewayAccountPolicyOptions instance.
     *
     * @param deletePrivatePathServiceGatewayAccountPolicyOptions the instance to initialize the Builder with
     */
    private Builder(DeletePrivatePathServiceGatewayAccountPolicyOptions deletePrivatePathServiceGatewayAccountPolicyOptions) {
      this.privatePathServiceGatewayId = deletePrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayId;
      this.id = deletePrivatePathServiceGatewayAccountPolicyOptions.id;
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
     * @param id the id
     */
    public Builder(String privatePathServiceGatewayId, String id) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      this.id = id;
    }

    /**
     * Builds a DeletePrivatePathServiceGatewayAccountPolicyOptions.
     *
     * @return the new DeletePrivatePathServiceGatewayAccountPolicyOptions instance
     */
    public DeletePrivatePathServiceGatewayAccountPolicyOptions build() {
      return new DeletePrivatePathServiceGatewayAccountPolicyOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the DeletePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeletePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeletePrivatePathServiceGatewayAccountPolicyOptions() { }

  protected DeletePrivatePathServiceGatewayAccountPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeletePrivatePathServiceGatewayAccountPolicyOptions builder
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

  /**
   * Gets the id.
   *
   * The account policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

