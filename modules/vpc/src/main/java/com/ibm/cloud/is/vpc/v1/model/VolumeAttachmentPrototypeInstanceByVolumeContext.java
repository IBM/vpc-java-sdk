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


/**
 * VolumeAttachmentPrototypeInstanceByVolumeContext.
 */
public class VolumeAttachmentPrototypeInstanceByVolumeContext extends VolumeAttachmentPrototypeInstance {

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean deleteVolumeOnInstanceDelete;
    private String name;
    private VolumeIdentity volume;

    /**
     * Instantiates a new Builder from an existing VolumeAttachmentPrototypeInstanceByVolumeContext instance.
     *
     * @param volumeAttachmentPrototypeInstanceByVolumeContext the instance to initialize the Builder with
     */
    private Builder(VolumeAttachmentPrototypeInstanceByVolumeContext volumeAttachmentPrototypeInstanceByVolumeContext) {
      this.deleteVolumeOnInstanceDelete = volumeAttachmentPrototypeInstanceByVolumeContext.deleteVolumeOnInstanceDelete;
      this.name = volumeAttachmentPrototypeInstanceByVolumeContext.name;
      this.volume = (VolumeIdentity) volumeAttachmentPrototypeInstanceByVolumeContext.volume;
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
    public Builder(VolumeIdentity volume) {
      this.volume = volume;
    }

    /**
     * Builds a VolumeAttachmentPrototypeInstanceByVolumeContext.
     *
     * @return the new VolumeAttachmentPrototypeInstanceByVolumeContext instance
     */
    public VolumeAttachmentPrototypeInstanceByVolumeContext build() {
      return new VolumeAttachmentPrototypeInstanceByVolumeContext(this);
    }

    /**
     * Set the deleteVolumeOnInstanceDelete.
     *
     * @param deleteVolumeOnInstanceDelete the deleteVolumeOnInstanceDelete
     * @return the VolumeAttachmentPrototypeInstanceByVolumeContext builder
     */
    public Builder deleteVolumeOnInstanceDelete(Boolean deleteVolumeOnInstanceDelete) {
      this.deleteVolumeOnInstanceDelete = deleteVolumeOnInstanceDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeAttachmentPrototypeInstanceByVolumeContext builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the volume.
     *
     * @param volume the volume
     * @return the VolumeAttachmentPrototypeInstanceByVolumeContext builder
     */
    public Builder volume(VolumeIdentity volume) {
      this.volume = volume;
      return this;
    }
  }

  protected VolumeAttachmentPrototypeInstanceByVolumeContext() { }

  protected VolumeAttachmentPrototypeInstanceByVolumeContext(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volume,
      "volume cannot be null");
    deleteVolumeOnInstanceDelete = builder.deleteVolumeOnInstanceDelete;
    name = builder.name;
    volume = builder.volume;
  }

  /**
   * New builder.
   *
   * @return a VolumeAttachmentPrototypeInstanceByVolumeContext builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deleteVolumeOnInstanceDelete.
   *
   * Indicates whether deleting the instance will also delete the attached volume.
   *
   * @return the deleteVolumeOnInstanceDelete
   */
  public Boolean deleteVolumeOnInstanceDelete() {
    return deleteVolumeOnInstanceDelete;
  }

  /**
   * Gets the name.
   *
   * The name for this volume attachment. The name must not be used by another volume attachment on the instance. If
   * unspecified, the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the volume.
   *
   * An existing unattached volume.
   *
   * @return the volume
   */
  public VolumePrototypeInstance volume() {
    return volume;
  }
}

