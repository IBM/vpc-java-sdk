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

/**
 * VPNGatewayConnectionStaticRouteMode.
 */
public class VPNGatewayConnectionStaticRouteMode extends VPNGatewayConnection {

  /**
   * The authentication mode. Only `psk` is currently supported.
   */
  public interface AuthenticationMode {
    /** psk. */
    String PSK = "psk";
  }

  /**
   * The mode of the VPN gateway.
   */
  public interface Mode {
    /** policy. */
    String POLICY = "policy";
    /** route. */
    String ROUTE = "route";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** vpn_gateway_connection. */
    String VPN_GATEWAY_CONNECTION = "vpn_gateway_connection";
  }

  /**
   * The status of a VPN gateway connection.
   */
  public interface Status {
    /** down. */
    String DOWN = "down";
    /** up. */
    String UP = "up";
  }

  /**
   * Routing protocols are disabled for this VPN gateway connection.
   */
  public interface RoutingProtocol {
    /** none. */
    String NONE = "none";
  }

}

