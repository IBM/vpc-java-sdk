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
 * FloatingIPPrototypeFloatingIPByZone.
 */
public class FloatingIPPrototypeFloatingIPByZone extends FloatingIPPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private ZoneIdentity zone;

    public Builder(FloatingIPPrototype floatingIpPrototypeFloatingIpByZone) {
      this.name = floatingIpPrototypeFloatingIpByZone.name;
      this.resourceGroup = floatingIpPrototypeFloatingIpByZone.resourceGroup;
      this.zone = floatingIpPrototypeFloatingIpByZone.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param zone the zone
     */
    public Builder(ZoneIdentity zone) {
      this.zone = zone;
    }

    /**
     * Builds a FloatingIPPrototypeFloatingIPByZone.
     *
     * @return the new FloatingIPPrototypeFloatingIPByZone instance
     */
    public FloatingIPPrototypeFloatingIPByZone build() {
      return new FloatingIPPrototypeFloatingIPByZone(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the FloatingIPPrototypeFloatingIPByZone builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the FloatingIPPrototypeFloatingIPByZone builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the FloatingIPPrototypeFloatingIPByZone builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected FloatingIPPrototypeFloatingIPByZone(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a FloatingIPPrototypeFloatingIPByZone builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

