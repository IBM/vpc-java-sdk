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
 * Volume.
 */
public class Volume extends GenericModel {

  /**
   * The attachment state of the volume
   * - `unattached`: Not attached to any virtual server instances
   * - `attached`: Attached to a virtual server instance (even if the instance is stopped)
   * - `unusable`: Not able to be attached to any virtual server instances.
   */
  public interface AdjustableCapacityStates {
    /** attached. */
    String ATTACHED = "attached";
    /** unattached. */
    String UNATTACHED = "unattached";
    /** unusable. */
    String UNUSABLE = "unusable";
  }

  /**
   * The attachment state of the volume
   * - `unattached`: Not attached to any virtual server instances
   * - `attached`: Attached to a virtual server instance (even if the instance is stopped)
   * - `unusable`: Not able to be attached to any virtual server instances.
   */
  public interface AdjustableIopsStates {
    /** attached. */
    String ATTACHED = "attached";
    /** unattached. */
    String UNATTACHED = "unattached";
    /** unusable. */
    String UNUSABLE = "unusable";
  }

  /**
   * The attachment state of the volume
   * - `unattached`: Not attached to any virtual server instances
   * - `attached`: Attached to a virtual server instance (even if the instance is stopped)
   * - `unusable`: Not able to be attached to any virtual server instances.
   */
  public interface AttachmentState {
    /** attached. */
    String ATTACHED = "attached";
    /** unattached. */
    String UNATTACHED = "unattached";
    /** unusable. */
    String UNUSABLE = "unusable";
  }

  /**
   * The type of encryption used on the volume.
   */
  public interface Encryption {
    /** provider_managed. */
    String PROVIDER_MANAGED = "provider_managed";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  /**
   * The health of this resource:
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle
   *    state. A resource with a lifecycle state of `failed` or `deleting` will have a
   *    health state of `inapplicable`. A `pending` resource may also have this state.
   */
  public interface HealthState {
    /** degraded. */
    String DEGRADED = "degraded";
    /** faulted. */
    String FAULTED = "faulted";
    /** inapplicable. */
    String INAPPLICABLE = "inapplicable";
    /** ok. */
    String OK = "ok";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** volume. */
    String VOLUME = "volume";
  }

  /**
   * The status of the volume.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** pending_deletion. */
    String PENDING_DELETION = "pending_deletion";
    /** unusable. */
    String UNUSABLE = "unusable";
    /** updating. */
    String UPDATING = "updating";
  }

  protected Boolean active;
  @SerializedName("adjustable_capacity_states")
  protected List<String> adjustableCapacityStates;
  @SerializedName("adjustable_iops_states")
  protected List<String> adjustableIopsStates;
  @SerializedName("allowed_use")
  protected VolumeAllowedUse allowedUse;
  @SerializedName("attachment_state")
  protected String attachmentState;
  protected Long bandwidth;
  protected Boolean busy;
  protected Long capacity;
  @SerializedName("catalog_offering")
  protected VolumeCatalogOffering catalogOffering;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String encryption;
  @SerializedName("encryption_key")
  protected EncryptionKeyReference encryptionKey;
  @SerializedName("health_reasons")
  protected List<VolumeHealthReason> healthReasons;
  @SerializedName("health_state")
  protected String healthState;
  protected String href;
  protected String id;
  protected Long iops;
  protected String name;
  @SerializedName("operating_system")
  protected OperatingSystem operatingSystem;
  protected VolumeProfileReference profile;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("source_image")
  protected ImageReference sourceImage;
  @SerializedName("source_snapshot")
  protected SnapshotReference sourceSnapshot;
  protected String status;
  @SerializedName("status_reasons")
  protected List<VolumeStatusReason> statusReasons;
  @SerializedName("storage_generation")
  protected Long storageGeneration;
  @SerializedName("user_tags")
  protected List<String> userTags;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentReferenceVolumeContext> volumeAttachments;
  protected ZoneReference zone;

  protected Volume() { }

  /**
   * Gets the active.
   *
   * Indicates whether a running virtual server instance has an attachment to this volume.
   *
   * @return the active
   */
  public Boolean isActive() {
    return active;
  }

  /**
   * Gets the adjustableCapacityStates.
   *
   * The attachment states that support adjustable capacity for this volume.
   *
   * @return the adjustableCapacityStates
   */
  public List<String> getAdjustableCapacityStates() {
    return adjustableCapacityStates;
  }

  /**
   * Gets the adjustableIopsStates.
   *
   * The attachment states that support adjustable IOPS for this volume.
   *
   * @return the adjustableIopsStates
   */
  public List<String> getAdjustableIopsStates() {
    return adjustableIopsStates;
  }

  /**
   * Gets the allowedUse.
   *
   * The usage constraints to be matched against the requested instance or bare metal server
   * properties to determine compatibility.
   *
   * Only present for boot volumes.
   *
   * @return the allowedUse
   */
  public VolumeAllowedUse getAllowedUse() {
    return allowedUse;
  }

  /**
   * Gets the attachmentState.
   *
   * The attachment state of the volume
   * - `unattached`: Not attached to any virtual server instances
   * - `attached`: Attached to a virtual server instance (even if the instance is stopped)
   * - `unusable`: Not able to be attached to any virtual server instances.
   *
   * @return the attachmentState
   */
  public String getAttachmentState() {
    return attachmentState;
  }

  /**
   * Gets the bandwidth.
   *
   * The maximum bandwidth (in megabits per second) for the volume.
   *
   * If the volume profile has a `bandwidth.type` of `dependent`, the [bandwidth is
   * calculated](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-bandwidth#attached-block-vol-bandwidth) from the
   * `iops` value.
   *
   * The minimum and maximum limits for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the bandwidth
   */
  public Long getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the busy.
   *
   * Indicates whether this volume is performing an operation that must be serialized. This must be `false` to perform
   * an operation that is specified to require serialization.
   *
   * @return the busy
   */
  public Boolean isBusy() {
    return busy;
  }

  /**
   * Gets the capacity.
   *
   * The capacity to use for the volume (in gigabytes).
   *
   * The minimum and maximum limits for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the capacity
   */
  public Long getCapacity() {
    return capacity;
  }

  /**
   * Gets the catalogOffering.
   *
   * The [catalog](https://cloud.ibm.com/docs/account?topic=account-restrict-by-user)
   * offering this volume was created from. If a virtual server instance is provisioned
   * with a `boot_volume_attachment` specifying this volume, the virtual server instance
   * will use this volume's catalog offering, including its pricing plan.
   *
   * If absent, this volume was not created from a catalog offering.
   *
   * @return the catalogOffering
   */
  public VolumeCatalogOffering getCatalogOffering() {
    return catalogOffering;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the volume was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this volume.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the encryption.
   *
   * The type of encryption used on the volume.
   *
   * @return the encryption
   */
  public String getEncryption() {
    return encryption;
  }

  /**
   * Gets the encryptionKey.
   *
   * The root key used to wrap the data encryption key for the volume.
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
   * Gets the healthReasons.
   *
   * The reasons for the current `health_state` (if any).
   *
   * @return the healthReasons
   */
  public List<VolumeHealthReason> getHealthReasons() {
    return healthReasons;
  }

  /**
   * Gets the healthState.
   *
   * The health of this resource:
   * - `ok`: No abnormal behavior detected
   * - `degraded`: Experiencing compromised performance, capacity, or connectivity
   * - `faulted`: Completely unreachable, inoperative, or otherwise entirely incapacitated
   * - `inapplicable`: The health state does not apply because of the current lifecycle
   *    state. A resource with a lifecycle state of `failed` or `deleting` will have a
   *    health state of `inapplicable`. A `pending` resource may also have this state.
   *
   * @return the healthState
   */
  public String getHealthState() {
    return healthState;
  }

  /**
   * Gets the href.
   *
   * The URL for this volume.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this volume.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the iops.
   *
   * The maximum I/O operations per second (IOPS) for this volume.
   *
   * @return the iops
   */
  public Long getIops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The name for this volume. The name is unique across all volumes in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the operatingSystem.
   *
   * The operating system associated with this volume. If absent, this volume was not
   * created from an image, or the image did not include an operating system.
   *
   * @return the operatingSystem
   */
  public OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-block-storage-profiles) for
   * this volume.
   *
   * @return the profile
   */
  public VolumeProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this volume.
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
   * Gets the sourceImage.
   *
   * The image from which this volume was created (this may be
   * [deleted](https://cloud.ibm.com/apidocs/vpc#deleted-resources)).
   * If absent, this volume was not created from an image.
   *
   * @return the sourceImage
   */
  public ImageReference getSourceImage() {
    return sourceImage;
  }

  /**
   * Gets the sourceSnapshot.
   *
   * The snapshot from which this volume was cloned.
   *
   * @return the sourceSnapshot
   */
  public SnapshotReference getSourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * Gets the status.
   *
   * The status of the volume.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current status (if any).
   *
   * @return the statusReasons
   */
  public List<VolumeStatusReason> getStatusReasons() {
    return statusReasons;
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
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this volume.
   *
   * @return the userTags
   */
  public List<String> getUserTags() {
    return userTags;
  }

  /**
   * Gets the volumeAttachments.
   *
   * The volume attachments for this volume.
   *
   * @return the volumeAttachments
   */
  public List<VolumeAttachmentReferenceVolumeContext> getVolumeAttachments() {
    return volumeAttachments;
  }

  /**
   * Gets the zone.
   *
   * The zone this volume resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

