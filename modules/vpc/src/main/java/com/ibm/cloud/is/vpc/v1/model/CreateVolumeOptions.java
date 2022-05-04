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
 * The createVolume options.
 */
public class CreateVolumeOptions extends GenericModel {

  protected VolumePrototype volumePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private VolumePrototype volumePrototype;

    private Builder(CreateVolumeOptions createVolumeOptions) {
      this.volumePrototype = createVolumeOptions.volumePrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param volumePrototype the volumePrototype
     */
    public Builder(VolumePrototype volumePrototype) {
      this.volumePrototype = volumePrototype;
    }

    /**
     * Builds a CreateVolumeOptions.
     *
     * @return the new CreateVolumeOptions instance
     */
    public CreateVolumeOptions build() {
      return new CreateVolumeOptions(this);
    }

    /**
     * Set the volumePrototype.
     *
     * @param volumePrototype the volumePrototype
     * @return the CreateVolumeOptions builder
     */
    public Builder volumePrototype(VolumePrototype volumePrototype) {
      this.volumePrototype = volumePrototype;
      return this;
    }
  }

  protected CreateVolumeOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volumePrototype,
      "volumePrototype cannot be null");
    volumePrototype = builder.volumePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateVolumeOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the volumePrototype.
   *
   * The volume prototype object.
   *
   * @return the volumePrototype
   */
  public VolumePrototype volumePrototype() {
    return volumePrototype;
  }
}

