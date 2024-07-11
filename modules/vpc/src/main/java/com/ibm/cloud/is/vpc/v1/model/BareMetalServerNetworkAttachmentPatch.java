/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * BareMetalServerNetworkAttachmentPatch.
 */
public class BareMetalServerNetworkAttachmentPatch extends GenericModel {

  @SerializedName("allowed_vlans")
  protected List<Long> allowedVlans;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private List<Long> allowedVlans;
    private String name;

    /**
     * Instantiates a new Builder from an existing BareMetalServerNetworkAttachmentPatch instance.
     *
     * @param bareMetalServerNetworkAttachmentPatch the instance to initialize the Builder with
     */
    private Builder(BareMetalServerNetworkAttachmentPatch bareMetalServerNetworkAttachmentPatch) {
      this.allowedVlans = bareMetalServerNetworkAttachmentPatch.allowedVlans;
      this.name = bareMetalServerNetworkAttachmentPatch.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a BareMetalServerNetworkAttachmentPatch.
     *
     * @return the new BareMetalServerNetworkAttachmentPatch instance
     */
    public BareMetalServerNetworkAttachmentPatch build() {
      return new BareMetalServerNetworkAttachmentPatch(this);
    }

    /**
     * Adds a new element to allowedVlans.
     *
     * @param allowedVlans the new element to be added
     * @return the BareMetalServerNetworkAttachmentPatch builder
     */
    public Builder addAllowedVlans(Long allowedVlans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowedVlans,
        "allowedVlans cannot be null");
      if (this.allowedVlans == null) {
        this.allowedVlans = new ArrayList<Long>();
      }
      this.allowedVlans.add(allowedVlans);
      return this;
    }

    /**
     * Set the allowedVlans.
     * Existing allowedVlans will be replaced.
     *
     * @param allowedVlans the allowedVlans
     * @return the BareMetalServerNetworkAttachmentPatch builder
     */
    public Builder allowedVlans(List<Long> allowedVlans) {
      this.allowedVlans = allowedVlans;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BareMetalServerNetworkAttachmentPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected BareMetalServerNetworkAttachmentPatch() { }

  protected BareMetalServerNetworkAttachmentPatch(Builder builder) {
    allowedVlans = builder.allowedVlans;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a BareMetalServerNetworkAttachmentPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowedVlans.
   *
   * The VLAN IDs to allow for `vlan` attachments using this PCI attachment, replacing any existing VLAN IDs. The
   * specified values must include IDs for all `vlan` attachments currently using this PCI attachment.
   *
   * @return the allowedVlans
   */
  public List<Long> allowedVlans() {
    return allowedVlans;
  }

  /**
   * Gets the name.
   *
   * The name for this network attachment. The name must not be used by another network attachment for the bare metal
   * server.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Construct a JSON merge-patch from the BareMetalServerNetworkAttachmentPatch.
   *
   * Note that properties of the BareMetalServerNetworkAttachmentPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the BareMetalServerNetworkAttachmentPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

