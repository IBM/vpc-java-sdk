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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createVpcRoutingTableRoute options.
 */
public class CreateVpcRoutingTableRouteOptions extends GenericModel {

  /**
   * The action to perform with a packet matching the route:
   * - `delegate`: delegate to system-provided routes
   * - `delegate_vpc`: delegate to system-provided routes, ignoring Internet-bound routes
   * - `deliver`: deliver the packet to the specified `next_hop`
   * - `drop`: drop the packet.
   */
  public interface Action {
    /** delegate. */
    String DELEGATE = "delegate";
    /** delegate_vpc. */
    String DELEGATE_VPC = "delegate_vpc";
    /** deliver. */
    String DELIVER = "deliver";
    /** drop. */
    String DROP = "drop";
  }

  protected String vpcId;
  protected String routingTableId;
  protected String destination;
  protected ZoneIdentity zone;
  protected String action;
  protected Boolean advertise;
  protected String name;
  protected RouteNextHopPrototype nextHop;
  protected Long priority;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String routingTableId;
    private String destination;
    private ZoneIdentity zone;
    private String action;
    private Boolean advertise;
    private String name;
    private RouteNextHopPrototype nextHop;
    private Long priority;

    /**
     * Instantiates a new Builder from an existing CreateVpcRoutingTableRouteOptions instance.
     *
     * @param createVpcRoutingTableRouteOptions the instance to initialize the Builder with
     */
    private Builder(CreateVpcRoutingTableRouteOptions createVpcRoutingTableRouteOptions) {
      this.vpcId = createVpcRoutingTableRouteOptions.vpcId;
      this.routingTableId = createVpcRoutingTableRouteOptions.routingTableId;
      this.destination = createVpcRoutingTableRouteOptions.destination;
      this.zone = createVpcRoutingTableRouteOptions.zone;
      this.action = createVpcRoutingTableRouteOptions.action;
      this.advertise = createVpcRoutingTableRouteOptions.advertise;
      this.name = createVpcRoutingTableRouteOptions.name;
      this.nextHop = createVpcRoutingTableRouteOptions.nextHop;
      this.priority = createVpcRoutingTableRouteOptions.priority;
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
     * @param routingTableId the routingTableId
     * @param destination the destination
     * @param zone the zone
     */
    public Builder(String vpcId, String routingTableId, String destination, ZoneIdentity zone) {
      this.vpcId = vpcId;
      this.routingTableId = routingTableId;
      this.destination = destination;
      this.zone = zone;
    }

    /**
     * Builds a CreateVpcRoutingTableRouteOptions.
     *
     * @return the new CreateVpcRoutingTableRouteOptions instance
     */
    public CreateVpcRoutingTableRouteOptions build() {
      return new CreateVpcRoutingTableRouteOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the routingTableId.
     *
     * @param routingTableId the routingTableId
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder routingTableId(String routingTableId) {
      this.routingTableId = routingTableId;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the advertise.
     *
     * @param advertise the advertise
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder advertise(Boolean advertise) {
      this.advertise = advertise;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the nextHop.
     *
     * @param nextHop the nextHop
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder nextHop(RouteNextHopPrototype nextHop) {
      this.nextHop = nextHop;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the CreateVpcRoutingTableRouteOptions builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }
  }

  protected CreateVpcRoutingTableRouteOptions() { }

  protected CreateVpcRoutingTableRouteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.routingTableId,
      "routingTableId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destination,
      "destination cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    vpcId = builder.vpcId;
    routingTableId = builder.routingTableId;
    destination = builder.destination;
    zone = builder.zone;
    action = builder.action;
    advertise = builder.advertise;
    name = builder.name;
    nextHop = builder.nextHop;
    priority = builder.priority;
  }

  /**
   * New builder.
   *
   * @return a CreateVpcRoutingTableRouteOptions builder
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
   * Gets the routingTableId.
   *
   * The routing table identifier.
   *
   * @return the routingTableId
   */
  public String routingTableId() {
    return routingTableId;
  }

  /**
   * Gets the destination.
   *
   * The destination CIDR of the route. The host identifier in the CIDR must be zero.
   *
   * At most two routes per `zone` in a table can have the same `destination` and
   * `priority`, and only if both routes have an `action` of `deliver` and the `next_hop` is an IP address.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
  }

  /**
   * Gets the zone.
   *
   * The zone to apply the route to.
   *
   * If subnets are attached to the route's routing table, egress traffic from those
   * subnets in this zone will be subject to this route. If this route's routing table
   * has any of `route_direct_link_ingress`, `route_internet_ingress`,
   * `route_transit_gateway_ingress` or `route_vpc_zone_ingress`  set to`true`, traffic
   * from those ingress sources arriving in this zone will be subject to this route.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the action.
   *
   * The action to perform with a packet matching the route:
   * - `delegate`: delegate to system-provided routes
   * - `delegate_vpc`: delegate to system-provided routes, ignoring Internet-bound routes
   * - `deliver`: deliver the packet to the specified `next_hop`
   * - `drop`: drop the packet.
   *
   * @return the action
   */
  public String action() {
    return action;
  }

  /**
   * Gets the advertise.
   *
   * Indicates whether this route will be advertised to the ingress sources specified by the `advertise_routes_to`
   * routing table property.
   *
   * All routes in a routing table with the same `destination` and `zone` must have the same
   * `advertise` value.
   *
   * @return the advertise
   */
  public Boolean advertise() {
    return advertise;
  }

  /**
   * Gets the name.
   *
   * The name for this route. The name must not be used by another route in the routing table. Names starting with
   * `ibm-` are reserved for system-provided routes, and are not allowed. If unspecified, the name will be a hyphenated
   * list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the nextHop.
   *
   * If `action` is `deliver`, the next hop that packets will be delivered to (must not be
   * `0.0.0.0`). For other `action` values, it must be omitted or specified as `0.0.0.0`.
   *
   * At most two routes per `zone` in a table can have the same `destination` and `priority`,
   * and only when each route has an `action` of `deliver` and `next_hop` is an IP address.
   *
   * @return the nextHop
   */
  public RouteNextHopPrototype nextHop() {
    return nextHop;
  }

  /**
   * Gets the priority.
   *
   * The priority of this route. Smaller values have higher priority.
   *
   * If a routing table contains multiple routes with the same `zone` and `destination`, the route with the highest
   * priority (smallest value) is selected. If two routes have the same `destination` and `priority`, traffic is
   * distributed between them.
   *
   * @return the priority
   */
  public Long priority() {
    return priority;
  }
}

