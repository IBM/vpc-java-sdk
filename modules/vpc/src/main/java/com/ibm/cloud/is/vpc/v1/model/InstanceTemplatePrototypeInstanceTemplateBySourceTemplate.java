/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
 * Create an instance template from an existing instance template.
 */
public class InstanceTemplatePrototypeInstanceTemplateBySourceTemplate extends InstanceTemplatePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private InstanceAvailabilityPolicyPrototype availabilityPolicy;
    private InstanceDefaultTrustedProfilePrototype defaultTrustedProfile;
    private List<KeyIdentity> keys;
    private InstanceMetadataServicePrototype metadataService;
    private String name;
    private InstancePlacementTargetPrototype placementTarget;
    private InstanceProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private Long totalVolumeBandwidth;
    private String userData;
    private List<VolumeAttachmentPrototype> volumeAttachments;
    private VPCIdentity vpc;
    private VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment;
    private InstanceCatalogOfferingPrototype catalogOffering;
    private ImageIdentity image;
    private List<NetworkInterfacePrototype> networkInterfaces;
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
      this.defaultTrustedProfile = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.defaultTrustedProfile;
      this.keys = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.keys;
      this.metadataService = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.metadataService;
      this.name = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.name;
      this.placementTarget = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.placementTarget;
      this.profile = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.profile;
      this.resourceGroup = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.resourceGroup;
      this.totalVolumeBandwidth = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.totalVolumeBandwidth;
      this.userData = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.userData;
      this.volumeAttachments = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.volumeAttachments;
      this.vpc = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.vpc;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceByImageContext) instanceTemplatePrototypeInstanceTemplateBySourceTemplate.bootVolumeAttachment;
      this.catalogOffering = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.catalogOffering;
      this.image = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.image;
      this.networkInterfaces = instanceTemplatePrototypeInstanceTemplateBySourceTemplate.networkInterfaces;
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
     * Adds an keys to keys.
     *
     * @param keys the new keys
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
     * Adds an volumeAttachments to volumeAttachments.
     *
     * @param volumeAttachments the new volumeAttachments
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
     * Adds an networkInterfaces to networkInterfaces.
     *
     * @param networkInterfaces the new networkInterfaces
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
    defaultTrustedProfile = builder.defaultTrustedProfile;
    keys = builder.keys;
    metadataService = builder.metadataService;
    name = builder.name;
    placementTarget = builder.placementTarget;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    totalVolumeBandwidth = builder.totalVolumeBandwidth;
    userData = builder.userData;
    volumeAttachments = builder.volumeAttachments;
    vpc = builder.vpc;
    bootVolumeAttachment = builder.bootVolumeAttachment;
    catalogOffering = builder.catalogOffering;
    image = builder.image;
    networkInterfaces = builder.networkInterfaces;
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

