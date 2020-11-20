/*
 * (C) Copyright IBM Corp. 2020.
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

  protected Long bandwidth;
  @SerializedName("boot_volume_attachment")
  protected VolumeAttachmentReferenceInstanceContext bootVolumeAttachment;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected InstanceGPU gpu;
  protected String href;
  protected String id;
  protected ImageReference image;
  protected Long memory;
  protected String name;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfaceInstanceContextReference> networkInterfaces;
  @SerializedName("primary_network_interface")
  protected NetworkInterfaceInstanceContextReference primaryNetworkInterface;
  protected InstanceProfileReference profile;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  protected String status;
  protected InstanceVCPU vcpu;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentReferenceInstanceContext> volumeAttachments;
  protected VPCReference vpc;
  protected ZoneReference zone;

  /**
   * Gets the bandwidth.
   *
   * The total bandwidth (in megabits per second) shared across the virtual server instance's network interfaces.
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
   * The amount of memory in gigabytes.
   *
   * @return the memory
   */
  public Long getMemory() {
    return memory;
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
   * Collection of the virtual server instance's network interfaces, including the primary network interface.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfaceInstanceContextReference> getNetworkInterfaces() {
    return networkInterfaces;
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
   * The profile this virtual server instance uses.
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
   * Collection of the virtual server instance's volume attachments, including the boot volume attachment.
   *
   * @return the volumeAttachments
   */
  public List<VolumeAttachmentReferenceInstanceContext> getVolumeAttachments() {
    return volumeAttachments;
  }

  /**
   * Gets the vpc.
   *
   * The VPC the virtual server instance resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone the virtual server instance resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

