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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createEndpointGateway options.
 */
public class CreateEndpointGatewayOptions extends GenericModel {

  protected EndpointGatewayTargetPrototype target;
  protected VPCIdentity vpc;
  protected List<EndpointGatewayReservedIP> ips;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;
  protected List<SecurityGroupIdentity> securityGroups;

  /**
   * Builder.
   */
  public static class Builder {
    private EndpointGatewayTargetPrototype target;
    private VPCIdentity vpc;
    private List<EndpointGatewayReservedIP> ips;
    private String name;
    private ResourceGroupIdentity resourceGroup;
    private List<SecurityGroupIdentity> securityGroups;

    private Builder(CreateEndpointGatewayOptions createEndpointGatewayOptions) {
      this.target = createEndpointGatewayOptions.target;
      this.vpc = createEndpointGatewayOptions.vpc;
      this.ips = createEndpointGatewayOptions.ips;
      this.name = createEndpointGatewayOptions.name;
      this.resourceGroup = createEndpointGatewayOptions.resourceGroup;
      this.securityGroups = createEndpointGatewayOptions.securityGroups;
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
     * @param vpc the vpc
     */
    public Builder(EndpointGatewayTargetPrototype target, VPCIdentity vpc) {
      this.target = target;
      this.vpc = vpc;
    }

    /**
     * Builds a CreateEndpointGatewayOptions.
     *
     * @return the new CreateEndpointGatewayOptions instance
     */
    public CreateEndpointGatewayOptions build() {
      return new CreateEndpointGatewayOptions(this);
    }

    /**
     * Adds an ips to ips.
     *
     * @param ips the new ips
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder addIps(EndpointGatewayReservedIP ips) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(ips,
        "ips cannot be null");
      if (this.ips == null) {
        this.ips = new ArrayList<EndpointGatewayReservedIP>();
      }
      this.ips.add(ips);
      return this;
    }

    /**
     * Adds an securityGroups to securityGroups.
     *
     * @param securityGroups the new securityGroups
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder addSecurityGroups(SecurityGroupIdentity securityGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(securityGroups,
        "securityGroups cannot be null");
      if (this.securityGroups == null) {
        this.securityGroups = new ArrayList<SecurityGroupIdentity>();
      }
      this.securityGroups.add(securityGroups);
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder target(EndpointGatewayTargetPrototype target) {
      this.target = target;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the ips.
     * Existing ips will be replaced.
     *
     * @param ips the ips
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder ips(List<EndpointGatewayReservedIP> ips) {
      this.ips = ips;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the securityGroups.
     * Existing securityGroups will be replaced.
     *
     * @param securityGroups the securityGroups
     * @return the CreateEndpointGatewayOptions builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }
  }

  protected CreateEndpointGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vpc,
      "vpc cannot be null");
    target = builder.target;
    vpc = builder.vpc;
    ips = builder.ips;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
    securityGroups = builder.securityGroups;
  }

  /**
   * New builder.
   *
   * @return a CreateEndpointGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * The target for this endpoint gateway.
   *
   * @return the target
   */
  public EndpointGatewayTargetPrototype target() {
    return target;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this endpoint gateway will serve.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the ips.
   *
   * The reserved IPs to bind to this endpoint gateway. At most one reserved IP per zone is allowed.
   *
   * @return the ips
   */
  public List<EndpointGatewayReservedIP> ips() {
    return ips;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this endpoint gateway. If unspecified, the name will be a hyphenated list of
   * randomly-selected words. Names must be unique within the VPC this endpoint gateway is serving.
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

  /**
   * Gets the securityGroups.
   *
   * The security groups to use for this endpoint gateway. If unspecified, the VPC's default security group is used.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupIdentity> securityGroups() {
    return securityGroups;
  }
}

