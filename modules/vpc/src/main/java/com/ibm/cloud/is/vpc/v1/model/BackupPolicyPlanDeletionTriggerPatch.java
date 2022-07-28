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
 * BackupPolicyPlanDeletionTriggerPatch.
 */
public class BackupPolicyPlanDeletionTriggerPatch extends GenericModel {

  @SerializedName("delete_after")
  protected Long deleteAfter;
  @SerializedName("delete_over_count")
  protected Long deleteOverCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Long deleteAfter;
    private Long deleteOverCount;

    private Builder(BackupPolicyPlanDeletionTriggerPatch backupPolicyPlanDeletionTriggerPatch) {
      this.deleteAfter = backupPolicyPlanDeletionTriggerPatch.deleteAfter;
      this.deleteOverCount = backupPolicyPlanDeletionTriggerPatch.deleteOverCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BackupPolicyPlanDeletionTriggerPatch.
     *
     * @return the new BackupPolicyPlanDeletionTriggerPatch instance
     */
    public BackupPolicyPlanDeletionTriggerPatch build() {
      return new BackupPolicyPlanDeletionTriggerPatch(this);
    }

    /**
     * Set the deleteAfter.
     *
     * @param deleteAfter the deleteAfter
     * @return the BackupPolicyPlanDeletionTriggerPatch builder
     */
    public Builder deleteAfter(long deleteAfter) {
      this.deleteAfter = deleteAfter;
      return this;
    }

    /**
     * Set the deleteOverCount.
     *
     * @param deleteOverCount the deleteOverCount
     * @return the BackupPolicyPlanDeletionTriggerPatch builder
     */
    public Builder deleteOverCount(long deleteOverCount) {
      this.deleteOverCount = deleteOverCount;
      return this;
    }
  }

  protected BackupPolicyPlanDeletionTriggerPatch(Builder builder) {
    deleteAfter = builder.deleteAfter;
    deleteOverCount = builder.deleteOverCount;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPlanDeletionTriggerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deleteAfter.
   *
   * The maximum number of days to keep each backup after creation.
   *
   * @return the deleteAfter
   */
  public Long deleteAfter() {
    return deleteAfter;
  }

  /**
   * Gets the deleteOverCount.
   *
   * The maximum number of recent backups to keep. Specify `null` to remove any existing maximum.
   *
   * @return the deleteOverCount
   */
  public Long deleteOverCount() {
    return deleteOverCount;
  }
}

