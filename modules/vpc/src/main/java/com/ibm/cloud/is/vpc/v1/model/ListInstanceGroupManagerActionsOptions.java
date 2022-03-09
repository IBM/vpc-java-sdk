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
 * The listInstanceGroupManagerActions options.
 */
public class ListInstanceGroupManagerActionsOptions extends GenericModel {

  protected String instanceGroupId;
  protected String instanceGroupManagerId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceGroupId;
    private String instanceGroupManagerId;
    private String start;
    private Long limit;

    private Builder(ListInstanceGroupManagerActionsOptions listInstanceGroupManagerActionsOptions) {
      this.instanceGroupId = listInstanceGroupManagerActionsOptions.instanceGroupId;
      this.instanceGroupManagerId = listInstanceGroupManagerActionsOptions.instanceGroupManagerId;
      this.start = listInstanceGroupManagerActionsOptions.start;
      this.limit = listInstanceGroupManagerActionsOptions.limit;
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
     * @param instanceGroupManagerId the instanceGroupManagerId
     */
    public Builder(String instanceGroupId, String instanceGroupManagerId) {
      this.instanceGroupId = instanceGroupId;
      this.instanceGroupManagerId = instanceGroupManagerId;
    }

    /**
     * Builds a ListInstanceGroupManagerActionsOptions.
     *
     * @return the new ListInstanceGroupManagerActionsOptions instance
     */
    public ListInstanceGroupManagerActionsOptions build() {
      return new ListInstanceGroupManagerActionsOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the ListInstanceGroupManagerActionsOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the instanceGroupManagerId.
     *
     * @param instanceGroupManagerId the instanceGroupManagerId
     * @return the ListInstanceGroupManagerActionsOptions builder
     */
    public Builder instanceGroupManagerId(String instanceGroupManagerId) {
      this.instanceGroupManagerId = instanceGroupManagerId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListInstanceGroupManagerActionsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListInstanceGroupManagerActionsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListInstanceGroupManagerActionsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupManagerId,
      "instanceGroupManagerId cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    instanceGroupManagerId = builder.instanceGroupManagerId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceGroupManagerActionsOptions builder
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
   * Gets the instanceGroupManagerId.
   *
   * The instance group manager identifier.
   *
   * @return the instanceGroupManagerId
   */
  public String instanceGroupManagerId() {
    return instanceGroupManagerId;
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

