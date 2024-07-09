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
 * ShareMountTarget.
 */
public class ShareMountTarget extends GenericModel {

  /**
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a mount
   *   target control access to the mount target.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface AccessControlMode {
    /** security_group. */
    String SECURITY_GROUP = "security_group";
    /** vpc. */
    String VPC = "vpc";
  }

  /**
   * The lifecycle state of the mount target.
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
    /** share_mount_target. */
    String SHARE_MOUNT_TARGET = "share_mount_target";
  }

  /**
   * The transit encryption mode for this share mount target:
   * - `none`: Not encrypted in transit
   * - `user_managed`: Encrypted in transit using an instance identity certificate
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface TransitEncryption {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  @SerializedName("access_control_mode")
  protected String accessControlMode;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("mount_path")
  protected String mountPath;
  protected String name;
  @SerializedName("primary_ip")
  protected ReservedIPReference primaryIp;
  @SerializedName("resource_type")
  protected String resourceType;
  protected SubnetReference subnet;
  @SerializedName("transit_encryption")
  protected String transitEncryption;
  @SerializedName("virtual_network_interface")
  protected VirtualNetworkInterfaceReferenceAttachmentContext virtualNetworkInterface;
  protected VPCReference vpc;

  protected ShareMountTarget() { }

  /**
   * Gets the accessControlMode.
   *
   * The access control mode for the share:
   *
   * - `security_group`: The security groups on the virtual network interface for a mount
   *   target control access to the mount target.
   * - `vpc`: All clients in the VPC for a mount target have access to the mount target.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the accessControlMode
   */
  public String getAccessControlMode() {
    return accessControlMode;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the share mount target was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this share mount target.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this share mount target.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the mount target.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the mountPath.
   *
   * The mount path for the share.  The server component of the mount path may be either an IP address or a fully
   * qualified domain name.
   *
   * This property will be absent if the `lifecycle_state` of the mount target is
   * 'pending', `failed`, or `deleting`.
   *
   * If the share's `access_control_mode` is:
   *
   * - `security_group`: The IP address used in the mount path is the `primary_ip`
   *   address of the virtual network interface for this share mount target.
   * - `vpc`: The fully-qualified domain name used in the mount path is an address that
   *   resolves to the share mount target.
   *
   * @return the mountPath
   */
  public String getMountPath() {
    return mountPath;
  }

  /**
   * Gets the name.
   *
   * The name for this share mount target. The name is unique across all mount targets for the file share.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address of the virtual network interface for the share mount target.
   *
   * Absent if `access_control_mode` is `vpc`.
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
   * The subnet of the virtual network interface for the share mount target.
   *
   * Absent if `access_control_mode` is `vpc`.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the transitEncryption.
   *
   * The transit encryption mode for this share mount target:
   * - `none`: Not encrypted in transit
   * - `user_managed`: Encrypted in transit using an instance identity certificate
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the transitEncryption
   */
  public String getTransitEncryption() {
    return transitEncryption;
  }

  /**
   * Gets the virtualNetworkInterface.
   *
   * The virtual network interface for this file share mount target.
   *
   * This property will be present when the `access_control_mode` is `security_group`.
   *
   * @return the virtualNetworkInterface
   */
  public VirtualNetworkInterfaceReferenceAttachmentContext getVirtualNetworkInterface() {
    return virtualNetworkInterface;
  }

  /**
   * Gets the vpc.
   *
   * If `access_control_mode` is:
   *
   * - `security_group`: The VPC for the virtual network interface for this share mount
   *   target
   * - `vpc`: The VPC in which clients can mount the file share using this share
   *   mount target.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }
}

