/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Family {
    /** balanced. */
    String BALANCED = "balanced";
    /** compute. */
    String COMPUTE = "compute";
    /** memory. */
    String MEMORY = "memory";
  }

  /**
   * The status of the dedicated host profile:
   * - `previous`: This dedicated host profile is an older revision, but remains provisionable
   *   and usable.
   * - `current`: This dedicated host profile is the latest revision.
   *
   * Revisions are indicated by the generation of a dedicated host profile. Refer to the [profile naming conventions]
   * (https://cloud.ibm.com/docs/vpc?topic=vpc-dh-profiles&amp;interface=ui#profiles-naming-rule) for information on how
   * generations are defined within a dedicated host profile.
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

  @SerializedName("class")
  protected String xClass;
  protected List<DedicatedHostProfileDisk> disks;
  protected String family;
  protected String href;
  protected DedicatedHostProfileMemory memory;
  protected String name;
  @SerializedName("socket_count")
  protected DedicatedHostProfileSocket socketCount;
  protected String status;
  @SerializedName("supported_instance_profiles")
  protected List<InstanceProfileReference> supportedInstanceProfiles;
  @SerializedName("vcpu_architecture")
  protected DedicatedHostProfileVCPUArchitecture vcpuArchitecture;
  @SerializedName("vcpu_count")
  protected DedicatedHostProfileVCPU vcpuCount;
  @SerializedName("vcpu_manufacturer")
  protected DedicatedHostProfileVCPUManufacturer vcpuManufacturer;

  protected DedicatedHostProfile() { }

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
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
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
   * Gets the status.
   *
   * The status of the dedicated host profile:
   * - `previous`: This dedicated host profile is an older revision, but remains provisionable
   *   and usable.
   * - `current`: This dedicated host profile is the latest revision.
   *
   * Revisions are indicated by the generation of a dedicated host profile. Refer to the [profile naming conventions]
   * (https://cloud.ibm.com/docs/vpc?topic=vpc-dh-profiles&amp;interface=ui#profiles-naming-rule) for information on how
   * generations are defined within a dedicated host profile.
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

  /**
   * Gets the vcpuManufacturer.
   *
   * @return the vcpuManufacturer
   */
  public DedicatedHostProfileVCPUManufacturer getVcpuManufacturer() {
    return vcpuManufacturer;
  }
}

