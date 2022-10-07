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
 * The createFloatingIp options.
 */
public class CreateFloatingIpOptions extends GenericModel {

  protected FloatingIPPrototype floatingIpPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private FloatingIPPrototype floatingIpPrototype;

    /**
     * Instantiates a new Builder from an existing CreateFloatingIpOptions instance.
     *
     * @param createFloatingIpOptions the instance to initialize the Builder with
     */
    private Builder(CreateFloatingIpOptions createFloatingIpOptions) {
      this.floatingIpPrototype = createFloatingIpOptions.floatingIpPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param floatingIpPrototype the floatingIpPrototype
     */
    public Builder(FloatingIPPrototype floatingIpPrototype) {
      this.floatingIpPrototype = floatingIpPrototype;
    }

    /**
     * Builds a CreateFloatingIpOptions.
     *
     * @return the new CreateFloatingIpOptions instance
     */
    public CreateFloatingIpOptions build() {
      return new CreateFloatingIpOptions(this);
    }

    /**
     * Set the floatingIpPrototype.
     *
     * @param floatingIpPrototype the floatingIpPrototype
     * @return the CreateFloatingIpOptions builder
     */
    public Builder floatingIpPrototype(FloatingIPPrototype floatingIpPrototype) {
      this.floatingIpPrototype = floatingIpPrototype;
      return this;
    }
  }

  protected CreateFloatingIpOptions() { }

  protected CreateFloatingIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.floatingIpPrototype,
      "floatingIpPrototype cannot be null");
    floatingIpPrototype = builder.floatingIpPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateFloatingIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the floatingIpPrototype.
   *
   * The floating IP prototype object.
   *
   * @return the floatingIpPrototype
   */
  public FloatingIPPrototype floatingIpPrototype() {
    return floatingIpPrototype;
  }
}

