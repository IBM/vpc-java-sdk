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
 * The listEndpointGatewayResourceBindings options.
 */
public class ListEndpointGatewayResourceBindingsOptions extends GenericModel {

  protected String endpointGatewayId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpointGatewayId;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListEndpointGatewayResourceBindingsOptions instance.
     *
     * @param listEndpointGatewayResourceBindingsOptions the instance to initialize the Builder with
     */
    private Builder(ListEndpointGatewayResourceBindingsOptions listEndpointGatewayResourceBindingsOptions) {
      this.endpointGatewayId = listEndpointGatewayResourceBindingsOptions.endpointGatewayId;
      this.start = listEndpointGatewayResourceBindingsOptions.start;
      this.limit = listEndpointGatewayResourceBindingsOptions.limit;
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
     */
    public Builder(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
    }

    /**
     * Builds a ListEndpointGatewayResourceBindingsOptions.
     *
     * @return the new ListEndpointGatewayResourceBindingsOptions instance
     */
    public ListEndpointGatewayResourceBindingsOptions build() {
      return new ListEndpointGatewayResourceBindingsOptions(this);
    }

    /**
     * Set the endpointGatewayId.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @return the ListEndpointGatewayResourceBindingsOptions builder
     */
    public Builder endpointGatewayId(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListEndpointGatewayResourceBindingsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListEndpointGatewayResourceBindingsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListEndpointGatewayResourceBindingsOptions() { }

  protected ListEndpointGatewayResourceBindingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.endpointGatewayId,
      "endpointGatewayId cannot be empty");
    endpointGatewayId = builder.endpointGatewayId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListEndpointGatewayResourceBindingsOptions builder
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
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

