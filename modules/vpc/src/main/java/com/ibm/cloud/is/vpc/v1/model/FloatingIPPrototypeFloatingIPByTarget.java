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

/**
 * FloatingIPPrototypeFloatingIPByTarget.
 */
public class FloatingIPPrototypeFloatingIPByTarget extends FloatingIPPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private FloatingIPByTargetNetworkInterfaceIdentity target;

    /**
     * Instantiates a new Builder from an existing FloatingIPPrototypeFloatingIPByTarget instance.
     *
     * @param floatingIpPrototypeFloatingIpByTarget the instance to initialize the Builder with
     */
    public Builder(FloatingIPPrototype floatingIpPrototypeFloatingIpByTarget) {
      this.name = floatingIpPrototypeFloatingIpByTarget.name;
      this.resourceGroup = floatingIpPrototypeFloatingIpByTarget.resourceGroup;
      this.target = floatingIpPrototypeFloatingIpByTarget.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param target the target
     */
    public Builder(FloatingIPByTargetNetworkInterfaceIdentity target) {
      this.target = target;
    }

    /**
     * Builds a FloatingIPPrototypeFloatingIPByTarget.
     *
     * @return the new FloatingIPPrototypeFloatingIPByTarget instance
     */
    public FloatingIPPrototypeFloatingIPByTarget build() {
      return new FloatingIPPrototypeFloatingIPByTarget(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the FloatingIPPrototypeFloatingIPByTarget builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the FloatingIPPrototypeFloatingIPByTarget builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the FloatingIPPrototypeFloatingIPByTarget builder
     */
    public Builder target(FloatingIPByTargetNetworkInterfaceIdentity target) {
      this.target = target;
      return this;
    }
  }

  protected FloatingIPPrototypeFloatingIPByTarget() { }

  protected FloatingIPPrototypeFloatingIPByTarget(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a FloatingIPPrototypeFloatingIPByTarget builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

