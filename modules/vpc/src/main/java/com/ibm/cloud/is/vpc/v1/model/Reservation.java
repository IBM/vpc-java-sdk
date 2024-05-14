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
 * Reservation.
 */
public class Reservation extends GenericModel {

  /**
   * The affinity policy to use for this reservation:
   * - `restricted`: The reservation must be manually requested
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface AffinityPolicy {
    /** restricted. */
    String RESTRICTED = "restricted";
  }

  /**
   * The lifecycle state of this reservation.
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
    /** reservation. */
    String RESERVATION = "reservation";
  }

  /**
   * The status of the reservation.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** activating. */
    String ACTIVATING = "activating";
    /** active. */
    String ACTIVE = "active";
    /** deactivating. */
    String DEACTIVATING = "deactivating";
    /** expired. */
    String EXPIRED = "expired";
    /** failed. */
    String FAILED = "failed";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  @SerializedName("affinity_policy")
  protected String affinityPolicy;
  protected ReservationCapacity capacity;
  @SerializedName("committed_use")
  protected ReservationCommittedUse committedUse;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  protected ReservationProfile profile;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("status_reasons")
  protected List<ReservationStatusReason> statusReasons;
  protected ZoneReference zone;

  protected Reservation() { }

  /**
   * Gets the affinityPolicy.
   *
   * The affinity policy to use for this reservation:
   * - `restricted`: The reservation must be manually requested
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the affinityPolicy
   */
  public String getAffinityPolicy() {
    return affinityPolicy;
  }

  /**
   * Gets the capacity.
   *
   * The capacity configuration for this reservation
   *
   * If absent, this reservation has no assigned capacity.
   *
   * @return the capacity
   */
  public ReservationCapacity getCapacity() {
    return capacity;
  }

  /**
   * Gets the committedUse.
   *
   * The committed use configuration for this reservation.
   *
   * If absent, this reservation has no commitment for use.
   *
   * @return the committedUse
   */
  public ReservationCommittedUse getCommittedUse() {
    return committedUse;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the reservation was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this reservation.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this reservation.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this reservation.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of this reservation.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this reservation. The name is unique across all reservations in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) for this reservation.
   *
   * @return the profile
   */
  public ReservationProfile getProfile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this reservation.
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
   * Gets the status.
   *
   * The status of the reservation.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current status (if any).
   *
   * @return the statusReasons
   */
  public List<ReservationStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the zone.
   *
   * The zone for this reservation.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

