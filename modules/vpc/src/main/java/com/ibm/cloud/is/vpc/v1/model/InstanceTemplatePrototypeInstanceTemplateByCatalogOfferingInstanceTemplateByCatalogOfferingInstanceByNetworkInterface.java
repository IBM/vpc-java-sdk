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
 * InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.
 */
public class InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface extends InstanceTemplatePrototypeInstanceTemplateByCatalogOffering {

  /**
   * The confidential compute mode to use for this virtual server instance.
   *
   * If unspecified, the default confidential compute mode from the profile will be used.
   */
  public interface ConfidentialComputeMode {
    /** disabled. */
    String DISABLED = "disabled";
    /** sgx. */
    String SGX = "sgx";
    /** tdx. */
    String TDX = "tdx";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private InstanceAvailabilityPolicyPrototype availabilityPolicy;
    private List<InstanceClusterNetworkAttachmentPrototypeInstanceContext> clusterNetworkAttachments;
    private String confidentialComputeMode;
    private InstanceDefaultTrustedProfilePrototype defaultTrustedProfile;
    private Boolean enableSecureBoot;
    private List<KeyIdentity> keys;
    private InstanceMetadataServicePrototype metadataService;
    private String name;
    private InstancePlacementTargetPrototype placementTarget;
    private InstanceProfileIdentity profile;
    private InstanceReservationAffinityPrototype reservationAffinity;
    private ResourceGroupIdentity resourceGroup;
    private Long totalVolumeBandwidth;
    private String userData;
    private List<VolumeAttachmentPrototype> volumeAttachments;
    private VPCIdentity vpc;
    private VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment;
    private InstanceCatalogOfferingPrototype catalogOffering;
    private ZoneIdentity zone;
    private List<NetworkInterfacePrototype> networkInterfaces;
    private NetworkInterfacePrototype primaryNetworkInterface;

    /**
     * Instantiates a new Builder from an existing InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface instance.
     *
     * @param instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface the instance to initialize the Builder with
     */
    public Builder(InstanceTemplatePrototypeInstanceTemplateByCatalogOffering instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface) {
      this.availabilityPolicy = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.availabilityPolicy;
      this.clusterNetworkAttachments = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.clusterNetworkAttachments;
      this.confidentialComputeMode = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.confidentialComputeMode;
      this.defaultTrustedProfile = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.defaultTrustedProfile;
      this.enableSecureBoot = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.enableSecureBoot;
      this.keys = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.keys;
      this.metadataService = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.metadataService;
      this.name = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.name;
      this.placementTarget = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.placementTarget;
      this.profile = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.profile;
      this.reservationAffinity = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.reservationAffinity;
      this.resourceGroup = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.resourceGroup;
      this.totalVolumeBandwidth = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.totalVolumeBandwidth;
      this.userData = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.userData;
      this.volumeAttachments = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.volumeAttachments;
      this.vpc = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.vpc;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceByImageContext) instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.bootVolumeAttachment;
      this.catalogOffering = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.catalogOffering;
      this.zone = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.zone;
      this.networkInterfaces = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.networkInterfaces;
      this.primaryNetworkInterface = instanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.primaryNetworkInterface;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogOffering the catalogOffering
     * @param zone the zone
     * @param primaryNetworkInterface the primaryNetworkInterface
     */
    public Builder(InstanceCatalogOfferingPrototype catalogOffering, ZoneIdentity zone, NetworkInterfacePrototype primaryNetworkInterface) {
      this.catalogOffering = catalogOffering;
      this.zone = zone;
      this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * Builds a InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface.
     *
     * @return the new InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface instance
     */
    public InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface build() {
      return new InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface(this);
    }

    /**
     * Adds a new element to clusterNetworkAttachments.
     *
     * @param clusterNetworkAttachments the new element to be added
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder addClusterNetworkAttachments(InstanceClusterNetworkAttachmentPrototypeInstanceContext clusterNetworkAttachments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(clusterNetworkAttachments,
        "clusterNetworkAttachments cannot be null");
      if (this.clusterNetworkAttachments == null) {
        this.clusterNetworkAttachments = new ArrayList<InstanceClusterNetworkAttachmentPrototypeInstanceContext>();
      }
      this.clusterNetworkAttachments.add(clusterNetworkAttachments);
      return this;
    }

    /**
     * Adds a new element to keys.
     *
     * @param keys the new element to be added
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder addKeys(KeyIdentity keys) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keys,
        "keys cannot be null");
      if (this.keys == null) {
        this.keys = new ArrayList<KeyIdentity>();
      }
      this.keys.add(keys);
      return this;
    }

    /**
     * Adds a new element to volumeAttachments.
     *
     * @param volumeAttachments the new element to be added
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder addVolumeAttachments(VolumeAttachmentPrototype volumeAttachments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(volumeAttachments,
        "volumeAttachments cannot be null");
      if (this.volumeAttachments == null) {
        this.volumeAttachments = new ArrayList<VolumeAttachmentPrototype>();
      }
      this.volumeAttachments.add(volumeAttachments);
      return this;
    }

    /**
     * Adds a new element to networkInterfaces.
     *
     * @param networkInterfaces the new element to be added
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder addNetworkInterfaces(NetworkInterfacePrototype networkInterfaces) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(networkInterfaces,
        "networkInterfaces cannot be null");
      if (this.networkInterfaces == null) {
        this.networkInterfaces = new ArrayList<NetworkInterfacePrototype>();
      }
      this.networkInterfaces.add(networkInterfaces);
      return this;
    }

    /**
     * Set the availabilityPolicy.
     *
     * @param availabilityPolicy the availabilityPolicy
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder availabilityPolicy(InstanceAvailabilityPolicyPrototype availabilityPolicy) {
      this.availabilityPolicy = availabilityPolicy;
      return this;
    }

    /**
     * Set the clusterNetworkAttachments.
     * Existing clusterNetworkAttachments will be replaced.
     *
     * @param clusterNetworkAttachments the clusterNetworkAttachments
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder clusterNetworkAttachments(List<InstanceClusterNetworkAttachmentPrototypeInstanceContext> clusterNetworkAttachments) {
      this.clusterNetworkAttachments = clusterNetworkAttachments;
      return this;
    }

    /**
     * Set the confidentialComputeMode.
     *
     * @param confidentialComputeMode the confidentialComputeMode
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder confidentialComputeMode(String confidentialComputeMode) {
      this.confidentialComputeMode = confidentialComputeMode;
      return this;
    }

    /**
     * Set the defaultTrustedProfile.
     *
     * @param defaultTrustedProfile the defaultTrustedProfile
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder defaultTrustedProfile(InstanceDefaultTrustedProfilePrototype defaultTrustedProfile) {
      this.defaultTrustedProfile = defaultTrustedProfile;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder enableSecureBoot(Boolean enableSecureBoot) {
      this.enableSecureBoot = enableSecureBoot;
      return this;
    }

    /**
     * Set the keys.
     * Existing keys will be replaced.
     *
     * @param keys the keys
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder metadataService(InstanceMetadataServicePrototype metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder placementTarget(InstancePlacementTargetPrototype placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder reservationAffinity(InstanceReservationAffinityPrototype reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder userData(String userData) {
      this.userData = userData;
      return this;
    }

    /**
     * Set the volumeAttachments.
     * Existing volumeAttachments will be replaced.
     *
     * @param volumeAttachments the volumeAttachments
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototype> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the catalogOffering.
     *
     * @param catalogOffering the catalogOffering
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder catalogOffering(InstanceCatalogOfferingPrototype catalogOffering) {
      this.catalogOffering = catalogOffering;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder networkInterfaces(List<NetworkInterfacePrototype> networkInterfaces) {
      this.networkInterfaces = networkInterfaces;
      return this;
    }

    /**
     * Set the primaryNetworkInterface.
     *
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @return the InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
     */
    public Builder primaryNetworkInterface(NetworkInterfacePrototype primaryNetworkInterface) {
      this.primaryNetworkInterface = primaryNetworkInterface;
      return this;
    }
  }

  protected InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface() { }

  protected InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogOffering,
      "catalogOffering cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryNetworkInterface,
      "primaryNetworkInterface cannot be null");
    availabilityPolicy = builder.availabilityPolicy;
    clusterNetworkAttachments = builder.clusterNetworkAttachments;
    confidentialComputeMode = builder.confidentialComputeMode;
    defaultTrustedProfile = builder.defaultTrustedProfile;
    enableSecureBoot = builder.enableSecureBoot;
    keys = builder.keys;
    metadataService = builder.metadataService;
    name = builder.name;
    placementTarget = builder.placementTarget;
    profile = builder.profile;
    reservationAffinity = builder.reservationAffinity;
    resourceGroup = builder.resourceGroup;
    totalVolumeBandwidth = builder.totalVolumeBandwidth;
    userData = builder.userData;
    volumeAttachments = builder.volumeAttachments;
    vpc = builder.vpc;
    bootVolumeAttachment = builder.bootVolumeAttachment;
    catalogOffering = builder.catalogOffering;
    zone = builder.zone;
    networkInterfaces = builder.networkInterfaces;
    primaryNetworkInterface = builder.primaryNetworkInterface;
  }

  /**
   * New builder.
   *
   * @return a InstanceTemplatePrototypeInstanceTemplateByCatalogOfferingInstanceTemplateByCatalogOfferingInstanceByNetworkInterface builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

