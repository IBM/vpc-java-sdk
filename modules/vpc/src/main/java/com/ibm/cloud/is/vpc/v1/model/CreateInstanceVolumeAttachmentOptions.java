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
 * The createInstanceVolumeAttachment options.
 */
public class CreateInstanceVolumeAttachmentOptions extends GenericModel {

  protected String instanceId;
  protected VolumeAttachmentPrototypeVolume volume;
  protected Boolean deleteVolumeOnInstanceDelete;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private VolumeAttachmentPrototypeVolume volume;
    private Boolean deleteVolumeOnInstanceDelete;
    private String name;

    /**
     * Instantiates a new Builder from an existing CreateInstanceVolumeAttachmentOptions instance.
     *
     * @param createInstanceVolumeAttachmentOptions the instance to initialize the Builder with
     */
    private Builder(CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptions) {
      this.instanceId = createInstanceVolumeAttachmentOptions.instanceId;
      this.volume = createInstanceVolumeAttachmentOptions.volume;
      this.deleteVolumeOnInstanceDelete = createInstanceVolumeAttachmentOptions.deleteVolumeOnInstanceDelete;
      this.name = createInstanceVolumeAttachmentOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param volume the volume
     */
    public Builder(String instanceId, VolumeAttachmentPrototypeVolume volume) {
      this.instanceId = instanceId;
      this.volume = volume;
    }

    /**
     * Builds a CreateInstanceVolumeAttachmentOptions.
     *
     * @return the new CreateInstanceVolumeAttachmentOptions instance
     */
    public CreateInstanceVolumeAttachmentOptions build() {
      return new CreateInstanceVolumeAttachmentOptions(this);
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceVolumeAttachmentOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the volume.
     *
     * @param volume the volume
     * @return the CreateInstanceVolumeAttachmentOptions builder
     */
    public Builder volume(VolumeAttachmentPrototypeVolume volume) {
      this.volume = volume;
      return this;
    }

    /**
     * Set the deleteVolumeOnInstanceDelete.
     *
     * @param deleteVolumeOnInstanceDelete the deleteVolumeOnInstanceDelete
     * @return the CreateInstanceVolumeAttachmentOptions builder
     */
    public Builder deleteVolumeOnInstanceDelete(Boolean deleteVolumeOnInstanceDelete) {
      this.deleteVolumeOnInstanceDelete = deleteVolumeOnInstanceDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceVolumeAttachmentOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the volumeAttachmentPrototype.
     *
     * @param volumeAttachmentPrototype the volumeAttachmentPrototype
     * @return the CreateInstanceVolumeAttachmentOptions builder
     */
    public Builder volumeAttachmentPrototype(VolumeAttachmentPrototype volumeAttachmentPrototype) {
      this.volume = volumeAttachmentPrototype.volume();
      this.deleteVolumeOnInstanceDelete = volumeAttachmentPrototype.deleteVolumeOnInstanceDelete();
      this.name = volumeAttachmentPrototype.name();
      return this;
    }
  }

  protected CreateInstanceVolumeAttachmentOptions() { }

  protected CreateInstanceVolumeAttachmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.volume,
      "volume cannot be null");
    instanceId = builder.instanceId;
    volume = builder.volume;
    deleteVolumeOnInstanceDelete = builder.deleteVolumeOnInstanceDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceVolumeAttachmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The virtual server instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the volume.
   *
   * The volume to use for this attachment. This can be specified as an existing unattached
   * volume, or a prototype object for a new volume.
   *
   * @return the volume
   */
  public VolumeAttachmentPrototypeVolume volume() {
    return volume;
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
}

