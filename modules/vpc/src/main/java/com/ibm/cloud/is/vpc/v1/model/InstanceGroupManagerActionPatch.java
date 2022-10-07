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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstanceGroupManagerActionPatch.
 */
public class InstanceGroupManagerActionPatch extends GenericModel {

  @SerializedName("cron_spec")
  protected String cronSpec;
  protected InstanceGroupManagerActionGroupPatch group;
  protected InstanceGroupManagerActionManagerPatch manager;
  protected String name;
  @SerializedName("run_at")
  protected Date runAt;

  /**
   * Builder.
   */
  public static class Builder {
    private String cronSpec;
    private InstanceGroupManagerActionGroupPatch group;
    private InstanceGroupManagerActionManagerPatch manager;
    private String name;
    private Date runAt;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerActionPatch instance.
     *
     * @param instanceGroupManagerActionPatch the instance to initialize the Builder with
     */
    private Builder(InstanceGroupManagerActionPatch instanceGroupManagerActionPatch) {
      this.cronSpec = instanceGroupManagerActionPatch.cronSpec;
      this.group = instanceGroupManagerActionPatch.group;
      this.manager = instanceGroupManagerActionPatch.manager;
      this.name = instanceGroupManagerActionPatch.name;
      this.runAt = instanceGroupManagerActionPatch.runAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupManagerActionPatch.
     *
     * @return the new InstanceGroupManagerActionPatch instance
     */
    public InstanceGroupManagerActionPatch build() {
      return new InstanceGroupManagerActionPatch(this);
    }

    /**
     * Set the cronSpec.
     *
     * @param cronSpec the cronSpec
     * @return the InstanceGroupManagerActionPatch builder
     */
    public Builder cronSpec(String cronSpec) {
      this.cronSpec = cronSpec;
      return this;
    }

    /**
     * Set the group.
     *
     * @param group the group
     * @return the InstanceGroupManagerActionPatch builder
     */
    public Builder group(InstanceGroupManagerActionGroupPatch group) {
      this.group = group;
      return this;
    }

    /**
     * Set the manager.
     *
     * @param manager the manager
     * @return the InstanceGroupManagerActionPatch builder
     */
    public Builder manager(InstanceGroupManagerActionManagerPatch manager) {
      this.manager = manager;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerActionPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the runAt.
     *
     * @param runAt the runAt
     * @return the InstanceGroupManagerActionPatch builder
     */
    public Builder runAt(Date runAt) {
      this.runAt = runAt;
      return this;
    }
  }

  protected InstanceGroupManagerActionPatch() { }

  protected InstanceGroupManagerActionPatch(Builder builder) {
    cronSpec = builder.cronSpec;
    group = builder.group;
    manager = builder.manager;
    name = builder.name;
    runAt = builder.runAt;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cronSpec.
   *
   * The cron specification for a recurring scheduled action. Actions can be applied a maximum of one time within a 5
   * min period.
   *
   * @return the cronSpec
   */
  public String cronSpec() {
    return cronSpec;
  }

  /**
   * Gets the group.
   *
   * @return the group
   */
  public InstanceGroupManagerActionGroupPatch group() {
    return group;
  }

  /**
   * Gets the manager.
   *
   * @return the manager
   */
  public InstanceGroupManagerActionManagerPatch manager() {
    return manager;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager action.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the runAt.
   *
   * The date and time the scheduled action will run.
   *
   * @return the runAt
   */
  public Date runAt() {
    return runAt;
  }

  /**
   * Construct a JSON merge-patch from the InstanceGroupManagerActionPatch.
   *
   * Note that properties of the InstanceGroupManagerActionPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceGroupManagerActionPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

