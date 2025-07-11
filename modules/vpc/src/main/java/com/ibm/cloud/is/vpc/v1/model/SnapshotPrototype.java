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
 * SnapshotPrototype.
 *
 * Classes which extend this class:
 * - SnapshotPrototypeSnapshotBySourceVolume
 * - SnapshotPrototypeSnapshotBySourceSnapshot
 */
public class SnapshotPrototype extends GenericModel {

  protected List<SnapshotClonePrototype> clones;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  @SerializedName("user_tags")
  protected List<String> userTags;
  @SerializedName("source_volume")
  protected VolumeIdentity sourceVolume;
  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  @SerializedName("source_snapshot")
  protected SnapshotIdentityByCRN sourceSnapshot;

  protected SnapshotPrototype() { }

  /**
   * Gets the clones.
   *
   * The clones to create for this snapshot.
   *
   * @return the clones
   */
  public List<SnapshotClonePrototype> clones() {
    return clones;
  }

  /**
   * Gets the name.
   *
   * The name for this snapshot. The name must not be used by another snapshot in the region. If unspecified, the name
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
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this snapshot.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Gets the sourceVolume.
   *
   * The volume to create this snapshot from.
   *
   * @return the sourceVolume
   */
  public VolumeIdentity sourceVolume() {
    return sourceVolume;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key to use to wrap the data encryption key for this snapshot.
   *
   * A key must be specified if and only if the source snapshot has an `encryption` type of
   * `user_managed`. To maximize snapshot availability and sharing of snapshot data, specify
   * a key in the same region as the new snapshot, and use the same encryption key for all
   * snapshots using the same source volume.
   *
   * The specified key may be in a different account, subject to IAM policies.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * The source snapshot (in another region) to create this snapshot from.
   * The specified snapshot must not already be the source of another snapshot in this
   * region.
   *
   * @return the sourceSnapshot
   */
  public SnapshotIdentityByCRN sourceSnapshot() {
    return sourceSnapshot;
  }
}

