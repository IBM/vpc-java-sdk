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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * RoutePatch.
 */
public class RoutePatch extends GenericModel {

  protected String name;
  @SerializedName("next_hop")
  protected RouteNextHopPatch nextHop;
  protected Long priority;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private RouteNextHopPatch nextHop;
    private Long priority;

    /**
     * Instantiates a new Builder from an existing RoutePatch instance.
     *
     * @param routePatch the instance to initialize the Builder with
     */
    private Builder(RoutePatch routePatch) {
      this.name = routePatch.name;
      this.nextHop = routePatch.nextHop;
      this.priority = routePatch.priority;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RoutePatch.
     *
     * @return the new RoutePatch instance
     */
    public RoutePatch build() {
      return new RoutePatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the RoutePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the nextHop.
     *
     * @param nextHop the nextHop
     * @return the RoutePatch builder
     */
    public Builder nextHop(RouteNextHopPatch nextHop) {
      this.nextHop = nextHop;
      return this;
    }

    /**
     * Set the priority.
     *
     * @param priority the priority
     * @return the RoutePatch builder
     */
    public Builder priority(long priority) {
      this.priority = priority;
      return this;
    }
  }

  protected RoutePatch() { }

  protected RoutePatch(Builder builder) {
    name = builder.name;
    nextHop = builder.nextHop;
    priority = builder.priority;
  }

  /**
   * New builder.
   *
   * @return a RoutePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this route. The name must not be used by another route in the routing table. Names starting with
   * `ibm-` are reserved for system-provided routes, and are not allowed.
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
   * `action` values, specify `0.0.0.0` or remove it by specifying `null`.
   *
   * At most two routes per `zone` in a table can have the same `destination` and `priority`,
   * and only when each route has an `action` of `deliver` and `next_hop` is an IP address.
   *
   * @return the nextHop
   */
  public RouteNextHopPatch nextHop() {
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
   * Construct a JSON merge-patch from the RoutePatch.
   *
   * Note that properties of the RoutePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the RoutePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

