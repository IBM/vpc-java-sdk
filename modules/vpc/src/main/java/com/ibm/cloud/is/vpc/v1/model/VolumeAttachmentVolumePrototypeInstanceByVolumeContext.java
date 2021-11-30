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


/**
 * An existing volume to attach to the instance, or a prototype object for a new volume.
 *
 * Classes which extend this class:
 * - VolumeAttachmentVolumePrototypeInstanceByVolumeContextVolumePrototypeInstanceByVolumeContext
 */
public class VolumeAttachmentVolumePrototypeInstanceByVolumeContext extends VolumeAttachmentPrototypeInstanceWrapper {

  protected VolumeAttachmentVolumePrototypeInstanceByVolumeContext() {
  }

  /**
   * Gets the capacity.
   *
   * The capacity to use for the volume (in gigabytes). The only allowed value is the source snapshot's
   * `minimum_capacity`, but the allowed values are expected to expand in the future.
   *
   * If unspecified, the capacity will be the source snapshot's `minimum_capacity`.
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
   * If unspecified, the snapshot's `encryption_key` will be used.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
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
   * The profile to use for this volume.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
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

