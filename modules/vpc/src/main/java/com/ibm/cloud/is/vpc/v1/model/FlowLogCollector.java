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
 * FlowLogCollector.
 */
public class FlowLogCollector extends GenericModel {

  /**
   * The lifecycle state of the flow log collector.
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

  protected Boolean active;
  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("storage_bucket")
  protected LegacyCloudObjectStorageBucketReference storageBucket;
  protected FlowLogCollectorTarget target;
  protected VPCReference vpc;

  protected FlowLogCollector() { }

  /**
   * Gets the active.
   *
   * Indicates whether this collector is active.
   *
   * @return the active
   */
  public Boolean isActive() {
    return active;
  }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this flow log collector will be automatically deleted when `target` is deleted. At present, this
   * is always `true`, but may be modifiable in the future.
   *
   * @return the autoDelete
   */
  public Boolean isAutoDelete() {
    return autoDelete;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the flow log collector was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this flow log collector.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this flow log collector.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this flow log collector.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the flow log collector.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this flow log collector.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this flow log collector.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the storageBucket.
   *
   * The Cloud Object Storage bucket where the collected flows are logged.
   *
   * @return the storageBucket
   */
  public LegacyCloudObjectStorageBucketReference getStorageBucket() {
    return storageBucket;
  }

  /**
   * Gets the target.
   *
   * The target this collector is collecting flow logs for. If the target is an instance,
   * subnet, or VPC, flow logs will not be collected for any network interfaces within the
   * target that are themselves the target of a more specific flow log collector.
   *
   * @return the target
   */
  public FlowLogCollectorTarget getTarget() {
    return target;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this flow log collector resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }
}

