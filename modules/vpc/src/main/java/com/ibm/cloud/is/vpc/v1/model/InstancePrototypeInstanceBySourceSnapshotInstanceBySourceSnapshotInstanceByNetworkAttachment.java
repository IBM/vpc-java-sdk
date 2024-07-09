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
 * InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.
 */
public class InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment extends InstancePrototypeInstanceBySourceSnapshot {

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
    private VolumeAttachmentPrototypeInstanceBySourceSnapshotContext bootVolumeAttachment;
    private ZoneIdentity zone;
    private List<InstanceNetworkAttachmentPrototype> networkAttachments;
    private InstanceNetworkAttachmentPrototype primaryNetworkAttachment;

    /**
     * Instantiates a new Builder from an existing InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment instance.
     *
     * @param instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment the instance to initialize the Builder with
     */
    public Builder(InstancePrototypeInstanceBySourceSnapshot instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment) {
      this.availabilityPolicy = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.availabilityPolicy;
      this.confidentialComputeMode = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.confidentialComputeMode;
      this.defaultTrustedProfile = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.defaultTrustedProfile;
      this.enableSecureBoot = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.enableSecureBoot;
      this.keys = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.keys;
      this.metadataService = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.metadataService;
      this.name = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.name;
      this.placementTarget = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.placementTarget;
      this.profile = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.profile;
      this.reservationAffinity = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.reservationAffinity;
      this.resourceGroup = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.resourceGroup;
      this.totalVolumeBandwidth = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.totalVolumeBandwidth;
      this.userData = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.userData;
      this.volumeAttachments = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.volumeAttachments;
      this.vpc = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.vpc;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceBySourceSnapshotContext) instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.bootVolumeAttachment;
      this.zone = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.zone;
      this.networkAttachments = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.networkAttachments;
      this.primaryNetworkAttachment = instancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.primaryNetworkAttachment;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @param zone the zone
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     */
    public Builder(VolumeAttachmentPrototypeInstanceBySourceSnapshotContext bootVolumeAttachment, ZoneIdentity zone, InstanceNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      this.zone = zone;
      this.primaryNetworkAttachment = primaryNetworkAttachment;
    }

    /**
     * Builds a InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment.
     *
     * @return the new InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment instance
     */
    public InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment build() {
      return new InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment(this);
    }

    /**
     * Adds a new element to keys.
     *
     * @param keys the new element to be added
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder availabilityPolicy(InstanceAvailabilityPolicyPrototype availabilityPolicy) {
      this.availabilityPolicy = availabilityPolicy;
      return this;
    }

    /**
     * Set the confidentialComputeMode.
     *
     * @param confidentialComputeMode the confidentialComputeMode
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder confidentialComputeMode(String confidentialComputeMode) {
      this.confidentialComputeMode = confidentialComputeMode;
      return this;
    }

    /**
     * Set the defaultTrustedProfile.
     *
     * @param defaultTrustedProfile the defaultTrustedProfile
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder defaultTrustedProfile(InstanceDefaultTrustedProfilePrototype defaultTrustedProfile) {
      this.defaultTrustedProfile = defaultTrustedProfile;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder metadataService(InstanceMetadataServicePrototype metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder placementTarget(InstancePlacementTargetPrototype placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder reservationAffinity(InstanceReservationAffinityPrototype reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototype> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceBySourceSnapshotContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder networkAttachments(List<InstanceNetworkAttachmentPrototype> networkAttachments) {
      this.networkAttachments = networkAttachments;
      return this;
    }

    /**
     * Set the primaryNetworkAttachment.
     *
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     * @return the InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
     */
    public Builder primaryNetworkAttachment(InstanceNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.primaryNetworkAttachment = primaryNetworkAttachment;
      return this;
    }
  }

  protected InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment() { }

  protected InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bootVolumeAttachment,
      "bootVolumeAttachment cannot be null");
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
    zone = builder.zone;
    networkAttachments = builder.networkAttachments;
    primaryNetworkAttachment = builder.primaryNetworkAttachment;
  }

  /**
   * New builder.
   *
   * @return a InstancePrototypeInstanceBySourceSnapshotInstanceBySourceSnapshotInstanceByNetworkAttachment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

