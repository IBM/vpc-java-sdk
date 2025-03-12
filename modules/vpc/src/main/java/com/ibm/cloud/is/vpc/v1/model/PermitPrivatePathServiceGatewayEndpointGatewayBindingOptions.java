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
 * The permitPrivatePathServiceGatewayEndpointGatewayBinding options.
 */
public class PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions extends GenericModel {

  protected String privatePathServiceGatewayId;
  protected String id;
  protected Boolean setAccountPolicy;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private String id;
    private Boolean setAccountPolicy;

    /**
     * Instantiates a new Builder from an existing PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions instance.
     *
     * @param permitPrivatePathServiceGatewayEndpointGatewayBindingOptions the instance to initialize the Builder with
     */
    private Builder(PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions permitPrivatePathServiceGatewayEndpointGatewayBindingOptions) {
      this.privatePathServiceGatewayId = permitPrivatePathServiceGatewayEndpointGatewayBindingOptions.privatePathServiceGatewayId;
      this.id = permitPrivatePathServiceGatewayEndpointGatewayBindingOptions.id;
      this.setAccountPolicy = permitPrivatePathServiceGatewayEndpointGatewayBindingOptions.setAccountPolicy;
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
     * Builds a PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions.
     *
     * @return the new PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions instance
     */
    public PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions build() {
      return new PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the setAccountPolicy.
     *
     * @param setAccountPolicy the setAccountPolicy
     * @return the PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions builder
     */
    public Builder setAccountPolicy(Boolean setAccountPolicy) {
      this.setAccountPolicy = setAccountPolicy;
      return this;
    }
  }

  protected PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions() { }

  protected PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
    id = builder.id;
    setAccountPolicy = builder.setAccountPolicy;
  }

  /**
   * New builder.
   *
   * @return a PermitPrivatePathServiceGatewayEndpointGatewayBindingOptions builder
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
   * The endpoint gateway binding identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the setAccountPolicy.
   *
   * Indicates whether this will become the access policy for any `pending` and future endpoint gateway bindings from
   * the same account.
   *
   * If set to `true`:
   *
   * - If the account has an existing access policy, that policy will be updated to
   *   `permit`. Otherwise, a new `permit` access policy will be created for the account.
   * - All `pending` endpoint gateway bindings for the account will be permitted.
   *
   * If set to `false`:
   *
   * - No access policies will be created or updated
   * - All `pending` endpoint gateway bindings for the account will remain `pending`.
   *
   * @return the setAccountPolicy
   */
  public Boolean setAccountPolicy() {
    return setAccountPolicy;
  }
}

