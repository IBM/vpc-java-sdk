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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RoutePrototype.
 */
public class RoutePrototype extends GenericModel {

  /**
   * The action to perform with a packet matching the route:
   * - `delegate`: delegate to the system's built-in routes
   * - `delegate_vpc`: delegate to the system's built-in routes, ignoring Internet-bound
   *   routes
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
  protected RouteNextHopPrototype nextHop;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private String destination;
    private String name;
    private RouteNextHopPrototype nextHop;
    private ZoneIdentity zone;

    private Builder(RoutePrototype routePrototype) {
      this.action = routePrototype.action;
      this.destination = routePrototype.destination;
      this.name = routePrototype.name;
      this.nextHop = routePrototype.nextHop;
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
    public Builder nextHop(RouteNextHopPrototype nextHop) {
      this.nextHop = nextHop;
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

  protected RoutePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destination,
      "destination cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    action = builder.action;
    destination = builder.destination;
    name = builder.name;
    nextHop = builder.nextHop;
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
   * - `delegate`: delegate to the system's built-in routes
   * - `delegate_vpc`: delegate to the system's built-in routes, ignoring Internet-bound
   *   routes
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
   * The destination of the route. At most two routes per `zone` in a table can have the same destination, and only if
   * both routes have an `action` of `deliver` and the
   * `next_hop` is an IP address.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this route. If unspecified, the name will be a hyphenated list of randomly-selected
   * words. Names must be unique within the VPC routing table the route resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the nextHop.
   *
   * If `action` is `deliver`, the next hop that packets will be delivered to.  For
   * other `action` values, it must be omitted or specified as `0.0.0.0`.
   *
   * @return the nextHop
   */
  public RouteNextHopPrototype nextHop() {
    return nextHop;
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

