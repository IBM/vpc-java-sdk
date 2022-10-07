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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateBareMetalServerNetworkInterface options.
 */
public class UpdateBareMetalServerNetworkInterfaceOptions extends GenericModel {

  protected String bareMetalServerId;
  protected String id;
  protected Map<String, Object> bareMetalServerNetworkInterfacePatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private String id;
    private Map<String, Object> bareMetalServerNetworkInterfacePatch;

    /**
     * Instantiates a new Builder from an existing UpdateBareMetalServerNetworkInterfaceOptions instance.
     *
     * @param updateBareMetalServerNetworkInterfaceOptions the instance to initialize the Builder with
     */
    private Builder(UpdateBareMetalServerNetworkInterfaceOptions updateBareMetalServerNetworkInterfaceOptions) {
      this.bareMetalServerId = updateBareMetalServerNetworkInterfaceOptions.bareMetalServerId;
      this.id = updateBareMetalServerNetworkInterfaceOptions.id;
      this.bareMetalServerNetworkInterfacePatch = updateBareMetalServerNetworkInterfaceOptions.bareMetalServerNetworkInterfacePatch;
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
     * @param bareMetalServerNetworkInterfacePatch the bareMetalServerNetworkInterfacePatch
     */
    public Builder(String bareMetalServerId, String id, Map<String, Object> bareMetalServerNetworkInterfacePatch) {
      this.bareMetalServerId = bareMetalServerId;
      this.id = id;
      this.bareMetalServerNetworkInterfacePatch = bareMetalServerNetworkInterfacePatch;
    }

    /**
     * Builds a UpdateBareMetalServerNetworkInterfaceOptions.
     *
     * @return the new UpdateBareMetalServerNetworkInterfaceOptions instance
     */
    public UpdateBareMetalServerNetworkInterfaceOptions build() {
      return new UpdateBareMetalServerNetworkInterfaceOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the UpdateBareMetalServerNetworkInterfaceOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateBareMetalServerNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the bareMetalServerNetworkInterfacePatch.
     *
     * @param bareMetalServerNetworkInterfacePatch the bareMetalServerNetworkInterfacePatch
     * @return the UpdateBareMetalServerNetworkInterfaceOptions builder
     */
    public Builder bareMetalServerNetworkInterfacePatch(Map<String, Object> bareMetalServerNetworkInterfacePatch) {
      this.bareMetalServerNetworkInterfacePatch = bareMetalServerNetworkInterfacePatch;
      return this;
    }
  }

  protected UpdateBareMetalServerNetworkInterfaceOptions() { }

  protected UpdateBareMetalServerNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bareMetalServerNetworkInterfacePatch,
      "bareMetalServerNetworkInterfacePatch cannot be null");
    bareMetalServerId = builder.bareMetalServerId;
    id = builder.id;
    bareMetalServerNetworkInterfacePatch = builder.bareMetalServerNetworkInterfacePatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateBareMetalServerNetworkInterfaceOptions builder
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

  /**
   * Gets the bareMetalServerNetworkInterfacePatch.
   *
   * The network interface patch.
   *
   * @return the bareMetalServerNetworkInterfacePatch
   */
  public Map<String, Object> bareMetalServerNetworkInterfacePatch() {
    return bareMetalServerNetworkInterfacePatch;
  }
}

