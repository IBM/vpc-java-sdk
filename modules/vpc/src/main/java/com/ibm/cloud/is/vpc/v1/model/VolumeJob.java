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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeJob.
 *
 * Classes which extend this class:
 * - VolumeJobTypeMigrate
 */
public class VolumeJob extends GenericModel {

  /**
   * The type of volume job.
   *
   * - `migrate`: Migrates a volume to a new `storage_generation` profile.
   *              During the migration process, the volume will be `busy`.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface JobType {
    /** migrate. */
    String MIGRATE = "migrate";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** volume_job. */
    String VOLUME_JOB = "volume_job";
  }

  /**
   * The status of this volume job:
   * - `canceled`:  the job is canceled
   * - `canceling`: the job is being canceled
   * - `deleting`:  the job is being deleted
   * - `failed`:    the job could not be completed successfully
   * - `queued`:    the job is queued
   * - `running`:   the job is in progress
   * - `succeeded`: the job completed successfully
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** canceled. */
    String CANCELED = "canceled";
    /** canceling. */
    String CANCELING = "canceling";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** queued. */
    String QUEUED = "queued";
    /** running. */
    String RUNNING = "running";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
  }

  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("completed_at")
  protected Date completedAt;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("estimated_completion_at")
  protected Date estimatedCompletionAt;
  protected String href;
  protected String id;
  @SerializedName("job_type")
  protected String jobType;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("started_at")
  protected Date startedAt;
  protected String status;
  @SerializedName("status_reasons")
  protected List<VolumeJobStatusReason> statusReasons;
  protected VolumeJobTypeMigrateParameters parameters;

  protected VolumeJob() { }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this volume job will be automatically deleted after it completes. At present, this is always
   * `false`, but may be modifiable in the future.
   *
   * @return the autoDelete
   */
  public Boolean isAutoDelete() {
    return autoDelete;
  }

  /**
   * Gets the completedAt.
   *
   * The date and time that the volume job was completed.
   *
   * If absent, the volume job has not yet completed.
   *
   * @return the completedAt
   */
  public Date getCompletedAt() {
    return completedAt;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the volume job was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the estimatedCompletionAt.
   *
   * The date and time that the volume job is estimated to complete.
   *
   * If absent, the volume job is still queued and has not yet started.
   *
   * @return the estimatedCompletionAt
   */
  public Date getEstimatedCompletionAt() {
    return estimatedCompletionAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this volume job.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this volume job.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the jobType.
   *
   * The type of volume job.
   *
   * - `migrate`: Migrates a volume to a new `storage_generation` profile.
   *              During the migration process, the volume will be `busy`.
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
   * Gets the name.
   *
   * The name for this volume job. The name must not be used by another job for this volume.
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

  /**
   * Gets the startedAt.
   *
   * The date and time that the volume job was started.
   *
   * If absent, the volume job has not yet started.
   *
   * @return the startedAt
   */
  public Date getStartedAt() {
    return startedAt;
  }

  /**
   * Gets the status.
   *
   * The status of this volume job:
   * - `canceled`:  the job is canceled
   * - `canceling`: the job is being canceled
   * - `deleting`:  the job is being deleted
   * - `failed`:    the job could not be completed successfully
   * - `queued`:    the job is queued
   * - `running`:   the job is in progress
   * - `succeeded`: the job completed successfully
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
  public List<VolumeJobStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the parameters.
   *
   * The parameters to use after the volume is migrated.
   *
   * @return the parameters
   */
  public VolumeJobTypeMigrateParameters getParameters() {
    return parameters;
  }
}

