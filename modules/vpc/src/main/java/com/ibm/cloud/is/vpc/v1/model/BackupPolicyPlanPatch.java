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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * BackupPolicyPlanPatch.
 */
public class BackupPolicyPlanPatch extends GenericModel {

  protected Boolean active;
  @SerializedName("attach_user_tags")
  protected List<String> attachUserTags;
  @SerializedName("copy_user_tags")
  protected Boolean copyUserTags;
  @SerializedName("cron_spec")
  protected String cronSpec;
  @SerializedName("deletion_trigger")
  protected BackupPolicyPlanDeletionTriggerPatch deletionTrigger;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;
    private List<String> attachUserTags;
    private Boolean copyUserTags;
    private String cronSpec;
    private BackupPolicyPlanDeletionTriggerPatch deletionTrigger;
    private String name;

    /**
     * Instantiates a new Builder from an existing BackupPolicyPlanPatch instance.
     *
     * @param backupPolicyPlanPatch the instance to initialize the Builder with
     */
    private Builder(BackupPolicyPlanPatch backupPolicyPlanPatch) {
      this.active = backupPolicyPlanPatch.active;
      this.attachUserTags = backupPolicyPlanPatch.attachUserTags;
      this.copyUserTags = backupPolicyPlanPatch.copyUserTags;
      this.cronSpec = backupPolicyPlanPatch.cronSpec;
      this.deletionTrigger = backupPolicyPlanPatch.deletionTrigger;
      this.name = backupPolicyPlanPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BackupPolicyPlanPatch.
     *
     * @return the new BackupPolicyPlanPatch instance
     */
    public BackupPolicyPlanPatch build() {
      return new BackupPolicyPlanPatch(this);
    }

    /**
     * Adds an attachUserTags to attachUserTags.
     *
     * @param attachUserTags the new attachUserTags
     * @return the BackupPolicyPlanPatch builder
     */
    public Builder addAttachUserTags(String attachUserTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(attachUserTags,
        "attachUserTags cannot be null");
      if (this.attachUserTags == null) {
        this.attachUserTags = new ArrayList<String>();
      }
      this.attachUserTags.add(attachUserTags);
      return this;
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the BackupPolicyPlanPatch builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the attachUserTags.
     * Existing attachUserTags will be replaced.
     *
     * @param attachUserTags the attachUserTags
     * @return the BackupPolicyPlanPatch builder
     */
    public Builder attachUserTags(List<String> attachUserTags) {
      this.attachUserTags = attachUserTags;
      return this;
    }

    /**
     * Set the copyUserTags.
     *
     * @param copyUserTags the copyUserTags
     * @return the BackupPolicyPlanPatch builder
     */
    public Builder copyUserTags(Boolean copyUserTags) {
      this.copyUserTags = copyUserTags;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the BackupPolicyPlanPatch builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the deletionTrigger.
     *
     * @param deletionTrigger the deletionTrigger
     * @return the BackupPolicyPlanPatch builder
     */
    public Builder deletionTrigger(BackupPolicyPlanDeletionTriggerPatch deletionTrigger) {
      this.deletionTrigger = deletionTrigger;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BackupPolicyPlanPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected BackupPolicyPlanPatch() { }

  protected BackupPolicyPlanPatch(Builder builder) {
    active = builder.active;
    attachUserTags = builder.attachUserTags;
    copyUserTags = builder.copyUserTags;
    cronSpec = builder.cronSpec;
    deletionTrigger = builder.deletionTrigger;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPlanPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the active.
   *
   * Indicates whether the plan is active.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }

  /**
   * Gets the attachUserTags.
   *
   * The user tags to attach to backups (snapshots) created by this plan. Updating this value does not change the user
   * tags for backups that have already been created by this plan.
   *
   * @return the attachUserTags
   */
  public List<String> attachUserTags() {
    return attachUserTags;
  }

  /**
   * Gets the copyUserTags.
   *
   * Indicates whether to copy the source's user tags to the created backups (snapshots).
   *
   * @return the copyUserTags
   */
  public Boolean copyUserTags() {
    return copyUserTags;
  }

  /**
   * Gets the cronSpec.
   *
   * The cron specification for the backup schedule. The backup policy jobs
   * (which create and delete backups for this plan) will not start until this time, and may start for up to 90 minutes
   * after this time.
   *
   * All backup schedules for plans in the same policy must be at least an hour apart.
   *
   * @return the cronSpec
   */
  public String cronSpec() {
    return cronSpec;
  }

  /**
   * Gets the deletionTrigger.
   *
   * @return the deletionTrigger
   */
  public BackupPolicyPlanDeletionTriggerPatch deletionTrigger() {
    return deletionTrigger;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this backup policy plan. Names must be unique within the backup policy this plan resides
   * in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the BackupPolicyPlanPatch.
   *
   * Note that properties of the BackupPolicyPlanPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the BackupPolicyPlanPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

