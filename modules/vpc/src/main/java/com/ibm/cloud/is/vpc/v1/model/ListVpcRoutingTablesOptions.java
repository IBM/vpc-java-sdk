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
 * The listVpcRoutingTables options.
 */
public class ListVpcRoutingTablesOptions extends GenericModel {

  protected String vpcId;
  protected String start;
  protected Long limit;
  protected Boolean isDefault;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String start;
    private Long limit;
    private Boolean isDefault;

    /**
     * Instantiates a new Builder from an existing ListVpcRoutingTablesOptions instance.
     *
     * @param listVpcRoutingTablesOptions the instance to initialize the Builder with
     */
    private Builder(ListVpcRoutingTablesOptions listVpcRoutingTablesOptions) {
      this.vpcId = listVpcRoutingTablesOptions.vpcId;
      this.start = listVpcRoutingTablesOptions.start;
      this.limit = listVpcRoutingTablesOptions.limit;
      this.isDefault = listVpcRoutingTablesOptions.isDefault;
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
     */
    public Builder(String vpcId) {
      this.vpcId = vpcId;
    }

    /**
     * Builds a ListVpcRoutingTablesOptions.
     *
     * @return the new ListVpcRoutingTablesOptions instance
     */
    public ListVpcRoutingTablesOptions build() {
      return new ListVpcRoutingTablesOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListVpcRoutingTablesOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVpcRoutingTablesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVpcRoutingTablesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the isDefault.
     *
     * @param isDefault the isDefault
     * @return the ListVpcRoutingTablesOptions builder
     */
    public Builder isDefault(Boolean isDefault) {
      this.isDefault = isDefault;
      return this;
    }
  }

  protected ListVpcRoutingTablesOptions() { }

  protected ListVpcRoutingTablesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    vpcId = builder.vpcId;
    start = builder.start;
    limit = builder.limit;
    isDefault = builder.isDefault;
  }

  /**
   * New builder.
   *
   * @return a ListVpcRoutingTablesOptions builder
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
   * Gets the isDefault.
   *
   * Filters the collection to routing tables with the specified `is_default` value.
   *
   * @return the isDefault
   */
  public Boolean isDefault() {
    return isDefault;
  }
}

