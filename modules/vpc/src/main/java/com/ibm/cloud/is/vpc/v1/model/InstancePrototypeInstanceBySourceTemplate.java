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

import java.util.ArrayList;
import java.util.List;

/**
 * InstancePrototypeInstanceBySourceTemplate.
 */
public class InstancePrototypeInstanceBySourceTemplate extends InstancePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private List<KeyIdentity> keys;
    private String name;
    private List<NetworkInterfacePrototype> networkInterfaces;
    private InstanceProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private String userData;
    private List<VolumeAttachmentPrototypeInstanceContext> volumeAttachments;
    private VPCIdentity vpc;
    private VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment;
    private ImageIdentity image;
    private NetworkInterfacePrototype primaryNetworkInterface;
    private InstanceTemplateIdentity sourceTemplate;
    private ZoneIdentity zone;

    public Builder(InstancePrototype instancePrototypeInstanceBySourceTemplate) {
      this.keys = instancePrototypeInstanceBySourceTemplate.keys;
      this.name = instancePrototypeInstanceBySourceTemplate.name;
      this.networkInterfaces = instancePrototypeInstanceBySourceTemplate.networkInterfaces;
      this.profile = instancePrototypeInstanceBySourceTemplate.profile;
      this.resourceGroup = instancePrototypeInstanceBySourceTemplate.resourceGroup;
      this.userData = instancePrototypeInstanceBySourceTemplate.userData;
      this.volumeAttachments = instancePrototypeInstanceBySourceTemplate.volumeAttachments;
      this.vpc = instancePrototypeInstanceBySourceTemplate.vpc;
      this.bootVolumeAttachment = instancePrototypeInstanceBySourceTemplate.bootVolumeAttachment;
      this.image = instancePrototypeInstanceBySourceTemplate.image;
      this.primaryNetworkInterface = instancePrototypeInstanceBySourceTemplate.primaryNetworkInterface;
      this.sourceTemplate = instancePrototypeInstanceBySourceTemplate.sourceTemplate;
      this.zone = instancePrototypeInstanceBySourceTemplate.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceTemplate the sourceTemplate
     */
    public Builder(InstanceTemplateIdentity sourceTemplate) {
      this.sourceTemplate = sourceTemplate;
    }

    /**
     * Builds a InstancePrototypeInstanceBySourceTemplate.
     *
     * @return the new InstancePrototypeInstanceBySourceTemplate instance
     */
    public InstancePrototypeInstanceBySourceTemplate build() {
      return new InstancePrototypeInstanceBySourceTemplate(this);
    }

    /**
     * Adds an keys to keys.
     *
     * @param keys the new keys
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder addKeys(KeyIdentity keys) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keys,
        "keys cannot be null");
      if (this.keys == null) {
        this.keys = new ArrayList<KeyIdentity>();
      }
      this.keys.add(keys);
      return this;
    }

    /**
     * Adds an networkInterfaces to networkInterfaces.
     *
     * @param networkInterfaces the new networkInterfaces
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder addNetworkInterfaces(NetworkInterfacePrototype networkInterfaces) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(networkInterfaces,
        "networkInterfaces cannot be null");
      if (this.networkInterfaces == null) {
        this.networkInterfaces = new ArrayList<NetworkInterfacePrototype>();
      }
      this.networkInterfaces.add(networkInterfaces);
      return this;
    }

    /**
     * Adds an volumeAttachments to volumeAttachments.
     *
     * @param volumeAttachments the new volumeAttachments
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder addVolumeAttachments(VolumeAttachmentPrototypeInstanceContext volumeAttachments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(volumeAttachments,
        "volumeAttachments cannot be null");
      if (this.volumeAttachments == null) {
        this.volumeAttachments = new ArrayList<VolumeAttachmentPrototypeInstanceContext>();
      }
      this.volumeAttachments.add(volumeAttachments);
      return this;
    }

    /**
     * Set the keys.
     * Existing keys will be replaced.
     *
     * @param keys the keys
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkInterfaces.
     * Existing networkInterfaces will be replaced.
     *
     * @param networkInterfaces the networkInterfaces
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder networkInterfaces(List<NetworkInterfacePrototype> networkInterfaces) {
      this.networkInterfaces = networkInterfaces;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder userData(String userData) {
      this.userData = userData;
      return this;
    }

    /**
     * Set the volumeAttachments.
     * Existing volumeAttachments will be replaced.
     *
     * @param volumeAttachments the volumeAttachments
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototypeInstanceContext> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByImageContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the image.
     *
     * @param image the image
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder image(ImageIdentity image) {
      this.image = image;
      return this;
    }

    /**
     * Set the primaryNetworkInterface.
     *
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder primaryNetworkInterface(NetworkInterfacePrototype primaryNetworkInterface) {
      this.primaryNetworkInterface = primaryNetworkInterface;
      return this;
    }

    /**
     * Set the sourceTemplate.
     *
     * @param sourceTemplate the sourceTemplate
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder sourceTemplate(InstanceTemplateIdentity sourceTemplate) {
      this.sourceTemplate = sourceTemplate;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstancePrototypeInstanceBySourceTemplate builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected InstancePrototypeInstanceBySourceTemplate(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceTemplate,
      "sourceTemplate cannot be null");
    keys = builder.keys;
    name = builder.name;
    networkInterfaces = builder.networkInterfaces;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    userData = builder.userData;
    volumeAttachments = builder.volumeAttachments;
    vpc = builder.vpc;
    bootVolumeAttachment = builder.bootVolumeAttachment;
    image = builder.image;
    primaryNetworkInterface = builder.primaryNetworkInterface;
    sourceTemplate = builder.sourceTemplate;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a InstancePrototypeInstanceBySourceTemplate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

