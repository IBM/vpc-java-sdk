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
 * InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager extends InstanceGroupManagerActionPrototypeScheduledActionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String cronSpec;
    private InstanceGroupManagerScheduledActionManagerPrototype manager;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager instance.
     *
     * @param instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager the instance to initialize the Builder with
     */
    public Builder(InstanceGroupManagerActionPrototypeScheduledActionPrototype instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager) {
      this.name = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager.name;
      this.cronSpec = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager.cronSpec;
      this.manager = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager.manager;
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
     * @param manager the manager
     */
    public Builder(String cronSpec, InstanceGroupManagerScheduledActionManagerPrototype manager) {
      this.cronSpec = cronSpec;
      this.manager = manager;
    }

    /**
     * Builds a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager.
     *
     * @return the new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager instance
     */
    public InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager build() {
      return new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the manager.
     *
     * @param manager the manager
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager builder
     */
    public Builder manager(InstanceGroupManagerScheduledActionManagerPrototype manager) {
      this.manager = manager;
      return this;
    }
  }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager() { }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.cronSpec,
      "cronSpec cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.manager,
      "manager cannot be null");
    name = builder.name;
    cronSpec = builder.cronSpec;
    manager = builder.manager;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecWithManager builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

