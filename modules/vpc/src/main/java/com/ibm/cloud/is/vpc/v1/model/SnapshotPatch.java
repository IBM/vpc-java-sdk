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
 * SnapshotPatch.
 */
public class SnapshotPatch extends GenericModel {

  protected String name;
  @SerializedName("user_tags")
  protected List<String> userTags;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<String> userTags;

    private Builder(SnapshotPatch snapshotPatch) {
      this.name = snapshotPatch.name;
      this.userTags = snapshotPatch.userTags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SnapshotPatch.
     *
     * @return the new SnapshotPatch instance
     */
    public SnapshotPatch build() {
      return new SnapshotPatch(this);
    }

    /**
     * Adds an userTags to userTags.
     *
     * @param userTags the new userTags
     * @return the SnapshotPatch builder
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
     * Set the name.
     *
     * @param name the name
     * @return the SnapshotPatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the userTags.
     * Existing userTags will be replaced.
     *
     * @param userTags the userTags
     * @return the SnapshotPatch builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }
  }

  protected SnapshotPatch(Builder builder) {
    name = builder.name;
    userTags = builder.userTags;
  }

  /**
   * New builder.
   *
   * @return a SnapshotPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this snapshot.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the userTags.
   *
   * The user tags associated with this snapshot.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Construct a JSON merge-patch from the SnapshotPatch.
   *
   * Note that properties of the SnapshotPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SnapshotPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }

}

