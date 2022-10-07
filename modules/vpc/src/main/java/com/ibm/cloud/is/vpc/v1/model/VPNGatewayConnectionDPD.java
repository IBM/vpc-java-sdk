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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The Dead Peer Detection settings.
 */
public class VPNGatewayConnectionDPD extends GenericModel {

  /**
   * Dead Peer Detection actions.
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
   * Dead Peer Detection actions.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the interval.
   *
   * Dead Peer Detection interval in seconds.
   *
   * @return the interval
   */
  public Long getInterval() {
    return interval;
  }

  /**
   * Gets the timeout.
   *
   * Dead Peer Detection timeout in seconds. Must be at least the interval.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }
}

