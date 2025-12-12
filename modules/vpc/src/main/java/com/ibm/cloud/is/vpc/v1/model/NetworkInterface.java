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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * NetworkInterface.
 */
public class NetworkInterface extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** network_interface. */
    String NETWORK_INTERFACE = "network_interface";
  }

  /**
   * The status of the instance network interface.
   *
   * If this instance has network attachments, this network interface is a read-only representation of its corresponding
   * network attachment and its attached virtual network interface, and the status is [computed from
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
   * The instance network interface type.
   *
   * If this instance has network attachments, this network interface is a
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

  @SerializedName("allow_ip_spoofing")
  protected Boolean allowIpSpoofing;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("floating_ips")
  protected List<FloatingIPReference> floatingIps;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("port_speed")
  protected Long portSpeed;
  @SerializedName("primary_ip")
  protected ReservedIPReference primaryIp;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("security_groups")
  protected List<SecurityGroupReference> securityGroups;
  protected String status;
  protected SubnetReference subnet;
  protected String type;

  protected NetworkInterface() { }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this instance network interface.
   *
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and source IP spoofing is managed on
   * the attached virtual network interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean isAllowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the instance network interface was created.
   *
   * If this instance has network attachments, this network interface was created as a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) when its corresponding
   * network attachment was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the floatingIps.
   *
   * The floating IPs associated with this instance network interface.
   *
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the floating IPs are associated
   * with the attached virtual network interface.
   *
   * @return the floatingIps
   */
  public List<FloatingIPReference> getFloatingIps() {
    return floatingIps;
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
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the name matches its corresponding
   * network attachment.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the portSpeed.
   *
   * The instance network interface port speed in Mbps.
   *
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the port speed is that of its
   * corresponding network attachment.
   *
   * @return the portSpeed
   */
  public Long getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address of this instance network interface.
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
   * Gets the securityGroups.
   *
   * The security groups targeting this instance network interface.
   *
   * If this instance has network attachments, this network interface is a [read-only
   * representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its corresponding
   * network attachment and its attached virtual network interface, and the security groups are associated with the
   * attached virtual network interface.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the status.
   *
   * The status of the instance network interface.
   *
   * If this instance has network attachments, this network interface is a read-only representation of its corresponding
   * network attachment and its attached virtual network interface, and the status is [computed from
   * them](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients).
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the subnet.
   *
   * The associated subnet.
   *
   * @return the subnet
   */
  public SubnetReference getSubnet() {
    return subnet;
  }

  /**
   * Gets the type.
   *
   * The instance network interface type.
   *
   * If this instance has network attachments, this network interface is a
   * [read-only representation](https://cloud.ibm.com/docs/vpc?topic=vpc-vni-about#vni-old-api-clients) of its
   * corresponding network attachment and its attached virtual network interface, and the type is that of its
   * corresponding network attachment.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

