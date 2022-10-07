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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getInstanceGroupMembership options.
 */
public class GetInstanceGroupMembershipOptions extends GenericModel {

  protected String instanceGroupId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetInstanceGroupMembershipOptions instance.
     *
     * @param getInstanceGroupMembershipOptions the instance to initialize the Builder with
     */
    private Builder(GetInstanceGroupMembershipOptions getInstanceGroupMembershipOptions) {
      this.instanceGroupId = getInstanceGroupMembershipOptions.instanceGroupId;
      this.id = getInstanceGroupMembershipOptions.id;
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
     * Builds a GetInstanceGroupMembershipOptions.
     *
     * @return the new GetInstanceGroupMembershipOptions instance
     */
    public GetInstanceGroupMembershipOptions build() {
      return new GetInstanceGroupMembershipOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the GetInstanceGroupMembershipOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetInstanceGroupMembershipOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetInstanceGroupMembershipOptions() { }

  protected GetInstanceGroupMembershipOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetInstanceGroupMembershipOptions builder
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
}

