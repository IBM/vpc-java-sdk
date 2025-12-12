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
 * The updatePrivatePathServiceGatewayAccountPolicy options.
 */
public class UpdatePrivatePathServiceGatewayAccountPolicyOptions extends GenericModel {

  protected String privatePathServiceGatewayId;
  protected String id;
  protected Map<String, Object> privatePathServiceGatewayAccountPolicyPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private String id;
    private Map<String, Object> privatePathServiceGatewayAccountPolicyPatch;

    /**
     * Instantiates a new Builder from an existing UpdatePrivatePathServiceGatewayAccountPolicyOptions instance.
     *
     * @param updatePrivatePathServiceGatewayAccountPolicyOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePrivatePathServiceGatewayAccountPolicyOptions updatePrivatePathServiceGatewayAccountPolicyOptions) {
      this.privatePathServiceGatewayId = updatePrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayId;
      this.id = updatePrivatePathServiceGatewayAccountPolicyOptions.id;
      this.privatePathServiceGatewayAccountPolicyPatch = updatePrivatePathServiceGatewayAccountPolicyOptions.privatePathServiceGatewayAccountPolicyPatch;
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
     * @param privatePathServiceGatewayAccountPolicyPatch the privatePathServiceGatewayAccountPolicyPatch
     */
    public Builder(String privatePathServiceGatewayId, String id, Map<String, Object> privatePathServiceGatewayAccountPolicyPatch) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      this.id = id;
      this.privatePathServiceGatewayAccountPolicyPatch = privatePathServiceGatewayAccountPolicyPatch;
    }

    /**
     * Builds a UpdatePrivatePathServiceGatewayAccountPolicyOptions.
     *
     * @return the new UpdatePrivatePathServiceGatewayAccountPolicyOptions instance
     */
    public UpdatePrivatePathServiceGatewayAccountPolicyOptions build() {
      return new UpdatePrivatePathServiceGatewayAccountPolicyOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the UpdatePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdatePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the privatePathServiceGatewayAccountPolicyPatch.
     *
     * @param privatePathServiceGatewayAccountPolicyPatch the privatePathServiceGatewayAccountPolicyPatch
     * @return the UpdatePrivatePathServiceGatewayAccountPolicyOptions builder
     */
    public Builder privatePathServiceGatewayAccountPolicyPatch(Map<String, Object> privatePathServiceGatewayAccountPolicyPatch) {
      this.privatePathServiceGatewayAccountPolicyPatch = privatePathServiceGatewayAccountPolicyPatch;
      return this;
    }
  }

  protected UpdatePrivatePathServiceGatewayAccountPolicyOptions() { }

  protected UpdatePrivatePathServiceGatewayAccountPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.privatePathServiceGatewayAccountPolicyPatch,
      "privatePathServiceGatewayAccountPolicyPatch cannot be null");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
    id = builder.id;
    privatePathServiceGatewayAccountPolicyPatch = builder.privatePathServiceGatewayAccountPolicyPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdatePrivatePathServiceGatewayAccountPolicyOptions builder
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

  /**
   * Gets the privatePathServiceGatewayAccountPolicyPatch.
   *
   * The account policy patch.
   *
   * @return the privatePathServiceGatewayAccountPolicyPatch
   */
  public Map<String, Object> privatePathServiceGatewayAccountPolicyPatch() {
    return privatePathServiceGatewayAccountPolicyPatch;
  }
}

