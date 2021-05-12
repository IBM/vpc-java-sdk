/*
 * (C) Copyright IBM Corp. 2021.
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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstanceGroupManagerActionPatch.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerActionPatchScheduledActionPatch
 */
public class InstanceGroupManagerActionPatch extends GenericModel {

  protected String name;
  @SerializedName("cron_spec")
  protected String cronSpec;
  protected InstanceGroupManagerScheduledActionGroupPatch group;
  protected InstanceGroupManagerScheduledActionByManagerPatchManager manager;
  @SerializedName("run_at")
  protected Date runAt;

  protected InstanceGroupManagerActionPatch() {
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager action. Names must be unique within the instance group
   * manager.
   *
   * @return the name
   */
  public String name() {
    return name;
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

  /**
   * Gets the group.
   *
   * @return the group
   */
  public InstanceGroupManagerScheduledActionGroupPatch group() {
    return group;
  }

  /**
   * Gets the manager.
   *
   * @return the manager
   */
  public InstanceGroupManagerScheduledActionByManagerPatchManager manager() {
    return manager;
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
   * Construct a JSON merge-patch from the InstanceGroupManagerActionPatch.
   *
   * Note that properties of the InstanceGroupManagerActionPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceGroupManagerActionPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

