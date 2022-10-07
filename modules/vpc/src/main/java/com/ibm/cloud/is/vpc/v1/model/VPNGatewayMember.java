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
 * VPNGatewayMember.
 */
public class VPNGatewayMember extends GenericModel {

  /**
   * The high availability role assigned to the VPN gateway member.
   */
  public interface Role {
    /** active. */
    String ACTIVE = "active";
    /** standby. */
    String STANDBY = "standby";
  }

  /**
   * The status of the VPN gateway member.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
  }

  @SerializedName("private_ip")
  protected IP privateIp;
  @SerializedName("public_ip")
  protected IP publicIp;
  protected String role;
  protected String status;

  protected VPNGatewayMember() { }

  /**
   * Gets the privateIp.
   *
   * The private IP address assigned to the VPN gateway member.
   *
   * This property will be present only when the VPN gateway status is `available`.
   *
   * @return the privateIp
   */
  public IP getPrivateIp() {
    return privateIp;
  }

  /**
   * Gets the publicIp.
   *
   * The public IP address assigned to the VPN gateway member.
   *
   * @return the publicIp
   */
  public IP getPublicIp() {
    return publicIp;
  }

  /**
   * Gets the role.
   *
   * The high availability role assigned to the VPN gateway member.
   *
   * @return the role
   */
  public String getRole() {
    return role;
  }

  /**
   * Gets the status.
   *
   * The status of the VPN gateway member.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

