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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createBackupPolicyPlan options.
 */
public class CreateBackupPolicyPlanOptions extends GenericModel {

  protected String backupPolicyId;
  protected String cronSpec;
  protected Boolean active;
  protected List<String> attachUserTags;
  protected Boolean copyUserTags;
  protected BackupPolicyPlanDeletionTriggerPrototype deletionTrigger;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String backupPolicyId;
    private String cronSpec;
    private Boolean active;
    private List<String> attachUserTags;
    private Boolean copyUserTags;
    private BackupPolicyPlanDeletionTriggerPrototype deletionTrigger;
    private String name;

    private Builder(CreateBackupPolicyPlanOptions createBackupPolicyPlanOptions) {
      this.backupPolicyId = createBackupPolicyPlanOptions.backupPolicyId;
      this.cronSpec = createBackupPolicyPlanOptions.cronSpec;
      this.active = createBackupPolicyPlanOptions.active;
      this.attachUserTags = createBackupPolicyPlanOptions.attachUserTags;
      this.copyUserTags = createBackupPolicyPlanOptions.copyUserTags;
      this.deletionTrigger = createBackupPolicyPlanOptions.deletionTrigger;
      this.name = createBackupPolicyPlanOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param backupPolicyId the backupPolicyId
     * @param cronSpec the cronSpec
     */
    public Builder(String backupPolicyId, String cronSpec) {
      this.backupPolicyId = backupPolicyId;
      this.cronSpec = cronSpec;
    }

    /**
     * Builds a CreateBackupPolicyPlanOptions.
     *
     * @return the new CreateBackupPolicyPlanOptions instance
     */
    public CreateBackupPolicyPlanOptions build() {
      return new CreateBackupPolicyPlanOptions(this);
    }

    /**
     * Adds an attachUserTags to attachUserTags.
     *
     * @param attachUserTags the new attachUserTags
     * @return the CreateBackupPolicyPlanOptions builder
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
     * Set the backupPolicyId.
     *
     * @param backupPolicyId the backupPolicyId
     * @return the CreateBackupPolicyPlanOptions builder
     */
    public Builder backupPolicyId(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the CreateBackupPolicyPlanOptions builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the CreateBackupPolicyPlanOptions builder
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
     * @return the CreateBackupPolicyPlanOptions builder
     */
    public Builder attachUserTags(List<String> attachUserTags) {
      this.attachUserTags = attachUserTags;
      return this;
    }

    /**
     * Set the copyUserTags.
     *
     * @param copyUserTags the copyUserTags
     * @return the CreateBackupPolicyPlanOptions builder
     */
    public Builder copyUserTags(Boolean copyUserTags) {
      this.copyUserTags = copyUserTags;
      return this;
    }

    /**
     * Set the deletionTrigger.
     *
     * @param deletionTrigger the deletionTrigger
     * @return the CreateBackupPolicyPlanOptions builder
     */
    public Builder deletionTrigger(BackupPolicyPlanDeletionTriggerPrototype deletionTrigger) {
      this.deletionTrigger = deletionTrigger;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateBackupPolicyPlanOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateBackupPolicyPlanOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.backupPolicyId,
      "backupPolicyId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cronSpec,
      "cronSpec cannot be null");
    backupPolicyId = builder.backupPolicyId;
    cronSpec = builder.cronSpec;
    active = builder.active;
    attachUserTags = builder.attachUserTags;
    copyUserTags = builder.copyUserTags;
    deletionTrigger = builder.deletionTrigger;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateBackupPolicyPlanOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the backupPolicyId.
   *
   * The backup policy identifier.
   *
   * @return the backupPolicyId
   */
  public String backupPolicyId() {
    return backupPolicyId;
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
   * User tags to attach to each backup (snapshot) created by this plan. If unspecified, no user tags will be attached.
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
   * Gets the deletionTrigger.
   *
   * @return the deletionTrigger
   */
  public BackupPolicyPlanDeletionTriggerPrototype deletionTrigger() {
    return deletionTrigger;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this backup policy plan. Names must be unique within the backup policy this plan resides
   * in. If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

