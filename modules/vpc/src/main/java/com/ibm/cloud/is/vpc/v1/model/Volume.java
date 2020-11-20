/*
 * (C) Copyright IBM Corp. 2020.
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
   * The type of encryption used on the volume.
   */
  public interface Encryption {
    /** provider_managed. */
    String PROVIDER_MANAGED = "provider_managed";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  /**
   * The status of the volume.
   *
   * The enumerated values for this property will expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the volume on which the unexpected
   * property value was encountered.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** unusable. */
    String UNUSABLE = "unusable";
    /** pending_deletion. */
    String PENDING_DELETION = "pending_deletion";
  }

  protected Long capacity;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String encryption;
  @SerializedName("encryption_key")
  protected EncryptionKeyReference encryptionKey;
  protected String href;
  protected String id;
  protected Long iops;
  protected String name;
  protected VolumeProfileReference profile;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  protected String status;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentReferenceVolumeContext> volumeAttachments;
  protected ZoneReference zone;

  /**
   * Gets the capacity.
   *
   * The capacity of the volume in gigabytes. The specified minimum and maximum capacity values for creating or updating
   * volumes may expand in the future.
   *
   * @return the capacity
   */
  public Long getCapacity() {
    return capacity;
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
   * A reference to the root key used to wrap the data encryption key for the volume.
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
   * The bandwidth for the volume.
   *
   * @return the iops
   */
  public Long getIops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this volume.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile this volume uses.
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
   * Gets the status.
   *
   * The status of the volume.
   *
   * The enumerated values for this property will expand in the future. When processing this property, check for and log
   * unknown values. Optionally halt processing and surface the error, or bypass the volume on which the unexpected
   * property value was encountered.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the volumeAttachments.
   *
   * The collection of volume attachments attaching instances to the volume.
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

