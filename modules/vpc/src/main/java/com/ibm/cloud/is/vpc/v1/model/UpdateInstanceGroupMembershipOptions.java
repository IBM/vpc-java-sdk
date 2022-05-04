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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateInstanceGroupMembership options.
 */
public class UpdateInstanceGroupMembershipOptions extends GenericModel {

  protected String instanceGroupId;
  protected String id;
  protected Map<String, Object> instanceGroupMembershipPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String id;
    private Map<String, Object> instanceGroupMembershipPatch;

    private Builder(UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptions) {
      this.instanceGroupId = updateInstanceGroupMembershipOptions.instanceGroupId;
      this.id = updateInstanceGroupMembershipOptions.id;
      this.instanceGroupMembershipPatch = updateInstanceGroupMembershipOptions.instanceGroupMembershipPatch;
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
     * @param instanceGroupMembershipPatch the instanceGroupMembershipPatch
     */
    public Builder(String instanceGroupId, String id, Map<String, Object> instanceGroupMembershipPatch) {
      this.instanceGroupId = instanceGroupId;
      this.id = id;
      this.instanceGroupMembershipPatch = instanceGroupMembershipPatch;
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
     * Set the instanceGroupMembershipPatch.
     *
     * @param instanceGroupMembershipPatch the instanceGroupMembershipPatch
     * @return the UpdateInstanceGroupMembershipOptions builder
     */
    public Builder instanceGroupMembershipPatch(Map<String, Object> instanceGroupMembershipPatch) {
      this.instanceGroupMembershipPatch = instanceGroupMembershipPatch;
      return this;
    }
  }

  protected UpdateInstanceGroupMembershipOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.instanceGroupMembershipPatch,
      "instanceGroupMembershipPatch cannot be null");
    instanceGroupId = builder.instanceGroupId;
    id = builder.id;
    instanceGroupMembershipPatch = builder.instanceGroupMembershipPatch;
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
   * Gets the instanceGroupMembershipPatch.
   *
   * The instance group membership patch.
   *
   * @return the instanceGroupMembershipPatch
   */
  public Map<String, Object> instanceGroupMembershipPatch() {
    return instanceGroupMembershipPatch;
  }
}

