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
 * The getBareMetalServerNetworkInterfaceFloatingIp options.
 */
public class GetBareMetalServerNetworkInterfaceFloatingIpOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String networkInterfaceId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String networkInterfaceId;
    private String id;

    private Builder(GetBareMetalServerNetworkInterfaceFloatingIpOptions getBareMetalServerNetworkInterfaceFloatingIpOptions) {
      this.bareMetalServerId = getBareMetalServerNetworkInterfaceFloatingIpOptions.bareMetalServerId;
      this.networkInterfaceId = getBareMetalServerNetworkInterfaceFloatingIpOptions.networkInterfaceId;
      this.id = getBareMetalServerNetworkInterfaceFloatingIpOptions.id;
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
     * @param id the id
     */
    public Builder(String bareMetalServerId, String networkInterfaceId, String id) {
      this.bareMetalServerId = bareMetalServerId;
      this.networkInterfaceId = networkInterfaceId;
      this.id = id;
    }

    /**
     * Builds a GetBareMetalServerNetworkInterfaceFloatingIpOptions.
     *
     * @return the new GetBareMetalServerNetworkInterfaceFloatingIpOptions instance
     */
    public GetBareMetalServerNetworkInterfaceFloatingIpOptions build() {
      return new GetBareMetalServerNetworkInterfaceFloatingIpOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the GetBareMetalServerNetworkInterfaceFloatingIpOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the networkInterfaceId.
     *
     * @param networkInterfaceId the networkInterfaceId
     * @return the GetBareMetalServerNetworkInterfaceFloatingIpOptions builder
     */
    public Builder networkInterfaceId(String networkInterfaceId) {
      this.networkInterfaceId = networkInterfaceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetBareMetalServerNetworkInterfaceFloatingIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetBareMetalServerNetworkInterfaceFloatingIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkInterfaceId,
      "networkInterfaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    bareMetalServerId = builder.bareMetalServerId;
    networkInterfaceId = builder.networkInterfaceId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetBareMetalServerNetworkInterfaceFloatingIpOptions builder
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

  /**
   * Gets the id.
   *
   * The floating IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

