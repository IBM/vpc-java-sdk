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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpcRoutingTable options.
 */
public class CreateVpcRoutingTableOptions extends GenericModel {

  /**
   * An ingress source that routes can be advertised to:
   *
   * - `direct_link` (requires `route_direct_link_ingress` be set to `true`)
   * - `transit_gateway` (requires `route_transit_gateway_ingress` be set to `true`).
   */
  public interface AdvertiseRoutesTo {
    /** direct_link. */
    String DIRECT_LINK = "direct_link";
    /** transit_gateway. */
    String TRANSIT_GATEWAY = "transit_gateway";
  }

  protected String vpcId;
  protected List<ResourceFilter> acceptRoutesFrom;
  protected List<String> advertiseRoutesTo;
  protected String name;
  protected Boolean routeDirectLinkIngress;
  protected Boolean routeInternetIngress;
  protected Boolean routeTransitGatewayIngress;
  protected Boolean routeVpcZoneIngress;
  protected List<RoutePrototype> routes;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private List<ResourceFilter> acceptRoutesFrom;
    private List<String> advertiseRoutesTo;
    private String name;
    private Boolean routeDirectLinkIngress;
    private Boolean routeInternetIngress;
    private Boolean routeTransitGatewayIngress;
    private Boolean routeVpcZoneIngress;
    private List<RoutePrototype> routes;

    /**
     * Instantiates a new Builder from an existing CreateVpcRoutingTableOptions instance.
     *
     * @param createVpcRoutingTableOptions the instance to initialize the Builder with
     */
    private Builder(CreateVpcRoutingTableOptions createVpcRoutingTableOptions) {
      this.vpcId = createVpcRoutingTableOptions.vpcId;
      this.acceptRoutesFrom = createVpcRoutingTableOptions.acceptRoutesFrom;
      this.advertiseRoutesTo = createVpcRoutingTableOptions.advertiseRoutesTo;
      this.name = createVpcRoutingTableOptions.name;
      this.routeDirectLinkIngress = createVpcRoutingTableOptions.routeDirectLinkIngress;
      this.routeInternetIngress = createVpcRoutingTableOptions.routeInternetIngress;
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
     * Adds a new element to acceptRoutesFrom.
     *
     * @param acceptRoutesFrom the new element to be added
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
     * Adds a new element to advertiseRoutesTo.
     *
     * @param advertiseRoutesTo the new element to be added
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder addAdvertiseRoutesTo(String advertiseRoutesTo) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(advertiseRoutesTo,
        "advertiseRoutesTo cannot be null");
      if (this.advertiseRoutesTo == null) {
        this.advertiseRoutesTo = new ArrayList<String>();
      }
      this.advertiseRoutesTo.add(advertiseRoutesTo);
      return this;
    }

    /**
     * Adds a new element to routes.
     *
     * @param routes the new element to be added
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
     * Set the advertiseRoutesTo.
     * Existing advertiseRoutesTo will be replaced.
     *
     * @param advertiseRoutesTo the advertiseRoutesTo
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder advertiseRoutesTo(List<String> advertiseRoutesTo) {
      this.advertiseRoutesTo = advertiseRoutesTo;
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
     * Set the routeInternetIngress.
     *
     * @param routeInternetIngress the routeInternetIngress
     * @return the CreateVpcRoutingTableOptions builder
     */
    public Builder routeInternetIngress(Boolean routeInternetIngress) {
      this.routeInternetIngress = routeInternetIngress;
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

  protected CreateVpcRoutingTableOptions() { }

  protected CreateVpcRoutingTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    vpcId = builder.vpcId;
    acceptRoutesFrom = builder.acceptRoutesFrom;
    advertiseRoutesTo = builder.advertiseRoutesTo;
    name = builder.name;
    routeDirectLinkIngress = builder.routeDirectLinkIngress;
    routeInternetIngress = builder.routeInternetIngress;
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
   * @return the acceptRoutesFrom
   */
  public List<ResourceFilter> acceptRoutesFrom() {
    return acceptRoutesFrom;
  }

  /**
   * Gets the advertiseRoutesTo.
   *
   * The ingress sources to advertise routes to. Routes in the table with `advertise` enabled will be advertised to
   * these sources.
   *
   * @return the advertiseRoutesTo
   */
  public List<String> advertiseRoutesTo() {
    return advertiseRoutesTo;
  }

  /**
   * Gets the name.
   *
   * The name for this routing table. The name must not be used by another routing table in the VPC. If unspecified, the
   * name will be a hyphenated list of randomly-selected words.
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
   * Link](https://cloud.ibm.com/docs/dl) to this VPC. The VPC must not already have a routing table with this property
   * set to `true`.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address in a subnet in the route's `zone` that is
   * able to accept traffic. Therefore, if an incoming packet matches a route with a `next_hop` of a VPN gateway
   * connection, the packet will be dropped.
   *
   * If [Classic Access](https://cloud.ibm.com/docs/vpc?topic=vpc-setting-up-access-to-classic-infrastructure) is
   * enabled for this VPC, and this property is set to `true`, its incoming traffic will also be routed according to
   * this routing table.
   *
   * @return the routeDirectLinkIngress
   */
  public Boolean routeDirectLinkIngress() {
    return routeDirectLinkIngress;
  }

  /**
   * Gets the routeInternetIngress.
   *
   * If set to `true`, this routing table will be used to route traffic that originates from the internet. For this to
   * succeed, the VPC must not already have a routing table with this property set to `true`.
   *
   * Incoming traffic will be routed according to the routing table with two exceptions:
   * - Traffic destined for IP addresses associated with public gateways will not be
   *   subject to routes in this routing table.
   * - Routes with an `action` of `deliver` are treated as `drop` unless the `next_hop` is
   *   an IP address in a subnet in the route's `zone` that is able to accept traffic.
   *   Therefore, if an incoming packet matches a route with a `next_hop` of a VPN gateway
   *   connection, the packet will be dropped.
   *
   * @return the routeInternetIngress
   */
  public Boolean routeInternetIngress() {
    return routeInternetIngress;
  }

  /**
   * Gets the routeTransitGatewayIngress.
   *
   * If set to `true`, this routing table will be used to route traffic that originates from [Transit
   * Gateway](https://cloud.ibm.com/docs/transit-gateway) to this VPC. The VPC must not already have a routing table
   * with this property set to `true`.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address in a subnet in the route's `zone` that is
   * able to accept traffic. Therefore, if an incoming packet matches a route with a `next_hop` of a VPN gateway
   * connection, the packet will be dropped.
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
   * this VPC. The VPC must not already have a routing table with this property set to `true`.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address in a subnet in the route's `zone` that is
   * able to accept traffic. Therefore, if an incoming packet matches a route with a `next_hop` of a VPN gateway
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

