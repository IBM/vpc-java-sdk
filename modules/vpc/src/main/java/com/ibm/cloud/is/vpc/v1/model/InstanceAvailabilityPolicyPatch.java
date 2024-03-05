/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * InstanceAvailabilityPolicyPatch.
 */
public class InstanceAvailabilityPolicyPatch extends GenericModel {

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
     * Instantiates a new Builder from an existing InstanceAvailabilityPolicyPatch instance.
     *
     * @param instanceAvailabilityPolicyPatch the instance to initialize the Builder with
     */
    private Builder(InstanceAvailabilityPolicyPatch instanceAvailabilityPolicyPatch) {
      this.hostFailure = instanceAvailabilityPolicyPatch.hostFailure;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceAvailabilityPolicyPatch.
     *
     * @return the new InstanceAvailabilityPolicyPatch instance
     */
    public InstanceAvailabilityPolicyPatch build() {
      return new InstanceAvailabilityPolicyPatch(this);
    }

    /**
     * Set the hostFailure.
     *
     * @param hostFailure the hostFailure
     * @return the InstanceAvailabilityPolicyPatch builder
     */
    public Builder hostFailure(String hostFailure) {
      this.hostFailure = hostFailure;
      return this;
    }
  }

  protected InstanceAvailabilityPolicyPatch() { }

  protected InstanceAvailabilityPolicyPatch(Builder builder) {
    hostFailure = builder.hostFailure;
  }

  /**
   * New builder.
   *
   * @return a InstanceAvailabilityPolicyPatch builder
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

