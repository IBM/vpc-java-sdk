/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
 * BackupPolicy.
 */
public class BackupPolicy extends GenericModel {

  /**
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
   */
  public interface HealthState {
    /** degraded. */
    String DEGRADED = "degraded";
    /** faulted. */
    String FAULTED = "faulted";
    /** inapplicable. */
    String INAPPLICABLE = "inapplicable";
    /** ok. */
    String OK = "ok";
  }

  /**
   * The lifecycle state of the backup policy.
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
  public interface MatchResourceTypes {
    /** volume. */
    String VOLUME = "volume";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** backup_policy. */
    String BACKUP_POLICY = "backup_policy";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("health_reasons")
  protected List<BackupPolicyHealthReason> healthReasons;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  @SerializedName("last_job_completed_at")
  protected Date lastJobCompletedAt;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("match_resource_types")
  protected List<String> matchResourceTypes;
  @SerializedName("match_user_tags")
  protected List<String> matchUserTags;
  protected String name;
  protected List<BackupPolicyPlanReference> plans;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected BackupPolicyScope scope;

  protected BackupPolicy() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the backup policy was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this backup policy.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the healthReasons.
   *
   * The reasons for the current `health_state` (if any).
   *
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the healthReasons
   */
  public List<BackupPolicyHealthReason> getHealthReasons() {
    return healthReasons;
  }

  /**
   * Gets the healthState.
   *
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the href.
   *
   * The URL for this backup policy.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this backup policy.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lastJobCompletedAt.
   *
   * The date and time that the most recent job for this backup policy completed.
   *
   * If absent, no job has yet completed for this backup policy.
   *
   * @return the lastJobCompletedAt
   */
  public Date getLastJobCompletedAt() {
    return lastJobCompletedAt;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the backup policy.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the matchResourceTypes.
   *
   * The resource types this backup policy applies to. Resources that have both a matching type and a matching user tag
   * will be subject to the backup policy.
   *
   * The enumerated values for this property will expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the backup policy on which the
   * unexpected property value was encountered.
   *
   * @return the matchResourceTypes
   */
  public List<String> getMatchResourceTypes() {
    return matchResourceTypes;
  }

  /**
   * Gets the matchUserTags.
   *
   * The user tags this backup policy applies to. Resources that have both a matching user tag and a matching type will
   * be subject to the backup policy.
   *
   * @return the matchUserTags
   */
  public List<String> getMatchUserTags() {
    return matchUserTags;
  }

  /**
   * Gets the name.
   *
   * The name for this backup policy. The name is unique across all backup policies in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the plans.
   *
   * The plans for the backup policy.
   *
   * @return the plans
   */
  public List<BackupPolicyPlanReference> getPlans() {
    return plans;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this backup policy.
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
   * Gets the scope.
   *
   * The scope for this backup policy.
   *
   * @return the scope
   */
  public BackupPolicyScope getScope() {
    return scope;
  }
}

