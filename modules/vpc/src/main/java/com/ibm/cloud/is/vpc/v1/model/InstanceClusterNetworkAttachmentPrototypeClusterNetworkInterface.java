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
 * A cluster network interface for the instance cluster network attachment. This can be specified using an existing
 * cluster network interface that does not already have a `target`, or a prototype object for a new cluster network
 * interface.
 *
 * This instance must reside in the same VPC as the specified cluster network interface. The cluster network interface
 * must reside in the same cluster network as the
 * `cluster_network_interface` of any other `cluster_network_attachments` for this instance.
 *
 * Classes which extend this class:
 * - InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceInstanceClusterNetworkInterfacePrototypeInstanceClusterNetworkAttachment
 * - InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterfaceClusterNetworkInterfaceIdentity
 */
public class InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface extends GenericModel {

  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  protected String name;
  @SerializedName("primary_ip")
  protected ClusterNetworkInterfacePrimaryIPPrototype primaryIp;
  protected ClusterNetworkSubnetIdentity subnet;
  protected String id;
  protected String href;

  protected InstanceClusterNetworkAttachmentPrototypeClusterNetworkInterface() { }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this cluster network interface will be automatically deleted when `target` is deleted.
   *
   * @return the autoDelete
   */
  public Boolean autoDelete() {
    return autoDelete;
  }

  /**
   * Gets the name.
   *
   * The name for this cluster network interface. The name must not be used by another interface in the cluster network.
   * Names beginning with `ibm-` are reserved for provider-owned resources, and are not allowed. If unspecified, the
   * name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the primaryIp.
   *
   * The primary IP address to bind to the cluster network interface. May be either
   * a cluster network subnet reserved IP identity, or a cluster network subnet reserved IP
   * prototype object which will be used to create a new cluster network subnet reserved IP.
   *
   * If a cluster network subnet reserved IP identity is provided, the specified cluster
   * network subnet reserved IP must be unbound.
   *
   * If a cluster network subnet reserved IP prototype object with an address is provided,
   * the address must be available on the cluster network interface's cluster network
   * subnet. If no address is specified, an available address on the cluster network subnet
   * will be automatically selected and reserved.
   *
   * @return the primaryIp
   */
  public ClusterNetworkInterfacePrimaryIPPrototype primaryIp() {
    return primaryIp;
  }

  /**
   * Gets the subnet.
   *
   * The associated cluster network subnet. Required if `primary_ip` does not specify a
   * cluster network subnet reserved IP identity.
   *
   * @return the subnet
   */
  public ClusterNetworkSubnetIdentity subnet() {
    return subnet;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this cluster network interface.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this cluster network interface.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

