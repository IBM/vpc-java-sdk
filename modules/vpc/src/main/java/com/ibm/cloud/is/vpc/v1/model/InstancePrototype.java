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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstancePrototype.
 *
 * Classes which extend this class:
 * - InstancePrototypeInstanceByImage
 * - InstancePrototypeInstanceByCatalogOffering
 * - InstancePrototypeInstanceByVolume
 * - InstancePrototypeInstanceBySourceSnapshot
 * - InstancePrototypeInstanceBySourceTemplate
 */
public class InstancePrototype extends GenericModel {

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

  @SerializedName("availability_policy")
  protected InstanceAvailabilityPolicyPrototype availabilityPolicy;
  @SerializedName("cluster_network_attachments")
  protected List<InstanceClusterNetworkAttachmentPrototypeInstanceContext> clusterNetworkAttachments;
  @SerializedName("confidential_compute_mode")
  protected String confidentialComputeMode;
  @SerializedName("default_trusted_profile")
  protected InstanceDefaultTrustedProfilePrototype defaultTrustedProfile;
  @SerializedName("enable_secure_boot")
  protected Boolean enableSecureBoot;
  protected List<KeyIdentity> keys;
  @SerializedName("metadata_service")
  protected InstanceMetadataServicePrototype metadataService;
  protected String name;
  @SerializedName("placement_target")
  protected InstancePlacementTargetPrototype placementTarget;
  protected InstanceProfileIdentity profile;
  @SerializedName("reservation_affinity")
  protected InstanceReservationAffinityPrototype reservationAffinity;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("total_volume_bandwidth")
  protected Long totalVolumeBandwidth;
  @SerializedName("user_data")
  protected String userData;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentPrototype> volumeAttachments;
  protected VPCIdentity vpc;
  @SerializedName("boot_volume_attachment")
  protected VolumeAttachmentPrototypeInstance bootVolumeAttachment;
  protected ImageIdentity image;
  protected ZoneIdentity zone;
  @SerializedName("network_attachments")
  protected List<InstanceNetworkAttachmentPrototype> networkAttachments;
  @SerializedName("primary_network_attachment")
  protected InstanceNetworkAttachmentPrototype primaryNetworkAttachment;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfacePrototype> networkInterfaces;
  @SerializedName("primary_network_interface")
  protected NetworkInterfacePrototype primaryNetworkInterface;
  @SerializedName("catalog_offering")
  protected InstanceCatalogOfferingPrototype catalogOffering;
  @SerializedName("source_template")
  protected InstanceTemplateIdentity sourceTemplate;

  protected InstancePrototype() { }

  /**
   * Gets the availabilityPolicy.
   *
   * The availability policy to use for this virtual server instance.
   *
   * @return the availabilityPolicy
   */
  public InstanceAvailabilityPolicyPrototype availabilityPolicy() {
    return availabilityPolicy;
  }

  /**
   * Gets the clusterNetworkAttachments.
   *
   * The cluster network attachments to create for this virtual server instance. A cluster network attachment represents
   * a device that is connected to a cluster network. The number of network attachments must match one of the values
   * from the instance profile's `cluster_network_attachment_count` before the instance can be started.
   *
   * @return the clusterNetworkAttachments
   */
  public List<InstanceClusterNetworkAttachmentPrototypeInstanceContext> clusterNetworkAttachments() {
    return clusterNetworkAttachments;
  }

  /**
   * Gets the confidentialComputeMode.
   *
   * The confidential compute mode to use for this virtual server instance.
   *
   * If unspecified, the default confidential compute mode from the profile will be used.
   *
   * @return the confidentialComputeMode
   */
  public String confidentialComputeMode() {
    return confidentialComputeMode;
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
   * Gets the enableSecureBoot.
   *
   * Indicates whether secure boot is enabled for this virtual server instance.
   *
   * If unspecified, the default secure boot mode from the profile will be used.
   *
   * @return the enableSecureBoot
   */
  public Boolean enableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Gets the keys.
   *
   * The public SSH keys for the administrative user of the virtual server instance. Keys will be made available to the
   * virtual server instance as cloud-init vendor data. For cloud-init enabled images, these keys will also be added as
   * SSH authorized keys for the administrative user.
   *
   * For Windows images, the keys of type `rsa` must be specified, and one will be selected to encrypt [the
   * administrator password](https://cloud.ibm.com/apidocs/vpc#get-instance-initialization). Keys are optional for other
   * images, but if no keys are specified, the instance will be inaccessible unless the specified image provides another
   * means of access.
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
   * The name for this virtual server instance. The name must not be used by another virtual server instance in the
   * region. If unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * The system hostname will be based on this name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the placementTarget.
   *
   * The placement restrictions to use for the virtual server instance.
   *
   * If specified, `reservation_affinity.policy` must be `disabled`.
   *
   * @return the placementTarget
   */
  public InstancePlacementTargetPrototype placementTarget() {
    return placementTarget;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-profiles) to use for this
   * virtual server instance.
   *
   * If unspecified, `bx2-2x8` will be used, but this default value is expected to change
   * in the future.
   *
   * @return the profile
   */
  public InstanceProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the reservationAffinity.
   *
   * @return the reservationAffinity
   */
  public InstanceReservationAffinityPrototype reservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
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
  public List<VolumeAttachmentPrototype> volumeAttachments() {
    return volumeAttachments;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this virtual server instance will reside in.
   *
   * If specified, it must match the VPC for the subnets of the instance network
   * attachments or instance network interfaces.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the bootVolumeAttachment.
   *
   * The boot volume attachment to create for the virtual server instance.
   *
   * @return the bootVolumeAttachment
   */
  public VolumeAttachmentPrototypeInstance bootVolumeAttachment() {
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
   * Gets the networkAttachments.
   *
   * The additional network attachments to create for the virtual server instance.
   *
   * @return the networkAttachments
   */
  public List<InstanceNetworkAttachmentPrototype> networkAttachments() {
    return networkAttachments;
  }

  /**
   * Gets the primaryNetworkAttachment.
   *
   * The primary network attachment to create for the virtual server instance.
   *
   * @return the primaryNetworkAttachment
   */
  public InstanceNetworkAttachmentPrototype primaryNetworkAttachment() {
    return primaryNetworkAttachment;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The additional instance network interfaces to create.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfacePrototype> networkInterfaces() {
    return networkInterfaces;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * The primary instance network interface to create.
   *
   * @return the primaryNetworkInterface
   */
  public NetworkInterfacePrototype primaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the catalogOffering.
   *
   * The [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user) offering
   * or offering version to use when provisioning this virtual server instance.
   *
   * If an offering is specified, the latest version of that offering will be used.
   *
   * The specified offering or offering version may be in a different account, subject
   * to IAM policies.
   *
   * @return the catalogOffering
   */
  public InstanceCatalogOfferingPrototype catalogOffering() {
    return catalogOffering;
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

