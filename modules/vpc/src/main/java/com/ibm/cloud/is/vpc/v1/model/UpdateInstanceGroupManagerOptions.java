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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateInstanceGroupManager options.
 */
public class UpdateInstanceGroupManagerOptions extends GenericModel {

  protected String instanceGroupId;
  protected String id;
  protected String name;
  protected Boolean managementEnabled;
  protected Long aggregationWindow;
  protected Long cooldown;
  protected Long maxMembershipCount;
  protected Long minMembershipCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String id;
    private String name;
    private Boolean managementEnabled;
    private Long aggregationWindow;
    private Long cooldown;
    private Long maxMembershipCount;
    private Long minMembershipCount;

    private Builder(UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptions) {
      this.instanceGroupId = updateInstanceGroupManagerOptions.instanceGroupId;
      this.id = updateInstanceGroupManagerOptions.id;
      this.name = updateInstanceGroupManagerOptions.name;
      this.managementEnabled = updateInstanceGroupManagerOptions.managementEnabled;
      this.aggregationWindow = updateInstanceGroupManagerOptions.aggregationWindow;
      this.cooldown = updateInstanceGroupManagerOptions.cooldown;
      this.maxMembershipCount = updateInstanceGroupManagerOptions.maxMembershipCount;
      this.minMembershipCount = updateInstanceGroupManagerOptions.minMembershipCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceGroupId the instanceGroupId
     * @param id the id
     */
    public Builder(String instanceGroupId, String id) {
      this.instanceGroupId = instanceGroupId;
      this.id = id;
    }

    /**
     * Builds a UpdateInstanceGroupManagerOptions.
     *
     * @return the new UpdateInstanceGroupManagerOptions instance
     */
    public UpdateInstanceGroupManagerOptions build() {
      return new UpdateInstanceGroupManagerOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the managementEnabled.
     *
     * @param managementEnabled the managementEnabled
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder managementEnabled(Boolean managementEnabled) {
      this.managementEnabled = managementEnabled;
      return this;
    }

    /**
     * Set the aggregationWindow.
     *
     * @param aggregationWindow the aggregationWindow
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder aggregationWindow(long aggregationWindow) {
      this.aggregationWindow = aggregationWindow;
      return this;
    }

    /**
     * Set the cooldown.
     *
     * @param cooldown the cooldown
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder cooldown(long cooldown) {
      this.cooldown = cooldown;
      return this;
    }

    /**
     * Set the maxMembershipCount.
     *
     * @param maxMembershipCount the maxMembershipCount
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder maxMembershipCount(long maxMembershipCount) {
      this.maxMembershipCount = maxMembershipCount;
      return this;
    }

    /**
     * Set the minMembershipCount.
     *
     * @param minMembershipCount the minMembershipCount
     * @return the UpdateInstanceGroupManagerOptions builder
     */
    public Builder minMembershipCount(long minMembershipCount) {
      this.minMembershipCount = minMembershipCount;
      return this;
    }
  }

  protected UpdateInstanceGroupManagerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    id = builder.id;
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
   * @return a UpdateInstanceGroupManagerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceGroupId.
   *
   * The instance group identifier.
   *
   * @return the instanceGroupId
   */
  public String instanceGroupId() {
    return instanceGroupId;
  }

  /**
   * Gets the id.
   *
   * The instance group manager identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
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
}

