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
 * The createInstanceNetworkAttachment options.
 */
public class CreateInstanceNetworkAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateInstanceNetworkAttachmentOptions instance.
     *
     * @param createInstanceNetworkAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceNetworkAttachmentOptions createInstanceNetworkAttachmentOptions) {
      this.instanceId = createInstanceNetworkAttachmentOptions.instanceId;
      this.virtualNetworkInterface = createInstanceNetworkAttachmentOptions.virtualNetworkInterface;
      this.name = createInstanceNetworkAttachmentOptions.name;
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
     * @param virtualNetworkInterface the virtualNetworkInterface
     */
    public Builder(String instanceId, InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface) {
      this.instanceId = instanceId;
      this.virtualNetworkInterface = virtualNetworkInterface;
    }

    /**
     * Builds a CreateInstanceNetworkAttachmentOptions.
     *
     * @return the new CreateInstanceNetworkAttachmentOptions instance
     */
    public CreateInstanceNetworkAttachmentOptions build() {
      return new CreateInstanceNetworkAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceNetworkAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the virtualNetworkInterface.
     *
     * @param virtualNetworkInterface the virtualNetworkInterface
     * @return the CreateInstanceNetworkAttachmentOptions builder
     */
    public Builder virtualNetworkInterface(InstanceNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface) {
      this.virtualNetworkInterface = virtualNetworkInterface;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceNetworkAttachmentOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the instanceNetworkAttachmentPrototype.
     *
     * @param instanceNetworkAttachmentPrototype the instanceNetworkAttachmentPrototype
     * @return the CreateInstanceNetworkAttachmentOptions builder
     */
    public Builder instanceNetworkAttachmentPrototype(InstanceNetworkAttachmentPrototype instanceNetworkAttachmentPrototype) {
      this.virtualNetworkInterface = instanceNetworkAttachmentPrototype.virtualNetworkInterface();
      this.name = instanceNetworkAttachmentPrototype.name();
      return this;
    }
  }

  protected CreateInstanceNetworkAttachmentOptions() { }

  protected CreateInstanceNetworkAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.virtualNetworkInterface,
      "virtualNetworkInterface cannot be null");
    instanceId = builder.instanceId;
    virtualNetworkInterface = builder.virtualNetworkInterface;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceNetworkAttachmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The virtual server instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
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
}

