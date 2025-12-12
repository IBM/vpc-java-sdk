/*
 * (C) Copyright IBM Corp. 2025.
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
 * The listInstanceClusterNetworkAttachments options.
 */
public class ListInstanceClusterNetworkAttachmentsOptions extends GenericModel {

  protected String instanceId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListInstanceClusterNetworkAttachmentsOptions instance.
     *
     * @param listInstanceClusterNetworkAttachmentsOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceClusterNetworkAttachmentsOptions listInstanceClusterNetworkAttachmentsOptions) {
      this.instanceId = listInstanceClusterNetworkAttachmentsOptions.instanceId;
      this.start = listInstanceClusterNetworkAttachmentsOptions.start;
      this.limit = listInstanceClusterNetworkAttachmentsOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     */
    public Builder(String instanceId) {
      this.instanceId = instanceId;
    }

    /**
     * Builds a ListInstanceClusterNetworkAttachmentsOptions.
     *
     * @return the new ListInstanceClusterNetworkAttachmentsOptions instance
     */
    public ListInstanceClusterNetworkAttachmentsOptions build() {
      return new ListInstanceClusterNetworkAttachmentsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListInstanceClusterNetworkAttachmentsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListInstanceClusterNetworkAttachmentsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListInstanceClusterNetworkAttachmentsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListInstanceClusterNetworkAttachmentsOptions() { }

  protected ListInstanceClusterNetworkAttachmentsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    instanceId = builder.instanceId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceClusterNetworkAttachmentsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The virtual server instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
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

