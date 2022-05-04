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
 * InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.
 */
public class InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype extends InstanceGroupManagerPrototype {

  /**
   * The type of instance group manager.
   */
  public interface ManagerType {
    /** autoscale. */
    String AUTOSCALE = "autoscale";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean managementEnabled;
    private String name;
    private Long aggregationWindow;
    private Long cooldown;
    private String managerType;
    private Long maxMembershipCount;
    private Long minMembershipCount;

    public Builder(InstanceGroupManagerPrototype instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype) {
      this.managementEnabled = instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.managementEnabled;
      this.name = instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.name;
      this.aggregationWindow = instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.aggregationWindow;
      this.cooldown = instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.cooldown;
      this.managerType = instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.managerType;
      this.maxMembershipCount = instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.maxMembershipCount;
      this.minMembershipCount = instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.minMembershipCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param managerType the managerType
     * @param maxMembershipCount the maxMembershipCount
     */
    public Builder(String managerType, Long maxMembershipCount) {
      this.managerType = managerType;
      this.maxMembershipCount = maxMembershipCount;
    }

    /**
     * Builds a InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.
     *
     * @return the new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instance
     */
    public InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype build() {
      return new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype(this);
    }

    /**
     * Set the managementEnabled.
     *
     * @param managementEnabled the managementEnabled
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
     */
    public Builder managementEnabled(Boolean managementEnabled) {
      this.managementEnabled = managementEnabled;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the aggregationWindow.
     *
     * @param aggregationWindow the aggregationWindow
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
     */
    public Builder aggregationWindow(long aggregationWindow) {
      this.aggregationWindow = aggregationWindow;
      return this;
    }

    /**
     * Set the cooldown.
     *
     * @param cooldown the cooldown
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
     */
    public Builder cooldown(long cooldown) {
      this.cooldown = cooldown;
      return this;
    }

    /**
     * Set the managerType.
     *
     * @param managerType the managerType
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
     */
    public Builder managerType(String managerType) {
      this.managerType = managerType;
      return this;
    }

    /**
     * Set the maxMembershipCount.
     *
     * @param maxMembershipCount the maxMembershipCount
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
     */
    public Builder maxMembershipCount(long maxMembershipCount) {
      this.maxMembershipCount = maxMembershipCount;
      return this;
    }

    /**
     * Set the minMembershipCount.
     *
     * @param minMembershipCount the minMembershipCount
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
     */
    public Builder minMembershipCount(long minMembershipCount) {
      this.minMembershipCount = minMembershipCount;
      return this;
    }
  }

  protected InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.managerType,
      "managerType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maxMembershipCount,
      "maxMembershipCount cannot be null");
    managementEnabled = builder.managementEnabled;
    name = builder.name;
    aggregationWindow = builder.aggregationWindow;
    cooldown = builder.cooldown;
    managerType = builder.managerType;
    maxMembershipCount = builder.maxMembershipCount;
    minMembershipCount = builder.minMembershipCount;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

