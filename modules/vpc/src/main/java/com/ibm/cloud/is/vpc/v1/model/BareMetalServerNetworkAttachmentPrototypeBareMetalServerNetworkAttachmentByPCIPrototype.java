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

import java.util.ArrayList;
import java.util.List;

/**
 * BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype.
 */
public class BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype extends BareMetalServerNetworkAttachmentPrototype {

  public interface InterfaceType {
    /** pci. */
    String PCI = "pci";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface;
    private List<Long> allowedVlans;
    private String interfaceType;

    /**
     * Instantiates a new Builder from an existing BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype instance.
     *
     * @param bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPciPrototype the instance to initialize the Builder with
     */
    public Builder(BareMetalServerNetworkAttachmentPrototype bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPciPrototype) {
      this.name = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPciPrototype.name;
      this.virtualNetworkInterface = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPciPrototype.virtualNetworkInterface;
      this.allowedVlans = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPciPrototype.allowedVlans;
      this.interfaceType = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPciPrototype.interfaceType;
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
     * @param interfaceType the interfaceType
     */
    public Builder(BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface, String interfaceType) {
      this.virtualNetworkInterface = virtualNetworkInterface;
      this.interfaceType = interfaceType;
    }

    /**
     * Builds a BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype.
     *
     * @return the new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype instance
     */
    public BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype build() {
      return new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype(this);
    }

    /**
     * Adds a new element to allowedVlans.
     *
     * @param allowedVlans the new element to be added
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype builder
     */
    public Builder addAllowedVlans(Long allowedVlans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedVlans,
        "allowedVlans cannot be null");
      if (this.allowedVlans == null) {
        this.allowedVlans = new ArrayList<Long>();
      }
      this.allowedVlans.add(allowedVlans);
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the virtualNetworkInterface.
     *
     * @param virtualNetworkInterface the virtualNetworkInterface
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype builder
     */
    public Builder virtualNetworkInterface(BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface) {
      this.virtualNetworkInterface = virtualNetworkInterface;
      return this;
    }

    /**
     * Set the allowedVlans.
     * Existing allowedVlans will be replaced.
     *
     * @param allowedVlans the allowedVlans
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype builder
     */
    public Builder allowedVlans(List<Long> allowedVlans) {
      this.allowedVlans = allowedVlans;
      return this;
    }

    /**
     * Set the interfaceType.
     *
     * @param interfaceType the interfaceType
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype builder
     */
    public Builder interfaceType(String interfaceType) {
      this.interfaceType = interfaceType;
      return this;
    }
  }

  protected BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype() { }

  protected BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.virtualNetworkInterface,
      "virtualNetworkInterface cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.interfaceType,
      "interfaceType cannot be null");
    name = builder.name;
    virtualNetworkInterface = builder.virtualNetworkInterface;
    allowedVlans = builder.allowedVlans;
    interfaceType = builder.interfaceType;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByPCIPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

