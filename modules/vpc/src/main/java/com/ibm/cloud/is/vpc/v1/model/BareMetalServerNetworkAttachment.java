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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerNetworkAttachment.
 *
 * Classes which extend this class:
 * - BareMetalServerNetworkAttachmentByPCI
 * - BareMetalServerNetworkAttachmentByVLAN
 */
public class BareMetalServerNetworkAttachment extends GenericModel {

  /**
   * The network attachment's interface type:
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI attachment
   *   - Cannot directly use an IEEE 802.1Q tag.
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its
   *   array of `allowed_vlans`.
   *   - Must use an IEEE 802.1Q tag.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface InterfaceType {
    /** pci. */
    String PCI = "pci";
    /** vlan. */
    String VLAN = "vlan";
  }

  /**
   * The lifecycle state of the bare metal server network attachment.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** bare_metal_server_network_attachment. */
    String BARE_METAL_SERVER_NETWORK_ATTACHMENT = "bare_metal_server_network_attachment";
  }

  /**
   * The bare metal server network attachment type.
   */
  public interface Type {
    /** primary. */
    String PRIMARY = "primary";
    /** secondary. */
    String SECONDARY = "secondary";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("interface_type")
  protected String interfaceType;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("port_speed")
  protected Long portSpeed;
  @SerializedName("primary_ip")
  protected ReservedIPReference primaryIp;
  @SerializedName("resource_type")
  protected String resourceType;
  protected SubnetReference subnet;
  protected String type;
  @SerializedName("virtual_network_interface")
  protected VirtualNetworkInterfaceReferenceAttachmentContext virtualNetworkInterface;
  @SerializedName("allowed_vlans")
  protected List<Long> allowedVlans;
  @SerializedName("allow_to_float")
  protected Boolean allowToFloat;
  protected Long vlan;

  protected BareMetalServerNetworkAttachment() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the bare metal server network attachment was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this bare metal server network attachment.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this bare metal server network attachment.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the interfaceType.
   *
   * The network attachment's interface type:
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI attachment
   *   - Cannot directly use an IEEE 802.1Q tag.
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its
   *   array of `allowed_vlans`.
   *   - Must use an IEEE 802.1Q tag.
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
   * Gets the lifecycleState.
   *
   * The lifecycle state of the bare metal server network attachment.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server network attachment. The name is unique across all network attachments for the
   * bare metal server.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the portSpeed.
   *
   * The port speed for this bare metal server network attachment in Mbps.
   *
   * @return the portSpeed
   */
  public Long getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address of the virtual network interface for the bare metal server
   * network attachment.
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
   * Gets the subnet.
   *
   * The subnet of the virtual network interface for the bare metal server network
   * attachment.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the type.
   *
   * The bare metal server network attachment type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the virtualNetworkInterface.
   *
   * The virtual network interface for this bare metal server network attachment.
   *
   * @return the virtualNetworkInterface
   */
  public VirtualNetworkInterfaceReferenceAttachmentContext getVirtualNetworkInterface() {
    return virtualNetworkInterface;
  }

  /**
   * Gets the allowedVlans.
   *
   * The VLAN IDs allowed for `vlan` attachments using this PCI attachment.
   *
   * @return the allowedVlans
   */
  public List<Long> getAllowedVlans() {
    return allowedVlans;
  }

  /**
   * Gets the allowToFloat.
   *
   * Indicates if the data path for the network attachment can float to another bare metal server. Can only be `true`
   * for network attachments with an `interface_type` of `vlan`.
   *
   * If `true`, and the network detects traffic for this data path on another bare metal server in the resource group,
   * the network attachment will be automatically deleted from this bare metal server and a new network attachment with
   * the same `id`, `name` and `vlan` will be created on the other bare metal server.  The virtual network interface for
   * this network attachment will be automatically be attached to the new network attachment.
   *
   * For the data path to float, the other bare metal server must be in the same
   * `resource_group`, and must have a network attachment with `interface_type` of `pci` with `allowed_vlans` including
   * this network attachment's `vlan`.
   *
   * @return the allowToFloat
   */
  public Boolean isAllowToFloat() {
    return allowToFloat;
  }

  /**
   * Gets the vlan.
   *
   * The IEEE 802.1Q VLAN ID that must be used for all traffic on this attachment.
   *
   * @return the vlan
   */
  public Long getVlan() {
    return vlan;
  }
}

