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
 * The createInstanceTemplate options.
 */
public class CreateInstanceTemplateOptions extends GenericModel {

  protected InstanceTemplatePrototype instanceTemplatePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private InstanceTemplatePrototype instanceTemplatePrototype;

    private Builder(CreateInstanceTemplateOptions createInstanceTemplateOptions) {
      this.instanceTemplatePrototype = createInstanceTemplateOptions.instanceTemplatePrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceTemplatePrototype the instanceTemplatePrototype
     */
    public Builder(InstanceTemplatePrototype instanceTemplatePrototype) {
      this.instanceTemplatePrototype = instanceTemplatePrototype;
    }

    /**
     * Builds a CreateInstanceTemplateOptions.
     *
     * @return the new CreateInstanceTemplateOptions instance
     */
    public CreateInstanceTemplateOptions build() {
      return new CreateInstanceTemplateOptions(this);
    }

    /**
     * Set the instanceTemplatePrototype.
     *
     * @param instanceTemplatePrototype the instanceTemplatePrototype
     * @return the CreateInstanceTemplateOptions builder
     */
    public Builder instanceTemplatePrototype(InstanceTemplatePrototype instanceTemplatePrototype) {
      this.instanceTemplatePrototype = instanceTemplatePrototype;
      return this;
    }
  }

  protected CreateInstanceTemplateOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceTemplatePrototype,
      "instanceTemplatePrototype cannot be null");
    instanceTemplatePrototype = builder.instanceTemplatePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceTemplatePrototype.
   *
   * The instance template prototype object.
   *
   * @return the instanceTemplatePrototype
   */
  public InstanceTemplatePrototype instanceTemplatePrototype() {
    return instanceTemplatePrototype;
  }
}

