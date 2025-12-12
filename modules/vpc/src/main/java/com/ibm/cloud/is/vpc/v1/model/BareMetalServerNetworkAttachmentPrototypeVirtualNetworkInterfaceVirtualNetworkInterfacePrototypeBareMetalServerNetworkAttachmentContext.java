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

import java.util.ArrayList;
import java.util.List;

/**
 * The virtual network interface for this target.
 */
public class BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext extends BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface {

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
     * Instantiates a new Builder from an existing BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext instance.
     *
     * @param bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext the instance to initialize the Builder with
     */
    public Builder(BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext) {
      this.allowIpSpoofing = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.allowIpSpoofing;
      this.autoDelete = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.autoDelete;
      this.enableInfrastructureNat = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.enableInfrastructureNat;
      this.ips = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.ips;
      this.name = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.name;
      this.primaryIp = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.primaryIp;
      this.protocolStateFilteringMode = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.protocolStateFilteringMode;
      this.resourceGroup = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.resourceGroup;
      this.securityGroups = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.securityGroups;
      this.subnet = bareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.subnet;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext.
     *
     * @return the new BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext instance
     */
    public BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext build() {
      return new BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext(this);
    }

    /**
     * Adds a new element to ips.
     *
     * @param ips the new element to be added
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
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
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
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
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
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
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder ips(List<VirtualNetworkInterfaceIPPrototype> ips) {
      this.ips = ips;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIp.
     *
     * @param primaryIp the primaryIp
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder primaryIp(VirtualNetworkInterfacePrimaryIPPrototype primaryIp) {
      this.primaryIp = primaryIp;
      return this;
    }

    /**
     * Set the protocolStateFilteringMode.
     *
     * @param protocolStateFilteringMode the protocolStateFilteringMode
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder protocolStateFilteringMode(String protocolStateFilteringMode) {
      this.protocolStateFilteringMode = protocolStateFilteringMode;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
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
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }
  }

  protected BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext() { }

  protected BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext(Builder builder) {
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
   * @return a BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterfaceVirtualNetworkInterfacePrototypeBareMetalServerNetworkAttachmentContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

