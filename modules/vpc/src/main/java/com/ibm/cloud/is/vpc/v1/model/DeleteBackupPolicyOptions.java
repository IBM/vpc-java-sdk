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
 * The deleteBackupPolicy options.
 */
public class DeleteBackupPolicyOptions extends GenericModel {

  protected String id;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing DeleteBackupPolicyOptions instance.
     *
     * @param deleteBackupPolicyOptions the instance to initialize the Builder with
     */
    private Builder(DeleteBackupPolicyOptions deleteBackupPolicyOptions) {
      this.id = deleteBackupPolicyOptions.id;
      this.ifMatch = deleteBackupPolicyOptions.ifMatch;
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
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DeleteBackupPolicyOptions.
     *
     * @return the new DeleteBackupPolicyOptions instance
     */
    public DeleteBackupPolicyOptions build() {
      return new DeleteBackupPolicyOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteBackupPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the DeleteBackupPolicyOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected DeleteBackupPolicyOptions() { }

  protected DeleteBackupPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a DeleteBackupPolicyOptions builder
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

