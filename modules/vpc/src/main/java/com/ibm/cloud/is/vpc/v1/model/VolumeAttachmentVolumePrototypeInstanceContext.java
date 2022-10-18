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
 * An existing volume to attach to the instance, or a prototype object for a new volume.
 *
 * Classes which extend this class:
 * - VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentity
 * - VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContext
 */
public class VolumeAttachmentVolumePrototypeInstanceContext extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;
  protected Long iops;
  protected String name;
  protected VolumeProfileIdentity profile;
  @SerializedName("user_tags")
  protected List<String> userTags;
  protected Long capacity;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  @SerializedName("source_snapshot")
  protected SnapshotIdentity sourceSnapshot;

  protected VolumeAttachmentVolumePrototypeInstanceContext() { }

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
   * Gets the iops.
   *
   * The maximum I/O operations per second (IOPS) to use for the volume. Applicable only to volumes using a profile
   * `family` of `custom`.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this volume.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles) to
   * use for this volume.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
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
   * The capacity to use for the volume (in gigabytes). The specified minimum and maximum capacity values for creating
   * or updating volumes may expand in the future.
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
   * The snapshot from which to clone the volume.
   *
   * @return the sourceSnapshot
   */
  public SnapshotIdentity sourceSnapshot() {
    return sourceSnapshot;
  }
}

