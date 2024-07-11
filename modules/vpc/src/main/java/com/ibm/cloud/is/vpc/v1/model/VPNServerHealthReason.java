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
 * VPNServerHealthReason.
 */
public class VPNServerHealthReason extends GenericModel {

  /**
   * A reason code for this health state:
   * - `cannot_access_client_certificate`: VPN server's client certificate is inaccessible
   *   (verify certificate exists and that IAM policies grant `VPN server for VPC` access
   *   to `Secrets Manager`)
   * - `cannot_access_server_certificate`: VPN server's server certificate is inaccessible
   *   (verify certificate exists and that IAM policies grant `VPN server for VPC` access
   *   to `Secrets Manager`)
   * - `cannot_create_vpc_route`: VPN cannot create route (check for conflict)
   * - `cannot_reserve_ip_address`: IP address exhaustion (release addresses on the VPN's
   *   subnet)
   * - `internal_error`: Internal error (contact IBM support)
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Code {
    /** cannot_access_client_certificate. */
    String CANNOT_ACCESS_CLIENT_CERTIFICATE = "cannot_access_client_certificate";
    /** cannot_access_server_certificate. */
    String CANNOT_ACCESS_SERVER_CERTIFICATE = "cannot_access_server_certificate";
    /** cannot_create_vpc_route. */
    String CANNOT_CREATE_VPC_ROUTE = "cannot_create_vpc_route";
    /** cannot_reserve_ip_address. */
    String CANNOT_RESERVE_IP_ADDRESS = "cannot_reserve_ip_address";
    /** internal_error. */
    String INTERNAL_ERROR = "internal_error";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected VPNServerHealthReason() { }

  /**
   * Gets the code.
   *
   * A reason code for this health state:
   * - `cannot_access_client_certificate`: VPN server's client certificate is inaccessible
   *   (verify certificate exists and that IAM policies grant `VPN server for VPC` access
   *   to `Secrets Manager`)
   * - `cannot_access_server_certificate`: VPN server's server certificate is inaccessible
   *   (verify certificate exists and that IAM policies grant `VPN server for VPC` access
   *   to `Secrets Manager`)
   * - `cannot_create_vpc_route`: VPN cannot create route (check for conflict)
   * - `cannot_reserve_ip_address`: IP address exhaustion (release addresses on the VPN's
   *   subnet)
   * - `internal_error`: Internal error (contact IBM support)
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
   * An explanation of the reason for this health state.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * Link to documentation about the reason for this health state.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

