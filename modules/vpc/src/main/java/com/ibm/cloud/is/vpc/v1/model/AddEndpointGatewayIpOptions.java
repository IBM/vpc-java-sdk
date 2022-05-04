/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
 * The addEndpointGatewayIp options.
 */
public class AddEndpointGatewayIpOptions extends GenericModel {

  protected String endpointGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpointGatewayId;
    private String id;

    private Builder(AddEndpointGatewayIpOptions addEndpointGatewayIpOptions) {
      this.endpointGatewayId = addEndpointGatewayIpOptions.endpointGatewayId;
      this.id = addEndpointGatewayIpOptions.id;
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
     * Builds a AddEndpointGatewayIpOptions.
     *
     * @return the new AddEndpointGatewayIpOptions instance
     */
    public AddEndpointGatewayIpOptions build() {
      return new AddEndpointGatewayIpOptions(this);
    }

    /**
     * Set the endpointGatewayId.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @return the AddEndpointGatewayIpOptions builder
     */
    public Builder endpointGatewayId(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AddEndpointGatewayIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected AddEndpointGatewayIpOptions(Builder builder) {
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
   * @return a AddEndpointGatewayIpOptions builder
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
   * The reserved IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

