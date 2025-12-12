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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * PublicAddressRange.
 */
public class PublicAddressRange extends GenericModel {

  /**
   * The lifecycle state of the public address range.
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
    /** public_address_range. */
    String PUBLIC_ADDRESS_RANGE = "public_address_range";
  }

  protected String cidr;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String href;
  protected String id;
  @SerializedName("ipv4_address_count")
  protected Long ipv4AddressCount;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected PublicAddressRangeTarget target;

  protected PublicAddressRange() { }

  /**
   * Gets the cidr.
   *
   * The public IPv4 range, expressed in CIDR format.
   *
   * @return the cidr
   */
  public String getCidr() {
    return cidr;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the public address range was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this public address range.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this public address range.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this public address range.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ipv4AddressCount.
   *
   * The number of IPv4 addresses in this public address range.
   *
   * @return the ipv4AddressCount
   */
  public Long getIpv4AddressCount() {
    return ipv4AddressCount;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the public address range.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The name for this public address range. The name is unique across all public address ranges in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this public address range.
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
   * Gets the target.
   *
   * The target this public address range is bound to.
   *
   * If absent, this pubic address range is not bound to a target.
   *
   * The target resources supported by this property is expected to
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future. Future
   * targets may omit the `vpc` property.
   *
   * @return the target
   */
  public PublicAddressRangeTarget getTarget() {
    return target;
  }
}

