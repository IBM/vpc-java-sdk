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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionPeerPatch.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionPeerPatchVPNGatewayConnectionPolicyModePeerPatch
 * - VPNGatewayConnectionPeerPatchVPNGatewayConnectionStaticRouteModePeerPatch
 */
public class VPNGatewayConnectionPeerPatch extends GenericModel {

  protected String address;
  protected String fqdn;

  protected VPNGatewayConnectionPeerPatch() { }

  /**
   * Gets the address.
   *
   * The IP address of the peer VPN gateway for this connection.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the fqdn.
   *
   * The FQDN of the peer VPN gateway for this connection.
   *
   * @return the fqdn
   */
  public String fqdn() {
    return fqdn;
  }
}

