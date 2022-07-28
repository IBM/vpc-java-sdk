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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ImagePrototype.
 *
 * Classes which extend this class:
 * - ImagePrototypeImageByFile
 * - ImagePrototypeImageBySourceVolume
 */
public class ImagePrototype extends GenericModel {

  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("encrypted_data_key")
  protected String encryptedDataKey;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  protected ImageFilePrototype file;
  @SerializedName("operating_system")
  protected OperatingSystemIdentity operatingSystem;
  @SerializedName("source_volume")
  protected VolumeIdentity sourceVolume;

  protected ImagePrototype() {
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this image. Names starting with `ibm-` are not allowed. If unspecified, the name
   * will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
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
   * Gets the encryptedDataKey.
   *
   * A base64-encoded, encrypted representation of the key that was used to encrypt the data for this image.
   *
   * That representation is created by wrapping the key's value with the `encryption_key` root key (which must also be
   * specified), using either [Key Protect](https://cloud.ibm.com/docs/key-protect?topic=key-protect-wrap-keys) or the
   * [Hyper Protect Crypto Services](https://cloud.ibm.com/docs/services/hs-crypto?topic=hs-crypto-wrap-keys).
   *
   * If unspecified, the imported image is treated as unencrypted.
   *
   * @return the encryptedDataKey
   */
  public String encryptedDataKey() {
    return encryptedDataKey;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key that was used to wrap the data key (which is ultimately represented as
   * `encrypted_data_key`). Additionally, the root key will be used to encrypt volumes
   * created from this image (unless an alternate `encryption_key` is specified at volume
   * creation).
   *
   * If unspecified, the imported image is treated as unencrypted.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the file.
   *
   * The file from which to create the image.
   *
   * @return the file
   */
  public ImageFilePrototype file() {
    return file;
  }

  /**
   * Gets the operatingSystem.
   *
   * The [supported operating
   * system](https://cloud.ibm.com/apidocs/vpc#list-operating-systems) included in this
   * image.
   *
   * @return the operatingSystem
   */
  public OperatingSystemIdentity operatingSystem() {
    return operatingSystem;
  }

  /**
   * Gets the sourceVolume.
   *
   * The volume from which to create the image. The specified volume must:
   * - Originate from an image, which will be used to populate this image's
   *   operating system information.
   * - Not be `active` or `busy`.
   *
   * During image creation, the specified volume may briefly become `busy`.
   *
   * @return the sourceVolume
   */
  public VolumeIdentity sourceVolume() {
    return sourceVolume;
  }
}

