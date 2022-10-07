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
 * The listInstanceNetworkInterfaceIps options.
 */
public class ListInstanceNetworkInterfaceIpsOptions extends GenericModel {

  protected String instanceId;
  protected String networkInterfaceId;
  protected String start;
  protected Long limit;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String networkInterfaceId;
    private String start;
    private Long limit;

    /**
     * Instantiates a new Builder from an existing ListInstanceNetworkInterfaceIpsOptions instance.
     *
     * @param listInstanceNetworkInterfaceIpsOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceNetworkInterfaceIpsOptions listInstanceNetworkInterfaceIpsOptions) {
      this.instanceId = listInstanceNetworkInterfaceIpsOptions.instanceId;
      this.networkInterfaceId = listInstanceNetworkInterfaceIpsOptions.networkInterfaceId;
      this.start = listInstanceNetworkInterfaceIpsOptions.start;
      this.limit = listInstanceNetworkInterfaceIpsOptions.limit;
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
     * @param networkInterfaceId the networkInterfaceId
     */
    public Builder(String instanceId, String networkInterfaceId) {
      this.instanceId = instanceId;
      this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * Builds a ListInstanceNetworkInterfaceIpsOptions.
     *
     * @return the new ListInstanceNetworkInterfaceIpsOptions instance
     */
    public ListInstanceNetworkInterfaceIpsOptions build() {
      return new ListInstanceNetworkInterfaceIpsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListInstanceNetworkInterfaceIpsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the networkInterfaceId.
     *
     * @param networkInterfaceId the networkInterfaceId
     * @return the ListInstanceNetworkInterfaceIpsOptions builder
     */
    public Builder networkInterfaceId(String networkInterfaceId) {
      this.networkInterfaceId = networkInterfaceId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListInstanceNetworkInterfaceIpsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListInstanceNetworkInterfaceIpsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }
  }

  protected ListInstanceNetworkInterfaceIpsOptions() { }

  protected ListInstanceNetworkInterfaceIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkInterfaceId,
      "networkInterfaceId cannot be empty");
    instanceId = builder.instanceId;
    networkInterfaceId = builder.networkInterfaceId;
    start = builder.start;
    limit = builder.limit;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceNetworkInterfaceIpsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the networkInterfaceId.
   *
   * The network interface identifier.
   *
   * @return the networkInterfaceId
   */
  public String networkInterfaceId() {
    return networkInterfaceId;
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

