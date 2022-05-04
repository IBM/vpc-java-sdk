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
 * The name of this provider infrastructure service.
 */
public class EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName extends EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentity {

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
    private String name;

    public Builder(EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentity endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName) {
      this.resourceType = endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName.resourceType;
      this.name = endpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName.name;
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
     * @param name the name
     */
    public Builder(String resourceType, String name) {
      this.resourceType = resourceType;
      this.name = name;
    }

    /**
     * Builds a EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName.
     *
     * @return the new EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName instance
     */
    public EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName build() {
      return new EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName(this);
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceType,
      "resourceType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    resourceType = builder.resourceType;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentityProviderInfrastructureServiceIdentityByName builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

