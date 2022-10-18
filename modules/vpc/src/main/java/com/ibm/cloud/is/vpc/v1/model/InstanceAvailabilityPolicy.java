/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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
 * InstanceAvailabilityPolicy.
 */
public class InstanceAvailabilityPolicy extends GenericModel {

  /**
   * The action to perform if the compute host experiences a failure.
   * - `restart`: Automatically restart the virtual server instance after host failure
   * - `stop`: Leave the virtual server instance stopped after host failure
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the instance on which the
   * unexpected property value was encountered.
   */
  public interface HostFailure {
    /** restart. */
    String RESTART = "restart";
    /** stop. */
    String STOP = "stop";
  }

  @SerializedName("host_failure")
  protected String hostFailure;

  protected InstanceAvailabilityPolicy() { }

  /**
   * Gets the hostFailure.
   *
   * The action to perform if the compute host experiences a failure.
   * - `restart`: Automatically restart the virtual server instance after host failure
   * - `stop`: Leave the virtual server instance stopped after host failure
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the instance on which the
   * unexpected property value was encountered.
   *
   * @return the hostFailure
   */
  public String getHostFailure() {
    return hostFailure;
  }
}

