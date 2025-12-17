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
 * InstanceVCPUPrototype.
 */
public class InstanceVCPUPrototype extends GenericModel {

  protected Long percentage;

  /**
   * Builder.
   */
  public static class Builder {
    private Long percentage;

    /**
     * Instantiates a new Builder from an existing InstanceVCPUPrototype instance.
     *
     * @param instanceVcpuPrototype the instance to initialize the Builder with
     */
    private Builder(InstanceVCPUPrototype instanceVcpuPrototype) {
      this.percentage = instanceVcpuPrototype.percentage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceVCPUPrototype.
     *
     * @return the new InstanceVCPUPrototype instance
     */
    public InstanceVCPUPrototype build() {
      return new InstanceVCPUPrototype(this);
    }

    /**
     * Set the percentage.
     *
     * @param percentage the percentage
     * @return the InstanceVCPUPrototype builder
     */
    public Builder percentage(long percentage) {
      this.percentage = percentage;
      return this;
    }
  }

  protected InstanceVCPUPrototype() { }

  protected InstanceVCPUPrototype(Builder builder) {
    percentage = builder.percentage;
  }

  /**
   * New builder.
   *
   * @return a InstanceVCPUPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the percentage.
   *
   * The percentage of VCPU clock cycles allocated to the instance.
   *
   * The virtual server instance `vcpu.percentage` must be `100` when:
   * - The virtual server instance `placement_target` is a dedicated host or dedicated
   *   host group.
   * - The virtual server instance `reservation_affinity.policy` is not `disabled`.
   *
   * If unspecified, the default for `vcpu_percentage` from the profile will be used.
   *
   * @return the percentage
   */
  public Long percentage() {
    return percentage;
  }
}

