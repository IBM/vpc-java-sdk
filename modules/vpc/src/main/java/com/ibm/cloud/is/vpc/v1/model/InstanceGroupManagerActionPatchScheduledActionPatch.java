/*
 * (C) Copyright IBM Corp. 2021.
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
 * InstanceGroupManagerActionPatchScheduledActionPatch.
 */
public class InstanceGroupManagerActionPatchScheduledActionPatch extends InstanceGroupManagerActionPatch {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String cronSpec;
    private InstanceGroupManagerScheduledActionGroupPatch group;
    private InstanceGroupManagerScheduledActionByManagerPatchManager manager;
    private Date runAt;

    public Builder(InstanceGroupManagerActionPatch instanceGroupManagerActionPatchScheduledActionPatch) {
      this.name = instanceGroupManagerActionPatchScheduledActionPatch.name;
      this.cronSpec = instanceGroupManagerActionPatchScheduledActionPatch.cronSpec;
      this.group = instanceGroupManagerActionPatchScheduledActionPatch.group;
      this.manager = instanceGroupManagerActionPatchScheduledActionPatch.manager;
      this.runAt = instanceGroupManagerActionPatchScheduledActionPatch.runAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupManagerActionPatchScheduledActionPatch.
     *
     * @return the new InstanceGroupManagerActionPatchScheduledActionPatch instance
     */
    public InstanceGroupManagerActionPatchScheduledActionPatch build() {
      return new InstanceGroupManagerActionPatchScheduledActionPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPatchScheduledActionPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the InstanceGroupManagerActionPatchScheduledActionPatch builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the InstanceGroupManagerActionPatchScheduledActionPatch builder
     */
    public Builder group(InstanceGroupManagerScheduledActionGroupPatch group) {
      this.group = group;
      return this;
    }

    /**
     * Set the manager.
     *
     * @param manager the manager
     * @return the InstanceGroupManagerActionPatchScheduledActionPatch builder
     */
    public Builder manager(InstanceGroupManagerScheduledActionByManagerPatchManager manager) {
      this.manager = manager;
      return this;
    }

    /**
     * Set the runAt.
     *
     * @param runAt the runAt
     * @return the InstanceGroupManagerActionPatchScheduledActionPatch builder
     */
    public Builder runAt(Date runAt) {
      this.runAt = runAt;
      return this;
    }
  }

  protected InstanceGroupManagerActionPatchScheduledActionPatch(Builder builder) {
    name = builder.name;
    cronSpec = builder.cronSpec;
    group = builder.group;
    manager = builder.manager;
    runAt = builder.runAt;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPatchScheduledActionPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

