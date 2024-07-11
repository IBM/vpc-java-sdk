/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ShareJob.
 */
public class ShareJob extends GenericModel {

  /**
   * The status of the file share job:
   * - `cancelled`: This job has been cancelled.
   * - `failed`: This job has failed.
   * - `queued`: This job is queued.
   * - `running`: This job is running.
   * - `succeeded`: This job completed successfully.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** cancelled. */
    String CANCELLED = "cancelled";
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
   * The type of the file share job:
   * - `replication_failover`: This is a share replication failover job.
   * - `replication_init`: This is a share replication is initialization job.
   * - `replication_split`: This is a share replication split job.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Type {
    /** replication_failover. */
    String REPLICATION_FAILOVER = "replication_failover";
    /** replication_init. */
    String REPLICATION_INIT = "replication_init";
    /** replication_split. */
    String REPLICATION_SPLIT = "replication_split";
  }

  protected String status;
  @SerializedName("status_reasons")
  protected List<ShareJobStatusReason> statusReasons;
  protected String type;

  protected ShareJob() { }

  /**
   * Gets the status.
   *
   * The status of the file share job:
   * - `cancelled`: This job has been cancelled.
   * - `failed`: This job has failed.
   * - `queued`: This job is queued.
   * - `running`: This job is running.
   * - `succeeded`: This job completed successfully.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the file share job status (if any).
   *
   * @return the statusReasons
   */
  public List<ShareJobStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the type.
   *
   * The type of the file share job:
   * - `replication_failover`: This is a share replication failover job.
   * - `replication_init`: This is a share replication is initialization job.
   * - `replication_split`: This is a share replication split job.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

