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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstanceGroupMembershipPatch.
 */
public class InstanceGroupMembershipPatch extends GenericModel {

  @SerializedName("delete_instance_on_membership_delete")
  protected Boolean deleteInstanceOnMembershipDelete;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean deleteInstanceOnMembershipDelete;
    private String name;

    /**
     * Instantiates a new Builder from an existing InstanceGroupMembershipPatch instance.
     *
     * @param instanceGroupMembershipPatch the instance to initialize the Builder with
     */
    private Builder(InstanceGroupMembershipPatch instanceGroupMembershipPatch) {
      this.deleteInstanceOnMembershipDelete = instanceGroupMembershipPatch.deleteInstanceOnMembershipDelete;
      this.name = instanceGroupMembershipPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceGroupMembershipPatch.
     *
     * @return the new InstanceGroupMembershipPatch instance
     */
    public InstanceGroupMembershipPatch build() {
      return new InstanceGroupMembershipPatch(this);
    }

    /**
     * Set the deleteInstanceOnMembershipDelete.
     *
     * @param deleteInstanceOnMembershipDelete the deleteInstanceOnMembershipDelete
     * @return the InstanceGroupMembershipPatch builder
     */
    public Builder deleteInstanceOnMembershipDelete(Boolean deleteInstanceOnMembershipDelete) {
      this.deleteInstanceOnMembershipDelete = deleteInstanceOnMembershipDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceGroupMembershipPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected InstanceGroupMembershipPatch() { }

  protected InstanceGroupMembershipPatch(Builder builder) {
    deleteInstanceOnMembershipDelete = builder.deleteInstanceOnMembershipDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a InstanceGroupMembershipPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deleteInstanceOnMembershipDelete.
   *
   * If set to true, when deleting the membership the instance will also be deleted.
   *
   * @return the deleteInstanceOnMembershipDelete
   */
  public Boolean deleteInstanceOnMembershipDelete() {
    return deleteInstanceOnMembershipDelete;
  }

  /**
   * Gets the name.
   *
   * The name for this instance group membership. The name must not be used by another membership for the instance group
   * manager.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the InstanceGroupMembershipPatch.
   *
   * Note that properties of the InstanceGroupMembershipPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstanceGroupMembershipPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

