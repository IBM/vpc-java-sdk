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
 * BareMetalServerPrimaryNetworkAttachmentPrototype.
 *
 * Classes which extend this class:
 * - BareMetalServerPrimaryNetworkAttachmentPrototypeBareMetalServerPrimaryNetworkAttachmentByPCIPrototype
 */
public class BareMetalServerPrimaryNetworkAttachmentPrototype extends GenericModel {

  /**
   * The network attachment's interface type:
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI attachment
   *   - Cannot directly use an IEEE 802.1Q tag.
   *   - Not supported on bare metal servers with a `cpu.architecture` of `s390x`.
   */
  public interface InterfaceType {
    /** pci. */
    String PCI = "pci";
  }

  @SerializedName("interface_type")
  protected String interfaceType;
  protected String name;
  @SerializedName("virtual_network_interface")
  protected BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface;
  @SerializedName("allowed_vlans")
  protected List<Long> allowedVlans;

  protected BareMetalServerPrimaryNetworkAttachmentPrototype() { }

  /**
   * Gets the interfaceType.
   *
   * The network attachment's interface type:
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI attachment
   *   - Cannot directly use an IEEE 802.1Q tag.
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
   * The name for this bare metal server network attachment. Names must be unique within the bare metal server the
   * network attachment resides in. If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the virtualNetworkInterface.
   *
   * A virtual network interface for the bare metal server network attachment. This can be
   * specified using an existing virtual network interface, or a prototype object for a new
   * virtual network interface.
   *
   * If an existing virtual network interface is specified, it must not be the target of a flow
   * log collector.
   *
   * @return the virtualNetworkInterface
   */
  public BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface() {
    return virtualNetworkInterface;
  }

  /**
   * Gets the allowedVlans.
   *
   * The VLAN IDs to allow for `vlan` attachments using this PCI attachment.
   *
   * @return the allowedVlans
   */
  public List<Long> allowedVlans() {
    return allowedVlans;
  }
}

