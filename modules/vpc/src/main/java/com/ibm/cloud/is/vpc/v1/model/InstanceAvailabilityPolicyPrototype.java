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
 * InstanceAvailabilityPolicyPrototype.
 */
public class InstanceAvailabilityPolicyPrototype extends GenericModel {

  /**
   * The action to perform if the compute host experiences a failure.
   * - `restart`: Automatically restart the virtual server instance after host failure
   * - `stop`: Leave the virtual server instance stopped after host failure.
   */
  public interface HostFailure {
    /** restart. */
    String RESTART = "restart";
    /** stop. */
    String STOP = "stop";
  }

  @SerializedName("host_failure")
  protected String hostFailure;

  /**
   * Builder.
   */
  public static class Builder {
    private String hostFailure;

    /**
     * Instantiates a new Builder from an existing InstanceAvailabilityPolicyPrototype instance.
     *
     * @param instanceAvailabilityPolicyPrototype the instance to initialize the Builder with
     */
    private Builder(InstanceAvailabilityPolicyPrototype instanceAvailabilityPolicyPrototype) {
      this.hostFailure = instanceAvailabilityPolicyPrototype.hostFailure;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceAvailabilityPolicyPrototype.
     *
     * @return the new InstanceAvailabilityPolicyPrototype instance
     */
    public InstanceAvailabilityPolicyPrototype build() {
      return new InstanceAvailabilityPolicyPrototype(this);
    }

    /**
     * Set the hostFailure.
     *
     * @param hostFailure the hostFailure
     * @return the InstanceAvailabilityPolicyPrototype builder
     */
    public Builder hostFailure(String hostFailure) {
      this.hostFailure = hostFailure;
      return this;
    }
  }

  protected InstanceAvailabilityPolicyPrototype() { }

  protected InstanceAvailabilityPolicyPrototype(Builder builder) {
    hostFailure = builder.hostFailure;
  }

  /**
   * New builder.
   *
   * @return a InstanceAvailabilityPolicyPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hostFailure.
   *
   * The action to perform if the compute host experiences a failure.
   * - `restart`: Automatically restart the virtual server instance after host failure
   * - `stop`: Leave the virtual server instance stopped after host failure.
   *
   * @return the hostFailure
   */
  public String hostFailure() {
    return hostFailure;
  }
}

