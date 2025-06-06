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
 * ClusterNetworkSubnetReservedIPReference.
 */
public class ClusterNetworkSubnetReservedIPReference extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** cluster_network_subnet_reserved_ip. */
    String CLUSTER_NETWORK_SUBNET_RESERVED_IP = "cluster_network_subnet_reserved_ip";
  }

  protected String address;
  protected Deleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected ClusterNetworkSubnetReservedIPReference() { }

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * If the address is pending allocation, the value will be `0.0.0.0`.
   *
   * This property may [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) to support IPv6 addresses in
   * the future.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

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
   * The URL for this cluster network subnet reserved IP.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this cluster network subnet reserved IP.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network subnet reserved IP. The name is unique across all reserved IPs in a cluster
   * network subnet.
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
}

