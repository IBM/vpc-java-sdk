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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Image.
 */
public class Image extends GenericModel {

  /**
   * The type of encryption used on the image.
   */
  public interface Encryption {
    /** none. */
    String NONE = "none";
    /** user_managed. */
    String USER_MANAGED = "user_managed";
  }

  /**
   * The status of this image
   * - available: image can be used (provisionable)
   * - deleting: image is being deleted, and can no longer be used to provision new
   *   resources
   * - deprecated: image can be used, but is slated to become `obsolete` (provisionable)
   * - failed: image is corrupt or did not pass validation
   * - obsolete: image can no longer be used to provision new resources
   * - pending: image is being imported and is not yet `available`
   * - tentative: image import has timed out (contact support)
   * - unusable: image cannot be used (see `status_reasons[]` for possible remediation)
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the image on which the
   * unexpected property value was encountered.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** deleting. */
    String DELETING = "deleting";
    /** deprecated. */
    String DEPRECATED = "deprecated";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** tentative. */
    String TENTATIVE = "tentative";
    /** unusable. */
    String UNUSABLE = "unusable";
  }

  /**
   * Whether the image is publicly visible or private to the account.
   */
  public interface Visibility {
    /** private. */
    String X_PRIVATE = "private";
    /** public. */
    String X_PUBLIC = "public";
  }

  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected String encryption;
  @SerializedName("encryption_key")
  protected EncryptionKeyReference encryptionKey;
  protected ImageFile file;
  protected String href;
  protected String id;
  @SerializedName("minimum_provisioned_size")
  protected Long minimumProvisionedSize;
  protected String name;
  @SerializedName("operating_system")
  protected OperatingSystem operatingSystem;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("source_volume")
  protected VolumeReference sourceVolume;
  protected String status;
  @SerializedName("status_reasons")
  protected List<ImageStatusReason> statusReasons;
  protected String visibility;

  /**
   * Gets the createdAt.
   *
   * The date and time that the image was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this image.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the encryption.
   *
   * The type of encryption used on the image.
   *
   * @return the encryption
   */
  public String getEncryption() {
    return encryption;
  }

  /**
   * Gets the encryptionKey.
   *
   * The key that will be used to encrypt volumes created from this image (unless an
   * alternate `encryption_key` is specified at volume creation).
   *
   * This property will be present for images with an `encryption` type of `user_managed`.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyReference getEncryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the file.
   *
   * Details for the stored image file.
   *
   * @return the file
   */
  public ImageFile getFile() {
    return file;
  }

  /**
   * Gets the href.
   *
   * The URL for this image.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this image.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the minimumProvisionedSize.
   *
   * The minimum size (in gigabytes) of a volume onto which this image may be provisioned.
   *
   * This property may be absent if the image has a `status` of `pending`, `tentative`, or
   * `failed`.
   *
   * @return the minimumProvisionedSize
   */
  public Long getMinimumProvisionedSize() {
    return minimumProvisionedSize;
  }

  /**
   * Gets the name.
   *
   * The user-defined or system-provided name for this image.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the operatingSystem.
   *
   * The operating system included in this image.
   *
   * @return the operatingSystem
   */
  public OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this image.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the sourceVolume.
   *
   * The volume used to create this image (this may be
   * [deleted](https://cloud.ibm.com/apidocs/vpc#deleted-resources)).
   * If absent, this image was not created from a volume.
   *
   * @return the sourceVolume
   */
  public VolumeReference getSourceVolume() {
    return sourceVolume;
  }

  /**
   * Gets the status.
   *
   * The status of this image
   * - available: image can be used (provisionable)
   * - deleting: image is being deleted, and can no longer be used to provision new
   *   resources
   * - deprecated: image can be used, but is slated to become `obsolete` (provisionable)
   * - failed: image is corrupt or did not pass validation
   * - obsolete: image can no longer be used to provision new resources
   * - pending: image is being imported and is not yet `available`
   * - tentative: image import has timed out (contact support)
   * - unusable: image cannot be used (see `status_reasons[]` for possible remediation)
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the image on which the
   * unexpected property value was encountered.
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
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the statusReasons
   */
  public List<ImageStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the visibility.
   *
   * Whether the image is publicly visible or private to the account.
   *
   * @return the visibility
   */
  public String getVisibility() {
    return visibility;
  }
}

