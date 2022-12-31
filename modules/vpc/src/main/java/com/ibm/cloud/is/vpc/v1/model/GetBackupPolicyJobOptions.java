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
 * The getBackupPolicyJob options.
 */
public class GetBackupPolicyJobOptions extends GenericModel {

  protected String backupPolicyId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String backupPolicyId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetBackupPolicyJobOptions instance.
     *
     * @param getBackupPolicyJobOptions the instance to initialize the Builder with
     */
    private Builder(GetBackupPolicyJobOptions getBackupPolicyJobOptions) {
      this.backupPolicyId = getBackupPolicyJobOptions.backupPolicyId;
      this.id = getBackupPolicyJobOptions.id;
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
     * Builds a GetBackupPolicyJobOptions.
     *
     * @return the new GetBackupPolicyJobOptions instance
     */
    public GetBackupPolicyJobOptions build() {
      return new GetBackupPolicyJobOptions(this);
    }

    /**
     * Set the backupPolicyId.
     *
     * @param backupPolicyId the backupPolicyId
     * @return the GetBackupPolicyJobOptions builder
     */
    public Builder backupPolicyId(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetBackupPolicyJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetBackupPolicyJobOptions() { }

  protected GetBackupPolicyJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.backupPolicyId,
      "backupPolicyId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    backupPolicyId = builder.backupPolicyId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetBackupPolicyJobOptions builder
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
   * The backup policy job identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

