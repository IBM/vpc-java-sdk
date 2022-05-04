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
 * The listEndpointGateways options.
 */
public class ListEndpointGatewaysOptions extends GenericModel {

  protected String name;
  protected String start;
  protected Long limit;
  protected String resourceGroupId;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String start;
    private Long limit;
    private String resourceGroupId;

    private Builder(ListEndpointGatewaysOptions listEndpointGatewaysOptions) {
      this.name = listEndpointGatewaysOptions.name;
      this.start = listEndpointGatewaysOptions.start;
      this.limit = listEndpointGatewaysOptions.limit;
      this.resourceGroupId = listEndpointGatewaysOptions.resourceGroupId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListEndpointGatewaysOptions.
     *
     * @return the new ListEndpointGatewaysOptions instance
     */
    public ListEndpointGatewaysOptions build() {
      return new ListEndpointGatewaysOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListEndpointGatewaysOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }
  }

  protected ListEndpointGatewaysOptions(Builder builder) {
    name = builder.name;
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
  }

  /**
   * New builder.
   *
   * @return a ListEndpointGatewaysOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
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

  /**
   * Gets the resourceGroupId.
   *
   * Filters the collection to resources in the resource group with the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }
}

