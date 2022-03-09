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
 * The createBareMetalServerNetworkInterface options.
 */
public class CreateBareMetalServerNetworkInterfaceOptions extends GenericModel {

  protected String bareMetalServerId;
  protected BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototype;

  /**
   * Builder.
   */
  public static class Builder {
    private String bareMetalServerId;
    private BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototype;

    private Builder(CreateBareMetalServerNetworkInterfaceOptions createBareMetalServerNetworkInterfaceOptions) {
      this.bareMetalServerId = createBareMetalServerNetworkInterfaceOptions.bareMetalServerId;
      this.bareMetalServerNetworkInterfacePrototype = createBareMetalServerNetworkInterfaceOptions.bareMetalServerNetworkInterfacePrototype;
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
     * @param bareMetalServerNetworkInterfacePrototype the bareMetalServerNetworkInterfacePrototype
     */
    public Builder(String bareMetalServerId, BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototype) {
      this.bareMetalServerId = bareMetalServerId;
      this.bareMetalServerNetworkInterfacePrototype = bareMetalServerNetworkInterfacePrototype;
    }

    /**
     * Builds a CreateBareMetalServerNetworkInterfaceOptions.
     *
     * @return the new CreateBareMetalServerNetworkInterfaceOptions instance
     */
    public CreateBareMetalServerNetworkInterfaceOptions build() {
      return new CreateBareMetalServerNetworkInterfaceOptions(this);
    }

    /**
     * Set the bareMetalServerId.
     *
     * @param bareMetalServerId the bareMetalServerId
     * @return the CreateBareMetalServerNetworkInterfaceOptions builder
     */
    public Builder bareMetalServerId(String bareMetalServerId) {
      this.bareMetalServerId = bareMetalServerId;
      return this;
    }

    /**
     * Set the bareMetalServerNetworkInterfacePrototype.
     *
     * @param bareMetalServerNetworkInterfacePrototype the bareMetalServerNetworkInterfacePrototype
     * @return the CreateBareMetalServerNetworkInterfaceOptions builder
     */
    public Builder bareMetalServerNetworkInterfacePrototype(BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototype) {
      this.bareMetalServerNetworkInterfacePrototype = bareMetalServerNetworkInterfacePrototype;
      return this;
    }
  }

  protected CreateBareMetalServerNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bareMetalServerId,
      "bareMetalServerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bareMetalServerNetworkInterfacePrototype,
      "bareMetalServerNetworkInterfacePrototype cannot be null");
    bareMetalServerId = builder.bareMetalServerId;
    bareMetalServerNetworkInterfacePrototype = builder.bareMetalServerNetworkInterfacePrototype;
  }

  /**
   * New builder.
   *
   * @return a CreateBareMetalServerNetworkInterfaceOptions builder
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
   * Gets the bareMetalServerNetworkInterfacePrototype.
   *
   * The network interface prototype object.
   *
   * @return the bareMetalServerNetworkInterfacePrototype
   */
  public BareMetalServerNetworkInterfacePrototype bareMetalServerNetworkInterfacePrototype() {
    return bareMetalServerNetworkInterfacePrototype;
  }
}

