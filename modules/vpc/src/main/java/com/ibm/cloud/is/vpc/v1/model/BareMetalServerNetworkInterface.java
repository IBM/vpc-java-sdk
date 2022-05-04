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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerNetworkInterface.
 *
 * Classes which extend this class:
 * - BareMetalServerNetworkInterfaceByPCI
 * - BareMetalServerNetworkInterfaceByVLAN
 */
public class BareMetalServerNetworkInterface extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "interface_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("pci", BareMetalServerNetworkInterfaceByPCI.class);
    discriminatorMapping.put("vlan", BareMetalServerNetworkInterfaceByVLAN.class);
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

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** network_interface. */
    String NETWORK_INTERFACE = "network_interface";
  }

  /**
   * The status of the network interface.
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
   * The type of this bare metal server network interface.
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

  protected BareMetalServerNetworkInterface() {
  }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this interface. If false, source IP spoofing is prevented on
   * this interface. If true, source IP spoofing is allowed on this interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean isAllowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the network interface was created.
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
  public Boolean isEnableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the floatingIps.
   *
   * The floating IPs associated with this network interface.
   *
   * @return the floatingIps
   */
  public List<FloatingIPReference> getFloatingIps() {
    return floatingIps;
  }

  /**
   * Gets the href.
   *
   * The URL for this network interface.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this network interface.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
  public String getInterfaceType() {
    return interfaceType;
  }

  /**
   * Gets the macAddress.
   *
   * The MAC address of the interface.  If absent, the value is not known.
   *
   * @return the macAddress
   */
  public String getMacAddress() {
    return macAddress;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this network interface.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the portSpeed.
   *
   * The network interface port speed in Mbps.
   *
   * @return the portSpeed
   */
  public Long getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the primaryIp.
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
   * The security groups targeting this network interface.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the status.
   *
   * The status of the network interface.
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
   * The type of this bare metal server network interface.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the allowedVlans.
   *
   * Indicates what VLAN IDs (for VLAN type only) can use this physical (PCI type) interface. A given VLAN can only be
   * in the `allowed_vlans` array for one PCI type adapter per bare metal server.
   *
   * @return the allowedVlans
   */
  public List<Long> getAllowedVlans() {
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
  public Boolean isAllowInterfaceToFloat() {
    return allowInterfaceToFloat;
  }

  /**
   * Gets the vlan.
   *
   * Indicates the 802.1Q VLAN ID tag that must be used for all traffic on this interface.
   *
   * @return the vlan
   */
  public Long getVlan() {
    return vlan;
  }
}

