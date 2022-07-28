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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * VolumePatch.
 */
public class VolumePatch extends GenericModel {

  protected Long capacity;
  protected Long iops;
  protected String name;
  protected VolumeProfileIdentity profile;
  @SerializedName("user_tags")
  protected List<String> userTags;

  /**
   * Builder.
   */
  public static class Builder {
    private Long capacity;
    private Long iops;
    private String name;
    private VolumeProfileIdentity profile;
    private List<String> userTags;

    private Builder(VolumePatch volumePatch) {
      this.capacity = volumePatch.capacity;
      this.iops = volumePatch.iops;
      this.name = volumePatch.name;
      this.profile = volumePatch.profile;
      this.userTags = volumePatch.userTags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a VolumePatch.
     *
     * @return the new VolumePatch instance
     */
    public VolumePatch build() {
      return new VolumePatch(this);
    }

    /**
     * Adds an userTags to userTags.
     *
     * @param userTags the new userTags
     * @return the VolumePatch builder
     */
    public Builder addUserTags(String userTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(userTags,
        "userTags cannot be null");
      if (this.userTags == null) {
        this.userTags = new ArrayList<String>();
      }
      this.userTags.add(userTags);
      return this;
    }

    /**
     * Set the capacity.
     *
     * @param capacity the capacity
     * @return the VolumePatch builder
     */
    public Builder capacity(long capacity) {
      this.capacity = capacity;
      return this;
    }

    /**
     * Set the iops.
     *
     * @param iops the iops
     * @return the VolumePatch builder
     */
    public Builder iops(long iops) {
      this.iops = iops;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the VolumePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the VolumePatch builder
     */
    public Builder profile(VolumeProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the VolumePatch builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }
  }

  protected VolumePatch(Builder builder) {
    capacity = builder.capacity;
    iops = builder.iops;
    name = builder.name;
    profile = builder.profile;
    userTags = builder.userTags;
  }

  /**
   * New builder.
   *
   * @return a VolumePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the capacity.
   *
   * The capacity to use for the volume (in gigabytes). The volume must be attached to a running virtual server
   * instance, and the specified value must not be less than the current capacity. Additionally, if the volume is
   * attached as a boot volume, the maximum value is 250 gigabytes.
   *
   * The minimum and maximum capacity limits for creating or updating volumes may expand in the future.
   *
   * @return the capacity
   */
  public Long capacity() {
    return capacity;
  }

  /**
   * Gets the iops.
   *
   * The maximum I/O operations per second (IOPS) to use for the volume. Applicable only to volumes using a profile
   * `family` of `custom`. The volume must be attached as a data volume to a running virtual server instance.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this volume.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this volume. The requested profile must be in the same
   * `family` as the current profile. The volume must be attached as a data volume to a
   * running virtual server instance, and must have a `capacity` within the range
   * supported by the specified profile.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this volume.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Construct a JSON merge-patch from the VolumePatch.
   *
   * Note that properties of the VolumePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the VolumePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

