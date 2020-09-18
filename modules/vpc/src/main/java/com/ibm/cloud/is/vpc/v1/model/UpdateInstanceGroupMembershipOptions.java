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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateInstanceGroupMembership options.
 */
public class UpdateInstanceGroupMembershipOptions extends GenericModel {

  protected String instanceGroupId;
  protected String id;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String id;
    private String name;

    private Builder(UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptions) {
      this.instanceGroupId = updateInstanceGroupMembershipOptions.instanceGroupId;
      this.id = updateInstanceGroupMembershipOptions.id;
      this.name = updateInstanceGroupMembershipOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceGroupId the instanceGroupId
     * @param id the id
     */
    public Builder(String instanceGroupId, String id) {
      this.instanceGroupId = instanceGroupId;
      this.id = id;
    }

    /**
     * Builds a UpdateInstanceGroupMembershipOptions.
     *
     * @return the new UpdateInstanceGroupMembershipOptions instance
     */
    public UpdateInstanceGroupMembershipOptions build() {
      return new UpdateInstanceGroupMembershipOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the UpdateInstanceGroupMembershipOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateInstanceGroupMembershipOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateInstanceGroupMembershipOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected UpdateInstanceGroupMembershipOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    id = builder.id;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a UpdateInstanceGroupMembershipOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceGroupId.
   *
   * The instance group identifier.
   *
   * @return the instanceGroupId
   */
  public String instanceGroupId() {
    return instanceGroupId;
  }

  /**
   * Gets the id.
   *
   * The instance group membership identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group membership. Names must be unique within the instance group.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

