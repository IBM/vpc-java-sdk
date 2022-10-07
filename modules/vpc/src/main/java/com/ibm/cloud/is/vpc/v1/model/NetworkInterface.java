/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
   * The status of the network interface.
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
   * The type of this network interface as it relates to an instance.
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
   * Indicates whether source IP spoofing is allowed on this interface. If false, source IP spoofing is prevented on
   * this interface. If true, source IP spoofing is allowed on this interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean isAllowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the network interface was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the floatingIps.
   *
   * The floating IPs associated with this network interface.
   *
   * @return the floatingIps
   */
  public List<FloatingIPReference> getFloatingIps() {
    return floatingIps;
  }

  /**
   * Gets the href.
   *
   * The URL for this network interface.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this network interface.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this network interface.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the portSpeed.
   *
   * The network interface port speed in Mbps.
   *
   * @return the portSpeed
   */
  public Long getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the primaryIp.
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
   * The security groups targeting this network interface.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the status.
   *
   * The status of the network interface.
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
   * The type of this network interface as it relates to an instance.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

