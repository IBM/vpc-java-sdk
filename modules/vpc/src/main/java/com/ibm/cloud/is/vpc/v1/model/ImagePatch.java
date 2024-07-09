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

import java.util.Date;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * ImagePatch.
 */
public class ImagePatch extends GenericModel {

  @SerializedName("deprecation_at")
  protected Date deprecationAt;
  protected String name;
  @SerializedName("obsolescence_at")
  protected Date obsolescenceAt;

  /**
   * Builder.
   */
  public static class Builder {
    private Date deprecationAt;
    private String name;
    private Date obsolescenceAt;

    /**
     * Instantiates a new Builder from an existing ImagePatch instance.
     *
     * @param imagePatch the instance to initialize the Builder with
     */
    private Builder(ImagePatch imagePatch) {
      this.deprecationAt = imagePatch.deprecationAt;
      this.name = imagePatch.name;
      this.obsolescenceAt = imagePatch.obsolescenceAt;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ImagePatch.
     *
     * @return the new ImagePatch instance
     */
    public ImagePatch build() {
      return new ImagePatch(this);
    }

    /**
     * Set the deprecationAt.
     *
     * @param deprecationAt the deprecationAt
     * @return the ImagePatch builder
     */
    public Builder deprecationAt(Date deprecationAt) {
      this.deprecationAt = deprecationAt;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ImagePatch builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the obsolescenceAt.
     *
     * @param obsolescenceAt the obsolescenceAt
     * @return the ImagePatch builder
     */
    public Builder obsolescenceAt(Date obsolescenceAt) {
      this.obsolescenceAt = obsolescenceAt;
      return this;
    }
  }

  protected ImagePatch() { }

  protected ImagePatch(Builder builder) {
    deprecationAt = builder.deprecationAt;
    name = builder.name;
    obsolescenceAt = builder.obsolescenceAt;
  }

  /**
   * New builder.
   *
   * @return a ImagePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deprecationAt.
   *
   * The deprecation date and time to set for this image.
   *
   * This cannot be set if the image has a `status` of `failed` or `deleting`, or if
   * `catalog_offering.managed` is `true`.
   *
   * The date and time must not be in the past, and must be earlier than `obsolescence_at`
   * (if `obsolescence_at` is set). Additionally, if the image status is currently
   * `deprecated`, the value cannot be changed (but may be removed).
   *
   * Specify `null` to remove an existing deprecation date and time. If the image status is currently `deprecated`, it
   * will become `available`.
   *
   * If the deprecation date and time is reached while the image has a status of `pending`, the image's status will
   * transition to `deprecated` upon its successful creation (or
   * `obsolete` if the obsolescence date and time was also reached).
   *
   * @return the deprecationAt
   */
  public Date deprecationAt() {
    return deprecationAt;
  }

  /**
   * Gets the name.
   *
   * The name for this image. The name must not be used by another image in the region. Names starting with `ibm-` are
   * reserved for system-provided images, and are not allowed.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the obsolescenceAt.
   *
   * The obsolescence date and time to set for this image.
   *
   * This cannot be set if the image has a `status` of `failed` or `deleting`, or if
   * `catalog_offering.managed` is `true`.
   *
   * The date and time must not be in the past, and must be later than `deprecation_at` (if
   * `deprecation_at` is set). Additionally, if the image status is currently `obsolete`, the value cannot be changed
   * (but may be removed).
   *
   * Specify `null` to remove an existing obsolescence date and time. If the image status is currently `obsolete`, it
   * will become `deprecated` if `deprecation_at` is in the past. Otherwise, it will become `available`.
   *
   * If the obsolescence date and time is reached while the image has a status of `pending`, the image's status will
   * transition to `obsolete` upon its successful creation.
   *
   * @return the obsolescenceAt
   */
  public Date obsolescenceAt() {
    return obsolescenceAt;
  }

  /**
   * Construct a JSON merge-patch from the ImagePatch.
   *
   * Note that properties of the ImagePatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ImagePatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

