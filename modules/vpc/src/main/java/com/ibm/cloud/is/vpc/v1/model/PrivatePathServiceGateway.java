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
 * PrivatePathServiceGateway.
 */
public class PrivatePathServiceGateway extends GenericModel {

  /**
   * The policy to use for bindings from accounts without an explicit account policy.
   */
  public interface DefaultAccessPolicy {
    /** deny. */
    String DENY = "deny";
    /** permit. */
    String PERMIT = "permit";
    /** review. */
    String REVIEW = "review";
  }

  /**
   * The lifecycle state of the private path service gateway.
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
    /** private_path_service_gateway. */
    String PRIVATE_PATH_SERVICE_GATEWAY = "private_path_service_gateway";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("default_access_policy")
  protected String defaultAccessPolicy;
  @SerializedName("endpoint_gateway_binding_auto_delete")
  protected Boolean endpointGatewayBindingAutoDelete;
  @SerializedName("endpoint_gateway_binding_auto_delete_timeout")
  protected Long endpointGatewayBindingAutoDeleteTimeout;
  @SerializedName("endpoint_gateway_count")
  protected Long endpointGatewayCount;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("load_balancer")
  protected LoadBalancerReference loadBalancer;
  protected String name;
  protected Boolean published;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("service_endpoints")
  protected List<String> serviceEndpoints;
  protected VPCReference vpc;
  @SerializedName("zonal_affinity")
  protected Boolean zonalAffinity;

  protected PrivatePathServiceGateway() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the private path service gateway was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
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
   * Gets the defaultAccessPolicy.
   *
   * The policy to use for bindings from accounts without an explicit account policy.
   *
   * @return the defaultAccessPolicy
   */
  public String getDefaultAccessPolicy() {
    return defaultAccessPolicy;
  }

  /**
   * Gets the endpointGatewayBindingAutoDelete.
   *
   * Indicates whether endpoint gateway bindings will be automatically deleted after
   * `endpoint_gateway_binding_auto_delete_timeout` hours have passed. At present, this is always `true`, but may be
   * modifiable in the future.
   *
   * @return the endpointGatewayBindingAutoDelete
   */
  public Boolean isEndpointGatewayBindingAutoDelete() {
    return endpointGatewayBindingAutoDelete;
  }

  /**
   * Gets the endpointGatewayBindingAutoDeleteTimeout.
   *
   * If `endpoint_gateway_binding_auto_delete` is `true`, the hours after which endpoint gateway bindings will be
   * automatically deleted. If the value is `0`, `abandoned` endpoint gateway bindings will be deleted immediately. At
   * present, this is always set to `0`. This value may be modifiable in the future.
   *
   * @return the endpointGatewayBindingAutoDeleteTimeout
   */
  public Long getEndpointGatewayBindingAutoDeleteTimeout() {
    return endpointGatewayBindingAutoDeleteTimeout;
  }

  /**
   * Gets the endpointGatewayCount.
   *
   * The number of active endpoint gateways using this private path service gateway.
   *
   * @return the endpointGatewayCount
   */
  public Long getEndpointGatewayCount() {
    return endpointGatewayCount;
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
   * Gets the lifecycleState.
   *
   * The lifecycle state of the private path service gateway.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the loadBalancer.
   *
   * The load balancer for this private path service gateway.
   *
   * @return the loadBalancer
   */
  public LoadBalancerReference getLoadBalancer() {
    return loadBalancer;
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
   * Gets the published.
   *
   * Indicates the availability of this private path service gateway
   * - `true`: Any account can request access to this private path service gateway.
   * - `false`: Access is restricted to the account that created this private path service gateway.
   *
   * @return the published
   */
  public Boolean isPublished() {
    return published;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this private path service gateway.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
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
   * Gets the serviceEndpoints.
   *
   * The fully qualified domain names for this private path service gateway. The domains are used for endpoint gateways
   * to connect to the service and are configured in the VPC for each endpoint gateway.
   *
   * @return the serviceEndpoints
   */
  public List<String> getServiceEndpoints() {
    return serviceEndpoints;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this private path service gateway resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zonalAffinity.
   *
   * Indicates whether this private path service gateway has zonal affinity.
   * - `true`:  Traffic to the service from a zone the service resides in will remain in
   *            that zone.
   * - `false`: Traffic to the service from a zone will be load balanced across all zones
   *            in the region the service resides in.
   *
   * @return the zonalAffinity
   */
  public Boolean isZonalAffinity() {
    return zonalAffinity;
  }
}

