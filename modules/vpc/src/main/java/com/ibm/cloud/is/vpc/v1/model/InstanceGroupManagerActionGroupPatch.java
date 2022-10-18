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
 * InstanceGroupManagerActionGroupPatch.
 */
public class InstanceGroupManagerActionGroupPatch extends GenericModel {

  @SerializedName("membership_count")
  protected Long membershipCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Long membershipCount;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerActionGroupPatch instance.
     *
     * @param instanceGroupManagerActionGroupPatch the instance to initialize the Builder with
     */
    private Builder(InstanceGroupManagerActionGroupPatch instanceGroupManagerActionGroupPatch) {
      this.membershipCount = instanceGroupManagerActionGroupPatch.membershipCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupManagerActionGroupPatch.
     *
     * @return the new InstanceGroupManagerActionGroupPatch instance
     */
    public InstanceGroupManagerActionGroupPatch build() {
      return new InstanceGroupManagerActionGroupPatch(this);
    }

    /**
     * Set the membershipCount.
     *
     * @param membershipCount the membershipCount
     * @return the InstanceGroupManagerActionGroupPatch builder
     */
    public Builder membershipCount(long membershipCount) {
      this.membershipCount = membershipCount;
      return this;
    }
  }

  protected InstanceGroupManagerActionGroupPatch() { }

  protected InstanceGroupManagerActionGroupPatch(Builder builder) {
    membershipCount = builder.membershipCount;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerActionGroupPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the membershipCount.
   *
   * The desired number of instance group members at the scheduled time.
   *
   * @return the membershipCount
   */
  public Long membershipCount() {
    return membershipCount;
  }
}

