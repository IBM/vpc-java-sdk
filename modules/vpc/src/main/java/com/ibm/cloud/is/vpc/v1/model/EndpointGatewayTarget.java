/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * - EndpointGatewayTargetPrivatePathServiceGatewayReference
 * - EndpointGatewayTargetProviderCloudServiceReference
 * - EndpointGatewayTargetProviderInfrastructureServiceReference
 */
public class EndpointGatewayTarget extends GenericModel {

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
  protected Deleted deleted;
  protected String href;
  protected String id;
  protected String name;
  protected PrivatePathServiceGatewayRemote remote;

  protected EndpointGatewayTarget() { }

  /**
   * Gets the resourceType.
   *
   * The target resource type for this endpoint gateway.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this private path service gateway.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public Deleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The URL for this private path service gateway.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this private path service gateway.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this private path service gateway. The name is unique across all private path service gateways in the
   * VPC.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the remote.
   *
   * If present, this property indicates that the resource associated with this reference
   * is remote and therefore may not be directly retrievable.
   *
   * @return the remote
   */
  public PrivatePathServiceGatewayRemote getRemote() {
    return remote;
  }
}

