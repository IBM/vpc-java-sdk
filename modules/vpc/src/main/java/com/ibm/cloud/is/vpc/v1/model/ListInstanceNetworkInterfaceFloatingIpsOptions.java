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
 * The listInstanceNetworkInterfaceFloatingIps options.
 */
public class ListInstanceNetworkInterfaceFloatingIpsOptions extends GenericModel {

  protected String instanceId;
  protected String networkInterfaceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String networkInterfaceId;

    private Builder(ListInstanceNetworkInterfaceFloatingIpsOptions listInstanceNetworkInterfaceFloatingIpsOptions) {
      this.instanceId = listInstanceNetworkInterfaceFloatingIpsOptions.instanceId;
      this.networkInterfaceId = listInstanceNetworkInterfaceFloatingIpsOptions.networkInterfaceId;
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
     * Builds a ListInstanceNetworkInterfaceFloatingIpsOptions.
     *
     * @return the new ListInstanceNetworkInterfaceFloatingIpsOptions instance
     */
    public ListInstanceNetworkInterfaceFloatingIpsOptions build() {
      return new ListInstanceNetworkInterfaceFloatingIpsOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the ListInstanceNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the networkInterfaceId.
     *
     * @param networkInterfaceId the networkInterfaceId
     * @return the ListInstanceNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder networkInterfaceId(String networkInterfaceId) {
      this.networkInterfaceId = networkInterfaceId;
      return this;
    }
  }

  protected ListInstanceNetworkInterfaceFloatingIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkInterfaceId,
      "networkInterfaceId cannot be empty");
    instanceId = builder.instanceId;
    networkInterfaceId = builder.networkInterfaceId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceNetworkInterfaceFloatingIpsOptions builder
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
}

