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
 * The updateShareSnapshot options.
 */
public class UpdateShareSnapshotOptions extends GenericModel {

  protected String shareId;
  protected String id;
  protected Map<String, Object> shareSnapshotPatch;
  protected String ifMatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String shareId;
    private String id;
    private Map<String, Object> shareSnapshotPatch;
    private String ifMatch;

    /**
     * Instantiates a new Builder from an existing UpdateShareSnapshotOptions instance.
     *
     * @param updateShareSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(UpdateShareSnapshotOptions updateShareSnapshotOptions) {
      this.shareId = updateShareSnapshotOptions.shareId;
      this.id = updateShareSnapshotOptions.id;
      this.shareSnapshotPatch = updateShareSnapshotOptions.shareSnapshotPatch;
      this.ifMatch = updateShareSnapshotOptions.ifMatch;
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
     * @param id the id
     * @param shareSnapshotPatch the shareSnapshotPatch
     */
    public Builder(String shareId, String id, Map<String, Object> shareSnapshotPatch) {
      this.shareId = shareId;
      this.id = id;
      this.shareSnapshotPatch = shareSnapshotPatch;
    }

    /**
     * Builds a UpdateShareSnapshotOptions.
     *
     * @return the new UpdateShareSnapshotOptions instance
     */
    public UpdateShareSnapshotOptions build() {
      return new UpdateShareSnapshotOptions(this);
    }

    /**
     * Set the shareId.
     *
     * @param shareId the shareId
     * @return the UpdateShareSnapshotOptions builder
     */
    public Builder shareId(String shareId) {
      this.shareId = shareId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateShareSnapshotOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the shareSnapshotPatch.
     *
     * @param shareSnapshotPatch the shareSnapshotPatch
     * @return the UpdateShareSnapshotOptions builder
     */
    public Builder shareSnapshotPatch(Map<String, Object> shareSnapshotPatch) {
      this.shareSnapshotPatch = shareSnapshotPatch;
      return this;
    }

    /**
     * Set the ifMatch.
     *
     * @param ifMatch the ifMatch
     * @return the UpdateShareSnapshotOptions builder
     */
    public Builder ifMatch(String ifMatch) {
      this.ifMatch = ifMatch;
      return this;
    }
  }

  protected UpdateShareSnapshotOptions() { }

  protected UpdateShareSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.shareId,
      "shareId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.shareSnapshotPatch,
      "shareSnapshotPatch cannot be null");
    shareId = builder.shareId;
    id = builder.id;
    shareSnapshotPatch = builder.shareSnapshotPatch;
    ifMatch = builder.ifMatch;
  }

  /**
   * New builder.
   *
   * @return a UpdateShareSnapshotOptions builder
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
   * Gets the id.
   *
   * The share snapshot identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the shareSnapshotPatch.
   *
   * The share snapshot patch.
   *
   * @return the shareSnapshotPatch
   */
  public Map<String, Object> shareSnapshotPatch() {
    return shareSnapshotPatch;
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

