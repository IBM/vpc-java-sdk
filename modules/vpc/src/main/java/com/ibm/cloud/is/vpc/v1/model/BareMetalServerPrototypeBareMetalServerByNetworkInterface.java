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
 * BareMetalServerPrototypeBareMetalServerByNetworkInterface.
 */
public class BareMetalServerPrototypeBareMetalServerByNetworkInterface extends BareMetalServerPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Long bandwidth;
    private Boolean enableSecureBoot;
    private BareMetalServerInitializationPrototype initialization;
    private BareMetalServerMetadataServicePrototype metadataService;
    private String name;
    private BareMetalServerProfileIdentity profile;
    private BareMetalServerReservationAffinityPrototype reservationAffinity;
    private ResourceGroupIdentity resourceGroup;
    private BareMetalServerTrustedPlatformModulePrototype trustedPlatformModule;
    private VPCIdentity vpc;
    private ZoneIdentity zone;
    private List<BareMetalServerNetworkInterfacePrototype> networkInterfaces;
    private BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface;

    /**
     * Instantiates a new Builder from an existing BareMetalServerPrototypeBareMetalServerByNetworkInterface instance.
     *
     * @param bareMetalServerPrototypeBareMetalServerByNetworkInterface the instance to initialize the Builder with
     */
    public Builder(BareMetalServerPrototype bareMetalServerPrototypeBareMetalServerByNetworkInterface) {
      this.bandwidth = bareMetalServerPrototypeBareMetalServerByNetworkInterface.bandwidth;
      this.enableSecureBoot = bareMetalServerPrototypeBareMetalServerByNetworkInterface.enableSecureBoot;
      this.initialization = bareMetalServerPrototypeBareMetalServerByNetworkInterface.initialization;
      this.metadataService = bareMetalServerPrototypeBareMetalServerByNetworkInterface.metadataService;
      this.name = bareMetalServerPrototypeBareMetalServerByNetworkInterface.name;
      this.profile = bareMetalServerPrototypeBareMetalServerByNetworkInterface.profile;
      this.reservationAffinity = bareMetalServerPrototypeBareMetalServerByNetworkInterface.reservationAffinity;
      this.resourceGroup = bareMetalServerPrototypeBareMetalServerByNetworkInterface.resourceGroup;
      this.trustedPlatformModule = bareMetalServerPrototypeBareMetalServerByNetworkInterface.trustedPlatformModule;
      this.vpc = bareMetalServerPrototypeBareMetalServerByNetworkInterface.vpc;
      this.zone = bareMetalServerPrototypeBareMetalServerByNetworkInterface.zone;
      this.networkInterfaces = bareMetalServerPrototypeBareMetalServerByNetworkInterface.networkInterfaces;
      this.primaryNetworkInterface = bareMetalServerPrototypeBareMetalServerByNetworkInterface.primaryNetworkInterface;
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
     * @param profile the profile
     * @param zone the zone
     * @param primaryNetworkInterface the primaryNetworkInterface
     */
    public Builder(BareMetalServerInitializationPrototype initialization, BareMetalServerProfileIdentity profile, ZoneIdentity zone, BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface) {
      this.initialization = initialization;
      this.profile = profile;
      this.zone = zone;
      this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * Builds a BareMetalServerPrototypeBareMetalServerByNetworkInterface.
     *
     * @return the new BareMetalServerPrototypeBareMetalServerByNetworkInterface instance
     */
    public BareMetalServerPrototypeBareMetalServerByNetworkInterface build() {
      return new BareMetalServerPrototypeBareMetalServerByNetworkInterface(this);
    }

    /**
     * Adds a new element to networkInterfaces.
     *
     * @param networkInterfaces the new element to be added
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
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
     * Set the bandwidth.
     *
     * @param bandwidth the bandwidth
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder bandwidth(long bandwidth) {
      this.bandwidth = bandwidth;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder enableSecureBoot(Boolean enableSecureBoot) {
      this.enableSecureBoot = enableSecureBoot;
      return this;
    }

    /**
     * Set the initialization.
     *
     * @param initialization the initialization
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder initialization(BareMetalServerInitializationPrototype initialization) {
      this.initialization = initialization;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder metadataService(BareMetalServerMetadataServicePrototype metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder profile(BareMetalServerProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder reservationAffinity(BareMetalServerReservationAffinityPrototype reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the trustedPlatformModule.
     *
     * @param trustedPlatformModule the trustedPlatformModule
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder trustedPlatformModule(BareMetalServerTrustedPlatformModulePrototype trustedPlatformModule) {
      this.trustedPlatformModule = trustedPlatformModule;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the networkInterfaces.
     * Existing networkInterfaces will be replaced.
     *
     * @param networkInterfaces the networkInterfaces
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder networkInterfaces(List<BareMetalServerNetworkInterfacePrototype> networkInterfaces) {
      this.networkInterfaces = networkInterfaces;
      return this;
    }

    /**
     * Set the primaryNetworkInterface.
     *
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
     */
    public Builder primaryNetworkInterface(BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface) {
      this.primaryNetworkInterface = primaryNetworkInterface;
      return this;
    }
  }

  protected BareMetalServerPrototypeBareMetalServerByNetworkInterface() { }

  protected BareMetalServerPrototypeBareMetalServerByNetworkInterface(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.initialization,
      "initialization cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryNetworkInterface,
      "primaryNetworkInterface cannot be null");
    bandwidth = builder.bandwidth;
    enableSecureBoot = builder.enableSecureBoot;
    initialization = builder.initialization;
    metadataService = builder.metadataService;
    name = builder.name;
    profile = builder.profile;
    reservationAffinity = builder.reservationAffinity;
    resourceGroup = builder.resourceGroup;
    trustedPlatformModule = builder.trustedPlatformModule;
    vpc = builder.vpc;
    zone = builder.zone;
    networkInterfaces = builder.networkInterfaces;
    primaryNetworkInterface = builder.primaryNetworkInterface;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerPrototypeBareMetalServerByNetworkInterface builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

