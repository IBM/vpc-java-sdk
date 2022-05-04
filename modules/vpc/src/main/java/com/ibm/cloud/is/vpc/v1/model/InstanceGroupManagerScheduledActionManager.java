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
 * InstanceGroupManagerScheduledActionManager.
 *
 * Classes which extend this class:
 * - InstanceGroupManagerScheduledActionManagerAutoScale
 */
public class InstanceGroupManagerScheduledActionManager extends GenericModel {

  protected InstanceGroupManagerReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("max_membership_count")
  protected Long maxMembershipCount;
  @SerializedName("min_membership_count")
  protected Long minMembershipCount;

  protected InstanceGroupManagerScheduledActionManager() {
  }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public InstanceGroupManagerReferenceDeleted getDeleted() {
    return deleted;
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
   * Gets the name.
   *
   * The user-defined name for this instance group manager.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the maxMembershipCount.
   *
   * The desired maximum number of instance group members at the scheduled time.
   *
   * @return the maxMembershipCount
   */
  public Long getMaxMembershipCount() {
    return maxMembershipCount;
  }

  /**
   * Gets the minMembershipCount.
   *
   * The desired minimum number of instance group members at the scheduled time.
   *
   * @return the minMembershipCount
   */
  public Long getMinMembershipCount() {
    return minMembershipCount;
  }
}

