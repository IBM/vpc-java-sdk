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
 * The createImage options.
 */
public class CreateImageOptions extends GenericModel {

  protected ImagePrototype imagePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private ImagePrototype imagePrototype;

    private Builder(CreateImageOptions createImageOptions) {
      this.imagePrototype = createImageOptions.imagePrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param imagePrototype the imagePrototype
     */
    public Builder(ImagePrototype imagePrototype) {
      this.imagePrototype = imagePrototype;
    }

    /**
     * Builds a CreateImageOptions.
     *
     * @return the new CreateImageOptions instance
     */
    public CreateImageOptions build() {
      return new CreateImageOptions(this);
    }

    /**
     * Set the imagePrototype.
     *
     * @param imagePrototype the imagePrototype
     * @return the CreateImageOptions builder
     */
    public Builder imagePrototype(ImagePrototype imagePrototype) {
      this.imagePrototype = imagePrototype;
      return this;
    }
  }

  protected CreateImageOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.imagePrototype,
      "imagePrototype cannot be null");
    imagePrototype = builder.imagePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateImageOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the imagePrototype.
   *
   * The image prototype object.
   *
   * @return the imagePrototype
   */
  public ImagePrototype imagePrototype() {
    return imagePrototype;
  }
}

