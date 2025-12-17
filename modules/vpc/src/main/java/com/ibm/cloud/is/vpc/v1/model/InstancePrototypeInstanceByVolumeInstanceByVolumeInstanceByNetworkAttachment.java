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
 * InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.
 */
public class InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment extends InstancePrototypeInstanceByVolume {

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
   * The volume bandwidth QoS mode to use for this virtual server instance. The specified value must be listed in the
   * instance profile's `volume_bandwidth_qos_modes`.
   *
   * If unspecified, the default volume bandwidth QoS mode from the profile will be used.
   */
  public interface VolumeBandwidthQosMode {
    /** pooled. */
    String POOLED = "pooled";
    /** weighted. */
    String WEIGHTED = "weighted";
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
    private InstanceVCPUPrototype vcpu;
    private List<VolumeAttachmentPrototype> volumeAttachments;
    private String volumeBandwidthQosMode;
    private VPCIdentity vpc;
    private VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment;
    private ZoneIdentity zone;
    private List<InstanceNetworkAttachmentPrototype> networkAttachments;
    private InstanceNetworkAttachmentPrototype primaryNetworkAttachment;

    /**
     * Instantiates a new Builder from an existing InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment instance.
     *
     * @param instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment the instance to initialize the Builder with
     */
    public Builder(InstancePrototypeInstanceByVolume instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment) {
      this.availabilityPolicy = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.availabilityPolicy;
      this.clusterNetworkAttachments = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.clusterNetworkAttachments;
      this.confidentialComputeMode = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.confidentialComputeMode;
      this.defaultTrustedProfile = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.defaultTrustedProfile;
      this.enableSecureBoot = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.enableSecureBoot;
      this.keys = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.keys;
      this.metadataService = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.metadataService;
      this.name = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.name;
      this.placementTarget = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.placementTarget;
      this.profile = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.profile;
      this.reservationAffinity = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.reservationAffinity;
      this.resourceGroup = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.resourceGroup;
      this.totalVolumeBandwidth = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.totalVolumeBandwidth;
      this.userData = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.userData;
      this.vcpu = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.vcpu;
      this.volumeAttachments = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.volumeAttachments;
      this.volumeBandwidthQosMode = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.volumeBandwidthQosMode;
      this.vpc = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.vpc;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceByVolumeContext) instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.bootVolumeAttachment;
      this.zone = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.zone;
      this.networkAttachments = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.networkAttachments;
      this.primaryNetworkAttachment = instancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.primaryNetworkAttachment;
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
    public Builder(VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment, ZoneIdentity zone, InstanceNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      this.zone = zone;
      this.primaryNetworkAttachment = primaryNetworkAttachment;
    }

    /**
     * Builds a InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment.
     *
     * @return the new InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment instance
     */
    public InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment build() {
      return new InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment(this);
    }

    /**
     * Adds a new element to clusterNetworkAttachments.
     *
     * @param clusterNetworkAttachments the new element to be added
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder clusterNetworkAttachments(List<InstanceClusterNetworkAttachmentPrototypeInstanceContext> clusterNetworkAttachments) {
      this.clusterNetworkAttachments = clusterNetworkAttachments;
      return this;
    }

    /**
     * Set the confidentialComputeMode.
     *
     * @param confidentialComputeMode the confidentialComputeMode
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder confidentialComputeMode(String confidentialComputeMode) {
      this.confidentialComputeMode = confidentialComputeMode;
      return this;
    }

    /**
     * Set the defaultTrustedProfile.
     *
     * @param defaultTrustedProfile the defaultTrustedProfile
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder defaultTrustedProfile(InstanceDefaultTrustedProfilePrototype defaultTrustedProfile) {
      this.defaultTrustedProfile = defaultTrustedProfile;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder metadataService(InstanceMetadataServicePrototype metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder placementTarget(InstancePlacementTargetPrototype placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder reservationAffinity(InstanceReservationAffinityPrototype reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder userData(String userData) {
      this.userData = userData;
      return this;
    }

    /**
     * Set the vcpu.
     *
     * @param vcpu the vcpu
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder vcpu(InstanceVCPUPrototype vcpu) {
      this.vcpu = vcpu;
      return this;
    }

    /**
     * Set the volumeAttachments.
     * Existing volumeAttachments will be replaced.
     *
     * @param volumeAttachments the volumeAttachments
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototype> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the volumeBandwidthQosMode.
     *
     * @param volumeBandwidthQosMode the volumeBandwidthQosMode
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder volumeBandwidthQosMode(String volumeBandwidthQosMode) {
      this.volumeBandwidthQosMode = volumeBandwidthQosMode;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
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
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder networkAttachments(List<InstanceNetworkAttachmentPrototype> networkAttachments) {
      this.networkAttachments = networkAttachments;
      return this;
    }

    /**
     * Set the primaryNetworkAttachment.
     *
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     * @return the InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
     */
    public Builder primaryNetworkAttachment(InstanceNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.primaryNetworkAttachment = primaryNetworkAttachment;
      return this;
    }
  }

  protected InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment() { }

  protected InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bootVolumeAttachment,
      "bootVolumeAttachment cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryNetworkAttachment,
      "primaryNetworkAttachment cannot be null");
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
    vcpu = builder.vcpu;
    volumeAttachments = builder.volumeAttachments;
    volumeBandwidthQosMode = builder.volumeBandwidthQosMode;
    vpc = builder.vpc;
    bootVolumeAttachment = builder.bootVolumeAttachment;
    zone = builder.zone;
    networkAttachments = builder.networkAttachments;
    primaryNetworkAttachment = builder.primaryNetworkAttachment;
  }

  /**
   * New builder.
   *
   * @return a InstancePrototypeInstanceByVolumeInstanceByVolumeInstanceByNetworkAttachment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

