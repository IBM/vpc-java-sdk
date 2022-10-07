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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RoutingTable.
 */
public class RoutingTable extends GenericModel {

  /**
   * The lifecycle state of the routing table.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** routing_table. */
    String ROUTING_TABLE = "routing_table";
  }

  @SerializedName("accept_routes_from")
  protected List<ResourceFilter> acceptRoutesFrom;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("is_default")
  protected Boolean isDefault;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("route_direct_link_ingress")
  protected Boolean routeDirectLinkIngress;
  @SerializedName("route_transit_gateway_ingress")
  protected Boolean routeTransitGatewayIngress;
  @SerializedName("route_vpc_zone_ingress")
  protected Boolean routeVpcZoneIngress;
  protected List<RouteReference> routes;
  protected List<SubnetReference> subnets;

  protected RoutingTable() { }

  /**
   * Gets the acceptRoutesFrom.
   *
   * The filters specifying the resources that may create routes in this routing table.
   *
   * At present, only the `resource_type` filter is permitted, and only the `vpn_server` value is supported, but filter
   * support is expected to expand in the future.
   *
   * @return the acceptRoutesFrom
   */
  public List<ResourceFilter> getAcceptRoutesFrom() {
    return acceptRoutesFrom;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this routing table was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this routing table.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this routing table.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the isDefault.
   *
   * Indicates whether this is the default routing table for this VPC.
   *
   * @return the isDefault
   */
  public Boolean isIsDefault() {
    return isDefault;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the routing table.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this routing table.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the routeDirectLinkIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from
   * [Direct Link](https://cloud.ibm.com/docs/dl/) to this VPC.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * @return the routeDirectLinkIngress
   */
  public Boolean isRouteDirectLinkIngress() {
    return routeDirectLinkIngress;
  }

  /**
   * Gets the routeTransitGatewayIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from from [Transit
   * Gateway](https://cloud.ibm.com/cloud/transit-gateway/) to this VPC.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * @return the routeTransitGatewayIngress
   */
  public Boolean isRouteTransitGatewayIngress() {
    return routeTransitGatewayIngress;
  }

  /**
   * Gets the routeVpcZoneIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from subnets in other zones in this
   * VPC.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * @return the routeVpcZoneIngress
   */
  public Boolean isRouteVpcZoneIngress() {
    return routeVpcZoneIngress;
  }

  /**
   * Gets the routes.
   *
   * The routes for this routing table.
   *
   * @return the routes
   */
  public List<RouteReference> getRoutes() {
    return routes;
  }

  /**
   * Gets the subnets.
   *
   * The subnets to which this routing table is attached.
   *
   * @return the subnets
   */
  public List<SubnetReference> getSubnets() {
    return subnets;
  }
}

