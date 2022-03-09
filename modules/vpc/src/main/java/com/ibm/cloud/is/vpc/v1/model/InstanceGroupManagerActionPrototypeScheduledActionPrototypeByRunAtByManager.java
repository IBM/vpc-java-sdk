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

import java.util.Date;

/**
 * InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager extends InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAt {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Date runAt;
    private InstanceGroupManagerScheduledActionManagerPrototype manager;

    public Builder(InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAt instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager) {
      this.name = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.name;
      this.runAt = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.runAt;
      this.manager = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.manager;
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
     * Builds a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager.
     *
     * @return the new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager instance
     */
    public InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager build() {
      return new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the runAt.
     *
     * @param runAt the runAt
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager builder
     */
    public Builder runAt(Date runAt) {
      this.runAt = runAt;
      return this;
    }

    /**
     * Set the manager.
     *
     * @param manager the manager
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager builder
     */
    public Builder manager(InstanceGroupManagerScheduledActionManagerPrototype manager) {
      this.manager = manager;
      return this;
    }
  }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.manager,
      "manager cannot be null");
    name = builder.name;
    runAt = builder.runAt;
    manager = builder.manager;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtByManager builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

