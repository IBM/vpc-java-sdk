/*
 * (C) Copyright IBM Corp. 2021.
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
 * The createSnapshot options.
 */
public class CreateSnapshotOptions extends GenericModel {

  protected VolumeIdentity sourceVolume;
  protected String name;
  protected ResourceGroupIdentity resourceGroup;

  /**
   * Builder.
   */
  public static class Builder {
    private VolumeIdentity sourceVolume;
    private String name;
    private ResourceGroupIdentity resourceGroup;

    private Builder(CreateSnapshotOptions createSnapshotOptions) {
      this.sourceVolume = createSnapshotOptions.sourceVolume;
      this.name = createSnapshotOptions.name;
      this.resourceGroup = createSnapshotOptions.resourceGroup;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceVolume the sourceVolume
     */
    public Builder(VolumeIdentity sourceVolume) {
      this.sourceVolume = sourceVolume;
    }

    /**
     * Builds a CreateSnapshotOptions.
     *
     * @return the new CreateSnapshotOptions instance
     */
    public CreateSnapshotOptions build() {
      return new CreateSnapshotOptions(this);
    }

    /**
     * Set the sourceVolume.
     *
     * @param sourceVolume the sourceVolume
     * @return the CreateSnapshotOptions builder
     */
    public Builder sourceVolume(VolumeIdentity sourceVolume) {
      this.sourceVolume = sourceVolume;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateSnapshotOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateSnapshotOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }
  }

  protected CreateSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceVolume,
      "sourceVolume cannot be null");
    sourceVolume = builder.sourceVolume;
    name = builder.name;
    resourceGroup = builder.resourceGroup;
  }

  /**
   * New builder.
   *
   * @return a CreateSnapshotOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sourceVolume.
   *
   * The volume to snapshot.
   *
   * @return the sourceVolume
   */
  public VolumeIdentity sourceVolume() {
    return sourceVolume;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this snapshot. If unspecified, the name will be a hyphenated list of
   * randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }
}

