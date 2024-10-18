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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BackupPolicyJobStatusReason.
 */
public class BackupPolicyJobStatusReason extends GenericModel {

  /**
   * A reason code for the status:
   * - `internal_error`: Internal error (contact IBM support)
   * - `snapshot_encryption_key_invalid`: The provided encryption key is unavailable
   * - `snapshot_pending`: Cannot delete backup (snapshot) in the `pending` lifecycle state
   * - `snapshot_volume_limit`: The snapshot limit for the source volume has been reached
   * - `source_volume_busy`: The source volume has `busy` set (after multiple retries)
   * - `source_volume_too_large`: The source volume exceeds the [maximum supported
   *   size](https://cloud.ibm.com/docs/vpc?topic=vpc-snapshots-vpc-about&amp;interface=api#snapshots-vpc-limitations)
   * - `source_volume_unavailable`: The source volume is not attached to a running instance
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Code {
    /** internal_error. */
    String INTERNAL_ERROR = "internal_error";
    /** snapshot_encryption_key_invalid. */
    String SNAPSHOT_ENCRYPTION_KEY_INVALID = "snapshot_encryption_key_invalid";
    /** snapshot_pending. */
    String SNAPSHOT_PENDING = "snapshot_pending";
    /** snapshot_volume_limit. */
    String SNAPSHOT_VOLUME_LIMIT = "snapshot_volume_limit";
    /** source_volume_busy. */
    String SOURCE_VOLUME_BUSY = "source_volume_busy";
    /** source_volume_too_large. */
    String SOURCE_VOLUME_TOO_LARGE = "source_volume_too_large";
    /** source_volume_unavailable. */
    String SOURCE_VOLUME_UNAVAILABLE = "source_volume_unavailable";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected BackupPolicyJobStatusReason() { }

  /**
   * Gets the code.
   *
   * A reason code for the status:
   * - `internal_error`: Internal error (contact IBM support)
   * - `snapshot_encryption_key_invalid`: The provided encryption key is unavailable
   * - `snapshot_pending`: Cannot delete backup (snapshot) in the `pending` lifecycle state
   * - `snapshot_volume_limit`: The snapshot limit for the source volume has been reached
   * - `source_volume_busy`: The source volume has `busy` set (after multiple retries)
   * - `source_volume_too_large`: The source volume exceeds the [maximum supported
   *   size](https://cloud.ibm.com/docs/vpc?topic=vpc-snapshots-vpc-about&amp;interface=api#snapshots-vpc-limitations)
   * - `source_volume_unavailable`: The source volume is not attached to a running instance
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * An explanation of the status reason.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * Link to documentation about this status reason.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

