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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listPrivatePathServiceGatewayEndpointGatewayBindings options.
 */
public class ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions extends GenericModel {

  /**
   * Filters the collection to endpoint gateway bindings with a `status` property matching the specified value.
   */
  public interface Status {
    /** abandoned. */
    String ABANDONED = "abandoned";
    /** denied. */
    String DENIED = "denied";
    /** expired. */
    String EXPIRED = "expired";
    /** pending. */
    String PENDING = "pending";
    /** permitted. */
    String PERMITTED = "permitted";
  }

  protected String privatePathServiceGatewayId;
  protected String start;
  protected Long limit;
  protected String status;
  protected String accountId;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private String start;
    private Long limit;
    private String status;
    private String accountId;

    /**
     * Instantiates a new Builder from an existing ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions instance.
     *
     * @param listPrivatePathServiceGatewayEndpointGatewayBindingsOptions the instance to initialize the Builder with
     */
    private Builder(ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions listPrivatePathServiceGatewayEndpointGatewayBindingsOptions) {
      this.privatePathServiceGatewayId = listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.privatePathServiceGatewayId;
      this.start = listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.start;
      this.limit = listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.limit;
      this.status = listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.status;
      this.accountId = listPrivatePathServiceGatewayEndpointGatewayBindingsOptions.accountId;
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
     */
    public Builder(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
    }

    /**
     * Builds a ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions.
     *
     * @return the new ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions instance
     */
    public ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions build() {
      return new ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the status.
     *
     * @param status the status
     * @return the ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions builder
     */
    public Builder status(String status) {
      this.status = status;
      return this;
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
  }

  protected ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions() { }

  protected ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
    start = builder.start;
    limit = builder.limit;
    status = builder.status;
    accountId = builder.accountId;
  }

  /**
   * New builder.
   *
   * @return a ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions builder
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
   * Gets the status.
   *
   * Filters the collection to endpoint gateway bindings with a `status` property matching the specified value.
   *
   * @return the status
   */
  public String status() {
    return status;
  }

  /**
   * Gets the accountId.
   *
   * Filters the collection to resources with an `account.id` property matching the specified identifier.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }
}

