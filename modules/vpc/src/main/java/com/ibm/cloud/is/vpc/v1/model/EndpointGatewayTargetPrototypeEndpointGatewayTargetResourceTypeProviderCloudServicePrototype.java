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
 * EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.
 */
public class EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype extends EndpointGatewayTargetPrototype {

  /**
   * The target resource type for this endpoint gateway.
   */
  public interface ResourceType {
    /** provider_cloud_service. */
    String PROVIDER_CLOUD_SERVICE = "provider_cloud_service";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String resourceType;

    /**
     * Instantiates a new Builder from an existing EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype instance.
     *
     * @param endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype the instance to initialize the Builder with
     */
    public Builder(EndpointGatewayTargetPrototype endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype) {
      this.crn = endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.crn;
      this.resourceType = endpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.resourceType;
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
     * @param resourceType the resourceType
     */
    public Builder(String crn, String resourceType) {
      this.crn = crn;
      this.resourceType = resourceType;
    }

    /**
     * Builds a EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype.
     *
     * @return the new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype instance
     */
    public EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype build() {
      return new EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the resourceType.
     *
     * @param resourceType the resourceType
     * @return the EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype builder
     */
    public Builder resourceType(String resourceType) {
      this.resourceType = resourceType;
      return this;
    }
  }

  protected EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype() { }

  protected EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.resourceType,
      "resourceType cannot be null");
    crn = builder.crn;
    resourceType = builder.resourceType;
  }

  /**
   * New builder.
   *
   * @return a EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

