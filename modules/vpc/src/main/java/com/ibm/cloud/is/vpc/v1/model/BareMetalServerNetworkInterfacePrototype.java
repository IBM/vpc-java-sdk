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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerNetworkInterfacePrototype.
 *
 * Classes which extend this class:
 * - BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype
 * - BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype
 */
public class BareMetalServerNetworkInterfacePrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "interface_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("pci", BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype.class);
    discriminatorMapping.put("vlan", BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.class);
  }

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

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
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
  @SerializedName("allowed_vlans")
  protected List<Long> allowedVlans;
  @SerializedName("allow_interface_to_float")
  protected Boolean allowInterfaceToFloat;
  protected Long vlan;

  protected BareMetalServerNetworkInterfacePrototype() {
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
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its array
   *    of `allowed_vlans`.
   *   - Must use an IEEE 802.1q tag.
   *   - Has its own security groups and does not inherit those of the PCI device through
   *     which traffic flows.
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
   * Gets the allowInterfaceToFloat.
   *
   * Indicates if the interface can float to any other server within the same
   * `resource_group`. The interface will float automatically if the network detects a GARP or RARP on another bare
   * metal server in the resource group.  Applies only to `vlan` type interfaces.
   *
   * @return the allowInterfaceToFloat
   */
  public Boolean allowInterfaceToFloat() {
    return allowInterfaceToFloat;
  }

  /**
   * Gets the vlan.
   *
   * Indicates the 802.1Q VLAN ID tag that must be used for all traffic on this interface.
   *
   * @return the vlan
   */
  public Long vlan() {
    return vlan;
  }
}

