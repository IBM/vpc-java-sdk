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
 * The listBackupPolicyPlans options.
 */
public class ListBackupPolicyPlansOptions extends GenericModel {

  protected String backupPolicyId;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String backupPolicyId;
    private String name;

    /**
     * Instantiates a new Builder from an existing ListBackupPolicyPlansOptions instance.
     *
     * @param listBackupPolicyPlansOptions the instance to initialize the Builder with
     */
    private Builder(ListBackupPolicyPlansOptions listBackupPolicyPlansOptions) {
      this.backupPolicyId = listBackupPolicyPlansOptions.backupPolicyId;
      this.name = listBackupPolicyPlansOptions.name;
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
     */
    public Builder(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
    }

    /**
     * Builds a ListBackupPolicyPlansOptions.
     *
     * @return the new ListBackupPolicyPlansOptions instance
     */
    public ListBackupPolicyPlansOptions build() {
      return new ListBackupPolicyPlansOptions(this);
    }

    /**
     * Set the backupPolicyId.
     *
     * @param backupPolicyId the backupPolicyId
     * @return the ListBackupPolicyPlansOptions builder
     */
    public Builder backupPolicyId(String backupPolicyId) {
      this.backupPolicyId = backupPolicyId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListBackupPolicyPlansOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected ListBackupPolicyPlansOptions() { }

  protected ListBackupPolicyPlansOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.backupPolicyId,
      "backupPolicyId cannot be empty");
    backupPolicyId = builder.backupPolicyId;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a ListBackupPolicyPlansOptions builder
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
   * Gets the name.
   *
   * Filters the collection to resources with the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

