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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateBackupPolicy options.
 */
public class UpdateBackupPolicyOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> backupPolicyPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> backupPolicyPatch;
    private String ifMatch;

    private Builder(UpdateBackupPolicyOptions updateBackupPolicyOptions) {
      this.id = updateBackupPolicyOptions.id;
      this.backupPolicyPatch = updateBackupPolicyOptions.backupPolicyPatch;
      this.ifMatch = updateBackupPolicyOptions.ifMatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param backupPolicyPatch the backupPolicyPatch
     */
    public Builder(String id, Map<String, Object> backupPolicyPatch) {
      this.id = id;
      this.backupPolicyPatch = backupPolicyPatch;
    }

    /**
     * Builds a UpdateBackupPolicyOptions.
     *
     * @return the new UpdateBackupPolicyOptions instance
     */
    public UpdateBackupPolicyOptions build() {
      return new UpdateBackupPolicyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateBackupPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the backupPolicyPatch.
     *
     * @param backupPolicyPatch the backupPolicyPatch
     * @return the UpdateBackupPolicyOptions builder
     */
    public Builder backupPolicyPatch(Map<String, Object> backupPolicyPatch) {
      this.backupPolicyPatch = backupPolicyPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateBackupPolicyOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateBackupPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.backupPolicyPatch,
      "backupPolicyPatch cannot be null");
    id = builder.id;
    backupPolicyPatch = builder.backupPolicyPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateBackupPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The backup policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the backupPolicyPatch.
   *
   * The backup policy patch.
   *
   * @return the backupPolicyPatch
   */
  public Map<String, Object> backupPolicyPatch() {
    return backupPolicyPatch;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

