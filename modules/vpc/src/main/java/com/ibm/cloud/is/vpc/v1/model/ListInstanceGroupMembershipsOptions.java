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
 * The listInstanceGroupMemberships options.
 */
public class ListInstanceGroupMembershipsOptions extends GenericModel {

  protected String instanceGroupId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;

    private Builder(ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions) {
      this.instanceGroupId = listInstanceGroupMembershipsOptions.instanceGroupId;
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
     */
    public Builder(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
    }

    /**
     * Builds a ListInstanceGroupMembershipsOptions.
     *
     * @return the new ListInstanceGroupMembershipsOptions instance
     */
    public ListInstanceGroupMembershipsOptions build() {
      return new ListInstanceGroupMembershipsOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the ListInstanceGroupMembershipsOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }
  }

  protected ListInstanceGroupMembershipsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    instanceGroupId = builder.instanceGroupId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceGroupMembershipsOptions builder
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
}

