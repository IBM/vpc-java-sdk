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

/**
 * The name of this provider infrastructure service.
 */
public class EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype extends EndpointGatewayTargetPrototype {

  /**
   * The target resource type for this endpoint gateway.
   */
  public interface ResourceType {
    /** provider_infrastructure_service. */
    String PROVIDER_INFRASTRUCTURE_SERVICE = "provider_infrastructure_service";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String resourceType;

    /**
     * Instantiates a new Builder from an existing EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype instance.
     *
     * @param endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype the instance to initialize the Builder with
     */
    public Builder(EndpointGatewayTargetPrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype) {
      this.name = endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype.name;
      this.resourceType = endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype.resourceType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param resourceType the resourceType
     */
    public Builder(String name, String resourceType) {
      this.name = name;
      this.resourceType = resourceType;
    }

    /**
     * Builds a EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype.
     *
     * @return the new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype instance
     */
    public EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype build() {
      return new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }

  protected EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype() { }

  protected EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceType,
      "resourceType cannot be null");
    name = builder.name;
    resourceType = builder.resourceType;
  }

  /**
   * New builder.
   *
   * @return a EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

