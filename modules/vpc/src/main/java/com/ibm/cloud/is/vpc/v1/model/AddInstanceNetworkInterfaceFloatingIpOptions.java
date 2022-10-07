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
 * The addInstanceNetworkInterfaceFloatingIp options.
 */
public class AddInstanceNetworkInterfaceFloatingIpOptions extends GenericModel {

  protected String instanceId;
  protected String networkInterfaceId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private String networkInterfaceId;
    private String id;

    /**
     * Instantiates a new Builder from an existing AddInstanceNetworkInterfaceFloatingIpOptions instance.
     *
     * @param addInstanceNetworkInterfaceFloatingIpOptions the instance to initialize the Builder with
     */
    private Builder(AddInstanceNetworkInterfaceFloatingIpOptions addInstanceNetworkInterfaceFloatingIpOptions) {
      this.instanceId = addInstanceNetworkInterfaceFloatingIpOptions.instanceId;
      this.networkInterfaceId = addInstanceNetworkInterfaceFloatingIpOptions.networkInterfaceId;
      this.id = addInstanceNetworkInterfaceFloatingIpOptions.id;
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
     * @param id the id
     */
    public Builder(String instanceId, String networkInterfaceId, String id) {
      this.instanceId = instanceId;
      this.networkInterfaceId = networkInterfaceId;
      this.id = id;
    }

    /**
     * Builds a AddInstanceNetworkInterfaceFloatingIpOptions.
     *
     * @return the new AddInstanceNetworkInterfaceFloatingIpOptions instance
     */
    public AddInstanceNetworkInterfaceFloatingIpOptions build() {
      return new AddInstanceNetworkInterfaceFloatingIpOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the AddInstanceNetworkInterfaceFloatingIpOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the networkInterfaceId.
     *
     * @param networkInterfaceId the networkInterfaceId
     * @return the AddInstanceNetworkInterfaceFloatingIpOptions builder
     */
    public Builder networkInterfaceId(String networkInterfaceId) {
      this.networkInterfaceId = networkInterfaceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AddInstanceNetworkInterfaceFloatingIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected AddInstanceNetworkInterfaceFloatingIpOptions() { }

  protected AddInstanceNetworkInterfaceFloatingIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.networkInterfaceId,
      "networkInterfaceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    instanceId = builder.instanceId;
    networkInterfaceId = builder.networkInterfaceId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a AddInstanceNetworkInterfaceFloatingIpOptions builder
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

