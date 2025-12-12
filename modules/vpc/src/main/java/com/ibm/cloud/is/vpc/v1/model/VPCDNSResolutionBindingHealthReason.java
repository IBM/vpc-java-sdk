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
 * VPCDNSResolutionBindingHealthReason.
 */
public class VPCDNSResolutionBindingHealthReason extends GenericModel {

  /**
   * A reason code for this health state.
   */
  public interface Code {
    /** disconnected_from_bound_vpc. */
    String DISCONNECTED_FROM_BOUND_VPC = "disconnected_from_bound_vpc";
    /** internal_error. */
    String INTERNAL_ERROR = "internal_error";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected VPCDNSResolutionBindingHealthReason() { }

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

