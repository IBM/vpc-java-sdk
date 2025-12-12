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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * If `action` is `deliver`, the next hop that packets will be delivered to (must not be
 * `0.0.0.0`). For other `action` values, it must be omitted or specified as `0.0.0.0`.
 *
 * At most two routes per `zone` in a table can have the same `destination` and `priority`, and only when each route has
 * an `action` of `deliver` and `next_hop` is an IP address.
 *
 * Classes which extend this class:
 * - RouteNextHopPrototypeRouteNextHopIP
 * - RouteNextHopPrototypeVPNGatewayConnectionIdentity
 */
public class RouteNextHopPrototype extends GenericModel {

  protected String address;
  protected String id;
  protected String href;

  protected RouteNextHopPrototype() { }

  /**
   * Gets the address.
   *
   * The sentinel IP address (`0.0.0.0`).
   *
   * This property may [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) to support IPv6 addresses in
   * the future.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPN gateway connection.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this VPN gateway connection.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

