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
 * BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype.
 */
public class BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype extends BareMetalServerNetworkInterfacePrototype {

  /**
   * The network interface type:
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the pci interface
   *   - Cannot directly use an IEEE 802.1q VLAN tag.
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its array
   *    of `allowed_vlans`.
   *   - Must use an IEEE 802.1q tag.
   *   - Has its own security groups and does not inherit those of the PCI device through
   *     which traffic flows.
   */
  public interface InterfaceType {
    /** pci. */
    String PCI = "pci";
    /** vlan. */
    String VLAN = "vlan";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowIpSpoofing;
    private Boolean enableInfrastructureNat;
    private String interfaceType;
    private String name;
    private String primaryIpv4Address;
    private List<SecurityGroupIdentity> securityGroups;
    private SubnetIdentity subnet;
    private List<Long> allowedVlans;

    public Builder(BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype) {
      this.allowIpSpoofing = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.allowIpSpoofing;
      this.enableInfrastructureNat = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.enableInfrastructureNat;
      this.interfaceType = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.interfaceType;
      this.name = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.name;
      this.primaryIpv4Address = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.primaryIpv4Address;
      this.securityGroups = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.securityGroups;
      this.subnet = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.subnet;
      this.allowedVlans = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPciPrototype.allowedVlans;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param interfaceType the interfaceType
     * @param subnet the subnet
     */
    public Builder(String interfaceType, SubnetIdentity subnet) {
      this.interfaceType = interfaceType;
      this.subnet = subnet;
    }

    /**
     * Builds a BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype.
     *
     * @return the new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype instance
     */
    public BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype build() {
      return new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype(this);
    }

    /**
     * Adds an securityGroups to securityGroups.
     *
     * @param securityGroups the new securityGroups
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
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
     * Adds an allowedVlans to allowedVlans.
     *
     * @param allowedVlans the new allowedVlans
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder addAllowedVlans(Long allowedVlans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedVlans,
        "allowedVlans cannot be null");
      if (this.allowedVlans == null) {
        this.allowedVlans = new ArrayList<Long>();
      }
      this.allowedVlans.add(allowedVlans);
      return this;
    }

    /**
     * Set the allowIpSpoofing.
     *
     * @param allowIpSpoofing the allowIpSpoofing
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder enableInfrastructureNat(Boolean enableInfrastructureNat) {
      this.enableInfrastructureNat = enableInfrastructureNat;
      return this;
    }

    /**
     * Set the interfaceType.
     *
     * @param interfaceType the interfaceType
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder interfaceType(String interfaceType) {
      this.interfaceType = interfaceType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIpv4Address.
     *
     * @param primaryIpv4Address the primaryIpv4Address
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder primaryIpv4Address(String primaryIpv4Address) {
      this.primaryIpv4Address = primaryIpv4Address;
      return this;
    }

    /**
     * Set the securityGroups.
     * Existing securityGroups will be replaced.
     *
     * @param securityGroups the securityGroups
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }

    /**
     * Set the allowedVlans.
     * Existing allowedVlans will be replaced.
     *
     * @param allowedVlans the allowedVlans
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
     */
    public Builder allowedVlans(List<Long> allowedVlans) {
      this.allowedVlans = allowedVlans;
      return this;
    }
  }

  protected BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.interfaceType,
      "interfaceType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    allowIpSpoofing = builder.allowIpSpoofing;
    enableInfrastructureNat = builder.enableInfrastructureNat;
    interfaceType = builder.interfaceType;
    name = builder.name;
    primaryIpv4Address = builder.primaryIpv4Address;
    securityGroups = builder.securityGroups;
    subnet = builder.subnet;
    allowedVlans = builder.allowedVlans;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

