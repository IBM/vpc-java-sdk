/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * ImageExportJob.
 */
public class ImageExportJob extends GenericModel {

  /**
   * The format of the exported image.
   */
  public interface Format {
    /** qcow2. */
    String QCOW2 = "qcow2";
    /** vhd. */
    String VHD = "vhd";
  }

  /**
   * The type of resource referenced.
   */
  public interface ResourceType {
    /** image_export_job. */
    String IMAGE_EXPORT_JOB = "image_export_job";
  }

  /**
   * The status of this image export job:
   * - `deleting`: Export job is being deleted
   * - `failed`: Export job could not be completed successfully
   * - `queued`: Export job is queued
   * - `running`: Export job is in progress
   * - `succeeded`: Export job was completed successfully
   *
   * The exported image object is automatically deleted for `failed` jobs.
   */
  public interface Status {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** queued. */
    String QUEUED = "queued";
    /** running. */
    String RUNNING = "running";
    /** succeeded. */
    String SUCCEEDED = "succeeded";
  }

  @SerializedName("completed_at")
  protected Date completedAt;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("encrypted_data_key")
  protected byte[] encryptedDataKey;
  protected String format;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("started_at")
  protected Date startedAt;
  protected String status;
  @SerializedName("status_reasons")
  protected List<ImageExportJobStatusReason> statusReasons;
  @SerializedName("storage_bucket")
  protected CloudObjectStorageBucketReference storageBucket;
  @SerializedName("storage_href")
  protected String storageHref;
  @SerializedName("storage_object")
  protected CloudObjectStorageObjectReference storageObject;

  protected ImageExportJob() { }

  /**
   * Gets the completedAt.
   *
   * The date and time that the image export job was completed.
   *
   * If absent, the export job has not yet completed.
   *
   * @return the completedAt
   */
  public Date getCompletedAt() {
    return completedAt;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the image export job was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the encryptedDataKey.
   *
   * A base64-encoded, encrypted representation of the key that was used to encrypt the data for the exported image.
   * This key can be unwrapped with the image's `encryption_key` root key using either Key Protect or Hyper Protect
   * Crypto Services.
   *
   * If absent, the export job is for an unencrypted image.
   *
   * @return the encryptedDataKey
   */
  public byte[] getEncryptedDataKey() {
    return encryptedDataKey;
  }

  /**
   * Gets the format.
   *
   * The format of the exported image.
   *
   * @return the format
   */
  public String getFormat() {
    return format;
  }

  /**
   * Gets the href.
   *
   * The URL for this image export job.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this image export job.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this image export job. The name must not be used by another export job for the image. Changing the
   * name will not affect the exported image name,
   * `storage_object.name`, or `storage_href` values.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceType.
   *
   * The type of resource referenced.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the startedAt.
   *
   * The date and time that the image export job started running.
   *
   * If absent, the export job has not yet started.
   *
   * @return the startedAt
   */
  public Date getStartedAt() {
    return startedAt;
  }

  /**
   * Gets the status.
   *
   * The status of this image export job:
   * - `deleting`: Export job is being deleted
   * - `failed`: Export job could not be completed successfully
   * - `queued`: Export job is queued
   * - `running`: Export job is in progress
   * - `succeeded`: Export job was completed successfully
   *
   * The exported image object is automatically deleted for `failed` jobs.
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
  public List<ImageExportJobStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the storageBucket.
   *
   * The Cloud Object Storage bucket of the exported image object.
   *
   * @return the storageBucket
   */
  public CloudObjectStorageBucketReference getStorageBucket() {
    return storageBucket;
  }

  /**
   * Gets the storageHref.
   *
   * The Cloud Object Storage location of the exported image object. The object at this location will not exist until
   * the job completes successfully. The exported image object is not managed by the IBM VPC service, and may be removed
   * or replaced with a different object by any user or service with IAM authorization to the storage bucket.
   *
   * @return the storageHref
   */
  public String getStorageHref() {
    return storageHref;
  }

  /**
   * Gets the storageObject.
   *
   * The Cloud Object Storage object for the exported image. This object will not exist until
   * the job completes successfully. The exported image object is not managed by the IBM VPC
   * service, and may be removed or replaced with a different object by any user or service
   * with IAM authorization to the storage bucket.
   *
   * @return the storageObject
   */
  public CloudObjectStorageObjectReference getStorageObject() {
    return storageObject;
  }
}

