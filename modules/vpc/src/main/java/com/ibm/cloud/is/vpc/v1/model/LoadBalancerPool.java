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
 * LoadBalancerPool.
 */
public class LoadBalancerPool extends GenericModel {

  /**
   * The load balancing algorithm.
   */
  public interface Algorithm {
    /** least_connections. */
    String LEAST_CONNECTIONS = "least_connections";
    /** round_robin. */
    String ROUND_ROBIN = "round_robin";
    /** weighted_round_robin. */
    String WEIGHTED_ROUND_ROBIN = "weighted_round_robin";
  }

  /**
   * The protocol used for this load balancer pool.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the pool on which the
   * unexpected property value was encountered.
   */
  public interface Protocol {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }

  /**
   * The provisioning status of this pool.
   */
  public interface ProvisioningStatus {
    /** active. */
    String ACTIVE = "active";
    /** create_pending. */
    String CREATE_PENDING = "create_pending";
    /** delete_pending. */
    String DELETE_PENDING = "delete_pending";
    /** failed. */
    String FAILED = "failed";
    /** maintenance_pending. */
    String MAINTENANCE_PENDING = "maintenance_pending";
    /** update_pending. */
    String UPDATE_PENDING = "update_pending";
  }

  /**
   * The PROXY protocol setting for this pool:
   * - `v1`: Enabled with version 1 (human-readable header format)
   * - `v2`: Enabled with version 2 (binary header format)
   * - `disabled`: Disabled
   *
   * Supported by load balancers in the `application` family (otherwise always `disabled`).
   */
  public interface ProxyProtocol {
    /** disabled. */
    String DISABLED = "disabled";
    /** v1. */
    String V1 = "v1";
    /** v2. */
    String V2 = "v2";
  }

  protected String algorithm;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("health_monitor")
  protected LoadBalancerPoolHealthMonitor healthMonitor;
  protected String href;
  protected String id;
  @SerializedName("instance_group")
  protected InstanceGroupReference instanceGroup;
  protected List<LoadBalancerPoolMemberReference> members;
  protected String name;
  protected String protocol;
  @SerializedName("provisioning_status")
  protected String provisioningStatus;
  @SerializedName("proxy_protocol")
  protected String proxyProtocol;
  @SerializedName("session_persistence")
  protected LoadBalancerPoolSessionPersistence sessionPersistence;

  /**
   * Gets the algorithm.
   *
   * The load balancing algorithm.
   *
   * @return the algorithm
   */
  public String getAlgorithm() {
    return algorithm;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this pool was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the healthMonitor.
   *
   * The health monitor of this pool.
   *
   * @return the healthMonitor
   */
  public LoadBalancerPoolHealthMonitor getHealthMonitor() {
    return healthMonitor;
  }

  /**
   * Gets the href.
   *
   * The pool's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer pool.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the instanceGroup.
   *
   * The instance group that is managing this pool.
   *
   * @return the instanceGroup
   */
  public InstanceGroupReference getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Gets the members.
   *
   * The backend server members of the pool.
   *
   * @return the members
   */
  public List<LoadBalancerPoolMemberReference> getMembers() {
    return members;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this load balancer pool.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the protocol.
   *
   * The protocol used for this load balancer pool.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the pool on which the
   * unexpected property value was encountered.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this pool.
   *
   * @return the provisioningStatus
   */
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  /**
   * Gets the proxyProtocol.
   *
   * The PROXY protocol setting for this pool:
   * - `v1`: Enabled with version 1 (human-readable header format)
   * - `v2`: Enabled with version 2 (binary header format)
   * - `disabled`: Disabled
   *
   * Supported by load balancers in the `application` family (otherwise always `disabled`).
   *
   * @return the proxyProtocol
   */
  public String getProxyProtocol() {
    return proxyProtocol;
  }

  /**
   * Gets the sessionPersistence.
   *
   * The session persistence of this pool.
   *
   * The enumerated values for this property are expected to expand in the future. When
   * processing this property, check for and log unknown values. Optionally halt
   * processing and surface the error, or bypass the pool on which the unexpected
   * property value was encountered.
   *
   * @return the sessionPersistence
   */
  public LoadBalancerPoolSessionPersistence getSessionPersistence() {
    return sessionPersistence;
  }
}

