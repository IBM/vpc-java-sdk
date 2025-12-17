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

import java.util.Date;

/**
 * InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager extends InstanceGroupManagerActionPrototypeScheduledActionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private InstanceGroupManagerScheduledActionManagerPrototype manager;
    private Date runAt;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager instance.
     *
     * @param instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager the instance to initialize the Builder with
     */
    public Builder(InstanceGroupManagerActionPrototypeScheduledActionPrototype instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager) {
      this.name = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.name;
      this.manager = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.manager;
      this.runAt = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.runAt;
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
     * @param runAt the runAt
     */
    public Builder(InstanceGroupManagerScheduledActionManagerPrototype manager, Date runAt) {
      this.manager = manager;
      this.runAt = runAt;
    }

    /**
     * Builds a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager.
     *
     * @return the new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager instance
     */
    public InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager build() {
      return new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the manager.
     *
     * @param manager the manager
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager builder
     */
    public Builder manager(InstanceGroupManagerScheduledActionManagerPrototype manager) {
      this.manager = manager;
      return this;
    }

    /**
     * Set the runAt.
     *
     * @param runAt the runAt
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager builder
     */
    public Builder runAt(Date runAt) {
      this.runAt = runAt;
      return this;
    }
  }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager() { }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.manager,
      "manager cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.runAt,
      "runAt cannot be null");
    name = builder.name;
    manager = builder.manager;
    runAt = builder.runAt;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithManager builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

