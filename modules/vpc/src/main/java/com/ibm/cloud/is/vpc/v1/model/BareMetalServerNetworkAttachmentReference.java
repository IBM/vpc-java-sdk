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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerNetworkAttachmentReference.
 */
public class BareMetalServerNetworkAttachmentReference extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** bare_metal_server_network_attachment. */
    String BARE_METAL_SERVER_NETWORK_ATTACHMENT = "bare_metal_server_network_attachment";
  }

  protected Deleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("primary_ip")
  protected ReservedIPReference primaryIp;
  @SerializedName("resource_type")
  protected String resourceType;
  protected SubnetReference subnet;
  @SerializedName("virtual_network_interface")
  protected VirtualNetworkInterfaceReferenceAttachmentContext virtualNetworkInterface;

  protected BareMetalServerNetworkAttachmentReference() { }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public Deleted getDeleted() {
    return deleted;
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
   * Gets the virtualNetworkInterface.
   *
   * The virtual network interface for this bare metal server network attachment.
   *
   * @return the virtualNetworkInterface
   */
  public VirtualNetworkInterfaceReferenceAttachmentContext getVirtualNetworkInterface() {
    return virtualNetworkInterface;
  }
}

