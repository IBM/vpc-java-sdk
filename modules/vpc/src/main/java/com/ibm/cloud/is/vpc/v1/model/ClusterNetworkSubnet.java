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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ClusterNetworkSubnet.
 */
public class ClusterNetworkSubnet extends GenericModel {

  /**
   * The IP version for this cluster network subnet.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  /**
   * The lifecycle state of the cluster network subnet.
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
    /** cluster_network_subnet. */
    String CLUSTER_NETWORK_SUBNET = "cluster_network_subnet";
  }

  @SerializedName("available_ipv4_address_count")
  protected Long availableIpv4AddressCount;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("ip_version")
  protected String ipVersion;
  @SerializedName("ipv4_cidr_block")
  protected String ipv4CidrBlock;
  @SerializedName("lifecycle_reasons")
  protected List<ClusterNetworkSubnetLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("total_ipv4_address_count")
  protected Long totalIpv4AddressCount;

  protected ClusterNetworkSubnet() { }

  /**
   * Gets the availableIpv4AddressCount.
   *
   * The number of IPv4 addresses in this cluster network subnet that are not in use, and have not been reserved by the
   * user or the provider.
   *
   * @return the availableIpv4AddressCount
   */
  public Long getAvailableIpv4AddressCount() {
    return availableIpv4AddressCount;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the cluster network subnet was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this cluster network subnet.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this cluster network subnet.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ipVersion.
   *
   * The IP version for this cluster network subnet.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the ipVersion
   */
  public String getIpVersion() {
    return ipVersion;
  }

  /**
   * Gets the ipv4CidrBlock.
   *
   * The IPv4 range of this cluster network subnet, expressed in CIDR format.
   *
   * @return the ipv4CidrBlock
   */
  public String getIpv4CidrBlock() {
    return ipv4CidrBlock;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The reasons for the current `lifecycle_state` (if any).
   *
   * @return the lifecycleReasons
   */
  public List<ClusterNetworkSubnetLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the cluster network subnet.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network subnet. The name is unique across all cluster network subnets in the cluster
   * network.
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
   * Gets the totalIpv4AddressCount.
   *
   * The total number of IPv4 addresses in this cluster network subnet.
   *
   * Note: This is calculated as 2&lt;sup&gt;(32 - prefix length)&lt;/sup&gt;. For example, the prefix length `/24`
   * gives:&lt;br&gt; 2&lt;sup&gt;(32 - 24)&lt;/sup&gt; = 2&lt;sup&gt;8&lt;/sup&gt; = 256 addresses.
   *
   * @return the totalIpv4AddressCount
   */
  public Long getTotalIpv4AddressCount() {
    return totalIpv4AddressCount;
  }
}

