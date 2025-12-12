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
 * BareMetalServerHealthReason.
 */
public class BareMetalServerHealthReason extends GenericModel {

  /**
   * A reason code for this health state.
   */
  public interface Code {
    /** reservation_capacity_unavailable. */
    String RESERVATION_CAPACITY_UNAVAILABLE = "reservation_capacity_unavailable";
    /** reservation_deleted. */
    String RESERVATION_DELETED = "reservation_deleted";
    /** reservation_expired. */
    String RESERVATION_EXPIRED = "reservation_expired";
    /** reservation_failed. */
    String RESERVATION_FAILED = "reservation_failed";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected BareMetalServerHealthReason() { }

  /**
   * Gets the code.
   *
   * A reason code for this health state.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * An explanation of the reason for this health state.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * A link to documentation about the reason for this health state.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

