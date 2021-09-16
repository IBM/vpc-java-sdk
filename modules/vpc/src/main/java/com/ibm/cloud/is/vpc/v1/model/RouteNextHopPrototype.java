/*
 * (C) Copyright IBM Corp. 2021.
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
 * The next hop packets will be routed to.
 *
 * Classes which extend this class:
 * - RouteNextHopPrototypeRouteNextHopIP
 * - RouteNextHopPrototypeVPNGatewayConnectionIdentity
 */
public class RouteNextHopPrototype extends GenericModel {

  protected String address;
  protected String id;
  protected String href;

  protected RouteNextHopPrototype() {
  }

  /**
   * Gets the address.
   *
   * The IP address.
   *
   * This property may add support for IPv6 addresses in the future. When processing a value in this property, verify
   * that the address is in an expected format. If it is not, log an error. Optionally halt processing and surface the
   * error, or bypass the resource on which the unexpected IP address format was encountered.
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

