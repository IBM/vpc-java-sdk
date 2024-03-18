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

import java.util.ArrayList;
import java.util.List;

/**
 * BareMetalServerPrototypeBareMetalServerByNetworkAttachment.
 */
public class BareMetalServerPrototypeBareMetalServerByNetworkAttachment extends BareMetalServerPrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enableSecureBoot;
    private BareMetalServerInitializationPrototype initialization;
    private String name;
    private BareMetalServerProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private BareMetalServerTrustedPlatformModulePrototype trustedPlatformModule;
    private VPCIdentity vpc;
    private ZoneIdentity zone;
    private List<BareMetalServerNetworkAttachmentPrototype> networkAttachments;
    private BareMetalServerPrimaryNetworkAttachmentPrototype primaryNetworkAttachment;

    /**
     * Instantiates a new Builder from an existing BareMetalServerPrototypeBareMetalServerByNetworkAttachment instance.
     *
     * @param bareMetalServerPrototypeBareMetalServerByNetworkAttachment the instance to initialize the Builder with
     */
    public Builder(BareMetalServerPrototype bareMetalServerPrototypeBareMetalServerByNetworkAttachment) {
      this.enableSecureBoot = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.enableSecureBoot;
      this.initialization = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.initialization;
      this.name = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.name;
      this.profile = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.profile;
      this.resourceGroup = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.resourceGroup;
      this.trustedPlatformModule = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.trustedPlatformModule;
      this.vpc = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.vpc;
      this.zone = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.zone;
      this.networkAttachments = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.networkAttachments;
      this.primaryNetworkAttachment = bareMetalServerPrototypeBareMetalServerByNetworkAttachment.primaryNetworkAttachment;
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
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     */
    public Builder(BareMetalServerInitializationPrototype initialization, BareMetalServerProfileIdentity profile, ZoneIdentity zone, BareMetalServerPrimaryNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.initialization = initialization;
      this.profile = profile;
      this.zone = zone;
      this.primaryNetworkAttachment = primaryNetworkAttachment;
    }

    /**
     * Builds a BareMetalServerPrototypeBareMetalServerByNetworkAttachment.
     *
     * @return the new BareMetalServerPrototypeBareMetalServerByNetworkAttachment instance
     */
    public BareMetalServerPrototypeBareMetalServerByNetworkAttachment build() {
      return new BareMetalServerPrototypeBareMetalServerByNetworkAttachment(this);
    }

    /**
     * Adds a new element to networkAttachments.
     *
     * @param networkAttachments the new element to be added
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder addNetworkAttachments(BareMetalServerNetworkAttachmentPrototype networkAttachments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(networkAttachments,
        "networkAttachments cannot be null");
      if (this.networkAttachments == null) {
        this.networkAttachments = new ArrayList<BareMetalServerNetworkAttachmentPrototype>();
      }
      this.networkAttachments.add(networkAttachments);
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder enableSecureBoot(Boolean enableSecureBoot) {
      this.enableSecureBoot = enableSecureBoot;
      return this;
    }

    /**
     * Set the initialization.
     *
     * @param initialization the initialization
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder initialization(BareMetalServerInitializationPrototype initialization) {
      this.initialization = initialization;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder profile(BareMetalServerProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the trustedPlatformModule.
     *
     * @param trustedPlatformModule the trustedPlatformModule
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder trustedPlatformModule(BareMetalServerTrustedPlatformModulePrototype trustedPlatformModule) {
      this.trustedPlatformModule = trustedPlatformModule;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }

    /**
     * Set the networkAttachments.
     * Existing networkAttachments will be replaced.
     *
     * @param networkAttachments the networkAttachments
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder networkAttachments(List<BareMetalServerNetworkAttachmentPrototype> networkAttachments) {
      this.networkAttachments = networkAttachments;
      return this;
    }

    /**
     * Set the primaryNetworkAttachment.
     *
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     * @return the BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
     */
    public Builder primaryNetworkAttachment(BareMetalServerPrimaryNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.primaryNetworkAttachment = primaryNetworkAttachment;
      return this;
    }
  }

  protected BareMetalServerPrototypeBareMetalServerByNetworkAttachment() { }

  protected BareMetalServerPrototypeBareMetalServerByNetworkAttachment(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.initialization,
      "initialization cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.profile,
      "profile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryNetworkAttachment,
      "primaryNetworkAttachment cannot be null");
    enableSecureBoot = builder.enableSecureBoot;
    initialization = builder.initialization;
    name = builder.name;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    trustedPlatformModule = builder.trustedPlatformModule;
    vpc = builder.vpc;
    zone = builder.zone;
    networkAttachments = builder.networkAttachments;
    primaryNetworkAttachment = builder.primaryNetworkAttachment;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerPrototypeBareMetalServerByNetworkAttachment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

