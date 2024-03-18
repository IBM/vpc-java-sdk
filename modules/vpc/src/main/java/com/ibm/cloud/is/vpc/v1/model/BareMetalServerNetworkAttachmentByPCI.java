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
 * BareMetalServerNetworkAttachmentByPCI.
 */
public class BareMetalServerNetworkAttachmentByPCI extends BareMetalServerNetworkAttachment {

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

  /**
   * - `pci`: a physical PCI device which can only be created or deleted when the bare metal
   *   server is stopped
   *   - Has an `allowed_vlans` property which controls the VLANs that will be permitted
   *     to use the PCI attachment
   *   - Cannot directly use an IEEE 802.1Q tag.
   */
  public interface InterfaceType {
    /** pci. */
    String PCI = "pci";
  }


  protected BareMetalServerNetworkAttachmentByPCI() { }
}

