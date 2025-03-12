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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceProfile.
 */
public class InstanceProfile extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** instance_profile. */
    String INSTANCE_PROFILE = "instance_profile";
  }

  /**
   * The status of the instance profile:
   * - `previous`:  This instance profile is an older revision, but remains provisionable and
   *   usable.
   * - `current`:  This profile is the latest revision.
   *
   * Revisions are indicated by the generation of an instance profile. Refer to the [profile naming
   * conventions](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles&amp;interface=ui#profiles-naming-rule) for
   * information on how generations are defined within an instance profile.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** current. */
    String CURRENT = "current";
    /** previous. */
    String PREVIOUS = "previous";
  }

  protected InstanceProfileBandwidth bandwidth;
  @SerializedName("cluster_network_attachment_count")
  protected InstanceProfileClusterNetworkAttachmentCount clusterNetworkAttachmentCount;
  @SerializedName("confidential_compute_modes")
  protected InstanceProfileSupportedConfidentialComputeModes confidentialComputeModes;
  protected List<InstanceProfileDisk> disks;
  protected String family;
  @SerializedName("gpu_count")
  protected InstanceProfileGPU gpuCount;
  @SerializedName("gpu_manufacturer")
  protected InstanceProfileGPUManufacturer gpuManufacturer;
  @SerializedName("gpu_memory")
  protected InstanceProfileGPUMemory gpuMemory;
  @SerializedName("gpu_model")
  protected InstanceProfileGPUModel gpuModel;
  protected String href;
  protected InstanceProfileMemory memory;
  protected String name;
  @SerializedName("network_attachment_count")
  protected InstanceProfileNetworkAttachmentCount networkAttachmentCount;
  @SerializedName("network_interface_count")
  protected InstanceProfileNetworkInterfaceCount networkInterfaceCount;
  @SerializedName("numa_count")
  protected InstanceProfileNUMACount numaCount;
  @SerializedName("os_architecture")
  protected InstanceProfileOSArchitecture osArchitecture;
  @SerializedName("port_speed")
  protected InstanceProfilePortSpeed portSpeed;
  @SerializedName("reservation_terms")
  protected InstanceProfileReservationTerms reservationTerms;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("secure_boot_modes")
  protected InstanceProfileSupportedSecureBootModes secureBootModes;
  protected String status;
  @SerializedName("supported_cluster_network_profiles")
  protected List<ClusterNetworkProfileReference> supportedClusterNetworkProfiles;
  @SerializedName("total_volume_bandwidth")
  protected InstanceProfileVolumeBandwidth totalVolumeBandwidth;
  @SerializedName("vcpu_architecture")
  protected InstanceProfileVCPUArchitecture vcpuArchitecture;
  @SerializedName("vcpu_count")
  protected InstanceProfileVCPU vcpuCount;
  @SerializedName("vcpu_manufacturer")
  protected InstanceProfileVCPUManufacturer vcpuManufacturer;

  protected InstanceProfile() { }

  /**
   * Gets the bandwidth.
   *
   * @return the bandwidth
   */
  public InstanceProfileBandwidth getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the clusterNetworkAttachmentCount.
   *
   * @return the clusterNetworkAttachmentCount
   */
  public InstanceProfileClusterNetworkAttachmentCount getClusterNetworkAttachmentCount() {
    return clusterNetworkAttachmentCount;
  }

  /**
   * Gets the confidentialComputeModes.
   *
   * @return the confidentialComputeModes
   */
  public InstanceProfileSupportedConfidentialComputeModes getConfidentialComputeModes() {
    return confidentialComputeModes;
  }

  /**
   * Gets the disks.
   *
   * The disks for an instance with this profile.
   *
   * @return the disks
   */
  public List<InstanceProfileDisk> getDisks() {
    return disks;
  }

  /**
   * Gets the family.
   *
   * The product family this virtual server instance profile belongs to.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the gpuCount.
   *
   * @return the gpuCount
   */
  public InstanceProfileGPU getGpuCount() {
    return gpuCount;
  }

  /**
   * Gets the gpuManufacturer.
   *
   * @return the gpuManufacturer
   */
  public InstanceProfileGPUManufacturer getGpuManufacturer() {
    return gpuManufacturer;
  }

  /**
   * Gets the gpuMemory.
   *
   * @return the gpuMemory
   */
  public InstanceProfileGPUMemory getGpuMemory() {
    return gpuMemory;
  }

  /**
   * Gets the gpuModel.
   *
   * @return the gpuModel
   */
  public InstanceProfileGPUModel getGpuModel() {
    return gpuModel;
  }

  /**
   * Gets the href.
   *
   * The URL for this virtual server instance profile.
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
  public InstanceProfileMemory getMemory() {
    return memory;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this virtual server instance profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkAttachmentCount.
   *
   * @return the networkAttachmentCount
   */
  public InstanceProfileNetworkAttachmentCount getNetworkAttachmentCount() {
    return networkAttachmentCount;
  }

  /**
   * Gets the networkInterfaceCount.
   *
   * @return the networkInterfaceCount
   */
  public InstanceProfileNetworkInterfaceCount getNetworkInterfaceCount() {
    return networkInterfaceCount;
  }

  /**
   * Gets the numaCount.
   *
   * @return the numaCount
   */
  public InstanceProfileNUMACount getNumaCount() {
    return numaCount;
  }

  /**
   * Gets the osArchitecture.
   *
   * @return the osArchitecture
   */
  public InstanceProfileOSArchitecture getOsArchitecture() {
    return osArchitecture;
  }

  /**
   * Gets the portSpeed.
   *
   * @return the portSpeed
   */
  public InstanceProfilePortSpeed getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the reservationTerms.
   *
   * @return the reservationTerms
   */
  public InstanceProfileReservationTerms getReservationTerms() {
    return reservationTerms;
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
   * Gets the secureBootModes.
   *
   * @return the secureBootModes
   */
  public InstanceProfileSupportedSecureBootModes getSecureBootModes() {
    return secureBootModes;
  }

  /**
   * Gets the status.
   *
   * The status of the instance profile:
   * - `previous`:  This instance profile is an older revision, but remains provisionable and
   *   usable.
   * - `current`:  This profile is the latest revision.
   *
   * Revisions are indicated by the generation of an instance profile. Refer to the [profile naming
   * conventions](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles&amp;interface=ui#profiles-naming-rule) for
   * information on how generations are defined within an instance profile.
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
   * Gets the supportedClusterNetworkProfiles.
   *
   * The cluster network profiles that support this instance profile.
   *
   * @return the supportedClusterNetworkProfiles
   */
  public List<ClusterNetworkProfileReference> getSupportedClusterNetworkProfiles() {
    return supportedClusterNetworkProfiles;
  }

  /**
   * Gets the totalVolumeBandwidth.
   *
   * @return the totalVolumeBandwidth
   */
  public InstanceProfileVolumeBandwidth getTotalVolumeBandwidth() {
    return totalVolumeBandwidth;
  }

  /**
   * Gets the vcpuArchitecture.
   *
   * @return the vcpuArchitecture
   */
  public InstanceProfileVCPUArchitecture getVcpuArchitecture() {
    return vcpuArchitecture;
  }

  /**
   * Gets the vcpuCount.
   *
   * @return the vcpuCount
   */
  public InstanceProfileVCPU getVcpuCount() {
    return vcpuCount;
  }

  /**
   * Gets the vcpuManufacturer.
   *
   * @return the vcpuManufacturer
   */
  public InstanceProfileVCPUManufacturer getVcpuManufacturer() {
    return vcpuManufacturer;
  }
}

