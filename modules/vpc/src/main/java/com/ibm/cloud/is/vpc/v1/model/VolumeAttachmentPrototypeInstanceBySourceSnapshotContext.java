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


/**
 * VolumeAttachmentPrototypeInstanceBySourceSnapshotContext.
 */
public class VolumeAttachmentPrototypeInstanceBySourceSnapshotContext extends InstancePrototypeBootVolumeAttachmentWrapper {

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean deleteVolumeOnInstanceDelete;
    private String name;
    private VolumePrototypeInstanceBySourceSnapshotContext volume;

    private Builder(VolumeAttachmentPrototypeInstanceBySourceSnapshotContext volumeAttachmentPrototypeInstanceBySourceSnapshotContext) {
      this.deleteVolumeOnInstanceDelete = volumeAttachmentPrototypeInstanceBySourceSnapshotContext.deleteVolumeOnInstanceDelete;
      this.name = volumeAttachmentPrototypeInstanceBySourceSnapshotContext.name;
      this.volume = (VolumePrototypeInstanceBySourceSnapshotContext) volumeAttachmentPrototypeInstanceBySourceSnapshotContext.volume;
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
    public Builder(VolumePrototypeInstanceBySourceSnapshotContext volume) {
      this.volume = volume;
    }

    /**
     * Builds a VolumeAttachmentPrototypeInstanceBySourceSnapshotContext.
     *
     * @return the new VolumeAttachmentPrototypeInstanceBySourceSnapshotContext instance
     */
    public VolumeAttachmentPrototypeInstanceBySourceSnapshotContext build() {
      return new VolumeAttachmentPrototypeInstanceBySourceSnapshotContext(this);
    }

    /**
     * Set the deleteVolumeOnInstanceDelete.
     *
     * @param deleteVolumeOnInstanceDelete the deleteVolumeOnInstanceDelete
     * @return the VolumeAttachmentPrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder deleteVolumeOnInstanceDelete(Boolean deleteVolumeOnInstanceDelete) {
      this.deleteVolumeOnInstanceDelete = deleteVolumeOnInstanceDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeAttachmentPrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the volume.
     *
     * @param volume the volume
     * @return the VolumeAttachmentPrototypeInstanceBySourceSnapshotContext builder
     */
    public Builder volume(VolumePrototypeInstanceBySourceSnapshotContext volume) {
      this.volume = volume;
      return this;
    }
  }

  protected VolumeAttachmentPrototypeInstanceBySourceSnapshotContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volume,
      "volume cannot be null");
    deleteVolumeOnInstanceDelete = builder.deleteVolumeOnInstanceDelete;
    name = builder.name;
    volume = builder.volume;
  }

  /**
   * New builder.
   *
   * @return a VolumeAttachmentPrototypeInstanceBySourceSnapshotContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the name.
   *
   * The user-defined name for this volume attachment. Names must be unique within the instance the volume attachment
   * resides in.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the volume.
   *
   * A prototype object for a new volume from a snapshot.
   *
   * @return the volume
   */
  public VolumeAttachmentPrototypeInstanceWrapper volume() {
    return volume;
  }
}

