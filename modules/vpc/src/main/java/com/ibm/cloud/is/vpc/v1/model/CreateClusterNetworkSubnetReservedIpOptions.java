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
 * The createClusterNetworkSubnetReservedIp options.
 */
public class CreateClusterNetworkSubnetReservedIpOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String clusterNetworkSubnetId;
  protected String address;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String clusterNetworkSubnetId;
    private String address;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateClusterNetworkSubnetReservedIpOptions instance.
     *
     * @param createClusterNetworkSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(CreateClusterNetworkSubnetReservedIpOptions createClusterNetworkSubnetReservedIpOptions) {
      this.clusterNetworkId = createClusterNetworkSubnetReservedIpOptions.clusterNetworkId;
      this.clusterNetworkSubnetId = createClusterNetworkSubnetReservedIpOptions.clusterNetworkSubnetId;
      this.address = createClusterNetworkSubnetReservedIpOptions.address;
      this.name = createClusterNetworkSubnetReservedIpOptions.name;
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
     */
    public Builder(String clusterNetworkId, String clusterNetworkSubnetId) {
      this.clusterNetworkId = clusterNetworkId;
      this.clusterNetworkSubnetId = clusterNetworkSubnetId;
    }

    /**
     * Builds a CreateClusterNetworkSubnetReservedIpOptions.
     *
     * @return the new CreateClusterNetworkSubnetReservedIpOptions instance
     */
    public CreateClusterNetworkSubnetReservedIpOptions build() {
      return new CreateClusterNetworkSubnetReservedIpOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the CreateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the clusterNetworkSubnetId.
     *
     * @param clusterNetworkSubnetId the clusterNetworkSubnetId
     * @return the CreateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder clusterNetworkSubnetId(String clusterNetworkSubnetId) {
      this.clusterNetworkSubnetId = clusterNetworkSubnetId;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the CreateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateClusterNetworkSubnetReservedIpOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateClusterNetworkSubnetReservedIpOptions() { }

  protected CreateClusterNetworkSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkSubnetId,
      "clusterNetworkSubnetId cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    clusterNetworkSubnetId = builder.clusterNetworkSubnetId;
    address = builder.address;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateClusterNetworkSubnetReservedIpOptions builder
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
   * Gets the address.
   *
   * The IP address to reserve, which must not already be reserved on the subnet.
   *
   * If unspecified, an available address on the subnet will automatically be selected.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network subnet reserved IP. The name must not be used by another reserved IP in the
   * cluster network subnet. Names starting with `ibm-` are reserved for provider-owned resources, and are not allowed.
   * If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

