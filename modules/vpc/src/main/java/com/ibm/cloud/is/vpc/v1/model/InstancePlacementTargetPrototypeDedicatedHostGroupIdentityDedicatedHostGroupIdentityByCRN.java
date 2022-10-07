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
 * InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN.
 */
public class InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN extends InstancePlacementTargetPrototypeDedicatedHostGroupIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    /**
     * Instantiates a new Builder from an existing InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN instance.
     *
     * @param instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCrn the instance to initialize the Builder with
     */
    public Builder(InstancePlacementTargetPrototypeDedicatedHostGroupIdentity instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCrn) {
      this.crn = instancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCrn.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN.
     *
     * @return the new InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN instance
     */
    public InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN build() {
      return new InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN() { }

  protected InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a InstancePlacementTargetPrototypeDedicatedHostGroupIdentityDedicatedHostGroupIdentityByCRN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

