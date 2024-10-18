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

/**
 * RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP.
 */
public class RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP extends RouteNextHopPrototypeRouteNextHopIP {


  /**
   * Builder.
   */
  public static class Builder {
    private String address;

    /**
     * Instantiates a new Builder from an existing RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP instance.
     *
     * @param routeNextHopPrototypeRouteNextHopIpRouteNextHopIpUnicastIp the instance to initialize the Builder with
     */
    public Builder(RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeRouteNextHopIpRouteNextHopIpUnicastIp) {
      this.address = routeNextHopPrototypeRouteNextHopIpRouteNextHopIpUnicastIp.address;
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
     * Builds a RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP.
     *
     * @return the new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP instance
     */
    public RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP build() {
      return new RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP(this);
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }
  }

  protected RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP() { }

  protected RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.address,
      "address cannot be null");
    address = builder.address;
  }

  /**
   * New builder.
   *
   * @return a RouteNextHopPrototypeRouteNextHopIPRouteNextHopIPUnicastIP builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

