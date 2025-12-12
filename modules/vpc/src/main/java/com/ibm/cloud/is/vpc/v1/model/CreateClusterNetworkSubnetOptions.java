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
 * The createClusterNetworkSubnet options.
 */
public class CreateClusterNetworkSubnetOptions extends GenericModel {

  protected String clusterNetworkId;
  protected ClusterNetworkSubnetPrototype clusterNetworkSubnetPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private ClusterNetworkSubnetPrototype clusterNetworkSubnetPrototype;

    /**
     * Instantiates a new Builder from an existing CreateClusterNetworkSubnetOptions instance.
     *
     * @param createClusterNetworkSubnetOptions the instance to initialize the Builder with
     */
    private Builder(CreateClusterNetworkSubnetOptions createClusterNetworkSubnetOptions) {
      this.clusterNetworkId = createClusterNetworkSubnetOptions.clusterNetworkId;
      this.clusterNetworkSubnetPrototype = createClusterNetworkSubnetOptions.clusterNetworkSubnetPrototype;
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
     * @param clusterNetworkSubnetPrototype the clusterNetworkSubnetPrototype
     */
    public Builder(String clusterNetworkId, ClusterNetworkSubnetPrototype clusterNetworkSubnetPrototype) {
      this.clusterNetworkId = clusterNetworkId;
      this.clusterNetworkSubnetPrototype = clusterNetworkSubnetPrototype;
    }

    /**
     * Builds a CreateClusterNetworkSubnetOptions.
     *
     * @return the new CreateClusterNetworkSubnetOptions instance
     */
    public CreateClusterNetworkSubnetOptions build() {
      return new CreateClusterNetworkSubnetOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the CreateClusterNetworkSubnetOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the clusterNetworkSubnetPrototype.
     *
     * @param clusterNetworkSubnetPrototype the clusterNetworkSubnetPrototype
     * @return the CreateClusterNetworkSubnetOptions builder
     */
    public Builder clusterNetworkSubnetPrototype(ClusterNetworkSubnetPrototype clusterNetworkSubnetPrototype) {
      this.clusterNetworkSubnetPrototype = clusterNetworkSubnetPrototype;
      return this;
    }
  }

  protected CreateClusterNetworkSubnetOptions() { }

  protected CreateClusterNetworkSubnetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterNetworkSubnetPrototype,
      "clusterNetworkSubnetPrototype cannot be null");
    clusterNetworkId = builder.clusterNetworkId;
    clusterNetworkSubnetPrototype = builder.clusterNetworkSubnetPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateClusterNetworkSubnetOptions builder
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
   * Gets the clusterNetworkSubnetPrototype.
   *
   * The cluster network subnet prototype object.
   *
   * @return the clusterNetworkSubnetPrototype
   */
  public ClusterNetworkSubnetPrototype clusterNetworkSubnetPrototype() {
    return clusterNetworkSubnetPrototype;
  }
}

