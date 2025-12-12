/*
 * (C) Copyright IBM Corp. 2025.
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
 * A virtual network interface for the instance network attachment. This can be specified using an existing virtual
 * network interface, or a prototype object for a new virtual network interface.
 *
 * If an existing virtual network interface is specified, `enable_infrastructure_nat` must be
 * `true`.
 *
 * Classes which extend this class:
 * - InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeInstanceNetworkAttachmentContext
 * - InstanceNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfaceIdentity
 */
public class InstanceNetworkAttachmentPrototypeVirtualNetworkInterface extends GenericModel {

  /**
   * The protocol state filtering mode to use for this virtual network interface. If
   * `auto`, protocol state packet filtering is enabled or disabled based on the virtual network interface's `target`
   * resource type:
   *
   * - `bare_metal_server_network_attachment`: disabled
   * - `instance_network_attachment`: enabled
   * - `share_mount_target`: enabled
   *
   * Protocol state filtering monitors each network connection flowing over this virtual network interface, and drops
   * any packets that are invalid based on the current connection state and protocol. See [Protocol state filtering
   * mode](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#protocol-state-filtering) for more information.
   */
  public interface ProtocolStateFilteringMode {
    /** auto. */
    String AUTO = "auto";
    /** disabled. */
    String DISABLED = "disabled";
    /** enabled. */
    String ENABLED = "enabled";
  }

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("enable_infrastructure_nat")
  protected Boolean enableInfrastructureNat;
  protected List<VirtualNetworkInterfaceIPPrototype> ips;
  protected String name;
  @SerializedName("primary_ip")
  protected VirtualNetworkInterfacePrimaryIPPrototype primaryIp;
  @SerializedName("protocol_state_filtering_mode")
  protected String protocolStateFilteringMode;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("security_groups")
  protected List<SecurityGroupIdentity> securityGroups;
  protected SubnetIdentity subnet;
  protected String id;
  protected String href;
  protected String crn;

  protected InstanceNetworkAttachmentPrototypeVirtualNetworkInterface() { }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this interface. If `false`, source IP spoofing is prevented on
   * this interface. If `true`, source IP spoofing is allowed on this interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean allowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this virtual network interface will be automatically deleted when
   * `target` is deleted.
   *
   * @return the autoDelete
   */
  public Boolean autoDelete() {
    return autoDelete;
  }

  /**
   * Gets the enableInfrastructureNat.
   *
   * If `true`:
   * - The VPC infrastructure performs any needed NAT operations.
   * - `floating_ips` must not have more than one floating IP.
   *
   * If `false`:
   * - Packets are passed unchanged to/from the virtual network interface,
   *   allowing the workload to perform any needed NAT operations.
   * - `allow_ip_spoofing` must be `false`.
   * - Can only be attached to a `target` with a `resource_type` of
   *   `bare_metal_server_network_attachment`.
   *
   * @return the enableInfrastructureNat
   */
  public Boolean enableInfrastructureNat() {
    return enableInfrastructureNat;
  }

  /**
   * Gets the ips.
   *
   * The additional IP addresses to bind to the virtual network interface. Each item may be either a reserved IP
   * identity, or a reserved IP prototype object which will be used to create a new reserved IP. All IP addresses must
   * be in the primary IP's subnet.
   *
   * If reserved IP identities are provided, the specified reserved IPs must be unbound.
   *
   * If reserved IP prototype objects with addresses are provided, the addresses must be available on the virtual
   * network interface's subnet. For any prototype objects that do not specify an address, an available address on the
   * subnet will be automatically selected and reserved.
   *
   * @return the ips
   */
  public List<VirtualNetworkInterfaceIPPrototype> ips() {
    return ips;
  }

  /**
   * Gets the name.
   *
   * The name for this virtual network interface. The name must not be used by another virtual network interface in the
   * VPC. If unspecified, the name will be a hyphenated list of randomly-selected words. Names beginning with `ibm-` are
   * reserved for provider-owned resources, and are not allowed.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address to bind to the virtual network interface. May be either a
   * reserved IP identity, or a reserved IP prototype object which will be used to create a
   * new reserved IP.
   *
   * If a reserved IP identity is provided, the specified reserved IP must be unbound.
   *
   * If a reserved IP prototype object with an address is provided, the address must be
   * available on the virtual network interface's subnet. If no address is specified,
   * an available address on the subnet will be automatically selected and reserved.
   *
   * @return the primaryIp
   */
  public VirtualNetworkInterfacePrimaryIPPrototype primaryIp() {
    return primaryIp;
  }

  /**
   * Gets the protocolStateFilteringMode.
   *
   * The protocol state filtering mode to use for this virtual network interface. If
   * `auto`, protocol state packet filtering is enabled or disabled based on the virtual network interface's `target`
   * resource type:
   *
   * - `bare_metal_server_network_attachment`: disabled
   * - `instance_network_attachment`: enabled
   * - `share_mount_target`: enabled
   *
   * Protocol state filtering monitors each network connection flowing over this virtual network interface, and drops
   * any packets that are invalid based on the current connection state and protocol. See [Protocol state filtering
   * mode](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#protocol-state-filtering) for more information.
   *
   * @return the protocolStateFilteringMode
   */
  public String protocolStateFilteringMode() {
    return protocolStateFilteringMode;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use for this virtual network interface. If unspecified, the
   * virtual server instance's resource group will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the securityGroups.
   *
   * The security groups to use for this virtual network interface. If unspecified, the default security group of the
   * VPC for the subnet is used.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupIdentity> securityGroups() {
    return securityGroups;
  }

  /**
   * Gets the subnet.
   *
   * The associated subnet. Required if `primary_ip` does not specify a reserved IP
   * identity.
   *
   * @return the subnet
   */
  public SubnetIdentity subnet() {
    return subnet;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this virtual network interface.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this virtual network interface.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this virtual network interface.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

