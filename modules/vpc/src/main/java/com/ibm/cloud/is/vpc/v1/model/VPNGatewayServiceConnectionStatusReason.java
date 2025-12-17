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
 * VPNGatewayServiceConnectionStatusReason.
 */
public class VPNGatewayServiceConnectionStatusReason extends GenericModel {

  /**
   * The reasons for the current VPN gateway service connection status (if any).
   * - `internal_error`
   * - `peer_not_responding`.
   */
  public interface Code {
    /** internal_error. */
    String INTERNAL_ERROR = "internal_error";
    /** peer_not_responding. */
    String PEER_NOT_RESPONDING = "peer_not_responding";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected VPNGatewayServiceConnectionStatusReason() { }

  /**
   * Gets the code.
   *
   * The reasons for the current VPN gateway service connection status (if any).
   * - `internal_error`
   * - `peer_not_responding`.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * An explanation of the reason for this VPN gateway service connection's status.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * A link to documentation about this status reason.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

