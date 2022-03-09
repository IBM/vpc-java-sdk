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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The target for this endpoint gateway.
 *
 * Classes which extend this class:
 * - EndpointGatewayTargetPrototypeProviderCloudServiceIdentity
 * - EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentity
 */
public class EndpointGatewayTargetPrototype extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "resource_type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("provider_cloud_service", EndpointGatewayTargetPrototypeProviderCloudServiceIdentity.class);
    discriminatorMapping.put("provider_infrastructure_service", EndpointGatewayTargetPrototypeProviderInfrastructureServiceIdentity.class);
  }

  /**
   * The type of target for this endpoint gateway.
   */
  public interface ResourceType {
    /** provider_cloud_service. */
    String PROVIDER_CLOUD_SERVICE = "provider_cloud_service";
    /** provider_infrastructure_service. */
    String PROVIDER_INFRASTRUCTURE_SERVICE = "provider_infrastructure_service";
  }

  @SerializedName("resource_type")
  protected String resourceType;
  protected String crn;
  protected String name;

  protected EndpointGatewayTargetPrototype() {
  }

  /**
   * Gets the resourceType.
   *
   * The type of target for this endpoint gateway.
   *
   * @return the resourceType
   */
  public String resourceType() {
    return resourceType;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this provider cloud service, or the CRN for the user's instance of a provider cloud service.
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

