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
 * The deleteClusterNetworkSubnetReservedIp options.
 */
public class DeleteClusterNetworkSubnetReservedIpOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String clusterNetworkSubnetId;
  protected String id;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String clusterNetworkSubnetId;
    private String id;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing DeleteClusterNetworkSubnetReservedIpOptions instance.
     *
     * @param deleteClusterNetworkSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(DeleteClusterNetworkSubnetReservedIpOptions deleteClusterNetworkSubnetReservedIpOptions) {
      this.clusterNetworkId = deleteClusterNetworkSubnetReservedIpOptions.clusterNetworkId;
      this.clusterNetworkSubnetId = deleteClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId;
      this.id = deleteClusterNetworkSubnetReservedIpOptions.id;
      this.ifMatch = deleteClusterNetworkSubnetReservedIpOptions.ifMatch;
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
     * Builds a DeleteClusterNetworkSubnetReservedIpOptions.
     *
     * @return the new DeleteClusterNetworkSubnetReservedIpOptions instance
     */
    public DeleteClusterNetworkSubnetReservedIpOptions build() {
      return new DeleteClusterNetworkSubnetReservedIpOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the DeleteClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the clusterNetworkSubnetId.
     *
     * @param clusterNetworkSubnetId the clusterNetworkSubnetId
     * @return the DeleteClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkSubnetId(String clusterNetworkSubnetId) {
      this.clusterNetworkSubnetId = clusterNetworkSubnetId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the DeleteClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected DeleteClusterNetworkSubnetReservedIpOptions() { }

  protected DeleteClusterNetworkSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkSubnetId,
      "clusterNetworkSubnetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    clusterNetworkSubnetId = builder.clusterNetworkSubnetId;
    id = builder.id;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a DeleteClusterNetworkSubnetReservedIpOptions builder
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

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

