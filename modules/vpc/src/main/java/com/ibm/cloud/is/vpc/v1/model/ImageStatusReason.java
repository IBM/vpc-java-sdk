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
 * ImageStatusReason.
 */
public class ImageStatusReason extends GenericModel {

  /**
   * A reason code for the status:
   * - `encrypted_data_key_invalid`: image cannot be decrypted with the specified
   *   `encryption_key`
   * - `encryption_key_deleted`: image unusable because its `encryption_key` was deleted
   * - `encryption_key_disabled`: image unusable until its `encryption_key` is re-enabled
   * - `image_data_corrupted`: image data is corrupt, or is not in the specified format
   * - `image_provisioned_size_unsupported`: image requires a boot volume size greater
   *   than the maximum supported value
   * - `image_request_in_progress`: image operation is in progress (such as an import from
   *    Cloud Object Storage)
   * - `image_request_queued`: image request has been accepted but the requested
   *   operation has not started
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Code {
    /** encrypted_data_key_invalid. */
    String ENCRYPTED_DATA_KEY_INVALID = "encrypted_data_key_invalid";
    /** encryption_key_deleted. */
    String ENCRYPTION_KEY_DELETED = "encryption_key_deleted";
    /** encryption_key_disabled. */
    String ENCRYPTION_KEY_DISABLED = "encryption_key_disabled";
    /** image_data_corrupted. */
    String IMAGE_DATA_CORRUPTED = "image_data_corrupted";
    /** image_provisioned_size_unsupported. */
    String IMAGE_PROVISIONED_SIZE_UNSUPPORTED = "image_provisioned_size_unsupported";
    /** image_request_in_progress. */
    String IMAGE_REQUEST_IN_PROGRESS = "image_request_in_progress";
    /** image_request_queued. */
    String IMAGE_REQUEST_QUEUED = "image_request_queued";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected ImageStatusReason() { }

  /**
   * Gets the code.
   *
   * A reason code for the status:
   * - `encrypted_data_key_invalid`: image cannot be decrypted with the specified
   *   `encryption_key`
   * - `encryption_key_deleted`: image unusable because its `encryption_key` was deleted
   * - `encryption_key_disabled`: image unusable until its `encryption_key` is re-enabled
   * - `image_data_corrupted`: image data is corrupt, or is not in the specified format
   * - `image_provisioned_size_unsupported`: image requires a boot volume size greater
   *   than the maximum supported value
   * - `image_request_in_progress`: image operation is in progress (such as an import from
   *    Cloud Object Storage)
   * - `image_request_queued`: image request has been accepted but the requested
   *   operation has not started
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

