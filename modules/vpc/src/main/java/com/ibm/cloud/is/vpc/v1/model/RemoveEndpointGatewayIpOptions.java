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
 * The removeEndpointGatewayIp options.
 */
public class RemoveEndpointGatewayIpOptions extends GenericModel {

  protected String endpointGatewayId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpointGatewayId;
    private String id;

    private Builder(RemoveEndpointGatewayIpOptions removeEndpointGatewayIpOptions) {
      this.endpointGatewayId = removeEndpointGatewayIpOptions.endpointGatewayId;
      this.id = removeEndpointGatewayIpOptions.id;
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
     * Builds a RemoveEndpointGatewayIpOptions.
     *
     * @return the new RemoveEndpointGatewayIpOptions instance
     */
    public RemoveEndpointGatewayIpOptions build() {
      return new RemoveEndpointGatewayIpOptions(this);
    }

    /**
     * Set the endpointGatewayId.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @return the RemoveEndpointGatewayIpOptions builder
     */
    public Builder endpointGatewayId(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the RemoveEndpointGatewayIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected RemoveEndpointGatewayIpOptions(Builder builder) {
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
   * @return a RemoveEndpointGatewayIpOptions builder
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

