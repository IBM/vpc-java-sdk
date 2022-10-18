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
 * The createSnapshot options.
 */
public class CreateSnapshotOptions extends GenericModel {

  protected SnapshotPrototype snapshotPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private SnapshotPrototype snapshotPrototype;

    /**
     * Instantiates a new Builder from an existing CreateSnapshotOptions instance.
     *
     * @param createSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(CreateSnapshotOptions createSnapshotOptions) {
      this.snapshotPrototype = createSnapshotOptions.snapshotPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param snapshotPrototype the snapshotPrototype
     */
    public Builder(SnapshotPrototype snapshotPrototype) {
      this.snapshotPrototype = snapshotPrototype;
    }

    /**
     * Builds a CreateSnapshotOptions.
     *
     * @return the new CreateSnapshotOptions instance
     */
    public CreateSnapshotOptions build() {
      return new CreateSnapshotOptions(this);
    }

    /**
     * Set the snapshotPrototype.
     *
     * @param snapshotPrototype the snapshotPrototype
     * @return the CreateSnapshotOptions builder
     */
    public Builder snapshotPrototype(SnapshotPrototype snapshotPrototype) {
      this.snapshotPrototype = snapshotPrototype;
      return this;
    }
  }

  protected CreateSnapshotOptions() { }

  protected CreateSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshotPrototype,
      "snapshotPrototype cannot be null");
    snapshotPrototype = builder.snapshotPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateSnapshotOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the snapshotPrototype.
   *
   * The snapshot prototype object.
   *
   * @return the snapshotPrototype
   */
  public SnapshotPrototype snapshotPrototype() {
    return snapshotPrototype;
  }
}

