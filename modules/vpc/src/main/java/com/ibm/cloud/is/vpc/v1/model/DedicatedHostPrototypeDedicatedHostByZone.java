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
 * DedicatedHostPrototypeDedicatedHostByZone.
 */
public class DedicatedHostPrototypeDedicatedHostByZone extends DedicatedHostPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean instancePlacementEnabled;
    private String name;
    private DedicatedHostProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private DedicatedHostGroupPrototypeDedicatedHostByZoneContext group;
    private ZoneIdentity zone;

    public Builder(DedicatedHostPrototype dedicatedHostPrototypeDedicatedHostByZone) {
      this.instancePlacementEnabled = dedicatedHostPrototypeDedicatedHostByZone.instancePlacementEnabled;
      this.name = dedicatedHostPrototypeDedicatedHostByZone.name;
      this.profile = dedicatedHostPrototypeDedicatedHostByZone.profile;
      this.resourceGroup = dedicatedHostPrototypeDedicatedHostByZone.resourceGroup;
      this.group = (DedicatedHostGroupPrototypeDedicatedHostByZoneContext) dedicatedHostPrototypeDedicatedHostByZone.group;
      this.zone = dedicatedHostPrototypeDedicatedHostByZone.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param profile the profile
     * @param zone the zone
     */
    public Builder(DedicatedHostProfileIdentity profile, ZoneIdentity zone) {
      this.profile = profile;
      this.zone = zone;
    }

    /**
     * Builds a DedicatedHostPrototypeDedicatedHostByZone.
     *
     * @return the new DedicatedHostPrototypeDedicatedHostByZone instance
     */
    public DedicatedHostPrototypeDedicatedHostByZone build() {
      return new DedicatedHostPrototypeDedicatedHostByZone(this);
    }

    /**
     * Set the instancePlacementEnabled.
     *
     * @param instancePlacementEnabled the instancePlacementEnabled
     * @return the DedicatedHostPrototypeDedicatedHostByZone builder
     */
    public Builder instancePlacementEnabled(Boolean instancePlacementEnabled) {
      this.instancePlacementEnabled = instancePlacementEnabled;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DedicatedHostPrototypeDedicatedHostByZone builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the DedicatedHostPrototypeDedicatedHostByZone builder
     */
    public Builder profile(DedicatedHostProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the DedicatedHostPrototypeDedicatedHostByZone builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the DedicatedHostPrototypeDedicatedHostByZone builder
     */
    public Builder group(DedicatedHostGroupPrototypeDedicatedHostByZoneContext group) {
      this.group = group;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the DedicatedHostPrototypeDedicatedHostByZone builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected DedicatedHostPrototypeDedicatedHostByZone(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    instancePlacementEnabled = builder.instancePlacementEnabled;
    name = builder.name;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    group = builder.group;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a DedicatedHostPrototypeDedicatedHostByZone builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

