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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceNetworkAttachment.
 */
public class InstanceNetworkAttachment extends GenericModel {

  /**
   * The lifecycle state of the instance network attachment.
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
    /** instance_network_attachment. */
    String INSTANCE_NETWORK_ATTACHMENT = "instance_network_attachment";
  }

  /**
   * The instance network attachment type.
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

  protected InstanceNetworkAttachment() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the instance network attachment was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance network attachment.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance network attachment.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the instance network attachment.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this instance network attachment. The name is unique across all network attachments for the instance.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the portSpeed.
   *
   * The port speed for this instance network attachment in Mbps.
   *
   * @return the portSpeed
   */
  public Long getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address of the virtual network interface for the instance network
   * attachment.
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
   * The subnet of the virtual network interface for the instance network attachment.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the type.
   *
   * The instance network attachment type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the virtualNetworkInterface.
   *
   * The virtual network interface for this instance network attachment.
   *
   * @return the virtualNetworkInterface
   */
  public VirtualNetworkInterfaceReferenceAttachmentContext getVirtualNetworkInterface() {
    return virtualNetworkInterface;
  }
}

