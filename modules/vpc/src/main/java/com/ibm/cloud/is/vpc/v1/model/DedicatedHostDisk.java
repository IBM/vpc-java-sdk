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
 * DedicatedHostDisk.
 */
public class DedicatedHostDisk extends GenericModel {

  /**
   * The disk interface used for attaching the disk
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface InterfaceType {
    /** nvme. */
    String NVME = "nvme";
  }

  /**
   * The lifecycle state of this dedicated host disk.
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
    /** dedicated_host_disk. */
    String DEDICATED_HOST_DISK = "dedicated_host_disk";
  }

  /**
   * The disk interface used for attaching the disk.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface SupportedInstanceInterfaceTypes {
    /** nvme. */
    String NVME = "nvme";
    /** virtio_blk. */
    String VIRTIO_BLK = "virtio_blk";
  }

  protected Long available;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("instance_disks")
  protected List<InstanceDiskReference> instanceDisks;
  @SerializedName("interface_type")
  protected String interfaceType;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  protected Boolean provisionable;
  @SerializedName("resource_type")
  protected String resourceType;
  protected Long size;
  @SerializedName("supported_instance_interface_types")
  protected List<String> supportedInstanceInterfaceTypes;

  /**
   * Gets the available.
   *
   * The remaining space left for instance placement in GB (gigabytes).
   *
   * @return the available
   */
  public Long getAvailable() {
    return available;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the disk was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this disk.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this disk.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the instanceDisks.
   *
   * Instance disks that are on this dedicated host disk.
   *
   * @return the instanceDisks
   */
  public List<InstanceDiskReference> getInstanceDisks() {
    return instanceDisks;
  }

  /**
   * Gets the interfaceType.
   *
   * The disk interface used for attaching the disk
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   *
   * @return the interfaceType
   */
  public String getInterfaceType() {
    return interfaceType;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of this dedicated host disk.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The user-defined or system-provided name for this disk.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the provisionable.
   *
   * Indicates whether this dedicated host disk is available for instance disk creation.
   *
   * @return the provisionable
   */
  public Boolean isProvisionable() {
    return provisionable;
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
   * Gets the size.
   *
   * The size of the disk in GB (gigabytes).
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Gets the supportedInstanceInterfaceTypes.
   *
   * The instance disk interfaces supported for this dedicated host disk.
   *
   * @return the supportedInstanceInterfaceTypes
   */
  public List<String> getSupportedInstanceInterfaceTypes() {
    return supportedInstanceInterfaceTypes;
  }
}

