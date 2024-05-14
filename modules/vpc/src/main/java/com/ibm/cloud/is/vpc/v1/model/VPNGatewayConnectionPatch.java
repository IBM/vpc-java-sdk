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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VPNGatewayConnectionPatch.
 */
public class VPNGatewayConnectionPatch extends GenericModel {

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
   * Routing protocols are disabled for this VPN gateway connection.
   */
  public interface RoutingProtocol {
    /** none. */
    String NONE = "none";
  }

  @SerializedName("admin_state_up")
  protected Boolean adminStateUp;
  @SerializedName("dead_peer_detection")
  protected VPNGatewayConnectionDPDPatch deadPeerDetection;
  @SerializedName("establish_mode")
  protected String establishMode;
  @SerializedName("ike_policy")
  protected VPNGatewayConnectionIKEPolicyPatch ikePolicy;
  @SerializedName("ipsec_policy")
  protected VPNGatewayConnectionIPsecPolicyPatch ipsecPolicy;
  protected String name;
  protected VPNGatewayConnectionPeerPatch peer;
  protected String psk;
  @SerializedName("routing_protocol")
  protected String routingProtocol;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean adminStateUp;
    private VPNGatewayConnectionDPDPatch deadPeerDetection;
    private String establishMode;
    private VPNGatewayConnectionIKEPolicyPatch ikePolicy;
    private VPNGatewayConnectionIPsecPolicyPatch ipsecPolicy;
    private String name;
    private VPNGatewayConnectionPeerPatch peer;
    private String psk;
    private String routingProtocol;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPatch instance.
     *
     * @param vpnGatewayConnectionPatch the instance to initialize the Builder with
     */
    private Builder(VPNGatewayConnectionPatch vpnGatewayConnectionPatch) {
      this.adminStateUp = vpnGatewayConnectionPatch.adminStateUp;
      this.deadPeerDetection = vpnGatewayConnectionPatch.deadPeerDetection;
      this.establishMode = vpnGatewayConnectionPatch.establishMode;
      this.ikePolicy = vpnGatewayConnectionPatch.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPatch.ipsecPolicy;
      this.name = vpnGatewayConnectionPatch.name;
      this.peer = vpnGatewayConnectionPatch.peer;
      this.psk = vpnGatewayConnectionPatch.psk;
      this.routingProtocol = vpnGatewayConnectionPatch.routingProtocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionPatch.
     *
     * @return the new VPNGatewayConnectionPatch instance
     */
    public VPNGatewayConnectionPatch build() {
      return new VPNGatewayConnectionPatch(this);
    }

    /**
     * Set the adminStateUp.
     *
     * @param adminStateUp the adminStateUp
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder adminStateUp(Boolean adminStateUp) {
      this.adminStateUp = adminStateUp;
      return this;
    }

    /**
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPatch deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the establishMode.
     *
     * @param establishMode the establishMode
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder establishMode(String establishMode) {
      this.establishMode = establishMode;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder ikePolicy(VPNGatewayConnectionIKEPolicyPatch ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder ipsecPolicy(VPNGatewayConnectionIPsecPolicyPatch ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder peer(VPNGatewayConnectionPeerPatch peer) {
      this.peer = peer;
      return this;
    }

    /**
     * Set the psk.
     *
     * @param psk the psk
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder psk(String psk) {
      this.psk = psk;
      return this;
    }

    /**
     * Set the routingProtocol.
     *
     * @param routingProtocol the routingProtocol
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder routingProtocol(String routingProtocol) {
      this.routingProtocol = routingProtocol;
      return this;
    }
  }

  protected VPNGatewayConnectionPatch() { }

  protected VPNGatewayConnectionPatch(Builder builder) {
    adminStateUp = builder.adminStateUp;
    deadPeerDetection = builder.deadPeerDetection;
    establishMode = builder.establishMode;
    ikePolicy = builder.ikePolicy;
    ipsecPolicy = builder.ipsecPolicy;
    name = builder.name;
    peer = builder.peer;
    psk = builder.psk;
    routingProtocol = builder.routingProtocol;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the adminStateUp.
   *
   * If set to false, the VPN gateway connection is shut down.
   *
   * @return the adminStateUp
   */
  public Boolean adminStateUp() {
    return adminStateUp;
  }

  /**
   * Gets the deadPeerDetection.
   *
   * The Dead Peer Detection settings.
   *
   * @return the deadPeerDetection
   */
  public VPNGatewayConnectionDPDPatch deadPeerDetection() {
    return deadPeerDetection;
  }

  /**
   * Gets the establishMode.
   *
   * The establish mode of the VPN gateway connection:
   * - `bidirectional`: Either side of the VPN gateway can initiate IKE protocol
   *    negotiations or rekeying processes.
   * - `peer_only`: Only the peer can initiate IKE protocol negotiations for this VPN gateway
   *    connection. Additionally, the peer is responsible for initiating the rekeying process
   *    after the connection is established. If rekeying does not occur, the VPN gateway
   *    connection will be brought down after its lifetime expires.
   *
   * @return the establishMode
   */
  public String establishMode() {
    return establishMode;
  }

  /**
   * Gets the ikePolicy.
   *
   * The IKE policy to use. Specify `null` to remove any existing policy, [resulting in
   * auto-negotiation](https://cloud.ibm.com/docs/vpc?topic=vpc-using-vpn&amp;interface=ui#ike-auto-negotiation-phase-1).
   *
   * @return the ikePolicy
   */
  public VPNGatewayConnectionIKEPolicyPatch ikePolicy() {
    return ikePolicy;
  }

  /**
   * Gets the ipsecPolicy.
   *
   * The IPsec policy to use. Specify `null` to remove any existing policy, [resulting in
   * auto-negotiation](https://cloud.ibm.com/docs/vpc?topic=vpc-using-vpn&amp;interface=ui#ipsec-auto-negotiation-phase-2).
   *
   * @return the ipsecPolicy
   */
  public VPNGatewayConnectionIPsecPolicyPatch ipsecPolicy() {
    return ipsecPolicy;
  }

  /**
   * Gets the name.
   *
   * The name for this VPN gateway connection. The name must not be used by another connection for the VPN gateway.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the peer.
   *
   * @return the peer
   */
  public VPNGatewayConnectionPeerPatch peer() {
    return peer;
  }

  /**
   * Gets the psk.
   *
   * The pre-shared key.
   *
   * @return the psk
   */
  public String psk() {
    return psk;
  }

  /**
   * Gets the routingProtocol.
   *
   * Routing protocols are disabled for this VPN gateway connection.
   *
   * @return the routingProtocol
   */
  public String routingProtocol() {
    return routingProtocol;
  }

  /**
   * Construct a JSON merge-patch from the VPNGatewayConnectionPatch.
   *
   * Note that properties of the VPNGatewayConnectionPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VPNGatewayConnectionPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

