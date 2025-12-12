/*
 * (C) Copyright IBM Corp. 2025.
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
 * VPNGatewayConnectionPolicyModeLocal.
 */
public class VPNGatewayConnectionPolicyModeLocal extends GenericModel {

  protected List<String> cidrs;
  @SerializedName("ike_identities")
  protected List<VPNGatewayConnectionIKEIdentity> ikeIdentities;

  protected VPNGatewayConnectionPolicyModeLocal() { }

  /**
   * Gets the cidrs.
   *
   * The local CIDRs for this VPN gateway connection.
   *
   * @return the cidrs
   */
  public List<String> getCidrs() {
    return cidrs;
  }

  /**
   * Gets the ikeIdentities.
   *
   * The local IKE identities.
   *
   * A VPN gateway in policy mode consists of two members in active-standby mode. The local IKE identity applies to the
   * active member.
   *
   * @return the ikeIdentities
   */
  public List<VPNGatewayConnectionIKEIdentity> getIkeIdentities() {
    return ikeIdentities;
  }
}

