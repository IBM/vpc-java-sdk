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
 * InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref.
 */
public class InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref extends InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Long maxMembershipCount;
    private Long minMembershipCount;
    private String href;

    public Builder(InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototype instanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref) {
      this.maxMembershipCount = instanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref.maxMembershipCount;
      this.minMembershipCount = instanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref.minMembershipCount;
      this.href = instanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref.href;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param href the href
     */
    public Builder(String href) {
      this.href = href;
    }

    /**
     * Builds a InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref.
     *
     * @return the new InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref instance
     */
    public InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref build() {
      return new InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref(this);
    }

    /**
     * Set the maxMembershipCount.
     *
     * @param maxMembershipCount the maxMembershipCount
     * @return the InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref builder
     */
    public Builder maxMembershipCount(long maxMembershipCount) {
      this.maxMembershipCount = maxMembershipCount;
      return this;
    }

    /**
     * Set the minMembershipCount.
     *
     * @param minMembershipCount the minMembershipCount
     * @return the InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref builder
     */
    public Builder minMembershipCount(long minMembershipCount) {
      this.minMembershipCount = minMembershipCount;
      return this;
    }

    /**
     * Set the href.
     *
     * @param href the href
     * @return the InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref builder
     */
    public Builder href(String href) {
      this.href = href;
      return this;
    }
  }

  protected InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.href,
      "href cannot be null");
    maxMembershipCount = builder.maxMembershipCount;
    minMembershipCount = builder.minMembershipCount;
    href = builder.href;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerScheduledActionByManagerManagerAutoScalePrototypeInstanceGroupManagerScheduledActionManagerAutoScalePrototypeInstanceGroupManagerIdentityByHref builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

