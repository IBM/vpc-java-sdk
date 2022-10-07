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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroupManagerPrototype.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype
 * - InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype
 */
public class InstanceGroupManagerPrototype extends GenericModel {

  /**
   * The type of instance group manager.
   */
  public interface ManagerType {
    /** autoscale. */
    String AUTOSCALE = "autoscale";
  }

  @SerializedName("management_enabled")
  protected Boolean managementEnabled;
  protected String name;
  @SerializedName("aggregation_window")
  protected Long aggregationWindow;
  protected Long cooldown;
  @SerializedName("manager_type")
  protected String managerType;
  @SerializedName("max_membership_count")
  protected Long maxMembershipCount;
  @SerializedName("min_membership_count")
  protected Long minMembershipCount;

  protected InstanceGroupManagerPrototype() { }

  /**
   * Gets the managementEnabled.
   *
   * Indicates whether this manager will control the instance group.
   *
   * @return the managementEnabled
   */
  public Boolean managementEnabled() {
    return managementEnabled;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager. Names must be unique within the instance group. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the aggregationWindow.
   *
   * The time window in seconds to aggregate metrics prior to evaluation.
   *
   * @return the aggregationWindow
   */
  public Long aggregationWindow() {
    return aggregationWindow;
  }

  /**
   * Gets the cooldown.
   *
   * The duration of time in seconds to pause further scale actions after scaling has taken place.
   *
   * @return the cooldown
   */
  public Long cooldown() {
    return cooldown;
  }

  /**
   * Gets the managerType.
   *
   * The type of instance group manager.
   *
   * @return the managerType
   */
  public String managerType() {
    return managerType;
  }

  /**
   * Gets the maxMembershipCount.
   *
   * The maximum number of members in a managed instance group.
   *
   * @return the maxMembershipCount
   */
  public Long maxMembershipCount() {
    return maxMembershipCount;
  }

  /**
   * Gets the minMembershipCount.
   *
   * The minimum number of members in a managed instance group.
   *
   * @return the minMembershipCount
   */
  public Long minMembershipCount() {
    return minMembershipCount;
  }
}

