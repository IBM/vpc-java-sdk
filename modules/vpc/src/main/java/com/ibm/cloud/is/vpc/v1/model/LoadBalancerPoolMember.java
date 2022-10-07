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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerPoolMember.
 */
public class LoadBalancerPoolMember extends GenericModel {

  /**
   * Health of the server member in the pool.
   */
  public interface Health {
    /** faulted. */
    String FAULTED = "faulted";
    /** ok. */
    String OK = "ok";
    /** unknown. */
    String UNKNOWN = "unknown";
  }

  /**
   * The provisioning status of this member
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the pool member on which
   * the unexpected property value was encountered.
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
    /** update_pending. */
    String UPDATE_PENDING = "update_pending";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String health;
  protected String href;
  protected String id;
  protected Long port;
  @SerializedName("provisioning_status")
  protected String provisioningStatus;
  protected LoadBalancerPoolMemberTarget target;
  protected Long weight;

  protected LoadBalancerPoolMember() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that this member was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the health.
   *
   * Health of the server member in the pool.
   *
   * @return the health
   */
  public String getHealth() {
    return health;
  }

  /**
   * Gets the href.
   *
   * The member's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer pool member.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the port.
   *
   * The port the member will receive load balancer traffic on. Applies only to load balancer traffic received on a
   * listener with a single port. (If the traffic is received on a listener with a port range, the member will receive
   * the traffic on the same port the listener received it on.)
   *
   * This port will also be used for health checks unless the `port` property of
   * `health_monitor` property is specified.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this member
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the pool member on which
   * the unexpected property value was encountered.
   *
   * @return the provisioningStatus
   */
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  /**
   * Gets the target.
   *
   * The pool member target. Load balancers in the `network` family support virtual server
   * instances. Load balancers in the `application` family support IP addresses. If the load
   * balancer has route mode enabled, the member must be in a zone the load balancer has a
   * subnet in.
   *
   * @return the target
   */
  public LoadBalancerPoolMemberTarget getTarget() {
    return target;
  }

  /**
   * Gets the weight.
   *
   * Weight of the server member. Applicable only if the pool algorithm is
   * `weighted_round_robin`.
   *
   * @return the weight
   */
  public Long getWeight() {
    return weight;
  }
}

