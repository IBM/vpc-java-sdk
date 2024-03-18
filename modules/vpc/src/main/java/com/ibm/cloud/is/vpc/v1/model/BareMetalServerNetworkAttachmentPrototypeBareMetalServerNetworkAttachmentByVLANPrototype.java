/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

/**
 * BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype.
 */
public class BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype extends BareMetalServerNetworkAttachmentPrototype {

  /**
   * - `vlan`: a virtual device, used through a `pci` device that has the `vlan` in its array
   *    of `allowed_vlans`.
   *   - Must use an IEEE 802.1Q tag.
   */
  public interface InterfaceType {
    /** vlan. */
    String VLAN = "vlan";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface;
    private Boolean allowToFloat;
    private String interfaceType;
    private Long vlan;

    /**
     * Instantiates a new Builder from an existing BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype instance.
     *
     * @param bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototype the instance to initialize the Builder with
     */
    public Builder(BareMetalServerNetworkAttachmentPrototype bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototype) {
      this.name = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototype.name;
      this.virtualNetworkInterface = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototype.virtualNetworkInterface;
      this.allowToFloat = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototype.allowToFloat;
      this.interfaceType = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototype.interfaceType;
      this.vlan = bareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVlanPrototype.vlan;
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
     * @param vlan the vlan
     */
    public Builder(BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface, String interfaceType, Long vlan) {
      this.virtualNetworkInterface = virtualNetworkInterface;
      this.interfaceType = interfaceType;
      this.vlan = vlan;
    }

    /**
     * Builds a BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype.
     *
     * @return the new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype instance
     */
    public BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype build() {
      return new BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the virtualNetworkInterface.
     *
     * @param virtualNetworkInterface the virtualNetworkInterface
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype builder
     */
    public Builder virtualNetworkInterface(BareMetalServerNetworkAttachmentPrototypeVirtualNetworkInterface virtualNetworkInterface) {
      this.virtualNetworkInterface = virtualNetworkInterface;
      return this;
    }

    /**
     * Set the allowToFloat.
     *
     * @param allowToFloat the allowToFloat
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype builder
     */
    public Builder allowToFloat(Boolean allowToFloat) {
      this.allowToFloat = allowToFloat;
      return this;
    }

    /**
     * Set the interfaceType.
     *
     * @param interfaceType the interfaceType
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype builder
     */
    public Builder interfaceType(String interfaceType) {
      this.interfaceType = interfaceType;
      return this;
    }

    /**
     * Set the vlan.
     *
     * @param vlan the vlan
     * @return the BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype builder
     */
    public Builder vlan(long vlan) {
      this.vlan = vlan;
      return this;
    }
  }

  protected BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype() { }

  protected BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.virtualNetworkInterface,
      "virtualNetworkInterface cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.interfaceType,
      "interfaceType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vlan,
      "vlan cannot be null");
    name = builder.name;
    virtualNetworkInterface = builder.virtualNetworkInterface;
    allowToFloat = builder.allowToFloat;
    interfaceType = builder.interfaceType;
    vlan = builder.vlan;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerNetworkAttachmentPrototypeBareMetalServerNetworkAttachmentByVLANPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

