/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * InstanceGroupMembershipReferenceInstanceContext.
 */
public class InstanceGroupMembershipReferenceInstanceContext extends GenericModel {

  protected Deleted deleted;
  protected String href;
  protected String id;
  @SerializedName("instance_group")
  protected InstanceGroupReference instanceGroup;
  protected String name;

  protected InstanceGroupMembershipReferenceInstanceContext() { }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public Deleted getDeleted() {
    return deleted;
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
   * Gets the instanceGroup.
   *
   * The instance group associated with this membership.
   *
   * @return the instanceGroup
   */
  public InstanceGroupReference getInstanceGroup() {
    return instanceGroup;
  }

  /**
   * Gets the name.
   *
   * The name for this instance group membership. The name is unique across all memberships for the instance group.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

