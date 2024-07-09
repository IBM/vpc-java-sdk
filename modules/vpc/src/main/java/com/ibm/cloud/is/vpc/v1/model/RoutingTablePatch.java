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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * RoutingTablePatch.
 */
public class RoutingTablePatch extends GenericModel {

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

  @SerializedName("accept_routes_from")
  protected List<ResourceFilter> acceptRoutesFrom;
  @SerializedName("advertise_routes_to")
  protected List<String> advertiseRoutesTo;
  protected String name;
  @SerializedName("route_direct_link_ingress")
  protected Boolean routeDirectLinkIngress;
  @SerializedName("route_internet_ingress")
  protected Boolean routeInternetIngress;
  @SerializedName("route_transit_gateway_ingress")
  protected Boolean routeTransitGatewayIngress;
  @SerializedName("route_vpc_zone_ingress")
  protected Boolean routeVpcZoneIngress;

  /**
   * Builder.
   */
  public static class Builder {
    private List<ResourceFilter> acceptRoutesFrom;
    private List<String> advertiseRoutesTo;
    private String name;
    private Boolean routeDirectLinkIngress;
    private Boolean routeInternetIngress;
    private Boolean routeTransitGatewayIngress;
    private Boolean routeVpcZoneIngress;

    /**
     * Instantiates a new Builder from an existing RoutingTablePatch instance.
     *
     * @param routingTablePatch the instance to initialize the Builder with
     */
    private Builder(RoutingTablePatch routingTablePatch) {
      this.acceptRoutesFrom = routingTablePatch.acceptRoutesFrom;
      this.advertiseRoutesTo = routingTablePatch.advertiseRoutesTo;
      this.name = routingTablePatch.name;
      this.routeDirectLinkIngress = routingTablePatch.routeDirectLinkIngress;
      this.routeInternetIngress = routingTablePatch.routeInternetIngress;
      this.routeTransitGatewayIngress = routingTablePatch.routeTransitGatewayIngress;
      this.routeVpcZoneIngress = routingTablePatch.routeVpcZoneIngress;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RoutingTablePatch.
     *
     * @return the new RoutingTablePatch instance
     */
    public RoutingTablePatch build() {
      return new RoutingTablePatch(this);
    }

    /**
     * Adds a new element to acceptRoutesFrom.
     *
     * @param acceptRoutesFrom the new element to be added
     * @return the RoutingTablePatch builder
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
     * @return the RoutingTablePatch builder
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
     * Set the acceptRoutesFrom.
     * Existing acceptRoutesFrom will be replaced.
     *
     * @param acceptRoutesFrom the acceptRoutesFrom
     * @return the RoutingTablePatch builder
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
     * @return the RoutingTablePatch builder
     */
    public Builder advertiseRoutesTo(List<String> advertiseRoutesTo) {
      this.advertiseRoutesTo = advertiseRoutesTo;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RoutingTablePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the routeDirectLinkIngress.
     *
     * @param routeDirectLinkIngress the routeDirectLinkIngress
     * @return the RoutingTablePatch builder
     */
    public Builder routeDirectLinkIngress(Boolean routeDirectLinkIngress) {
      this.routeDirectLinkIngress = routeDirectLinkIngress;
      return this;
    }

    /**
     * Set the routeInternetIngress.
     *
     * @param routeInternetIngress the routeInternetIngress
     * @return the RoutingTablePatch builder
     */
    public Builder routeInternetIngress(Boolean routeInternetIngress) {
      this.routeInternetIngress = routeInternetIngress;
      return this;
    }

    /**
     * Set the routeTransitGatewayIngress.
     *
     * @param routeTransitGatewayIngress the routeTransitGatewayIngress
     * @return the RoutingTablePatch builder
     */
    public Builder routeTransitGatewayIngress(Boolean routeTransitGatewayIngress) {
      this.routeTransitGatewayIngress = routeTransitGatewayIngress;
      return this;
    }

    /**
     * Set the routeVpcZoneIngress.
     *
     * @param routeVpcZoneIngress the routeVpcZoneIngress
     * @return the RoutingTablePatch builder
     */
    public Builder routeVpcZoneIngress(Boolean routeVpcZoneIngress) {
      this.routeVpcZoneIngress = routeVpcZoneIngress;
      return this;
    }
  }

  protected RoutingTablePatch() { }

  protected RoutingTablePatch(Builder builder) {
    acceptRoutesFrom = builder.acceptRoutesFrom;
    advertiseRoutesTo = builder.advertiseRoutesTo;
    name = builder.name;
    routeDirectLinkIngress = builder.routeDirectLinkIngress;
    routeInternetIngress = builder.routeInternetIngress;
    routeTransitGatewayIngress = builder.routeTransitGatewayIngress;
    routeVpcZoneIngress = builder.routeVpcZoneIngress;
  }

  /**
   * New builder.
   *
   * @return a RoutingTablePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the acceptRoutesFrom.
   *
   * The filters specifying the resources that may create routes in this routing table
   * (replacing any existing filters). All routes created by resources that match a given filter will be removed when an
   * existing filter is removed. Therefore, if an empty array is specified, all filters will be removed, resulting in
   * all routes not directly created by the user being removed.
   *
   * @return the acceptRoutesFrom
   */
  public List<ResourceFilter> acceptRoutesFrom() {
    return acceptRoutesFrom;
  }

  /**
   * Gets the advertiseRoutesTo.
   *
   * The ingress sources to advertise routes to, replacing any existing sources to advertise to. Routes in the table
   * with `advertise` enabled will be advertised to these sources.
   *
   * @return the advertiseRoutesTo
   */
  public List<String> advertiseRoutesTo() {
    return advertiseRoutesTo;
  }

  /**
   * Gets the name.
   *
   * The name for this routing table. The name must not be used by another routing table in the VPC.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the routeDirectLinkIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from
   * [Direct Link](https://cloud.ibm.com/docs/dl/) to this VPC. Updating to `true` selects this routing table, provided
   * no other routing table in the VPC already has this property set to `true`, and no subnets are attached to this
   * routing table. Updating to
   * `false` deselects this routing table, provided `direct_link` is absent from
   * `advertise_routes_to`.
   *
   * Incoming traffic will be routed according to the routing table with one exception: routes with an `action` of
   * `deliver` are treated as `drop` unless the `next_hop` is an IP address in a subnet in the route's `zone` that is
   * able to accept traffic. Therefore, if an incoming packet matches a route with a `next_hop` of a VPN gateway
   * connection, the packet will be dropped.
   *
   * @return the routeDirectLinkIngress
   */
  public Boolean routeDirectLinkIngress() {
    return routeDirectLinkIngress;
  }

  /**
   * Gets the routeInternetIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from the internet.  Updating to
   * `true` selects this routing table, provided no other routing table in the VPC already has this property set to
   * `true`.  Updating to `false` deselects this routing table.
   *
   * Incoming traffic will be routed according to the routing table with two exceptions:
   * -  Traffic destined for IP addresses associated with public gateways will not be subject
   *    to routes in this routing table.
   * -  Routes with an `action` of `deliver` are treated as `drop` unless the `next_hop` is an
   *    IP address in a subnet in the route's `zone` that is able to accept traffic.
   *    Therefore, if an incoming packet matches a route with a `next_hop` of a VPN gateway
   *    connection, the packet will be dropped.
   *
   * @return the routeInternetIngress
   */
  public Boolean routeInternetIngress() {
    return routeInternetIngress;
  }

  /**
   * Gets the routeTransitGatewayIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from
   * [Transit Gateway](https://cloud.ibm.com/docs/transit-gateway) to this VPC. Updating to
   * `true` selects this routing table, provided no other routing table in the VPC already has this property set to
   * `true`, and no subnets are attached to this routing table. Updating to `false` deselects this routing table,
   * provided `transit_gateway` is absent from `advertise_routes_to`.
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
   * @return the routeTransitGatewayIngress
   */
  public Boolean routeTransitGatewayIngress() {
    return routeTransitGatewayIngress;
  }

  /**
   * Gets the routeVpcZoneIngress.
   *
   * Indicates whether this routing table is used to route traffic that originates from subnets in other zones in this
   * VPC. Updating to `true` selects this routing table, provided no other routing table in the VPC already has this
   * property set to `true`, and no subnets are attached to this routing table. Updating to `false` deselects this
   * routing table.
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
   * Construct a JSON merge-patch from the RoutingTablePatch.
   *
   * Note that properties of the RoutingTablePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the RoutingTablePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

