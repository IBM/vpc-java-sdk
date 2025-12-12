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
 * Instance.
 */
public class Instance extends GenericModel {

  /**
   * The confidential compute mode for this virtual server instance.
   */
  public interface ConfidentialComputeMode {
    /** disabled. */
    String DISABLED = "disabled";
    /** sgx. */
    String SGX = "sgx";
    /** tdx. */
    String TDX = "tdx";
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
   * The lifecycle state of the virtual server instance.
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
    /** instance. */
    String INSTANCE = "instance";
  }

  /**
   * The status of the virtual server instance.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** restarting. */
    String RESTARTING = "restarting";
    /** running. */
    String RUNNING = "running";
    /** starting. */
    String STARTING = "starting";
    /** stopped. */
    String STOPPED = "stopped";
    /** stopping. */
    String STOPPING = "stopping";
  }

  /**
   * The volume bandwidth QoS mode for this virtual server instance.
   */
  public interface VolumeBandwidthQosMode {
    /** pooled. */
    String POOLED = "pooled";
    /** weighted. */
    String WEIGHTED = "weighted";
  }

  @SerializedName("availability_policy")
  protected InstanceAvailabilityPolicy availabilityPolicy;
  protected Long bandwidth;
  @SerializedName("boot_volume_attachment")
  protected VolumeAttachmentReferenceInstanceContext bootVolumeAttachment;
  @SerializedName("catalog_offering")
  protected InstanceCatalogOffering catalogOffering;
  @SerializedName("cluster_network")
  protected ClusterNetworkReference clusterNetwork;
  @SerializedName("cluster_network_attachments")
  protected List<InstanceClusterNetworkAttachmentReference> clusterNetworkAttachments;
  @SerializedName("confidential_compute_mode")
  protected String confidentialComputeMode;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("dedicated_host")
  protected DedicatedHostReference dedicatedHost;
  protected List<InstanceDisk> disks;
  @SerializedName("enable_secure_boot")
  protected Boolean enableSecureBoot;
  protected InstanceGPU gpu;
  @SerializedName("health_reasons")
  protected List<InstanceHealthReason> healthReasons;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  protected ImageReference image;
  @SerializedName("lifecycle_reasons")
  protected List<InstanceLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected Long memory;
  @SerializedName("metadata_service")
  protected InstanceMetadataService metadataService;
  protected String name;
  @SerializedName("network_attachments")
  protected List<InstanceNetworkAttachmentReference> networkAttachments;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfaceInstanceContextReference> networkInterfaces;
  @SerializedName("numa_count")
  protected Long numaCount;
  @SerializedName("placement_target")
  protected InstancePlacementTarget placementTarget;
  @SerializedName("primary_network_attachment")
  protected InstanceNetworkAttachmentReference primaryNetworkAttachment;
  @SerializedName("primary_network_interface")
  protected NetworkInterfaceInstanceContextReference primaryNetworkInterface;
  protected InstanceProfileReference profile;
  protected ReservationReference reservation;
  @SerializedName("reservation_affinity")
  protected InstanceReservationAffinity reservationAffinity;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected Boolean startable;
  protected String status;
  @SerializedName("status_reasons")
  protected List<InstanceStatusReason> statusReasons;
  @SerializedName("total_network_bandwidth")
  protected Long totalNetworkBandwidth;
  @SerializedName("total_volume_bandwidth")
  protected Long totalVolumeBandwidth;
  protected InstanceVCPU vcpu;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentReferenceInstanceContext> volumeAttachments;
  @SerializedName("volume_bandwidth_qos_mode")
  protected String volumeBandwidthQosMode;
  protected VPCReference vpc;
  protected ZoneReference zone;

  protected Instance() { }

  /**
   * Gets the availabilityPolicy.
   *
   * The availability policy for this virtual server instance.
   *
   * @return the availabilityPolicy
   */
  public InstanceAvailabilityPolicy getAvailabilityPolicy() {
    return availabilityPolicy;
  }

  /**
   * Gets the bandwidth.
   *
   * The total bandwidth (in megabits per second) shared across the instance network attachments or instance network
   * interfaces and storage volumes of the virtual server instance.
   *
   * @return the bandwidth
   */
  public Long getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the bootVolumeAttachment.
   *
   * The boot volume attachment for this virtual server instance.
   *
   * @return the bootVolumeAttachment
   */
  public VolumeAttachmentReferenceInstanceContext getBootVolumeAttachment() {
    return bootVolumeAttachment;
  }

  /**
   * Gets the catalogOffering.
   *
   * If present, this virtual server instance was provisioned from a
   * [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user).
   *
   * @return the catalogOffering
   */
  public InstanceCatalogOffering getCatalogOffering() {
    return catalogOffering;
  }

  /**
   * Gets the clusterNetwork.
   *
   * If present, the cluster network that this virtual server instance resides in.
   *
   * @return the clusterNetwork
   */
  public ClusterNetworkReference getClusterNetwork() {
    return clusterNetwork;
  }

  /**
   * Gets the clusterNetworkAttachments.
   *
   * The cluster network attachments for this virtual server instance.
   *
   * The cluster network attachments are ordered for consistent instance configuration.
   *
   * @return the clusterNetworkAttachments
   */
  public List<InstanceClusterNetworkAttachmentReference> getClusterNetworkAttachments() {
    return clusterNetworkAttachments;
  }

  /**
   * Gets the confidentialComputeMode.
   *
   * The confidential compute mode for this virtual server instance.
   *
   * @return the confidentialComputeMode
   */
  public String getConfidentialComputeMode() {
    return confidentialComputeMode;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the virtual server instance was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this virtual server instance.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the dedicatedHost.
   *
   * If present, the dedicated host this virtual server instance has been placed on.
   *
   * @return the dedicatedHost
   */
  public DedicatedHostReference getDedicatedHost() {
    return dedicatedHost;
  }

  /**
   * Gets the disks.
   *
   * The instance disks for this virtual server instance.
   *
   * @return the disks
   */
  public List<InstanceDisk> getDisks() {
    return disks;
  }

  /**
   * Gets the enableSecureBoot.
   *
   * Indicates whether secure boot is enabled for this virtual server instance.
   *
   * @return the enableSecureBoot
   */
  public Boolean isEnableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Gets the gpu.
   *
   * The virtual server instance GPU configuration.
   *
   * @return the gpu
   */
  public InstanceGPU getGpu() {
    return gpu;
  }

  /**
   * Gets the healthReasons.
   *
   * The reasons for the current `health_state` (if any).
   *
   * @return the healthReasons
   */
  public List<InstanceHealthReason> getHealthReasons() {
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
   * The URL for this virtual server instance.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this virtual server instance.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the image.
   *
   * The image the virtual server instance was provisioned from.
   *
   * @return the image
   */
  public ImageReference getImage() {
    return image;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The reasons for the current `lifecycle_state` (if any).
   *
   * @return the lifecycleReasons
   */
  public List<InstanceLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the virtual server instance.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the memory.
   *
   * The amount of memory, truncated to whole gibibytes.
   *
   * The maximum limit for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the memory
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Gets the metadataService.
   *
   * The metadata service configuration.
   *
   * @return the metadataService
   */
  public InstanceMetadataService getMetadataService() {
    return metadataService;
  }

  /**
   * Gets the name.
   *
   * The name for this virtual server instance. The name is unique across all virtual server instances in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkAttachments.
   *
   * The network attachments for this virtual server instance, including the primary network attachment.
   *
   * @return the networkAttachments
   */
  public List<InstanceNetworkAttachmentReference> getNetworkAttachments() {
    return networkAttachments;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The network interfaces for this instance, including the primary network interface.
   *
   * If this instance has network attachments, each network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfaceInstanceContextReference> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * Gets the numaCount.
   *
   * The number of NUMA nodes this virtual server instance is provisioned on.
   *
   * This property will be absent if the instance's `status` is not `running`.
   *
   * @return the numaCount
   */
  public Long getNumaCount() {
    return numaCount;
  }

  /**
   * Gets the placementTarget.
   *
   * The placement restrictions for the virtual server instance.
   *
   * @return the placementTarget
   */
  public InstancePlacementTarget getPlacementTarget() {
    return placementTarget;
  }

  /**
   * Gets the primaryNetworkAttachment.
   *
   * The primary network attachment for this virtual server instance.
   *
   * @return the primaryNetworkAttachment
   */
  public InstanceNetworkAttachmentReference getPrimaryNetworkAttachment() {
    return primaryNetworkAttachment;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * The primary network interface for this virtual server instance.
   *
   * If this instance has network attachments, this primary network interface is a
   * [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients)
   * of the primary network attachment and its attached virtual network interface.
   *
   * @return the primaryNetworkInterface
   */
  public NetworkInterfaceInstanceContextReference getPrimaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) for this virtual
   * server instance.
   *
   * @return the profile
   */
  public InstanceProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the reservation.
   *
   * The reservation used by this virtual server instance.
   *
   * If absent, no reservation is in use.
   *
   * @return the reservation
   */
  public ReservationReference getReservation() {
    return reservation;
  }

  /**
   * Gets the reservationAffinity.
   *
   * @return the reservationAffinity
   */
  public InstanceReservationAffinity getReservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this instance.
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
   * Gets the startable.
   *
   * Indicates whether the state of the virtual server instance permits a start request.
   *
   * @return the startable
   */
  public Boolean isStartable() {
    return startable;
  }

  /**
   * Gets the status.
   *
   * The status of the virtual server instance.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current status (if any).
   *
   * @return the statusReasons
   */
  public List<InstanceStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the totalNetworkBandwidth.
   *
   * The amount of bandwidth (in megabits per second) allocated exclusively to instance network attachments or instance
   * network interfaces.
   *
   * @return the totalNetworkBandwidth
   */
  public Long getTotalNetworkBandwidth() {
    return totalNetworkBandwidth;
  }

  /**
   * Gets the totalVolumeBandwidth.
   *
   * The amount of bandwidth (in megabits per second) allocated exclusively to instance storage volumes. An increase in
   * this value will result in a corresponding decrease to
   * `total_network_bandwidth`.
   *
   * @return the totalVolumeBandwidth
   */
  public Long getTotalVolumeBandwidth() {
    return totalVolumeBandwidth;
  }

  /**
   * Gets the vcpu.
   *
   * The virtual server instance VCPU configuration.
   *
   * @return the vcpu
   */
  public InstanceVCPU getVcpu() {
    return vcpu;
  }

  /**
   * Gets the volumeAttachments.
   *
   * The volume attachments for this virtual server instance, including the boot volume attachment.
   *
   * @return the volumeAttachments
   */
  public List<VolumeAttachmentReferenceInstanceContext> getVolumeAttachments() {
    return volumeAttachments;
  }

  /**
   * Gets the volumeBandwidthQosMode.
   *
   * The volume bandwidth QoS mode for this virtual server instance.
   *
   * @return the volumeBandwidthQosMode
   */
  public String getVolumeBandwidthQosMode() {
    return volumeBandwidthQosMode;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this virtual server instance resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this virtual server instance resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

