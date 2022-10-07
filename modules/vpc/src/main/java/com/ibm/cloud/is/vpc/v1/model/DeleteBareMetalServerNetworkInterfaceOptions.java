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
 * The deleteBareMetalServerNetworkInterface options.
 */
public class DeleteBareMetalServerNetworkInterfaceOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String id;

    /**
     * Instantiates a new Builder from an existing DeleteBareMetalServerNetworkInterfaceOptions instance.
     *
     * @param deleteBareMetalServerNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(DeleteBareMetalServerNetworkInterfaceOptions deleteBareMetalServerNetworkInterfaceOptions) {
      this.bareMetalServerId = deleteBareMetalServerNetworkInterfaceOptions.bareMetalServerId;
      this.id = deleteBareMetalServerNetworkInterfaceOptions.id;
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
     * @param id the id
     */
    public Builder(String bareMetalServerId, String id) {
      this.bareMetalServerId = bareMetalServerId;
      this.id = id;
    }

    /**
     * Builds a DeleteBareMetalServerNetworkInterfaceOptions.
     *
     * @return the new DeleteBareMetalServerNetworkInterfaceOptions instance
     */
    public DeleteBareMetalServerNetworkInterfaceOptions build() {
      return new DeleteBareMetalServerNetworkInterfaceOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the DeleteBareMetalServerNetworkInterfaceOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteBareMetalServerNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteBareMetalServerNetworkInterfaceOptions() { }

  protected DeleteBareMetalServerNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    bareMetalServerId = builder.bareMetalServerId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteBareMetalServerNetworkInterfaceOptions builder
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
   * Gets the id.
   *
   * The network interface identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

