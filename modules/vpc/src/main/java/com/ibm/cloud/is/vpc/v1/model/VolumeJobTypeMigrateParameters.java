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
 * The parameters to use after the volume is migrated.
 */
public class VolumeJobTypeMigrateParameters extends GenericModel {

  protected Long bandwidth;
  protected Long iops;
  protected VolumeProfileIdentity profile;

  /**
   * Builder.
   */
  public static class Builder {
    private Long bandwidth;
    private Long iops;
    private VolumeProfileIdentity profile;

    /**
     * Instantiates a new Builder from an existing VolumeJobTypeMigrateParameters instance.
     *
     * @param volumeJobTypeMigrateParameters the instance to initialize the Builder with
     */
    private Builder(VolumeJobTypeMigrateParameters volumeJobTypeMigrateParameters) {
      this.bandwidth = volumeJobTypeMigrateParameters.bandwidth;
      this.iops = volumeJobTypeMigrateParameters.iops;
      this.profile = volumeJobTypeMigrateParameters.profile;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param profile the profile
     */
    public Builder(VolumeProfileIdentity profile) {
      this.profile = profile;
    }

    /**
     * Builds a VolumeJobTypeMigrateParameters.
     *
     * @return the new VolumeJobTypeMigrateParameters instance
     */
    public VolumeJobTypeMigrateParameters build() {
      return new VolumeJobTypeMigrateParameters(this);
    }

    /**
     * Set the bandwidth.
     *
     * @param bandwidth the bandwidth
     * @return the VolumeJobTypeMigrateParameters builder
     */
    public Builder bandwidth(long bandwidth) {
      this.bandwidth = bandwidth;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumeJobTypeMigrateParameters builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the VolumeJobTypeMigrateParameters builder
     */
    public Builder profile(VolumeProfileIdentity profile) {
      this.profile = profile;
      return this;
    }
  }

  protected VolumeJobTypeMigrateParameters() { }

  protected VolumeJobTypeMigrateParameters(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    bandwidth = builder.bandwidth;
    iops = builder.iops;
    profile = builder.profile;
  }

  /**
   * New builder.
   *
   * @return a VolumeJobTypeMigrateParameters builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bandwidth.
   *
   * The value to use for the volume's `bandwidth` after migration.
   *
   * If specified, the volume profile after migration must not have a `bandwidth.type` of
   * `dependent`.
   *
   * @return the bandwidth
   */
  public Long bandwidth() {
    return bandwidth;
  }

  /**
   * Gets the iops.
   *
   * The value to use for the volume's `iops` after migration.
   *
   * If specified, the volume profile after migration must not have an `iops.type` of
   * `dependent`.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the profile.
   *
   * The profile with a `storage_generation` value of `2` to migrate the volume to.
   *
   * The volume's current profile must have a `storage_generation` value of `1`.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
  }
}

