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

/**
 * RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP.
 */
public class RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP extends RouteNextHopPrototypeRouteNextHopIP {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;

    /**
     * Instantiates a new Builder from an existing RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP instance.
     *
     * @param routeNextHopPrototypeRouteNextHopIpRouteNextHopIpSentinelIp the instance to initialize the Builder with
     */
    public Builder(RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeRouteNextHopIpRouteNextHopIpSentinelIp) {
      this.address = routeNextHopPrototypeRouteNextHopIpRouteNextHopIpSentinelIp.address;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param address the address
     */
    public Builder(String address) {
      this.address = address;
    }

    /**
     * Builds a RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP.
     *
     * @return the new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP instance
     */
    public RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP build() {
      return new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  protected RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP() { }

  protected RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.address,
      "address cannot be null");
    address = builder.address;
  }

  /**
   * New builder.
   *
   * @return a RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPSentinelIP builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

