/*
 * (C) Copyright IBM Corp. 2025.
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
 * ShareJobStatusReason.
 */
public class ShareJobStatusReason extends GenericModel {

  /**
   * A snake case string succinctly identifying the status reason.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Code {
    /** cannot_initialize_replication. */
    String CANNOT_INITIALIZE_REPLICATION = "cannot_initialize_replication";
    /** cannot_reach_replica_share. */
    String CANNOT_REACH_REPLICA_SHARE = "cannot_reach_replica_share";
    /** cannot_reach_source_share. */
    String CANNOT_REACH_SOURCE_SHARE = "cannot_reach_source_share";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected ShareJobStatusReason() { }

  /**
   * Gets the code.
   *
   * A snake case string succinctly identifying the status reason.
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
   * A link to documentation about this status reason.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

