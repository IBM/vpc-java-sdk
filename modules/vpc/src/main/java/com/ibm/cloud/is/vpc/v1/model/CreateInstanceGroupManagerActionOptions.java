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
 * The createInstanceGroupManagerAction options.
 */
public class CreateInstanceGroupManagerActionOptions extends GenericModel {

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected InstanceGroupManagerActionPrototype instanceGroupManagerActionPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private InstanceGroupManagerActionPrototype instanceGroupManagerActionPrototype;

    private Builder(CreateInstanceGroupManagerActionOptions createInstanceGroupManagerActionOptions) {
      this.instanceGroupId = createInstanceGroupManagerActionOptions.instanceGroupId;
      this.instanceGroupManagerId = createInstanceGroupManagerActionOptions.instanceGroupManagerId;
      this.instanceGroupManagerActionPrototype = createInstanceGroupManagerActionOptions.instanceGroupManagerActionPrototype;
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
     * @param instanceGroupManagerActionPrototype the instanceGroupManagerActionPrototype
     */
    public Builder(String instanceGroupId, String instanceGroupManagerId, InstanceGroupManagerActionPrototype instanceGroupManagerActionPrototype) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerId = instanceGroupManagerId;
      this.instanceGroupManagerActionPrototype = instanceGroupManagerActionPrototype;
    }

    /**
     * Builds a CreateInstanceGroupManagerActionOptions.
     *
     * @return the new CreateInstanceGroupManagerActionOptions instance
     */
    public CreateInstanceGroupManagerActionOptions build() {
      return new CreateInstanceGroupManagerActionOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the CreateInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the CreateInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the instanceGroupManagerActionPrototype.
     *
     * @param instanceGroupManagerActionPrototype the instanceGroupManagerActionPrototype
     * @return the CreateInstanceGroupManagerActionOptions builder
     */
    public Builder instanceGroupManagerActionPrototype(InstanceGroupManagerActionPrototype instanceGroupManagerActionPrototype) {
      this.instanceGroupManagerActionPrototype = instanceGroupManagerActionPrototype;
      return this;
    }
  }

  protected CreateInstanceGroupManagerActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupManagerActionPrototype,
      "instanceGroupManagerActionPrototype cannot be null");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    instanceGroupManagerActionPrototype = builder.instanceGroupManagerActionPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceGroupManagerActionOptions builder
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
   * Gets the instanceGroupManagerActionPrototype.
   *
   * The instance group manager action prototype object.
   *
   * @return the instanceGroupManagerActionPrototype
   */
  public InstanceGroupManagerActionPrototype instanceGroupManagerActionPrototype() {
    return instanceGroupManagerActionPrototype;
  }
}

