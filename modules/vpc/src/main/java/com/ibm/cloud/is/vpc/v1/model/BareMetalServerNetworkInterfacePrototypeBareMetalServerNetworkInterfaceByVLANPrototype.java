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
 * BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.
 */
public class BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype extends BareMetalServerNetworkInterfacePrototype {

  /**
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its array
   *    of `allowed_vlans`.
   *   - Must use an IEEE 802.1q tag.
   *   - Has its own security groups and does not inherit those of the PCI device through
   *     which traffic flows.
   *   - Not supported on bare metal servers with a `cpu.architecture` of `s390x`.
   */
  public interface InterfaceType {
    /** vlan. */
    String VLAN = "vlan";
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
    private Boolean allowInterfaceToFloat;
    private String interfaceType;
    private Long vlan;

    /**
     * Instantiates a new Builder from an existing BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype instance.
     *
     * @param bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype the instance to initialize the Builder with
     */
    public Builder(BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype) {
      this.allowIpSpoofing = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.allowIpSpoofing;
      this.enableInfrastructureNat = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.enableInfrastructureNat;
      this.name = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.name;
      this.primaryIp = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.primaryIp;
      this.securityGroups = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.securityGroups;
      this.subnet = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.subnet;
      this.allowInterfaceToFloat = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.allowInterfaceToFloat;
      this.interfaceType = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.interfaceType;
      this.vlan = bareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVlanPrototype.vlan;
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
     * @param vlan the vlan
     */
    public Builder(SubnetIdentity subnet, String interfaceType, Long vlan) {
      this.subnet = subnet;
      this.interfaceType = interfaceType;
      this.vlan = vlan;
    }

    /**
     * Builds a BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.
     *
     * @return the new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype instance
     */
    public BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype build() {
      return new BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype(this);
    }

    /**
     * Adds an securityGroups to securityGroups.
     *
     * @param securityGroups the new securityGroups
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
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
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder enableInfrastructureNat(Boolean enableInfrastructureNat) {
      this.enableInfrastructureNat = enableInfrastructureNat;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIp.
     *
     * @param primaryIp the primaryIp
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
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
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }

    /**
     * Set the allowInterfaceToFloat.
     *
     * @param allowInterfaceToFloat the allowInterfaceToFloat
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder allowInterfaceToFloat(Boolean allowInterfaceToFloat) {
      this.allowInterfaceToFloat = allowInterfaceToFloat;
      return this;
    }

    /**
     * Set the interfaceType.
     *
     * @param interfaceType the interfaceType
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder interfaceType(String interfaceType) {
      this.interfaceType = interfaceType;
      return this;
    }

    /**
     * Set the vlan.
     *
     * @param vlan the vlan
     * @return the BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
     */
    public Builder vlan(long vlan) {
      this.vlan = vlan;
      return this;
    }
  }

  protected BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype() { }

  protected BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.interfaceType,
      "interfaceType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vlan,
      "vlan cannot be null");
    allowIpSpoofing = builder.allowIpSpoofing;
    enableInfrastructureNat = builder.enableInfrastructureNat;
    name = builder.name;
    primaryIp = builder.primaryIp;
    securityGroups = builder.securityGroups;
    subnet = builder.subnet;
    allowInterfaceToFloat = builder.allowInterfaceToFloat;
    interfaceType = builder.interfaceType;
    vlan = builder.vlan;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

