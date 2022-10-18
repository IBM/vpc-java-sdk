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
 * The listBareMetalServerNetworkInterfaceFloatingIps options.
 */
public class ListBareMetalServerNetworkInterfaceFloatingIpsOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String networkInterfaceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String networkInterfaceId;

    /**
     * Instantiates a new Builder from an existing ListBareMetalServerNetworkInterfaceFloatingIpsOptions instance.
     *
     * @param listBareMetalServerNetworkInterfaceFloatingIpsOptions the instance to initialize the Builder with
     */
    private Builder(ListBareMetalServerNetworkInterfaceFloatingIpsOptions listBareMetalServerNetworkInterfaceFloatingIpsOptions) {
      this.bareMetalServerId = listBareMetalServerNetworkInterfaceFloatingIpsOptions.bareMetalServerId;
      this.networkInterfaceId = listBareMetalServerNetworkInterfaceFloatingIpsOptions.networkInterfaceId;
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
     * @param networkInterfaceId the networkInterfaceId
     */
    public Builder(String bareMetalServerId, String networkInterfaceId) {
      this.bareMetalServerId = bareMetalServerId;
      this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * Builds a ListBareMetalServerNetworkInterfaceFloatingIpsOptions.
     *
     * @return the new ListBareMetalServerNetworkInterfaceFloatingIpsOptions instance
     */
    public ListBareMetalServerNetworkInterfaceFloatingIpsOptions build() {
      return new ListBareMetalServerNetworkInterfaceFloatingIpsOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the ListBareMetalServerNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the networkInterfaceId.
     *
     * @param networkInterfaceId the networkInterfaceId
     * @return the ListBareMetalServerNetworkInterfaceFloatingIpsOptions builder
     */
    public Builder networkInterfaceId(String networkInterfaceId) {
      this.networkInterfaceId = networkInterfaceId;
      return this;
    }
  }

  protected ListBareMetalServerNetworkInterfaceFloatingIpsOptions() { }

  protected ListBareMetalServerNetworkInterfaceFloatingIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkInterfaceId,
      "networkInterfaceId cannot be empty");
    bareMetalServerId = builder.bareMetalServerId;
    networkInterfaceId = builder.networkInterfaceId;
  }

  /**
   * New builder.
   *
   * @return a ListBareMetalServerNetworkInterfaceFloatingIpsOptions builder
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

