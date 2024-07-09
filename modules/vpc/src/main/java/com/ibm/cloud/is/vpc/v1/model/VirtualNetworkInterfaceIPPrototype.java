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
 * VirtualNetworkInterfaceIPPrototype.
 *
 * Classes which extend this class:
 * - VirtualNetworkInterfaceIPPrototypeReservedIPIdentityVirtualNetworkInterfaceIPsContext
 * - VirtualNetworkInterfaceIPPrototypeReservedIPPrototypeVirtualNetworkInterfaceIPsContext
 */
public class VirtualNetworkInterfaceIPPrototype extends GenericModel {

  protected String id;
  protected String href;
  protected String address;
  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  protected String name;

  protected VirtualNetworkInterfaceIPPrototype() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this reserved IP.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this reserved IP.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the address.
   *
   * The IP address to reserve, which must not already be reserved on the subnet.
   *
   * If unspecified, an available address on the subnet will automatically be selected.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this reserved IP member will be automatically deleted when either
   * `target` is deleted, or the reserved IP is unbound.
   *
   * @return the autoDelete
   */
  public Boolean autoDelete() {
    return autoDelete;
  }

  /**
   * Gets the name.
   *
   * The name for this reserved IP. The name must not be used by another reserved IP in the subnet. Names starting with
   * `ibm-` are reserved for provider-owned resources, and are not allowed. If unspecified, the name will be a
   * hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

