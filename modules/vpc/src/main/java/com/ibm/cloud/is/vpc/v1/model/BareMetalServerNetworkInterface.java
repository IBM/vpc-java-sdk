/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerNetworkInterface.
 *
 * Classes which extend this class:
 * - BareMetalServerNetworkInterfaceByHiperSocket
 * - BareMetalServerNetworkInterfaceByPCI
 * - BareMetalServerNetworkInterfaceByVLAN
 */
public class BareMetalServerNetworkInterface extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "interface_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("hipersocket", BareMetalServerNetworkInterfaceByHiperSocket.class);
    discriminatorMapping.put("pci", BareMetalServerNetworkInterfaceByPCI.class);
    discriminatorMapping.put("vlan", BareMetalServerNetworkInterfaceByVLAN.class);
  }
  /**
   * The interface type:
   * - `hipersocket`: a virtual device that provides high-speed TCP/IP connectivity
   *   within a `s390x` based system
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI interface
   *   - Cannot directly use an IEEE 802.1Q tag.
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its
   *   array of `allowed_vlans`.
   *   - Must use an IEEE 802.1Q tag.
   *   - Has its own security groups and does not inherit those of the PCI device through
   *     which traffic flows.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the interface type is that of the
   * corresponding network attachment.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface InterfaceType {
    /** hipersocket. */
    String HIPERSOCKET = "hipersocket";
    /** pci. */
    String PCI = "pci";
    /** vlan. */
    String VLAN = "vlan";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** network_interface. */
    String NETWORK_INTERFACE = "network_interface";
  }

  /**
   * The status of the bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a read-only representation of its
   * corresponding network attachment and its attached virtual network interface, and the status is [computed from
   * them](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients).
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
  }

  /**
   * The bare metal server network interface type.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the type is that of its
   * corresponding network attachment.
   */
  public interface Type {
    /** primary. */
    String PRIMARY = "primary";
    /** secondary. */
    String SECONDARY = "secondary";
  }

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("enable_infrastructure_nat")
  protected Boolean enableInfrastructureNat;
  @SerializedName("floating_ips")
  protected List<FloatingIPReference> floatingIps;
  protected String href;
  protected String id;
  @SerializedName("interface_type")
  protected String interfaceType;
  @SerializedName("mac_address")
  protected String macAddress;
  protected String name;
  @SerializedName("port_speed")
  protected Long portSpeed;
  @SerializedName("primary_ip")
  protected ReservedIPReference primaryIp;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("security_groups")
  protected List<SecurityGroupReference> securityGroups;
  protected String status;
  protected SubnetReference subnet;
  protected String type;
  @SerializedName("allowed_vlans")
  protected List<Long> allowedVlans;
  @SerializedName("allow_interface_to_float")
  protected Boolean allowInterfaceToFloat;
  protected Long vlan;

  protected BareMetalServerNetworkInterface() { }

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
  public Boolean isAllowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the bare metal server network interface was created.
   *
   * If this bare metal server has network attachments, this network interface was created as a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) when its corresponding
   * network attachment was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
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
  public Boolean isEnableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the floatingIps.
   *
   * The floating IPs associated with this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the floating IPs are associated
   * with the attached virtual network interface.
   *
   * @return the floatingIps
   */
  public List<FloatingIPReference> getFloatingIps() {
    return floatingIps;
  }

  /**
   * Gets the href.
   *
   * The URL for this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the identifier is that of the
   * corresponding network attachment.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the interfaceType.
   *
   * The interface type:
   * - `hipersocket`: a virtual device that provides high-speed TCP/IP connectivity
   *   within a `s390x` based system
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI interface
   *   - Cannot directly use an IEEE 802.1Q tag.
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its
   *   array of `allowed_vlans`.
   *   - Must use an IEEE 802.1Q tag.
   *   - Has its own security groups and does not inherit those of the PCI device through
   *     which traffic flows.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the interface type is that of the
   * corresponding network attachment.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the interfaceType
   */
  public String getInterfaceType() {
    return interfaceType;
  }

  /**
   * Gets the macAddress.
   *
   * The MAC address of this bare metal server network interface. If the MAC address has not yet been selected, the
   * value will be empty.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the MAC address is that of the
   * attached virtual network interface.
   *
   * @return the macAddress
   */
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the name matches its corresponding
   * network attachment.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the portSpeed.
   *
   * The bare metal server network interface port speed in Mbps.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the port speed is that of its
   * corresponding network attachment.
   *
   * @return the portSpeed
   */
  public Long getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address of this bare metal server network interface.
   *
   * @return the primaryIp
   */
  public ReservedIPReference getPrimaryIp() {
    return primaryIp;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups targeting this bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the security groups are associated
   * with the attached virtual network interface.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the status.
   *
   * The status of the bare metal server network interface.
   *
   * If this bare metal server has network attachments, this network interface is a read-only representation of its
   * corresponding network attachment and its attached virtual network interface, and the status is [computed from
   * them](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients).
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the subnet.
   *
   * The associated subnet.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the type.
   *
   * The bare metal server network interface type.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the type is that of its
   * corresponding network attachment.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the allowedVlans.
   *
   * The VLAN IDs allowed for `vlan` interfaces using this PCI interface.
   *
   * If this bare metal server has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the VLAN IDs match the
   * `allow_vlans` of the corresponding network attachment.
   *
   * @return the allowedVlans
   */
  public List<Long> getAllowedVlans() {
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
  public Boolean isAllowInterfaceToFloat() {
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
  public Long getVlan() {
    return vlan;
  }
}

