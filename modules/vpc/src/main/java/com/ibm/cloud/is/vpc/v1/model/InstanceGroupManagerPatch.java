/*
 * (C) Copyright IBM Corp. 2020.
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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstanceGroupManagerPatch.
 */
public class InstanceGroupManagerPatch extends GenericModel {

  protected String name;
  @SerializedName("management_enabled")
  protected Boolean managementEnabled;
  @SerializedName("aggregation_window")
  protected Long aggregationWindow;
  protected Long cooldown;
  @SerializedName("max_membership_count")
  protected Long maxMembershipCount;
  @SerializedName("min_membership_count")
  protected Long minMembershipCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Boolean managementEnabled;
    private Long aggregationWindow;
    private Long cooldown;
    private Long maxMembershipCount;
    private Long minMembershipCount;

    private Builder(InstanceGroupManagerPatch instanceGroupManagerPatch) {
      this.name = instanceGroupManagerPatch.name;
      this.managementEnabled = instanceGroupManagerPatch.managementEnabled;
      this.aggregationWindow = instanceGroupManagerPatch.aggregationWindow;
      this.cooldown = instanceGroupManagerPatch.cooldown;
      this.maxMembershipCount = instanceGroupManagerPatch.maxMembershipCount;
      this.minMembershipCount = instanceGroupManagerPatch.minMembershipCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupManagerPatch.
     *
     * @return the new InstanceGroupManagerPatch instance
     */
    public InstanceGroupManagerPatch build() {
      return new InstanceGroupManagerPatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupManagerPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the managementEnabled.
     *
     * @param managementEnabled the managementEnabled
     * @return the InstanceGroupManagerPatch builder
     */
    public Builder managementEnabled(Boolean managementEnabled) {
      this.managementEnabled = managementEnabled;
      return this;
    }

    /**
     * Set the aggregationWindow.
     *
     * @param aggregationWindow the aggregationWindow
     * @return the InstanceGroupManagerPatch builder
     */
    public Builder aggregationWindow(long aggregationWindow) {
      this.aggregationWindow = aggregationWindow;
      return this;
    }

    /**
     * Set the cooldown.
     *
     * @param cooldown the cooldown
     * @return the InstanceGroupManagerPatch builder
     */
    public Builder cooldown(long cooldown) {
      this.cooldown = cooldown;
      return this;
    }

    /**
     * Set the maxMembershipCount.
     *
     * @param maxMembershipCount the maxMembershipCount
     * @return the InstanceGroupManagerPatch builder
     */
    public Builder maxMembershipCount(long maxMembershipCount) {
      this.maxMembershipCount = maxMembershipCount;
      return this;
    }

    /**
     * Set the minMembershipCount.
     *
     * @param minMembershipCount the minMembershipCount
     * @return the InstanceGroupManagerPatch builder
     */
    public Builder minMembershipCount(long minMembershipCount) {
      this.minMembershipCount = minMembershipCount;
      return this;
    }
  }

  protected InstanceGroupManagerPatch(Builder builder) {
    name = builder.name;
    managementEnabled = builder.managementEnabled;
    aggregationWindow = builder.aggregationWindow;
    cooldown = builder.cooldown;
    maxMembershipCount = builder.maxMembershipCount;
    minMembershipCount = builder.minMembershipCount;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager. Names must be unique within the instance group.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the managementEnabled.
   *
   * If set to `true`, this manager will control the instance group.
   *
   * @return the managementEnabled
   */
  public Boolean managementEnabled() {
    return managementEnabled;
  }

  /**
   * Gets the aggregationWindow.
   *
   * The time window in seconds to aggregate metrics prior to evaluation.
   *
   * @return the aggregationWindow
   */
  public Long aggregationWindow() {
    return aggregationWindow;
  }

  /**
   * Gets the cooldown.
   *
   * The duration of time in seconds to pause further scale actions after scaling has taken place.
   *
   * @return the cooldown
   */
  public Long cooldown() {
    return cooldown;
  }

  /**
   * Gets the maxMembershipCount.
   *
   * The maximum number of members in a managed instance group.
   *
   * @return the maxMembershipCount
   */
  public Long maxMembershipCount() {
    return maxMembershipCount;
  }

  /**
   * Gets the minMembershipCount.
   *
   * The minimum number of members in a managed instance group.
   *
   * @return the minMembershipCount
   */
  public Long minMembershipCount() {
    return minMembershipCount;
  }

  /**
   * Construct a JSON merge-patch from the InstanceGroupManagerPatch.
   *
   * Note that properties of the InstanceGroupManagerPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceGroupManagerPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

