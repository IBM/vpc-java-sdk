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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionDynamicRouteModePeer.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionDynamicRouteModePeerVPNGatewayConnectionPeerByAddress
 * - VPNGatewayConnectionDynamicRouteModePeerVPNGatewayConnectionPeerByFQDN
 */
public class VPNGatewayConnectionDynamicRouteModePeer extends GenericModel {

  /**
   * Indicates whether `peer.address` or `peer.fqdn` is used.
   */
  public interface Type {
    /** address. */
    String ADDRESS = "address";
    /** fqdn. */
    String FQDN = "fqdn";
  }

  protected Long asn;
  @SerializedName("ike_identity")
  protected VPNGatewayConnectionIKEIdentity ikeIdentity;
  protected String type;
  protected String address;
  protected String fqdn;

  protected VPNGatewayConnectionDynamicRouteModePeer() { }

  /**
   * Gets the asn.
   *
   * The peer autonomous system number (ASN) for this VPN gateway connection.
   *
   * @return the asn
   */
  public Long getAsn() {
    return asn;
  }

  /**
   * Gets the ikeIdentity.
   *
   * The peer IKE identity.
   *
   * @return the ikeIdentity
   */
  public VPNGatewayConnectionIKEIdentity getIkeIdentity() {
    return ikeIdentity;
  }

  /**
   * Gets the type.
   *
   * Indicates whether `peer.address` or `peer.fqdn` is used.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the address.
   *
   * The IP address of the peer VPN gateway for this connection.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the fqdn.
   *
   * The FQDN of the peer VPN gateway for this connection.
   *
   * @return the fqdn
   */
  public String getFqdn() {
    return fqdn;
  }
}

