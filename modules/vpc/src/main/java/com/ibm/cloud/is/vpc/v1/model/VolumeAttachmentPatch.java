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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VolumeAttachmentPatch.
 */
public class VolumeAttachmentPatch extends GenericModel {

  @SerializedName("delete_volume_on_instance_delete")
  protected Boolean deleteVolumeOnInstanceDelete;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean deleteVolumeOnInstanceDelete;
    private String name;

    /**
     * Instantiates a new Builder from an existing VolumeAttachmentPatch instance.
     *
     * @param volumeAttachmentPatch the instance to initialize the Builder with
     */
    private Builder(VolumeAttachmentPatch volumeAttachmentPatch) {
      this.deleteVolumeOnInstanceDelete = volumeAttachmentPatch.deleteVolumeOnInstanceDelete;
      this.name = volumeAttachmentPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VolumeAttachmentPatch.
     *
     * @return the new VolumeAttachmentPatch instance
     */
    public VolumeAttachmentPatch build() {
      return new VolumeAttachmentPatch(this);
    }

    /**
     * Set the deleteVolumeOnInstanceDelete.
     *
     * @param deleteVolumeOnInstanceDelete the deleteVolumeOnInstanceDelete
     * @return the VolumeAttachmentPatch builder
     */
    public Builder deleteVolumeOnInstanceDelete(Boolean deleteVolumeOnInstanceDelete) {
      this.deleteVolumeOnInstanceDelete = deleteVolumeOnInstanceDelete;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumeAttachmentPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected VolumeAttachmentPatch() { }

  protected VolumeAttachmentPatch(Builder builder) {
    deleteVolumeOnInstanceDelete = builder.deleteVolumeOnInstanceDelete;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a VolumeAttachmentPatch builder
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
   * Construct a JSON merge-patch from the VolumeAttachmentPatch.
   *
   * Note that properties of the VolumeAttachmentPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VolumeAttachmentPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

