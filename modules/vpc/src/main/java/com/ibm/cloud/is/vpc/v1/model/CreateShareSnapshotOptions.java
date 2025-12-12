/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createShareSnapshot options.
 */
public class CreateShareSnapshotOptions extends GenericModel {

  protected String shareId;
  protected String name;
  protected List<String> userTags;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String name;
    private List<String> userTags;

    /**
     * Instantiates a new Builder from an existing CreateShareSnapshotOptions instance.
     *
     * @param createShareSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(CreateShareSnapshotOptions createShareSnapshotOptions) {
      this.shareId = createShareSnapshotOptions.shareId;
      this.name = createShareSnapshotOptions.name;
      this.userTags = createShareSnapshotOptions.userTags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param shareId the shareId
     */
    public Builder(String shareId) {
      this.shareId = shareId;
    }

    /**
     * Builds a CreateShareSnapshotOptions.
     *
     * @return the new CreateShareSnapshotOptions instance
     */
    public CreateShareSnapshotOptions build() {
      return new CreateShareSnapshotOptions(this);
    }

    /**
     * Adds a new element to userTags.
     *
     * @param userTags the new element to be added
     * @return the CreateShareSnapshotOptions builder
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
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the CreateShareSnapshotOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateShareSnapshotOptions builder
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
     * @return the CreateShareSnapshotOptions builder
     */
    public Builder userTags(List<String> userTags) {
      this.userTags = userTags;
      return this;
    }
  }

  protected CreateShareSnapshotOptions() { }

  protected CreateShareSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    shareId = builder.shareId;
    name = builder.name;
    userTags = builder.userTags;
  }

  /**
   * New builder.
   *
   * @return a CreateShareSnapshotOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the shareId.
   *
   * The file share identifier.
   *
   * @return the shareId
   */
  public String shareId() {
    return shareId;
  }

  /**
   * Gets the name.
   *
   * The name for this share snapshot. The name must not be used by another snapshot for the file share. If unspecified,
   * the name will be a hyphenated list of randomly-selected words.
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
}

