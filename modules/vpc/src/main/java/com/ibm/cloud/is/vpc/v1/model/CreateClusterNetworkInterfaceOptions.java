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
 * The createClusterNetworkInterface options.
 */
public class CreateClusterNetworkInterfaceOptions extends GenericModel {

  protected String clusterNetworkId;
  protected String name;
  protected ClusterNetworkInterfacePrimaryIPPrototype primaryIp;
  protected ClusterNetworkSubnetIdentity subnet;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterNetworkId;
    private String name;
    private ClusterNetworkInterfacePrimaryIPPrototype primaryIp;
    private ClusterNetworkSubnetIdentity subnet;

    /**
     * Instantiates a new Builder from an existing CreateClusterNetworkInterfaceOptions instance.
     *
     * @param createClusterNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(CreateClusterNetworkInterfaceOptions createClusterNetworkInterfaceOptions) {
      this.clusterNetworkId = createClusterNetworkInterfaceOptions.clusterNetworkId;
      this.name = createClusterNetworkInterfaceOptions.name;
      this.primaryIp = createClusterNetworkInterfaceOptions.primaryIp;
      this.subnet = createClusterNetworkInterfaceOptions.subnet;
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
     */
    public Builder(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
    }

    /**
     * Builds a CreateClusterNetworkInterfaceOptions.
     *
     * @return the new CreateClusterNetworkInterfaceOptions instance
     */
    public CreateClusterNetworkInterfaceOptions build() {
      return new CreateClusterNetworkInterfaceOptions(this);
    }

    /**
     * Set the clusterNetworkId.
     *
     * @param clusterNetworkId the clusterNetworkId
     * @return the CreateClusterNetworkInterfaceOptions builder
     */
    public Builder clusterNetworkId(String clusterNetworkId) {
      this.clusterNetworkId = clusterNetworkId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateClusterNetworkInterfaceOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIp.
     *
     * @param primaryIp the primaryIp
     * @return the CreateClusterNetworkInterfaceOptions builder
     */
    public Builder primaryIp(ClusterNetworkInterfacePrimaryIPPrototype primaryIp) {
      this.primaryIp = primaryIp;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the CreateClusterNetworkInterfaceOptions builder
     */
    public Builder subnet(ClusterNetworkSubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }
  }

  protected CreateClusterNetworkInterfaceOptions() { }

  protected CreateClusterNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.clusterNetworkId,
      "clusterNetworkId cannot be empty");
    clusterNetworkId = builder.clusterNetworkId;
    name = builder.name;
    primaryIp = builder.primaryIp;
    subnet = builder.subnet;
  }

  /**
   * New builder.
   *
   * @return a CreateClusterNetworkInterfaceOptions builder
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
   * Gets the name.
   *
   * The name for this cluster network interface. The name must not be used by another interface in the cluster network.
   * Names beginning with `ibm-` are reserved for provider-owned resources, and are not allowed. If unspecified, the
   * name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address to bind to the cluster network interface. May be either
   * a cluster network subnet reserved IP identity, or a cluster network subnet reserved IP
   * prototype object which will be used to create a new cluster network subnet reserved IP.
   *
   * If a cluster network subnet reserved IP identity is provided, the specified cluster
   * network subnet reserved IP must be unbound.
   *
   * If a cluster network subnet reserved IP prototype object with an address is provided,
   * the address must be available on the cluster network interface's cluster network
   * subnet. If no address is specified, an available address on the cluster network subnet
   * will be automatically selected and reserved.
   *
   * @return the primaryIp
   */
  public ClusterNetworkInterfacePrimaryIPPrototype primaryIp() {
    return primaryIp;
  }

  /**
   * Gets the subnet.
   *
   * The associated cluster network subnet. Required if `primary_ip` does not specify a cluster
   * network subnet reserved IP identity.
   *
   * @return the subnet
   */
  public ClusterNetworkSubnetIdentity subnet() {
    return subnet;
  }
}

