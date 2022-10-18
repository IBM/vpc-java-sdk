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
 * InstanceGroupManagerAction.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerActionScheduledAction
 */
public class InstanceGroupManagerAction extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** instance_group_manager_action. */
    String INSTANCE_GROUP_MANAGER_ACTION = "instance_group_manager_action";
  }

  /**
   * The status of the instance group action
   * - `active`: Action is ready to be run
   * - `completed`: Action was completed successfully
   * - `failed`: Action could not be completed successfully
   * - `incompatible`: Action parameters are not compatible with the group or manager
   * - `omitted`: Action was not applied because this action's manager was disabled.
   */
  public interface Status {
    /** active. */
    String ACTIVE = "active";
    /** completed. */
    String COMPLETED = "completed";
    /** failed. */
    String FAILED = "failed";
    /** incompatible. */
    String INCOMPATIBLE = "incompatible";
    /** omitted. */
    String OMITTED = "omitted";
  }

  /**
   * The type of action for the instance group.
   */
  public interface ActionType {
    /** scheduled. */
    String SCHEDULED = "scheduled";
  }

  @SerializedName("auto_delete")
  protected Boolean autoDelete;
  @SerializedName("auto_delete_timeout")
  protected Long autoDeleteTimeout;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("updated_at")
  protected Date updatedAt;
  @SerializedName("action_type")
  protected String actionType;
  @SerializedName("cron_spec")
  protected String cronSpec;
  @SerializedName("last_applied_at")
  protected Date lastAppliedAt;
  @SerializedName("next_run_at")
  protected Date nextRunAt;
  protected InstanceGroupManagerScheduledActionGroup group;
  protected InstanceGroupManagerScheduledActionManager manager;

  protected InstanceGroupManagerAction() { }

  /**
   * Gets the autoDelete.
   *
   * Indicates whether this scheduled action will be automatically deleted after it has completed and
   * `auto_delete_timeout` hours have passed. At present, this is always
   * `true`, but may be modifiable in the future.
   *
   * @return the autoDelete
   */
  public Boolean isAutoDelete() {
    return autoDelete;
  }

  /**
   * Gets the autoDeleteTimeout.
   *
   * If `auto_delete` is `true`, and this scheduled action has finished, the hours after which it will be automatically
   * deleted. If the value is `0`, the action will be deleted once it has finished. This value may be modifiable in the
   * future.
   *
   * @return the autoDeleteTimeout
   */
  public Long getAutoDeleteTimeout() {
    return autoDeleteTimeout;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the instance group manager action was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance group manager action.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance group manager action.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager action.
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
   * Gets the status.
   *
   * The status of the instance group action
   * - `active`: Action is ready to be run
   * - `completed`: Action was completed successfully
   * - `failed`: Action could not be completed successfully
   * - `incompatible`: Action parameters are not compatible with the group or manager
   * - `omitted`: Action was not applied because this action's manager was disabled.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the updatedAt.
   *
   * The date and time that the instance group manager action was updated.
   *
   * @return the updatedAt
   */
  public Date getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the actionType.
   *
   * The type of action for the instance group.
   *
   * @return the actionType
   */
  public String getActionType() {
    return actionType;
  }

  /**
   * Gets the cronSpec.
   *
   * The cron specification for a recurring scheduled action. Actions can be applied a maximum of one time within a 5
   * min period.
   *
   * @return the cronSpec
   */
  public String getCronSpec() {
    return cronSpec;
  }

  /**
   * Gets the lastAppliedAt.
   *
   * The date and time the scheduled action was last applied. If absent, the action has never been applied.
   *
   * @return the lastAppliedAt
   */
  public Date getLastAppliedAt() {
    return lastAppliedAt;
  }

  /**
   * Gets the nextRunAt.
   *
   * The date and time the scheduled action will next run. If absent, the system is currently calculating the next run
   * time.
   *
   * @return the nextRunAt
   */
  public Date getNextRunAt() {
    return nextRunAt;
  }

  /**
   * Gets the group.
   *
   * @return the group
   */
  public InstanceGroupManagerScheduledActionGroup getGroup() {
    return group;
  }

  /**
   * Gets the manager.
   *
   * @return the manager
   */
  public InstanceGroupManagerScheduledActionManager getManager() {
    return manager;
  }
}

