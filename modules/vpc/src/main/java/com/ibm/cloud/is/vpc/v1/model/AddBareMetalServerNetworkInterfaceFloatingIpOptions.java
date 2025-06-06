/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025.
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
 * The addBareMetalServerNetworkInterfaceFloatingIp options.
 */
public class AddBareMetalServerNetworkInterfaceFloatingIpOptions extends GenericModel {

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

    /**
     * Instantiates a new Builder from an existing AddBareMetalServerNetworkInterfaceFloatingIpOptions instance.
     *
     * @param addBareMetalServerNetworkInterfaceFloatingIpOptions the instance to initialize the Builder with
     */
    private Builder(AddBareMetalServerNetworkInterfaceFloatingIpOptions addBareMetalServerNetworkInterfaceFloatingIpOptions) {
      this.bareMetalServerId = addBareMetalServerNetworkInterfaceFloatingIpOptions.bareMetalServerId;
      this.networkInterfaceId = addBareMetalServerNetworkInterfaceFloatingIpOptions.networkInterfaceId;
      this.id = addBareMetalServerNetworkInterfaceFloatingIpOptions.id;
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
     * Builds a AddBareMetalServerNetworkInterfaceFloatingIpOptions.
     *
     * @return the new AddBareMetalServerNetworkInterfaceFloatingIpOptions instance
     */
    public AddBareMetalServerNetworkInterfaceFloatingIpOptions build() {
      return new AddBareMetalServerNetworkInterfaceFloatingIpOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the AddBareMetalServerNetworkInterfaceFloatingIpOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the networkInterfaceId.
     *
     * @param networkInterfaceId the networkInterfaceId
     * @return the AddBareMetalServerNetworkInterfaceFloatingIpOptions builder
     */
    public Builder networkInterfaceId(String networkInterfaceId) {
      this.networkInterfaceId = networkInterfaceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AddBareMetalServerNetworkInterfaceFloatingIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected AddBareMetalServerNetworkInterfaceFloatingIpOptions() { }

  protected AddBareMetalServerNetworkInterfaceFloatingIpOptions(Builder builder) {
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
   * @return a AddBareMetalServerNetworkInterfaceFloatingIpOptions builder
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
   * The bare metal server network interface identifier.
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

