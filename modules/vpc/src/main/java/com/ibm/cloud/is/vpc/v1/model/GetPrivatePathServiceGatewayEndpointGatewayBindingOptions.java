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
 * The getPrivatePathServiceGatewayEndpointGatewayBinding options.
 */
public class GetPrivatePathServiceGatewayEndpointGatewayBindingOptions extends GenericModel {

  protected String privatePathServiceGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetPrivatePathServiceGatewayEndpointGatewayBindingOptions instance.
     *
     * @param getPrivatePathServiceGatewayEndpointGatewayBindingOptions the instance to initialize the Builder with
     */
    private Builder(GetPrivatePathServiceGatewayEndpointGatewayBindingOptions getPrivatePathServiceGatewayEndpointGatewayBindingOptions) {
      this.privatePathServiceGatewayId = getPrivatePathServiceGatewayEndpointGatewayBindingOptions.privatePathServiceGatewayId;
      this.id = getPrivatePathServiceGatewayEndpointGatewayBindingOptions.id;
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
     * Builds a GetPrivatePathServiceGatewayEndpointGatewayBindingOptions.
     *
     * @return the new GetPrivatePathServiceGatewayEndpointGatewayBindingOptions instance
     */
    public GetPrivatePathServiceGatewayEndpointGatewayBindingOptions build() {
      return new GetPrivatePathServiceGatewayEndpointGatewayBindingOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the GetPrivatePathServiceGatewayEndpointGatewayBindingOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetPrivatePathServiceGatewayEndpointGatewayBindingOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetPrivatePathServiceGatewayEndpointGatewayBindingOptions() { }

  protected GetPrivatePathServiceGatewayEndpointGatewayBindingOptions(Builder builder) {
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
   * @return a GetPrivatePathServiceGatewayEndpointGatewayBindingOptions builder
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
}

