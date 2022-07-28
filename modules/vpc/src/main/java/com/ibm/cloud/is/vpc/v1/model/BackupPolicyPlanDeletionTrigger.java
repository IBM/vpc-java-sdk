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
 * BackupPolicyPlanDeletionTrigger.
 */
public class BackupPolicyPlanDeletionTrigger extends GenericModel {

  @SerializedName("delete_after")
  protected Long deleteAfter;
  @SerializedName("delete_over_count")
  protected Long deleteOverCount;

  /**
   * Gets the deleteAfter.
   *
   * The maximum number of days to keep each backup after creation.
   *
   * @return the deleteAfter
   */
  public Long getDeleteAfter() {
    return deleteAfter;
  }

  /**
   * Gets the deleteOverCount.
   *
   * The maximum number of recent backups to keep. If absent, there is no maximum.
   *
   * @return the deleteOverCount
   */
  public Long getDeleteOverCount() {
    return deleteOverCount;
  }
}

