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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * InstancePatch.
 */
public class InstancePatch extends GenericModel {

  protected String name;
  protected InstancePatchProfile profile;
  @SerializedName("total_volume_bandwidth")
  protected Long totalVolumeBandwidth;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private InstancePatchProfile profile;
    private Long totalVolumeBandwidth;

    private Builder(InstancePatch instancePatch) {
      this.name = instancePatch.name;
      this.profile = instancePatch.profile;
      this.totalVolumeBandwidth = instancePatch.totalVolumeBandwidth;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstancePatch.
     *
     * @return the new InstancePatch instance
     */
    public InstancePatch build() {
      return new InstancePatch(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePatch builder
     */
    public Builder profile(InstancePatchProfile profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstancePatch builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }
  }

  protected InstancePatch(Builder builder) {
    name = builder.name;
    profile = builder.profile;
    totalVolumeBandwidth = builder.totalVolumeBandwidth;
  }

  /**
   * New builder.
   *
   * @return a InstancePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this virtual server instance (and default system hostname).
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this virtual server instance. For the profile to be changed,
   * the instance `status` must be `stopping` or `stopped`. In addition, the requested
   * profile must:
   * - Have matching instance disk support. Any disks associated with the current profile
   *   will be deleted, and any disks associated with the requested profile will be
   *   created.
   * - Be compatible with any `placement_target` constraints. For example, if the
   *   instance is placed on a dedicated host, the requested profile `family` must be
   *   the same as the dedicated host `family`.
   *
   * @return the profile
   */
  public InstancePatchProfile profile() {
    return profile;
  }

  /**
   * Gets the totalVolumeBandwidth.
   *
   * The amount of bandwidth (in megabits per second) allocated exclusively to instance storage volumes. An increase in
   * this value will result in a corresponding decrease to
   * `total_network_bandwidth`.
   *
   * @return the totalVolumeBandwidth
   */
  public Long totalVolumeBandwidth() {
    return totalVolumeBandwidth;
  }

  /**
   * Construct a JSON merge-patch from the InstancePatch.
   *
   * Note that properties of the InstancePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the InstancePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

