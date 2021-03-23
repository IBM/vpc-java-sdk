/*
 * (C) Copyright IBM Corp. 2021.
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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceTemplate.
 *
 * Classes which extend this class:
 * - InstanceTemplateInstanceByImage
 * - InstanceTemplateInstanceBySourceTemplate
 */
public class InstanceTemplate extends GenericModel {

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String href;
  protected String id;
  protected List<KeyIdentity> keys;
  protected String name;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfacePrototype> networkInterfaces;
  protected InstanceProfileIdentity profile;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("user_data")
  protected String userData;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentPrototypeInstanceContext> volumeAttachments;
  protected VPCIdentity vpc;
  @SerializedName("boot_volume_attachment")
  protected VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment;
  protected ImageIdentity image;
  @SerializedName("primary_network_interface")
  protected NetworkInterfacePrototype primaryNetworkInterface;
  protected ZoneIdentity zone;
  @SerializedName("source_template")
  protected InstanceTemplateIdentity sourceTemplate;

  protected InstanceTemplate() {
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the instance template was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this instance template.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance template.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this instance template.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the keys.
   *
   * The public SSH keys for the administrative user of the virtual server instance. Up to 10 keys may be provided; if
   * no keys are provided the instance will be inaccessible unless the image used provides another means of access. For
   * Windows instances, one of the keys will be used to encrypt the administrator password.
   *
   * Keys will be made available to the virtual server instance as cloud-init vendor data. For cloud-init enabled
   * images, these keys will also be added as SSH authorized keys for the administrative user.
   *
   * @return the keys
   */
  public List<KeyIdentity> getKeys() {
    return keys;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this instance template.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkInterfaces.
   *
   * Collection of additional network interfaces to create for the virtual server instance.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfacePrototype> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this virtual server instance.
   *
   * @return the profile
   */
  public InstanceProfileIdentity getProfile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this instance template.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the userData.
   *
   * User data to be made available when setting up the virtual server instance.
   *
   * @return the userData
   */
  public String getUserData() {
    return userData;
  }

  /**
   * Gets the volumeAttachments.
   *
   * Collection of volume attachments.
   *
   * @return the volumeAttachments
   */
  public List<VolumeAttachmentPrototypeInstanceContext> getVolumeAttachments() {
    return volumeAttachments;
  }

  /**
   * Gets the vpc.
   *
   * The VPC the virtual server instance is to be a part of. If provided, must match the
   * VPC tied to the subnets of the instance's network interfaces.
   *
   * @return the vpc
   */
  public VPCIdentity getVpc() {
    return vpc;
  }

  /**
   * Gets the bootVolumeAttachment.
   *
   * The boot volume attachment for the virtual server instance.
   *
   * @return the bootVolumeAttachment
   */
  public VolumeAttachmentPrototypeInstanceByImageContext getBootVolumeAttachment() {
    return bootVolumeAttachment;
  }

  /**
   * Gets the image.
   *
   * The identity of the image to use when provisioning the virtual server instance.
   *
   * @return the image
   */
  public ImageIdentity getImage() {
    return image;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * Primary network interface.
   *
   * @return the primaryNetworkInterface
   */
  public NetworkInterfacePrototype getPrimaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the zone.
   *
   * The zone this virtual server instance will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity getZone() {
    return zone;
  }

  /**
   * Gets the sourceTemplate.
   *
   * Identifies an instance template by a unique property.
   *
   * @return the sourceTemplate
   */
  public InstanceTemplateIdentity getSourceTemplate() {
    return sourceTemplate;
  }
}

