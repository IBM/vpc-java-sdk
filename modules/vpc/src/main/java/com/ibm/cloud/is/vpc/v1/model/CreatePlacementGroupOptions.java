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
 * The createPlacementGroup options.
 */
public class CreatePlacementGroupOptions extends GenericModel {

  /**
   * The strategy for this placement group
   * - `host_spread`: place on different compute hosts
   * - `power_spread`: place on compute hosts that use different power sources
   *
   * The enumerated values for this property may expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the placement group on which the
   * unexpected strategy was encountered.
   */
  public interface Strategy {
    /** host_spread. */
    String HOST_SPREAD = "host_spread";
    /** power_spread. */
    String POWER_SPREAD = "power_spread";
  }

  protected String strategy;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private String strategy;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreatePlacementGroupOptions instance.
     *
     * @param createPlacementGroupOptions the instance to initialize the Builder with
     */
    private Builder(CreatePlacementGroupOptions createPlacementGroupOptions) {
      this.strategy = createPlacementGroupOptions.strategy;
      this.name = createPlacementGroupOptions.name;
      this.resourceGroup = createPlacementGroupOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param strategy the strategy
     */
    public Builder(String strategy) {
      this.strategy = strategy;
    }

    /**
     * Builds a CreatePlacementGroupOptions.
     *
     * @return the new CreatePlacementGroupOptions instance
     */
    public CreatePlacementGroupOptions build() {
      return new CreatePlacementGroupOptions(this);
    }

    /**
     * Set the strategy.
     *
     * @param strategy the strategy
     * @return the CreatePlacementGroupOptions builder
     */
    public Builder strategy(String strategy) {
      this.strategy = strategy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreatePlacementGroupOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreatePlacementGroupOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreatePlacementGroupOptions() { }

  protected CreatePlacementGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.strategy,
      "strategy cannot be null");
    strategy = builder.strategy;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreatePlacementGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the strategy.
   *
   * The strategy for this placement group
   * - `host_spread`: place on different compute hosts
   * - `power_spread`: place on compute hosts that use different power sources
   *
   * The enumerated values for this property may expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the placement group on which the
   * unexpected strategy was encountered.
   *
   * @return the strategy
   */
  public String strategy() {
    return strategy;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this placement group. If unspecified, the name will be a hyphenated list of
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
}

