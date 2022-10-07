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

/**
 * InstanceGroupManagerActionScheduledActionManagerTarget.
 */
public class InstanceGroupManagerActionScheduledActionManagerTarget extends InstanceGroupManagerActionScheduledAction {

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


  protected InstanceGroupManagerActionScheduledActionManagerTarget() { }
}

