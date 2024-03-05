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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createBackupPolicy options.
 */
public class CreateBackupPolicyOptions extends GenericModel {

  protected BackupPolicyPrototype backupPolicyPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private BackupPolicyPrototype backupPolicyPrototype;

    /**
     * Instantiates a new Builder from an existing CreateBackupPolicyOptions instance.
     *
     * @param createBackupPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateBackupPolicyOptions createBackupPolicyOptions) {
      this.backupPolicyPrototype = createBackupPolicyOptions.backupPolicyPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param backupPolicyPrototype the backupPolicyPrototype
     */
    public Builder(BackupPolicyPrototype backupPolicyPrototype) {
      this.backupPolicyPrototype = backupPolicyPrototype;
    }

    /**
     * Builds a CreateBackupPolicyOptions.
     *
     * @return the new CreateBackupPolicyOptions instance
     */
    public CreateBackupPolicyOptions build() {
      return new CreateBackupPolicyOptions(this);
    }

    /**
     * Set the backupPolicyPrototype.
     *
     * @param backupPolicyPrototype the backupPolicyPrototype
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder backupPolicyPrototype(BackupPolicyPrototype backupPolicyPrototype) {
      this.backupPolicyPrototype = backupPolicyPrototype;
      return this;
    }
  }

  protected CreateBackupPolicyOptions() { }

  protected CreateBackupPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.backupPolicyPrototype,
      "backupPolicyPrototype cannot be null");
    backupPolicyPrototype = builder.backupPolicyPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateBackupPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the backupPolicyPrototype.
   *
   * The backup policy prototype object.
   *
   * @return the backupPolicyPrototype
   */
  public BackupPolicyPrototype backupPolicyPrototype() {
    return backupPolicyPrototype;
  }
}

