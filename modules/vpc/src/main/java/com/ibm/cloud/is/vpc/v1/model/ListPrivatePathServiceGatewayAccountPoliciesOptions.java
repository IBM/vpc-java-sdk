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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listPrivatePathServiceGatewayAccountPolicies options.
 */
public class ListPrivatePathServiceGatewayAccountPoliciesOptions extends GenericModel {

  protected String privatePathServiceGatewayId;
  protected String start;
  protected Long limit;
  protected String accountId;

  /**
   * Builder.
   */
  public static class Builder {
    private String privatePathServiceGatewayId;
    private String start;
    private Long limit;
    private String accountId;

    /**
     * Instantiates a new Builder from an existing ListPrivatePathServiceGatewayAccountPoliciesOptions instance.
     *
     * @param listPrivatePathServiceGatewayAccountPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(ListPrivatePathServiceGatewayAccountPoliciesOptions listPrivatePathServiceGatewayAccountPoliciesOptions) {
      this.privatePathServiceGatewayId = listPrivatePathServiceGatewayAccountPoliciesOptions.privatePathServiceGatewayId;
      this.start = listPrivatePathServiceGatewayAccountPoliciesOptions.start;
      this.limit = listPrivatePathServiceGatewayAccountPoliciesOptions.limit;
      this.accountId = listPrivatePathServiceGatewayAccountPoliciesOptions.accountId;
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
     * Builds a ListPrivatePathServiceGatewayAccountPoliciesOptions.
     *
     * @return the new ListPrivatePathServiceGatewayAccountPoliciesOptions instance
     */
    public ListPrivatePathServiceGatewayAccountPoliciesOptions build() {
      return new ListPrivatePathServiceGatewayAccountPoliciesOptions(this);
    }

    /**
     * Set the privatePathServiceGatewayId.
     *
     * @param privatePathServiceGatewayId the privatePathServiceGatewayId
     * @return the ListPrivatePathServiceGatewayAccountPoliciesOptions builder
     */
    public Builder privatePathServiceGatewayId(String privatePathServiceGatewayId) {
      this.privatePathServiceGatewayId = privatePathServiceGatewayId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListPrivatePathServiceGatewayAccountPoliciesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListPrivatePathServiceGatewayAccountPoliciesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the ListPrivatePathServiceGatewayAccountPoliciesOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
  }

  protected ListPrivatePathServiceGatewayAccountPoliciesOptions() { }

  protected ListPrivatePathServiceGatewayAccountPoliciesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.privatePathServiceGatewayId,
      "privatePathServiceGatewayId cannot be empty");
    privatePathServiceGatewayId = builder.privatePathServiceGatewayId;
    start = builder.start;
    limit = builder.limit;
    accountId = builder.accountId;
  }

  /**
   * New builder.
   *
   * @return a ListPrivatePathServiceGatewayAccountPoliciesOptions builder
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

