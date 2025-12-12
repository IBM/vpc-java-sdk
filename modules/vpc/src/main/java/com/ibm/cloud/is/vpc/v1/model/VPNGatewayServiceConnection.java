/*
 * (C) Copyright IBM Corp. 2025.
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
 * VPNGatewayServiceConnection.
 */
public class VPNGatewayServiceConnection extends GenericModel {

  /**
   * The lifecycle state of the VPN gateway service connection.
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
   * The status of this VPN gateway service connection:
   * - `degraded`: operating with compromised performance.
   * - `down`: not operational.
   * - `up`: operating normally.
   */
  public interface Status {
    /** degraded. */
    String DEGRADED = "degraded";
    /** down. */
    String DOWN = "down";
    /** up. */
    String UP = "up";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected VPNGatewayServiceConnectionCreator creator;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<VPNGatewayServiceConnectionLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String status;
  @SerializedName("status_reasons")
  protected List<VPNGatewayServiceConnectionStatusReason> statusReasons;

  protected VPNGatewayServiceConnection() { }

  /**
   * Gets the createdAt.
   *
   * The date and time that this VPN gateway service connection was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the creator.
   *
   * @return the creator
   */
  public VPNGatewayServiceConnectionCreator getCreator() {
    return creator;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this VPN gateway service connection.
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
  public List<VPNGatewayServiceConnectionLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the VPN gateway service connection.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the status.
   *
   * The status of this VPN gateway service connection:
   * - `degraded`: operating with compromised performance.
   * - `down`: not operational.
   * - `up`: operating normally.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current VPN gateway service connection status (if any).
   *
   * @return the statusReasons
   */
  public List<VPNGatewayServiceConnectionStatusReason> getStatusReasons() {
    return statusReasons;
  }
}

