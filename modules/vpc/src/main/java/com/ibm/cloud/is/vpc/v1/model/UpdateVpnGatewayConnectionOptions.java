/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateVpnGatewayConnection options.
 */
public class UpdateVpnGatewayConnectionOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String id;
  protected Boolean adminStateUp;
  protected String peerAddress;
  protected String name;
  protected String psk;
  protected VPNGatewayConnectionDPDPrototype deadPeerDetection;
  protected IKEPolicyIdentity ikePolicy;
  protected IPsecPolicyIdentity ipsecPolicy;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String id;
    private Boolean adminStateUp;
    private String peerAddress;
    private String name;
    private String psk;
    private VPNGatewayConnectionDPDPrototype deadPeerDetection;
    private IKEPolicyIdentity ikePolicy;
    private IPsecPolicyIdentity ipsecPolicy;

    private Builder(UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptions) {
      this.vpnGatewayId = updateVpnGatewayConnectionOptions.vpnGatewayId;
      this.id = updateVpnGatewayConnectionOptions.id;
      this.adminStateUp = updateVpnGatewayConnectionOptions.adminStateUp;
      this.peerAddress = updateVpnGatewayConnectionOptions.peerAddress;
      this.name = updateVpnGatewayConnectionOptions.name;
      this.psk = updateVpnGatewayConnectionOptions.psk;
      this.deadPeerDetection = updateVpnGatewayConnectionOptions.deadPeerDetection;
      this.ikePolicy = updateVpnGatewayConnectionOptions.ikePolicy;
      this.ipsecPolicy = updateVpnGatewayConnectionOptions.ipsecPolicy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @param id the id
     */
    public Builder(String vpnGatewayId, String id) {
      this.vpnGatewayId = vpnGatewayId;
      this.id = id;
    }

    /**
     * Builds a UpdateVpnGatewayConnectionOptions.
     *
     * @return the new UpdateVpnGatewayConnectionOptions instance
     */
    public UpdateVpnGatewayConnectionOptions build() {
      return new UpdateVpnGatewayConnectionOptions(this);
    }

    /**
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the adminStateUp.
     *
     * @param adminStateUp the adminStateUp
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder adminStateUp(Boolean adminStateUp) {
      this.adminStateUp = adminStateUp;
      return this;
    }

    /**
     * Set the peerAddress.
     *
     * @param peerAddress the peerAddress
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder peerAddress(String peerAddress) {
      this.peerAddress = peerAddress;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the psk.
     *
     * @param psk the psk
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder psk(String psk) {
      this.psk = psk;
      return this;
    }

    /**
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPrototype deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder ikePolicy(IKEPolicyIdentity ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the UpdateVpnGatewayConnectionOptions builder
     */
    public Builder ipsecPolicy(IPsecPolicyIdentity ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }
  }

  protected UpdateVpnGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    vpnGatewayId = builder.vpnGatewayId;
    id = builder.id;
    adminStateUp = builder.adminStateUp;
    peerAddress = builder.peerAddress;
    name = builder.name;
    psk = builder.psk;
    deadPeerDetection = builder.deadPeerDetection;
    ikePolicy = builder.ikePolicy;
    ipsecPolicy = builder.ipsecPolicy;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpnGatewayConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpnGatewayId.
   *
   * The VPN gateway identifier.
   *
   * @return the vpnGatewayId
   */
  public String vpnGatewayId() {
    return vpnGatewayId;
  }

  /**
   * Gets the id.
   *
   * The VPN gateway connection identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the adminStateUp.
   *
   * If set to false, the VPN connection is shut down.
   *
   * @return the adminStateUp
   */
  public Boolean adminStateUp() {
    return adminStateUp;
  }

  /**
   * Gets the peerAddress.
   *
   * The IP address of the peer VPN gateway.
   *
   * @return the peerAddress
   */
  public String peerAddress() {
    return peerAddress;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this VPN gateway connection.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the psk.
   *
   * The preshared key.
   *
   * @return the psk
   */
  public String psk() {
    return psk;
  }

  /**
   * Gets the deadPeerDetection.
   *
   * The Dead Peer Detection settings.
   *
   * @return the deadPeerDetection
   */
  public VPNGatewayConnectionDPDPrototype deadPeerDetection() {
    return deadPeerDetection;
  }

  /**
   * Gets the ikePolicy.
   *
   * Optional IKE policy configuration. The absence of a policy indicates autonegotiation.
   *
   * @return the ikePolicy
   */
  public IKEPolicyIdentity ikePolicy() {
    return ikePolicy;
  }

  /**
   * Gets the ipsecPolicy.
   *
   * Optional IPsec policy configuration. The absence of a policy indicates
   * autonegotiation.
   *
   * @return the ipsecPolicy
   */
  public IPsecPolicyIdentity ipsecPolicy() {
    return ipsecPolicy;
  }
}

