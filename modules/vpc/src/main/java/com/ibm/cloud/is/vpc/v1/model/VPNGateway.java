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
 * VPNGateway.
 *
 * Classes which extend this class:
 * - VPNGatewayRouteMode
 * - VPNGatewayPolicyMode
 */
public class VPNGateway extends GenericModel {

  /**
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
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
   * The lifecycle state of the VPN gateway.
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
    /** vpn_gateway. */
    String VPN_GATEWAY = "vpn_gateway";
  }

  /**
   * Route mode VPN gateway.
   */
  public interface Mode {
    /** route. */
    String ROUTE = "route";
  }

  protected List<VPNGatewayConnectionReference> connections;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("health_reasons")
  protected List<VPNGatewayHealthReason> healthReasons;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<VPNGatewayLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected List<VPNGatewayMember> members;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected SubnetReference subnet;
  protected VPCReference vpc;
  protected String mode;

  protected VPNGateway() { }

  /**
   * Gets the connections.
   *
   * Connections for this VPN gateway.
   *
   * @return the connections
   */
  public List<VPNGatewayConnectionReference> getConnections() {
    return connections;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this VPN gateway was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The VPN gateway's CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the healthReasons.
   *
   * The reasons for the current VPN gateway health_state (if any):
   * - `cannot_create_vpc_route`: VPN cannot create route (check for conflict)
   * - `cannot_reserve_ip_address`: IP address exhaustion (release addresses on the VPN's
   *   subnet)
   * - `internal_error`: Internal error (contact IBM support)
   *
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the healthReasons
   */
  public List<VPNGatewayHealthReason> getHealthReasons() {
    return healthReasons;
  }

  /**
   * Gets the healthState.
   *
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the href.
   *
   * The VPN gateway's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPN gateway.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The reasons for the current VPN gateway lifecycle_state (if any):
   * - `resource_suspended_by_provider`: The resource has been suspended (contact IBM
   *   support)
   *
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the lifecycleReasons
   */
  public List<VPNGatewayLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the VPN gateway.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the members.
   *
   * Collection of VPN gateway members.
   *
   * @return the members
   */
  public List<VPNGatewayMember> getMembers() {
    return members;
  }

  /**
   * Gets the name.
   *
   * The name for this VPN gateway. The name is unique across all VPN gateways in the VPC.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this VPN gateway.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
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
   * Gets the subnet.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this VPN gateway resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the mode.
   *
   * Route mode VPN gateway.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }
}

