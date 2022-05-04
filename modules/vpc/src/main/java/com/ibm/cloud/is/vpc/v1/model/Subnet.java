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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Subnet.
 */
public class Subnet extends GenericModel {

  /**
   * The IP version(s) supported by this subnet.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  /**
   * The status of the subnet.
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

  @SerializedName("available_ipv4_address_count")
  protected Long availableIpv4AddressCount;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String href;
  protected String id;
  @SerializedName("ip_version")
  protected String ipVersion;
  @SerializedName("ipv4_cidr_block")
  protected String ipv4CidrBlock;
  protected String name;
  @SerializedName("network_acl")
  protected NetworkACLReference networkAcl;
  @SerializedName("public_gateway")
  protected PublicGatewayReference publicGateway;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("routing_table")
  protected RoutingTableReference routingTable;
  protected String status;
  @SerializedName("total_ipv4_address_count")
  protected Long totalIpv4AddressCount;
  protected VPCReference vpc;
  protected ZoneReference zone;

  /**
   * Gets the availableIpv4AddressCount.
   *
   * The number of IPv4 addresses in this subnet that are not in-use, and have not been reserved by the user or the
   * provider.
   *
   * @return the availableIpv4AddressCount
   */
  public Long getAvailableIpv4AddressCount() {
    return availableIpv4AddressCount;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the subnet was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this subnet.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this subnet.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this subnet.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version(s) supported by this subnet.
   *
   * @return the ipVersion
   */
  public String getIpVersion() {
    return ipVersion;
  }

  /**
   * Gets the ipv4CidrBlock.
   *
   * The IPv4 range of the subnet, expressed in CIDR format.
   *
   * @return the ipv4CidrBlock
   */
  public String getIpv4CidrBlock() {
    return ipv4CidrBlock;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this subnet.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkAcl.
   *
   * The network ACL for this subnet.
   *
   * @return the networkAcl
   */
  public NetworkACLReference getNetworkAcl() {
    return networkAcl;
  }

  /**
   * Gets the publicGateway.
   *
   * The public gateway to use for internet-bound traffic for this subnet.
   *
   * @return the publicGateway
   */
  public PublicGatewayReference getPublicGateway() {
    return publicGateway;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this subnet.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the routingTable.
   *
   * The routing table for this subnet.
   *
   * @return the routingTable
   */
  public RoutingTableReference getRoutingTable() {
    return routingTable;
  }

  /**
   * Gets the status.
   *
   * The status of the subnet.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the totalIpv4AddressCount.
   *
   * The total number of IPv4 addresses in this subnet.
   *
   * Note: This is calculated as 2&lt;sup&gt;(32 - prefix length)&lt;/sup&gt;. For example, the prefix length `/24`
   * gives:&lt;br&gt; 2&lt;sup&gt;(32 - 24)&lt;/sup&gt; = 2&lt;sup&gt;8&lt;/sup&gt; = 256 addresses.
   *
   * @return the totalIpv4AddressCount
   */
  public Long getTotalIpv4AddressCount() {
    return totalIpv4AddressCount;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this subnet is a part of.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this subnet resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

