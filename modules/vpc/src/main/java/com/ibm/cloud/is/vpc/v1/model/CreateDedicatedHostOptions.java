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
 * The createDedicatedHost options.
 */
public class CreateDedicatedHostOptions extends GenericModel {

  protected DedicatedHostPrototype dedicatedHostPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private DedicatedHostPrototype dedicatedHostPrototype;

    private Builder(CreateDedicatedHostOptions createDedicatedHostOptions) {
      this.dedicatedHostPrototype = createDedicatedHostOptions.dedicatedHostPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dedicatedHostPrototype the dedicatedHostPrototype
     */
    public Builder(DedicatedHostPrototype dedicatedHostPrototype) {
      this.dedicatedHostPrototype = dedicatedHostPrototype;
    }

    /**
     * Builds a CreateDedicatedHostOptions.
     *
     * @return the new CreateDedicatedHostOptions instance
     */
    public CreateDedicatedHostOptions build() {
      return new CreateDedicatedHostOptions(this);
    }

    /**
     * Set the dedicatedHostPrototype.
     *
     * @param dedicatedHostPrototype the dedicatedHostPrototype
     * @return the CreateDedicatedHostOptions builder
     */
    public Builder dedicatedHostPrototype(DedicatedHostPrototype dedicatedHostPrototype) {
      this.dedicatedHostPrototype = dedicatedHostPrototype;
      return this;
    }
  }

  protected CreateDedicatedHostOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dedicatedHostPrototype,
      "dedicatedHostPrototype cannot be null");
    dedicatedHostPrototype = builder.dedicatedHostPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateDedicatedHostOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the dedicatedHostPrototype.
   *
   * The dedicated host prototype object.
   *
   * @return the dedicatedHostPrototype
   */
  public DedicatedHostPrototype dedicatedHostPrototype() {
    return dedicatedHostPrototype;
  }
}

