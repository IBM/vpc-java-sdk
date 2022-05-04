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
 * Instance.
 */
public class Instance extends GenericModel {

  /**
   * The status of the virtual server instance.
   */
  public interface Status {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** paused. */
    String PAUSED = "paused";
    /** pausing. */
    String PAUSING = "pausing";
    /** pending. */
    String PENDING = "pending";
    /** restarting. */
    String RESTARTING = "restarting";
    /** resuming. */
    String RESUMING = "resuming";
    /** running. */
    String RUNNING = "running";
    /** starting. */
    String STARTING = "starting";
    /** stopped. */
    String STOPPED = "stopped";
    /** stopping. */
    String STOPPING = "stopping";
  }

  @SerializedName("availability_policy")
  protected InstanceAvailabilityPolicy availabilityPolicy;
  protected Long bandwidth;
  @SerializedName("boot_volume_attachment")
  protected VolumeAttachmentReferenceInstanceContext bootVolumeAttachment;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("dedicated_host")
  protected DedicatedHostReference dedicatedHost;
  protected List<InstanceDisk> disks;
  protected InstanceGPU gpu;
  protected String href;
  protected String id;
  protected ImageReference image;
  protected Long memory;
  @SerializedName("metadata_service")
  protected InstanceMetadataService metadataService;
  protected String name;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfaceInstanceContextReference> networkInterfaces;
  @SerializedName("placement_target")
  protected InstancePlacementTarget placementTarget;
  @SerializedName("primary_network_interface")
  protected NetworkInterfaceInstanceContextReference primaryNetworkInterface;
  protected InstanceProfileReference profile;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
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
  protected VPCReference vpc;
  protected ZoneReference zone;

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
   * The total bandwidth (in megabits per second) shared across the virtual server instance's network interfaces and
   * storage volumes.
   *
   * @return the bandwidth
   */
  public Long getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the bootVolumeAttachment.
   *
   * Boot volume attachment.
   *
   * @return the bootVolumeAttachment
   */
  public VolumeAttachmentReferenceInstanceContext getBootVolumeAttachment() {
    return bootVolumeAttachment;
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
   * The user-defined name for this virtual server instance (and default system hostname).
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The network interfaces for this virtual server instance, including the primary network interface.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfaceInstanceContextReference> getNetworkInterfaces() {
    return networkInterfaces;
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
   * Gets the primaryNetworkInterface.
   *
   * Primary network interface.
   *
   * @return the primaryNetworkInterface
   */
  public NetworkInterfaceInstanceContextReference getPrimaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the profile.
   *
   * The profile for this virtual server instance.
   *
   * @return the profile
   */
  public InstanceProfileReference getProfile() {
    return profile;
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
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the statusReasons
   */
  public List<InstanceStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the totalNetworkBandwidth.
   *
   * The amount of bandwidth (in megabits per second) allocated exclusively to instance network interfaces.
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

