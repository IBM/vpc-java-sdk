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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EndpointGatewayResourceBinding.
 */
public class EndpointGatewayResourceBinding extends GenericModel {

  /**
   * The lifecycle state of the resource binding.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** endpoint_gateway_resource_binding. */
    String ENDPOINT_GATEWAY_RESOURCE_BINDING = "endpoint_gateway_resource_binding";
  }

  /**
   * The type of resource binding:
   * - `weak`: The binding is not dependent on the existence of the target resource.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Type {
    /** weak. */
    String WEAK = "weak";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<EndpointGatewayResourceBindingLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("service_endpoint")
  protected String serviceEndpoint;
  protected EndpointGatewayResourceBindingTarget target;
  protected String type;

  protected EndpointGatewayResourceBinding() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the resource binding was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this endpoint gateway resource binding.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this endpoint gateway resource binding.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The reasons for the current `lifecycle_state` (if any).
   *
   * @return the lifecycleReasons
   */
  public List<EndpointGatewayResourceBindingLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the resource binding.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this resource binding. The name is unique across all resource bindings for the endpoint gateway.
   *
   * @return the name
   */
  public String getName() {
    return name;
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

  /**
   * Gets the serviceEndpoint.
   *
   * The fully qualified domain name of the service endpoint for the resource targeted by this resource binding.
   *
   * @return the serviceEndpoint
   */
  public String getServiceEndpoint() {
    return serviceEndpoint;
  }

  /**
   * Gets the target.
   *
   * The target for this endpoint gateway resource binding.
   *
   * @return the target
   */
  public EndpointGatewayResourceBindingTarget getTarget() {
    return target;
  }

  /**
   * Gets the type.
   *
   * The type of resource binding:
   * - `weak`: The binding is not dependent on the existence of the target resource.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

