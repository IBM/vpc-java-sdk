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

/**
 * BareMetalServerNetworkInterfaceByPCI.
 */
public class BareMetalServerNetworkInterfaceByPCI extends BareMetalServerNetworkInterface {

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

  /**
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI interface
   *   - Cannot directly use an IEEE 802.1Q tag.
   */
  public interface InterfaceType {
    /** pci. */
    String PCI = "pci";
  }


  protected BareMetalServerNetworkInterfaceByPCI() { }
}

