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
 * The getClusterNetworkSubnetReservedIp options.
 */
public class GetClusterNetworkSubnetReservedIpOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String clusterNetworkSubnetId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String clusterNetworkSubnetId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetClusterNetworkSubnetReservedIpOptions instance.
     *
     * @param getClusterNetworkSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(GetClusterNetworkSubnetReservedIpOptions getClusterNetworkSubnetReservedIpOptions) {
      this.clusterNetworkId = getClusterNetworkSubnetReservedIpOptions.clusterNetworkId;
      this.clusterNetworkSubnetId = getClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId;
      this.id = getClusterNetworkSubnetReservedIpOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @param clusterNetworkSubnetId the clusterNetworkSubnetId
     * @param id the id
     */
    public Builder(String clusterNetworkId, String clusterNetworkSubnetId, String id) {
      this.clusterNetworkId = clusterNetworkId;
      this.clusterNetworkSubnetId = clusterNetworkSubnetId;
      this.id = id;
    }

    /**
     * Builds a GetClusterNetworkSubnetReservedIpOptions.
     *
     * @return the new GetClusterNetworkSubnetReservedIpOptions instance
     */
    public GetClusterNetworkSubnetReservedIpOptions build() {
      return new GetClusterNetworkSubnetReservedIpOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the GetClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the clusterNetworkSubnetId.
     *
     * @param clusterNetworkSubnetId the clusterNetworkSubnetId
     * @return the GetClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkSubnetId(String clusterNetworkSubnetId) {
      this.clusterNetworkSubnetId = clusterNetworkSubnetId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetClusterNetworkSubnetReservedIpOptions() { }

  protected GetClusterNetworkSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkSubnetId,
      "clusterNetworkSubnetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    clusterNetworkSubnetId = builder.clusterNetworkSubnetId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetClusterNetworkSubnetReservedIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterNetworkId.
   *
   * The cluster network identifier.
   *
   * @return the clusterNetworkId
   */
  public String clusterNetworkId() {
    return clusterNetworkId;
  }

  /**
   * Gets the clusterNetworkSubnetId.
   *
   * The cluster network subnet identifier.
   *
   * @return the clusterNetworkSubnetId
   */
  public String clusterNetworkSubnetId() {
    return clusterNetworkSubnetId;
  }

  /**
   * Gets the id.
   *
   * The cluster network subnet reserved IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

