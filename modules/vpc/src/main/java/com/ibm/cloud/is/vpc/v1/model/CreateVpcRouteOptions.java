/*
 * (C) Copyright IBM Corp. 2020.
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
 * The createVpcRoute options.
 */
public class CreateVpcRouteOptions extends GenericModel {

  protected String vpcId;
  protected RouteNextHopPrototype nextHop;
  protected String destination;
  protected ZoneIdentity zone;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private RouteNextHopPrototype nextHop;
    private String destination;
    private ZoneIdentity zone;
    private String name;

    private Builder(CreateVpcRouteOptions createVpcRouteOptions) {
      this.vpcId = createVpcRouteOptions.vpcId;
      this.nextHop = createVpcRouteOptions.nextHop;
      this.destination = createVpcRouteOptions.destination;
      this.zone = createVpcRouteOptions.zone;
      this.name = createVpcRouteOptions.name;
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
     * @param nextHop the nextHop
     * @param destination the destination
     * @param zone the zone
     */
    public Builder(String vpcId, RouteNextHopPrototype nextHop, String destination, ZoneIdentity zone) {
      this.vpcId = vpcId;
      this.nextHop = nextHop;
      this.destination = destination;
      this.zone = zone;
    }

    /**
     * Builds a CreateVpcRouteOptions.
     *
     * @return the new CreateVpcRouteOptions instance
     */
    public CreateVpcRouteOptions build() {
      return new CreateVpcRouteOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the CreateVpcRouteOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the nextHop.
     *
     * @param nextHop the nextHop
     * @return the CreateVpcRouteOptions builder
     */
    public Builder nextHop(RouteNextHopPrototype nextHop) {
      this.nextHop = nextHop;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the CreateVpcRouteOptions builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateVpcRouteOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateVpcRouteOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected CreateVpcRouteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nextHop,
      "nextHop cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destination,
      "destination cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    vpcId = builder.vpcId;
    nextHop = builder.nextHop;
    destination = builder.destination;
    zone = builder.zone;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateVpcRouteOptions builder
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
   * Gets the nextHop.
   *
   * The next hop that packets will be delivered to.
   *
   * @return the nextHop
   */
  public RouteNextHopPrototype nextHop() {
    return nextHop;
  }

  /**
   * Gets the destination.
   *
   * The destination of the route. Must not overlap with destinations for existing user-defined routes within the VPC.
   *
   * @return the destination
   */
  public String destination() {
    return destination;
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
}

