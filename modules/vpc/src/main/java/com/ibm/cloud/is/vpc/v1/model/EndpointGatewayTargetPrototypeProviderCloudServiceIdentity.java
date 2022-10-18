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
 * EndpointGatewayTargetPrototypeProviderCloudServiceIdentity.
 *
 * Classes which extend this class:
 * - EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN
 */
public class EndpointGatewayTargetPrototypeProviderCloudServiceIdentity extends EndpointGatewayTargetPrototype {

  /**
   * The type of target for this endpoint gateway.
   */
  public interface ResourceType {
    /** provider_cloud_service. */
    String PROVIDER_CLOUD_SERVICE = "provider_cloud_service";
    /** provider_infrastructure_service. */
    String PROVIDER_INFRASTRUCTURE_SERVICE = "provider_infrastructure_service";
  }


  protected EndpointGatewayTargetPrototypeProviderCloudServiceIdentity() { }
}

