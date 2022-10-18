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
 * The createInstanceGroupManagerPolicy options.
 */
public class CreateInstanceGroupManagerPolicyOptions extends GenericModel {

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected InstanceGroupManagerPolicyPrototype instanceGroupManagerPolicyPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private InstanceGroupManagerPolicyPrototype instanceGroupManagerPolicyPrototype;

    /**
     * Instantiates a new Builder from an existing CreateInstanceGroupManagerPolicyOptions instance.
     *
     * @param createInstanceGroupManagerPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceGroupManagerPolicyOptions createInstanceGroupManagerPolicyOptions) {
      this.instanceGroupId = createInstanceGroupManagerPolicyOptions.instanceGroupId;
      this.instanceGroupManagerId = createInstanceGroupManagerPolicyOptions.instanceGroupManagerId;
      this.instanceGroupManagerPolicyPrototype = createInstanceGroupManagerPolicyOptions.instanceGroupManagerPolicyPrototype;
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
     * @param instanceGroupManagerPolicyPrototype the instanceGroupManagerPolicyPrototype
     */
    public Builder(String instanceGroupId, String instanceGroupManagerId, InstanceGroupManagerPolicyPrototype instanceGroupManagerPolicyPrototype) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerId = instanceGroupManagerId;
      this.instanceGroupManagerPolicyPrototype = instanceGroupManagerPolicyPrototype;
    }

    /**
     * Builds a CreateInstanceGroupManagerPolicyOptions.
     *
     * @return the new CreateInstanceGroupManagerPolicyOptions instance
     */
    public CreateInstanceGroupManagerPolicyOptions build() {
      return new CreateInstanceGroupManagerPolicyOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the CreateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the CreateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the instanceGroupManagerPolicyPrototype.
     *
     * @param instanceGroupManagerPolicyPrototype the instanceGroupManagerPolicyPrototype
     * @return the CreateInstanceGroupManagerPolicyOptions builder
     */
    public Builder instanceGroupManagerPolicyPrototype(InstanceGroupManagerPolicyPrototype instanceGroupManagerPolicyPrototype) {
      this.instanceGroupManagerPolicyPrototype = instanceGroupManagerPolicyPrototype;
      return this;
    }
  }

  protected CreateInstanceGroupManagerPolicyOptions() { }

  protected CreateInstanceGroupManagerPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupManagerPolicyPrototype,
      "instanceGroupManagerPolicyPrototype cannot be null");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    instanceGroupManagerPolicyPrototype = builder.instanceGroupManagerPolicyPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceGroupManagerPolicyOptions builder
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
   * Gets the instanceGroupManagerPolicyPrototype.
   *
   * The instance group manager policy prototype object.
   *
   * @return the instanceGroupManagerPolicyPrototype
   */
  public InstanceGroupManagerPolicyPrototype instanceGroupManagerPolicyPrototype() {
    return instanceGroupManagerPolicyPrototype;
  }
}

