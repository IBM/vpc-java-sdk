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
 * The createBareMetalServer options.
 */
public class CreateBareMetalServerOptions extends GenericModel {

  protected BareMetalServerInitializationPrototype initialization;
  protected BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface;
  protected BareMetalServerProfileIdentity profile;
  protected ZoneIdentity zone;
  protected String name;
  protected List<BareMetalServerNetworkInterfacePrototype> networkInterfaces;
  protected ResourceGroupIdentity resourceGroup;
  protected VPCIdentity vpc;

  /**
   * Builder.
   */
  public static class Builder {
    private BareMetalServerInitializationPrototype initialization;
    private BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface;
    private BareMetalServerProfileIdentity profile;
    private ZoneIdentity zone;
    private String name;
    private List<BareMetalServerNetworkInterfacePrototype> networkInterfaces;
    private ResourceGroupIdentity resourceGroup;
    private VPCIdentity vpc;

    private Builder(CreateBareMetalServerOptions createBareMetalServerOptions) {
      this.initialization = createBareMetalServerOptions.initialization;
      this.primaryNetworkInterface = createBareMetalServerOptions.primaryNetworkInterface;
      this.profile = createBareMetalServerOptions.profile;
      this.zone = createBareMetalServerOptions.zone;
      this.name = createBareMetalServerOptions.name;
      this.networkInterfaces = createBareMetalServerOptions.networkInterfaces;
      this.resourceGroup = createBareMetalServerOptions.resourceGroup;
      this.vpc = createBareMetalServerOptions.vpc;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param initialization the initialization
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @param profile the profile
     * @param zone the zone
     */
    public Builder(BareMetalServerInitializationPrototype initialization, BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface, BareMetalServerProfileIdentity profile, ZoneIdentity zone) {
      this.initialization = initialization;
      this.primaryNetworkInterface = primaryNetworkInterface;
      this.profile = profile;
      this.zone = zone;
    }

    /**
     * Builds a CreateBareMetalServerOptions.
     *
     * @return the new CreateBareMetalServerOptions instance
     */
    public CreateBareMetalServerOptions build() {
      return new CreateBareMetalServerOptions(this);
    }

    /**
     * Adds an networkInterfaces to networkInterfaces.
     *
     * @param networkInterfaces the new networkInterfaces
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder addNetworkInterfaces(BareMetalServerNetworkInterfacePrototype networkInterfaces) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(networkInterfaces,
        "networkInterfaces cannot be null");
      if (this.networkInterfaces == null) {
        this.networkInterfaces = new ArrayList<BareMetalServerNetworkInterfacePrototype>();
      }
      this.networkInterfaces.add(networkInterfaces);
      return this;
    }

    /**
     * Set the initialization.
     *
     * @param initialization the initialization
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder initialization(BareMetalServerInitializationPrototype initialization) {
      this.initialization = initialization;
      return this;
    }

    /**
     * Set the primaryNetworkInterface.
     *
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder primaryNetworkInterface(BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface) {
      this.primaryNetworkInterface = primaryNetworkInterface;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder profile(BareMetalServerProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkInterfaces.
     * Existing networkInterfaces will be replaced.
     *
     * @param networkInterfaces the networkInterfaces
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder networkInterfaces(List<BareMetalServerNetworkInterfacePrototype> networkInterfaces) {
      this.networkInterfaces = networkInterfaces;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the CreateBareMetalServerOptions builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }
  }

  protected CreateBareMetalServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.initialization,
      "initialization cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryNetworkInterface,
      "primaryNetworkInterface cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    initialization = builder.initialization;
    primaryNetworkInterface = builder.primaryNetworkInterface;
    profile = builder.profile;
    zone = builder.zone;
    name = builder.name;
    networkInterfaces = builder.networkInterfaces;
    resourceGroup = builder.resourceGroup;
    vpc = builder.vpc;
  }

  /**
   * New builder.
   *
   * @return a CreateBareMetalServerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the initialization.
   *
   * @return the initialization
   */
  public BareMetalServerInitializationPrototype initialization() {
    return initialization;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * Primary network interface for the bare metal server.
   *
   * @return the primaryNetworkInterface
   */
  public BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this bare metal server.
   *
   * @return the profile
   */
  public BareMetalServerProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the zone.
   *
   * The zone this bare metal server will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this bare metal server (and default system hostname). If unspecified, the name
   * will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The additional network interfaces to create for the bare metal server.
   *
   * @return the networkInterfaces
   */
  public List<BareMetalServerNetworkInterfacePrototype> networkInterfaces() {
    return networkInterfaces;
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
   * Gets the vpc.
   *
   * The VPC the bare metal server is to be a part of. If specified, it must match the
   * VPC referenced by the subnets of the server's network interfaces.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }
}

