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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeAttachmentReferenceInstanceContext.
 */
public class VolumeAttachmentReferenceInstanceContext extends GenericModel {

  protected VolumeAttachmentReferenceInstanceContextDeleted deleted;
  protected VolumeAttachmentDevice device;
  protected String href;
  protected String id;
  protected String name;
  protected VolumeReference volume;

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public VolumeAttachmentReferenceInstanceContextDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the device.
   *
   * Information about how the volume is exposed to the instance operating system.
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
   * The user-defined name for this volume attachment.
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
   * @return the volume
   */
  public VolumeReference getVolume() {
    return volume;
  }
}

