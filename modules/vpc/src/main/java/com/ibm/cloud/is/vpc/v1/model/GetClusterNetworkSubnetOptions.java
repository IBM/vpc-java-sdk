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
 * The getClusterNetworkSubnet options.
 */
public class GetClusterNetworkSubnetOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetClusterNetworkSubnetOptions instance.
     *
     * @param getClusterNetworkSubnetOptions the instance to initialize the Builder with
     */
    private Builder(GetClusterNetworkSubnetOptions getClusterNetworkSubnetOptions) {
      this.clusterNetworkId = getClusterNetworkSubnetOptions.clusterNetworkId;
      this.id = getClusterNetworkSubnetOptions.id;
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
     * @param id the id
     */
    public Builder(String clusterNetworkId, String id) {
      this.clusterNetworkId = clusterNetworkId;
      this.id = id;
    }

    /**
     * Builds a GetClusterNetworkSubnetOptions.
     *
     * @return the new GetClusterNetworkSubnetOptions instance
     */
    public GetClusterNetworkSubnetOptions build() {
      return new GetClusterNetworkSubnetOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the GetClusterNetworkSubnetOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetClusterNetworkSubnetOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetClusterNetworkSubnetOptions() { }

  protected GetClusterNetworkSubnetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetClusterNetworkSubnetOptions builder
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
   * Gets the id.
   *
   * The cluster network subnet identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

