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

import java.util.List;

/**
 * VPNGatewayConnectionPolicyModePeerPrototype.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByAddress
 * - VPNGatewayConnectionPolicyModePeerPrototypeVPNGatewayConnectionPeerByFQDN
 */
public class VPNGatewayConnectionPolicyModePeerPrototype extends VPNGatewayConnectionPeerPrototype {

  protected VPNGatewayConnectionPolicyModePeerPrototype() { }

  /**
   * Gets the cidrs.
   *
   * The peer CIDRs for this VPN gateway connection.
   *
   * @return the cidrs
   */
  public List<String> cidrs() {
    return cidrs;
  }

  /**
   * Gets the ikeIdentity.
   *
   * The peer IKE identity to use.
   *
   * If unspecified:
   * - If `peer.address` is specified, the `type` will be `ipv4_address`, and
   * the `value` will be `peer.address`.
   * - If `peer.fqdn` is specified, the `type` will be `fqdn`, and the `value`
   * will be `peer.fqdn`.
   *
   * @return the ikeIdentity
   */
  public VPNGatewayConnectionIKEIdentityPrototype ikeIdentity() {
    return ikeIdentity;
  }

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

