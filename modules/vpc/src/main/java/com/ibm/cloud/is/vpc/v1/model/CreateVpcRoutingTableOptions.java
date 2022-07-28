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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpcRoutingTable options.
 */
public class CreateVpcRoutingTableOptions extends GenericModel {

  protected String vpcId;
  protected List<ResourceFilter> acceptRoutesFrom;
  protected String name;
  protected Boolean routeDirectLinkIngress;
  protected Boolean routeTransitGatewayIngress;
  protected Boolean routeVpcZoneIngress;
  protected List<RoutePrototype> routes;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private List<ResourceFilter> acceptRoutesFrom;
    private String name;
    private Boolean routeDirectLinkIngress;
    private Boolean routeTransitGatewayIngress;
    private Boolean routeVpcZoneIngress;
    private List<RoutePrototype> routes;

    private Builder(CreateVpcRoutingTableOptions createVpcRoutingTableOptions) {
      this.vpcId = createVpcRoutingTableOptions.vpcId;
      this.acceptRoutesFrom = createVpcRoutingTableOptions.acceptRoutesFrom;
      this.name = createVpcRoutingTableOptions.name;
      this.routeDirectLinkIngress = createVpcRoutingTableOptions.routeDirectLinkIngress;
      this.routeTransitGatewayIngress = createVpcRoutingTableOptions.routeTransitGatewayIngress;
      this.routeVpcZoneIngress = createVpcRoutingTableOptions.routeVpcZoneIngress;
      this.routes = createVpcRoutingTableOptions.routes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpcId the vpcId
     */
    public Builder(String vpcId) {
      this.vpcId = vpcId;
    }

    /**
     * Builds a CreateVpcRoutingTableOptions.
     *
     * @return the new CreateVpcRoutingTableOptions instance
     */
    public CreateVpcRoutingTableOptions build() {
      return new CreateVpcRoutingTableOptions(this);
    }

    /**
     * Adds an acceptRoutesFrom to acceptRoutesFrom.
     *
     * @param acceptRoutesFrom the new acceptRoutesFrom
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder addAcceptRoutesFrom(ResourceFilter acceptRoutesFrom) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(acceptRoutesFrom,
        "acceptRoutesFrom cannot be null");
      if (this.acceptRoutesFrom == null) {
        this.acceptRoutesFrom = new ArrayList<ResourceFilter>();
      }
      this.acceptRoutesFrom.add(acceptRoutesFrom);
      return this;
    }

    /**
     * Adds an routes to routes.
     *
     * @param routes the new routes
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder addRoutes(RoutePrototype routes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(routes,
        "routes cannot be null");
      if (this.routes == null) {
        this.routes = new ArrayList<RoutePrototype>();
      }
      this.routes.add(routes);
      return this;
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the acceptRoutesFrom.
     * Existing acceptRoutesFrom will be replaced.
     *
     * @param acceptRoutesFrom the acceptRoutesFrom
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder acceptRoutesFrom(List<ResourceFilter> acceptRoutesFrom) {
      this.acceptRoutesFrom = acceptRoutesFrom;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the routeDirectLinkIngress.
     *
     * @param routeDirectLinkIngress the routeDirectLinkIngress
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder routeDirectLinkIngress(Boolean routeDirectLinkIngress) {
      this.routeDirectLinkIngress = routeDirectLinkIngress;
      return this;
    }

    /**
     * Set the routeTransitGatewayIngress.
     *
     * @param routeTransitGatewayIngress the routeTransitGatewayIngress
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder routeTransitGatewayIngress(Boolean routeTransitGatewayIngress) {
      this.routeTransitGatewayIngress = routeTransitGatewayIngress;
      return this;
    }

    /**
     * Set the routeVpcZoneIngress.
     *
     * @param routeVpcZoneIngress the routeVpcZoneIngress
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder routeVpcZoneIngress(Boolean routeVpcZoneIngress) {
      this.routeVpcZoneIngress = routeVpcZoneIngress;
      return this;
    }

    /**
     * Set the routes.
     * Existing routes will be replaced.
     *
     * @param routes the routes
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder routes(List<RoutePrototype> routes) {
      this.routes = routes;
      return this;
    }
  }

  protected CreateVpcRoutingTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    vpcId = builder.vpcId;
    acceptRoutesFrom = builder.acceptRoutesFrom;
    name = builder.name;
    routeDirectLinkIngress = builder.routeDirectLinkIngress;
    routeTransitGatewayIngress = builder.routeTransitGatewayIngress;
    routeVpcZoneIngress = builder.routeVpcZoneIngress;
    routes = builder.routes;
  }

  /**
   * New builder.
   *
   * @return a CreateVpcRoutingTableOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpcId.
   *
   * The VPC identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the acceptRoutesFrom.
   *
   * The filters specifying the resources that may create routes in this routing table.
   *
   * At present, only the `resource_type` filter is permitted, and only the `vpn_server` value is supported, but filter
   * support is expected to expand in the future.
   *
   * @return the acceptRoutesFrom
   */
  public List<ResourceFilter> acceptRoutesFrom() {
    return acceptRoutesFrom;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this routing table. Names must be unique within the VPC the routing table resides in. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the routeDirectLinkIngress.
   *
   * If set to `true`, this routing table will be used to route traffic that originates from [Direct
   * Link](https://cloud.ibm.com/docs/dl/) to this VPC. For this to succeed, the VPC must not already have a routing
   * table with this property set to `true`.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * @return the routeDirectLinkIngress
   */
  public Boolean routeDirectLinkIngress() {
    return routeDirectLinkIngress;
  }

  /**
   * Gets the routeTransitGatewayIngress.
   *
   * If set to `true`, this routing table will be used to route traffic that originates from [Transit
   * Gateway](https://cloud.ibm.com/cloud/transit-gateway/) to this VPC. For this to succeed, the VPC must not already
   * have a routing table with this property set to `true`.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address bound to a network interface on a subnet in
   * the route's `zone`. Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP
   * address or a VPN gateway connection, the packet will be dropped.
   *
   * If [Classic Access](https://cloud.ibm.com/docs/vpc?topic=vpc-setting-up-access-to-classic-infrastructure) is
   * enabled for this VPC, and this property is set to `true`, its incoming traffic will also be routed according to
   * this routing table.
   *
   * @return the routeTransitGatewayIngress
   */
  public Boolean routeTransitGatewayIngress() {
    return routeTransitGatewayIngress;
  }

  /**
   * Gets the routeVpcZoneIngress.
   *
   * If set to `true`, this routing table will be used to route traffic that originates from subnets in other zones in
   * this VPC. For this to succeed, the VPC must not already have a routing table with this property set to `true`.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address within the VPC's address prefix ranges.
   * Therefore, if an incoming packet matches a route with a `next_hop` of an internet-bound IP address or a VPN gateway
   * connection, the packet will be dropped.
   *
   * @return the routeVpcZoneIngress
   */
  public Boolean routeVpcZoneIngress() {
    return routeVpcZoneIngress;
  }

  /**
   * Gets the routes.
   *
   * The prototype objects for routes to create for this routing table. If unspecified, the routing table will be
   * created with no routes.
   *
   * @return the routes
   */
  public List<RoutePrototype> routes() {
    return routes;
  }
}

