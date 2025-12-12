/*
 * (C) Copyright IBM Corp. 2025.
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
 * The createBareMetalServer options.
 */
public class CreateBareMetalServerOptions extends GenericModel {

  protected BareMetalServerPrototype bareMetalServerPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private BareMetalServerPrototype bareMetalServerPrototype;

    /**
     * Instantiates a new Builder from an existing CreateBareMetalServerOptions instance.
     *
     * @param createBareMetalServerOptions the instance to initialize the Builder with
     */
    private Builder(CreateBareMetalServerOptions createBareMetalServerOptions) {
      this.bareMetalServerPrototype = createBareMetalServerOptions.bareMetalServerPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bareMetalServerPrototype the bareMetalServerPrototype
     */
    public Builder(BareMetalServerPrototype bareMetalServerPrototype) {
      this.bareMetalServerPrototype = bareMetalServerPrototype;
    }

    /**
     * Builds a CreateBareMetalServerOptions.
     *
     * @return the new CreateBareMetalServerOptions instance
     */
    public CreateBareMetalServerOptions build() {
      return new CreateBareMetalServerOptions(this);
    }

    /**
     * Set the bareMetalServerPrototype.
     *
     * @param bareMetalServerPrototype the bareMetalServerPrototype
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder bareMetalServerPrototype(BareMetalServerPrototype bareMetalServerPrototype) {
      this.bareMetalServerPrototype = bareMetalServerPrototype;
      return this;
    }
  }

  protected CreateBareMetalServerOptions() { }

  protected CreateBareMetalServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bareMetalServerPrototype,
      "bareMetalServerPrototype cannot be null");
    bareMetalServerPrototype = builder.bareMetalServerPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateBareMetalServerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bareMetalServerPrototype.
   *
   * The bare metal server prototype object.
   *
   * @return the bareMetalServerPrototype
   */
  public BareMetalServerPrototype bareMetalServerPrototype() {
    return bareMetalServerPrototype;
  }
}

