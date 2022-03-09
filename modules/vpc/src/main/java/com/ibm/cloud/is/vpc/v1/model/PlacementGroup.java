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
 * PlacementGroup.
 */
public class PlacementGroup extends GenericModel {

  /**
   * The lifecycle state of the placement group.
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
    /** placement_group. */
    String PLACEMENT_GROUP = "placement_group";
  }

  /**
   * The strategy for this placement group
   * - `host_spread`: place on different compute hosts
   * - `power_spread`: place on compute hosts that use different power sources
   *
   * The enumerated values for this property may expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the placement group on which the
   * unexpected strategy was encountered.
   */
  public interface Strategy {
    /** host_spread. */
    String HOST_SPREAD = "host_spread";
    /** power_spread. */
    String POWER_SPREAD = "power_spread";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String strategy;

  /**
   * Gets the createdAt.
   *
   * The date and time that the placement group was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this placement group.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this placement group.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this placement group.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the placement group.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this placement group.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this placement group.
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
   * Gets the strategy.
   *
   * The strategy for this placement group
   * - `host_spread`: place on different compute hosts
   * - `power_spread`: place on compute hosts that use different power sources
   *
   * The enumerated values for this property may expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the placement group on which the
   * unexpected strategy was encountered.
   *
   * @return the strategy
   */
  public String getStrategy() {
    return strategy;
  }
}

