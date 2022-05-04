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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeAttachment.
 */
public class VolumeAttachment extends GenericModel {

  /**
   * The status of this volume attachment.
   */
  public interface Status {
    /** attached. */
    String ATTACHED = "attached";
    /** attaching. */
    String ATTACHING = "attaching";
    /** deleting. */
    String DELETING = "deleting";
    /** detaching. */
    String DETACHING = "detaching";
  }

  /**
   * The type of volume attachment.
   */
  public interface Type {
    /** boot. */
    String BOOT = "boot";
    /** data. */
    String DATA = "data";
  }

  protected Long bandwidth;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("delete_volume_on_instance_delete")
  protected Boolean deleteVolumeOnInstanceDelete;
  protected VolumeAttachmentDevice device;
  protected String href;
  protected String id;
  protected String name;
  protected String status;
  protected String type;
  protected VolumeReference volume;

  /**
   * Gets the bandwidth.
   *
   * The maximum bandwidth (in megabits per second) for the volume when attached to this instance. This may be lower
   * than the volume bandwidth depending on the configuration of the instance.
   *
   * @return the bandwidth
   */
  public Long getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the volume was attached.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the deleteVolumeOnInstanceDelete.
   *
   * If set to true, when deleting the instance the volume will also be deleted.
   *
   * @return the deleteVolumeOnInstanceDelete
   */
  public Boolean isDeleteVolumeOnInstanceDelete() {
    return deleteVolumeOnInstanceDelete;
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
   * Gets the status.
   *
   * The status of this volume attachment.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the type.
   *
   * The type of volume attachment.
   *
   * @return the type
   */
  public String getType() {
    return type;
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

