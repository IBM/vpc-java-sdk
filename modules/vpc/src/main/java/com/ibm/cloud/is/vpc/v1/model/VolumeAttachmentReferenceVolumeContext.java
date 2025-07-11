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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeAttachmentReferenceVolumeContext.
 */
public class VolumeAttachmentReferenceVolumeContext extends GenericModel {

  /**
   * The type of volume attachment.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   */
  public interface Type {
    /** boot. */
    String BOOT = "boot";
    /** data. */
    String DATA = "data";
  }

  @SerializedName("delete_volume_on_instance_delete")
  protected Boolean deleteVolumeOnInstanceDelete;
  protected Deleted deleted;
  protected VolumeAttachmentDevice device;
  protected String href;
  protected String id;
  protected InstanceReference instance;
  protected String name;
  protected String type;

  protected VolumeAttachmentReferenceVolumeContext() { }

  /**
   * Gets the deleteVolumeOnInstanceDelete.
   *
   * Indicates whether deleting the instance will also delete the attached volume.
   *
   * @return the deleteVolumeOnInstanceDelete
   */
  public Boolean isDeleteVolumeOnInstanceDelete() {
    return deleteVolumeOnInstanceDelete;
  }

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted, and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public Deleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the device.
   *
   * The configuration for the volume as a device in the instance operating system.
   *
   * This property may be absent if the volume attachment's `status` is not `attached`.
   *
   * @return the device
   */
  public VolumeAttachmentDevice getDevice() {
    return device;
  }

  /**
   * Gets the href.
   *
   * The URL for this volume attachment.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this volume attachment.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the instance.
   *
   * The attached instance.
   *
   * @return the instance
   */
  public InstanceReference getInstance() {
    return instance;
  }

  /**
   * Gets the name.
   *
   * The name for this volume attachment. The name is unique across all volume attachments on the instance.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the type.
   *
   * The type of volume attachment.
   *
   * The enumerated values for this property may
   * [expand](https://cloud.ibm.com/apidocs/vpc#property-value-expansion) in the future.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

