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
 * BareMetalServer.
 */
public class BareMetalServer extends GenericModel {

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
   * The lifecycle state of the bare metal server.
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
    /** bare_metal_server. */
    String BARE_METAL_SERVER = "bare_metal_server";
  }

  /**
   * The status of this bare metal server:
   * - `deleting`: server is undergoing deletion
   * - `failed`: server is failed and not usable (see `status_reasons`)
   * - `maintenance`: server is undergoing maintenance (not usable)
   * - `pending`: server is being provisioned and not yet usable
   * - `reinitializing`: server is reinitializing and not yet usable
   * - `restarting`: server is restarting and not yet usable
   * - `running`: server is powered on
   * - `starting`: server is starting and not yet usable
   * - `stopped`: server is powered off
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** maintenance. */
    String MAINTENANCE = "maintenance";
    /** pending. */
    String PENDING = "pending";
    /** reinitializing. */
    String REINITIALIZING = "reinitializing";
    /** restarting. */
    String RESTARTING = "restarting";
    /** running. */
    String RUNNING = "running";
    /** starting. */
    String STARTING = "starting";
    /** stopped. */
    String STOPPED = "stopped";
  }

  protected Long bandwidth;
  @SerializedName("boot_target")
  protected BareMetalServerBootTarget bootTarget;
  protected BareMetalServerCPU cpu;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected List<BareMetalServerDisk> disks;
  @SerializedName("enable_secure_boot")
  protected Boolean enableSecureBoot;
  protected BareMetalServerFirmware firmware;
  @SerializedName("health_reasons")
  protected List<BareMetalServerHealthReason> healthReasons;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<BareMetalServerLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected Long memory;
  @SerializedName("metadata_service")
  protected BareMetalServerMetadataService metadataService;
  protected String name;
  @SerializedName("network_attachments")
  protected List<BareMetalServerNetworkAttachmentReference> networkAttachments;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfaceBareMetalServerContextReference> networkInterfaces;
  @SerializedName("primary_network_attachment")
  protected BareMetalServerNetworkAttachmentReference primaryNetworkAttachment;
  @SerializedName("primary_network_interface")
  protected NetworkInterfaceBareMetalServerContextReference primaryNetworkInterface;
  protected BareMetalServerProfileReference profile;
  protected ReservationReference reservation;
  @SerializedName("reservation_affinity")
  protected BareMetalServerReservationAffinity reservationAffinity;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("status_reasons")
  protected List<BareMetalServerStatusReason> statusReasons;
  @SerializedName("trusted_platform_module")
  protected BareMetalServerTrustedPlatformModule trustedPlatformModule;
  protected VPCReference vpc;
  protected ZoneReference zone;

  protected BareMetalServer() { }

  /**
   * Gets the bandwidth.
   *
   * The total bandwidth (in megabits per second) shared across the bare metal server network attachments or bare metal
   * server network interfaces.
   *
   * @return the bandwidth
   */
  public Long getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the bootTarget.
   *
   * The resource from which this bare metal server is booted.
   *
   * The resources supported by this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the bootTarget
   */
  public BareMetalServerBootTarget getBootTarget() {
    return bootTarget;
  }

  /**
   * Gets the cpu.
   *
   * The bare metal server CPU configuration.
   *
   * @return the cpu
   */
  public BareMetalServerCPU getCpu() {
    return cpu;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the bare metal server was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this bare metal server.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the disks.
   *
   * The disks for this bare metal server, including any disks that are associated with the
   * `boot_target`.
   *
   * @return the disks
   */
  public List<BareMetalServerDisk> getDisks() {
    return disks;
  }

  /**
   * Gets the enableSecureBoot.
   *
   * Indicates whether secure boot is enabled. If enabled, the image must support secure boot or the server will fail to
   * boot.
   *
   * @return the enableSecureBoot
   */
  public Boolean isEnableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Gets the firmware.
   *
   * Firmware information for the bare metal server.
   *
   * @return the firmware
   */
  public BareMetalServerFirmware getFirmware() {
    return firmware;
  }

  /**
   * Gets the healthReasons.
   *
   * The reasons for the current server `health_state` (if any):
   * - `reservation_capacity_unavailable`: The reservation affinity pool has no
   *   available capacity.
   * - `reservation_deleted`: The reservation affinity pool has a deleted reservation.
   * - `reservation_expired`: The reservation affinity pool has an expired reservation.
   * - `reservation_failed`: The reservation affinity pool has a failed reservation.
   *
   * See [health status reasons](https://cloud.ibm.com/docs/vpc?topic=vpc-server-health-status-reasons) for details. The
   * enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the healthReasons
   */
  public List<BareMetalServerHealthReason> getHealthReasons() {
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
   * The URL for this bare metal server.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this bare metal server.
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
  public List<BareMetalServerLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the bare metal server.
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
   * @return the memory
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Gets the metadataService.
   *
   * The metadata service configuration for the bare metal server.
   *
   * @return the metadataService
   */
  public BareMetalServerMetadataService getMetadataService() {
    return metadataService;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server. The name is unique across all bare metal servers in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkAttachments.
   *
   * The network attachments for this bare metal server, including the primary network attachment.
   *
   * @return the networkAttachments
   */
  public List<BareMetalServerNetworkAttachmentReference> getNetworkAttachments() {
    return networkAttachments;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The network interfaces for this bare metal server, including the primary network interface.
   *
   * If this bare metal server has network attachments, each network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfaceBareMetalServerContextReference> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * Gets the primaryNetworkAttachment.
   *
   * The primary network attachment for this bare metal server.
   *
   * @return the primaryNetworkAttachment
   */
  public BareMetalServerNetworkAttachmentReference getPrimaryNetworkAttachment() {
    return primaryNetworkAttachment;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * The primary network interface for this bare metal server.
   *
   * If this bare metal server has network attachments, this primary network interface is
   * a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients)
   * of the primary network attachment and its attached virtual network interface.
   *
   * @return the primaryNetworkInterface
   */
  public NetworkInterfaceBareMetalServerContextReference getPrimaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile)
   * for this bare metal server.
   *
   * @return the profile
   */
  public BareMetalServerProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the reservation.
   *
   * The reservation used by this bare metal server.
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
  public BareMetalServerReservationAffinity getReservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this bare metal server.
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
   * The status of this bare metal server:
   * - `deleting`: server is undergoing deletion
   * - `failed`: server is failed and not usable (see `status_reasons`)
   * - `maintenance`: server is undergoing maintenance (not usable)
   * - `pending`: server is being provisioned and not yet usable
   * - `reinitializing`: server is reinitializing and not yet usable
   * - `restarting`: server is restarting and not yet usable
   * - `running`: server is powered on
   * - `starting`: server is starting and not yet usable
   * - `stopped`: server is powered off
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
  public List<BareMetalServerStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the trustedPlatformModule.
   *
   * @return the trustedPlatformModule
   */
  public BareMetalServerTrustedPlatformModule getTrustedPlatformModule() {
    return trustedPlatformModule;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this bare metal server resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this bare metal server resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

