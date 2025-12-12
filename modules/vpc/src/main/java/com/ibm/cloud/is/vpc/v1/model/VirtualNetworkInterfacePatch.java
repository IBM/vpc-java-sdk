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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VirtualNetworkInterfacePatch.
 */
public class VirtualNetworkInterfacePatch extends GenericModel {

  /**
   * The protocol state filtering mode to use for this virtual network interface. If
   * `auto`, protocol state packet filtering is enabled or disabled based on the virtual network interface's `target`
   * resource type:
   *
   * - `bare_metal_server_network_attachment`: disabled
   * - `instance_network_attachment`: enabled
   * - `share_mount_target`: enabled
   *
   * Must not be `disabled` if the virtual network interface's `target` resource type is
   * `share_mount_target`.
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
  protected String name;
  @SerializedName("protocol_state_filtering_mode")
  protected String protocolStateFilteringMode;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean allowIpSpoofing;
    private Boolean autoDelete;
    private Boolean enableInfrastructureNat;
    private String name;
    private String protocolStateFilteringMode;

    /**
     * Instantiates a new Builder from an existing VirtualNetworkInterfacePatch instance.
     *
     * @param virtualNetworkInterfacePatch the instance to initialize the Builder with
     */
    private Builder(VirtualNetworkInterfacePatch virtualNetworkInterfacePatch) {
      this.allowIpSpoofing = virtualNetworkInterfacePatch.allowIpSpoofing;
      this.autoDelete = virtualNetworkInterfacePatch.autoDelete;
      this.enableInfrastructureNat = virtualNetworkInterfacePatch.enableInfrastructureNat;
      this.name = virtualNetworkInterfacePatch.name;
      this.protocolStateFilteringMode = virtualNetworkInterfacePatch.protocolStateFilteringMode;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VirtualNetworkInterfacePatch.
     *
     * @return the new VirtualNetworkInterfacePatch instance
     */
    public VirtualNetworkInterfacePatch build() {
      return new VirtualNetworkInterfacePatch(this);
    }

    /**
     * Set the allowIpSpoofing.
     *
     * @param allowIpSpoofing the allowIpSpoofing
     * @return the VirtualNetworkInterfacePatch builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the autoDelete.
     *
     * @param autoDelete the autoDelete
     * @return the VirtualNetworkInterfacePatch builder
     */
    public Builder autoDelete(Boolean autoDelete) {
      this.autoDelete = autoDelete;
      return this;
    }

    /**
     * Set the enableInfrastructureNat.
     *
     * @param enableInfrastructureNat the enableInfrastructureNat
     * @return the VirtualNetworkInterfacePatch builder
     */
    public Builder enableInfrastructureNat(Boolean enableInfrastructureNat) {
      this.enableInfrastructureNat = enableInfrastructureNat;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VirtualNetworkInterfacePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the protocolStateFilteringMode.
     *
     * @param protocolStateFilteringMode the protocolStateFilteringMode
     * @return the VirtualNetworkInterfacePatch builder
     */
    public Builder protocolStateFilteringMode(String protocolStateFilteringMode) {
      this.protocolStateFilteringMode = protocolStateFilteringMode;
      return this;
    }
  }

  protected VirtualNetworkInterfacePatch() { }

  protected VirtualNetworkInterfacePatch(Builder builder) {
    allowIpSpoofing = builder.allowIpSpoofing;
    autoDelete = builder.autoDelete;
    enableInfrastructureNat = builder.enableInfrastructureNat;
    name = builder.name;
    protocolStateFilteringMode = builder.protocolStateFilteringMode;
  }

  /**
   * New builder.
   *
   * @return a VirtualNetworkInterfacePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this interface.
   *
   * Must be `false` if `target` is a file share mount target.
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
   * Gets the name.
   *
   * The name for this virtual network interface. The name must not be used by another virtual network interface in the
   * region. Names beginning with `ibm-` are reserved for provider-owned resources, and are not allowed.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Must not be `disabled` if the virtual network interface's `target` resource type is
   * `share_mount_target`.
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
   * Construct a JSON merge-patch from the VirtualNetworkInterfacePatch.
   *
   * Note that properties of the VirtualNetworkInterfacePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VirtualNetworkInterfacePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

