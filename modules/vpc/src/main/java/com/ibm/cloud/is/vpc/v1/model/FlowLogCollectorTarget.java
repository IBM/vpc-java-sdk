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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The target this collector is collecting flow logs for.
 *
 * - If the target is an instance network attachment, flow logs will be collected
 *   for that instance network attachment.
 * - If the target is an instance network interface, flow logs will be collected
 *   for that instance network interface.
 * - If the target is a virtual network interface, flow logs will be collected for the
 *   virtual network interface's `target` resource if the resource is an instance network
 *   attachment, unless the target resource is itself the target of a flow log collector.
 * - If the target is a virtual server instance, flow logs will be collected
 *   for all network attachments or network interfaces on that instance.
 * - If the target is a subnet, flow logs will be collected
 *   for all instance network interfaces and virtual network interfaces
 *   attached to that subnet.
 * - If the target is a VPC, flow logs will be collected for all instance network
 *   interfaces and virtual network interfaces  attached to all subnets within that VPC.
 *
 * If the target is an instance, subnet, or VPC, flow logs will not be collected for any instance network attachments or
 * instance network interfaces within the target that are themselves the target of a more specific flow log collector.
 *
 * Classes which extend this class:
 * - FlowLogCollectorTargetNetworkInterfaceReferenceTargetContext
 * - FlowLogCollectorTargetInstanceReference
 * - FlowLogCollectorTargetSubnetReference
 * - FlowLogCollectorTargetVPCReference
 * - FlowLogCollectorTargetInstanceNetworkAttachmentReference
 * - FlowLogCollectorTargetVirtualNetworkInterfaceReferenceAttachmentContext
 */
public class FlowLogCollectorTarget extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** network_interface. */
    String NETWORK_INTERFACE = "network_interface";
  }

  protected NetworkInterfaceReferenceTargetContextDeleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String crn;
  @SerializedName("primary_ip")
  protected ReservedIPReference primaryIp;
  protected SubnetReference subnet;

  protected FlowLogCollectorTarget() { }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public NetworkInterfaceReferenceTargetContextDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance network interface.
   *
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance network interface.
   *
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the identifier is that of the
   * corresponding network attachment.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this instance network interface.
   *
   * @return the name
   */
  public String getName() {
    return name;
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
   * Gets the crn.
   *
   * The CRN for this virtual server instance.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
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
   * Gets the subnet.
   *
   * The subnet of the virtual network interface for the instance network attachment.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }
}

