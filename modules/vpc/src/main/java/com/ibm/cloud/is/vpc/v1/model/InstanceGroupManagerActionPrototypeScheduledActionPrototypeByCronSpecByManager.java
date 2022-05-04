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
 * InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager extends InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpec {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String cronSpec;
    private InstanceGroupManagerScheduledActionManagerPrototype manager;

    public Builder(InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpec instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager) {
      this.name = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.name;
      this.cronSpec = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.cronSpec;
      this.manager = instanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.manager;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param manager the manager
     */
    public Builder(InstanceGroupManagerScheduledActionManagerPrototype manager) {
      this.manager = manager;
    }

    /**
     * Builds a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager.
     *
     * @return the new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager instance
     */
    public InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager build() {
      return new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the manager.
     *
     * @param manager the manager
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager builder
     */
    public Builder manager(InstanceGroupManagerScheduledActionManagerPrototype manager) {
      this.manager = manager;
      return this;
    }
  }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.manager,
      "manager cannot be null");
    name = builder.name;
    cronSpec = builder.cronSpec;
    manager = builder.manager;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByManager builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

