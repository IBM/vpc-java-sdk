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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceNetworkAttachmentPrototype.
 */
public class InstanceNetworkAttachmentPrototype extends GenericModel {

  protected String name;
  @SerializedName("virtual_network_interface")
  protected InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface;

    /**
     * Instantiates a new Builder from an existing InstanceNetworkAttachmentPrototype instance.
     *
     * @param instanceNetworkAttachmentPrototype the instance to initialize the Builder with
     */
    private Builder(InstanceNetworkAttachmentPrototype instanceNetworkAttachmentPrototype) {
      this.name = instanceNetworkAttachmentPrototype.name;
      this.virtualNetworkInterface = instanceNetworkAttachmentPrototype.virtualNetworkInterface;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param virtualNetworkInterface the virtualNetworkInterface
     */
    public Builder(InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface) {
      this.virtualNetworkInterface = virtualNetworkInterface;
    }

    /**
     * Builds a InstanceNetworkAttachmentPrototype.
     *
     * @return the new InstanceNetworkAttachmentPrototype instance
     */
    public InstanceNetworkAttachmentPrototype build() {
      return new InstanceNetworkAttachmentPrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceNetworkAttachmentPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the virtualNetworkInterface.
     *
     * @param virtualNetworkInterface the virtualNetworkInterface
     * @return the InstanceNetworkAttachmentPrototype builder
     */
    public Builder virtualNetworkInterface(InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface) {
      this.virtualNetworkInterface = virtualNetworkInterface;
      return this;
    }
  }

  protected InstanceNetworkAttachmentPrototype() { }

  protected InstanceNetworkAttachmentPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.virtualNetworkInterface,
      "virtualNetworkInterface cannot be null");
    name = builder.name;
    virtualNetworkInterface = builder.virtualNetworkInterface;
  }

  /**
   * New builder.
   *
   * @return a InstanceNetworkAttachmentPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this network attachment. Names must be unique within the instance the network attachment resides in.
   * If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the virtualNetworkInterface.
   *
   * A virtual network interface for the instance network attachment. This can be specified
   * using an existing virtual network interface, or a prototype object for a new virtual
   * network interface.
   *
   * If an existing virtual network interface is specified, `enable_infrastructure_nat` must be
   * `true`.
   *
   * @return the virtualNetworkInterface
   */
  public InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface() {
    return virtualNetworkInterface;
  }
}

