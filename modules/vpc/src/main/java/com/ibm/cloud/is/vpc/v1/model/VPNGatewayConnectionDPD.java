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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dead peer detection configuration.
 */
public class VPNGatewayConnectionDPD extends GenericModel {

  /**
   * The dead peer detection action.
   */
  public interface Action {
    /** clear. */
    String CLEAR = "clear";
    /** hold. */
    String HOLD = "hold";
    /** none. */
    String NONE = "none";
    /** restart. */
    String RESTART = "restart";
  }

  protected String action;
  protected Long interval;
  protected Long timeout;

  protected VPNGatewayConnectionDPD() { }

  /**
   * Gets the action.
   *
   * The dead peer detection action.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the interval.
   *
   * The dead peer detection interval in seconds. Must not be greater than `timeout`.
   *
   * @return the interval
   */
  public Long getInterval() {
    return interval;
  }

  /**
   * Gets the timeout.
   *
   * The dead peer detection timeout in seconds. Must not be less than `interval`.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }
}

