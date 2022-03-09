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
 * VPNGateway.
 *
 * Classes which extend this class:
 * - VPNGatewayRouteMode
 * - VPNGatewayPolicyMode
 */
public class VPNGateway extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** vpn_gateway. */
    String VPN_GATEWAY = "vpn_gateway";
  }

  /**
   * The status of the VPN gateway.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
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
  protected String href;
  protected String id;
  protected List<VPNGatewayMember> members;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  protected SubnetReference subnet;
  protected String mode;

  protected VPNGateway() {
  }

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
   * The user-defined name for this VPN gateway.
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
   * Gets the status.
   *
   * The status of the VPN gateway.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
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

