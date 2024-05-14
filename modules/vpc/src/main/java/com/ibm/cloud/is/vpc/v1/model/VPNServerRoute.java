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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNServerRoute.
 */
public class VPNServerRoute extends GenericModel {

  /**
   * The action to perform with a packet matching the VPN route:
   * - `translate`: translate the source IP address to one of the private IP addresses of
   *   the VPN server, then deliver the packet to target.
   * - `deliver`: deliver the packet into the VPC.
   * - `drop`: drop the packet
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Action {
    /** deliver. */
    String DELIVER = "deliver";
    /** drop. */
    String DROP = "drop";
    /** translate. */
    String TRANSLATE = "translate";
  }

  /**
   * The health of this resource:
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle
   *    state. A resource with a lifecycle state of `failed` or `deleting` will have a
   *    health state of `inapplicable`. A `pending` resource may also have this state.
   */
  public interface HealthState {
    /** degraded. */
    String DEGRADED = "degraded";
    /** faulted. */
    String FAULTED = "faulted";
    /** inapplicable. */
    String INAPPLICABLE = "inapplicable";
    /** ok. */
    String OK = "ok";
  }

  /**
   * The lifecycle state of the VPN route.
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
    /** vpn_server_route. */
    String VPN_SERVER_ROUTE = "vpn_server_route";
  }

  protected String action;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String destination;
  @SerializedName("health_reasons")
  protected List<VPNServerRouteHealthReason> healthReasons;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<VPNServerRouteLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected VPNServerRoute() { }

  /**
   * Gets the action.
   *
   * The action to perform with a packet matching the VPN route:
   * - `translate`: translate the source IP address to one of the private IP addresses of
   *   the VPN server, then deliver the packet to target.
   * - `deliver`: deliver the packet into the VPC.
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
   * Gets the createdAt.
   *
   * The date and time that the VPN route was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the destination.
   *
   * The destination for this VPN route in the VPN server. If an incoming packet does not match any destination, it will
   * be dropped.
   *
   * @return the destination
   */
  public String getDestination() {
    return destination;
  }

  /**
   * Gets the healthReasons.
   *
   * The reasons for the current `health_state` (if any).
   *
   * @return the healthReasons
   */
  public List<VPNServerRouteHealthReason> getHealthReasons() {
    return healthReasons;
  }

  /**
   * Gets the healthState.
   *
   * The health of this resource:
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle
   *    state. A resource with a lifecycle state of `failed` or `deleting` will have a
   *    health state of `inapplicable`. A `pending` resource may also have this state.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the href.
   *
   * The URL for this VPN route.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPN route.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The reasons for the current `lifecycle_state` (if any).
   *
   * @return the lifecycleReasons
   */
  public List<VPNServerRouteLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the VPN route.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this VPN route. The name is unique across all routes for a VPN server.
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
}

