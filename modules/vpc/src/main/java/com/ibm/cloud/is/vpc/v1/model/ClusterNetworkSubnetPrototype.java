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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ClusterNetworkSubnetPrototype.
 *
 * Classes which extend this class:
 * - ClusterNetworkSubnetPrototypeClusterNetworkSubnetByTotalCountPrototype
 * - ClusterNetworkSubnetPrototypeClusterNetworkSubnetByIPv4CIDRBlockPrototype
 */
public class ClusterNetworkSubnetPrototype extends GenericModel {

  /**
   * The IP version(s) to support for this cluster network subnet.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  @SerializedName("ip_version")
  protected String ipVersion;
  protected String name;
  @SerializedName("total_ipv4_address_count")
  protected Long totalIpv4AddressCount;
  @SerializedName("ipv4_cidr_block")
  protected String ipv4CidrBlock;

  protected ClusterNetworkSubnetPrototype() { }

  /**
   * Gets the ipVersion.
   *
   * The IP version(s) to support for this cluster network subnet.
   *
   * @return the ipVersion
   */
  public String ipVersion() {
    return ipVersion;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network subnet. The name must not be used by another cluster network subnet in the
   * cluster network. Names starting with `ibm-` are reserved for provider-owned resources, and are not allowed. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the totalIpv4AddressCount.
   *
   * The total number of IPv4 addresses required. Must be a power of 2.
   *
   * A CIDR will be allocated from a subnet prefix in the cluster network that has an
   * `allocation_policy` of `auto`. There must be a subnet prefix that has a free CIDR range with at least this number
   * of addresses.
   *
   * @return the totalIpv4AddressCount
   */
  public Long totalIpv4AddressCount() {
    return totalIpv4AddressCount;
  }

  /**
   * Gets the ipv4CidrBlock.
   *
   * The IPv4 range of the cluster network subnet, expressed in CIDR format. The prefix length of the cluster network
   * subnet's CIDR must be between `/8` (16,777,216 addresses) and `/29`
   * (8 addresses). The IPv4 range of the cluster network subnet's CIDR must be within the cluster network's
   * `subnet_prefixes`.
   *
   * The range must not overlap with any of the following reserved address ranges:
   *
   *   - `127.0.0.0/8` (IPv4 loopback addresses)
   *   - `169.254.0.0/16` (IPv4 link-local addresses)
   *   - `224.0.0.0/4` (IPv4 multicast addresses).
   *
   * @return the ipv4CidrBlock
   */
  public String ipv4CidrBlock() {
    return ipv4CidrBlock;
  }
}

