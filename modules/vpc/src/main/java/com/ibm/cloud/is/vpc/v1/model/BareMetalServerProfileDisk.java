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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Disks provided by this profile.
 */
public class BareMetalServerProfileDisk extends GenericModel {

  protected BareMetalServerProfileDiskQuantity quantity;
  protected BareMetalServerProfileDiskSize size;
  @SerializedName("supported_interface_types")
  protected BareMetalServerProfileDiskSupportedInterfaces supportedInterfaceTypes;

  protected BareMetalServerProfileDisk() { }

  /**
   * Gets the quantity.
   *
   * @return the quantity
   */
  public BareMetalServerProfileDiskQuantity getQuantity() {
    return quantity;
  }

  /**
   * Gets the size.
   *
   * @return the size
   */
  public BareMetalServerProfileDiskSize getSize() {
    return size;
  }

  /**
   * Gets the supportedInterfaceTypes.
   *
   * @return the supportedInterfaceTypes
   */
  public BareMetalServerProfileDiskSupportedInterfaces getSupportedInterfaceTypes() {
    return supportedInterfaceTypes;
  }
}

