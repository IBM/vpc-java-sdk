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
 * The target to bind this public address range to.
 *
 * If the public address range is not currently bound to a target, both `target.vpc` and
 * `target.zone` must be specified.
 *
 * Specify `null` to unbind the public address range from any existing target.
 */
public class PublicAddressRangeTargetPatch extends GenericModel {

  protected VPCIdentity vpc;
  protected ZoneIdentity zone;

  /**
   * Builder.
   */
  public static class Builder {
    private VPCIdentity vpc;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing PublicAddressRangeTargetPatch instance.
     *
     * @param publicAddressRangeTargetPatch the instance to initialize the Builder with
     */
    private Builder(PublicAddressRangeTargetPatch publicAddressRangeTargetPatch) {
      this.vpc = publicAddressRangeTargetPatch.vpc;
      this.zone = publicAddressRangeTargetPatch.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublicAddressRangeTargetPatch.
     *
     * @return the new PublicAddressRangeTargetPatch instance
     */
    public PublicAddressRangeTargetPatch build() {
      return new PublicAddressRangeTargetPatch(this);
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the PublicAddressRangeTargetPatch builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the PublicAddressRangeTargetPatch builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected PublicAddressRangeTargetPatch() { }

  protected PublicAddressRangeTargetPatch(Builder builder) {
    vpc = builder.vpc;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a PublicAddressRangeTargetPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpc.
   *
   * The VPC to bind this public address range to, replacing any existing VPC.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this public address range will reside in, replacing any existing zone.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }
}

