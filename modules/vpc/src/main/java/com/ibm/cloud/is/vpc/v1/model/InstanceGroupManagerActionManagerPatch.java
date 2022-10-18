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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroupManagerActionManagerPatch.
 */
public class InstanceGroupManagerActionManagerPatch extends GenericModel {

  @SerializedName("max_membership_count")
  protected Long maxMembershipCount;
  @SerializedName("min_membership_count")
  protected Long minMembershipCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Long maxMembershipCount;
    private Long minMembershipCount;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerActionManagerPatch instance.
     *
     * @param instanceGroupManagerActionManagerPatch the instance to initialize the Builder with
     */
    private Builder(InstanceGroupManagerActionManagerPatch instanceGroupManagerActionManagerPatch) {
      this.maxMembershipCount = instanceGroupManagerActionManagerPatch.maxMembershipCount;
      this.minMembershipCount = instanceGroupManagerActionManagerPatch.minMembershipCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupManagerActionManagerPatch.
     *
     * @return the new InstanceGroupManagerActionManagerPatch instance
     */
    public InstanceGroupManagerActionManagerPatch build() {
      return new InstanceGroupManagerActionManagerPatch(this);
    }

    /**
     * Set the maxMembershipCount.
     *
     * @param maxMembershipCount the maxMembershipCount
     * @return the InstanceGroupManagerActionManagerPatch builder
     */
    public Builder maxMembershipCount(long maxMembershipCount) {
      this.maxMembershipCount = maxMembershipCount;
      return this;
    }

    /**
     * Set the minMembershipCount.
     *
     * @param minMembershipCount the minMembershipCount
     * @return the InstanceGroupManagerActionManagerPatch builder
     */
    public Builder minMembershipCount(long minMembershipCount) {
      this.minMembershipCount = minMembershipCount;
      return this;
    }
  }

  protected InstanceGroupManagerActionManagerPatch() { }

  protected InstanceGroupManagerActionManagerPatch(Builder builder) {
    maxMembershipCount = builder.maxMembershipCount;
    minMembershipCount = builder.minMembershipCount;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionManagerPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the maxMembershipCount.
   *
   * The desired maximum number of instance group members at the scheduled time.
   *
   * @return the maxMembershipCount
   */
  public Long maxMembershipCount() {
    return maxMembershipCount;
  }

  /**
   * Gets the minMembershipCount.
   *
   * The desired minimum number of instance group members at the scheduled time.
   *
   * @return the minMembershipCount
   */
  public Long minMembershipCount() {
    return minMembershipCount;
  }
}

