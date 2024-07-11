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
 * InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.
 */
public class InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment extends InstancePrototypeInstanceByCatalogOffering {

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
  }


  /**
   * Builder.
   */
  public static class Builder {
    private InstanceAvailabilityPolicyPrototype availabilityPolicy;
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
    private List<InstanceNetworkAttachmentPrototype> networkAttachments;
    private InstanceNetworkAttachmentPrototype primaryNetworkAttachment;

    /**
     * Instantiates a new Builder from an existing InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment instance.
     *
     * @param instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment the instance to initialize the Builder with
     */
    public Builder(InstancePrototypeInstanceByCatalogOffering instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment) {
      this.availabilityPolicy = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.availabilityPolicy;
      this.confidentialComputeMode = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.confidentialComputeMode;
      this.defaultTrustedProfile = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.defaultTrustedProfile;
      this.enableSecureBoot = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.enableSecureBoot;
      this.keys = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.keys;
      this.metadataService = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.metadataService;
      this.name = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.name;
      this.placementTarget = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.placementTarget;
      this.profile = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.profile;
      this.reservationAffinity = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.reservationAffinity;
      this.resourceGroup = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.resourceGroup;
      this.totalVolumeBandwidth = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.totalVolumeBandwidth;
      this.userData = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.userData;
      this.volumeAttachments = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.volumeAttachments;
      this.vpc = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.vpc;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceByImageContext) instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.bootVolumeAttachment;
      this.catalogOffering = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.catalogOffering;
      this.zone = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.zone;
      this.networkAttachments = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.networkAttachments;
      this.primaryNetworkAttachment = instancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.primaryNetworkAttachment;
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
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     */
    public Builder(InstanceCatalogOfferingPrototype catalogOffering, ZoneIdentity zone, InstanceNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.catalogOffering = catalogOffering;
      this.zone = zone;
      this.primaryNetworkAttachment = primaryNetworkAttachment;
    }

    /**
     * Builds a InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment.
     *
     * @return the new InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment instance
     */
    public InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment build() {
      return new InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment(this);
    }

    /**
     * Adds a new element to keys.
     *
     * @param keys the new element to be added
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
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
     * Adds a new element to networkAttachments.
     *
     * @param networkAttachments the new element to be added
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder addNetworkAttachments(InstanceNetworkAttachmentPrototype networkAttachments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(networkAttachments,
        "networkAttachments cannot be null");
      if (this.networkAttachments == null) {
        this.networkAttachments = new ArrayList<InstanceNetworkAttachmentPrototype>();
      }
      this.networkAttachments.add(networkAttachments);
      return this;
    }

    /**
     * Set the availabilityPolicy.
     *
     * @param availabilityPolicy the availabilityPolicy
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder availabilityPolicy(InstanceAvailabilityPolicyPrototype availabilityPolicy) {
      this.availabilityPolicy = availabilityPolicy;
      return this;
    }

    /**
     * Set the confidentialComputeMode.
     *
     * @param confidentialComputeMode the confidentialComputeMode
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder confidentialComputeMode(String confidentialComputeMode) {
      this.confidentialComputeMode = confidentialComputeMode;
      return this;
    }

    /**
     * Set the defaultTrustedProfile.
     *
     * @param defaultTrustedProfile the defaultTrustedProfile
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder defaultTrustedProfile(InstanceDefaultTrustedProfilePrototype defaultTrustedProfile) {
      this.defaultTrustedProfile = defaultTrustedProfile;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder metadataService(InstanceMetadataServicePrototype metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder placementTarget(InstancePlacementTargetPrototype placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder reservationAffinity(InstanceReservationAffinityPrototype reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototype> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the catalogOffering.
     *
     * @param catalogOffering the catalogOffering
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder catalogOffering(InstanceCatalogOfferingPrototype catalogOffering) {
      this.catalogOffering = catalogOffering;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder networkAttachments(List<InstanceNetworkAttachmentPrototype> networkAttachments) {
      this.networkAttachments = networkAttachments;
      return this;
    }

    /**
     * Set the primaryNetworkAttachment.
     *
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     * @return the InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
     */
    public Builder primaryNetworkAttachment(InstanceNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.primaryNetworkAttachment = primaryNetworkAttachment;
      return this;
    }
  }

  protected InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment() { }

  protected InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogOffering,
      "catalogOffering cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryNetworkAttachment,
      "primaryNetworkAttachment cannot be null");
    availabilityPolicy = builder.availabilityPolicy;
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
    networkAttachments = builder.networkAttachments;
    primaryNetworkAttachment = builder.primaryNetworkAttachment;
  }

  /**
   * New builder.
   *
   * @return a InstancePrototypeInstanceByCatalogOfferingInstanceByCatalogOfferingInstanceByNetworkAttachment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

