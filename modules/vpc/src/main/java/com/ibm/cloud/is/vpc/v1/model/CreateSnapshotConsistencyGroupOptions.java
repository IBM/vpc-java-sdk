/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * The createSnapshotConsistencyGroup options.
 */
public class CreateSnapshotConsistencyGroupOptions extends GenericModel {

  protected SnapshotConsistencyGroupPrototype snapshotConsistencyGroupPrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private SnapshotConsistencyGroupPrototype snapshotConsistencyGroupPrototype;

    /**
     * Instantiates a new Builder from an existing CreateSnapshotConsistencyGroupOptions instance.
     *
     * @param createSnapshotConsistencyGroupOptions the instance to initialize the Builder with
     */
    private Builder(CreateSnapshotConsistencyGroupOptions createSnapshotConsistencyGroupOptions) {
      this.snapshotConsistencyGroupPrototype = createSnapshotConsistencyGroupOptions.snapshotConsistencyGroupPrototype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param snapshotConsistencyGroupPrototype the snapshotConsistencyGroupPrototype
     */
    public Builder(SnapshotConsistencyGroupPrototype snapshotConsistencyGroupPrototype) {
      this.snapshotConsistencyGroupPrototype = snapshotConsistencyGroupPrototype;
    }

    /**
     * Builds a CreateSnapshotConsistencyGroupOptions.
     *
     * @return the new CreateSnapshotConsistencyGroupOptions instance
     */
    public CreateSnapshotConsistencyGroupOptions build() {
      return new CreateSnapshotConsistencyGroupOptions(this);
    }

    /**
     * Set the snapshotConsistencyGroupPrototype.
     *
     * @param snapshotConsistencyGroupPrototype the snapshotConsistencyGroupPrototype
     * @return the CreateSnapshotConsistencyGroupOptions builder
     */
    public Builder snapshotConsistencyGroupPrototype(SnapshotConsistencyGroupPrototype snapshotConsistencyGroupPrototype) {
      this.snapshotConsistencyGroupPrototype = snapshotConsistencyGroupPrototype;
      return this;
    }
  }

  protected CreateSnapshotConsistencyGroupOptions() { }

  protected CreateSnapshotConsistencyGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshotConsistencyGroupPrototype,
      "snapshotConsistencyGroupPrototype cannot be null");
    snapshotConsistencyGroupPrototype = builder.snapshotConsistencyGroupPrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateSnapshotConsistencyGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the snapshotConsistencyGroupPrototype.
   *
   * The snapshot consistency group prototype object.
   *
   * @return the snapshotConsistencyGroupPrototype
   */
  public SnapshotConsistencyGroupPrototype snapshotConsistencyGroupPrototype() {
    return snapshotConsistencyGroupPrototype;
  }
}

