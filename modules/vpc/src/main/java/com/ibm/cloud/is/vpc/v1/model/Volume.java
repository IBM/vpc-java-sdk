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
  }

  protected Long iops;
  protected Long capacity;
  protected String id;
  protected String crn;
  protected String href;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String encryption;
  @SerializedName("encryption_key")
  protected EncryptionKeyReference encryptionKey;
  protected VolumeProfileReference profile;
  protected String status;
  @SerializedName("volume_attachments")
  protected List<VolumeAttachmentReferenceVolumeContext> volumeAttachments;
  protected ZoneReference zone;

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
   * Gets the capacity.
   *
   * The capacity of the volume in gigabytes. Note that the specified minimum and maximum capacity values for creating
   * or updating volumes may expand in the future.
   *
   * @return the capacity
   */
  public Long getCapacity() {
    return capacity;
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
   * Gets the status.
   *
   * The status of the volume.
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

