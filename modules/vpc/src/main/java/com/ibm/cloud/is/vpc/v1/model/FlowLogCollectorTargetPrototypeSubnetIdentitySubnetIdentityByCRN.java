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
 * FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN.
 */
public class FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN extends FlowLogCollectorTargetPrototypeSubnetIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    /**
     * Instantiates a new Builder from an existing FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN instance.
     *
     * @param flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCrn the instance to initialize the Builder with
     */
    public Builder(FlowLogCollectorTargetPrototypeSubnetIdentity flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCrn) {
      this.crn = flowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCrn.crn;
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
     * Builds a FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN.
     *
     * @return the new FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN instance
     */
    public FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN build() {
      return new FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN() { }

  protected FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a FlowLogCollectorTargetPrototypeSubnetIdentitySubnetIdentityByCRN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

