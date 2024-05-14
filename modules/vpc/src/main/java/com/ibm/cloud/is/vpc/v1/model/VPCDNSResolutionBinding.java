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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPCDNSResolutionBinding.
 */
public class VPCDNSResolutionBinding extends GenericModel {

  /**
   * The health of this resource:
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle
   *    state. A resource with a lifecycle state of `failed` or `deleting` will have a
   *    health state of `inapplicable`. A `pending` resource may also have this state.
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
   * The lifecycle state of the DNS resolution binding.
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
    /** vpc_dns_resolution_binding. */
    String VPC_DNS_RESOLUTION_BINDING = "vpc_dns_resolution_binding";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("endpoint_gateways")
  protected List<EndpointGatewayReferenceRemote> endpointGateways;
  @SerializedName("health_reasons")
  protected List<VPCDNSResolutionBindingHealthReason> healthReasons;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  protected VPCReferenceRemote vpc;

  protected VPCDNSResolutionBinding() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that the DNS resolution binding was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the endpointGateways.
   *
   * The endpoint gateways that have `allow_dns_resolution_binding` set to `true` and reside in the VPC that has
   * `dns.enable_hub` set to `false`.
   *
   * The endpoint gateways may be remote and therefore may not be directly retrievable.
   *
   * @return the endpointGateways
   */
  public List<EndpointGatewayReferenceRemote> getEndpointGateways() {
    return endpointGateways;
  }

  /**
   * Gets the healthReasons.
   *
   * The reasons for the current `health_state` (if any).
   *
   * @return the healthReasons
   */
  public List<VPCDNSResolutionBindingHealthReason> getHealthReasons() {
    return healthReasons;
  }

  /**
   * Gets the healthState.
   *
   * The health of this resource:
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle
   *    state. A resource with a lifecycle state of `failed` or `deleting` will have a
   *    health state of `inapplicable`. A `pending` resource may also have this state.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the href.
   *
   * The URL for this DNS resolution binding.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this DNS resolution binding.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the DNS resolution binding.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this DNS resolution binding. The name is unique across all DNS resolution bindings for the VPC.
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
   * Gets the vpc.
   *
   * The VPC bound to for DNS resolution.
   *
   * The VPC may be remote and therefore may not be directly retrievable.
   *
   * @return the vpc
   */
  public VPCReferenceRemote getVpc() {
    return vpc;
  }
}

