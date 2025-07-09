/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BackupPolicyPlanPrototype.
 */
public class BackupPolicyPlanPrototype extends GenericModel {

  protected Boolean active;
  @SerializedName("attach_user_tags")
  protected List<String> attachUserTags;
  @SerializedName("clone_policy")
  protected BackupPolicyPlanClonePolicyPrototype clonePolicy;
  @SerializedName("copy_user_tags")
  protected Boolean copyUserTags;
  @SerializedName("cron_spec")
  protected String cronSpec;
  @SerializedName("deletion_trigger")
  protected BackupPolicyPlanDeletionTriggerPrototype deletionTrigger;
  protected String name;
  @SerializedName("remote_region_policies")
  protected List<BackupPolicyPlanRemoteRegionPolicyPrototype> remoteRegionPolicies;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean active;
    private List<String> attachUserTags;
    private BackupPolicyPlanClonePolicyPrototype clonePolicy;
    private Boolean copyUserTags;
    private String cronSpec;
    private BackupPolicyPlanDeletionTriggerPrototype deletionTrigger;
    private String name;
    private List<BackupPolicyPlanRemoteRegionPolicyPrototype> remoteRegionPolicies;

    /**
     * Instantiates a new Builder from an existing BackupPolicyPlanPrototype instance.
     *
     * @param backupPolicyPlanPrototype the instance to initialize the Builder with
     */
    private Builder(BackupPolicyPlanPrototype backupPolicyPlanPrototype) {
      this.active = backupPolicyPlanPrototype.active;
      this.attachUserTags = backupPolicyPlanPrototype.attachUserTags;
      this.clonePolicy = backupPolicyPlanPrototype.clonePolicy;
      this.copyUserTags = backupPolicyPlanPrototype.copyUserTags;
      this.cronSpec = backupPolicyPlanPrototype.cronSpec;
      this.deletionTrigger = backupPolicyPlanPrototype.deletionTrigger;
      this.name = backupPolicyPlanPrototype.name;
      this.remoteRegionPolicies = backupPolicyPlanPrototype.remoteRegionPolicies;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cronSpec the cronSpec
     */
    public Builder(String cronSpec) {
      this.cronSpec = cronSpec;
    }

    /**
     * Builds a BackupPolicyPlanPrototype.
     *
     * @return the new BackupPolicyPlanPrototype instance
     */
    public BackupPolicyPlanPrototype build() {
      return new BackupPolicyPlanPrototype(this);
    }

    /**
     * Adds a new element to attachUserTags.
     *
     * @param attachUserTags the new element to be added
     * @return the BackupPolicyPlanPrototype builder
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
     * Adds a new element to remoteRegionPolicies.
     *
     * @param remoteRegionPolicies the new element to be added
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder addRemoteRegionPolicies(BackupPolicyPlanRemoteRegionPolicyPrototype remoteRegionPolicies) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(remoteRegionPolicies,
        "remoteRegionPolicies cannot be null");
      if (this.remoteRegionPolicies == null) {
        this.remoteRegionPolicies = new ArrayList<BackupPolicyPlanRemoteRegionPolicyPrototype>();
      }
      this.remoteRegionPolicies.add(remoteRegionPolicies);
      return this;
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the BackupPolicyPlanPrototype builder
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
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder attachUserTags(List<String> attachUserTags) {
      this.attachUserTags = attachUserTags;
      return this;
    }

    /**
     * Set the clonePolicy.
     *
     * @param clonePolicy the clonePolicy
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder clonePolicy(BackupPolicyPlanClonePolicyPrototype clonePolicy) {
      this.clonePolicy = clonePolicy;
      return this;
    }

    /**
     * Set the copyUserTags.
     *
     * @param copyUserTags the copyUserTags
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder copyUserTags(Boolean copyUserTags) {
      this.copyUserTags = copyUserTags;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the deletionTrigger.
     *
     * @param deletionTrigger the deletionTrigger
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder deletionTrigger(BackupPolicyPlanDeletionTriggerPrototype deletionTrigger) {
      this.deletionTrigger = deletionTrigger;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the remoteRegionPolicies.
     * Existing remoteRegionPolicies will be replaced.
     *
     * @param remoteRegionPolicies the remoteRegionPolicies
     * @return the BackupPolicyPlanPrototype builder
     */
    public Builder remoteRegionPolicies(List<BackupPolicyPlanRemoteRegionPolicyPrototype> remoteRegionPolicies) {
      this.remoteRegionPolicies = remoteRegionPolicies;
      return this;
    }
  }

  protected BackupPolicyPlanPrototype() { }

  protected BackupPolicyPlanPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cronSpec,
      "cronSpec cannot be null");
    active = builder.active;
    attachUserTags = builder.attachUserTags;
    clonePolicy = builder.clonePolicy;
    copyUserTags = builder.copyUserTags;
    cronSpec = builder.cronSpec;
    deletionTrigger = builder.deletionTrigger;
    name = builder.name;
    remoteRegionPolicies = builder.remoteRegionPolicies;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPlanPrototype builder
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
   * The user tags to attach to each backup (snapshot) created by this plan.
   *
   * @return the attachUserTags
   */
  public List<String> attachUserTags() {
    return attachUserTags;
  }

  /**
   * Gets the clonePolicy.
   *
   * @return the clonePolicy
   */
  public BackupPolicyPlanClonePolicyPrototype clonePolicy() {
    return clonePolicy;
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
  public BackupPolicyPlanDeletionTriggerPrototype deletionTrigger() {
    return deletionTrigger;
  }

  /**
   * Gets the name.
   *
   * The name for this backup policy plan. The name must not be used by another plan for the backup policy. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the remoteRegionPolicies.
   *
   * The policies for additional backups in remote regions.
   *
   * @return the remoteRegionPolicies
   */
  public List<BackupPolicyPlanRemoteRegionPolicyPrototype> remoteRegionPolicies() {
    return remoteRegionPolicies;
  }
}

