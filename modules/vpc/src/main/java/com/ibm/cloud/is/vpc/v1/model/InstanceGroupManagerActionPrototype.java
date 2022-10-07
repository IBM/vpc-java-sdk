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
 * InstanceGroupManagerActionPrototype.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerActionPrototypeScheduledActionPrototype
 */
public class InstanceGroupManagerActionPrototype extends GenericModel {

  protected String name;
  @SerializedName("run_at")
  protected Date runAt;
  protected InstanceGroupManagerScheduledActionGroupPrototype group;
  protected InstanceGroupManagerScheduledActionManagerPrototype manager;
  @SerializedName("cron_spec")
  protected String cronSpec;

  protected InstanceGroupManagerActionPrototype() { }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager action. Names must be unique within the instance group
   * manager. If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the runAt.
   *
   * The date and time the scheduled action will run.
   *
   * @return the runAt
   */
  public Date runAt() {
    return runAt;
  }

  /**
   * Gets the group.
   *
   * @return the group
   */
  public InstanceGroupManagerScheduledActionGroupPrototype group() {
    return group;
  }

  /**
   * Gets the manager.
   *
   * @return the manager
   */
  public InstanceGroupManagerScheduledActionManagerPrototype manager() {
    return manager;
  }

  /**
   * Gets the cronSpec.
   *
   * The cron specification for a recurring scheduled action. Actions can be applied a maximum of one time within a 5
   * min period.
   *
   * @return the cronSpec
   */
  public String cronSpec() {
    return cronSpec;
  }
}

