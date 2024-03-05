/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

/**
 * BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.
 */
public class BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype extends BackupPolicyPrototype {

  /**
   * The resource type this backup policy will apply to. Resources that have both a matching type and a matching user
   * tag will be subject to the backup policy.
   */
  public interface MatchResourceType {
    /** volume. */
    String VOLUME = "volume";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private List<String> matchUserTags;
    private String name;
    private List<BackupPolicyPlanPrototype> plans;
    private ResourceGroupIdentity resourceGroup;
    private BackupPolicyScopePrototype scope;
    private String matchResourceType;

    /**
     * Instantiates a new Builder from an existing BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype instance.
     *
     * @param backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype the instance to initialize the Builder with
     */
    public Builder(BackupPolicyPrototype backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype) {
      this.matchUserTags = backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.matchUserTags;
      this.name = backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.name;
      this.plans = backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.plans;
      this.resourceGroup = backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.resourceGroup;
      this.scope = backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.scope;
      this.matchResourceType = backupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.matchResourceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param matchUserTags the matchUserTags
     * @param matchResourceType the matchResourceType
     */
    public Builder(List<String> matchUserTags, String matchResourceType) {
      this.matchUserTags = matchUserTags;
      this.matchResourceType = matchResourceType;
    }

    /**
     * Builds a BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype.
     *
     * @return the new BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype instance
     */
    public BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype build() {
      return new BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype(this);
    }

    /**
     * Adds a new element to matchUserTags.
     *
     * @param matchUserTags the new element to be added
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder addMatchUserTags(String matchUserTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(matchUserTags,
        "matchUserTags cannot be null");
      if (this.matchUserTags == null) {
        this.matchUserTags = new ArrayList<String>();
      }
      this.matchUserTags.add(matchUserTags);
      return this;
    }

    /**
     * Adds a new element to plans.
     *
     * @param plans the new element to be added
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder addPlans(BackupPolicyPlanPrototype plans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(plans,
        "plans cannot be null");
      if (this.plans == null) {
        this.plans = new ArrayList<BackupPolicyPlanPrototype>();
      }
      this.plans.add(plans);
      return this;
    }

    /**
     * Set the matchUserTags.
     * Existing matchUserTags will be replaced.
     *
     * @param matchUserTags the matchUserTags
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder matchUserTags(List<String> matchUserTags) {
      this.matchUserTags = matchUserTags;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the plans.
     * Existing plans will be replaced.
     *
     * @param plans the plans
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder plans(List<BackupPolicyPlanPrototype> plans) {
      this.plans = plans;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the scope.
     *
     * @param scope the scope
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder scope(BackupPolicyScopePrototype scope) {
      this.scope = scope;
      return this;
    }

    /**
     * Set the matchResourceType.
     *
     * @param matchResourceType the matchResourceType
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
     */
    public Builder matchResourceType(String matchResourceType) {
      this.matchResourceType = matchResourceType;
      return this;
    }
  }

  protected BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype() { }

  protected BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.matchUserTags,
      "matchUserTags cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.matchResourceType,
      "matchResourceType cannot be null");
    matchUserTags = builder.matchUserTags;
    name = builder.name;
    plans = builder.plans;
    resourceGroup = builder.resourceGroup;
    scope = builder.scope;
    matchResourceType = builder.matchResourceType;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

