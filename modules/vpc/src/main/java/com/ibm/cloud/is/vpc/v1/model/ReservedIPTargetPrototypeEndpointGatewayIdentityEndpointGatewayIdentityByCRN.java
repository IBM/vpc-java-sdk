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
 * ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN.
 */
public class ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN extends ReservedIPTargetPrototypeEndpointGatewayIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String crn;

    public Builder(ReservedIPTargetPrototypeEndpointGatewayIdentity reservedIpTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCrn) {
      this.crn = reservedIpTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCrn.crn;
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
     * Builds a ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN.
     *
     * @return the new ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN instance
     */
    public ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN build() {
      return new ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a ReservedIPTargetPrototypeEndpointGatewayIdentityEndpointGatewayIdentityByCRN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

