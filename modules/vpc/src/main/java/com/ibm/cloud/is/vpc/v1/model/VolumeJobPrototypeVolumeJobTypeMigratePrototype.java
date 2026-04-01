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

/**
 * VolumeJobPrototypeVolumeJobTypeMigratePrototype.
 */
public class VolumeJobPrototypeVolumeJobTypeMigratePrototype extends VolumeJobPrototype {

  /**
   * The type of job this volume job will perform.
   *
   * The volume must:
   * - Have a `status` of `available`
   * - Not currently have another `migrate` job with a `status` of `queued` or `running`.
   *
   * If the volume is attached to an instance, the instance must be in `running` state.
   */
  public interface JobType {
    /** migrate. */
    String MIGRATE = "migrate";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String jobType;
    private VolumeJobTypeMigrateParameters parameters;

    /**
     * Instantiates a new Builder from an existing VolumeJobPrototypeVolumeJobTypeMigratePrototype instance.
     *
     * @param volumeJobPrototypeVolumeJobTypeMigratePrototype the instance to initialize the Builder with
     */
    public Builder(VolumeJobPrototype volumeJobPrototypeVolumeJobTypeMigratePrototype) {
      this.name = volumeJobPrototypeVolumeJobTypeMigratePrototype.name;
      this.jobType = volumeJobPrototypeVolumeJobTypeMigratePrototype.jobType;
      this.parameters = volumeJobPrototypeVolumeJobTypeMigratePrototype.parameters;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobType the jobType
     * @param parameters the parameters
     */
    public Builder(String jobType, VolumeJobTypeMigrateParameters parameters) {
      this.jobType = jobType;
      this.parameters = parameters;
    }

    /**
     * Builds a VolumeJobPrototypeVolumeJobTypeMigratePrototype.
     *
     * @return the new VolumeJobPrototypeVolumeJobTypeMigratePrototype instance
     */
    public VolumeJobPrototypeVolumeJobTypeMigratePrototype build() {
      return new VolumeJobPrototypeVolumeJobTypeMigratePrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeJobPrototypeVolumeJobTypeMigratePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the jobType.
     *
     * @param jobType the jobType
     * @return the VolumeJobPrototypeVolumeJobTypeMigratePrototype builder
     */
    public Builder jobType(String jobType) {
      this.jobType = jobType;
      return this;
    }

    /**
     * Set the parameters.
     *
     * @param parameters the parameters
     * @return the VolumeJobPrototypeVolumeJobTypeMigratePrototype builder
     */
    public Builder parameters(VolumeJobTypeMigrateParameters parameters) {
      this.parameters = parameters;
      return this;
    }
  }

  protected VolumeJobPrototypeVolumeJobTypeMigratePrototype() { }

  protected VolumeJobPrototypeVolumeJobTypeMigratePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jobType,
      "jobType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.parameters,
      "parameters cannot be null");
    name = builder.name;
    jobType = builder.jobType;
    parameters = builder.parameters;
  }

  /**
   * New builder.
   *
   * @return a VolumeJobPrototypeVolumeJobTypeMigratePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

