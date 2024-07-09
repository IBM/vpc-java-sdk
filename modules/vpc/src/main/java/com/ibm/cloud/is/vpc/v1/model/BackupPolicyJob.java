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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BackupPolicyJob.
 */
public class BackupPolicyJob extends GenericModel {

  /**
   * The type of backup policy job.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface JobType {
    /** creation. */
    String CREATION = "creation";
    /** deletion. */
    String DELETION = "deletion";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** backup_policy_job. */
    String BACKUP_POLICY_JOB = "backup_policy_job";
  }

  /**
   * The status of the backup policy job.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** failed. */
    String FAILED = "failed";
    /** running. */
    String RUNNING = "running";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
  }

  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("auto_delete_after")
  protected Long autoDeleteAfter;
  @SerializedName("backup_policy_plan")
  protected BackupPolicyPlanReference backupPolicyPlan;
  @SerializedName("completed_at")
  protected Date completedAt;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("job_type")
  protected String jobType;
  @SerializedName("resource_type")
  protected String resourceType;
  protected BackupPolicyJobSource source;
  protected String status;
  @SerializedName("status_reasons")
  protected List<BackupPolicyJobStatusReason> statusReasons;
  @SerializedName("target_snapshots")
  protected List<SnapshotReference> targetSnapshots;

  protected BackupPolicyJob() { }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this backup policy job will be automatically deleted after it completes. At present, this is
   * always `true`, but may be modifiable in the future.
   *
   * @return the autoDelete
   */
  public Boolean isAutoDelete() {
    return autoDelete;
  }

  /**
   * Gets the autoDeleteAfter.
   *
   * If `auto_delete` is `true`, the days after completion that this backup policy job will be deleted. This value may
   * be modifiable in the future.
   *
   * @return the autoDeleteAfter
   */
  public Long getAutoDeleteAfter() {
    return autoDeleteAfter;
  }

  /**
   * Gets the backupPolicyPlan.
   *
   * The backup policy plan operated this backup policy job (may be
   * [deleted](https://cloud.ibm.com/apidocs/vpc#deleted-resources)).
   *
   * @return the backupPolicyPlan
   */
  public BackupPolicyPlanReference getBackupPolicyPlan() {
    return backupPolicyPlan;
  }

  /**
   * Gets the completedAt.
   *
   * The date and time that the backup policy job was completed.
   *
   * If absent, the backup policy job has not yet completed.
   *
   * @return the completedAt
   */
  public Date getCompletedAt() {
    return completedAt;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the backup policy job was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this backup policy job.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this backup policy job.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the jobType.
   *
   * The type of backup policy job.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the jobType
   */
  public String getJobType() {
    return jobType;
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
   * Gets the source.
   *
   * The source this backup was created from (may be
   * [deleted](https://cloud.ibm.com/apidocs/vpc#deleted-resources)).
   *
   * @return the source
   */
  public BackupPolicyJobSource getSource() {
    return source;
  }

  /**
   * Gets the status.
   *
   * The status of the backup policy job.
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
  public List<BackupPolicyJobStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the targetSnapshots.
   *
   * The snapshots operated on by this backup policy job (may be
   * [deleted](https://cloud.ibm.com/apidocs/vpc#deleted-resources)).
   *
   * @return the targetSnapshots
   */
  public List<SnapshotReference> getTargetSnapshots() {
    return targetSnapshots;
  }
}

