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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVirtualNetworkInterface options.
 */
public class CreateVirtualNetworkInterfaceOptions extends GenericModel {

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

  protected Boolean allowIpSpoofing;
  protected Boolean autoDelete;
  protected Boolean enableInfrastructureNat;
  protected List<VirtualNetworkInterfaceIPPrototype> ips;
  protected String name;
  protected VirtualNetworkInterfacePrimaryIPPrototype primaryIp;
  protected String protocolStateFilteringMode;
  protected ResourceGroupIdentity resourceGroup;
  protected List<SecurityGroupIdentity> securityGroups;
  protected SubnetIdentity subnet;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowIpSpoofing;
    private Boolean autoDelete;
    private Boolean enableInfrastructureNat;
    private List<VirtualNetworkInterfaceIPPrototype> ips;
    private String name;
    private VirtualNetworkInterfacePrimaryIPPrototype primaryIp;
    private String protocolStateFilteringMode;
    private ResourceGroupIdentity resourceGroup;
    private List<SecurityGroupIdentity> securityGroups;
    private SubnetIdentity subnet;

    /**
     * Instantiates a new Builder from an existing CreateVirtualNetworkInterfaceOptions instance.
     *
     * @param createVirtualNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(CreateVirtualNetworkInterfaceOptions createVirtualNetworkInterfaceOptions) {
      this.allowIpSpoofing = createVirtualNetworkInterfaceOptions.allowIpSpoofing;
      this.autoDelete = createVirtualNetworkInterfaceOptions.autoDelete;
      this.enableInfrastructureNat = createVirtualNetworkInterfaceOptions.enableInfrastructureNat;
      this.ips = createVirtualNetworkInterfaceOptions.ips;
      this.name = createVirtualNetworkInterfaceOptions.name;
      this.primaryIp = createVirtualNetworkInterfaceOptions.primaryIp;
      this.protocolStateFilteringMode = createVirtualNetworkInterfaceOptions.protocolStateFilteringMode;
      this.resourceGroup = createVirtualNetworkInterfaceOptions.resourceGroup;
      this.securityGroups = createVirtualNetworkInterfaceOptions.securityGroups;
      this.subnet = createVirtualNetworkInterfaceOptions.subnet;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateVirtualNetworkInterfaceOptions.
     *
     * @return the new CreateVirtualNetworkInterfaceOptions instance
     */
    public CreateVirtualNetworkInterfaceOptions build() {
      return new CreateVirtualNetworkInterfaceOptions(this);
    }

    /**
     * Adds a new element to ips.
     *
     * @param ips the new element to be added
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder addIps(VirtualNetworkInterfaceIPPrototype ips) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(ips,
        "ips cannot be null");
      if (this.ips == null) {
        this.ips = new ArrayList<VirtualNetworkInterfaceIPPrototype>();
      }
      this.ips.add(ips);
      return this;
    }

    /**
     * Adds a new element to securityGroups.
     *
     * @param securityGroups the new element to be added
     * @return the CreateVirtualNetworkInterfaceOptions builder
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
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder enableInfrastructureNat(Boolean enableInfrastructureNat) {
      this.enableInfrastructureNat = enableInfrastructureNat;
      return this;
    }

    /**
     * Set the ips.
     * Existing ips will be replaced.
     *
     * @param ips the ips
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder ips(List<VirtualNetworkInterfaceIPPrototype> ips) {
      this.ips = ips;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIp.
     *
     * @param primaryIp the primaryIp
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder primaryIp(VirtualNetworkInterfacePrimaryIPPrototype primaryIp) {
      this.primaryIp = primaryIp;
      return this;
    }

    /**
     * Set the protocolStateFilteringMode.
     *
     * @param protocolStateFilteringMode the protocolStateFilteringMode
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder protocolStateFilteringMode(String protocolStateFilteringMode) {
      this.protocolStateFilteringMode = protocolStateFilteringMode;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the securityGroups.
     * Existing securityGroups will be replaced.
     *
     * @param securityGroups the securityGroups
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the CreateVirtualNetworkInterfaceOptions builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }
  }

  protected CreateVirtualNetworkInterfaceOptions() { }

  protected CreateVirtualNetworkInterfaceOptions(Builder builder) {
    allowIpSpoofing = builder.allowIpSpoofing;
    autoDelete = builder.autoDelete;
    enableInfrastructureNat = builder.enableInfrastructureNat;
    ips = builder.ips;
    name = builder.name;
    primaryIp = builder.primaryIp;
    protocolStateFilteringMode = builder.protocolStateFilteringMode;
    resourceGroup = builder.resourceGroup;
    securityGroups = builder.securityGroups;
    subnet = builder.subnet;
  }

  /**
   * New builder.
   *
   * @return a CreateVirtualNetworkInterfaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

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
   * `target` is deleted. Must be `false` if the virtual network interface is unbound.
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
   * Additional IP addresses to bind to the virtual network interface. Each item may be either a reserved IP identity,
   * or a reserved IP prototype object which will be used to create a new reserved IP. All IP addresses must be in the
   * primary IP's subnet.
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
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
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
}

