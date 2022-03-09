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
 * The listInstanceGroupManagers options.
 */
public class ListInstanceGroupManagersOptions extends GenericModel {

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

    private Builder(ListInstanceGroupManagersOptions listInstanceGroupManagersOptions) {
      this.instanceGroupId = listInstanceGroupManagersOptions.instanceGroupId;
      this.start = listInstanceGroupManagersOptions.start;
      this.limit = listInstanceGroupManagersOptions.limit;
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
     * Builds a ListInstanceGroupManagersOptions.
     *
     * @return the new ListInstanceGroupManagersOptions instance
     */
    public ListInstanceGroupManagersOptions build() {
      return new ListInstanceGroupManagersOptions(this);
    }

    /**
     * Set the instanceGroupId.
     *
     * @param instanceGroupId the instanceGroupId
     * @return the ListInstanceGroupManagersOptions builder
     */
    public Builder instanceGroupId(String instanceGroupId) {
      this.instanceGroupId = instanceGroupId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListInstanceGroupManagersOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListInstanceGroupManagersOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListInstanceGroupManagersOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceGroupId,
      "instanceGroupId cannot be empty");
    instanceGroupId = builder.instanceGroupId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceGroupManagersOptions builder
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

