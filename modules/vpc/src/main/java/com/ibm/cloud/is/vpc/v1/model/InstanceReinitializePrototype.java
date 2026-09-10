/*
 * (C) Copyright IBM Corp. 2023, 2024, 2025, 2026.
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
 * InstanceReinitializePrototype.
 *
 * Classes which extend this class:
 * - InstanceReinitializePrototypeInstanceReinitializeByImage
 * - InstanceReinitializePrototypeInstanceReinitializeByVolume
 * - InstanceReinitializePrototypeInstanceReinitializeBySnapshot
 */
public class InstanceReinitializePrototype extends GenericModel {

  @SerializedName("default_trusted_profile")
  protected InstanceDefaultTrustedProfilePrototype defaultTrustedProfile;
  protected List<KeyIdentity> keys;
  @SerializedName("user_data")
  protected String userData;
  @SerializedName("boot_volume_attachment")
  protected VolumeAttachmentPrototypeInstance bootVolumeAttachment;
  protected ImageIdentity image;

  protected InstanceReinitializePrototype() { }

  /**
   * Gets the defaultTrustedProfile.
   *
   * The default trusted profile configuration to use for this virtual server instance.
   * If not specified, the instance will be reinitialized without a default trusted
   * profile.
   *
   * This property's value is used when reinitializing the virtual server instance, and
   * can only be changed by reinitializing the instance. Accordingly, it is reflected as
   * an [instance
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
   * The public SSH keys for the reinitialized instance. The keys will be made available to the virtual server instance
   * as cloud-init vendor data. For cloud-init enabled images, the keys will also be added as SSH authorized keys for
   * the [default user]
   * (https://cloud.ibm.com/docs/vpc?topic=vpc-vsi_is_connecting_linux#determining-default-user-account).
   *
   * For Windows images, only keys with a `type` value of `rsa` must be specified, and one will be selected to encrypt
   * [the administrator password](https://cloud.ibm.com/apidocs/vpc#get-instance-initialization). Keys are optional for
   * other images.
   *
   * If no keys are specified, the instance will be reinitialized without a key.
   *
   * @return the keys
   */
  public List<KeyIdentity> keys() {
    return keys;
  }

  /**
   * Gets the userData.
   *
   * The [user data](https://cloud.ibm.com/docs/vpc?topic=vpc-user-data) to make available when setting up the virtual
   * server instance. If not specified, the instance will be reinitialized without user data.
   *
   * @return the userData
   */
  public String userData() {
    return userData;
  }

  /**
   * Gets the bootVolumeAttachment.
   *
   * The boot volume attachment for the virtual server instance. If not specified,
   * a new boot volume attachment will be created.
   *
   * @return the bootVolumeAttachment
   */
  public VolumeAttachmentPrototypeInstance bootVolumeAttachment() {
    return bootVolumeAttachment;
  }

  /**
   * Gets the image.
   *
   * The image to use when reinitializing the virtual server instance.
   *
   * @return the image
   */
  public ImageIdentity image() {
    return image;
  }
}

