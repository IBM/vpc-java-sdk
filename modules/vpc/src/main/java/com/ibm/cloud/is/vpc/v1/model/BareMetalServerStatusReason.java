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
 * BareMetalServerStatusReason.
 */
public class BareMetalServerStatusReason extends GenericModel {

  /**
   * The status reason code:
   * - `cannot_start`: Failed to start due to an internal error
   * - `cannot_start_capacity`: Insufficient capacity within the selected zone
   * - `cannot_start_compute`: An error occurred while allocating compute resources
   * - `cannot_start_ip_address`: An error occurred while allocating an IP address
   * - `cannot_start_network`: An error occurred while allocating network resources.
   */
  public interface Code {
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
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  /**
   * Gets the code.
   *
   * The status reason code:
   * - `cannot_start`: Failed to start due to an internal error
   * - `cannot_start_capacity`: Insufficient capacity within the selected zone
   * - `cannot_start_compute`: An error occurred while allocating compute resources
   * - `cannot_start_ip_address`: An error occurred while allocating an IP address
   * - `cannot_start_network`: An error occurred while allocating network resources.
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

