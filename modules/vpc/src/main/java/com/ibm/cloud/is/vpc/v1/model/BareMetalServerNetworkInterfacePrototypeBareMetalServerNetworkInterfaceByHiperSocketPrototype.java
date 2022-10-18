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
 * BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.
 */
public class BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype extends BareMetalServerNetworkInterfacePrototype {

  /**
   * - `hipersocket`: a virtual network device that provides high-speed TCP/IP connectivity
   *   within a `s390x` based system.
   *   - Not supported on bare metal servers with a `cpu.architecture` of `amd64`.
   */
  public interface InterfaceType {
    /** hipersocket. */
    String HIPERSOCKET = "hipersocket";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowIpSpoofing;
    private Boolean enableInfrastructureNat;
    private String name;
    private NetworkInterfaceIPPrototype primaryIp;
    private List<SecurityGroupIdentity> securityGroups;
    private SubnetIdentity subnet;
    private String interfaceType;

    /**
     * Instantiates a new Builder from an existing BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype instance.
     *
     * @param bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype the instance to initialize the Builder with
     */
    public Builder(BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype) {
      this.allowIpSpoofing = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.allowIpSpoofing;
      this.enableInfrastructureNat = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.enableInfrastructureNat;
      this.name = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.name;
      this.primaryIp = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.primaryIp;
      this.securityGroups = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.securityGroups;
      this.subnet = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.subnet;
      this.interfaceType = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.interfaceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnet the subnet
     * @param interfaceType the interfaceType
     */
    public Builder(SubnetIdentity subnet, String interfaceType) {
      this.subnet = subnet;
      this.interfaceType = interfaceType;
    }

    /**
     * Builds a BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.
     *
     * @return the new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype instance
     */
    public BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype build() {
      return new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype(this);
    }

    /**
     * Adds an securityGroups to securityGroups.
     *
     * @param securityGroups the new securityGroups
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder addSecurityGroups(SecurityGroupIdentity securityGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(securityGroups,
        "securityGroups cannot be null");
      if (this.securityGroups == null) {
        this.securityGroups = new ArrayList<SecurityGroupIdentity>();
      }
      this.securityGroups.add(securityGroups);
      return this;
    }

    /**
     * Set the allowIpSpoofing.
     *
     * @param allowIpSpoofing the allowIpSpoofing
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder enableInfrastructureNat(Boolean enableInfrastructureNat) {
      this.enableInfrastructureNat = enableInfrastructureNat;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIp.
     *
     * @param primaryIp the primaryIp
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder primaryIp(NetworkInterfaceIPPrototype primaryIp) {
      this.primaryIp = primaryIp;
      return this;
    }

    /**
     * Set the securityGroups.
     * Existing securityGroups will be replaced.
     *
     * @param securityGroups the securityGroups
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }

    /**
     * Set the interfaceType.
     *
     * @param interfaceType the interfaceType
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
     */
    public Builder interfaceType(String interfaceType) {
      this.interfaceType = interfaceType;
      return this;
    }
  }

  protected BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype() { }

  protected BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.interfaceType,
      "interfaceType cannot be null");
    allowIpSpoofing = builder.allowIpSpoofing;
    enableInfrastructureNat = builder.enableInfrastructureNat;
    name = builder.name;
    primaryIp = builder.primaryIp;
    securityGroups = builder.securityGroups;
    subnet = builder.subnet;
    interfaceType = builder.interfaceType;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

