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
 * - EndpointGatewayTargetProviderCloudServiceReference
 * - EndpointGatewayTargetProviderInfrastructureServiceReference
 */
public class EndpointGatewayTarget extends GenericModel {

  /**
   * The type of target.
   */
  public interface ResourceType {
    /** provider_cloud_service. */
    String PROVIDER_CLOUD_SERVICE = "provider_cloud_service";
  }

  protected String crn;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String name;

  protected EndpointGatewayTarget() { }

  /**
   * Gets the crn.
   *
   * The CRN for this provider cloud service, or the CRN for the user's instance of a provider cloud service.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the resourceType.
   *
   * The type of target.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the name.
   *
   * The name of a provider infrastructure service. Must be:
   * - `ibm-ntp-server`: An NTP (Network Time Protocol) server provided by IBM.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

