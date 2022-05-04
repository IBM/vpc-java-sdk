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
public class VPNGatewayConnectionDPDPrototype extends GenericModel {

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

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private Long interval;
    private Long timeout;

    private Builder(VPNGatewayConnectionDPDPrototype vpnGatewayConnectionDpdPrototype) {
      this.action = vpnGatewayConnectionDpdPrototype.action;
      this.interval = vpnGatewayConnectionDpdPrototype.interval;
      this.timeout = vpnGatewayConnectionDpdPrototype.timeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VPNGatewayConnectionDPDPrototype.
     *
     * @return the new VPNGatewayConnectionDPDPrototype instance
     */
    public VPNGatewayConnectionDPDPrototype build() {
      return new VPNGatewayConnectionDPDPrototype(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the VPNGatewayConnectionDPDPrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the VPNGatewayConnectionDPDPrototype builder
     */
    public Builder interval(long interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the VPNGatewayConnectionDPDPrototype builder
     */
    public Builder timeout(long timeout) {
      this.timeout = timeout;
      return this;
    }
  }

  protected VPNGatewayConnectionDPDPrototype(Builder builder) {
    action = builder.action;
    interval = builder.interval;
    timeout = builder.timeout;
  }

  /**
   * New builder.
   *
   * @return a VPNGatewayConnectionDPDPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the action.
   *
   * Dead Peer Detection actions.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the interval.
   *
   * Dead Peer Detection interval in seconds.
   *
   * @return the interval
   */
  public Long interval() {
    return interval;
  }

  /**
   * Gets the timeout.
   *
   * Dead Peer Detection timeout in seconds. Must be at least the interval.
   *
   * @return the timeout
   */
  public Long timeout() {
    return timeout;
  }
}

