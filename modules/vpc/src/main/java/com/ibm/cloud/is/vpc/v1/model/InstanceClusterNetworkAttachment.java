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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceClusterNetworkAttachment.
 */
public class InstanceClusterNetworkAttachment extends GenericModel {

  /**
   * The lifecycle state of the instance cluster network attachment.
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
    /** instance_cluster_network_attachment. */
    String INSTANCE_CLUSTER_NETWORK_ATTACHMENT = "instance_cluster_network_attachment";
  }

  protected InstanceClusterNetworkAttachmentBefore before;
  @SerializedName("cluster_network_interface")
  protected ClusterNetworkInterfaceReference clusterNetworkInterface;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<InstanceClusterNetworkAttachmentLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected InstanceClusterNetworkAttachment() { }

  /**
   * Gets the before.
   *
   * The instance cluster network attachment that is immediately before. If absent, this is the
   * last instance cluster network attachment.
   *
   * @return the before
   */
  public InstanceClusterNetworkAttachmentBefore getBefore() {
    return before;
  }

  /**
   * Gets the clusterNetworkInterface.
   *
   * The cluster network interface for this instance cluster network attachment.
   *
   * @return the clusterNetworkInterface
   */
  public ClusterNetworkInterfaceReference getClusterNetworkInterface() {
    return clusterNetworkInterface;
  }

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
   * Gets the lifecycleReasons.
   *
   * The reasons for the current `lifecycle_state` (if any).
   *
   * @return the lifecycleReasons
   */
  public List<InstanceClusterNetworkAttachmentLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the instance cluster network attachment.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
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

