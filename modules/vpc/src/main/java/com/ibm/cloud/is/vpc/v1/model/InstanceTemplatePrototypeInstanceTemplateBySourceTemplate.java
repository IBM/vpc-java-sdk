/*
 * (C) Copyright IBM Corp. 2025.
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
 * Create an instance template from an existing source instance template.
 *
 * The `primary_network_attachment` and `network_attachments` properties may only be specified if
 * `primary_network_attachment` is specified in the source template.
 *
 * The `primary_network_interface` and `network_interfaces` properties may only be specified if
 * `primary_network_interface` is specified in the source template.
 */
public class InstanceTemplatePrototypeInstanceTemplateBySourceTemplate extends InstanceTemplatePrototype {

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
    private List<VolumeAttachmentPrototype> volumeAttachments;
    private String volumeBandwidthQosMode;
    private VPCIdentity vpc;
    private VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment;
    private InstanceCatalogOfferingPrototype catalogOffering;
    private ImageIdentity image;
    private List<InstanceNetworkAttachmentPrototype> networkAttachments;
    private List<NetworkInterfacePrototype> networkInterfaces;
    private InstanceNetworkAttachmentPrototype primaryNetworkAttachment;
    private NetworkInterfacePrototype primaryNetworkInterface;
    private InstanceTemplateIdentity sourceTemplate;
    private ZoneIdentity zone;

    /**
     * Instantiates a new Builder from an existing InstanceTemplatePrototypeInstanceTemplateBySourceTemplate instance.
     *
     * @param instanceTemplatePrototypeInstanceTemplateBySourceTemplate the instance to initialize the Builder with
     */
    public Builder(InstanceTemplatePrototype instanceTemplatePrototypeInstanceTemplateBySourceTemplate) {
      this.availabilityPolicy = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.availabilityPolicy;
      this.clusterNetworkAttachments = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.clusterNetworkAttachments;
      this.confidentialComputeMode = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.confidentialComputeMode;
      this.defaultTrustedProfile = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.defaultTrustedProfile;
      this.enableSecureBoot = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.enableSecureBoot;
      this.keys = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.keys;
      this.metadataService = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.metadataService;
      this.name = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.name;
      this.placementTarget = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.placementTarget;
      this.profile = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.profile;
      this.reservationAffinity = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.reservationAffinity;
      this.resourceGroup = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.resourceGroup;
      this.totalVolumeBandwidth = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.totalVolumeBandwidth;
      this.userData = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.userData;
      this.volumeAttachments = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.volumeAttachments;
      this.volumeBandwidthQosMode = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.volumeBandwidthQosMode;
      this.vpc = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.vpc;
      this.bootVolumeAttachment = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.bootVolumeAttachment;
      this.catalogOffering = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.catalogOffering;
      this.image = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.image;
      this.networkAttachments = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.networkAttachments;
      this.networkInterfaces = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.networkInterfaces;
      this.primaryNetworkAttachment = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.primaryNetworkAttachment;
      this.primaryNetworkInterface = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.primaryNetworkInterface;
      this.sourceTemplate = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.sourceTemplate;
      this.zone = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceTemplate the sourceTemplate
     */
    public Builder(InstanceTemplateIdentity sourceTemplate) {
      this.sourceTemplate = sourceTemplate;
    }

    /**
     * Builds a InstanceTemplatePrototypeInstanceTemplateBySourceTemplate.
     *
     * @return the new InstanceTemplatePrototypeInstanceTemplateBySourceTemplate instance
     */
    public InstanceTemplatePrototypeInstanceTemplateBySourceTemplate build() {
      return new InstanceTemplatePrototypeInstanceTemplateBySourceTemplate(this);
    }

    /**
     * Adds a new element to clusterNetworkAttachments.
     *
     * @param clusterNetworkAttachments the new element to be added
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * Adds a new element to networkInterfaces.
     *
     * @param networkInterfaces the new element to be added
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder clusterNetworkAttachments(List<InstanceClusterNetworkAttachmentPrototypeInstanceContext> clusterNetworkAttachments) {
      this.clusterNetworkAttachments = clusterNetworkAttachments;
      return this;
    }

    /**
     * Set the confidentialComputeMode.
     *
     * @param confidentialComputeMode the confidentialComputeMode
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder confidentialComputeMode(String confidentialComputeMode) {
      this.confidentialComputeMode = confidentialComputeMode;
      return this;
    }

    /**
     * Set the defaultTrustedProfile.
     *
     * @param defaultTrustedProfile the defaultTrustedProfile
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder defaultTrustedProfile(InstanceDefaultTrustedProfilePrototype defaultTrustedProfile) {
      this.defaultTrustedProfile = defaultTrustedProfile;
      return this;
    }

    /**
     * Set the enableSecureBoot.
     *
     * @param enableSecureBoot the enableSecureBoot
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the metadataService.
     *
     * @param metadataService the metadataService
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder metadataService(InstanceMetadataServicePrototype metadataService) {
      this.metadataService = metadataService;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder placementTarget(InstancePlacementTargetPrototype placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the reservationAffinity.
     *
     * @param reservationAffinity the reservationAffinity
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder reservationAffinity(InstanceReservationAffinityPrototype reservationAffinity) {
      this.reservationAffinity = reservationAffinity;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
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
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototype> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the volumeBandwidthQosMode.
     *
     * @param volumeBandwidthQosMode the volumeBandwidthQosMode
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder volumeBandwidthQosMode(String volumeBandwidthQosMode) {
      this.volumeBandwidthQosMode = volumeBandwidthQosMode;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the catalogOffering.
     *
     * @param catalogOffering the catalogOffering
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder catalogOffering(InstanceCatalogOfferingPrototype catalogOffering) {
      this.catalogOffering = catalogOffering;
      return this;
    }

    /**
     * Set the image.
     *
     * @param image the image
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder image(ImageIdentity image) {
      this.image = image;
      return this;
    }

    /**
     * Set the networkAttachments.
     * Existing networkAttachments will be replaced.
     *
     * @param networkAttachments the networkAttachments
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder networkAttachments(List<InstanceNetworkAttachmentPrototype> networkAttachments) {
      this.networkAttachments = networkAttachments;
      return this;
    }

    /**
     * Set the networkInterfaces.
     * Existing networkInterfaces will be replaced.
     *
     * @param networkInterfaces the networkInterfaces
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder networkInterfaces(List<NetworkInterfacePrototype> networkInterfaces) {
      this.networkInterfaces = networkInterfaces;
      return this;
    }

    /**
     * Set the primaryNetworkAttachment.
     *
     * @param primaryNetworkAttachment the primaryNetworkAttachment
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder primaryNetworkAttachment(InstanceNetworkAttachmentPrototype primaryNetworkAttachment) {
      this.primaryNetworkAttachment = primaryNetworkAttachment;
      return this;
    }

    /**
     * Set the primaryNetworkInterface.
     *
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder primaryNetworkInterface(NetworkInterfacePrototype primaryNetworkInterface) {
      this.primaryNetworkInterface = primaryNetworkInterface;
      return this;
    }

    /**
     * Set the sourceTemplate.
     *
     * @param sourceTemplate the sourceTemplate
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder sourceTemplate(InstanceTemplateIdentity sourceTemplate) {
      this.sourceTemplate = sourceTemplate;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected InstanceTemplatePrototypeInstanceTemplateBySourceTemplate() { }

  protected InstanceTemplatePrototypeInstanceTemplateBySourceTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceTemplate,
      "sourceTemplate cannot be null");
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
    volumeBandwidthQosMode = builder.volumeBandwidthQosMode;
    vpc = builder.vpc;
    bootVolumeAttachment = builder.bootVolumeAttachment;
    catalogOffering = builder.catalogOffering;
    image = builder.image;
    networkAttachments = builder.networkAttachments;
    networkInterfaces = builder.networkInterfaces;
    primaryNetworkAttachment = builder.primaryNetworkAttachment;
    primaryNetworkInterface = builder.primaryNetworkInterface;
    sourceTemplate = builder.sourceTemplate;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a InstanceTemplatePrototypeInstanceTemplateBySourceTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

