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
 * InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.
 */
public class InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface extends InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot {

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
    private VolumeAttachmentPrototypeInstanceBySourceSnapshotContext bootVolumeAttachment;
    private ZoneIdentity zone;
    private List<NetworkInterfacePrototype> networkInterfaces;
    private NetworkInterfacePrototype primaryNetworkInterface;

    /**
     * Instantiates a new Builder from an existing InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface instance.
     *
     * @param instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface the instance to initialize the Builder with
     */
    public Builder(InstanceTemplatePrototypeInstanceTemplateBySourceSnapshot instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface) {
      this.availabilityPolicy = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.availabilityPolicy;
      this.clusterNetworkAttachments = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.clusterNetworkAttachments;
      this.confidentialComputeMode = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.confidentialComputeMode;
      this.defaultTrustedProfile = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.defaultTrustedProfile;
      this.enableSecureBoot = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.enableSecureBoot;
      this.keys = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.keys;
      this.metadataService = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.metadataService;
      this.name = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.name;
      this.placementTarget = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.placementTarget;
      this.profile = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.profile;
      this.reservationAffinity = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.reservationAffinity;
      this.resourceGroup = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.resourceGroup;
      this.totalVolumeBandwidth = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.totalVolumeBandwidth;
      this.userData = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.userData;
      this.volumeAttachments = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.volumeAttachments;
      this.vpc = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.vpc;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceBySourceSnapshotContext) instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.bootVolumeAttachment;
      this.zone = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.zone;
      this.networkInterfaces = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.networkInterfaces;
      this.primaryNetworkInterface = instanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.primaryNetworkInterface;
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
     * @param primaryNetworkInterface the primaryNetworkInterface
     */
    public Builder(VolumeAttachmentPrototypeInstanceBySourceSnapshotContext bootVolumeAttachment, ZoneIdentity zone, NetworkInterfacePrototype primaryNetworkInterface) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      this.zone = zone;
      this.primaryNetworkInterface = primaryNetworkInterface;
    }

    /**
     * Builds a InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface.
     *
     * @return the new InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface instance
     */
    public InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface build() {
      return new InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface(this);
    }

    /**
     * Adds a new element to clusterNetworkAttachments.
     *
     * @param clusterNetworkAttachments the new element to be added
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder clusterNetworkAttachments(List<InstanceClusterNetworkAttachmentPrototypeInstanceContext> clusterNetworkAttachments) {
      this.clusterNetworkAttachments = clusterNetworkAttachments;
      return this;
    }

    /**
     * Set the confidentialComputeMode.
     *
     * @param confidentialComputeMode the confidentialComputeMode
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder confidentialComputeMode(String confidentialComputeMode) {
      this.confidentialComputeMode = confidentialComputeMode;
      return this;
    }

    /**
     * Set the defaultTrustedProfile.
     *
     * @param defaultTrustedProfile the defaultTrustedProfile
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder defaultTrustedProfile(InstanceDefaultTrustedProfilePrototype defaultTrustedProfile) {
      this.defaultTrustedProfile = defaultTrustedProfile;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder metadataService(InstanceMetadataServicePrototype metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder placementTarget(InstancePlacementTargetPrototype placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder reservationAffinity(InstanceReservationAffinityPrototype reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototype> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceBySourceSnapshotContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder networkInterfaces(List<NetworkInterfacePrototype> networkInterfaces) {
      this.networkInterfaces = networkInterfaces;
      return this;
    }

    /**
     * Set the primaryNetworkInterface.
     *
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
     */
    public Builder primaryNetworkInterface(NetworkInterfacePrototype primaryNetworkInterface) {
      this.primaryNetworkInterface = primaryNetworkInterface;
      return this;
    }
  }

  protected InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface() { }

  protected InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bootVolumeAttachment,
      "bootVolumeAttachment cannot be null");
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
    zone = builder.zone;
    networkInterfaces = builder.networkInterfaces;
    primaryNetworkInterface = builder.primaryNetworkInterface;
  }

  /**
   * New builder.
   *
   * @return a InstanceTemplatePrototypeInstanceTemplateBySourceSnapshotInstanceTemplateBySourceSnapshotInstanceByNetworkInterface builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

