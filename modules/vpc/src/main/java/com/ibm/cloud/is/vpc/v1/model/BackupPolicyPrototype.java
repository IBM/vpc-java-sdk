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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BackupPolicyPrototype.
 *
 * Classes which extend this class:
 * - BackupPolicyPrototypeBackupPolicyMatchResourceTypeVolumePrototype
 * - BackupPolicyPrototypeBackupPolicyMatchResourceTypeInstancePrototype
 */
public class BackupPolicyPrototype extends GenericModel {

  /**
   * The resource type this backup policy will apply to. Resources that have both a matching type and a matching user
   * tag will be subject to the backup policy.
   */
  public interface MatchResourceType {
    /** instance. */
    String INSTANCE = "instance";
    /** volume. */
    String VOLUME = "volume";
  }

  /**
   * An item to include.
   */
  public interface IncludedContent {
    /** boot_volume. */
    String BOOT_VOLUME = "boot_volume";
    /** data_volumes. */
    String DATA_VOLUMES = "data_volumes";
  }

  @SerializedName("match_resource_type")
  protected String matchResourceType;
  @SerializedName("match_user_tags")
  protected List<String> matchUserTags;
  protected String name;
  protected List<BackupPolicyPlanPrototype> plans;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected BackupPolicyScopePrototype scope;
  @SerializedName("included_content")
  protected List<String> includedContent;

  protected BackupPolicyPrototype() { }

  /**
   * Gets the matchResourceType.
   *
   * The resource type this backup policy will apply to. Resources that have both a matching type and a matching user
   * tag will be subject to the backup policy.
   *
   * @return the matchResourceType
   */
  public String matchResourceType() {
    return matchResourceType;
  }

  /**
   * Gets the matchUserTags.
   *
   * The user tags this backup policy will apply to. Resources that have both a matching user tag and a matching type
   * will be subject to the backup policy.
   *
   * @return the matchUserTags
   */
  public List<String> matchUserTags() {
    return matchUserTags;
  }

  /**
   * Gets the name.
   *
   * The name for this backup policy. The name must not be used by another backup policy in the region. If unspecified,
   * the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the plans.
   *
   * The prototype objects for backup plans to be created for this backup policy.
   *
   * @return the plans
   */
  public List<BackupPolicyPlanPrototype> plans() {
    return plans;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the scope.
   *
   * The scope to use for this backup policy.
   *
   * If unspecified, the policy will be scoped to the account.
   *
   * @return the scope
   */
  public BackupPolicyScopePrototype scope() {
    return scope;
  }

  /**
   * Gets the includedContent.
   *
   * The included content for backups created using this policy:
   * - `boot_volume`: Include the instance's boot volume.
   * - `data_volumes`: Include the instance's data volumes.
   *
   * @return the includedContent
   */
  public List<String> includedContent() {
    return includedContent;
  }
}

