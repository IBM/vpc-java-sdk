/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * The target to bind this public address range to. If unspecified, the public address range will not be bound to a
 * target at creation.
 */
public class PublicAddressRangeTargetPrototype extends GenericModel {

  protected VPCIdentity vpc;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private VPCIdentity vpc;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing PublicAddressRangeTargetPrototype instance.
     *
     * @param publicAddressRangeTargetPrototype the instance to initialize the Builder with
     */
    private Builder(PublicAddressRangeTargetPrototype publicAddressRangeTargetPrototype) {
      this.vpc = publicAddressRangeTargetPrototype.vpc;
      this.zone = publicAddressRangeTargetPrototype.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpc the vpc
     * @param zone the zone
     */
    public Builder(VPCIdentity vpc, ZoneIdentity zone) {
      this.vpc = vpc;
      this.zone = zone;
    }

    /**
     * Builds a PublicAddressRangeTargetPrototype.
     *
     * @return the new PublicAddressRangeTargetPrototype instance
     */
    public PublicAddressRangeTargetPrototype build() {
      return new PublicAddressRangeTargetPrototype(this);
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the PublicAddressRangeTargetPrototype builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the PublicAddressRangeTargetPrototype builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected PublicAddressRangeTargetPrototype() { }

  protected PublicAddressRangeTargetPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    vpc = builder.vpc;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a PublicAddressRangeTargetPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpc.
   *
   * The VPC to bind this public address range to.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this public address range will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

