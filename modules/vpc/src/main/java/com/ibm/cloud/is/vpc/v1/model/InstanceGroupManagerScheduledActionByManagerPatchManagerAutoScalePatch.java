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

/**
 * InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch.
 */
public class InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch extends InstanceGroupManagerScheduledActionByManagerPatchManager {


  /**
   * Builder.
   */
  public static class Builder {
    private Long maxMembershipCount;
    private Long minMembershipCount;

    public Builder(InstanceGroupManagerScheduledActionByManagerPatchManager instanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch) {
      this.maxMembershipCount = instanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch.maxMembershipCount;
      this.minMembershipCount = instanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch.minMembershipCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch.
     *
     * @return the new InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch instance
     */
    public InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch build() {
      return new InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch(this);
    }

    /**
     * Set the maxMembershipCount.
     *
     * @param maxMembershipCount the maxMembershipCount
     * @return the InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch builder
     */
    public Builder maxMembershipCount(long maxMembershipCount) {
      this.maxMembershipCount = maxMembershipCount;
      return this;
    }

    /**
     * Set the minMembershipCount.
     *
     * @param minMembershipCount the minMembershipCount
     * @return the InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch builder
     */
    public Builder minMembershipCount(long minMembershipCount) {
      this.minMembershipCount = minMembershipCount;
      return this;
    }
  }

  protected InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch(Builder builder) {
    maxMembershipCount = builder.maxMembershipCount;
    minMembershipCount = builder.minMembershipCount;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerScheduledActionByManagerPatchManagerAutoScalePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

