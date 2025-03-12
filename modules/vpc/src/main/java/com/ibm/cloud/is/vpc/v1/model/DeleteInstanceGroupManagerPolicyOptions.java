/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * The deleteInstanceGroupManagerPolicy options.
 */
public class DeleteInstanceGroupManagerPolicyOptions extends GenericModel {

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteInstanceGroupManagerPolicyOptions instance.
     *
     * @param deleteInstanceGroupManagerPolicyOptions the instance to initialize the Builder with
     */
    private Builder(DeleteInstanceGroupManagerPolicyOptions deleteInstanceGroupManagerPolicyOptions) {
      this.instanceGroupId = deleteInstanceGroupManagerPolicyOptions.instanceGroupId;
      this.instanceGroupManagerId = deleteInstanceGroupManagerPolicyOptions.instanceGroupManagerId;
      this.id = deleteInstanceGroupManagerPolicyOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceGroupId the instanceGroupId
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @param id the id
     */
    public Builder(String instanceGroupId, String instanceGroupManagerId, String id) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerId = instanceGroupManagerId;
      this.id = id;
    }

    /**
     * Builds a DeleteInstanceGroupManagerPolicyOptions.
     *
     * @return the new DeleteInstanceGroupManagerPolicyOptions instance
     */
    public DeleteInstanceGroupManagerPolicyOptions build() {
      return new DeleteInstanceGroupManagerPolicyOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the DeleteInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the DeleteInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteInstanceGroupManagerPolicyOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteInstanceGroupManagerPolicyOptions() { }

  protected DeleteInstanceGroupManagerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteInstanceGroupManagerPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceGroupId.
   *
   * The instance group identifier.
   *
   * @return the instanceGroupId
   */
  public String instanceGroupId() {
    return instanceGroupId;
  }

  /**
   * Gets the instanceGroupManagerId.
   *
   * The instance group manager identifier.
   *
   * @return the instanceGroupManagerId
   */
  public String instanceGroupManagerId() {
    return instanceGroupManagerId;
  }

  /**
   * Gets the id.
   *
   * The instance group manager policy identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

