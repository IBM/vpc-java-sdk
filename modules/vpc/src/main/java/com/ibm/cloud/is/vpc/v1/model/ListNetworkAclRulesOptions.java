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
 * The listNetworkAclRules options.
 */
public class ListNetworkAclRulesOptions extends GenericModel {

  /**
   * Filters the collection to rules with the specified direction.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  protected String networkAclId;
  protected String start;
  protected Long limit;
  protected String direction;

  /**
   * Builder.
   */
  public static class Builder {
    private String networkAclId;
    private String start;
    private Long limit;
    private String direction;

    /**
     * Instantiates a new Builder from an existing ListNetworkAclRulesOptions instance.
     *
     * @param listNetworkAclRulesOptions the instance to initialize the Builder with
     */
    private Builder(ListNetworkAclRulesOptions listNetworkAclRulesOptions) {
      this.networkAclId = listNetworkAclRulesOptions.networkAclId;
      this.start = listNetworkAclRulesOptions.start;
      this.limit = listNetworkAclRulesOptions.limit;
      this.direction = listNetworkAclRulesOptions.direction;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param networkAclId the networkAclId
     */
    public Builder(String networkAclId) {
      this.networkAclId = networkAclId;
    }

    /**
     * Builds a ListNetworkAclRulesOptions.
     *
     * @return the new ListNetworkAclRulesOptions instance
     */
    public ListNetworkAclRulesOptions build() {
      return new ListNetworkAclRulesOptions(this);
    }

    /**
     * Set the networkAclId.
     *
     * @param networkAclId the networkAclId
     * @return the ListNetworkAclRulesOptions builder
     */
    public Builder networkAclId(String networkAclId) {
      this.networkAclId = networkAclId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListNetworkAclRulesOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListNetworkAclRulesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the ListNetworkAclRulesOptions builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }
  }

  protected ListNetworkAclRulesOptions() { }

  protected ListNetworkAclRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkAclId,
      "networkAclId cannot be empty");
    networkAclId = builder.networkAclId;
    start = builder.start;
    limit = builder.limit;
    direction = builder.direction;
  }

  /**
   * New builder.
   *
   * @return a ListNetworkAclRulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the networkAclId.
   *
   * The network ACL identifier.
   *
   * @return the networkAclId
   */
  public String networkAclId() {
    return networkAclId;
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
   * Gets the direction.
   *
   * Filters the collection to rules with the specified direction.
   *
   * @return the direction
   */
  public String direction() {
    return direction;
  }
}

