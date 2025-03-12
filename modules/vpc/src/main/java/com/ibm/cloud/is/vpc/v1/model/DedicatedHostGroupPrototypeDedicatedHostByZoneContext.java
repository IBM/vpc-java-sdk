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

/**
 * DedicatedHostGroupPrototypeDedicatedHostByZoneContext.
 */
public class DedicatedHostGroupPrototypeDedicatedHostByZoneContext extends DedicatedHostPrototypeGroup {

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing DedicatedHostGroupPrototypeDedicatedHostByZoneContext instance.
     *
     * @param dedicatedHostGroupPrototypeDedicatedHostByZoneContext the instance to initialize the Builder with
     */
    private Builder(DedicatedHostGroupPrototypeDedicatedHostByZoneContext dedicatedHostGroupPrototypeDedicatedHostByZoneContext) {
      this.name = dedicatedHostGroupPrototypeDedicatedHostByZoneContext.name;
      this.resourceGroup = dedicatedHostGroupPrototypeDedicatedHostByZoneContext.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DedicatedHostGroupPrototypeDedicatedHostByZoneContext.
     *
     * @return the new DedicatedHostGroupPrototypeDedicatedHostByZoneContext instance
     */
    public DedicatedHostGroupPrototypeDedicatedHostByZoneContext build() {
      return new DedicatedHostGroupPrototypeDedicatedHostByZoneContext(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DedicatedHostGroupPrototypeDedicatedHostByZoneContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the DedicatedHostGroupPrototypeDedicatedHostByZoneContext builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected DedicatedHostGroupPrototypeDedicatedHostByZoneContext() { }

  protected DedicatedHostGroupPrototypeDedicatedHostByZoneContext(Builder builder) {
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a DedicatedHostGroupPrototypeDedicatedHostByZoneContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this dedicated host group. The name must not be used by another dedicated host group in the region. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the host's resource group is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

