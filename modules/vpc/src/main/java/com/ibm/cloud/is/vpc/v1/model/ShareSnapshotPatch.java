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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * ShareSnapshotPatch.
 */
public class ShareSnapshotPatch extends GenericModel {

  protected String name;
  @SerializedName("user_tags")
  protected List<String> userTags;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private List<String> userTags;

    /**
     * Instantiates a new Builder from an existing ShareSnapshotPatch instance.
     *
     * @param shareSnapshotPatch the instance to initialize the Builder with
     */
    private Builder(ShareSnapshotPatch shareSnapshotPatch) {
      this.name = shareSnapshotPatch.name;
      this.userTags = shareSnapshotPatch.userTags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ShareSnapshotPatch.
     *
     * @return the new ShareSnapshotPatch instance
     */
    public ShareSnapshotPatch build() {
      return new ShareSnapshotPatch(this);
    }

    /**
     * Adds a new element to userTags.
     *
     * @param userTags the new element to be added
     * @return the ShareSnapshotPatch builder
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
     * @return the ShareSnapshotPatch builder
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
     * @return the ShareSnapshotPatch builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }
  }

  protected ShareSnapshotPatch() { }

  protected ShareSnapshotPatch(Builder builder) {
    name = builder.name;
    userTags = builder.userTags;
  }

  /**
   * New builder.
   *
   * @return a ShareSnapshotPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * The name for this share snapshot. The name must be unique among all snapshots for the file share. For this property
   * to be changed, the share's `replication_role` must not be
   * `replica`.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the userTags.
   *
   * The [user tags](https://cloud.ibm.com/apidocs/tagging#types-of-tags) associated with this share snapshot.
   *
   * @return the userTags
   */
  public List<String> userTags() {
    return userTags;
  }

  /**
   * Construct a JSON merge-patch from the ShareSnapshotPatch.
   *
   * Note that properties of the ShareSnapshotPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ShareSnapshotPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

