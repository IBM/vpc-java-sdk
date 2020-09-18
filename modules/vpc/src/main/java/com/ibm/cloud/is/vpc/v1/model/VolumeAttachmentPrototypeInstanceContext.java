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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VolumeAttachmentPrototypeInstanceContext.
 */
public class VolumeAttachmentPrototypeInstanceContext extends GenericModel {

  protected String name;
  @SerializedName("delete_volume_on_instance_delete")
  protected Boolean deleteVolumeOnInstanceDelete;
  protected VolumeAttachmentPrototypeInstanceContextVolume volume;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Boolean deleteVolumeOnInstanceDelete;
    private VolumeAttachmentPrototypeInstanceContextVolume volume;

    private Builder(VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContext) {
      this.name = volumeAttachmentPrototypeInstanceContext.name;
      this.deleteVolumeOnInstanceDelete = volumeAttachmentPrototypeInstanceContext.deleteVolumeOnInstanceDelete;
      this.volume = volumeAttachmentPrototypeInstanceContext.volume;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param volume the volume
     */
    public Builder(VolumeAttachmentPrototypeInstanceContextVolume volume) {
      this.volume = volume;
    }

    /**
     * Builds a VolumeAttachmentPrototypeInstanceContext.
     *
     * @return the new VolumeAttachmentPrototypeInstanceContext instance
     */
    public VolumeAttachmentPrototypeInstanceContext build() {
      return new VolumeAttachmentPrototypeInstanceContext(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeAttachmentPrototypeInstanceContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the deleteVolumeOnInstanceDelete.
     *
     * @param deleteVolumeOnInstanceDelete the deleteVolumeOnInstanceDelete
     * @return the VolumeAttachmentPrototypeInstanceContext builder
     */
    public Builder deleteVolumeOnInstanceDelete(Boolean deleteVolumeOnInstanceDelete) {
      this.deleteVolumeOnInstanceDelete = deleteVolumeOnInstanceDelete;
      return this;
    }

    /**
     * Set the volume.
     *
     * @param volume the volume
     * @return the VolumeAttachmentPrototypeInstanceContext builder
     */
    public Builder volume(VolumeAttachmentPrototypeInstanceContextVolume volume) {
      this.volume = volume;
      return this;
    }
  }

  protected VolumeAttachmentPrototypeInstanceContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volume,
      "volume cannot be null");
    name = builder.name;
    deleteVolumeOnInstanceDelete = builder.deleteVolumeOnInstanceDelete;
    volume = builder.volume;
  }

  /**
   * New builder.
   *
   * @return a VolumeAttachmentPrototypeInstanceContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this volume attachment.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the deleteVolumeOnInstanceDelete.
   *
   * If set to true, when deleting the instance the volume will also be deleted.
   *
   * @return the deleteVolumeOnInstanceDelete
   */
  public Boolean deleteVolumeOnInstanceDelete() {
    return deleteVolumeOnInstanceDelete;
  }

  /**
   * Gets the volume.
   *
   * The identity of the volume to attach to the instance, or a prototype object for a new
   * volume.
   *
   * @return the volume
   */
  public VolumeAttachmentPrototypeInstanceContextVolume volume() {
    return volume;
  }
}

