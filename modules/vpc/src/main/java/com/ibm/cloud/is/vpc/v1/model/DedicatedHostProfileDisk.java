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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Disks provided by this profile.
 */
public class DedicatedHostProfileDisk extends GenericModel {

  @SerializedName("interface_type")
  protected DedicatedHostProfileDiskInterface interfaceType;
  protected DedicatedHostProfileDiskQuantity quantity;
  protected DedicatedHostProfileDiskSize size;
  @SerializedName("supported_instance_interface_types")
  protected DedicatedHostProfileDiskSupportedInterfaces supportedInstanceInterfaceTypes;

  protected DedicatedHostProfileDisk() { }

  /**
   * Gets the interfaceType.
   *
   * @return the interfaceType
   */
  public DedicatedHostProfileDiskInterface getInterfaceType() {
    return interfaceType;
  }

  /**
   * Gets the quantity.
   *
   * The number of disks of this type for a dedicated host with this profile.
   *
   * @return the quantity
   */
  public DedicatedHostProfileDiskQuantity getQuantity() {
    return quantity;
  }

  /**
   * Gets the size.
   *
   * The size of the disk in GB (gigabytes).
   *
   * @return the size
   */
  public DedicatedHostProfileDiskSize getSize() {
    return size;
  }

  /**
   * Gets the supportedInstanceInterfaceTypes.
   *
   * @return the supportedInstanceInterfaceTypes
   */
  public DedicatedHostProfileDiskSupportedInterfaces getSupportedInstanceInterfaceTypes() {
    return supportedInstanceInterfaceTypes;
  }
}

