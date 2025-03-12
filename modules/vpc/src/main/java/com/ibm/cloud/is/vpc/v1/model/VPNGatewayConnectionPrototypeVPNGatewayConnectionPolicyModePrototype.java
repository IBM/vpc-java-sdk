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

/**
 * VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.
 */
public class VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype extends VPNGatewayConnectionPrototype {

  /**
   * The establish mode of the VPN gateway connection:
   * - `bidirectional`: Either side of the VPN gateway can initiate IKE protocol
   *    negotiations or rekeying processes.
   * - `peer_only`: Only the peer can initiate IKE protocol negotiations for this VPN gateway
   *    connection. Additionally, the peer is responsible for initiating the rekeying process
   *    after the connection is established. If rekeying does not occur, the VPN gateway
   *    connection will be brought down after its lifetime expires.
   */
  public interface EstablishMode {
    /** bidirectional. */
    String BIDIRECTIONAL = "bidirectional";
    /** peer_only. */
    String PEER_ONLY = "peer_only";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean adminStateUp;
    private VPNGatewayConnectionDPDPrototype deadPeerDetection;
    private String establishMode;
    private VPNGatewayConnectionIKEPolicyPrototype ikePolicy;
    private VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy;
    private String name;
    private String psk;
    private VPNGatewayConnectionPolicyModeLocalPrototype local;
    private VPNGatewayConnectionPolicyModePeerPrototype peer;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype instance.
     *
     * @param vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype) {
      this.adminStateUp = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.adminStateUp;
      this.deadPeerDetection = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.deadPeerDetection;
      this.establishMode = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.establishMode;
      this.ikePolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.ipsecPolicy;
      this.name = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.name;
      this.psk = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.psk;
      this.local = (VPNGatewayConnectionPolicyModeLocalPrototype) vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.local;
      this.peer = (VPNGatewayConnectionPolicyModePeerPrototype) vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.peer;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param psk the psk
     * @param local the local
     * @param peer the peer
     */
    public Builder(String psk, VPNGatewayConnectionPolicyModeLocalPrototype local, VPNGatewayConnectionPolicyModePeerPrototype peer) {
      this.psk = psk;
      this.local = local;
      this.peer = peer;
    }

    /**
     * Builds a VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.
     *
     * @return the new VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype instance
     */
    public VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype build() {
      return new VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype(this);
    }

    /**
     * Set the adminStateUp.
     *
     * @param adminStateUp the adminStateUp
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder adminStateUp(Boolean adminStateUp) {
      this.adminStateUp = adminStateUp;
      return this;
    }

    /**
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPrototype deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the establishMode.
     *
     * @param establishMode the establishMode
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder establishMode(String establishMode) {
      this.establishMode = establishMode;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder ikePolicy(VPNGatewayConnectionIKEPolicyPrototype ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder ipsecPolicy(VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the psk.
     *
     * @param psk the psk
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder psk(String psk) {
      this.psk = psk;
      return this;
    }

    /**
     * Set the local.
     *
     * @param local the local
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder local(VPNGatewayConnectionPolicyModeLocalPrototype local) {
      this.local = local;
      return this;
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder peer(VPNGatewayConnectionPolicyModePeerPrototype peer) {
      this.peer = peer;
      return this;
    }
  }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype() { }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.psk,
      "psk cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.local,
      "local cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peer,
      "peer cannot be null");
    adminStateUp = builder.adminStateUp;
    deadPeerDetection = builder.deadPeerDetection;
    establishMode = builder.establishMode;
    ikePolicy = builder.ikePolicy;
    ipsecPolicy = builder.ipsecPolicy;
    name = builder.name;
    psk = builder.psk;
    local = builder.local;
    peer = builder.peer;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

