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
 * DedicatedHostPrototypeDedicatedHostByGroup.
 */
public class DedicatedHostPrototypeDedicatedHostByGroup extends DedicatedHostPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean instancePlacementEnabled;
    private String name;
    private DedicatedHostProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private DedicatedHostGroupIdentity group;

    public Builder(DedicatedHostPrototype dedicatedHostPrototypeDedicatedHostByGroup) {
      this.instancePlacementEnabled = dedicatedHostPrototypeDedicatedHostByGroup.instancePlacementEnabled;
      this.name = dedicatedHostPrototypeDedicatedHostByGroup.name;
      this.profile = dedicatedHostPrototypeDedicatedHostByGroup.profile;
      this.resourceGroup = dedicatedHostPrototypeDedicatedHostByGroup.resourceGroup;
      this.group = (DedicatedHostGroupIdentity) dedicatedHostPrototypeDedicatedHostByGroup.group;
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
     * @param group the group
     */
    public Builder(DedicatedHostProfileIdentity profile, DedicatedHostGroupIdentity group) {
      this.profile = profile;
      this.group = group;
    }

    /**
     * Builds a DedicatedHostPrototypeDedicatedHostByGroup.
     *
     * @return the new DedicatedHostPrototypeDedicatedHostByGroup instance
     */
    public DedicatedHostPrototypeDedicatedHostByGroup build() {
      return new DedicatedHostPrototypeDedicatedHostByGroup(this);
    }

    /**
     * Set the instancePlacementEnabled.
     *
     * @param instancePlacementEnabled the instancePlacementEnabled
     * @return the DedicatedHostPrototypeDedicatedHostByGroup builder
     */
    public Builder instancePlacementEnabled(Boolean instancePlacementEnabled) {
      this.instancePlacementEnabled = instancePlacementEnabled;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DedicatedHostPrototypeDedicatedHostByGroup builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the DedicatedHostPrototypeDedicatedHostByGroup builder
     */
    public Builder profile(DedicatedHostProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the DedicatedHostPrototypeDedicatedHostByGroup builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the DedicatedHostPrototypeDedicatedHostByGroup builder
     */
    public Builder group(DedicatedHostGroupIdentity group) {
      this.group = group;
      return this;
    }
  }

  protected DedicatedHostPrototypeDedicatedHostByGroup(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.group,
      "group cannot be null");
    instancePlacementEnabled = builder.instancePlacementEnabled;
    name = builder.name;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    group = builder.group;
  }

  /**
   * New builder.
   *
   * @return a DedicatedHostPrototypeDedicatedHostByGroup builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

