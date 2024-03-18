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
 * VirtualNetworkInterface.
 */
public class VirtualNetworkInterface extends GenericModel {

  /**
   * The lifecycle state of the virtual network interface.
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
    /** virtual_network_interface. */
    String VIRTUAL_NETWORK_INTERFACE = "virtual_network_interface";
  }

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("enable_infrastructure_nat")
  protected Boolean enableInfrastructureNat;
  protected String href;
  protected String id;
  protected List<ReservedIPReference> ips;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("mac_address")
  protected String macAddress;
  protected String name;
  @SerializedName("primary_ip")
  protected ReservedIPReference primaryIp;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("security_groups")
  protected List<SecurityGroupReference> securityGroups;
  protected SubnetReference subnet;
  protected VirtualNetworkInterfaceTarget target;
  protected VPCReference vpc;
  protected ZoneReference zone;

  protected VirtualNetworkInterface() { }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this interface. If `false`, source IP spoofing is prevented on
   * this interface. If `true`, source IP spoofing is allowed on this interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean isAllowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this virtual network interface will be automatically deleted when
   * `target` is deleted.
   *
   * @return the autoDelete
   */
  public Boolean isAutoDelete() {
    return autoDelete;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the virtual network interface was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this virtual network interface.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the enableInfrastructureNat.
   *
   * If `true`:
   * - The VPC infrastructure performs any needed NAT operations.
   * - `floating_ips` must not have more than one floating IP.
   *
   * If `false`:
   * - Packets are passed unchanged to/from the virtual network interface,
   *   allowing the workload to perform any needed NAT operations.
   * - `allow_ip_spoofing` must be `false`.
   * - Can only be attached to a `target` with a `resource_type` of
   *   `bare_metal_server_network_attachment`.
   *
   * @return the enableInfrastructureNat
   */
  public Boolean isEnableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the href.
   *
   * The URL for this virtual network interface.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this virtual network interface.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ips.
   *
   * The reserved IPs bound to this virtual network interface.
   *
   * May be empty when `lifecycle_state` is `pending`.
   *
   * @return the ips
   */
  public List<ReservedIPReference> getIps() {
    return ips;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the virtual network interface.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the macAddress.
   *
   * The MAC address of the virtual network interface. May be absent if `lifecycle_state` is `pending`.
   *
   * @return the macAddress
   */
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * Gets the name.
   *
   * The name for this virtual network interface. The name is unique across all virtual network interfaces in the VPC.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The reserved IP for this virtual network interface.
   *
   * @return the primaryIp
   */
  public ReservedIPReference getPrimaryIp() {
    return primaryIp;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this virtual network interface.
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
   * Gets the securityGroups.
   *
   * The security groups for this virtual network interface.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the subnet.
   *
   * The associated subnet.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the target.
   *
   * The target of this virtual network interface.
   *
   * If absent, this virtual network interface is not attached to a target.
   *
   * @return the target
   */
  public VirtualNetworkInterfaceTarget getTarget() {
    return target;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this virtual network interface resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this virtual network interface resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

