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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeAttachmentReferenceInstanceContext.
 */
public class VolumeAttachmentReferenceInstanceContext extends GenericModel {

  protected Deleted deleted;
  protected VolumeAttachmentDevice device;
  protected String href;
  protected String id;
  protected String name;
  protected VolumeReferenceVolumeAttachmentContext volume;

  protected VolumeAttachmentReferenceInstanceContext() { }

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
   * Gets the volume.
   *
   * The attached volume.
   *
   * This property will be absent if the volume has not yet been provisioned.
   *
   * @return the volume
   */
  public VolumeReferenceVolumeAttachmentContext getVolume() {
    return volume;
  }
}

