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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerProfile.
 */
public class BareMetalServerProfile extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** bare_metal_server_profile. */
    String BARE_METAL_SERVER_PROFILE = "bare_metal_server_profile";
  }

  protected BareMetalServerProfileBandwidth bandwidth;
  @SerializedName("cpu_architecture")
  protected BareMetalServerProfileCPUArchitecture cpuArchitecture;
  @SerializedName("cpu_core_count")
  protected BareMetalServerProfileCPUCoreCount cpuCoreCount;
  @SerializedName("cpu_socket_count")
  protected BareMetalServerProfileCPUSocketCount cpuSocketCount;
  protected List<BareMetalServerProfileDisk> disks;
  protected String family;
  protected String href;
  protected BareMetalServerProfileMemory memory;
  protected String name;
  @SerializedName("os_architecture")
  protected BareMetalServerProfileOSArchitecture osArchitecture;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("supported_trusted_platform_module_modes")
  protected BareMetalServerProfileSupportedTrustedPlatformModuleModes supportedTrustedPlatformModuleModes;

  /**
   * Gets the bandwidth.
   *
   * @return the bandwidth
   */
  public BareMetalServerProfileBandwidth getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the cpuArchitecture.
   *
   * @return the cpuArchitecture
   */
  public BareMetalServerProfileCPUArchitecture getCpuArchitecture() {
    return cpuArchitecture;
  }

  /**
   * Gets the cpuCoreCount.
   *
   * @return the cpuCoreCount
   */
  public BareMetalServerProfileCPUCoreCount getCpuCoreCount() {
    return cpuCoreCount;
  }

  /**
   * Gets the cpuSocketCount.
   *
   * @return the cpuSocketCount
   */
  public BareMetalServerProfileCPUSocketCount getCpuSocketCount() {
    return cpuSocketCount;
  }

  /**
   * Gets the disks.
   *
   * Collection of the bare metal server profile's disks.
   *
   * @return the disks
   */
  public List<BareMetalServerProfileDisk> getDisks() {
    return disks;
  }

  /**
   * Gets the family.
   *
   * The product family this bare metal server profile belongs to.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this bare metal server profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the memory.
   *
   * @return the memory
   */
  public BareMetalServerProfileMemory getMemory() {
    return memory;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the osArchitecture.
   *
   * @return the osArchitecture
   */
  public BareMetalServerProfileOSArchitecture getOsArchitecture() {
    return osArchitecture;
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
   * Gets the supportedTrustedPlatformModuleModes.
   *
   * The supported trusted platform module (TPM) modes for this bare metal server profile.
   *
   * @return the supportedTrustedPlatformModuleModes
   */
  public BareMetalServerProfileSupportedTrustedPlatformModuleModes getSupportedTrustedPlatformModuleModes() {
    return supportedTrustedPlatformModuleModes;
  }
}

