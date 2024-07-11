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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * If `action` is `deliver`, the next hop that packets will be delivered to. For other
 * `action` values, specify `0.0.0.0` or remove it by specifying `null`.
 *
 * At most two routes per `zone` in a table can have the same `destination` and `priority`, and only when each route has
 * an `action` of `deliver` and `next_hop` is an IP address.
 *
 * Classes which extend this class:
 * - RouteNextHopPatchRouteNextHopIP
 * - RouteNextHopPatchVPNGatewayConnectionIdentity
 */
public class RouteNextHopPatch extends GenericModel {

  protected String address;
  protected String id;
  protected String href;

  protected RouteNextHopPatch() { }

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
   * The VPN connection's canonical URL.
   *
   * @return the href
   */
  public String href() {
    return href;
  }
}

