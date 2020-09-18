/*
 * (C) Copyright IBM Corp. 2020.
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
 * PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext.
 */
public class PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext extends PublicGatewayPrototypeFloatingIp {


  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private ResourceGroupIdentity resourceGroup;

    public Builder(PublicGatewayPrototypeFloatingIp publicGatewayPrototypeFloatingIpFloatingIpPrototypeTargetContext) {
      this.name = publicGatewayPrototypeFloatingIpFloatingIpPrototypeTargetContext.name;
      this.resourceGroup = publicGatewayPrototypeFloatingIpFloatingIpPrototypeTargetContext.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext.
     *
     * @return the new PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext instance
     */
    public PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext build() {
      return new PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext(Builder builder) {
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a PublicGatewayPrototypeFloatingIpFloatingIPPrototypeTargetContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

