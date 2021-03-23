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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroupManager.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerAutoScale
 */
public class InstanceGroupManager extends GenericModel {

  /**
   * The type of instance group manager.
   */
  public interface ManagerType {
    /** autoscale. */
    String AUTOSCALE = "autoscale";
  }

  protected String href;
  protected String id;
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
  protected List<InstanceGroupManagerPolicyReference> policies;

  protected InstanceGroupManager() {
  }

  /**
   * Gets the href.
   *
   * The URL for this instance group manager.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance group manager.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the managementEnabled.
   *
   * If set to `true`, this manager will control the instance group.
   *
   * @return the managementEnabled
   */
  public Boolean isManagementEnabled() {
    return managementEnabled;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager. Names must be unique within the instance group.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the aggregationWindow.
   *
   * The time window in seconds to aggregate metrics prior to evaluation.
   *
   * @return the aggregationWindow
   */
  public Long getAggregationWindow() {
    return aggregationWindow;
  }

  /**
   * Gets the cooldown.
   *
   * The duration of time in seconds to pause further scale actions after scaling has taken place.
   *
   * @return the cooldown
   */
  public Long getCooldown() {
    return cooldown;
  }

  /**
   * Gets the managerType.
   *
   * The type of instance group manager.
   *
   * @return the managerType
   */
  public String getManagerType() {
    return managerType;
  }

  /**
   * Gets the maxMembershipCount.
   *
   * The maximum number of members in a managed instance group.
   *
   * @return the maxMembershipCount
   */
  public Long getMaxMembershipCount() {
    return maxMembershipCount;
  }

  /**
   * Gets the minMembershipCount.
   *
   * The minimum number of members in a managed instance group.
   *
   * @return the minMembershipCount
   */
  public Long getMinMembershipCount() {
    return minMembershipCount;
  }

  /**
   * Gets the policies.
   *
   * The policies of the instance group manager.
   *
   * @return the policies
   */
  public List<InstanceGroupManagerPolicyReference> getPolicies() {
    return policies;
  }
}

