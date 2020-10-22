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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VPNGatewayConnectionPatch.
 */
public class VPNGatewayConnectionPatch extends GenericModel {

  @SerializedName("admin_state_up")
  protected Boolean adminStateUp;
  @SerializedName("peer_address")
  protected String peerAddress;
  protected String name;
  protected String psk;
  @SerializedName("dead_peer_detection")
  protected VPNGatewayConnectionDPDPrototype deadPeerDetection;
  @SerializedName("ike_policy")
  protected IKEPolicyIdentity ikePolicy;
  @SerializedName("ipsec_policy")
  protected IPsecPolicyIdentity ipsecPolicy;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean adminStateUp;
    private String peerAddress;
    private String name;
    private String psk;
    private VPNGatewayConnectionDPDPrototype deadPeerDetection;
    private IKEPolicyIdentity ikePolicy;
    private IPsecPolicyIdentity ipsecPolicy;

    private Builder(VPNGatewayConnectionPatch vpnGatewayConnectionPatch) {
      this.adminStateUp = vpnGatewayConnectionPatch.adminStateUp;
      this.peerAddress = vpnGatewayConnectionPatch.peerAddress;
      this.name = vpnGatewayConnectionPatch.name;
      this.psk = vpnGatewayConnectionPatch.psk;
      this.deadPeerDetection = vpnGatewayConnectionPatch.deadPeerDetection;
      this.ikePolicy = vpnGatewayConnectionPatch.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPatch.ipsecPolicy;
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
     * Set the peerAddress.
     *
     * @param peerAddress the peerAddress
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder peerAddress(String peerAddress) {
      this.peerAddress = peerAddress;
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
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPrototype deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder ikePolicy(IKEPolicyIdentity ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the VPNGatewayConnectionPatch builder
     */
    public Builder ipsecPolicy(IPsecPolicyIdentity ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }
  }

  protected VPNGatewayConnectionPatch(Builder builder) {
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

