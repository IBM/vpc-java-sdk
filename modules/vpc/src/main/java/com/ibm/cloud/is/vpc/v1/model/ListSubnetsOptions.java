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
 * The listSubnets options.
 */
public class ListSubnetsOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String zoneName;
  protected String vpcId;
  protected String vpcCrn;
  protected String vpcName;
  protected String routingTableId;
  protected String routingTableName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String zoneName;
    private String vpcId;
    private String vpcCrn;
    private String vpcName;
    private String routingTableId;
    private String routingTableName;

    /**
     * Instantiates a new Builder from an existing ListSubnetsOptions instance.
     *
     * @param listSubnetsOptions the instance to initialize the Builder with
     */
    private Builder(ListSubnetsOptions listSubnetsOptions) {
      this.start = listSubnetsOptions.start;
      this.limit = listSubnetsOptions.limit;
      this.resourceGroupId = listSubnetsOptions.resourceGroupId;
      this.zoneName = listSubnetsOptions.zoneName;
      this.vpcId = listSubnetsOptions.vpcId;
      this.vpcCrn = listSubnetsOptions.vpcCrn;
      this.vpcName = listSubnetsOptions.vpcName;
      this.routingTableId = listSubnetsOptions.routingTableId;
      this.routingTableName = listSubnetsOptions.routingTableName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSubnetsOptions.
     *
     * @return the new ListSubnetsOptions instance
     */
    public ListSubnetsOptions build() {
      return new ListSubnetsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListSubnetsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSubnetsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListSubnetsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the zoneName.
     *
     * @param zoneName the zoneName
     * @return the ListSubnetsOptions builder
     */
    public Builder zoneName(String zoneName) {
      this.zoneName = zoneName;
      return this;
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListSubnetsOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the vpcCrn.
     *
     * @param vpcCrn the vpcCrn
     * @return the ListSubnetsOptions builder
     */
    public Builder vpcCrn(String vpcCrn) {
      this.vpcCrn = vpcCrn;
      return this;
    }

    /**
     * Set the vpcName.
     *
     * @param vpcName the vpcName
     * @return the ListSubnetsOptions builder
     */
    public Builder vpcName(String vpcName) {
      this.vpcName = vpcName;
      return this;
    }

    /**
     * Set the routingTableId.
     *
     * @param routingTableId the routingTableId
     * @return the ListSubnetsOptions builder
     */
    public Builder routingTableId(String routingTableId) {
      this.routingTableId = routingTableId;
      return this;
    }

    /**
     * Set the routingTableName.
     *
     * @param routingTableName the routingTableName
     * @return the ListSubnetsOptions builder
     */
    public Builder routingTableName(String routingTableName) {
      this.routingTableName = routingTableName;
      return this;
    }
  }

  protected ListSubnetsOptions() { }

  protected ListSubnetsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    zoneName = builder.zoneName;
    vpcId = builder.vpcId;
    vpcCrn = builder.vpcCrn;
    vpcName = builder.vpcName;
    routingTableId = builder.routingTableId;
    routingTableName = builder.routingTableName;
  }

  /**
   * New builder.
   *
   * @return a ListSubnetsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Filters the collection to resources with a `resource_group.id` property matching the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the zoneName.
   *
   * Filters the collection to resources with a `zone.name` property matching the exact specified name.
   *
   * @return the zoneName
   */
  public String zoneName() {
    return zoneName;
  }

  /**
   * Gets the vpcId.
   *
   * Filters the collection to resources with a `vpc.id` property matching the specified identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
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
   * Gets the routingTableId.
   *
   * Filters the collection to subnets with a `routing_table.id` property matching the specified identifier.
   *
   * @return the routingTableId
   */
  public String routingTableId() {
    return routingTableId;
  }

  /**
   * Gets the routingTableName.
   *
   * Filters the collection to subnets with a `routing_table.name` property matching the exact specified name.
   *
   * @return the routingTableName
   */
  public String routingTableName() {
    return routingTableName;
  }
}

