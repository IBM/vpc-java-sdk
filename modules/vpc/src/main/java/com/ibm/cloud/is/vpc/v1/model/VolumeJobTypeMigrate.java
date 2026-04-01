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
 * VolumeJobTypeMigrate.
 */
public class VolumeJobTypeMigrate extends VolumeJob {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** volume_job. */
    String VOLUME_JOB = "volume_job";
  }

  /**
   * The status of this volume job:
   * - `canceled`:  the job is canceled
   * - `canceling`: the job is being canceled
   * - `deleting`:  the job is being deleted
   * - `failed`:    the job could not be completed successfully
   * - `queued`:    the job is queued
   * - `running`:   the job is in progress
   * - `succeeded`: the job completed successfully
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** canceled. */
    String CANCELED = "canceled";
    /** canceling. */
    String CANCELING = "canceling";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** queued. */
    String QUEUED = "queued";
    /** running. */
    String RUNNING = "running";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
  }

  /**
   * The type of volume job.
   */
  public interface JobType {
    /** migrate. */
    String MIGRATE = "migrate";
  }


  protected VolumeJobTypeMigrate() { }
}

