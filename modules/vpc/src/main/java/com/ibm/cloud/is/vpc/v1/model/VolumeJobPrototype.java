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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeJobPrototype.
 *
 * Classes which extend this class:
 * - VolumeJobPrototypeVolumeJobTypeMigratePrototype
 */
public class VolumeJobPrototype extends GenericModel {

  /**
   * The type of job this volume job will perform.
   *
   * - `migrate`: Migrates a volume to a new `storage_generation` profile.
   *              During the migration process, the volume will be `busy`.
   */
  public interface JobType {
    /** migrate. */
    String MIGRATE = "migrate";
  }

  @SerializedName("job_type")
  protected String jobType;
  protected String name;
  protected VolumeJobTypeMigrateParameters parameters;

  protected VolumeJobPrototype() { }

  /**
   * Gets the jobType.
   *
   * The type of job this volume job will perform.
   *
   * - `migrate`: Migrates a volume to a new `storage_generation` profile.
   *              During the migration process, the volume will be `busy`.
   *
   * @return the jobType
   */
  public String jobType() {
    return jobType;
  }

  /**
   * Gets the name.
   *
   * The name for this volume job. The name must not be used by another job for this volume. If unspecified, the name
   * will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the parameters.
   *
   * The parameters to use after the volume is migrated.
   *
   * @return the parameters
   */
  public VolumeJobTypeMigrateParameters parameters() {
    return parameters;
  }
}

