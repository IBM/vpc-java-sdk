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
 * InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup.
 */
public class InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup extends InstanceGroupManagerActionPrototypeScheduledActionPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private InstanceGroupManagerScheduledActionGroupPrototype group;
    private Date runAt;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup instance.
     *
     * @param instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup the instance to initialize the Builder with
     */
    public Builder(InstanceGroupManagerActionPrototypeScheduledActionPrototype instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup) {
      this.name = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup.name;
      this.group = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup.group;
      this.runAt = instanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup.runAt;
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
     * @param runAt the runAt
     */
    public Builder(InstanceGroupManagerScheduledActionGroupPrototype group, Date runAt) {
      this.group = group;
      this.runAt = runAt;
    }

    /**
     * Builds a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup.
     *
     * @return the new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup instance
     */
    public InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup build() {
      return new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup builder
     */
    public Builder group(InstanceGroupManagerScheduledActionGroupPrototype group) {
      this.group = group;
      return this;
    }

    /**
     * Set the runAt.
     *
     * @param runAt the runAt
     * @return the InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup builder
     */
    public Builder runAt(Date runAt) {
      this.runAt = runAt;
      return this;
    }
  }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup() { }

  protected InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.group,
      "group cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.runAt,
      "runAt cannot be null");
    name = builder.name;
    group = builder.group;
    runAt = builder.runAt;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPrototypeScheduledActionPrototypeByRunAtWithGroup builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

