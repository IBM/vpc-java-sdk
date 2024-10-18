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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * PrivatePathServiceGatewayEndpointGatewayBinding.
 */
public class PrivatePathServiceGatewayEndpointGatewayBinding extends GenericModel {

  /**
   * The lifecycle state of the endpoint gateway binding.
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
    /** private_path_service_gateway_endpoint_gateway_binding. */
    String PRIVATE_PATH_SERVICE_GATEWAY_ENDPOINT_GATEWAY_BINDING = "private_path_service_gateway_endpoint_gateway_binding";
  }

  /**
   * The status of the endpoint gateway binding:
   * - `abandoned`: endpoint gateway binding is inactive, awaiting deletion.
   * - `denied`: endpoint gateway binding was denied
   * - `expired`: endpoint gateway binding has expired
   * - `pending`: endpoint gateway binding is awaiting review
   * - `permitted`: endpoint gateway binding was permitted
   *
   * An endpoint gateway binding will be automatically deleted when its associated endpoint gateway is deleted.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** abandoned. */
    String ABANDONED = "abandoned";
    /** denied. */
    String DENIED = "denied";
    /** expired. */
    String EXPIRED = "expired";
    /** pending. */
    String PENDING = "pending";
    /** permitted. */
    String PERMITTED = "permitted";
  }

  protected AccountReference account;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("expiration_at")
  protected Date expirationAt;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;

  protected PrivatePathServiceGatewayEndpointGatewayBinding() { }

  /**
   * Gets the account.
   *
   * The account that created the endpoint gateway.
   *
   * @return the account
   */
  public AccountReference getAccount() {
    return account;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the endpoint gateway binding was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the expirationAt.
   *
   * The expiration date and time for the endpoint gateway binding. At binding creation, this property will be set to 14
   * days after the creation time, and will remain while the `status` of the binding is `pending`. If the date and time
   * are reached while the binding is still `pending`, the binding will transition to `expired`.
   *
   * This property will be present if the `status` is `pending` or `expired`.
   *
   * @return the expirationAt
   */
  public Date getExpirationAt() {
    return expirationAt;
  }

  /**
   * Gets the href.
   *
   * The URL for this endpoint gateway binding.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this endpoint gateway binding.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the endpoint gateway binding.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
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
   * Gets the status.
   *
   * The status of the endpoint gateway binding:
   * - `abandoned`: endpoint gateway binding is inactive, awaiting deletion.
   * - `denied`: endpoint gateway binding was denied
   * - `expired`: endpoint gateway binding has expired
   * - `pending`: endpoint gateway binding is awaiting review
   * - `permitted`: endpoint gateway binding was permitted
   *
   * An endpoint gateway binding will be automatically deleted when its associated endpoint gateway is deleted.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

