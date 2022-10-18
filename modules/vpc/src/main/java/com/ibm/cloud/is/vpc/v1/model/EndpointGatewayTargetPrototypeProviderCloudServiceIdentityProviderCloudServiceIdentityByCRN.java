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
 * EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.
 */
public class EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN extends EndpointGatewayTargetPrototypeProviderCloudServiceIdentity {

  /**
   * The type of target for this endpoint gateway.
   */
  public interface ResourceType {
    /** provider_cloud_service. */
    String PROVIDER_CLOUD_SERVICE = "provider_cloud_service";
    /** provider_infrastructure_service. */
    String PROVIDER_INFRASTRUCTURE_SERVICE = "provider_infrastructure_service";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String resourceType;
    private String crn;

    /**
     * Instantiates a new Builder from an existing EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN instance.
     *
     * @param endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrn the instance to initialize the Builder with
     */
    public Builder(EndpointGatewayTargetPrototypeProviderCloudServiceIdentity endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrn) {
      this.resourceType = endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrn.resourceType;
      this.crn = endpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCrn.crn;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param resourceType the resourceType
     * @param crn the crn
     */
    public Builder(String resourceType, String crn) {
      this.resourceType = resourceType;
      this.crn = crn;
    }

    /**
     * Builds a EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.
     *
     * @return the new EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN instance
     */
    public EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN build() {
      return new EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN(this);
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }
  }

  protected EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN() { }

  protected EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceType,
      "resourceType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    resourceType = builder.resourceType;
    crn = builder.crn;
  }

  /**
   * New builder.
   *
   * @return a EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

