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
 * EndpointGatewayReferenceRemote.
 */
public class EndpointGatewayReferenceRemote extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** endpoint_gateway. */
    String ENDPOINT_GATEWAY = "endpoint_gateway";
  }

  protected String crn;
  protected String href;
  protected String id;
  protected String name;
  protected EndpointGatewayRemote remote;
  @SerializedName("resource_type")
  protected String resourceType;

  protected EndpointGatewayReferenceRemote() { }

  /**
   * Gets the crn.
   *
   * The CRN for this endpoint gateway.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this endpoint gateway.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this endpoint gateway.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this endpoint gateway. The name is unique across all endpoint gateways in the VPC.
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
  public EndpointGatewayRemote getRemote() {
    return remote;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }
}

