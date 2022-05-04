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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerPrimaryNetworkInterfacePrototype.
 */
public class BareMetalServerPrimaryNetworkInterfacePrototype extends GenericModel {

  /**
   * The network interface type:
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the pci interface
   *   - Cannot directly use an IEEE 802.1q VLAN tag.
   */
  public interface InterfaceType {
    /** pci. */
    String PCI = "pci";
  }

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  @SerializedName("allowed_vlans")
  protected List<Long> allowedVlans;
  @SerializedName("enable_infrastructure_nat")
  protected Boolean enableInfrastructureNat;
  @SerializedName("interface_type")
  protected String interfaceType;
  protected String name;
  @SerializedName("primary_ip")
  protected NetworkInterfaceIPPrototype primaryIp;
  @SerializedName("security_groups")
  protected List<SecurityGroupIdentity> securityGroups;
  protected SubnetIdentity subnet;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowIpSpoofing;
    private List<Long> allowedVlans;
    private Boolean enableInfrastructureNat;
    private String interfaceType;
    private String name;
    private NetworkInterfaceIPPrototype primaryIp;
    private List<SecurityGroupIdentity> securityGroups;
    private SubnetIdentity subnet;

    private Builder(BareMetalServerPrimaryNetworkInterfacePrototype bareMetalServerPrimaryNetworkInterfacePrototype) {
      this.allowIpSpoofing = bareMetalServerPrimaryNetworkInterfacePrototype.allowIpSpoofing;
      this.allowedVlans = bareMetalServerPrimaryNetworkInterfacePrototype.allowedVlans;
      this.enableInfrastructureNat = bareMetalServerPrimaryNetworkInterfacePrototype.enableInfrastructureNat;
      this.interfaceType = bareMetalServerPrimaryNetworkInterfacePrototype.interfaceType;
      this.name = bareMetalServerPrimaryNetworkInterfacePrototype.name;
      this.primaryIp = bareMetalServerPrimaryNetworkInterfacePrototype.primaryIp;
      this.securityGroups = bareMetalServerPrimaryNetworkInterfacePrototype.securityGroups;
      this.subnet = bareMetalServerPrimaryNetworkInterfacePrototype.subnet;
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
     */
    public Builder(SubnetIdentity subnet) {
      this.subnet = subnet;
    }

    /**
     * Builds a BareMetalServerPrimaryNetworkInterfacePrototype.
     *
     * @return the new BareMetalServerPrimaryNetworkInterfacePrototype instance
     */
    public BareMetalServerPrimaryNetworkInterfacePrototype build() {
      return new BareMetalServerPrimaryNetworkInterfacePrototype(this);
    }

    /**
     * Adds an allowedVlans to allowedVlans.
     *
     * @param allowedVlans the new allowedVlans
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
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
     * Adds an securityGroups to securityGroups.
     *
     * @param securityGroups the new securityGroups
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
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
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the allowedVlans.
     * Existing allowedVlans will be replaced.
     *
     * @param allowedVlans the allowedVlans
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
     */
    public Builder allowedVlans(List<Long> allowedVlans) {
      this.allowedVlans = allowedVlans;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
     */
    public Builder enableInfrastructureNat(Boolean enableInfrastructureNat) {
      this.enableInfrastructureNat = enableInfrastructureNat;
      return this;
    }

    /**
     * Set the interfaceType.
     *
     * @param interfaceType the interfaceType
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
     */
    public Builder interfaceType(String interfaceType) {
      this.interfaceType = interfaceType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIp.
     *
     * @param primaryIp the primaryIp
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
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
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the BareMetalServerPrimaryNetworkInterfacePrototype builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }
  }

  protected BareMetalServerPrimaryNetworkInterfacePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    allowIpSpoofing = builder.allowIpSpoofing;
    allowedVlans = builder.allowedVlans;
    enableInfrastructureNat = builder.enableInfrastructureNat;
    interfaceType = builder.interfaceType;
    name = builder.name;
    primaryIp = builder.primaryIp;
    securityGroups = builder.securityGroups;
    subnet = builder.subnet;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerPrimaryNetworkInterfacePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this interface. If false, source IP spoofing is prevented on
   * this interface. If true, source IP spoofing is allowed on this interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean allowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the allowedVlans.
   *
   * Indicates what VLAN IDs (for VLAN type only) can use this physical (PCI type) interface. A given VLAN can only be
   * in the `allowed_vlans` array for one PCI type adapter per bare metal server.
   *
   * @return the allowedVlans
   */
  public List<Long> allowedVlans() {
    return allowedVlans;
  }

  /**
   * Gets the enableInfrastructureNat.
   *
   * If `true`:
   *    - The VPC infrastructure performs any needed NAT operations.
   *    - A single floating IP can be assigned to the network interface.
   *
   * If `false`:
   *    - The packet is passed unmodified to/from the network interface,
   *      allowing the workload to perform any needed NAT operations.
   *    - Multiple floating IPs can be assigned to the network interface.
   *    - `allow_ip_spoofing` must be set to `false`.
   *
   * @return the enableInfrastructureNat
   */
  public Boolean enableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the interfaceType.
   *
   * The network interface type:
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the pci interface
   *   - Cannot directly use an IEEE 802.1q VLAN tag.
   *
   * @return the interfaceType
   */
  public String interfaceType() {
    return interfaceType;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for network interface. Names must be unique within the instance the network interface resides
   * in. If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address to bind to the network interface. This can be specified using
   * an existing reserved IP, or a prototype object for a new reserved IP.
   *
   * If an existing reserved IP or a prototype object with an address is specified, it must
   * be available on the network interface's subnet. Otherwise, an available address on the
   * subnet will be automatically selected and reserved.
   *
   * @return the primaryIp
   */
  public NetworkInterfaceIPPrototype primaryIp() {
    return primaryIp;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups to use for this network interface. If unspecified, the VPC's default security group is used.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupIdentity> securityGroups() {
    return securityGroups;
  }

  /**
   * Gets the subnet.
   *
   * The associated subnet.
   *
   * @return the subnet
   */
  public SubnetIdentity subnet() {
    return subnet;
  }
}

