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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateShare options.
 */
public class UpdateShareOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> sharePatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> sharePatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateShareOptions instance.
     *
     * @param updateShareOptions the instance to initialize the Builder with
     */
    private Builder(UpdateShareOptions updateShareOptions) {
      this.id = updateShareOptions.id;
      this.sharePatch = updateShareOptions.sharePatch;
      this.ifMatch = updateShareOptions.ifMatch;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param sharePatch the sharePatch
     */
    public Builder(String id, Map<String, Object> sharePatch) {
      this.id = id;
      this.sharePatch = sharePatch;
    }

    /**
     * Builds a UpdateShareOptions.
     *
     * @return the new UpdateShareOptions instance
     */
    public UpdateShareOptions build() {
      return new UpdateShareOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateShareOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the sharePatch.
     *
     * @param sharePatch the sharePatch
     * @return the UpdateShareOptions builder
     */
    public Builder sharePatch(Map<String, Object> sharePatch) {
      this.sharePatch = sharePatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateShareOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateShareOptions() { }

  protected UpdateShareOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sharePatch,
      "sharePatch cannot be null");
    id = builder.id;
    sharePatch = builder.sharePatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateShareOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The file share identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the sharePatch.
   *
   * The file share patch.
   *
   * @return the sharePatch
   */
  public Map<String, Object> sharePatch() {
    return sharePatch;
  }

  /**
   * Gets the ifMatch.
   *
   * If present, the request will fail if the specified ETag value does not match the resource's current ETag value.
   * Required if the request body includes an array.
   *
   * @return the ifMatch
   */
  public String ifMatch() {
    return ifMatch;
  }
}

