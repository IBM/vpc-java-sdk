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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceAvailabilityPrototype.
 */
public class InstanceAvailabilityPrototype extends GenericModel {

  /**
   * The availability class for the virtual server instance:
   * - `spot`: The virtual server instance may be preempted.
   * - `standard`: The virtual server instance will not be preempted.
   *
   * If `spot` is specified, the virtual server instance:
   * - `reservation_affinity.policy` must be `disabled`
   * - `placement_target` must not specify a dedicated host or dedicated host group.
   *
   * If unspecified, the default for `availability_class` from the profile will be used.
   */
  public interface XClass {
    /** spot. */
    String SPOT = "spot";
    /** standard. */
    String STANDARD = "standard";
  }

  @SerializedName("class")
  protected String xClass;

  /**
   * Builder.
   */
  public static class Builder {
    private String xClass;

    /**
     * Instantiates a new Builder from an existing InstanceAvailabilityPrototype instance.
     *
     * @param instanceAvailabilityPrototype the instance to initialize the Builder with
     */
    private Builder(InstanceAvailabilityPrototype instanceAvailabilityPrototype) {
      this.xClass = instanceAvailabilityPrototype.xClass;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceAvailabilityPrototype.
     *
     * @return the new InstanceAvailabilityPrototype instance
     */
    public InstanceAvailabilityPrototype build() {
      return new InstanceAvailabilityPrototype(this);
    }

    /**
     * Set the xClass.
     *
     * @param xClass the xClass
     * @return the InstanceAvailabilityPrototype builder
     */
    public Builder xClass(String xClass) {
      this.xClass = xClass;
      return this;
    }
  }

  protected InstanceAvailabilityPrototype() { }

  protected InstanceAvailabilityPrototype(Builder builder) {
    xClass = builder.xClass;
  }

  /**
   * New builder.
   *
   * @return a InstanceAvailabilityPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xClass.
   *
   * The availability class for the virtual server instance:
   * - `spot`: The virtual server instance may be preempted.
   * - `standard`: The virtual server instance will not be preempted.
   *
   * If `spot` is specified, the virtual server instance:
   * - `reservation_affinity.policy` must be `disabled`
   * - `placement_target` must not specify a dedicated host or dedicated host group.
   *
   * If unspecified, the default for `availability_class` from the profile will be used.
   *
   * @return the xClass
   */
  public String xClass() {
    return xClass;
  }
}

