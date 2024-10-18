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
 * The updatePrivatePathServiceGateway options.
 */
public class UpdatePrivatePathServiceGatewayOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> privatePathServiceGatewayPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> privatePathServiceGatewayPatch;

    /**
     * Instantiates a new Builder from an existing UpdatePrivatePathServiceGatewayOptions instance.
     *
     * @param updatePrivatePathServiceGatewayOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePrivatePathServiceGatewayOptions updatePrivatePathServiceGatewayOptions) {
      this.id = updatePrivatePathServiceGatewayOptions.id;
      this.privatePathServiceGatewayPatch = updatePrivatePathServiceGatewayOptions.privatePathServiceGatewayPatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param privatePathServiceGatewayPatch the privatePathServiceGatewayPatch
     */
    public Builder(String id, Map<String, Object> privatePathServiceGatewayPatch) {
      this.id = id;
      this.privatePathServiceGatewayPatch = privatePathServiceGatewayPatch;
    }

    /**
     * Builds a UpdatePrivatePathServiceGatewayOptions.
     *
     * @return the new UpdatePrivatePathServiceGatewayOptions instance
     */
    public UpdatePrivatePathServiceGatewayOptions build() {
      return new UpdatePrivatePathServiceGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdatePrivatePathServiceGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the privatePathServiceGatewayPatch.
     *
     * @param privatePathServiceGatewayPatch the privatePathServiceGatewayPatch
     * @return the UpdatePrivatePathServiceGatewayOptions builder
     */
    public Builder privatePathServiceGatewayPatch(Map<String, Object> privatePathServiceGatewayPatch) {
      this.privatePathServiceGatewayPatch = privatePathServiceGatewayPatch;
      return this;
    }
  }

  protected UpdatePrivatePathServiceGatewayOptions() { }

  protected UpdatePrivatePathServiceGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.privatePathServiceGatewayPatch,
      "privatePathServiceGatewayPatch cannot be null");
    id = builder.id;
    privatePathServiceGatewayPatch = builder.privatePathServiceGatewayPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdatePrivatePathServiceGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The private path service gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the privatePathServiceGatewayPatch.
   *
   * The private path service gateway patch.
   *
   * @return the privatePathServiceGatewayPatch
   */
  public Map<String, Object> privatePathServiceGatewayPatch() {
    return privatePathServiceGatewayPatch;
  }
}

