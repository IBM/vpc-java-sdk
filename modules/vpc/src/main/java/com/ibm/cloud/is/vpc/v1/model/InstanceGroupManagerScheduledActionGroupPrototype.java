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
 * InstanceGroupManagerScheduledActionGroupPrototype.
 */
public class InstanceGroupManagerScheduledActionGroupPrototype extends GenericModel {

  @SerializedName("membership_count")
  protected Long membershipCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Long membershipCount;

    private Builder(InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototype) {
      this.membershipCount = instanceGroupManagerScheduledActionGroupPrototype.membershipCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param membershipCount the membershipCount
     */
    public Builder(Long membershipCount) {
      this.membershipCount = membershipCount;
    }

    /**
     * Builds a InstanceGroupManagerScheduledActionGroupPrototype.
     *
     * @return the new InstanceGroupManagerScheduledActionGroupPrototype instance
     */
    public InstanceGroupManagerScheduledActionGroupPrototype build() {
      return new InstanceGroupManagerScheduledActionGroupPrototype(this);
    }

    /**
     * Set the membershipCount.
     *
     * @param membershipCount the membershipCount
     * @return the InstanceGroupManagerScheduledActionGroupPrototype builder
     */
    public Builder membershipCount(long membershipCount) {
      this.membershipCount = membershipCount;
      return this;
    }
  }

  protected InstanceGroupManagerScheduledActionGroupPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.membershipCount,
      "membershipCount cannot be null");
    membershipCount = builder.membershipCount;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerScheduledActionGroupPrototype builder
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

