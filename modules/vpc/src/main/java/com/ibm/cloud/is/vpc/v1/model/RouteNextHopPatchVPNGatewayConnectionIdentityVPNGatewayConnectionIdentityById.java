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
 * RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById.
 */
public class RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById extends RouteNextHopPatchVPNGatewayConnectionIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById instance.
     *
     * @param routeNextHopPatchVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityById the instance to initialize the Builder with
     */
    public Builder(RouteNextHopPatchVPNGatewayConnectionIdentity routeNextHopPatchVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityById) {
      this.id = routeNextHopPatchVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityById.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById.
     *
     * @return the new RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById instance
     */
    public RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById build() {
      return new RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById() { }

  protected RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a RouteNextHopPatchVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityById builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

