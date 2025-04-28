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
 * The volume to use for this attachment. This can be specified as an existing unattached volume, or a prototype object
 * for a new volume.
 *
 * Classes which extend this class:
 * - VolumeAttachmentPrototypeVolumeVolumeIdentity
 * - VolumeAttachmentPrototypeVolumeVolumePrototypeInstanceContext
 */
public class VolumeAttachmentPrototypeVolume extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;
  protected Long bandwidth;
  protected Long iops;
  protected String name;
  protected VolumeProfileIdentity profile;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("user_tags")
  protected List<String> userTags;
  protected Long capacity;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  @SerializedName("source_snapshot")
  protected SnapshotIdentity sourceSnapshot;

  protected VolumeAttachmentPrototypeVolume() { }

  /**
   * Gets the id.
   *
   * The unique identifier for this volume.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this volume.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this volume.
   *
   * @return the href
   */
  public String href() {
    return href;
  }

  /**
   * Gets the bandwidth.
   *
   * The maximum bandwidth (in megabits per second) for the volume.
   *
   * If the volume profile has a `bandwidth.type` of `dependent`, this property is system-managed and must not be
   * specified.
   *
   * Provided the property is user-managed, if it is unspecified, its value will be set based on the specified [`iops`
   * and
   * `capacity`](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles&amp;interface=api).
   *
   * @return the bandwidth
   */
  public Long bandwidth() {
    return bandwidth;
  }

  /**
   * Gets the iops.
   *
   * The maximum I/O operations per second (IOPS) to use for this volume.
   *
   * If the volume profile has a `iops.type` of `dependent`, this property is system-managed and must not be specified.
   *
   * Provided the property is user-managed, if it is unspecified, its value will be set based on the specified [
   * `capacity`](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles&amp;interface=api).
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The name for this volume. The name must not be used by another volume in the region. If unspecified, the name will
   * be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles) for
   * this volume.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use for this volume. If unspecified, the instance's resource
   * group will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this volume.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Gets the capacity.
   *
   * The capacity to use for the volume (in gigabytes). The specified value must be within the `capacity` range of the
   * volume's profile.
   *
   * @return the capacity
   */
  public Long capacity() {
    return capacity;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key to use to wrap the data encryption key for the volume.
   *
   * If unspecified, the `encryption` type for the volume will be `provider_managed`.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * The snapshot to use as a source for the volume's data.
   *
   * The specified snapshot may be in a different account, subject to IAM policies.
   *
   * To create a volume from a `source_snapshot`, the volume profile and the
   * source snapshot must have the same `storage_generation` value.
   *
   * @return the sourceSnapshot
   */
  public SnapshotIdentity sourceSnapshot() {
    return sourceSnapshot;
  }
}

