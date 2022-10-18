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
 * The updateBackupPolicyPlan options.
 */
public class UpdateBackupPolicyPlanOptions extends GenericModel {

  protected String backupPolicyId;
  protected String id;
  protected Map<String, Object> backupPolicyPlanPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String backupPolicyId;
    private String id;
    private Map<String, Object> backupPolicyPlanPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateBackupPolicyPlanOptions instance.
     *
     * @param updateBackupPolicyPlanOptions the instance to initialize the Builder with
     */
    private Builder(UpdateBackupPolicyPlanOptions updateBackupPolicyPlanOptions) {
      this.backupPolicyId = updateBackupPolicyPlanOptions.backupPolicyId;
      this.id = updateBackupPolicyPlanOptions.id;
      this.backupPolicyPlanPatch = updateBackupPolicyPlanOptions.backupPolicyPlanPatch;
      this.ifMatch = updateBackupPolicyPlanOptions.ifMatch;
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
     * @param id the id
     * @param backupPolicyPlanPatch the backupPolicyPlanPatch
     */
    public Builder(String backupPolicyId, String id, Map<String, Object> backupPolicyPlanPatch) {
      this.backupPolicyId = backupPolicyId;
      this.id = id;
      this.backupPolicyPlanPatch = backupPolicyPlanPatch;
    }

    /**
     * Builds a UpdateBackupPolicyPlanOptions.
     *
     * @return the new UpdateBackupPolicyPlanOptions instance
     */
    public UpdateBackupPolicyPlanOptions build() {
      return new UpdateBackupPolicyPlanOptions(this);
    }

    /**
     * Set the backupPolicyId.
     *
     * @param backupPolicyId the backupPolicyId
     * @return the UpdateBackupPolicyPlanOptions builder
     */
    public Builder backupPolicyId(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateBackupPolicyPlanOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the backupPolicyPlanPatch.
     *
     * @param backupPolicyPlanPatch the backupPolicyPlanPatch
     * @return the UpdateBackupPolicyPlanOptions builder
     */
    public Builder backupPolicyPlanPatch(Map<String, Object> backupPolicyPlanPatch) {
      this.backupPolicyPlanPatch = backupPolicyPlanPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateBackupPolicyPlanOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateBackupPolicyPlanOptions() { }

  protected UpdateBackupPolicyPlanOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.backupPolicyId,
      "backupPolicyId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.backupPolicyPlanPatch,
      "backupPolicyPlanPatch cannot be null");
    backupPolicyId = builder.backupPolicyId;
    id = builder.id;
    backupPolicyPlanPatch = builder.backupPolicyPlanPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateBackupPolicyPlanOptions builder
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
   * Gets the id.
   *
   * The backup policy plan identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the backupPolicyPlanPatch.
   *
   * The backup policy plan patch.
   *
   * @return the backupPolicyPlanPatch
   */
  public Map<String, Object> backupPolicyPlanPatch() {
    return backupPolicyPlanPatch;
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

