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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServerPrototype.
 *
 * Classes which extend this class:
 * - BareMetalServerPrototypeBareMetalServerByNetworkAttachment
 * - BareMetalServerPrototypeBareMetalServerByNetworkInterface
 */
public class BareMetalServerPrototype extends GenericModel {

  protected Long bandwidth;
  @SerializedName("enable_secure_boot")
  protected Boolean enableSecureBoot;
  protected BareMetalServerInitializationPrototype initialization;
  @SerializedName("metadata_service")
  protected BareMetalServerMetadataServicePrototype metadataService;
  protected String name;
  protected BareMetalServerProfileIdentity profile;
  @SerializedName("reservation_affinity")
  protected BareMetalServerReservationAffinityPrototype reservationAffinity;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("trusted_platform_module")
  protected BareMetalServerTrustedPlatformModulePrototype trustedPlatformModule;
  protected VPCIdentity vpc;
  protected ZoneIdentity zone;
  @SerializedName("network_attachments")
  protected List<BareMetalServerNetworkAttachmentPrototype> networkAttachments;
  @SerializedName("primary_network_attachment")
  protected BareMetalServerPrimaryNetworkAttachmentPrototype primaryNetworkAttachment;
  @SerializedName("network_interfaces")
  protected List<BareMetalServerNetworkInterfacePrototype> networkInterfaces;
  @SerializedName("primary_network_interface")
  protected BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface;

  protected BareMetalServerPrototype() { }

  /**
   * Gets the bandwidth.
   *
   * The total bandwidth (in megabits per second) shared across the bare metal server's network interfaces. The
   * specified value must match one of the bandwidth values in the bare metal server's profile. If unspecified, the
   * default value from the profile will be used.
   *
   * @return the bandwidth
   */
  public Long bandwidth() {
    return bandwidth;
  }

  /**
   * Gets the enableSecureBoot.
   *
   * Indicates whether secure boot is enabled. If enabled, the image must support secure boot or the server will fail to
   * boot.
   *
   * @return the enableSecureBoot
   */
  public Boolean enableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Gets the initialization.
   *
   * @return the initialization
   */
  public BareMetalServerInitializationPrototype initialization() {
    return initialization;
  }

  /**
   * Gets the metadataService.
   *
   * The metadata service configuration for the bare metal server.
   *
   * @return the metadataService
   */
  public BareMetalServerMetadataServicePrototype metadataService() {
    return metadataService;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server. The name must not be used by another bare metal server in the region. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * The system hostname will be based on this name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile)
   * to use for this bare metal server.
   *
   * @return the profile
   */
  public BareMetalServerProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the reservationAffinity.
   *
   * @return the reservationAffinity
   */
  public BareMetalServerReservationAffinityPrototype reservationAffinity() {
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
   * Gets the trustedPlatformModule.
   *
   * @return the trustedPlatformModule
   */
  public BareMetalServerTrustedPlatformModulePrototype trustedPlatformModule() {
    return trustedPlatformModule;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this bare metal server will reside in.
   *
   * If specified, it must match the VPC for the subnets that the network attachments or
   * network interfaces of the bare metal server are attached to.
   *
   * @return the vpc
   */
  public VPCIdentity vpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this bare metal server will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the networkAttachments.
   *
   * The additional network attachments to create for the bare metal server.
   *
   * @return the networkAttachments
   */
  public List<BareMetalServerNetworkAttachmentPrototype> networkAttachments() {
    return networkAttachments;
  }

  /**
   * Gets the primaryNetworkAttachment.
   *
   * The primary network attachment to create for the bare metal server.
   *
   * @return the primaryNetworkAttachment
   */
  public BareMetalServerPrimaryNetworkAttachmentPrototype primaryNetworkAttachment() {
    return primaryNetworkAttachment;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The additional bare metal server network interfaces to create.
   *
   * @return the networkInterfaces
   */
  public List<BareMetalServerNetworkInterfacePrototype> networkInterfaces() {
    return networkInterfaces;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * The primary bare metal server network interface to create.
   *
   * @return the primaryNetworkInterface
   */
  public BareMetalServerPrimaryNetworkInterfacePrototype primaryNetworkInterface() {
    return primaryNetworkInterface;
  }
}

