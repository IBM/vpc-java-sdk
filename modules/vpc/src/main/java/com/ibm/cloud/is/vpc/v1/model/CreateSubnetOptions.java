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
 * The createSubnet options.
 */
public class CreateSubnetOptions extends GenericModel {

  protected SubnetPrototype subnetPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private SubnetPrototype subnetPrototype;

    private Builder(CreateSubnetOptions createSubnetOptions) {
      this.subnetPrototype = createSubnetOptions.subnetPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnetPrototype the subnetPrototype
     */
    public Builder(SubnetPrototype subnetPrototype) {
      this.subnetPrototype = subnetPrototype;
    }

    /**
     * Builds a CreateSubnetOptions.
     *
     * @return the new CreateSubnetOptions instance
     */
    public CreateSubnetOptions build() {
      return new CreateSubnetOptions(this);
    }

    /**
     * Set the subnetPrototype.
     *
     * @param subnetPrototype the subnetPrototype
     * @return the CreateSubnetOptions builder
     */
    public Builder subnetPrototype(SubnetPrototype subnetPrototype) {
      this.subnetPrototype = subnetPrototype;
      return this;
    }
  }

  protected CreateSubnetOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnetPrototype,
      "subnetPrototype cannot be null");
    subnetPrototype = builder.subnetPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateSubnetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subnetPrototype.
   *
   * The subnet prototype object.
   *
   * @return the subnetPrototype
   */
  public SubnetPrototype subnetPrototype() {
    return subnetPrototype;
  }
}

