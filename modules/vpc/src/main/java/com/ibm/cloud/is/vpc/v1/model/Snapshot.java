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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Snapshot.
 */
public class Snapshot extends GenericModel {

  /**
   * The type of encryption used on the source volume.
   */
  public interface Encryption {
    /** provider_managed. */
    String PROVIDER_MANAGED = "provider_managed";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  /**
   * The lifecycle state of this snapshot.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** unusable. */
    String UNUSABLE = "unusable";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** snapshot. */
    String SNAPSHOT = "snapshot";
  }

  @SerializedName("allowed_use")
  protected SnapshotAllowedUse allowedUse;
  @SerializedName("backup_policy_plan")
  protected BackupPolicyPlanReference backupPolicyPlan;
  protected Boolean bootable;
  @SerializedName("captured_at")
  protected Date capturedAt;
  @SerializedName("catalog_offering")
  protected SnapshotCatalogOffering catalogOffering;
  protected List<SnapshotClone> clones;
  protected List<SnapshotCopiesItem> copies;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected Boolean deletable;
  protected String encryption;
  @SerializedName("encryption_key")
  protected EncryptionKeyReference encryptionKey;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  @SerializedName("minimum_capacity")
  protected Long minimumCapacity;
  protected String name;
  @SerializedName("operating_system")
  protected OperatingSystem operatingSystem;
  protected Long progress;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("service_tags")
  protected List<String> serviceTags;
  protected Long size;
  @SerializedName("snapshot_consistency_group")
  protected SnapshotConsistencyGroupReference snapshotConsistencyGroup;
  @SerializedName("source_image")
  protected ImageReference sourceImage;
  @SerializedName("source_snapshot")
  protected SnapshotSourceSnapshot sourceSnapshot;
  @SerializedName("source_volume")
  protected VolumeReference sourceVolume;
  @SerializedName("storage_generation")
  protected Long storageGeneration;
  @SerializedName("user_tags")
  protected List<String> userTags;

  protected Snapshot() { }

  /**
   * Gets the allowedUse.
   *
   * The usage constraints to be matched against the requested instance properties to
   * determine compatibility. While bare metal servers cannot be provisioned from snapshots,
   * an image or volume created from this snapshot will inherit its `allowed_use` value.
   *
   * Only present on bootable snapshots. The value of this property will be inherited from
   * the source volume or source snapshot at snapshot creation, but can be changed.
   *
   * @return the allowedUse
   */
  public SnapshotAllowedUse getAllowedUse() {
    return allowedUse;
  }

  /**
   * Gets the backupPolicyPlan.
   *
   * If present, the backup policy plan which created this snapshot.
   *
   * @return the backupPolicyPlan
   */
  public BackupPolicyPlanReference getBackupPolicyPlan() {
    return backupPolicyPlan;
  }

  /**
   * Gets the bootable.
   *
   * Indicates if a boot volume attachment can be created with a volume created from this snapshot.
   *
   * @return the bootable
   */
  public Boolean isBootable() {
    return bootable;
  }

  /**
   * Gets the capturedAt.
   *
   * The date and time the data capture for this snapshot was completed.
   *
   * If absent, this snapshot's data has not yet been captured. Additionally, this property may be absent for snapshots
   * created before 1 January 2022.
   *
   * @return the capturedAt
   */
  public Date getCapturedAt() {
    return capturedAt;
  }

  /**
   * Gets the catalogOffering.
   *
   * The [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user)
   * offering inherited from the snapshot's source. If a virtual server instance is
   * provisioned with a `source_snapshot` specifying this snapshot, the virtual server
   * instance will use this snapshot's catalog offering, including its pricing plan.
   *
   * If absent, this snapshot is not associated with a catalog offering.
   *
   * @return the catalogOffering
   */
  public SnapshotCatalogOffering getCatalogOffering() {
    return catalogOffering;
  }

  /**
   * Gets the clones.
   *
   * The clones for this snapshot.
   *
   * @return the clones
   */
  public List<SnapshotClone> getClones() {
    return clones;
  }

  /**
   * Gets the copies.
   *
   * The copies of this snapshot.
   *
   * @return the copies
   */
  public List<SnapshotCopiesItem> getCopies() {
    return copies;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this snapshot was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN of this snapshot.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the deletable.
   *
   * Indicates whether this snapshot can be deleted. This value will always be `true`.
   *
   * @return the deletable
   * @deprecated this method is deprecated and may be removed in a future release
   */
  @Deprecated
  public Boolean isDeletable() {
    return deletable;
  }

  /**
   * Gets the encryption.
   *
   * The type of encryption used on the source volume.
   *
   * @return the encryption
   */
  public String getEncryption() {
    return encryption;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key used to wrap the data encryption key for the source volume.
   *
   * This property will be present for volumes with an `encryption` type of
   * `user_managed`.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyReference getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the href.
   *
   * The URL for this snapshot.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this snapshot.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of this snapshot.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the minimumCapacity.
   *
   * The minimum capacity of a volume created from this snapshot. When a snapshot is created, this will be set to the
   * capacity of the `source_volume`.
   *
   * @return the minimumCapacity
   */
  public Long getMinimumCapacity() {
    return minimumCapacity;
  }

  /**
   * Gets the name.
   *
   * The name for this snapshot. The name is unique across all snapshots in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the operatingSystem.
   *
   * The operating system included in this snapshot.
   *
   * @return the operatingSystem
   */
  public OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  /**
   * Gets the progress.
   *
   * Indicates the progress (as a percentage) of storing this snapshot. Only stored snapshots can be used for
   * restoration.
   *
   * @return the progress
   */
  public Long getProgress() {
    return progress;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this snapshot.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the serviceTags.
   *
   * The [service tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) prefixed with `is.snapshot:` associated
   * with this snapshot.
   *
   * @return the serviceTags
   */
  public List<String> getServiceTags() {
    return serviceTags;
  }

  /**
   * Gets the size.
   *
   * The size of this snapshot rounded up to the next gigabyte.
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Gets the snapshotConsistencyGroup.
   *
   * If present, the snapshot consistency group which created this snapshot.
   *
   * @return the snapshotConsistencyGroup
   */
  public SnapshotConsistencyGroupReference getSnapshotConsistencyGroup() {
    return snapshotConsistencyGroup;
  }

  /**
   * Gets the sourceImage.
   *
   * If present, the image from which the data on this snapshot was most directly
   * provisioned.
   *
   * @return the sourceImage
   */
  public ImageReference getSourceImage() {
    return sourceImage;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * If present, the source snapshot this snapshot was created from.
   *
   * @return the sourceSnapshot
   */
  public SnapshotSourceSnapshot getSourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * Gets the sourceVolume.
   *
   * The source volume this snapshot was created from (may be
   * [deleted](https://cloud.ibm.com/apidocs/vpc#deleted-resources)).
   *
   * @return the sourceVolume
   */
  public VolumeReference getSourceVolume() {
    return sourceVolume;
  }

  /**
   * Gets the storageGeneration.
   *
   * The [storage
   * generation](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles&amp;interface=api#using-api-iops-profiles):
   * - `1`: The first storage generation
   * - `2`: The second storage generation
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the storageGeneration
   */
  public Long getStorageGeneration() {
    return storageGeneration;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this snapshot.
   *
   * @return the userTags
   */
  public List<String> getUserTags() {
    return userTags;
  }
}

