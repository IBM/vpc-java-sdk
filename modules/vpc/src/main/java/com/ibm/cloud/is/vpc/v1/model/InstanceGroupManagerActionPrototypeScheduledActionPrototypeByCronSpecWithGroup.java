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
 * InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup extends InstanceGroupManagerActionPrototypeScheduledActionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String cronSpec;
    private InstanceGroupManagerScheduledActionGroupPrototype group;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup instance.
     *
     * @param instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup the instance to initialize the Builder with
     */
    public Builder(InstanceGroupManagerActionPrototypeScheduledActionPrototype instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup) {
      this.name = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.name;
      this.cronSpec = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.cronSpec;
      this.group = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.group;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param cronSpec the cronSpec
     * @param group the group
     */
    public Builder(String cronSpec, InstanceGroupManagerScheduledActionGroupPrototype group) {
      this.cronSpec = cronSpec;
      this.group = group;
    }

    /**
     * Builds a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup.
     *
     * @return the new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup instance
     */
    public InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup build() {
      return new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup builder
     */
    public Builder group(InstanceGroupManagerScheduledActionGroupPrototype group) {
      this.group = group;
      return this;
    }
  }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup() { }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cronSpec,
      "cronSpec cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.group,
      "group cannot be null");
    name = builder.name;
    cronSpec = builder.cronSpec;
    group = builder.group;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithGroup builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

