/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerDisk.
 */
public class BareMetalServerDisk extends GenericModel {

  /**
   * The disk attachment interface used:
   * - `fcp`: Fiber Channel Protocol
   * - `sata`: Serial Advanced Technology Attachment
   * - `nvme`: Non-Volatile Memory Express
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface InterfaceType {
    /** fcp. */
    String FCP = "fcp";
    /** nvme. */
    String NVME = "nvme";
    /** sata. */
    String SATA = "sata";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** bare_metal_server_disk. */
    String BARE_METAL_SERVER_DISK = "bare_metal_server_disk";
  }

  @SerializedName("allowed_use")
  protected BareMetalServerDiskAllowedUse allowedUse;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("interface_type")
  protected String interfaceType;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  protected Long size;

  protected BareMetalServerDisk() { }

  /**
   * Gets the allowedUse.
   *
   * The usage constraints to be matched against the requested bare metal server
   * properties to determine compatibility.
   *
   * Only present for disks which are referenced in a bare metal server's `boot_target`
   * property. The value of this property will be inherited from the source image at creation.
   *
   * @return the allowedUse
   */
  public BareMetalServerDiskAllowedUse getAllowedUse() {
    return allowedUse;
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
   * The URL for this bare metal server disk.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this bare metal server disk.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the interfaceType.
   *
   * The disk attachment interface used:
   * - `fcp`: Fiber Channel Protocol
   * - `sata`: Serial Advanced Technology Attachment
   * - `nvme`: Non-Volatile Memory Express
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the interfaceType
   */
  public String getInterfaceType() {
    return interfaceType;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server disk. The name is unique across all disks on the bare metal server.
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
}

