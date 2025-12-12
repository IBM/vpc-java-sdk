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
 * The listVpcDnsResolutionBindings options.
 */
public class ListVpcDnsResolutionBindingsOptions extends GenericModel {

  /**
   * Sorts the returned collection by the specified property name in ascending order. A `-` may be prepended to the name
   * to sort in descending order. For example, the value `-created_at` sorts the collection by the `created_at` property
   * in descending order, and the value `name` sorts it by the `name` property in ascending order.
   */
  public interface Sort {
    /** created_at. */
    String CREATED_AT = "created_at";
    /** name. */
    String NAME = "name";
  }

  protected String vpcId;
  protected String sort;
  protected String start;
  protected Long limit;
  protected String name;
  protected String vpcCrn;
  protected String vpcName;
  protected String accountId;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String sort;
    private String start;
    private Long limit;
    private String name;
    private String vpcCrn;
    private String vpcName;
    private String accountId;

    /**
     * Instantiates a new Builder from an existing ListVpcDnsResolutionBindingsOptions instance.
     *
     * @param listVpcDnsResolutionBindingsOptions the instance to initialize the Builder with
     */
    private Builder(ListVpcDnsResolutionBindingsOptions listVpcDnsResolutionBindingsOptions) {
      this.vpcId = listVpcDnsResolutionBindingsOptions.vpcId;
      this.sort = listVpcDnsResolutionBindingsOptions.sort;
      this.start = listVpcDnsResolutionBindingsOptions.start;
      this.limit = listVpcDnsResolutionBindingsOptions.limit;
      this.name = listVpcDnsResolutionBindingsOptions.name;
      this.vpcCrn = listVpcDnsResolutionBindingsOptions.vpcCrn;
      this.vpcName = listVpcDnsResolutionBindingsOptions.vpcName;
      this.accountId = listVpcDnsResolutionBindingsOptions.accountId;
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
     * Builds a ListVpcDnsResolutionBindingsOptions.
     *
     * @return the new ListVpcDnsResolutionBindingsOptions instance
     */
    public ListVpcDnsResolutionBindingsOptions build() {
      return new ListVpcDnsResolutionBindingsOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the vpcCrn.
     *
     * @param vpcCrn the vpcCrn
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder vpcCrn(String vpcCrn) {
      this.vpcCrn = vpcCrn;
      return this;
    }

    /**
     * Set the vpcName.
     *
     * @param vpcName the vpcName
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder vpcName(String vpcName) {
      this.vpcName = vpcName;
      return this;
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the ListVpcDnsResolutionBindingsOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
  }

  protected ListVpcDnsResolutionBindingsOptions() { }

  protected ListVpcDnsResolutionBindingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    vpcId = builder.vpcId;
    sort = builder.sort;
    start = builder.start;
    limit = builder.limit;
    name = builder.name;
    vpcCrn = builder.vpcCrn;
    vpcName = builder.vpcName;
    accountId = builder.accountId;
  }

  /**
   * New builder.
   *
   * @return a ListVpcDnsResolutionBindingsOptions builder
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
   * Gets the name.
   *
   * Filters the collection to resources with a `name` property matching the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the vpcCrn.
   *
   * Filters the collection to resources with a `vpc.crn` property matching the specified CRN.
   *
   * @return the vpcCrn
   */
  public String vpcCrn() {
    return vpcCrn;
  }

  /**
   * Gets the vpcName.
   *
   * Filters the collection to resources with a `vpc.name` property matching the exact specified name.
   *
   * @return the vpcName
   */
  public String vpcName() {
    return vpcName;
  }

  /**
   * Gets the accountId.
   *
   * Filters the collection to resources with a `vpc.remote.account.id` property matching the specified account
   * identifier.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }
}

