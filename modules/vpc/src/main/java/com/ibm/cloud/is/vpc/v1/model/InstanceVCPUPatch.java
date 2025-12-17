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
 * InstanceVCPUPatch.
 */
public class InstanceVCPUPatch extends GenericModel {

  protected Long percentage;

  /**
   * Builder.
   */
  public static class Builder {
    private Long percentage;

    /**
     * Instantiates a new Builder from an existing InstanceVCPUPatch instance.
     *
     * @param instanceVcpuPatch the instance to initialize the Builder with
     */
    private Builder(InstanceVCPUPatch instanceVcpuPatch) {
      this.percentage = instanceVcpuPatch.percentage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param percentage the percentage
     */
    public Builder(Long percentage) {
      this.percentage = percentage;
    }

    /**
     * Builds a InstanceVCPUPatch.
     *
     * @return the new InstanceVCPUPatch instance
     */
    public InstanceVCPUPatch build() {
      return new InstanceVCPUPatch(this);
    }

    /**
     * Set the percentage.
     *
     * @param percentage the percentage
     * @return the InstanceVCPUPatch builder
     */
    public Builder percentage(long percentage) {
      this.percentage = percentage;
      return this;
    }
  }

  protected InstanceVCPUPatch() { }

  protected InstanceVCPUPatch(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.percentage,
      "percentage cannot be null");
    percentage = builder.percentage;
  }

  /**
   * New builder.
   *
   * @return a InstanceVCPUPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the percentage.
   *
   * The percentage of VCPU time allocated to the virtual server instance.
   *
   * The virtual server instance `vcpu.percentage` must be `100` when:
   * - The virtual server instance `placement_target` is a dedicated host or dedicated
   *   host group.
   * - The virtual server instance `reservation_affinity.policy` is not `disabled`.
   *
   * For this property to be changed, the virtual server instance `status` must be
   * `stopping` or `stopped`.
   *
   * @return the percentage
   */
  public Long percentage() {
    return percentage;
  }
}

