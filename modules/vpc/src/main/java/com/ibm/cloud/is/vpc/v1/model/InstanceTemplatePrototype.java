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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceTemplatePrototype.
 *
 * Classes which extend this class:
 * - InstanceTemplatePrototypeInstanceByImage
 * - InstanceTemplatePrototypeInstanceBySourceTemplate
 */
public class InstanceTemplatePrototype extends GenericModel {

  @SerializedName("availability_policy")
  protected InstanceAvailabilityPrototype availabilityPolicy;
  @SerializedName("default_trusted_profile")
  protected InstanceDefaultTrustedProfilePrototype defaultTrustedProfile;
  protected List<KeyIdentity> keys;
  @SerializedName("metadata_service")
  protected InstanceMetadataServicePrototype metadataService;
  protected String name;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfacePrototype> networkInterfaces;
  @SerializedName("placement_target")
  protected InstancePlacementTargetPrototype placementTarget;
  protected InstanceProfileIdentity profile;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("total_volume_bandwidth")
  protected Long totalVolumeBandwidth;
  @SerializedName("user_data")
  protected String userData;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentPrototypeInstanceContext> volumeAttachments;
  protected VPCIdentity vpc;
  @SerializedName("boot_volume_attachment")
  protected  InstancePrototypeBootVolumeAttachmentWrapper bootVolumeAttachment;
  protected ImageIdentity image;
  @SerializedName("primary_network_interface")
  protected NetworkInterfacePrototype primaryNetworkInterface;
  protected ZoneIdentity zone;
  @SerializedName("source_template")
  protected InstanceTemplateIdentity sourceTemplate;

  protected InstanceTemplatePrototype() {
  }

  /**
   * Gets the availabilityPolicy.
   *
   * The availability policy to use for this virtual server instance.
   *
   * @return the availabilityPolicy
   */
  public InstanceAvailabilityPrototype availabilityPolicy() {
    return availabilityPolicy;
  }

  /**
   * Gets the defaultTrustedProfile.
   *
   * The default trusted profile configuration to use for this virtual server instance
   *
   * This property's value is used when provisioning the virtual server instance, but not
   * subsequently managed. Accordingly, it is reflected as an [instance
   * initialization](https://cloud.ibm.com/apidocs/vpc#get-instance-initialization)
   * property.
   *
   * @return the defaultTrustedProfile
   */
  public InstanceDefaultTrustedProfilePrototype defaultTrustedProfile() {
    return defaultTrustedProfile;
  }

  /**
   * Gets the keys.
   *
   * The public SSH keys for the administrative user of the virtual server instance. Keys will be made available to the
   * virtual server instance as cloud-init vendor data. For cloud-init enabled images, these keys will also be added as
   * SSH authorized keys for the administrative user.
   *
   * For Windows images, at least one key must be specified, and one will be chosen to encrypt [the administrator
   * password](https://cloud.ibm.com/apidocs/vpc#get-instance-initialization). Keys are optional for other images, but
   * if no keys are specified, the instance will be inaccessible unless the specified image provides another means of
   * access.
   *
   * This property's value is used when provisioning the virtual server instance, but not subsequently managed.
   * Accordingly, it is reflected as an [instance
   * initialization](https://cloud.ibm.com/apidocs/vpc#get-instance-initialization) property.
   *
   * @return the keys
   */
  public List<KeyIdentity> keys() {
    return keys;
  }

  /**
   * Gets the metadataService.
   *
   * The metadata service configuration.
   *
   * @return the metadataService
   */
  public InstanceMetadataServicePrototype metadataService() {
    return metadataService;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this virtual server instance (and default system hostname). If unspecified, the
   * name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The additional network interfaces to create for the virtual server instance.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfacePrototype> networkInterfaces() {
    return networkInterfaces;
  }

  /**
   * Gets the placementTarget.
   *
   * The placement restrictions to use for the virtual server instance.
   *
   * @return the placementTarget
   */
  public InstancePlacementTargetPrototype placementTarget() {
    return placementTarget;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this virtual server instance. If unspecified, `bx2-2x8` will
   * be used, but this default value is expected to change in the future.
   *
   * @return the profile
   */
  public InstanceProfileIdentity profile() {
    return profile;
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
   * Gets the totalVolumeBandwidth.
   *
   * The amount of bandwidth (in megabits per second) allocated exclusively to instance storage volumes. An increase in
   * this value will result in a corresponding decrease to
   * `total_network_bandwidth`.
   *
   * @return the totalVolumeBandwidth
   */
  public Long totalVolumeBandwidth() {
    return totalVolumeBandwidth;
  }

  /**
   * Gets the userData.
   *
   * [User data](https://cloud.ibm.com/docs/vpc?topic=vpc-user-data) to make available when setting up the virtual
   * server instance.
   *
   * @return the userData
   */
  public String userData() {
    return userData;
  }

  /**
   * Gets the volumeAttachments.
   *
   * The additional volume attachments to create for the virtual server instance.
   *
   * @return the volumeAttachments
   */
  public List<VolumeAttachmentPrototypeInstanceContext> volumeAttachments() {
    return volumeAttachments;
  }

  /**
   * Gets the vpc.
   *
   * The VPC the virtual server instance is to be a part of. If specified, it must match
   * the VPC referenced by the subnets of the instance's network interfaces.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the bootVolumeAttachment.
   *
   * The boot volume attachment for the virtual server instance.
   *
   * @return the bootVolumeAttachment
   */
  public GenericModel bootVolumeAttachment() {
    return bootVolumeAttachment;
  }

  /**
   * Gets the image.
   *
   * The image to use when provisioning the virtual server instance.
   *
   * @return the image
   */
  public ImageIdentity image() {
    return image;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * Primary network interface.
   *
   * @return the primaryNetworkInterface
   */
  public NetworkInterfacePrototype primaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the zone.
   *
   * The zone this virtual server instance will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the sourceTemplate.
   *
   * The template to create this virtual server instance from.
   *
   * @return the sourceTemplate
   */
  public InstanceTemplateIdentity sourceTemplate() {
    return sourceTemplate;
  }
}

