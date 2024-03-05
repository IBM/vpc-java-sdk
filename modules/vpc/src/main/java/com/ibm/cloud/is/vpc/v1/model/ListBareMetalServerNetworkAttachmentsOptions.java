/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * The listBareMetalServerNetworkAttachments options.
 */
public class ListBareMetalServerNetworkAttachmentsOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListBareMetalServerNetworkAttachmentsOptions instance.
     *
     * @param listBareMetalServerNetworkAttachmentsOptions the instance to initialize the Builder with
     */
    private Builder(ListBareMetalServerNetworkAttachmentsOptions listBareMetalServerNetworkAttachmentsOptions) {
      this.bareMetalServerId = listBareMetalServerNetworkAttachmentsOptions.bareMetalServerId;
      this.start = listBareMetalServerNetworkAttachmentsOptions.start;
      this.limit = listBareMetalServerNetworkAttachmentsOptions.limit;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bareMetalServerId the bareMetalServerId
     */
    public Builder(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
    }

    /**
     * Builds a ListBareMetalServerNetworkAttachmentsOptions.
     *
     * @return the new ListBareMetalServerNetworkAttachmentsOptions instance
     */
    public ListBareMetalServerNetworkAttachmentsOptions build() {
      return new ListBareMetalServerNetworkAttachmentsOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the ListBareMetalServerNetworkAttachmentsOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListBareMetalServerNetworkAttachmentsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListBareMetalServerNetworkAttachmentsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListBareMetalServerNetworkAttachmentsOptions() { }

  protected ListBareMetalServerNetworkAttachmentsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    bareMetalServerId = builder.bareMetalServerId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListBareMetalServerNetworkAttachmentsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bareMetalServerId.
   *
   * The bare metal server identifier.
   *
   * @return the bareMetalServerId
   */
  public String bareMetalServerId() {
    return bareMetalServerId;
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

