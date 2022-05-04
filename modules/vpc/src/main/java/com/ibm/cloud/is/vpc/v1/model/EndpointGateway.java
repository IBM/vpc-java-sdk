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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EndpointGateway.
 */
public class EndpointGateway extends GenericModel {

  /**
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
   */
  public interface HealthState {
    /** degraded. */
    String DEGRADED = "degraded";
    /** faulted. */
    String FAULTED = "faulted";
    /** inapplicable. */
    String INAPPLICABLE = "inapplicable";
    /** ok. */
    String OK = "ok";
  }

  /**
   * The lifecycle state of the endpoint gateway.
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
    /** endpoint_gateway. */
    String ENDPOINT_GATEWAY = "endpoint_gateway";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  protected List<ReservedIPReference> ips;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("security_groups")
  protected List<SecurityGroupReference> securityGroups;
  @SerializedName("service_endpoint")
  protected String serviceEndpoint;
  @SerializedName("service_endpoints")
  protected List<String> serviceEndpoints;
  protected EndpointGatewayTarget target;
  protected VPCReference vpc;

  /**
   * Gets the createdAt.
   *
   * The date and time that the endpoint gateway was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

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
   * Gets the healthState.
   *
   * The health of this resource.
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle state. A resource with a
   * lifecycle state of `failed` or `deleting` will have a health state of `inapplicable`. A `pending` resource may also
   * have this state.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
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
   * Gets the ips.
   *
   * The reserved IPs bound to this endpoint gateway.
   *
   * @return the ips
   */
  public List<ReservedIPReference> getIps() {
    return ips;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the endpoint gateway.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this endpoint gateway.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this endpoint gateway.
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
   * Gets the securityGroups.
   *
   * The security groups targeting this endpoint gateway.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupReference> getSecurityGroups() {
    return securityGroups;
  }

  /**
   * Gets the serviceEndpoint.
   *
   * The fully qualified domain name for the target service.
   *
   * @return the serviceEndpoint
   */
  public String getServiceEndpoint() {
    return serviceEndpoint;
  }

  /**
   * Gets the serviceEndpoints.
   *
   * The fully qualified domain names for the target service.
   *
   * @return the serviceEndpoints
   */
  public List<String> getServiceEndpoints() {
    return serviceEndpoints;
  }

  /**
   * Gets the target.
   *
   * The target for this endpoint gateway.
   *
   * @return the target
   */
  public EndpointGatewayTarget getTarget() {
    return target;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this endpoint gateway is serving.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }
}

