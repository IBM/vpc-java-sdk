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
 * InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup extends InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpec {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String cronSpec;
    private InstanceGroupManagerScheduledActionGroupPrototype group;

    public Builder(InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpec instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup) {
      this.name = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.name;
      this.cronSpec = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.cronSpec;
      this.group = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.group;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param group the group
     */
    public Builder(InstanceGroupManagerScheduledActionGroupPrototype group) {
      this.group = group;
    }

    /**
     * Builds a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.
     *
     * @return the new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup instance
     */
    public InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup build() {
      return new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup builder
     */
    public Builder group(InstanceGroupManagerScheduledActionGroupPrototype group) {
      this.group = group;
      return this;
    }
  }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.group,
      "group cannot be null");
    name = builder.name;
    cronSpec = builder.cronSpec;
    group = builder.group;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

