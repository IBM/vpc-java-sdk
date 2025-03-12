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
 * VirtualNetworkInterfaceReferenceAttachmentContext.
 */
public class VirtualNetworkInterfaceReferenceAttachmentContext extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** virtual_network_interface. */
    String VIRTUAL_NETWORK_INTERFACE = "virtual_network_interface";
  }

  protected String crn;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected VirtualNetworkInterfaceReferenceAttachmentContext() { }

  /**
   * Gets the crn.
   *
   * The CRN for this virtual network interface.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this virtual network interface.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this virtual network interface.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this virtual network interface. The name is unique across all virtual network interfaces in the VPC.
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

