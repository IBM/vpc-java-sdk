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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * SubnetPatch.
 */
public class SubnetPatch extends GenericModel {

  protected String name;
  @SerializedName("network_acl")
  protected NetworkACLIdentity networkAcl;
  @SerializedName("public_gateway")
  protected SubnetPublicGatewayPatch publicGateway;
  @SerializedName("routing_table")
  protected RoutingTableIdentity routingTable;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private NetworkACLIdentity networkAcl;
    private SubnetPublicGatewayPatch publicGateway;
    private RoutingTableIdentity routingTable;

    /**
     * Instantiates a new Builder from an existing SubnetPatch instance.
     *
     * @param subnetPatch the instance to initialize the Builder with
     */
    private Builder(SubnetPatch subnetPatch) {
      this.name = subnetPatch.name;
      this.networkAcl = subnetPatch.networkAcl;
      this.publicGateway = subnetPatch.publicGateway;
      this.routingTable = subnetPatch.routingTable;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SubnetPatch.
     *
     * @return the new SubnetPatch instance
     */
    public SubnetPatch build() {
      return new SubnetPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SubnetPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkAcl.
     *
     * @param networkAcl the networkAcl
     * @return the SubnetPatch builder
     */
    public Builder networkAcl(NetworkACLIdentity networkAcl) {
      this.networkAcl = networkAcl;
      return this;
    }

    /**
     * Set the publicGateway.
     *
     * @param publicGateway the publicGateway
     * @return the SubnetPatch builder
     */
    public Builder publicGateway(SubnetPublicGatewayPatch publicGateway) {
      this.publicGateway = publicGateway;
      return this;
    }

    /**
     * Set the routingTable.
     *
     * @param routingTable the routingTable
     * @return the SubnetPatch builder
     */
    public Builder routingTable(RoutingTableIdentity routingTable) {
      this.routingTable = routingTable;
      return this;
    }
  }

  protected SubnetPatch() { }

  protected SubnetPatch(Builder builder) {
    name = builder.name;
    networkAcl = builder.networkAcl;
    publicGateway = builder.publicGateway;
    routingTable = builder.routingTable;
  }

  /**
   * New builder.
   *
   * @return a SubnetPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this subnet. Names must be unique within the VPC the subnet resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the networkAcl.
   *
   * The network ACL to use for this subnet.
   *
   * @return the networkAcl
   */
  public NetworkACLIdentity networkAcl() {
    return networkAcl;
  }

  /**
   * Gets the publicGateway.
   *
   * The public gateway to use for internet-bound traffic for this subnet.
   *
   * @return the publicGateway
   */
  public SubnetPublicGatewayPatch publicGateway() {
    return publicGateway;
  }

  /**
   * Gets the routingTable.
   *
   * The routing table to use for this subnet.  The routing table properties
   * `route_direct_link_ingress`, `route_transit_gateway_ingress`, and
   * `route_vpc_zone_ingress` must be `false`.
   *
   * @return the routingTable
   */
  public RoutingTableIdentity routingTable() {
    return routingTable;
  }

  /**
   * Construct a JSON merge-patch from the SubnetPatch.
   *
   * Note that properties of the SubnetPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SubnetPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

