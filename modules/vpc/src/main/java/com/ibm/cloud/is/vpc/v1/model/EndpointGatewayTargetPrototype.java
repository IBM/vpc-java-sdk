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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The target to use for this endpoint gateway. The target:
 * - Must not already be the target of another endpoint gateway in the VPC
 * - Must not have a service endpoint that overlaps with any `service_endpoints` of another
 *   endpoint gateway in the VPC.
 *
 * If `allow_dns_resolution_binding` is `true`, then there must not be another endpoint gateway with
 * `allow_dns_resolution_binding` set to `true` in the [DNS sharing](/docs/vpc?topic=vpc-vpe-dns-sharing) connected
 * topology that:
 * - Has the same `target` as this endpoint gateway
 * - Has `service_endpoints` that overlap with the `service_endpoints` for this endpoint
 *   gateway.
 *
 * Classes which extend this class:
 * - EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypePrivatePathServiceGatewayPrototype
 * - EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderInfrastructureServicePrototype
 * - EndpointGatewayTargetPrototypeEndpointGatewayTargetResourceTypeProviderCloudServicePrototype
 */
public class EndpointGatewayTargetPrototype extends GenericModel {

  /**
   * The target resource type for this endpoint gateway.
   */
  public interface ResourceType {
    /** private_path_service_gateway. */
    String PRIVATE_PATH_SERVICE_GATEWAY = "private_path_service_gateway";
    /** provider_cloud_service. */
    String PROVIDER_CLOUD_SERVICE = "provider_cloud_service";
    /** provider_infrastructure_service. */
    String PROVIDER_INFRASTRUCTURE_SERVICE = "provider_infrastructure_service";
  }

  @SerializedName("resource_type")
  protected String resourceType;
  protected String crn;
  protected String name;

  protected EndpointGatewayTargetPrototype() { }

  /**
   * Gets the resourceType.
   *
   * The target resource type for this endpoint gateway.
   *
   * @return the resourceType
   */
  public String resourceType() {
    return resourceType;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this private path service gateway.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the name.
   *
   * The name of a provider infrastructure service. Must be:
   * - `ibm-ntp-server`: An NTP (Network Time Protocol) server provided by IBM.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

