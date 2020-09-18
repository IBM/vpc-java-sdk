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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpnGatewayConnection options.
 */
public class CreateVpnGatewayConnectionOptions extends GenericModel {

  protected String vpnGatewayId;
  protected String peerAddress;
  protected String psk;
  protected Boolean adminStateUp;
  protected String name;
  protected VPNGatewayConnectionDPDPrototype deadPeerDetection;
  protected IKEPolicyIdentity ikePolicy;
  protected IPsecPolicyIdentity ipsecPolicy;
  protected List<String> localCidrs;
  protected List<String> peerCidrs;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpnGatewayId;
    private String peerAddress;
    private String psk;
    private Boolean adminStateUp;
    private String name;
    private VPNGatewayConnectionDPDPrototype deadPeerDetection;
    private IKEPolicyIdentity ikePolicy;
    private IPsecPolicyIdentity ipsecPolicy;
    private List<String> localCidrs;
    private List<String> peerCidrs;

    private Builder(CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptions) {
      this.vpnGatewayId = createVpnGatewayConnectionOptions.vpnGatewayId;
      this.peerAddress = createVpnGatewayConnectionOptions.peerAddress;
      this.psk = createVpnGatewayConnectionOptions.psk;
      this.adminStateUp = createVpnGatewayConnectionOptions.adminStateUp;
      this.name = createVpnGatewayConnectionOptions.name;
      this.deadPeerDetection = createVpnGatewayConnectionOptions.deadPeerDetection;
      this.ikePolicy = createVpnGatewayConnectionOptions.ikePolicy;
      this.ipsecPolicy = createVpnGatewayConnectionOptions.ipsecPolicy;
      this.localCidrs = createVpnGatewayConnectionOptions.localCidrs;
      this.peerCidrs = createVpnGatewayConnectionOptions.peerCidrs;
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
     * @param peerAddress the peerAddress
     * @param psk the psk
     */
    public Builder(String vpnGatewayId, String peerAddress, String psk) {
      this.vpnGatewayId = vpnGatewayId;
      this.peerAddress = peerAddress;
      this.psk = psk;
    }

    /**
     * Builds a CreateVpnGatewayConnectionOptions.
     *
     * @return the new CreateVpnGatewayConnectionOptions instance
     */
    public CreateVpnGatewayConnectionOptions build() {
      return new CreateVpnGatewayConnectionOptions(this);
    }

    /**
     * Adds an localCidrs to localCidrs.
     *
     * @param localCidrs the new localCidrs
     * @return the CreateVpnGatewayConnectionOptions builder
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
     * @return the CreateVpnGatewayConnectionOptions builder
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
     * Set the vpnGatewayId.
     *
     * @param vpnGatewayId the vpnGatewayId
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder vpnGatewayId(String vpnGatewayId) {
      this.vpnGatewayId = vpnGatewayId;
      return this;
    }

    /**
     * Set the peerAddress.
     *
     * @param peerAddress the peerAddress
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder peerAddress(String peerAddress) {
      this.peerAddress = peerAddress;
      return this;
    }

    /**
     * Set the psk.
     *
     * @param psk the psk
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder psk(String psk) {
      this.psk = psk;
      return this;
    }

    /**
     * Set the adminStateUp.
     *
     * @param adminStateUp the adminStateUp
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder adminStateUp(Boolean adminStateUp) {
      this.adminStateUp = adminStateUp;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the deadPeerDetection.
     *
     * @param deadPeerDetection the deadPeerDetection
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder deadPeerDetection(VPNGatewayConnectionDPDPrototype deadPeerDetection) {
      this.deadPeerDetection = deadPeerDetection;
      return this;
    }

    /**
     * Set the ikePolicy.
     *
     * @param ikePolicy the ikePolicy
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder ikePolicy(IKEPolicyIdentity ikePolicy) {
      this.ikePolicy = ikePolicy;
      return this;
    }

    /**
     * Set the ipsecPolicy.
     *
     * @param ipsecPolicy the ipsecPolicy
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder ipsecPolicy(IPsecPolicyIdentity ipsecPolicy) {
      this.ipsecPolicy = ipsecPolicy;
      return this;
    }

    /**
     * Set the localCidrs.
     * Existing localCidrs will be replaced.
     *
     * @param localCidrs the localCidrs
     * @return the CreateVpnGatewayConnectionOptions builder
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
     * @return the CreateVpnGatewayConnectionOptions builder
     */
    public Builder peerCidrs(List<String> peerCidrs) {
      this.peerCidrs = peerCidrs;
      return this;
    }
  }

  protected CreateVpnGatewayConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpnGatewayId,
      "vpnGatewayId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peerAddress,
      "peerAddress cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.psk,
      "psk cannot be null");
    vpnGatewayId = builder.vpnGatewayId;
    peerAddress = builder.peerAddress;
    psk = builder.psk;
    adminStateUp = builder.adminStateUp;
    name = builder.name;
    deadPeerDetection = builder.deadPeerDetection;
    ikePolicy = builder.ikePolicy;
    ipsecPolicy = builder.ipsecPolicy;
    localCidrs = builder.localCidrs;
    peerCidrs = builder.peerCidrs;
  }

  /**
   * New builder.
   *
   * @return a CreateVpnGatewayConnectionOptions builder
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
   * Gets the localCidrs.
   *
   * A collection of local CIDRs for this resource.
   *
   * @return the localCidrs
   */
  public List<String> localCidrs() {
    return localCidrs;
  }

  /**
   * Gets the peerCidrs.
   *
   * A collection of peer CIDRs for this resource.
   *
   * @return the peerCidrs
   */
  public List<String> peerCidrs() {
    return peerCidrs;
  }
}

