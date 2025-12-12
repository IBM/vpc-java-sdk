/*
 * (C) Copyright IBM Corp. 2025.
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
 * The associated cluster network subnet.
 */
public class ClusterNetworkInterface extends GenericModel {

  /**
   * The lifecycle state of the cluster network interface.
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
    /** cluster_network_interface. */
    String CLUSTER_NETWORK_INTERFACE = "cluster_network_interface";
  }

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("enable_infrastructure_nat")
  protected Boolean enableInfrastructureNat;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<ClusterNetworkInterfaceLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("mac_address")
  protected String macAddress;
  protected String name;
  @SerializedName("primary_ip")
  protected ClusterNetworkSubnetReservedIPReference primaryIp;
  @SerializedName("resource_type")
  protected String resourceType;
  protected ClusterNetworkSubnetReference subnet;
  protected ClusterNetworkInterfaceTarget target;
  protected VPCReference vpc;
  protected ZoneReference zone;

  protected ClusterNetworkInterface() { }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this cluster network interface. If `false`, source IP spoofing
   * is prevented on this cluster network interface. If `true`, source IP spoofing is allowed on this cluster network
   * interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean isAllowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this cluster network interface will be automatically deleted when `target` is deleted.
   *
   * @return the autoDelete
   */
  public Boolean isAutoDelete() {
    return autoDelete;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the cluster network interface was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
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
   *
   * @return the enableInfrastructureNat
   */
  public Boolean isEnableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the href.
   *
   * The URL for this cluster network interface.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this cluster network interface.
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
  public List<ClusterNetworkInterfaceLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the cluster network interface.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the macAddress.
   *
   * The MAC address of the cluster network interface. May be absent if
   * `lifecycle_state` is `pending`.
   *
   * @return the macAddress
   */
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network interface. The name is unique across all interfaces in the cluster network.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The cluster network subnet reserved IP for this cluster network interface.
   *
   * @return the primaryIp
   */
  public ClusterNetworkSubnetReservedIPReference getPrimaryIp() {
    return primaryIp;
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
  public ClusterNetworkSubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the target.
   *
   * The target of this cluster network interface.
   *
   * If absent, this cluster network interface is not attached to a target.
   *
   * The resources supported by this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the target
   */
  public ClusterNetworkInterfaceTarget getTarget() {
    return target;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this cluster network interface resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this cluster network interface resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

