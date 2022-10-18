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
 * EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById.
 */
public class EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById extends EndpointGatewayReservedIPReservedIPIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById instance.
     *
     * @param endpointGatewayReservedIpReservedIpIdentityReservedIpIdentityById the instance to initialize the Builder with
     */
    public Builder(EndpointGatewayReservedIPReservedIPIdentity endpointGatewayReservedIpReservedIpIdentityReservedIpIdentityById) {
      this.id = endpointGatewayReservedIpReservedIpIdentityReservedIpIdentityById.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById.
     *
     * @return the new EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById instance
     */
    public EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById build() {
      return new EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById() { }

  protected EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a EndpointGatewayReservedIPReservedIPIdentityReservedIPIdentityById builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

