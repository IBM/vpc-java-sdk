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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerNetworkInterfacePrototype.
 *
 * Classes which extend this class:
 * - BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype
 * - BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype
 * - BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype
 */
public class BareMetalServerNetworkInterfacePrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "interface_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("hipersocket", BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByHiperSocketPrototype.class);
    discriminatorMapping.put("pci", BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByPCIPrototype.class);
    discriminatorMapping.put("vlan", BareMetalServerNetworkInterfacePrototypeBareMetalServerNetworkInterfaceByVLANPrototype.class);
  }

  /**
   * The interface type:
   * - `hipersocket`: a virtual device that provides high-speed TCP/IP connectivity
   *   within a `s390x` based system
   *   - Not supported on bare metal servers with a `cpu.architecture` of `amd64`
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI interface
   *   - Cannot directly use an IEEE 802.1Q tag.
   *   - Not supported on bare metal servers with a `cpu.architecture` of `s390x`
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its
   *   array of `allowed_vlans`.
   *   - Must use an IEEE 802.1Q tag.
   *   - Has its own security groups and does not inherit those of the PCI device through
   *     which traffic flows.
   *   - Not supported on bare metal servers with a `cpu.architecture` of `s390x`.
   */
  public interface InterfaceType {
    /** hipersocket. */
    String HIPERSOCKET = "hipersocket";
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

  protected BareMetalServerNetworkInterfacePrototype() { }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and source IP spoofing is managed on
   * the attached virtual network interface.
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
   * - The VPC infrastructure performs any needed NAT operations.
   * - `floating_ips` must not have more than one floating IP.
   *
   * If `false`:
   * - Packets are passed unchanged to/from the bare metal server network interface,
   *   allowing the workload to perform any needed NAT operations.
   * - `allow_ip_spoofing` must be `false`.
   * - `interface_type` must not be `hipersocket`.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and infrastructure NAT is managed on
   * the attached virtual network interface.
   *
   * @return the enableInfrastructureNat
   */
  public Boolean enableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the interfaceType.
   *
   * The interface type:
   * - `hipersocket`: a virtual device that provides high-speed TCP/IP connectivity
   *   within a `s390x` based system
   *   - Not supported on bare metal servers with a `cpu.architecture` of `amd64`
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI interface
   *   - Cannot directly use an IEEE 802.1Q tag.
   *   - Not supported on bare metal servers with a `cpu.architecture` of `s390x`
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its
   *   array of `allowed_vlans`.
   *   - Must use an IEEE 802.1Q tag.
   *   - Has its own security groups and does not inherit those of the PCI device through
   *     which traffic flows.
   *   - Not supported on bare metal servers with a `cpu.architecture` of `s390x`.
   *
   * @return the interfaceType
   */
  public String interfaceType() {
    return interfaceType;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server network interface. The name must not be used by another network interface on
   * the bare metal server. If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address to bind to the bare metal server network interface. This can be
   * specified using an existing reserved IP, or a prototype object for a new reserved IP.
   *
   * If an existing reserved IP or a prototype object with an address is specified, it must
   * be available on the bare metal server network interface's subnet. Otherwise, an
   * available address on the subnet will be automatically selected and reserved.
   *
   * @return the primaryIp
   */
  public NetworkInterfaceIPPrototype primaryIp() {
    return primaryIp;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups to use for this bare metal server network interface. If unspecified, the VPC's default security
   * group is used.
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
   * The VLAN IDs to allow for `vlan` interfaces using this PCI interface.
   *
   * @return the allowedVlans
   */
  public List<Long> allowedVlans() {
    return allowedVlans;
  }

  /**
   * Gets the allowInterfaceToFloat.
   *
   * Indicates if the data path for the network interface can float to another bare metal server. Can only be `true` for
   * network interfaces with an `interface_type` of `vlan`.
   *
   * If `true`, and the network detects traffic for this data path on another bare metal server in the resource group,
   * the network interface will be automatically deleted from this bare metal server and a new network interface with
   * the same `id`, `name` and `vlan` will be created on the other bare metal server.
   *
   * For the data path to float, the other bare metal server must be in the same
   * `resource_group`, and must have a network interface with `interface_type` of `pci` with `allowed_vlans` including
   * this network interface's `vlan`.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the value of this property matches
   * that of the `allow_to_float` property of the corresponding network attachment.
   *
   * @return the allowInterfaceToFloat
   */
  public Boolean allowInterfaceToFloat() {
    return allowInterfaceToFloat;
  }

  /**
   * Gets the vlan.
   *
   * The VLAN ID used in the IEEE 802.1Q tag present in all traffic on this interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the VLAN ID matches the `vlan` of
   * the corresponding network attachment.
   *
   * @return the vlan
   */
  public Long vlan() {
    return vlan;
  }
}

