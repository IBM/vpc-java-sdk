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
 * The listEndpointGatewayIps options.
 */
public class ListEndpointGatewayIpsOptions extends GenericModel {

  /**
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value `-created_at` sorts the collection by the `created_at` property
   * in descending order, and the value `name` sorts it by the `name` property in ascending order.
   */
  public interface Sort {
    /** address. */
    String ADDRESS = "address";
    /** created_at. */
    String CREATED_AT = "created_at";
    /** name. */
    String NAME = "name";
  }

  protected String endpointGatewayId;
  protected String start;
  protected Long limit;
  protected String sort;

  /**
   * Builder.
   */
  public static class Builder {
    private String endpointGatewayId;
    private String start;
    private Long limit;
    private String sort;

    private Builder(ListEndpointGatewayIpsOptions listEndpointGatewayIpsOptions) {
      this.endpointGatewayId = listEndpointGatewayIpsOptions.endpointGatewayId;
      this.start = listEndpointGatewayIpsOptions.start;
      this.limit = listEndpointGatewayIpsOptions.limit;
      this.sort = listEndpointGatewayIpsOptions.sort;
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
     * Builds a ListEndpointGatewayIpsOptions.
     *
     * @return the new ListEndpointGatewayIpsOptions instance
     */
    public ListEndpointGatewayIpsOptions build() {
      return new ListEndpointGatewayIpsOptions(this);
    }

    /**
     * Set the endpointGatewayId.
     *
     * @param endpointGatewayId the endpointGatewayId
     * @return the ListEndpointGatewayIpsOptions builder
     */
    public Builder endpointGatewayId(String endpointGatewayId) {
      this.endpointGatewayId = endpointGatewayId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListEndpointGatewayIpsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListEndpointGatewayIpsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListEndpointGatewayIpsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  protected ListEndpointGatewayIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.endpointGatewayId,
      "endpointGatewayId cannot be empty");
    endpointGatewayId = builder.endpointGatewayId;
    start = builder.start;
    limit = builder.limit;
    sort = builder.sort;
  }

  /**
   * New builder.
   *
   * @return a ListEndpointGatewayIpsOptions builder
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

  /**
   * Gets the sort.
   *
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value `-created_at` sorts the collection by the `created_at` property
   * in descending order, and the value `name` sorts it by the `name` property in ascending order.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }
}

