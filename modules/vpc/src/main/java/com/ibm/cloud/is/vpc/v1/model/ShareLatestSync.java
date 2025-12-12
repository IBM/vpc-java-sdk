/*
 * (C) Copyright IBM Corp. 2025.
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
 * Information about the latest synchronization for this file share.
 *
 * This property will be present when the `replication_role` is `replica` and at least one replication sync has been
 * completed.
 */
public class ShareLatestSync extends GenericModel {

  @SerializedName("completed_at")
  protected Date completedAt;
  @SerializedName("data_transferred")
  protected Long dataTransferred;
  @SerializedName("started_at")
  protected Date startedAt;

  protected ShareLatestSync() { }

  /**
   * Gets the completedAt.
   *
   * The completed date and time of last synchronization between the replica share and its source.
   *
   * @return the completedAt
   */
  public Date getCompletedAt() {
    return completedAt;
  }

  /**
   * Gets the dataTransferred.
   *
   * The data transferred (in bytes) in the last synchronization between the replica and its source.
   *
   * @return the dataTransferred
   */
  public Long getDataTransferred() {
    return dataTransferred;
  }

  /**
   * Gets the startedAt.
   *
   * The start date and time of last synchronization between the replica share and its source.
   *
   * @return the startedAt
   */
  public Date getStartedAt() {
    return startedAt;
  }
}

