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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDedicatedHostGroup options.
 */
public class CreateDedicatedHostGroupOptions extends GenericModel {

  /**
   * The dedicated host profile family for hosts in this group.
   */
  public interface Family {
    /** balanced. */
    String BALANCED = "balanced";
    /** compute. */
    String COMPUTE = "compute";
    /** memory. */
    String MEMORY = "memory";
  }

  protected String xClass;
  protected String family;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private String xClass;
    private String family;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private ZoneIdentity zone;

    private Builder(CreateDedicatedHostGroupOptions createDedicatedHostGroupOptions) {
      this.xClass = createDedicatedHostGroupOptions.xClass;
      this.family = createDedicatedHostGroupOptions.family;
      this.name = createDedicatedHostGroupOptions.name;
      this.resourceGroup = createDedicatedHostGroupOptions.resourceGroup;
      this.zone = createDedicatedHostGroupOptions.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateDedicatedHostGroupOptions.
     *
     * @return the new CreateDedicatedHostGroupOptions instance
     */
    public CreateDedicatedHostGroupOptions build() {
      return new CreateDedicatedHostGroupOptions(this);
    }

    /**
     * Set the xClass.
     *
     * @param xClass the xClass
     * @return the CreateDedicatedHostGroupOptions builder
     */
    public Builder xClass(String xClass) {
      this.xClass = xClass;
      return this;
    }

    /**
     * Set the family.
     *
     * @param family the family
     * @return the CreateDedicatedHostGroupOptions builder
     */
    public Builder family(String family) {
      this.family = family;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateDedicatedHostGroupOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateDedicatedHostGroupOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateDedicatedHostGroupOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected CreateDedicatedHostGroupOptions(Builder builder) {
    xClass = builder.xClass;
    family = builder.family;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a CreateDedicatedHostGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xClass.
   *
   * The dedicated host profile class for hosts in this group.
   *
   * @return the xClass
   */
  public String xClass() {
    return xClass;
  }

  /**
   * Gets the family.
   *
   * The dedicated host profile family for hosts in this group.
   *
   * @return the family
   */
  public String family() {
    return family;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this dedicated host group. If unspecified, the name will be a hyphenated list of
   * randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the zone.
   *
   * The zone this dedicated host group will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

