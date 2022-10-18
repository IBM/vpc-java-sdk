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
   * - `drop`: drop the packet.
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
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the route on which the
   * unexpected property value was encountered.
   */
  public interface Origin {
    /** service. */
    String SERVICE = "service";
    /** user. */
    String USER = "user";
  }

  protected String action;
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
  protected ZoneReference zone;

  protected Route() { }

  /**
   * Gets the action.
   *
   * The action to perform with a packet matching the route:
   * - `delegate`: delegate to system-provided routes
   * - `delegate_vpc`: delegate to system-provided routes, ignoring Internet-bound routes
   * - `deliver`: deliver the packet to the specified `next_hop`
   * - `drop`: drop the packet.
   *
   * @return the action
   */
  public String getAction() {
    return action;
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
   * The destination of the route.
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
   * The user-defined name for this route.
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
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the route on which the
   * unexpected property value was encountered.
   *
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Gets the zone.
   *
   * The zone the route applies to. (Traffic from subnets in this zone will be
   * subject to this route.).
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

