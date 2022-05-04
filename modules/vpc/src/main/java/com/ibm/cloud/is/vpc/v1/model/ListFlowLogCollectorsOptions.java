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
 * The listFlowLogCollectors options.
 */
public class ListFlowLogCollectorsOptions extends GenericModel {

  /**
   * Filters the collection to flow log collectors that target the specified resource type.
   */
  public interface TargetResourceType {
    /** instance. */
    String INSTANCE = "instance";
    /** network_interface. */
    String NETWORK_INTERFACE = "network_interface";
    /** subnet. */
    String SUBNET = "subnet";
    /** vpc. */
    String VPC = "vpc";
  }

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String name;
  protected String vpcId;
  protected String vpcCrn;
  protected String vpcName;
  protected String targetId;
  protected String targetResourceType;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private String vpcId;
    private String vpcCrn;
    private String vpcName;
    private String targetId;
    private String targetResourceType;

    private Builder(ListFlowLogCollectorsOptions listFlowLogCollectorsOptions) {
      this.start = listFlowLogCollectorsOptions.start;
      this.limit = listFlowLogCollectorsOptions.limit;
      this.resourceGroupId = listFlowLogCollectorsOptions.resourceGroupId;
      this.name = listFlowLogCollectorsOptions.name;
      this.vpcId = listFlowLogCollectorsOptions.vpcId;
      this.vpcCrn = listFlowLogCollectorsOptions.vpcCrn;
      this.vpcName = listFlowLogCollectorsOptions.vpcName;
      this.targetId = listFlowLogCollectorsOptions.targetId;
      this.targetResourceType = listFlowLogCollectorsOptions.targetResourceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListFlowLogCollectorsOptions.
     *
     * @return the new ListFlowLogCollectorsOptions instance
     */
    public ListFlowLogCollectorsOptions build() {
      return new ListFlowLogCollectorsOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the vpcCrn.
     *
     * @param vpcCrn the vpcCrn
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder vpcCrn(String vpcCrn) {
      this.vpcCrn = vpcCrn;
      return this;
    }

    /**
     * Set the vpcName.
     *
     * @param vpcName the vpcName
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder vpcName(String vpcName) {
      this.vpcName = vpcName;
      return this;
    }

    /**
     * Set the targetId.
     *
     * @param targetId the targetId
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder targetId(String targetId) {
      this.targetId = targetId;
      return this;
    }

    /**
     * Set the targetResourceType.
     *
     * @param targetResourceType the targetResourceType
     * @return the ListFlowLogCollectorsOptions builder
     */
    public Builder targetResourceType(String targetResourceType) {
      this.targetResourceType = targetResourceType;
      return this;
    }
  }

  protected ListFlowLogCollectorsOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    vpcId = builder.vpcId;
    vpcCrn = builder.vpcCrn;
    vpcName = builder.vpcName;
    targetId = builder.targetId;
    targetResourceType = builder.targetResourceType;
  }

  /**
   * New builder.
   *
   * @return a ListFlowLogCollectorsOptions builder
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
   * Filters the collection to resources in the resource group with the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
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
   * Gets the vpcId.
   *
   * Filters the collection to resources in the VPC with the specified identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the vpcCrn.
   *
   * Filters the collection to resources in the VPC with the specified CRN.
   *
   * @return the vpcCrn
   */
  public String vpcCrn() {
    return vpcCrn;
  }

  /**
   * Gets the vpcName.
   *
   * Filters the collection to resources in the VPC with the exact specified name.
   *
   * @return the vpcName
   */
  public String vpcName() {
    return vpcName;
  }

  /**
   * Gets the targetId.
   *
   * Filters the collection to flow log collectors that target the specified resource.
   *
   * @return the targetId
   */
  public String targetId() {
    return targetId;
  }

  /**
   * Gets the targetResourceType.
   *
   * Filters the collection to flow log collectors that target the specified resource type.
   *
   * @return the targetResourceType
   */
  public String targetResourceType() {
    return targetResourceType;
  }
}

