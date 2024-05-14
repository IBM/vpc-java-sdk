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
 * VPNServerRouteLifecycleReason.
 */
public class VPNServerRouteLifecycleReason extends GenericModel {

  /**
   * A reason code for this lifecycle state:
   * - `internal_error`: internal error (contact IBM support)
   * - `resource_suspended_by_provider`: The resource has been suspended (contact IBM
   *   support)
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Code {
    /** internal_error. */
    String INTERNAL_ERROR = "internal_error";
    /** resource_suspended_by_provider. */
    String RESOURCE_SUSPENDED_BY_PROVIDER = "resource_suspended_by_provider";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  protected VPNServerRouteLifecycleReason() { }

  /**
   * Gets the code.
   *
   * A reason code for this lifecycle state:
   * - `internal_error`: internal error (contact IBM support)
   * - `resource_suspended_by_provider`: The resource has been suspended (contact IBM
   *   support)
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
   * An explanation of the reason for this lifecycle state.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * Link to documentation about the reason for this lifecycle state.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

