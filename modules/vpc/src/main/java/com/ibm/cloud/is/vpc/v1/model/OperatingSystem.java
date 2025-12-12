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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * OperatingSystem.
 */
public class OperatingSystem extends GenericModel {

  /**
   * The user data format for this operating system:
   * - `cloud_init`: `user_data` will be interpreted according to the cloud-init standard
   * - `esxi_kickstart`: `user_data` will be interpreted as a VMware ESXi installation script
   * - `ipxe`: `user_data` will be interpreted as a single URL to an iPXE script or as the
   *   text of an iPXE script.
   */
  public interface UserDataFormat {
    /** cloud_init. */
    String CLOUD_INIT = "cloud_init";
    /** esxi_kickstart. */
    String ESXI_KICKSTART = "esxi_kickstart";
    /** ipxe. */
    String IPXE = "ipxe";
  }

  @SerializedName("allow_user_image_creation")
  protected Boolean allowUserImageCreation;
  protected String architecture;
  @SerializedName("dedicated_host_only")
  protected Boolean dedicatedHostOnly;
  @SerializedName("display_name")
  protected String displayName;
  protected String family;
  protected String href;
  protected String name;
  @SerializedName("user_data_format")
  protected String userDataFormat;
  protected String vendor;
  protected String version;

  protected OperatingSystem() { }

  /**
   * Gets the allowUserImageCreation.
   *
   * Indicates that users may create new images with this operating system.
   *
   * @return the allowUserImageCreation
   */
  public Boolean isAllowUserImageCreation() {
    return allowUserImageCreation;
  }

  /**
   * Gets the architecture.
   *
   * The operating system architecture.
   *
   * @return the architecture
   */
  public String getArchitecture() {
    return architecture;
  }

  /**
   * Gets the dedicatedHostOnly.
   *
   * Indicates that images with this operating system can only be used on dedicated hosts and dedicated host groups.
   *
   * @return the dedicatedHostOnly
   */
  public Boolean isDedicatedHostOnly() {
    return dedicatedHostOnly;
  }

  /**
   * Gets the displayName.
   *
   * A unique, display-friendly name for the operating system.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the family.
   *
   * The software family for this operating system.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this operating system.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this operating system.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the userDataFormat.
   *
   * The user data format for this operating system:
   * - `cloud_init`: `user_data` will be interpreted according to the cloud-init standard
   * - `esxi_kickstart`: `user_data` will be interpreted as a VMware ESXi installation script
   * - `ipxe`: `user_data` will be interpreted as a single URL to an iPXE script or as the
   *   text of an iPXE script.
   *
   * @return the userDataFormat
   */
  public String getUserDataFormat() {
    return userDataFormat;
  }

  /**
   * Gets the vendor.
   *
   * The vendor of the operating system.
   *
   * @return the vendor
   */
  public String getVendor() {
    return vendor;
  }

  /**
   * Gets the version.
   *
   * The major release version of this operating system.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

