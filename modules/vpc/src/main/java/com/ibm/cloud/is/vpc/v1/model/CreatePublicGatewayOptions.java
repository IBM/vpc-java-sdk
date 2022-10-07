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
 * The createPublicGateway options.
 */
public class CreatePublicGatewayOptions extends GenericModel {

  protected VPCIdentity vpc;
  protected ZoneIdentity zone;
  protected PublicGatewayFloatingIPPrototype floatingIp;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private VPCIdentity vpc;
    private ZoneIdentity zone;
    private PublicGatewayFloatingIPPrototype floatingIp;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    /**
     * Instantiates a new Builder from an existing CreatePublicGatewayOptions instance.
     *
     * @param createPublicGatewayOptions the instance to initialize the Builder with
     */
    private Builder(CreatePublicGatewayOptions createPublicGatewayOptions) {
      this.vpc = createPublicGatewayOptions.vpc;
      this.zone = createPublicGatewayOptions.zone;
      this.floatingIp = createPublicGatewayOptions.floatingIp;
      this.name = createPublicGatewayOptions.name;
      this.resourceGroup = createPublicGatewayOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpc the vpc
     * @param zone the zone
     */
    public Builder(VPCIdentity vpc, ZoneIdentity zone) {
      this.vpc = vpc;
      this.zone = zone;
    }

    /**
     * Builds a CreatePublicGatewayOptions.
     *
     * @return the new CreatePublicGatewayOptions instance
     */
    public CreatePublicGatewayOptions build() {
      return new CreatePublicGatewayOptions(this);
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the CreatePublicGatewayOptions builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreatePublicGatewayOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the floatingIp.
     *
     * @param floatingIp the floatingIp
     * @return the CreatePublicGatewayOptions builder
     */
    public Builder floatingIp(PublicGatewayFloatingIPPrototype floatingIp) {
      this.floatingIp = floatingIp;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreatePublicGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreatePublicGatewayOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreatePublicGatewayOptions() { }

  protected CreatePublicGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    vpc = builder.vpc;
    zone = builder.zone;
    floatingIp = builder.floatingIp;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreatePublicGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpc.
   *
   * The VPC this public gateway will reside in.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this public gateway will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the floatingIp.
   *
   * @return the floatingIp
   */
  public PublicGatewayFloatingIPPrototype floatingIp() {
    return floatingIp;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this public gateway. Names must be unique within the VPC the public gateway resides in.
   * If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

