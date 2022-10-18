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
 * InstanceProfile.
 */
public class InstanceProfile extends GenericModel {

  protected InstanceProfileBandwidth bandwidth;
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
  @SerializedName("os_architecture")
  protected InstanceProfileOSArchitecture osArchitecture;
  @SerializedName("port_speed")
  protected InstanceProfilePortSpeed portSpeed;
  @SerializedName("total_volume_bandwidth")
  protected InstanceProfileVolumeBandwidth totalVolumeBandwidth;
  @SerializedName("vcpu_architecture")
  protected InstanceProfileVCPUArchitecture vcpuArchitecture;
  @SerializedName("vcpu_count")
  protected InstanceProfileVCPU vcpuCount;

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
   * Gets the disks.
   *
   * Collection of the instance profile's disks.
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
}

