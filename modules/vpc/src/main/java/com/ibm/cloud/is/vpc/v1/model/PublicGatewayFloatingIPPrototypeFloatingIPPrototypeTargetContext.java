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
 * PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext.
 */
public class PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext extends PublicGatewayFloatingIPPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;

    public Builder(PublicGatewayFloatingIPPrototype publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContext) {
      this.name = publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContext.name;
      this.resourceGroup = publicGatewayFloatingIpPrototypeFloatingIpPrototypeTargetContext.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext.
     *
     * @return the new PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext instance
     */
    public PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext build() {
      return new PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext(Builder builder) {
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a PublicGatewayFloatingIPPrototypeFloatingIPPrototypeTargetContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

