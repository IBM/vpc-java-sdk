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
 * The createInstance options.
 */
public class CreateInstanceOptions extends GenericModel {

  protected InstancePrototype instancePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private InstancePrototype instancePrototype;

    /**
     * Instantiates a new Builder from an existing CreateInstanceOptions instance.
     *
     * @param createInstanceOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceOptions createInstanceOptions) {
      this.instancePrototype = createInstanceOptions.instancePrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instancePrototype the instancePrototype
     */
    public Builder(InstancePrototype instancePrototype) {
      this.instancePrototype = instancePrototype;
    }

    /**
     * Builds a CreateInstanceOptions.
     *
     * @return the new CreateInstanceOptions instance
     */
    public CreateInstanceOptions build() {
      return new CreateInstanceOptions(this);
    }

    /**
     * Set the instancePrototype.
     *
     * @param instancePrototype the instancePrototype
     * @return the CreateInstanceOptions builder
     */
    public Builder instancePrototype(InstancePrototype instancePrototype) {
      this.instancePrototype = instancePrototype;
      return this;
    }
  }

  protected CreateInstanceOptions() { }

  protected CreateInstanceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instancePrototype,
      "instancePrototype cannot be null");
    instancePrototype = builder.instancePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instancePrototype.
   *
   * The instance prototype object.
   *
   * @return the instancePrototype
   */
  public InstancePrototype instancePrototype() {
    return instancePrototype;
  }
}

