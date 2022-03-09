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
 * InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype.
 */
public class InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype extends InstanceGroupManagerPrototype {

  /**
   * The type of instance group manager.
   */
  public interface ManagerType {
    /** scheduled. */
    String SCHEDULED = "scheduled";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean managementEnabled;
    private String name;
    private String managerType;

    public Builder(InstanceGroupManagerPrototype instanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype) {
      this.managementEnabled = instanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype.managementEnabled;
      this.name = instanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype.name;
      this.managerType = instanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype.managerType;
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
     */
    public Builder(String managerType) {
      this.managerType = managerType;
    }

    /**
     * Builds a InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype.
     *
     * @return the new InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype instance
     */
    public InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype build() {
      return new InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype(this);
    }

    /**
     * Set the managementEnabled.
     *
     * @param managementEnabled the managementEnabled
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype builder
     */
    public Builder managementEnabled(Boolean managementEnabled) {
      this.managementEnabled = managementEnabled;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the managerType.
     *
     * @param managerType the managerType
     * @return the InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype builder
     */
    public Builder managerType(String managerType) {
      this.managerType = managerType;
      return this;
    }
  }

  protected InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.managerType,
      "managerType cannot be null");
    managementEnabled = builder.managementEnabled;
    name = builder.name;
    managerType = builder.managerType;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerPrototypeInstanceGroupManagerScheduledPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

