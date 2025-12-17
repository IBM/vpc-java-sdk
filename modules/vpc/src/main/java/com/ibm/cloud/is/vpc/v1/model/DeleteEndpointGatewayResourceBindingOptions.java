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
 * The deleteEndpointGatewayResourceBinding options.
 */
public class DeleteEndpointGatewayResourceBindingOptions extends GenericModel {

  protected String endpointGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpointGatewayId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteEndpointGatewayResourceBindingOptions instance.
     *
     * @param deleteEndpointGatewayResourceBindingOptions the instance to initialize the Builder with
     */
    private Builder(DeleteEndpointGatewayResourceBindingOptions deleteEndpointGatewayResourceBindingOptions) {
      this.endpointGatewayId = deleteEndpointGatewayResourceBindingOptions.endpointGatewayId;
      this.id = deleteEndpointGatewayResourceBindingOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @param id the id
     */
    public Builder(String endpointGatewayId, String id) {
      this.endpointGatewayId = endpointGatewayId;
      this.id = id;
    }

    /**
     * Builds a DeleteEndpointGatewayResourceBindingOptions.
     *
     * @return the new DeleteEndpointGatewayResourceBindingOptions instance
     */
    public DeleteEndpointGatewayResourceBindingOptions build() {
      return new DeleteEndpointGatewayResourceBindingOptions(this);
    }

    /**
     * Set the endpointGatewayId.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @return the DeleteEndpointGatewayResourceBindingOptions builder
     */
    public Builder endpointGatewayId(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteEndpointGatewayResourceBindingOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteEndpointGatewayResourceBindingOptions() { }

  protected DeleteEndpointGatewayResourceBindingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.endpointGatewayId,
      "endpointGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    endpointGatewayId = builder.endpointGatewayId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteEndpointGatewayResourceBindingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the endpointGatewayId.
   *
   * The endpoint gateway identifier.
   *
   * @return the endpointGatewayId
   */
  public String endpointGatewayId() {
    return endpointGatewayId;
  }

  /**
   * Gets the id.
   *
   * The resource binding identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

