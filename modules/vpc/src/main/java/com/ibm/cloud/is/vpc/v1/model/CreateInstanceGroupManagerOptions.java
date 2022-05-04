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
 * The createInstanceGroupManager options.
 */
public class CreateInstanceGroupManagerOptions extends GenericModel {

  protected String instanceGroupId;
  protected InstanceGroupManagerPrototype instanceGroupManagerPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private InstanceGroupManagerPrototype instanceGroupManagerPrototype;

    private Builder(CreateInstanceGroupManagerOptions createInstanceGroupManagerOptions) {
      this.instanceGroupId = createInstanceGroupManagerOptions.instanceGroupId;
      this.instanceGroupManagerPrototype = createInstanceGroupManagerOptions.instanceGroupManagerPrototype;
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
     * @param instanceGroupManagerPrototype the instanceGroupManagerPrototype
     */
    public Builder(String instanceGroupId, InstanceGroupManagerPrototype instanceGroupManagerPrototype) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerPrototype = instanceGroupManagerPrototype;
    }

    /**
     * Builds a CreateInstanceGroupManagerOptions.
     *
     * @return the new CreateInstanceGroupManagerOptions instance
     */
    public CreateInstanceGroupManagerOptions build() {
      return new CreateInstanceGroupManagerOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the CreateInstanceGroupManagerOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerPrototype.
     *
     * @param instanceGroupManagerPrototype the instanceGroupManagerPrototype
     * @return the CreateInstanceGroupManagerOptions builder
     */
    public Builder instanceGroupManagerPrototype(InstanceGroupManagerPrototype instanceGroupManagerPrototype) {
      this.instanceGroupManagerPrototype = instanceGroupManagerPrototype;
      return this;
    }
  }

  protected CreateInstanceGroupManagerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupManagerPrototype,
      "instanceGroupManagerPrototype cannot be null");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerPrototype = builder.instanceGroupManagerPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceGroupManagerOptions builder
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
   * Gets the instanceGroupManagerPrototype.
   *
   * The instance group manager prototype object.
   *
   * @return the instanceGroupManagerPrototype
   */
  public InstanceGroupManagerPrototype instanceGroupManagerPrototype() {
    return instanceGroupManagerPrototype;
  }
}

