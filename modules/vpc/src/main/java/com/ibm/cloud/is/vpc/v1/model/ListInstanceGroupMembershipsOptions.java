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
 * The listInstanceGroupMemberships options.
 */
public class ListInstanceGroupMembershipsOptions extends GenericModel {

  protected String instanceGroupId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String start;
    private Long limit;

    private Builder(ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions) {
      this.instanceGroupId = listInstanceGroupMembershipsOptions.instanceGroupId;
      this.start = listInstanceGroupMembershipsOptions.start;
      this.limit = listInstanceGroupMembershipsOptions.limit;
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

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListInstanceGroupMembershipsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListInstanceGroupMembershipsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListInstanceGroupMembershipsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    start = builder.start;
    limit = builder.limit;
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

  /**
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }
}

