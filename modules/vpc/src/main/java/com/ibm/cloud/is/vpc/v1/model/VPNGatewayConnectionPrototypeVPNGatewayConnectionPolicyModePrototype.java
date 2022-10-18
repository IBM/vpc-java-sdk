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

import java.util.ArrayList;
import java.util.List;

/**
 * VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype.
 */
public class VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype extends VPNGatewayConnectionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean adminStateUp;
    private VPNGatewayConnectionDPDPrototype deadPeerDetection;
    private VPNGatewayConnectionIKEPolicyPrototype ikePolicy;
    private VPNGatewayConnectionIPsecPolicyPrototype ipsecPolicy;
    private String name;
    private String peerAddress;
    private String psk;
    private List<String> localCidrs;
    private List<String> peerCidrs;

    /**
     * Instantiates a new Builder from an existing VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype instance.
     *
     * @param vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype the instance to initialize the Builder with
     */
    public Builder(VPNGatewayConnectionPrototype vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype) {
      this.adminStateUp = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.adminStateUp;
      this.deadPeerDetection = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.deadPeerDetection;
      this.ikePolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.ikePolicy;
      this.ipsecPolicy = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.ipsecPolicy;
      this.name = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.name;
      this.peerAddress = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.peerAddress;
      this.psk = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.psk;
      this.localCidrs = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.localCidrs;
      this.peerCidrs = vpnGatewayConnectionPrototypeVpnGatewayConnectionPolicyModePrototype.peerCidrs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param peerAddress the peerAddress
     * @param psk the psk
     * @param localCidrs the localCidrs
     * @param peerCidrs the peerCidrs
     */
    public Builder(String peerAddress, String psk, List<String> localCidrs, List<String> peerCidrs) {
      this.peerAddress = peerAddress;
      this.psk = psk;
      this.localCidrs = localCidrs;
      this.peerCidrs = peerCidrs;
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
     * Adds an localCidrs to localCidrs.
     *
     * @param localCidrs the new localCidrs
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder addLocalCidrs(String localCidrs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(localCidrs,
        "localCidrs cannot be null");
      if (this.localCidrs == null) {
        this.localCidrs = new ArrayList<String>();
      }
      this.localCidrs.add(localCidrs);
      return this;
    }

    /**
     * Adds an peerCidrs to peerCidrs.
     *
     * @param peerCidrs the new peerCidrs
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder addPeerCidrs(String peerCidrs) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(peerCidrs,
        "peerCidrs cannot be null");
      if (this.peerCidrs == null) {
        this.peerCidrs = new ArrayList<String>();
      }
      this.peerCidrs.add(peerCidrs);
      return this;
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
     * Set the peerAddress.
     *
     * @param peerAddress the peerAddress
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder peerAddress(String peerAddress) {
      this.peerAddress = peerAddress;
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
     * Set the localCidrs.
     * Existing localCidrs will be replaced.
     *
     * @param localCidrs the localCidrs
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder localCidrs(List<String> localCidrs) {
      this.localCidrs = localCidrs;
      return this;
    }

    /**
     * Set the peerCidrs.
     * Existing peerCidrs will be replaced.
     *
     * @param peerCidrs the peerCidrs
     * @return the VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype builder
     */
    public Builder peerCidrs(List<String> peerCidrs) {
      this.peerCidrs = peerCidrs;
      return this;
    }
  }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype() { }

  protected VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peerAddress,
      "peerAddress cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.psk,
      "psk cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.localCidrs,
      "localCidrs cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peerCidrs,
      "peerCidrs cannot be null");
    adminStateUp = builder.adminStateUp;
    deadPeerDetection = builder.deadPeerDetection;
    ikePolicy = builder.ikePolicy;
    ipsecPolicy = builder.ipsecPolicy;
    name = builder.name;
    peerAddress = builder.peerAddress;
    psk = builder.psk;
    localCidrs = builder.localCidrs;
    peerCidrs = builder.peerCidrs;
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

