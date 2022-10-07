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

/**
 * InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.
 */
public class InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById extends InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Long maxMembershipCount;
    private Long minMembershipCount;
    private String id;

    /**
     * Instantiates a new Builder from an existing InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById instance.
     *
     * @param instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById the instance to initialize the Builder with
     */
    public Builder(InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototype instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById) {
      this.maxMembershipCount = instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.maxMembershipCount;
      this.minMembershipCount = instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.minMembershipCount;
      this.id = instanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById.
     *
     * @return the new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById instance
     */
    public InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById build() {
      return new InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById(this);
    }

    /**
     * Set the maxMembershipCount.
     *
     * @param maxMembershipCount the maxMembershipCount
     * @return the InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById builder
     */
    public Builder maxMembershipCount(long maxMembershipCount) {
      this.maxMembershipCount = maxMembershipCount;
      return this;
    }

    /**
     * Set the minMembershipCount.
     *
     * @param minMembershipCount the minMembershipCount
     * @return the InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById builder
     */
    public Builder minMembershipCount(long minMembershipCount) {
      this.minMembershipCount = minMembershipCount;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById() { }

  protected InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    maxMembershipCount = builder.maxMembershipCount;
    minMembershipCount = builder.minMembershipCount;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupManagerScheduledActionManagerPrototypeAutoScalePrototypeById builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

