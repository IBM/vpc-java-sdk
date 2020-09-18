/*
 * (C) Copyright IBM Corp. 2020.
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
 * SubnetPrototype.
 *
 * Classes which extend this class:
 * - SubnetPrototypeSubnetByTotalCount
 * - SubnetPrototypeSubnetByCIDR
 */
public class SubnetPrototype extends GenericModel {

  /**
   * The IP version(s) to support for this subnet.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  protected String name;
  @SerializedName("network_acl")
  protected NetworkACLIdentity networkAcl;
  @SerializedName("public_gateway")
  protected PublicGatewayIdentity publicGateway;
  @SerializedName("ip_version")
  protected String ipVersion;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected VPCIdentity vpc;
  @SerializedName("total_ipv4_address_count")
  protected Long totalIpv4AddressCount;
  protected ZoneIdentity zone;
  @SerializedName("ipv4_cidr_block")
  protected String ipv4CidrBlock;

  protected SubnetPrototype() {
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this subnet. Names must be unique within the VPC the subnet resides in. If unspecified,
   * the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the networkAcl.
   *
   * The network ACL to use for this subnet.
   *
   * @return the networkAcl
   */
  public NetworkACLIdentity networkAcl() {
    return networkAcl;
  }

  /**
   * Gets the publicGateway.
   *
   * The public gateway to handle internet bound traffic for this subnet.
   *
   * @return the publicGateway
   */
  public PublicGatewayIdentity publicGateway() {
    return publicGateway;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version(s) to support for this subnet.
   *
   * @return the ipVersion
   */
  public String ipVersion() {
    return ipVersion;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the vpc.
   *
   * The VPC the subnet is to be a part of.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the totalIpv4AddressCount.
   *
   * The total number of IPv4 addresses required. Must be a power of 2. The VPC must have a default address prefix in
   * the specified zone, and that prefix must have a free CIDR range with at least this number of addresses.
   *
   * @return the totalIpv4AddressCount
   */
  public Long totalIpv4AddressCount() {
    return totalIpv4AddressCount;
  }

  /**
   * Gets the zone.
   *
   * The zone the subnet is to reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the ipv4CidrBlock.
   *
   * The IPv4 range of the subnet, expressed in CIDR format. The prefix length of the subnet's CIDR must be between `/8`
   * (16,777,216 addresses) and `/29` (8 addresses). The IPv4 range of the subnet's CIDR must fall within an existing
   * address prefix in the VPC. The subnet will be created in the zone of the address prefix that contains the IPv4
   * CIDR. If zone is specified, it must match the zone of the address prefix that contains the subnet's IPv4 CIDR.
   *
   * @return the ipv4CidrBlock
   */
  public String ipv4CidrBlock() {
    return ipv4CidrBlock;
  }
}

