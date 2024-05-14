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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionStatusReason.
 */
public class VPNGatewayConnectionStatusReason extends GenericModel {

  /**
   * A snake case string succinctly identifying the status reason.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Code {
    /** cannot_authenticate_connection. */
    String CANNOT_AUTHENTICATE_CONNECTION = "cannot_authenticate_connection";
    /** ike_policy_mismatch. */
    String IKE_POLICY_MISMATCH = "ike_policy_mismatch";
    /** ike_v1_id_local_remote_cidr_mismatch. */
    String IKE_V1_ID_LOCAL_REMOTE_CIDR_MISMATCH = "ike_v1_id_local_remote_cidr_mismatch";
    /** ike_v2_local_remote_cidr_mismatch. */
    String IKE_V2_LOCAL_REMOTE_CIDR_MISMATCH = "ike_v2_local_remote_cidr_mismatch";
    /** internal_error. */
    String INTERNAL_ERROR = "internal_error";
    /** ipsec_policy_mismatch. */
    String IPSEC_POLICY_MISMATCH = "ipsec_policy_mismatch";
    /** peer_not_responding. */
    String PEER_NOT_RESPONDING = "peer_not_responding";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected VPNGatewayConnectionStatusReason() { }

  /**
   * Gets the code.
   *
   * A snake case string succinctly identifying the status reason.
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
   * An explanation of the reason for this VPN gateway connection's status.
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

