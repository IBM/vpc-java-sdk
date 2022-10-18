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
 * BackupPolicyPatch.
 */
public class BackupPolicyPatch extends GenericModel {

  @SerializedName("match_user_tags")
  protected List<String> matchUserTags;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> matchUserTags;
    private String name;

    /**
     * Instantiates a new Builder from an existing BackupPolicyPatch instance.
     *
     * @param backupPolicyPatch the instance to initialize the Builder with
     */
    private Builder(BackupPolicyPatch backupPolicyPatch) {
      this.matchUserTags = backupPolicyPatch.matchUserTags;
      this.name = backupPolicyPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BackupPolicyPatch.
     *
     * @return the new BackupPolicyPatch instance
     */
    public BackupPolicyPatch build() {
      return new BackupPolicyPatch(this);
    }

    /**
     * Adds an matchUserTags to matchUserTags.
     *
     * @param matchUserTags the new matchUserTags
     * @return the BackupPolicyPatch builder
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
     * Set the matchUserTags.
     * Existing matchUserTags will be replaced.
     *
     * @param matchUserTags the matchUserTags
     * @return the BackupPolicyPatch builder
     */
    public Builder matchUserTags(List<String> matchUserTags) {
      this.matchUserTags = matchUserTags;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BackupPolicyPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected BackupPolicyPatch() { }

  protected BackupPolicyPatch(Builder builder) {
    matchUserTags = builder.matchUserTags;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a BackupPolicyPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the matchUserTags.
   *
   * The user tags this backup policy applies to (replacing any existing tags). Resources that have both a matching user
   * tag and a matching type will be subject to the backup policy.
   *
   * @return the matchUserTags
   */
  public List<String> matchUserTags() {
    return matchUserTags;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this backup policy. Names must be unique within the region this backup policy resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the BackupPolicyPatch.
   *
   * Note that properties of the BackupPolicyPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the BackupPolicyPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

