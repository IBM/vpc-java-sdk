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

import java.util.ArrayList;
import java.util.List;

/**
 * BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.
 */
public class BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype extends BackupPolicyPrototype {

  /**
   * An item to include.
   */
  public interface IncludedContent {
    /** boot_volume. */
    String BOOT_VOLUME = "boot_volume";
    /** data_volumes. */
    String DATA_VOLUMES = "data_volumes";
  }

  /**
   * The resource type this backup policy will apply to. Resources that have both a matching type and a matching user
   * tag will be subject to the backup policy.
   *
   * A backup policy of type `instance` will create a backup of all volumes with a
   * `storage_generation` value of `1` attached to the instance.
   */
  public interface MatchResourceType {
    /** instance. */
    String INSTANCE = "instance";
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
    private List<String> includedContent;
    private String matchResourceType;

    /**
     * Instantiates a new Builder from an existing BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype instance.
     *
     * @param backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype the instance to initialize the Builder with
     */
    public Builder(BackupPolicyPrototype backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype) {
      this.matchUserTags = backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.matchUserTags;
      this.name = backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.name;
      this.plans = backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.plans;
      this.resourceGroup = backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.resourceGroup;
      this.scope = backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.scope;
      this.includedContent = backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.includedContent;
      this.matchResourceType = backupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.matchResourceType;
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
     * Builds a BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype.
     *
     * @return the new BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype instance
     */
    public BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype build() {
      return new BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype(this);
    }

    /**
     * Adds a new element to matchUserTags.
     *
     * @param matchUserTags the new element to be added
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
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
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
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
     * Adds a new element to includedContent.
     *
     * @param includedContent the new element to be added
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
     */
    public Builder addIncludedContent(String includedContent) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(includedContent,
        "includedContent cannot be null");
      if (this.includedContent == null) {
        this.includedContent = new ArrayList<String>();
      }
      this.includedContent.add(includedContent);
      return this;
    }

    /**
     * Set the matchUserTags.
     * Existing matchUserTags will be replaced.
     *
     * @param matchUserTags the matchUserTags
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
     */
    public Builder matchUserTags(List<String> matchUserTags) {
      this.matchUserTags = matchUserTags;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
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
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
     */
    public Builder plans(List<BackupPolicyPlanPrototype> plans) {
      this.plans = plans;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the scope.
     *
     * @param scope the scope
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
     */
    public Builder scope(BackupPolicyScopePrototype scope) {
      this.scope = scope;
      return this;
    }

    /**
     * Set the includedContent.
     * Existing includedContent will be replaced.
     *
     * @param includedContent the includedContent
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
     */
    public Builder includedContent(List<String> includedContent) {
      this.includedContent = includedContent;
      return this;
    }

    /**
     * Set the matchResourceType.
     *
     * @param matchResourceType the matchResourceType
     * @return the BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
     */
    public Builder matchResourceType(String matchResourceType) {
      this.matchResourceType = matchResourceType;
      return this;
    }
  }

  protected BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype() { }

  protected BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.matchUserTags,
      "matchUserTags cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.matchResourceType,
      "matchResourceType cannot be null");
    matchUserTags = builder.matchUserTags;
    name = builder.name;
    plans = builder.plans;
    resourceGroup = builder.resourceGroup;
    scope = builder.scope;
    includedContent = builder.includedContent;
    matchResourceType = builder.matchResourceType;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

