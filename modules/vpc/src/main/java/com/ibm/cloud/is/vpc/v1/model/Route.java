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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Route.
 */
public class Route extends GenericModel {

  /**
   * The action to perform with a packet matching the route:
   * - `delegate`: delegate to system-provided routes
   * - `delegate_vpc`: delegate to system-provided routes, ignoring Internet-bound routes
   * - `deliver`: deliver the packet to the specified `next_hop`
   * - `drop`: drop the packet
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Action {
    /** delegate. */
    String DELEGATE = "delegate";
    /** delegate_vpc. */
    String DELEGATE_VPC = "delegate_vpc";
    /** deliver. */
    String DELIVER = "deliver";
    /** drop. */
    String DROP = "drop";
  }

  /**
   * The lifecycle state of the route.
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
   * The origin of this route:
   * - `service`: route was directly created by a service
   * - `user`: route was directly created by a user
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Origin {
    /** service. */
    String SERVICE = "service";
    /** user. */
    String USER = "user";
  }

  protected String action;
  protected Boolean advertise;
  @SerializedName("created_at")
  protected Date createdAt;
  protected RouteCreator creator;
  protected String destination;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("next_hop")
  protected RouteNextHop nextHop;
  protected String origin;
  protected Long priority;
  protected ZoneReference zone;

  protected Route() { }

  /**
   * Gets the action.
   *
   * The action to perform with a packet matching the route:
   * - `delegate`: delegate to system-provided routes
   * - `delegate_vpc`: delegate to system-provided routes, ignoring Internet-bound routes
   * - `deliver`: deliver the packet to the specified `next_hop`
   * - `drop`: drop the packet
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the advertise.
   *
   * Indicates whether this route will be advertised to the ingress sources specified by the `advertise_routes_to`
   * routing table property.
   *
   * @return the advertise
   */
  public Boolean isAdvertise() {
    return advertise;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the route was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the creator.
   *
   * If present, the resource that created the route. Routes with this property present cannot
   * be directly deleted. All routes with an `origin` of `service` will have this property set,
   * and future `origin` values may also have this property set.
   *
   * @return the creator
   */
  public RouteCreator getCreator() {
    return creator;
  }

  /**
   * Gets the destination.
   *
   * The destination CIDR of the route.
   *
   * @return the destination
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Gets the href.
   *
   * The URL for this route.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this route.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the route.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this route. The name is unique across all routes in the routing table.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the nextHop.
   *
   * If `action` is `deliver`, the next hop that packets will be delivered to.  For
   * other `action` values, its `address` will be `0.0.0.0`.
   *
   * @return the nextHop
   */
  public RouteNextHop getNextHop() {
    return nextHop;
  }

  /**
   * Gets the origin.
   *
   * The origin of this route:
   * - `service`: route was directly created by a service
   * - `user`: route was directly created by a user
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Gets the priority.
   *
   * The priority of this route. Smaller values have higher priority.
   *
   * If a routing table contains multiple routes with the same `zone` and `destination`, the route with the highest
   * priority (smallest value) is selected. If two routes have the same `destination` and `priority`, traffic is
   * distributed between them.
   *
   * @return the priority
   */
  public Long getPriority() {
    return priority;
  }

  /**
   * Gets the zone.
   *
   * The zone the route applies to.
   *
   * If subnets are attached to the route's routing table, egress traffic from those
   * subnets in this zone will be subject to this route. If this route's routing table
   * has any of `route_direct_link_ingress`, `route_internet_ingress`,
   * `route_transit_gateway_ingress` or `route_vpc_zone_ingress`  set to`true`, traffic
   * from those ingress sources arriving in this zone will be subject to this route.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

