/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * The createInstanceReinitialization options.
 */
public class CreateInstanceReinitializationOptions extends GenericModel {

  protected String id;
  protected InstanceReinitializePrototype instanceReinitializePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private InstanceReinitializePrototype instanceReinitializePrototype;

    /**
     * Instantiates a new Builder from an existing CreateInstanceReinitializationOptions instance.
     *
     * @param createInstanceReinitializationOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceReinitializationOptions createInstanceReinitializationOptions) {
      this.id = createInstanceReinitializationOptions.id;
      this.instanceReinitializePrototype = createInstanceReinitializationOptions.instanceReinitializePrototype;
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
     * @param instanceReinitializePrototype the instanceReinitializePrototype
     */
    public Builder(String id, InstanceReinitializePrototype instanceReinitializePrototype) {
      this.id = id;
      this.instanceReinitializePrototype = instanceReinitializePrototype;
    }

    /**
     * Builds a CreateInstanceReinitializationOptions.
     *
     * @return the new CreateInstanceReinitializationOptions instance
     */
    public CreateInstanceReinitializationOptions build() {
      return new CreateInstanceReinitializationOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateInstanceReinitializationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the instanceReinitializePrototype.
     *
     * @param instanceReinitializePrototype the instanceReinitializePrototype
     * @return the CreateInstanceReinitializationOptions builder
     */
    public Builder instanceReinitializePrototype(InstanceReinitializePrototype instanceReinitializePrototype) {
      this.instanceReinitializePrototype = instanceReinitializePrototype;
      return this;
    }
  }

  protected CreateInstanceReinitializationOptions() { }

  protected CreateInstanceReinitializationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceReinitializePrototype,
      "instanceReinitializePrototype cannot be null");
    id = builder.id;
    instanceReinitializePrototype = builder.instanceReinitializePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceReinitializationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The instance identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the instanceReinitializePrototype.
   *
   * The instance reinitialize prototype object.
   *
   * @return the instanceReinitializePrototype
   */
  public InstanceReinitializePrototype instanceReinitializePrototype() {
    return instanceReinitializePrototype;
  }
}

