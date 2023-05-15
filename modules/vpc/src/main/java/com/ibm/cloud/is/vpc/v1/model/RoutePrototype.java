/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RoutePrototype.
 */
public class RoutePrototype extends GenericModel {

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

  protected String action;
  protected String destination;
  protected String name;
  @SerializedName("next_hop")
  protected RoutePrototypeNextHop nextHop;
  protected Long priority;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String destination;
    private String name;
    private RoutePrototypeNextHop nextHop;
    private Long priority;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing RoutePrototype instance.
     *
     * @param routePrototype the instance to initialize the Builder with
     */
    private Builder(RoutePrototype routePrototype) {
      this.action = routePrototype.action;
      this.destination = routePrototype.destination;
      this.name = routePrototype.name;
      this.nextHop = routePrototype.nextHop;
      this.priority = routePrototype.priority;
      this.zone = routePrototype.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param destination the destination
     * @param zone the zone
     */
    public Builder(String destination, ZoneIdentity zone) {
      this.destination = destination;
      this.zone = zone;
    }

    /**
     * Builds a RoutePrototype.
     *
     * @return the new RoutePrototype instance
     */
    public RoutePrototype build() {
      return new RoutePrototype(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the RoutePrototype builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the RoutePrototype builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RoutePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the nextHop.
     *
     * @param nextHop the nextHop
     * @return the RoutePrototype builder
     */
    public Builder nextHop(RoutePrototypeNextHop nextHop) {
      this.nextHop = nextHop;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the RoutePrototype builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the RoutePrototype builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected RoutePrototype() { }

  protected RoutePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destination,
      "destination cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    action = builder.action;
    destination = builder.destination;
    name = builder.name;
    nextHop = builder.nextHop;
    priority = builder.priority;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a RoutePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the destination.
   *
   * The destination of the route. At most two routes per `zone` in a table can have the same `destination` and
   * `priority`, and only if both routes have an `action` of `deliver` and the `next_hop` is an IP address.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
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
   * If `action` is `deliver`, the next hop that packets will be delivered to. For other
   * `action` values, it must be omitted or specified as `0.0.0.0`.
   *
   * At most two routes per `zone` in a table can have the same `destination` and `priority`,
   * and only when each route has an `action` of `deliver` and `next_hop` is an IP address.
   *
   * @return the nextHop
   */
  public RoutePrototypeNextHop nextHop() {
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

  /**
   * Gets the zone.
   *
   * The zone to apply the route to. (Traffic from subnets in this zone will be
   * subject to this route.).
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

