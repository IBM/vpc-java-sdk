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
 * BareMetalServerStatusReason.
 */
public class BareMetalServerStatusReason extends GenericModel {

  /**
   * The status reason code:
   * - `cannot_reinitialize`: An error occurred while reinitializing bare metal server
   * - `cannot_start`: Failed to start due to an internal error
   * - `cannot_start_capacity`: Insufficient capacity within the selected zone
   * - `cannot_start_compute`: An error occurred while allocating compute resources
   * - `cannot_start_ip_address`: An error occurred while allocating an IP address
   * - `cannot_start_network`: An error occurred while allocating network resources
   * - `cannot_update_firmware`: An error occurred while updating bare metal server firmware
   * - `cannot_start_reservation_capacity`: Failed to start because the reservation has
   *   insufficient capacity
   * - `cannot_start_reservation_expired`: Failed to start because the reservation has
   *   expired
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Code {
    /** cannot_reinitialize. */
    String CANNOT_REINITIALIZE = "cannot_reinitialize";
    /** cannot_start. */
    String CANNOT_START = "cannot_start";
    /** cannot_start_capacity. */
    String CANNOT_START_CAPACITY = "cannot_start_capacity";
    /** cannot_start_compute. */
    String CANNOT_START_COMPUTE = "cannot_start_compute";
    /** cannot_start_ip_address. */
    String CANNOT_START_IP_ADDRESS = "cannot_start_ip_address";
    /** cannot_start_network. */
    String CANNOT_START_NETWORK = "cannot_start_network";
    /** cannot_start_reservation_capacity. */
    String CANNOT_START_RESERVATION_CAPACITY = "cannot_start_reservation_capacity";
    /** cannot_start_reservation_expired. */
    String CANNOT_START_RESERVATION_EXPIRED = "cannot_start_reservation_expired";
    /** cannot_update_firmware. */
    String CANNOT_UPDATE_FIRMWARE = "cannot_update_firmware";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected BareMetalServerStatusReason() { }

  /**
   * Gets the code.
   *
   * The status reason code:
   * - `cannot_reinitialize`: An error occurred while reinitializing bare metal server
   * - `cannot_start`: Failed to start due to an internal error
   * - `cannot_start_capacity`: Insufficient capacity within the selected zone
   * - `cannot_start_compute`: An error occurred while allocating compute resources
   * - `cannot_start_ip_address`: An error occurred while allocating an IP address
   * - `cannot_start_network`: An error occurred while allocating network resources
   * - `cannot_update_firmware`: An error occurred while updating bare metal server firmware
   * - `cannot_start_reservation_capacity`: Failed to start because the reservation has
   *   insufficient capacity
   * - `cannot_start_reservation_expired`: Failed to start because the reservation has
   *   expired
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * An explanation of the status reason.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * Link to documentation about this status reason.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

