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
 * The target of this cluster network interface.
 *
 * If absent, this cluster network interface is not attached to a target.
 *
 * The resources supported by this property may
 * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
 *
 * Classes which extend this class:
 * - ClusterNetworkInterfaceTargetInstanceClusterNetworkAttachmentReferenceClusterNetworkInterfaceContext
 */
public class ClusterNetworkInterfaceTarget extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** instance_cluster_network_attachment. */
    String INSTANCE_CLUSTER_NETWORK_ATTACHMENT = "instance_cluster_network_attachment";
  }

  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected ClusterNetworkInterfaceTarget() { }

  /**
   * Gets the href.
   *
   * The URL for this instance cluster network attachment.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance cluster network attachment.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this instance cluster network attachment. The name is unique across all network attachments for the
   * instance.
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

