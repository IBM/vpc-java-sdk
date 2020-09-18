/*
 * (C) Copyright IBM Corp. 2020.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroupMembership.
 */
public class InstanceGroupMembership extends GenericModel {

  /**
   * The status of the instance group membership
   * - `deleting`: Membership is deleting dependent resources
   * - `failed`: Membership was unable to maintain dependent resources
   * - `healthy`: Membership is active and serving in the group
   * - `pending`: Membership is waiting for dependent resources
   * - `unhealthy`: Membership has unhealthy dependent resources.
   */
  public interface Status {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** healthy. */
    String HEALTHY = "healthy";
    /** pending. */
    String PENDING = "pending";
    /** unhealthy. */
    String UNHEALTHY = "unhealthy";
  }

  protected String id;
  protected String href;
  protected String name;
  @SerializedName("delete_instance_on_membership_delete")
  protected Boolean deleteInstanceOnMembershipDelete;
  protected InstanceReference instance;
  @SerializedName("instance_template")
  protected InstanceTemplateReference instanceTemplate;
  @SerializedName("pool_member")
  protected LoadBalancerPoolMemberReference poolMember;
  protected String status;

  /**
   * Gets the id.
   *
   * The unique identifier for this instance group membership.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance group membership.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group membership. Names must be unique within the instance group.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the deleteInstanceOnMembershipDelete.
   *
   * If set to true, when deleting the membership the instance will also be deleted.
   *
   * @return the deleteInstanceOnMembershipDelete
   */
  public Boolean isDeleteInstanceOnMembershipDelete() {
    return deleteInstanceOnMembershipDelete;
  }

  /**
   * Gets the instance.
   *
   * @return the instance
   */
  public InstanceReference getInstance() {
    return instance;
  }

  /**
   * Gets the instanceTemplate.
   *
   * @return the instanceTemplate
   */
  public InstanceTemplateReference getInstanceTemplate() {
    return instanceTemplate;
  }

  /**
   * Gets the poolMember.
   *
   * @return the poolMember
   */
  public LoadBalancerPoolMemberReference getPoolMember() {
    return poolMember;
  }

  /**
   * Gets the status.
   *
   * The status of the instance group membership
   * - `deleting`: Membership is deleting dependent resources
   * - `failed`: Membership was unable to maintain dependent resources
   * - `healthy`: Membership is active and serving in the group
   * - `pending`: Membership is waiting for dependent resources
   * - `unhealthy`: Membership has unhealthy dependent resources.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

