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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BackupPolicyPlan.
 */
public class BackupPolicyPlan extends GenericModel {

  /**
   * The lifecycle state of this backup policy plan.
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
    /** backup_policy_plan. */
    String BACKUP_POLICY_PLAN = "backup_policy_plan";
  }

  protected Boolean active;
  @SerializedName("attach_user_tags")
  protected List<String> attachUserTags;
  @SerializedName("copy_user_tags")
  protected Boolean copyUserTags;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("cron_spec")
  protected String cronSpec;
  @SerializedName("deletion_trigger")
  protected BackupPolicyPlanDeletionTrigger deletionTrigger;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  protected BackupPolicyPlan() { }

  /**
   * Gets the active.
   *
   * Indicates whether the plan is active.
   *
   * @return the active
   */
  public Boolean isActive() {
    return active;
  }

  /**
   * Gets the attachUserTags.
   *
   * The user tags to attach to backups (snapshots) created by this plan.
   *
   * @return the attachUserTags
   */
  public List<String> getAttachUserTags() {
    return attachUserTags;
  }

  /**
   * Gets the copyUserTags.
   *
   * Indicates whether to copy the source's user tags to the created backups (snapshots).
   *
   * @return the copyUserTags
   */
  public Boolean isCopyUserTags() {
    return copyUserTags;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the backup policy plan was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the cronSpec.
   *
   * The cron specification for the backup schedule. The backup policy jobs
   * (which create and delete backups for this plan) will not start until this time, and may start for up to 90 minutes
   * after this time.
   *
   * All backup schedules for plans in the same policy must be at least an hour apart.
   *
   * @return the cronSpec
   */
  public String getCronSpec() {
    return cronSpec;
  }

  /**
   * Gets the deletionTrigger.
   *
   * @return the deletionTrigger
   */
  public BackupPolicyPlanDeletionTrigger getDeletionTrigger() {
    return deletionTrigger;
  }

  /**
   * Gets the href.
   *
   * The URL for this backup policy plan.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this backup policy plan.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of this backup policy plan.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this backup policy plan.
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

