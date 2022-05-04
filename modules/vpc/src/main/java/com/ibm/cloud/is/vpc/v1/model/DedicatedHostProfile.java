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
 * DedicatedHostProfile.
 */
public class DedicatedHostProfile extends GenericModel {

  /**
   * The product family this dedicated host profile belongs to
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   */
  public interface Family {
    /** balanced. */
    String BALANCED = "balanced";
    /** compute. */
    String COMPUTE = "compute";
    /** memory. */
    String MEMORY = "memory";
  }

  @SerializedName("class")
  protected String xClass;
  protected List<DedicatedHostProfileDisk> disks;
  protected String family;
  protected String href;
  protected DedicatedHostProfileMemory memory;
  protected String name;
  @SerializedName("socket_count")
  protected DedicatedHostProfileSocket socketCount;
  @SerializedName("supported_instance_profiles")
  protected List<InstanceProfileReference> supportedInstanceProfiles;
  @SerializedName("vcpu_architecture")
  protected DedicatedHostProfileVCPUArchitecture vcpuArchitecture;
  @SerializedName("vcpu_count")
  protected DedicatedHostProfileVCPU vcpuCount;

  /**
   * Gets the xClass.
   *
   * The product class this dedicated host profile belongs to.
   *
   * @return the xClass
   */
  public String getXClass() {
    return xClass;
  }

  /**
   * Gets the disks.
   *
   * Collection of the dedicated host profile's disks.
   *
   * @return the disks
   */
  public List<DedicatedHostProfileDisk> getDisks() {
    return disks;
  }

  /**
   * Gets the family.
   *
   * The product family this dedicated host profile belongs to
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected property value was encountered.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this dedicated host.
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
  public DedicatedHostProfileMemory getMemory() {
    return memory;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this dedicated host profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the socketCount.
   *
   * @return the socketCount
   */
  public DedicatedHostProfileSocket getSocketCount() {
    return socketCount;
  }

  /**
   * Gets the supportedInstanceProfiles.
   *
   * The instance profiles usable by instances placed on dedicated hosts with this profile.
   *
   * @return the supportedInstanceProfiles
   */
  public List<InstanceProfileReference> getSupportedInstanceProfiles() {
    return supportedInstanceProfiles;
  }

  /**
   * Gets the vcpuArchitecture.
   *
   * @return the vcpuArchitecture
   */
  public DedicatedHostProfileVCPUArchitecture getVcpuArchitecture() {
    return vcpuArchitecture;
  }

  /**
   * Gets the vcpuCount.
   *
   * @return the vcpuCount
   */
  public DedicatedHostProfileVCPU getVcpuCount() {
    return vcpuCount;
  }
}

