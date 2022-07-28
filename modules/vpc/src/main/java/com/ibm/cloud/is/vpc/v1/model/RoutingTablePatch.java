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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * RoutingTablePatch.
 */
public class RoutingTablePatch extends GenericModel {

  @SerializedName("accept_routes_from")
  protected List<ResourceFilter> acceptRoutesFrom;
  protected String name;
  @SerializedName("route_direct_link_ingress")
  protected Boolean routeDirectLinkIngress;
  @SerializedName("route_transit_gateway_ingress")
  protected Boolean routeTransitGatewayIngress;
  @SerializedName("route_vpc_zone_ingress")
  protected Boolean routeVpcZoneIngress;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ResourceFilter> acceptRoutesFrom;
    private String name;
    private Boolean routeDirectLinkIngress;
    private Boolean routeTransitGatewayIngress;
    private Boolean routeVpcZoneIngress;

    private Builder(RoutingTablePatch routingTablePatch) {
      this.acceptRoutesFrom = routingTablePatch.acceptRoutesFrom;
      this.name = routingTablePatch.name;
      this.routeDirectLinkIngress = routingTablePatch.routeDirectLinkIngress;
      this.routeTransitGatewayIngress = routingTablePatch.routeTransitGatewayIngress;
      this.routeVpcZoneIngress = routingTablePatch.routeVpcZoneIngress;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RoutingTablePatch.
     *
     * @return the new RoutingTablePatch instance
     */
    public RoutingTablePatch build() {
      return new RoutingTablePatch(this);
    }

    /**
     * Adds an acceptRoutesFrom to acceptRoutesFrom.
     *
     * @param acceptRoutesFrom the new acceptRoutesFrom
     * @return the RoutingTablePatch builder
     */
    public Builder addAcceptRoutesFrom(ResourceFilter acceptRoutesFrom) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(acceptRoutesFrom,
        "acceptRoutesFrom cannot be null");
      if (this.acceptRoutesFrom == null) {
        this.acceptRoutesFrom = new ArrayList<ResourceFilter>();
      }
      this.acceptRoutesFrom.add(acceptRoutesFrom);
      return this;
    }

    /**
     * Set the acceptRoutesFrom.
     * Existing acceptRoutesFrom will be replaced.
     *
     * @param acceptRoutesFrom the acceptRoutesFrom
     * @return the RoutingTablePatch builder
     */
    public Builder acceptRoutesFrom(List<ResourceFilter> acceptRoutesFrom) {
      this.acceptRoutesFrom = acceptRoutesFrom;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RoutingTablePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the routeDirectLinkIngress.
     *
     * @param routeDirectLinkIngress the routeDirectLinkIngress
     * @return the RoutingTablePatch builder
     */
    public Builder routeDirectLinkIngress(Boolean routeDirectLinkIngress) {
      this.routeDirectLinkIngress = routeDirectLinkIngress;
      return this;
    }

    /**
     * Set the routeTransitGatewayIngress.
     *
     * @param routeTransitGatewayIngress the routeTransitGatewayIngress
     * @return the RoutingTablePatch builder
     */
    public Builder routeTransitGatewayIngress(Boolean routeTransitGatewayIngress) {
      this.routeTransitGatewayIngress = routeTransitGatewayIngress;
      return this;
    }

    /**
     * Set the routeVpcZoneIngress.
     *
     * @param routeVpcZoneIngress the routeVpcZoneIngress
     * @return the RoutingTablePatch builder
     */
    public Builder routeVpcZoneIngress(Boolean routeVpcZoneIngress) {
      this.routeVpcZoneIngress = routeVpcZoneIngress;
      return this;
    }
  }

  protected RoutingTablePatch(Builder builder) {
    acceptRoutesFrom = builder.acceptRoutesFrom;
    name = builder.name;
    routeDirectLinkIngress = builder.routeDirectLinkIngress;
    routeTransitGatewayIngress = builder.routeTransitGatewayIngress;
    routeVpcZoneIngress = builder.routeVpcZoneIngress;
  }

  /**
   * New builder.
   *
   * @return a RoutingTablePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the acceptRoutesFrom.
   *
   * The filters specifying the resources that may create routes in this routing table
   * (replacing any existing filters). All routes learned from resources that match a given filter will be removed when
   * an existing filter is removed. Therefore, if an empty array is specified, all filters will be removed, resulting in
   * all learned routes being removed.
   *
   * At present, only the `resource_type` filter is permitted, and only the `vpn_server` value is supported, but filter
   * support is expected to expand in the future.
   *
   * @return the acceptRoutesFrom
   */
  public List<ResourceFilter> acceptRoutesFrom() {
    return acceptRoutesFrom;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this routing table. Names must be unique within the VPC the routing table resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the routeDirectLinkIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from
   * [Direct Link](https://cloud.ibm.com/docs/dl/) to this VPC. Updating to `true` selects this routing table, provided
   * no other routing table in the VPC already has this property set to `true`, and no subnets are attached to this
   * routing table. Updating to `false` deselects this routing table.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * @return the routeDirectLinkIngress
   */
  public Boolean routeDirectLinkIngress() {
    return routeDirectLinkIngress;
  }

  /**
   * Gets the routeTransitGatewayIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from
   * [Transit Gateway](https://cloud.ibm.com/cloud/transit-gateway/) to this VPC. Updating to
   * `true` selects this routing table, provided no other routing table in the VPC already has this property set to
   * `true`, and no subnets are attached to this routing table. Updating to `false` deselects this routing table.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * If [Classic Access](https://cloud.ibm.com/docs/vpc?topic=vpc-setting-up-access-to-classic-infrastructure) is
   * enabled for this VPC, and this property is set to `true`, its incoming traffic will also be routed according to
   * this routing table.
   *
   * @return the routeTransitGatewayIngress
   */
  public Boolean routeTransitGatewayIngress() {
    return routeTransitGatewayIngress;
  }

  /**
   * Gets the routeVpcZoneIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from subnets in other zones in this
   * VPC. Updating to `true` selects this routing table, provided no other routing table in the VPC already has this
   * property set to `true`, and no subnets are attached to this routing table. Updating to `false` deselects this
   * routing table.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * @return the routeVpcZoneIngress
   */
  public Boolean routeVpcZoneIngress() {
    return routeVpcZoneIngress;
  }

  /**
   * Construct a JSON merge-patch from the RoutingTablePatch.
   *
   * Note that properties of the RoutingTablePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the RoutingTablePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

