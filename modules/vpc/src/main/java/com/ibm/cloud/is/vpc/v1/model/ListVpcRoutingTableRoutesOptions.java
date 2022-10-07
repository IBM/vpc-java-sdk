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
 * The listVpcRoutingTableRoutes options.
 */
public class ListVpcRoutingTableRoutesOptions extends GenericModel {

  protected String vpcId;
  protected String routingTableId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String routingTableId;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListVpcRoutingTableRoutesOptions instance.
     *
     * @param listVpcRoutingTableRoutesOptions the instance to initialize the Builder with
     */
    private Builder(ListVpcRoutingTableRoutesOptions listVpcRoutingTableRoutesOptions) {
      this.vpcId = listVpcRoutingTableRoutesOptions.vpcId;
      this.routingTableId = listVpcRoutingTableRoutesOptions.routingTableId;
      this.start = listVpcRoutingTableRoutesOptions.start;
      this.limit = listVpcRoutingTableRoutesOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpcId the vpcId
     * @param routingTableId the routingTableId
     */
    public Builder(String vpcId, String routingTableId) {
      this.vpcId = vpcId;
      this.routingTableId = routingTableId;
    }

    /**
     * Builds a ListVpcRoutingTableRoutesOptions.
     *
     * @return the new ListVpcRoutingTableRoutesOptions instance
     */
    public ListVpcRoutingTableRoutesOptions build() {
      return new ListVpcRoutingTableRoutesOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListVpcRoutingTableRoutesOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the routingTableId.
     *
     * @param routingTableId the routingTableId
     * @return the ListVpcRoutingTableRoutesOptions builder
     */
    public Builder routingTableId(String routingTableId) {
      this.routingTableId = routingTableId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVpcRoutingTableRoutesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVpcRoutingTableRoutesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListVpcRoutingTableRoutesOptions() { }

  protected ListVpcRoutingTableRoutesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.routingTableId,
      "routingTableId cannot be empty");
    vpcId = builder.vpcId;
    routingTableId = builder.routingTableId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListVpcRoutingTableRoutesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpcId.
   *
   * The VPC identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the routingTableId.
   *
   * The routing table identifier.
   *
   * @return the routingTableId
   */
  public String routingTableId() {
    return routingTableId;
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

