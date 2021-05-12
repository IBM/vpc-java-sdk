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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroupManagerScheduledActionByManagerManager.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototype
 */
public class InstanceGroupManagerScheduledActionByManagerManager extends GenericModel {

  @SerializedName("max_membership_count")
  protected Long maxMembershipCount;
  @SerializedName("min_membership_count")
  protected Long minMembershipCount;
  protected String id;
  protected String href;

  protected InstanceGroupManagerScheduledActionByManagerManager() {
  }

  /**
   * Gets the maxMembershipCount.
   *
   * The maximum number of members the instance group should have at the scheduled time.
   *
   * @return the maxMembershipCount
   */
  public Long maxMembershipCount() {
    return maxMembershipCount;
  }

  /**
   * Gets the minMembershipCount.
   *
   * The minimum number of members the instance group should have at the scheduled time.
   *
   * @return the minMembershipCount
   */
  public Long minMembershipCount() {
    return minMembershipCount;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance group manager.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance group manager.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

