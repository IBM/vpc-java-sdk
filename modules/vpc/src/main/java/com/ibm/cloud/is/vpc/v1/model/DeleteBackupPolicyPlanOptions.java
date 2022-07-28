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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteBackupPolicyPlan options.
 */
public class DeleteBackupPolicyPlanOptions extends GenericModel {

  protected String backupPolicyId;
  protected String id;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String backupPolicyId;
    private String id;
    private String ifMatch;

    private Builder(DeleteBackupPolicyPlanOptions deleteBackupPolicyPlanOptions) {
      this.backupPolicyId = deleteBackupPolicyPlanOptions.backupPolicyId;
      this.id = deleteBackupPolicyPlanOptions.id;
      this.ifMatch = deleteBackupPolicyPlanOptions.ifMatch;
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
     */
    public Builder(String backupPolicyId, String id) {
      this.backupPolicyId = backupPolicyId;
      this.id = id;
    }

    /**
     * Builds a DeleteBackupPolicyPlanOptions.
     *
     * @return the new DeleteBackupPolicyPlanOptions instance
     */
    public DeleteBackupPolicyPlanOptions build() {
      return new DeleteBackupPolicyPlanOptions(this);
    }

    /**
     * Set the backupPolicyId.
     *
     * @param backupPolicyId the backupPolicyId
     * @return the DeleteBackupPolicyPlanOptions builder
     */
    public Builder backupPolicyId(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteBackupPolicyPlanOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the DeleteBackupPolicyPlanOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected DeleteBackupPolicyPlanOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.backupPolicyId,
      "backupPolicyId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    backupPolicyId = builder.backupPolicyId;
    id = builder.id;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a DeleteBackupPolicyPlanOptions builder
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
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

