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
 * ShareSnapshot.
 */
public class ShareSnapshot extends GenericModel {

  /**
   * The lifecycle state of this share snapshot
   * - `pending`: The share snapshot is being provisioned and is not yet usable. A
   *   snapshot on a replica share will remain `pending` until the next replication sync
   *   completes.
   * - `deleting`: The share snapshot is being deleted.
   * - `failed`: The share snapshot is irrecoverably unusable.
   * - `stable`: The share snapshot is stable and ready for use.
   * - `updating`: The share snapshot is being updated.
   * - `suspended`: The share snapshot is not currently usable (see `lifecycle_reasons`).
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
    /** share_snapshot. */
    String SHARE_SNAPSHOT = "share_snapshot";
  }

  /**
   * The status of the share snapshot:
   * - `available`: The share snapshot is available for use.
   * - `failed`: The share snapshot is irrecoverably unusable.
   * - `pending`: The share snapshot is being provisioned and is not yet usable. A
   *   snapshot on a replica share will remain `pending` until the next replication sync
   *   completes.
   * - `unusable`: The share snapshot is not currently usable (see `status_reasons`)
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** unusable. */
    String UNUSABLE = "unusable";
  }

  @SerializedName("backup_policy_plan")
  protected BackupPolicyPlanReference backupPolicyPlan;
  @SerializedName("captured_at")
  protected Date capturedAt;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String fingerprint;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<ShareSnapshotLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("minimum_size")
  protected Long minimumSize;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("status_reasons")
  protected List<ShareSnapshotStatusReason> statusReasons;
  @SerializedName("user_tags")
  protected List<String> userTags;
  protected ZoneReference zone;

  protected ShareSnapshot() { }

  /**
   * Gets the backupPolicyPlan.
   *
   * If present, the backup policy plan which created this share snapshot.
   *
   * @return the backupPolicyPlan
   */
  public BackupPolicyPlanReference getBackupPolicyPlan() {
    return backupPolicyPlan;
  }

  /**
   * Gets the capturedAt.
   *
   * The date and time the data capture for this share snapshot was completed.
   *
   * If absent, this snapshot's data has not yet been captured.
   *
   * @return the capturedAt
   */
  public Date getCapturedAt() {
    return capturedAt;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the share snapshot was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this share snapshot.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the fingerprint.
   *
   * The fingerprint for this share snapshot. Only snapshots with identical data will have the same fingerprint. This
   * snapshot will also be available as a subdirectory named identically to this fingerprint in the share's `.snapshot`
   * directory.
   *
   * @return the fingerprint
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * Gets the href.
   *
   * The URL for this share snapshot.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this share snapshot.
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
  public List<ShareSnapshotLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of this share snapshot
   * - `pending`: The share snapshot is being provisioned and is not yet usable. A
   *   snapshot on a replica share will remain `pending` until the next replication sync
   *   completes.
   * - `deleting`: The share snapshot is being deleted.
   * - `failed`: The share snapshot is irrecoverably unusable.
   * - `stable`: The share snapshot is stable and ready for use.
   * - `updating`: The share snapshot is being updated.
   * - `suspended`: The share snapshot is not currently usable (see `lifecycle_reasons`).
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the minimumSize.
   *
   * The minimum size of a share created from this snapshot. When a snapshot is created, this will be set to the size of
   * the `source_share`.
   *
   * @return the minimumSize
   */
  public Long getMinimumSize() {
    return minimumSize;
  }

  /**
   * Gets the name.
   *
   * The name for this share snapshot. The name is unique across all snapshots for the file share.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this share snapshot.
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
   * Gets the status.
   *
   * The status of the share snapshot:
   * - `available`: The share snapshot is available for use.
   * - `failed`: The share snapshot is irrecoverably unusable.
   * - `pending`: The share snapshot is being provisioned and is not yet usable. A
   *   snapshot on a replica share will remain `pending` until the next replication sync
   *   completes.
   * - `unusable`: The share snapshot is not currently usable (see `status_reasons`)
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current status (if any).
   *
   * @return the statusReasons
   */
  public List<ShareSnapshotStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this share snapshot.
   *
   * @return the userTags
   */
  public List<String> getUserTags() {
    return userTags;
  }

  /**
   * Gets the zone.
   *
   * The zone this share snapshot resides in. For shares with `availability_mode` of
   * `regional`, this property will be absent.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

