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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SnapshotConsistencyGroup.
 */
public class SnapshotConsistencyGroup extends GenericModel {

  /**
   * The lifecycle state of this snapshot consistency group.
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
    /** snapshot_consistency_group. */
    String SNAPSHOT_CONSISTENCY_GROUP = "snapshot_consistency_group";
  }

  @SerializedName("backup_policy_plan")
  protected BackupPolicyPlanReference backupPolicyPlan;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("delete_snapshots_on_delete")
  protected Boolean deleteSnapshotsOnDelete;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("service_tags")
  protected List<String> serviceTags;
  protected List<SnapshotReference> snapshots;

  protected SnapshotConsistencyGroup() { }

  /**
   * Gets the backupPolicyPlan.
   *
   * If present, the backup policy plan which created this snapshot consistency group.
   *
   * @return the backupPolicyPlan
   */
  public BackupPolicyPlanReference getBackupPolicyPlan() {
    return backupPolicyPlan;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this snapshot consistency group was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN of this snapshot consistency group.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the deleteSnapshotsOnDelete.
   *
   * Indicates whether deleting the snapshot consistency group will also delete the snapshots in the group.
   *
   * @return the deleteSnapshotsOnDelete
   */
  public Boolean isDeleteSnapshotsOnDelete() {
    return deleteSnapshotsOnDelete;
  }

  /**
   * Gets the href.
   *
   * The URL for this snapshot consistency group.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this snapshot consistency group.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of this snapshot consistency group.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this snapshot consistency group. The name is unique across all snapshot consistency groups in the
   * region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this snapshot consistency group.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
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
   * Gets the serviceTags.
   *
   * The [service tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this snapshot consistency
   * group. Each tag is prefixed with
   * [is.instance:](https://cloud.ibm.com/docs/vpc?topic=vpc-snapshots-vpc-faqs).
   *
   * @return the serviceTags
   */
  public List<String> getServiceTags() {
    return serviceTags;
  }

  /**
   * Gets the snapshots.
   *
   * The member snapshots that are data-consistent with respect to captured time. (may be
   * [deleted](https://cloud.ibm.com/apidocs/vpc#deleted-resources)).
   *
   * @return the snapshots
   */
  public List<SnapshotReference> getSnapshots() {
    return snapshots;
  }
}

